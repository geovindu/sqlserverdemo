/**
 * 版权所有 2021 涂聚文有限公司
 * 许可信息查看：
 * 描述：
 * https://javaee.github.io/javamail/#Download_JavaMail_Release
 * https://github.com/javaee/javamail
 * 历史版本： JDK 14.02
 * 2021-12-12 创建者 geovindu
 * 2021-12-15 添加 Lambda
 * 2021-12-15 修改：date
 * 接口类
 * 2021-12-15 修改者：Geovin Du
 * 生成API帮助文档的指令：
 *javadoc - -encoding Utf-8 -d apidoc DuMain.java
 *
 * */



import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.awt.*;

import Geovin.Common.ItextHelper;
import Geovin.Model.*;
import Geovin.BLL.*;
import com.javapatterns.abstractfactory.NorthernFruit;
import com.javapatterns.abstractfactory.NorthernGardener;
import com.javapatterns.builder.Builder;
import com.javapatterns.flyweight.Order;
import org.com.json.*;
import redis.clients.jedis.*;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.io.*;

import java.lang.Thread;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.javapatterns.simplefactory.*;
import com.javapatterns.factorymethod.*;
import com.javapatterns.singleton.*;
import com.javapatterns.multilingual.*;
import com.javapatterns.builder.*;
import com.javapatterns.prototype.*;
import com.javapatterns.adapter.*;
import com.javapatterns.composite.*;
import com.javapatterns.decorator.*;
import com.javapatterns.proxy.*;
import com.javapatterns.flyweight.*;
import com.javapatterns.facade.*;
import com.javapatterns.bridge.*;
import com.javapatterns.immutable.*;
import com.javapatterns.strategy.*;
import com.javapatterns.templatemethod.*;
import com.javapatterns.observer.*;
import com.javapatterns.iterator.*;
import com.javapatterns.chainofresponsibility.*;
import com.javapatterns.command.*;
import com.javapatterns.memento.*;
import com.javapatterns.state.states.*;
import com.javapatterns.state.UI.*;
import com.javapatterns.visitor.*;
import com.javapatterns.interpreter.*;

import com.javapatterns.mediator.editor.*;
import com.javapatterns.mediator.shapes.*;
import com.javapatterns.mediator.commands.*;
import com.javapatterns.mediator.history.*;
import com.javapatterns.nullobject.*;


import CoreJava.twelfth.*;
import java.lang.reflect.*;

import java.lang.reflect.Field;
import java.util.Date;

import javafx.application.Application;   //https://gluonhq.com/products/javafx/  https://github.com/openjdk/jfx
import javafx.fxml.FXMLLoader;  //https://gluonhq.com/products/javafx/
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Files.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public class DuSqlMnage
{



    //多例模式
     private LingualResource lnkLingualResource;
     private  static Builder builder;
     //原始模型
    private static PandaToClone thisPanda , thatPanda;

    private static com.javapatterns.decorator.Order order;
    //
    private static Searcher searcher;
    //
    private static SecurityFacade security;

   //
    /**
     *
     *
     * */
    private static com.javapatterns.chainofresponsibility.Player firstPlayer;

    /**
     *
     *
     * */
    public static boolean stopped = false;

    Timer timer;




    public static void main(String[] args) throws ReflectiveOperationException {
        try
        {

            /*
            try {
                DrawStars.launch(args);
            }
            catch (RuntimeException exception)
            {
                exception.printStackTrace();
            }
            */

            //读文件夹
            Scanner input=new Scanner(System.in);
            System.out.printf("Enter file or directory name:");
            Path path=Paths.get("D:\\书籍资料\\java\\JavaHowToProgram11e_EarlyObjects-master\\examples");
            if(Files.exists(path))
            {
                System.out.println("FileName:"+path.getFileName());
                if(Files.isDirectory((path)))
                {
                    try {
                        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                        for (Path p : directoryStream) {
                            System.out.println(p.toString());
                        }
                    }
                    catch (IOException exception)
                    {
                        exception.printStackTrace();
                    }
                }
            }
            /*读文件*/
            try(Scanner duoutput=new Scanner(Paths.get("clients.txt")))
            {
                System.out.printf("%-10s%-12s%-12s%10s%n", "Account","First Name", "Last Name", "Balance");

                while (duoutput.hasNext()) {
                   // System.out.printf(""+
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", duoutput.nextInt(), duoutput.next(), duoutput.next(), duoutput.nextDouble());
                    //System.out.printf("geovindu");
                }

            }
            catch (IOException|NoSuchElementException|IllegalStateException exception)
            {
                exception.printStackTrace();
            }
           //写文件
           String dufileName="geovin1.txt";
            String value = "Hello,涂聚文，你好吗";
            StringBuilder builder=new StringBuilder();
            builder.indexOf(value);
            builder.indexOf("geovindu");
            try {
                FileOutputStream fos = new FileOutputStream(dufileName);
                DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
                outStream.writeUTF(builder.toString());
                outStream.close();

                // verify the results
                String result;
                FileInputStream fis = new FileInputStream(dufileName);
                DataInputStream reader = new DataInputStream(fis);
                result = reader.readUTF();
                reader.close();
            }
            catch (IOException  exception)
            {
                exception.printStackTrace();
            }


           //写文件
            Scanner geovinduinput = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");


            try (Formatter output = new Formatter("geovindu.txt")) {
                while (geovinduinput.hasNext()) { //
                    try {

                        output.format("%d %s %s %.2f%n", geovinduinput.nextInt(),
                                geovinduinput.next(), geovinduinput.next(), geovinduinput.nextDouble());
                    }
                    catch (NoSuchElementException elementException) {
                        System.err.println("Invalid input. Please try again.");
                        geovinduinput.nextLine(); //
                    }

                    System.out.print("? 请输入下一行：");
                }
            }
            catch (SecurityException | FileNotFoundException |
                    FormatterClosedException e) {
                e.printStackTrace();
                System.exit(1); //
            }


            System.out.println("Java Custom Annotation Example");
            System.out.println();




            DuPainter duPainter=new DuPainter();

           // DuPainter.launch();

            DuUser usr = new DuUser();
            usr.setEmail("geovindu@dusystem.com");
            usr.setName("Geovin Du");
            usr.setId(112);
            usr.setCreated(new Date());

            for (Field field : usr.getClass().getDeclaredFields()) {
                DBField dbField = field.getAnnotation(DBField.class);
                System.out.println("field name: " + dbField.name());

                // changed the access to public
                field.setAccessible(true);
                Object duvalue = field.get(usr);
                System.out.println("field value: " + duvalue);

                System.out.println("field type: " + dbField.type());
                System.out.println("is primary: " + dbField.isPrimaryKey());
                System.out.println();
            }


            String name;
            if (args.length > 0) name = args[0];
            else
            {
                var in = new Scanner(System.in);
                System.out.println("Enter class name (e.g. java.util.Date): ");
                name = in.next();
            }

            // print class modifiers, name, and superclass name (if != Object)
            Class cl = Class.forName(name);
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            if (cl.isSealed())
                System.out.print("sealed ");
            if (cl.isEnum())
                System.out.print("enum " + name);
            else if (cl.isRecord())
                System.out.print("record " + name);
            else if (cl.isInterface())
                System.out.print("interface " + name);
            else
                System.out.print("class " + name);
            Class supercl = cl.getSuperclass();
            if (supercl != null && supercl != Object.class) System.out.print(" extends "
                    + supercl.getName());

            DuReflection.printInterfaces(cl);
            DuReflection.printPermittedSubclasses(cl);

            System.out.print("\n{\n");
            DuReflection.printConstructors(cl);
            System.out.println();
            DuReflection.printMethods(cl);
            System.out.println();
            DuReflection.printFields(cl);
            System.out.println("}");



            //靜態工廠方法
            com.javapatterns.simplefactory.Grape g=(com.javapatterns.simplefactory.Grape) com.javapatterns.simplefactory.FruitGardener.factory("grape");
            // System.out.println();
            g.grow();
            g.getlog("geovindu,hi.");

            //工廠方法
            com.javapatterns.factorymethod.AppleGardener f=new AppleGardener();
            f.factory().grow();

            //抽象工厂
            com.javapatterns.abstractfactory.NorthernGardener gardener=new NorthernGardener();
            gardener.setName("geovindu");
            com.javapatterns.abstractfactory.NorthernFruit  fruit=(NorthernFruit)gardener.createFruit("苹果");

            fruit.Harvest();
            System.out.println("园丁管理员是："+gardener.getName()+"种植的水果是："+fruit.getName());

             //登记单例模式
            RegSingleton  s = RegSingleton.getInstance("RegSingleton");
            if(s==null)
            {
               System.out.println("未找到类");
            }
            else
            {
                String ss=s.about();
                System.out.println(ss);
            }

            RegSingletonChild sc=RegSingletonChild.getInstance();
            if(sc==null)
            {

                System.out.println("未找到类");
            }
            else
            {
                String ssc=sc.about();
                System.out.println(ssc);
            }
            //多例模式
           //LingualResource ling = LingualResource.getInstance("en" , "US");

            //String usDollar = ling.getLocaleString("USD");
            //System.out.println("USD=" + usDollar);
           // LingualResource lingZh = LingualResource.getInstance("zh" , "CH");
            //String usDollarZh = lingZh.getLocaleString("USD");
           // System.out.println("USD=" + usDollarZh);
            LingualResource.displayCurrency(new Double(1234567.89), new Locale("en", "US"));
            LingualResource.displayCurrency(new Double(1234567.89), new Locale("de", "DE"));
            LingualResource.displayCurrency(new Double(1234567.89), new Locale("fr", "FR"));

            //建造模式
            Director director=new Director();
            director.construct();
            Product product=director.restrieveResult();
            System.out.println("产品名称： "+ product.getName()+" 生产日期："+product.getCreateDate().toString());
            System.out.println(product.toString());

            List<Product> list=director.restrieveResults();
            for (Product p:list)
            {
                System.out.println(p.toString());
            }
            //
            list.forEach(item->System.out.println(item.toString()));

            //2、条件遍历
            list.forEach(item-> {
                if ("geovindu".equals(item.getName())) {
                    System.out.println(item.toString());
                }
            });

            //原始模型
            thisPanda = new PandaToClone(15, 25);
            thisPanda.setAge(3);

            // Create the second object by cloning the first
            thatPanda = (PandaToClone) thisPanda.clone();

            // Now describe these objects on the system console :

            System.out.println(" Age of this panda : " + thisPanda.getAge());
            System.out.println("            height : " + thisPanda.getHeight());
            System.out.println("            weight : " + thisPanda.getWeight());
            System.out.println(" Age of that panda : " + thatPanda.getAge());
            System.out.println("            height : " + thatPanda.getHeight());
            System.out.println("            weight : " + thatPanda.getWeight());


            // Record
            DuRecord.Point pgeovindu =new DuRecord.Point(3, 4);
            System.out.println("pgeovindu 坐标: " + pgeovindu.x() + " " + pgeovindu.y());
            System.out.println("距离原点: " + pgeovindu.distanceFromOrigin());
            // Same computation with static field and method
            System.out.println("距离原点: " +  DuRecord.Point.distance( DuRecord.Point.ORIGIN, pgeovindu));

            // A mutable record
            var ptgeovindu = new  DuRecord.PointInTime(3, 4, new Date());
            System.out.println("前: " + ptgeovindu);
            ptgeovindu.when().setTime(0);
            System.out.println("后: " + ptgeovindu);

            // Invoking a compact constructor

            var rgeovindu = new  DuRecord.Range(4, 3);
            System.out.println("rgeovindu: " + rgeovindu);



        }
        catch (BadFruitException exception)
        {
            exception.printStackTrace();
        }

        try
        {
            //原始模型
            TheGreatestSage theGreatestSage=new TheGreatestSage();
            theGreatestSage.change();

            //适配器模式
            SwingUI frame=new SwingUI();
            frame.setTitle("我是涂聚文");
            WindowListener listener = new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.out.println("关窗了！");
                    System.exit(0);
                }
            };

            frame.addWindowListener(listener);
            frame.pack();
            frame.setVisible(true);

            //合成模式
            ImageEditor editor = new ImageEditor();
            editor.loadShapes(
                    new com.javapatterns.composite.Circle(10, 10, 10, Color.BLUE),

                    new com.javapatterns.composite.CompoundShape(
                            new com.javapatterns.composite.Circle(110, 110, 50, Color.RED),
                            new com.javapatterns.composite.Dot(160, 160, Color.RED)
                    ),

                    new com.javapatterns.composite.CompoundShape(
                            new com.javapatterns.composite.Rectangle(250, 250, 100, 100, Color.GREEN),
                            new com.javapatterns.composite.Dot(240, 240, Color.GREEN),
                            new com.javapatterns.composite.Dot(240, 360, Color.GREEN),
                            new com.javapatterns.composite.Dot(360, 360, Color.GREEN),
                            new com.javapatterns.composite.Dot(360, 240, Color.GREEN)
                    )
            );

            //装饰模式
            order = new SalesOrder();
            order.setSalesDate(new Date());
            order.setCustomerName("捷为工作室");

            OrderLine line1 = new OrderLine();

            line1.setItemName("涂氏PDA");
            line1.setUnitPrice(154.23);
            line1.setUnits(4);

            order.addItem(line1);

            OrderLine line2 = new OrderLine();

            line2.setItemName("RFID读写器");
            line2.setUnitPrice(300.45);
            line2.setUnits(1);

            order.addItem(line2);

            order = new HeaderDecorator(new FooterDecorator(order));

            order.print();

            //代理模式
            searcher = new  com.javapatterns.proxy.Proxy();
            String userId = "geovindu";
            String searchType = "SEARCH_BY_ACCOUNT_NUMBER";
            String result = searcher.doSearch(userId, searchType);
            System.out.println(result);
            //代理模式
            ImageClient app = new ImageClient();
            app.show();

           //享元模式
            List<String> orders=new LinkedList<>();
            orders.add("Black Coffee");
            orders.add("Capucino");
            orders.add("Espresso");
            orders.add("Espresso");
            orders.add("Capucino");
            orders.add("Capucino");
            orders.add("Black Coffee");
            orders.add("Espresso");
            orders.add("Capucino");
            orders.add("Black Coffee");
            orders.add("Espresso");
            ClientOrder clientOrder=new ClientOrder();
            clientOrder.OrderShow(orders);

            //门面模式
            security=new SecurityFacade();
            security.activate();

            //橋梁(桥接)模式
            BoeingPassengerPlane boeingPassengerPlane=new BoeingPassengerPlane();
            boeingPassengerPlane.PassengerPlaneFly();
            boeingPassengerPlane.fly();

            BoeingCargoPlane boeingCargoPlane=new BoeingCargoPlane();
            boeingCargoPlane.CargoplaneFly();
            boeingCargoPlane.fly();

             MDPassengerPlane mdPassengerPlane=new MDPassengerPlane();
             mdPassengerPlane.PassengerPlaneFly();
             mdPassengerPlane.fly();

             MDCargoPlane mdCargoPlane=new MDCargoPlane();
             mdCargoPlane.CargoplaneFly();
             mdCargoPlane.fly();

             AirbusPassengerPlane airbusPassengerPlane=new AirbusPassengerPlane();
             airbusPassengerPlane.PassengerPlaneFly();
             airbusPassengerPlane.fly();

             AirbusCargoPlane airbusCargoPlane=new AirbusCargoPlane();
             airbusCargoPlane.CargoplaneFly();
             airbusCargoPlane.fly();

             //不变模式
            System.out.println("==============Pig starting==============");
            Pig du=new BaPig();
            du.speak();
            du.walk();
            System.out.println("==============Pig finishing==============");

            System.out.println("==============starting==============");
            du = new BaPig("Hello");
            du.speak();
            du.walk();
            System.out.println("==============finishing==============");

            //策略模式
            double price=25.0;
            int copies=2;
            NoDiscountStrategy noDiscountStrategy=new NoDiscountStrategy(price,copies);
            double zk=noDiscountStrategy.calculateDiscount();
            FlatRateStrategy flatRateStrategy=new FlatRateStrategy(price,copies);
            flatRateStrategy.setAmount(2.0);
            double zk2=flatRateStrategy.calculateDiscount();
            PercentageStrategy percentageStrategy=new PercentageStrategy(price,copies);
            percentageStrategy.setPercent(0.2);
            double zk3=percentageStrategy.calculateDiscount();
            System.out.println("第一种折扣是："+zk+"元  第二种折扣是：:"+zk2+"  第三种折扣是：:"+zk3+"元 ");

           //模板方法模式
            Account acct = null;
            acct = new MoneyMarketAccount();
            acct.calculateAmount("Money Market","1");
            System.out.println("Amount: 8888.00DInterest earned from Money Market account = " + acct.calculateInterest());
            acct = new CDAccount();
            acct.calculateAmount("Certificate of Deposite","1");
            System.out.println("Amount: 8888.00D Interest earned from CD account = " + acct.calculateInterest());

            acct = new MoneyMarketAccount();
            acct.calculateAmount("Money Market","2");
            System.out.println("Amount: 100000.00D  Interest earned from Money Market account = " + acct.calculateInterest());
            acct = new CDAccount();
            acct.calculateAmount("Certificate of Deposite","2");
            System.out.println("Amount: 100000.00D  Interest earned from CD account = " + acct.calculateInterest());

            //观察者模式
            ConcreteSubject subject;
            com.javapatterns.observer.Observer observer;
            subject = new ConcreteSubject();
            observer = new ConcreteObserver();
            subject.attach(observer);
            subject.change("new state");
           //迭代器模式
            MonkTang monkTang=new MonkTang();
            monkTang.Show();

            //责任链模式
            JiaMu jiaMu = new JiaMu(null);
                    jiaMu.setSuccessor( new JiaShe (
                    new JiaZheng(
                            new JiaBaoYu(
                                    new JiaHuan( jiaMu ) ) ) ) );

            firstPlayer = jiaMu;

            firstPlayer.handle(4);

            //命令模式
            TheWorld theWorld=new TheWorld();
            
            //备忘录模式
            Originator o = new Originator();
            o.speak();
            //Memento m=new Memento("开");
           // m.speak();
            Caretaker c = new Caretaker();
            o.setState("开");

            // Store internal state
            c.saveMemento( o.createMemento() );
            // Continue changing originator
            o.setState("关");
            // Restore saved state
            o.restoreMemento( c.retrieveMemento() );


           // 状诚模式
           com.javapatterns.state.UI.Player player = new com.javapatterns.state.UI.Player();
            UI ui = new UI(player);
            ui.init();

            //参观者模式

            PriceVisitor pv;
            InventoryVisitor iv;
            Equipment equip;

            equip = new Pc();

            pv = new PriceVisitor();
            equip.accept(pv);
            System.out.println("Price: " + pv.value() );

            System.out.println("\n");
            iv = new InventoryVisitor();
            equip.accept(iv);
            System.out.println("Number of parts: " + iv.size());

            //解释器模式
            Context ctx;
            Expression exp ;
            ctx = new Context();
            Variable x = new Variable("x");
            Variable y = new Variable("y");
            Constant ducc = new Constant(true);
            ctx.assign(x, false);
            ctx.assign(y, true);
            exp = new DuOr( new DuAnd(ducc, x) , new DuAnd(y, new DuNot(x)));
            System.out.println( "x = " + x.interpret(ctx));
            System.out.println( "y = " + y.interpret(ctx));
            System.out.println( exp.toString() + " = " + exp.interpret(ctx));

            //中介者模式/调停者模式
            Editor Dueditor = new Editor();
            Dueditor.loadShapes(
                    new com.javapatterns.mediator.shapes.Circle(10, 10, 10, Color.BLUE),

                    new com.javapatterns.mediator.shapes.CompoundShape(
                            new com.javapatterns.mediator.shapes.Circle(110, 110, 50, Color.RED),
                            new com.javapatterns.mediator.shapes.Dot(160, 160, Color.RED)
                    ),

                    new com.javapatterns.mediator.shapes.CompoundShape(
                            new com.javapatterns.mediator.shapes.Rectangle(250, 250, 100, 100, Color.GREEN),
                            new com.javapatterns.mediator.shapes.Dot(240, 240, Color.GREEN),
                            new com.javapatterns.mediator.shapes.Dot(240, 360, Color.GREEN),
                            new com.javapatterns.mediator.shapes.Dot(360, 360, Color.GREEN),
                            new com.javapatterns.mediator.shapes.Dot(360, 240, Color.GREEN)
                    )
            );

            System.out.println("OS Name: " + System.getProperty("os.name"));
            System.out.println("OS Version: " + System.getProperty("os.version"));

            //空对象模式 null object Pattern
            System.out.println("***空对象模式 Null Object Pattern Demo***\n");
            String input = "虚拟输入开始处理";
            int totalObjects = 0;
            Scanner scanner;
            while(!input.toLowerCase().contains("exit"))
            {
                System.out.println("输入您的选择(输入“a”代表公共汽车，输入“b”代表火车。输入'exit'关闭应用程序 ");
                scanner=new Scanner(System.in);
                if(scanner.hasNextLine())
                {
                    input = scanner.nextLine();
                }
                Vehicle vehicle = null;
                switch (input.toLowerCase())
                {
                    case "a":
                        vehicle = new Bus();
                        break;
                    case "b":
                        vehicle = new Train();
                        break;
                    case "exit":
                        System.out.println("关闭应用程序");
                        vehicle = NullVehicle.getInstance();
                        break;
                    default:
                        System.out.println("您是不是要找：");
                        vehicle =  NullVehicle.getInstance();
                        //break;
                }
                totalObjects = Bus.busCount + Train.trainCount+NullVehicle.nullVehicleCount;
                //A immediate remedy
                //if(vehicle !=null)
                //{
                vehicle.travel();
                //}
                System.out.println("系统中创建的对象总数为 : "+ totalObjects);
            }




            //
            EventQueue.invokeLater(() ->
            {
                var Duframe = new ImageViewerFrame();
                Duframe.setTitle("图片浏览 Image Viewer");
                Duframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Duframe.setVisible(true);
            });
            //
            LotteryDrawing lotteryDrawing=new LotteryDrawing();
            lotteryDrawing.Draw();
             ///
            Retirement retirement=new Retirement();
            retirement.Calculate();




        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        try {





            ItextHelper.addImageToPDFDU("src/geovindu1.pdf");

           int [] arr=new int[]{1,5,6,0,7,4,9,3};
           int [] index=new int[]{0,1,2,3,4,0,5,1,2,5,6};
            String tel="";
            for(int i:index)
            {
                tel+=arr[i];

            }
            System.out.println("联系方式是："+tel);
            //联系方式是：15607145649



        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }


        DuMsSqlConn msqlcon=new DuMsSqlConn();

        RoleTypeList info=new RoleTypeList();
       // info.setRoleTypeName("geovindu");
       // info.setRoleTypeDescribe("测试");
       // info.setRoleTypeName("涂聚文");
       // info.setRoleTypeDescribe("测试2");
        //info.setRoleType(14);
       // info.setRoleTypeName("江西涂");
       // info.setRoleTypeDescribe("江333 ");

       // int ok=msqlcon.AddSQL(info);
        //int ok=msqlcon.AddProc(info);
        OutValue outValue=new OutValue();
        //int ok=msqlcon.AddProcOut(info,outValue);
        //int ok=msqlcon.UpdateSQL(info);
        //int ok=msqlcon.UpdateProc(info);
         //int ok=msqlcon.DeleteSQL(15);
        //int ok=msqlcon.DeleteProc(14);
        //info=msqlcon.selectIdSql(1);
        info=msqlcon.selectIdProcl(1);
        int ok=1;
        if(ok>0)
        {
            System.out.println("add ok"+outValue.getIntValue()+info.getRoleTypeName());  //
        }
        else
        {
            System.out.println("add no"+outValue.getIntValue());
        }

        ArrayList<RoleTypeList> list=new ArrayList<RoleTypeList>();
       //list= msqlcon.selectSqlAll();q
        list= msqlcon.selectProclAll();
        for(RoleTypeList roleTypeList:list)
        {
            System.out.println("id:" +
                    +roleTypeList.getRoleType()+" Name:"+roleTypeList.getRoleTypeName()+" Decs:"+roleTypeList.getRoleTypeDescribe());
        }
        BookKindBLL bookKindBLL=new BookKindBLL();
        String id="2";
        BookKind  bookKindInfo=bookKindBLL.SelectSQLBookKindInfo(id);
        System.out.println("Id:"+id+",名称："+bookKindInfo.getBookKindName()+"父节点："+bookKindInfo.getBookKindParent());

        ArrayList<BookKind> arrayList=new ArrayList<BookKind>();
        arrayList=bookKindBLL.SelectSProcToBookKindAll();
        for(BookKind bookKind:arrayList)
        {
            System.out.println("Id:"+bookKind.getBookKindID()+",名称："+bookKind.getBookKindName()+"父节点："+bookKind.getBookKindParent()+"编码："+bookKind.getBookKindCode());
        }
        /*
        System.out.println("客户端运行");
        {
            try{
                Socket socket=new Socket("127.0.0.1",8080);
                DataInput input=new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
                BufferedReader keyboardIn=new BufferedReader(new InputStreamReader(System.in));
                {
                    while(true)
                    {

                        String keybaoardInpuString=keyboardIn.readLine();
                        if(keybaoardInpuString.equals("bye"))
                        {
                            break;
                        }
                        JSONObject jsonObject=new JSONObject();
                        jsonObject.put("message",keybaoardInpuString);
                        jsonObject.put("userid","javaee");
                        jsonObject.put("username","geovindu");
                        outputStream.writeUTF(jsonObject.toString());
                        outputStream.flush();

                        String str=input.readUTF();
                        jsonObject=new JSONObject(str);
                        //System.out.println("从服务器接收的数据：%s \n",str);

                    }

                }

            }
            catch (ConnectException exception)
            {
                exception.printStackTrace();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }

        });
        thread.start();
         */

    }



}
