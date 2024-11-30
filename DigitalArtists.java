package com.mycompany.artstreamfinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class DigitalArtists extends DashboardClient {
    
    protected JButton[] commissionDigital = new JButton[4];
   
    public DigitalArtists() {
        // Set a specific title for the Digital Artists dashboard
        label.setText("Digital Artists");
        String[] digitalArtists = 
        {
            "Precious Anne Larayos",
            "Mykie Justinnae",
            "Ken Congson",
            "Bryan Esconde"
        };       
        
        // Clear the existing content panel
        contents.removeAll();

        // Set the new icon for Digital Artists
        ImageIcon newIcon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile.jpg");
        Image newImage = newIcon.getImage();
        Image resizedImage = newImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(resizedImage);

        // Update the contents with the new image
        for (int i = 0; i < grids.length; ++i) {
            // Update the label with the new icon
            profileLabels[i] = new JLabel(newIcon);
            profileLabels[i].setFont(new Font("Segoe UI", Font.PLAIN, 18));
            profileLabels[i].setForeground(Color.WHITE);
            profileLabels[i].setText(digitalArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            commissionDigital[i] = new JButton("REQUEST COMMISSION");
            commissionDigital[i].addActionListener(this);
            commissionDigital[i].setBackground(Color.decode("#17224d"));
            commissionDigital[i].setForeground(Color.WHITE);
            commissionDigital[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(commissionDigital[i], BorderLayout.SOUTH);

            // Add the grid to the contents panel
            contents.add(grids[i]);
        }

        // Refresh the UI to display changes
        contents.revalidate();
        contents.repaint();
        
        
        // Set the visibility of the window
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
       }else if(source == commissionDigital[0] || source == commissionDigital[1] || source == commissionDigital[2] ||source == commissionDigital[3] )
       {
           new CommissionDigital();
           setVisible(false);
       }
       
       
    }
   
 }
