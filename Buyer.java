import java.io.*;
import java.util.*;
import java.awt.Window.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Buyer extends Person{
    private String username;
    private String password;
    private Facade facade;

    public Buyer(String username, String password, Facade facade){
        super(username,password,facade);
    }
        




    @Override
    public void showMenu() {
        
    }

    @Override
    public ProductMenu creatProductMenu() {
        
        JFrame frame = new JFrame("Select Menu");
        JPanel menuPanel = new JPanel();
        ButtonGroup buttons = new ButtonGroup();
        JRadioButton meatProductMenuButton = new JRadioButton("MeatProductMenu");
        JRadioButton produceProductMenuButton = new JRadioButton("ProduceProductMenu");
        JButton submit = new JButton("Submit");
        JLabel select = new JLabel("Select Menu");
        buttons.add(meatProductMenuButton);
        buttons.add(produceProductMenuButton);
        menuPanel.add(select);
        menuPanel.add(meatProductMenuButton);
        menuPanel.add(produceProductMenuButton);
        menuPanel.add(submit);
        frame.add(menuPanel);
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setLocation(400,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                if(meatProductMenuButton.isSelected()){
                    super. = new MeatProductMenu(Person person);
                    frame.dispose();
                }
                else if(produceProductMenuButton.isSelected()){
                    new ProduceProductMenu(username, password, facade);
                    frame.dispose();
                }

    }});
        return null;
    
}
}