//Bridge and Factory Patterns are implemented here
import java.io.*;
import java.util.*;
import java.awt.Window.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeatProductMenu implements ProductMenu {
    private String username;
    private String password;
    private Facade facade;
    private Person person;

    public MeatProductMenu(String username, String password, Facade facade) {
        this.username = username;
        this.password = password;
        this.facade = facade;
        
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
        addTrading.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Add Info of Trade here");

            }
        });
        viewProductList.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"All Products are displayed here");

            }
        });
        viewTrading.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"All Trades are displayed here");

            }
        });
        submitOffering.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"submit the final offer to seller here");

            }
        });
        reminder.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"deadlines and reminders about trades are displayed here");

            }
        });
        createUser.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"User will be created");

            }
        });
        attach.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Attach products to the new user here");

            }
        });
        list.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Select Product from the list of all products");

            }
        });
        operation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Respective menu is created and returned based on the user type");

            }
        });
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
