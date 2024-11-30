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
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class LandscapeArtists extends CharcoalArtists {
     protected JButton[] viewProfileLandscape= new JButton[4];
    
    public LandscapeArtists()
    {
        label.setText("Charcoal Artists");
        String[] landscapeArtists = 
        {
            "Norman Lee",
            "Aristotle Mosiax",
            "Josh Montage",
            "Sarah Monday"
        };   
        
        contents.removeAll();
        for (int i = 0; i < grids.length; ++i) 
        {
            
            profileLabels[i].setText(landscapeArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            viewProfileLandscape[i] = new JButton("REQUEST COMMISSION");
            viewProfileLandscape[i].addActionListener(this);
            viewProfileLandscape[i].setBackground(Color.decode("#17224d"));
            viewProfileLandscape[i].setForeground(Color.WHITE);
            viewProfileLandscape[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(viewProfileLandscape[i], BorderLayout.SOUTH);

            // Add the grid to the contents panel
            contents.add(grids[i]);
        }

        // Refresh the UI to display changes
        contents.revalidate();
        contents.repaint();
        
        
        
        setVisible(true);
    
    }
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == acceptedButton)
       {
           
       }else if(source == pendingButton)
       {
           
       }else if(source == profileButton)
       {
           int choice = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Confirm Log-Out",JOptionPane.YES_NO_OPTION);
           
           if(choice == JOptionPane.YES_OPTION)
           {
               new FirstFrame();           
               setVisible(false);
           }   
       }else if(source == viewProfileLandscape[0])
       {
           
           setVisible(false);
       }else if(source == viewProfileLandscape[1])
       {
           
           setVisible(false);
           
       }else if(source == viewProfileLandscape[2])
       {
          
           setVisible(false);
       }else
       {
           
           setVisible(false);
       }
       
       
    }
    
    
    
    
}