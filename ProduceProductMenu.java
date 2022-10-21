import java.io.*;
import java.util.*;
import java.awt.Window.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProduceProductMenu implements ProductMenu{
    private String username;
    private String password;
    private Facade facade;

    public ProduceProductMenu(String username, String password, Facade facade) {
        this.username = username;
        this.password = password;
        this.facade = facade;
        JFrame frame = new JFrame("Menu");
        JPanel meatMenuPanel = new JPanel(new GridLayout(9,1));
        JButton addTrading = new JButton("Add Trading");
        JButton viewProductList = new JButton("View Product List");
        JButton viewTrading = new JButton("View Trading");
        JButton  viewOffering = new JButton("View Offering");
        JButton reminder = new JButton("remind");
        JButton createUser = new JButton("Create User");
        JButton attach = new JButton("Attach Product to User");
        JButton list = new JButton("Select Product");
        JButton operation = new JButton("Product Operation");
        meatMenuPanel.add(addTrading);
        meatMenuPanel.add(viewProductList);
        meatMenuPanel.add(viewTrading);
        meatMenuPanel.add(viewOffering);
        meatMenuPanel.add(reminder);
        meatMenuPanel.add(createUser);
        meatMenuPanel.add(attach);
        meatMenuPanel.add(list);
        meatMenuPanel.add(operation);
        frame.add(meatMenuPanel);
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setLocation(400,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void createProductList() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void attachProductToUser() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void courseOperation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showMenu() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showAddButton() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showViewButton() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showRadioButton() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showLabels() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showComboxes() {
        // TODO Auto-generated method stub
        
    }
    
}
