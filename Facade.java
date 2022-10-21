/*Facade pattern will implement the Bridge Pattern, Iterator Pattern and Visitor Pattern */
import java.io.*;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class Facade{
    private int UserType;
    private Product theSelectedProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;
    HashMap<String,String> productsList = new HashMap<String,String>();

    public boolean login(){
        Login login = new Login(this);
        login.setVisible(true);
        this.UserType = login.getUserType();
        thePerson = login.getThePerson();
        return login.getLoginStatus();
    }
    public void addTrading(){
        TradingMenu tradingmenu = new TradingMenu();
        tradingmenu.addTrading();


    }
    public void viewTrading(){
        TradingMenu tradingmenu = new TradingMenu();
        tradingmenu.viewTrading();

    }
    public void decidebidding(){
        Offering decider = new Offering();
        decider.decidebidding();

    }
    public void discussbidding(){
        Offering discuss = new Offering();
        discuss.discussbidding();

    }
    public void submitbidding(){
        Offering submit = new Offering();
        submit.submitbidding();


    }
    public void remind(){
        ReminderVisitor tradeRemind = new ReminderVisitor();
        ClassProductList list = new ClassProductList();
        list.accept(tradeRemind);

    }
    public void createUser(UserInfoItem userinfoitem){
        userinfoitem.createUser();

    }
    public void createProductList(){
       try{
        Scanner scanner = new Scanner(new File("ProductInfo.txt"));
        while(scanner.hasNextLine()){
            String eachProduct = scanner.nextLine();
            String[] products = eachProduct.split(":");
            productsList.put(products[0],products[1]);
        }

       }catch(FileNotFoundException ae){ae.printStackTrace();}
    }
    public void attachProductToUser(){
        Product attach = new Product();
        attach.attachProductToUser();

    }
    public Product SelectProduct(){
        Product selectProduct = new Product();
        selectProduct.SelectProduct();
        return selectProduct;

    } 
    public void productOperation(){
        Product prod = new Product();
        prod.productOperation();

    }

    public Person getPerson(){
        return thePerson;
    }

    public int getUserType(){
        return UserType;
    }

    public void accept(ReminderVisitor reminderVisitor){
        
    }

}
