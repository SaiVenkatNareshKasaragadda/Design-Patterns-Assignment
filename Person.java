//abstract class
public abstract class Person {
    private String username;
    private String password;
    private Facade facade;


public Person(String username, String password, Facade facade){
    this.username = username;
    this.password = password;
    this.facade = facade;
}
private ProductMenu theProductMenu;
public abstract void showMenu();
public void showAddButton(){}
public void showViewButton(){}
public void showRadioButton(){}
public void showLabels(){}
public abstract ProductMenu creatProductMenu(); 

}
