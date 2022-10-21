import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame{
    JFrame frame = new JFrame("PTBS");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JRadioButton buyer = new JRadioButton("Buyer");
    JRadioButton seller = new JRadioButton("Seller");
    ButtonGroup button = new ButtonGroup();
    JButton buttonLogin = new JButton("Login");
    JButton buttonReset = new JButton("Reset");
    HashMap<String,String> buyersList= new HashMap<String,String>();
    HashMap<String,String> sellersList= new HashMap<String,String>();
    public Facade facade;
    private boolean loginStatus = false;
    private Person theperson;
    private int usertype=-1;

    public Login(Facade facade){
    this.facade=facade;
    setSize(500,400);
    setLocation(400,350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel loginPanel = new JPanel(new GridLayout(4, 2));
    setTitle("PBTS");
    loginPanel.add(username);
    loginPanel.add(password);
    loginPanel.add(usernameField);
    loginPanel.add(passwordField);
    button.add(buyer);
    button.add(seller);
    loginPanel.add(seller);
    loginPanel.add(buyer);
    loginPanel.add(buttonLogin);
    loginPanel.add(buttonReset);
    buyersList();
    sellersList();
    add(loginPanel, BorderLayout.CENTER);
    buttonLogin.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            if((buyer.isSelected()) && (buyersList.containsKey(usernameField.getText()))){
                String getPassword = buyersList.get(usernameField.getText());
                if(getPassword.equals(passwordField.getText())){
                    theperson = new Buyer(usernameField.getText(),passwordField.getText(),facade);
                    loginStatus = true;
                    usertype=0;
                    dispose();

                }
                else{
                    JOptionPane.showMessageDialog(loginPanel,"Enter correct Password!");
                }
            }
            else if((seller.isSelected()) && (sellersList.containsKey(usernameField.getText()))){
                String getPassword = sellersList.get(usernameField.getText());
                if(getPassword.equals(passwordField.getText())){
                    theperson = new Seller(usernameField.getText(),passwordField.getText(),facade);
                    loginStatus = true;
                    usertype=1;
                    new Buyer(usernameField.getText(), passwordField.getText(), facade);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(loginPanel,"Enter correct Password!");
                }
            }
            else{
                JOptionPane.showMessageDialog(loginPanel,"User doesn't exist");
            }  
        }
    });
    }
    public void buyersList(){
            try {
                Scanner scanner = new Scanner(new File("BuyerInfo.txt"));
                while(scanner.hasNextLine()){
                    String eachLine = scanner.nextLine();
                    String[] loginDetails = eachLine.split(":");
                    buyersList.put(loginDetails[0], loginDetails[1]);
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    public void sellersList(){
            try {
                Scanner scanner = new Scanner(new File("SellerInfo.txt"));
                while(scanner.hasNextLine()){
                    String eachLine = scanner.nextLine();
                    String[] loginDetails = eachLine.split(":");
                    sellersList.put(loginDetails[0], loginDetails[1]);
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    public int getUserType() {
        return usertype;
    }
    public Person getThePerson() {
        return theperson;
    }
    public boolean getLoginStatus(){
        while(usertype==-1){Thread.onSpinWait();}
        return loginStatus; 
    }
}

    
    
    

