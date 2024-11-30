/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

/**
 *
 * @author Owner
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommissionDigital extends DashboardClient implements ItemListener, ActionListener{
    
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JLabel name = new JLabel("Name");
    private JTextField nameField = new JTextField();
    private JLabel email = new JLabel("Email");
    private JTextField emailField = new JTextField();
    private JLabel contact = new JLabel("Contact");
    private JTextField contactField = new JTextField();   
    private JLabel subjectMatter = new JLabel("Subject Matter");
    private JTextField subjectMatterField = new JTextField();
    private JLabel medium = new JLabel("Medium");
    private String[] mediumOfDigital = 
    {
        "Select",
        "Adobe Photoshop - ₱1000.00 ",
        "Corel Painter - ₱1900.00",
        "Procreate - ₱2500.00"
    };  
    private JComboBox<String> mediumList = new JComboBox<>(mediumOfDigital);
    private JLabel size = new JLabel("Size");
    private ButtonGroup sizeChoice = new ButtonGroup();
    private JRadioButton size1 = new JRadioButton("10 cm x 15 cm - ₱100.00 ");
    private JRadioButton size2 = new JRadioButton("13 cm x 18 cm - ₱200.50");
    private JRadioButton size3 = new JRadioButton("20 cm x 25 cm - ₱250.10");
    private JRadioButton size4 = new JRadioButton("91 cm x 122 cm - ₱350.50");
    private JButton submit = new JButton("Submit");
      
    public CommissionDigital() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        label.setText("Commission Request");
        contents.removeAll();
        
        // Layout for contents
        contents.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));  // Adjusted flow layout with padding
        contents.setPreferredSize(new Dimension(700, 800));  // Increase the size of contents
        contents.add(panel1);   
        
        // Set background and layout of panel1
        panel1.setBackground(Color.decode("#484e7e"));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));   
        
        // Set preferred size for panel1
        panel1.setPreferredSize(new Dimension(600, 800)); // Increased height and width for panel1   // Set maximum size
        
        panel1.add(Box.createRigidArea(new Dimension(10, 30)));  // Spacing
        name.setForeground(Color.WHITE);
        panel1.add(name);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        nameField.setMaximumSize(new Dimension(600, 40));  // Adjusted field size
        nameField.setAlignmentX(LEFT_ALIGNMENT);
        panel1.add(nameField);
        
        // Email field
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        email.setForeground(Color.WHITE);
        panel1.add(email);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        emailField.setMaximumSize(new Dimension(600, 40));  // Adjusted field size
        emailField.setAlignmentX(LEFT_ALIGNMENT);
        panel1.add(emailField);
        
        // Contact field
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        contact.setForeground(Color.WHITE);
        panel1.add(contact);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        contactField.setMaximumSize(new Dimension(600, 40));  // Adjusted field size
        contactField.setAlignmentX(LEFT_ALIGNMENT);
        panel1.add(contactField);
        
        // Subject Matter field
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        subjectMatter.setForeground(Color.WHITE);
        panel1.add(subjectMatter);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        subjectMatterField.setMaximumSize(new Dimension(600, 60));  // Adjusted field size
        subjectMatterField.setAlignmentX(LEFT_ALIGNMENT);
        panel1.add(subjectMatterField);
        
        // Medium dropdown
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        medium.setForeground(Color.WHITE);
        panel1.add(medium);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        mediumList.setMaximumSize(new Dimension(450, 40));  // Adjusted dropdown size
        mediumList.setAlignmentX(LEFT_ALIGNMENT);
        panel1.add(mediumList);
        
        // Size options
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        size.setForeground(Color.WHITE);
        panel1.add(size);
        sizeChoice.add(size1);
        sizeChoice.add(size2);
        sizeChoice.add(size3);
        sizeChoice.add(size4);
        
        // Set background color for radio buttons
        size1.setBackground(Color.decode("#484e7e"));
        size2.setBackground(Color.decode("#484e7e"));
        size3.setBackground(Color.decode("#484e7e"));
        size4.setBackground(Color.decode("#484e7e"));
        
        size1.setForeground(Color.WHITE);
        size2.setForeground(Color.WHITE);
        size3.setForeground(Color.WHITE);
        size4.setForeground(Color.WHITE);
        
        // Add size options
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        panel1.add(size1);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        panel1.add(size2);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        panel1.add(size3);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        panel1.add(size4);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        submit.setMaximumSize(new Dimension(300, 40));
        panel1.add(submit);
        panel1.add(Box.createRigidArea(new Dimension(10, 10)));
        
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Padding around panel1
        
        // Set border for mainPanel
        mainPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        
        mediumList.addItemListener(this);
        size1.addItemListener(this);
        size2.addItemListener(this);
        size3.addItemListener(this);
        size4.addItemListener(this);
        submit.addActionListener(this);
         
        setVisible(true);
    }
    
    
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItem();
        
        if(source == mediumList)
        {
            
        }
        
        
    }   
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }   
    
    
    
    
    
    
}
