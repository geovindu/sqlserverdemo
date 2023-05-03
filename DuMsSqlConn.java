/**
 * 版权所有 2021 涂聚文有限公司
 * 许可信息查看：
 * 描述：
 * IDE:IntelliJ IDEA 2021.2.3
 * 历史版本： JDK 14.02
 * 2021-12-12 创建者 geovindu
 * 2021-12-15 添加 Lambda
 * 2021-12-15 修改：date
 * 接口类 mssql-jdbc-9.4.1.jre8.jar.
 * 数据库：MSSQL Server 2019
 * 2021-12-15 修改者：Geovin Du
 * 生成API帮助文档的指令：
 *javadoc - -encoding Utf-8 -d apidoc DuMsSQLConn.java
 *https://www.microsoft.com/en-us/software-download/windows10
 *https://github.com/PaddlePaddle/PaddleOCR
 *https://docs.microsoft.com/es-es/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15
 *https://github.com/microsoft/mssql-jdbc/blob/main/README.md

 * */


import Geovin.Model.*;
import Geovin.Model.RoleTypeList;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
//import com.microsoft.*;

/**
 * @author geovindu
 * @version 1.0
 *
 * */
public class DuMsSqlConn {




    //数据库地址
    //1 可以用
    //String url = "jdbc:sqlserver://127.0.0.1:1433;DataBaseName=geovindu";  //GEOVINDU  //localhost  127.0.0.1:1433
    //2
    String url = "jdbc:sqlserver://DESKTOP-NQK85G5;DataBaseName=geovindu";

    //1
    String connectionUrl = "jdbc:sqlserver://DESKTOP-NQK85G5;databaseName=geovindu;user=sa;password=770214";
    //
    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  //com.mysql.cj.jdbc.Driver  //com.mysql.jdbc.Driver "com.microsoft.sqlserver.jdbc.SQLServerDriver
    //
    String userName = "sa";
    //
    String password = "770214";
    Connection con;
    Statement stmt = null; //proc
    PreparedStatement pstmt=null; //SQl
    CallableStatement cstmt=null; //PRoc

    /**
     * 连接
     *
     * */
    public Connection getConnection()
    {

        try {
            Class.forName(driverName);
            //System.out.println("Ms SQL 数据库驱动加载成功");
        } catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {

            con = DriverManager.getConnection(connectionUrl);
            //2 第二种方法
            //con = DriverManager.getConnection(url,userName,password);
           // System.out.println("Ms SQL数据库连接成功");
            //2
            //stmt = con.createStatement();

           // con.getMetaData()
            /*
            String sql;
            sql = "SELECT RoleType,RoleTypeName,RoleTypeDescribe  FROM RoleTypeList";
            pstmt=con.prepareStatement(sql);
            //2
           // ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs =pstmt.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int typid  = rs.getInt("RoleType");
                String rolename = rs.getString("RoleTypeName");
                String roledec = rs.getString("RoleTypeDescribe");

                // 输出数据
                System.out.print("角色ID: " + typid);
                System.out.print("  ,  角色名字: " + rolename);
                System.out.print("  , 角色描述: " + roledec);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            con.close();
             */
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return con;

    }
    /**
     *SQL 语句查询所有
     * @param
     * @return  返回集合
     * */
    public ArrayList<RoleTypeList> selectSqlAll()
    {
        ArrayList<RoleTypeList> alist=new ArrayList<RoleTypeList>();
        RoleTypeList roleTypeList=null;
        ResultSet resultSet=null;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "SELECT RoleType,RoleTypeName,RoleTypeDescribe  FROM RoleTypeList";
            pstmt = con.prepareStatement(sql);
            //2
            // rs = stmt.executeQuery(sql);
            resultSet = pstmt.executeQuery();
            // 展开结果集数据库
            while (resultSet.next()) {
                // 通过字段检索
                roleTypeList=new RoleTypeList();
                roleTypeList.setRoleType(resultSet.getInt("RoleType"));
                roleTypeList.setRoleTypeName(resultSet.getString("RoleTypeName"));
                roleTypeList.setRoleTypeDescribe(resultSet.getString("RoleTypeDescribe"));
                alist.add(roleTypeList);
            }
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }
        return  alist;
    }

    /**
     *存储过程  查询所有
     * @param
     * @return  返回集合
     * */
    public  ArrayList<RoleTypeList> selectProclAll()
    {
        ArrayList<RoleTypeList> alist=new ArrayList<RoleTypeList>();
        RoleTypeList roleTypeList=null;
        ResultSet resultSet=null;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{ call proc_Select_RoleTypeListAll}";
            //pstmt = con.prepareStatement(sql);
              cstmt=con.prepareCall(sql);
            //2
            //  resultSet = stmt.executeQuery(sql);
            // resultSet = pstmt.executeQuery();
             resultSet = cstmt.executeQuery();
            // 展开结果集数据库
            while (resultSet.next()) {
                // 通过字段检索a
                roleTypeList=new RoleTypeList();
                roleTypeList.setRoleType(resultSet.getInt("RoleType"));
                roleTypeList.setRoleTypeName(resultSet.getString("RoleTypeName"));
                roleTypeList.setRoleTypeDescribe(resultSet.getString("RoleTypeDescribe"));
                alist.add(roleTypeList);
            }
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }
        return alist;
    }
    /**
     *添加
     * @param roleTypeList
     * @return
     * */
    public int AddSQL(RoleTypeList roleTypeList)
    {
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "INSERT INTO dbo.RoleTypeList(RoleTypeName ,RoleTypeDescribe) VALUES(? ,?)";
            pstmt = con.prepareStatement(sql);
           // pstmt.setInt(1,roleTypeList.getRoleType());
            pstmt.setString(1,roleTypeList.getRoleTypeName());
            pstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            //2
            // rs = stmt.executeQuery(sql);
            isok = pstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }

    /**
     *添加  存储过程
     * @param roleTypeList
     * @return
     * */
    public int AddProc(RoleTypeList roleTypeList)
    {

        //SQLServerCallableStatement
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{call proc_Insert_Operation(? ,?)}";
            //pstmt = con.prepareStatement(sql);
             cstmt=con.prepareCall(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            cstmt.setString(1,roleTypeList.getRoleTypeName());
            cstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            //2
            // rs = stmt.executeQuery(sql);
            isok = cstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }
    /**
     *添加 返回
     * @param roleTypeList
     * @param outValue  返回值 不成功
     * */
    public int AddSQLOut(RoleTypeList roleTypeList, OutValue outValue)
    {
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "INSERT INTO dbo.RoleTypeList(RoleTypeName ,RoleTypeDescribe) VALUES(? ,?)";
            pstmt = con.prepareStatement(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            pstmt.setString(1,roleTypeList.getRoleTypeName());
            pstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            //2
            // rs = stmt.executeQuery(sql);
            isok = pstmt.executeUpdate();
            String sql2="select @@IDENTITY";
            PreparedStatement preparedStatement=null;
            preparedStatement=con.prepareStatement(sql2);
             //cstmt= connection.prepareCall(sql2);
             ResultSet resultSet=preparedStatement.executeQuery();    //cstmt.executeQuery();
             outValue.setIntValue(resultSet.getInt(1));

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }
    /**
     *添加反回值
     * @param roleTypeList
     * @param outValue
     * @return
     * */
    public int AddProcOut(RoleTypeList roleTypeList, OutValue outValue)
    {

        //SQLServerCallableStatement
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{call proc_Insert_RoleTypeListOutput(? ,?,?)}";
            //pstmt = con.prepareStatement(sql);
            cstmt=con.prepareCall(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            cstmt.setString(1,roleTypeList.getRoleTypeName());
            cstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            cstmt.registerOutParameter(3,Types.INTEGER);
            //2
            //
            //cstmt.execute();//
            isok=cstmt.executeUpdate();
           // System.out.println(cstmt.getInt(3));
            outValue.setIntValue(cstmt.getInt(3));
           // isok =1;
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }

    /**
     *更新
     * @param roleTypeList
     * @return
     * */
    public int  UpdateSQL(RoleTypeList roleTypeList)
    {
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "UPDATE dbo.RoleTypeList set RoleTypeName=? ,RoleTypeDescribe=? where RoleType=?";
            pstmt = con.prepareStatement(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            pstmt.setString(1,roleTypeList.getRoleTypeName());
            pstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            pstmt.setInt(3,roleTypeList.getRoleType());
            //2
            // rs = stmt.executeQuery(sql);
            isok = pstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }

    /**
     *更新  存储过程
     * @param roleTypeList
     * @return
     * */
    public int UpdateProc(RoleTypeList roleTypeList)
    {

        //SQLServerCallableStatement
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{call proc_Update_RoleTypeList(? ,?,?)}";
            //pstmt = con.prepareStatement(sql);
            cstmt=con.prepareCall(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            cstmt.setString(1,roleTypeList.getRoleTypeName());
            cstmt.setString(2, roleTypeList.getRoleTypeDescribe());
            cstmt.setInt(3,roleTypeList.getRoleType());
            //2
            // rs = stmt.executeQuery(sql);
            isok = cstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }


    /**
     *删除
     * @param id
     * @return
     * */
    public int  DeleteSQL(int id)
    {
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "DELETE dbo.RoleTypeList WHERE RoleType =?";
            pstmt = con.prepareStatement(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());
            pstmt.setInt(1,id);
            //2
            // rs = stmt.executeQuery(sql);
            isok = pstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }

    /**
     *删除 存储过程
     * @param id
     * @return
     * */
    public int  DeleteProc(int id)
    {

        //SQLServerCallableStatement
        int isok=0;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{call proc_Delete_RoleTypeList(?)}";
            //pstmt = con.prepareStatement(sql);
            cstmt=con.prepareCall(sql);
            // pstmt.setInt(1,roleTypeList.getRoleType());

            cstmt.setInt(1,id);
            //2
            // rs = stmt.executeQuery(sql);
            isok = cstmt.executeUpdate();

        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }

        return  isok;

    }
    /**
     *查询
     * @param id
     * @return
     * **/
    public RoleTypeList selectIdSql(int id)
    {

        RoleTypeList roleTypeList=null;
        ResultSet resultSet=null;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "SELECT RoleType,RoleTypeName,RoleTypeDescribe  FROM RoleTypeList where RoleType=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,id);
            //2
            // rs = stmt.executeQuery(sql);
            resultSet = pstmt.executeQuery();
            // 展开结果集数据库
            while (resultSet.next()) {
                // 通过字段检索
                roleTypeList=new RoleTypeList();
                roleTypeList.setRoleType(resultSet.getInt("RoleType"));
                roleTypeList.setRoleTypeName(resultSet.getString("RoleTypeName"));
                roleTypeList.setRoleTypeDescribe(resultSet.getString("RoleTypeDescribe"));

            }
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }
        return  roleTypeList;
    }

    /**
     *存储过程  查询
     * @param id
     * @return
     * */
    public  RoleTypeList selectIdProcl(int id)
    {

        RoleTypeList roleTypeList=null;
        ResultSet resultSet=null;
        try {
            Connection connection = getConnection();
            String sql;
            sql = "{call proc_Select_RoleTypeList(?)}";
            //pstmt = con.prepareStatement(sql);
            cstmt=con.prepareCall(sql);
            cstmt.setInt(1,id);
            //2
            //  resultSet = stmt.executeQuery(sql);
            // resultSet = pstmt.executeQuery();
            resultSet = cstmt.executeQuery();
            // 展开结果集数据库
            while (resultSet.next()) {
                // 通过字段检索a
                roleTypeList=new RoleTypeList();
                roleTypeList.setRoleType(resultSet.getInt("RoleType"));
                roleTypeList.setRoleTypeName(resultSet.getString("RoleTypeName"));
                roleTypeList.setRoleTypeDescribe(resultSet.getString("RoleTypeDescribe"));

            }
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }
        return roleTypeList;
    }




}
