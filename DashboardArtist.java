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

public class DashboardArtist extends JFrame {
    
    private Container con = getContentPane();
    private JPanel headerPanel = new JPanel();
    private JPanel sidePanel = new JPanel();
   
    private JPanel title = new JPanel();
    private JPanel choices = new JPanel();
    private ImageIcon profile = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\profile-removebg-preview.png");
    private JButton profileButton;
    private JPanel mainPanel = new JPanel();
    
    public DashboardArtist()
    {
       super("ArtStream - Dashboard Artist");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con.setLayout(new BorderLayout());
        con.add(headerPanel, BorderLayout.NORTH);
        con.add(mainPanel, BorderLayout.CENTER);
        con.add(sidePanel,BorderLayout.WEST);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(Color.decode("#303765"));
        headerPanel.add(title, BorderLayout.WEST);
        headerPanel.add(choices, BorderLayout.EAST);
        
        title.setLayout(new FlowLayout(FlowLayout.LEADING));
        title.setBackground(Color.decode("#303765"));

        // Set a larger font size for the title
        JLabel titleLabel = new JLabel("ARTSTREAM");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 40)); // Increase font size here
        titleLabel.setForeground(Color.WHITE);
        title.add(titleLabel);

        // Set the icon sizes (as before)
        Image profileSize = profile.getImage();
        Image iconNewSize1 = profileSize.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        profile = new ImageIcon(iconNewSize1);
        
        profileButton = new JButton(profile);
        profileButton.setBackground(Color.decode("#303765"));
        profileButton.setToolTipText("Log-out");
        choices.add(profileButton);
        choices.setBackground(Color.decode("#303765"));
        headerPanel.add(choices, BorderLayout.EAST);
        
        sidePanel.setLayout(new BoxLayout(sidePanel,BoxLayout.Y_AXIS));

        
        
        setVisible(true);
    }
    
    
    
    
    
    
    
    
}
