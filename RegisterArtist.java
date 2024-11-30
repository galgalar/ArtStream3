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
import static java.awt.Component.LEFT_ALIGNMENT;
import java.awt.event.*;

public class RegisterArtist extends RegisterClient implements ActionListener
{
    public RegisterArtist()
    {
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == registerButton)
       {
           JOptionPane.showMessageDialog(null,"Account created successfully!");
           new SigninArtist();
           setVisible(false);
       }else if(source == goBack)
       {
           new SetupAccountArtist();
           setVisible(false);
       }
       
    
    }
}
