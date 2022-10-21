

public class Facade{
    private int UserType;
    private Product theSelectedProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;

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
        Product create = new Product();
        create.createProductList();

    }
    public void attachProductToUser(){
        Product attach = new Product();
        attach.attachProductToUser();

    }
    public Product SelectProduct(){
        Product selectProduct = new Product("","");
        selectProduct.SelectProduct();
        return selectProduct;

    } 
    public void productOperation(){
        Product prod = new Product();
        prod.productOperation();

    }


}