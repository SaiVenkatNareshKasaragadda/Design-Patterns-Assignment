import java.io.*;
import java.util.*;
import java.awt.Window.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeatProductMenu implements ProductMenu {
    private Person person;

    public MeatProductMenu(Person person) {
        this.person = person;
        
        JFrame frame = new JFrame("Menu");
        JPanel meatMenuPanel = new JPanel(new GridLayout(9,1));
        JButton addTrading = new JButton("Add Trading");
        JButton viewProductList = new JButton("View Product List");
        JButton viewTrading = new JButton("View Trading");
        JButton  submitOffering = new JButton("Submit Offering");
        JButton reminder = new JButton("remind");
        JButton createUser = new JButton("Create User");
        JButton attach = new JButton("Attach Product to User");
        JButton list = new JButton("Select Product");
        JButton operation = new JButton("Product Operation");
        meatMenuPanel.add(addTrading);
        meatMenuPanel.add(viewProductList);
        meatMenuPanel.add(viewTrading);
        meatMenuPanel.add(submitOffering);
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
       
        
    }

    @Override
    public void attachProductToUser() {
        
        
    }

    @Override
    public void courseOperation() {
        
        
    }

    @Override
    public void showMenu() {
       
        
    }

    @Override
    public void showAddButton() {
       
        
    }

    @Override
    public void showViewButton() {
        
        
    }

    @Override
    public void showRadioButton() {
        
        
    }

    @Override
    public void showLabels() {
       
        
    }

    @Override
    public void showComboxes() {
        
        
    }
    
}
