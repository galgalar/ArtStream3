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

public class PortraitArtists extends LandscapeArtists {
    
    protected JButton[] viewProfilePortrait= new JButton[4];
    
    public PortraitArtists()
    {
        label.setText("Portrait Artists");
        String[] landscapeArtists = 
        {
            "Gojo Saturo",
            "Yuji Itadori",
            "Nobara Kugisaki",
            "Megumi Fushiguro"
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
            viewProfilePortrait[i] = new JButton("REQUEST COMMISSION");
            viewProfilePortrait[i].addActionListener(this);
            viewProfilePortrait[i].setBackground(Color.decode("#17224d"));
            viewProfilePortrait[i].setForeground(Color.WHITE);
            viewProfilePortrait[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(viewProfilePortrait[i], BorderLayout.SOUTH);

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
       }else if(source == viewProfilePortrait[0])
       {
           
           setVisible(false);
       }else if(source == viewProfilePortrait[1])
       {
           
           setVisible(false);
           
       }else if(source == viewProfilePortrait[2])
       {
          
           setVisible(false);
       }else
       {
           
           setVisible(false);
       }
       
       
    }
    
    
    
    
    
}