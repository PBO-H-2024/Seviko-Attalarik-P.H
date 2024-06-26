/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.Controller;;

/**
 *
 * @author Lenovo
 */
public class InputData extends JFrame{
    Controller connector = new Controller();
    
    JFrame window = new JFrame("Student Input");
    
    JLabel lNim = new JLabel("NIM");
    JTextField fNim = new JTextField();
    
    JLabel lName = new JLabel("NAME");
    JTextField fName = new JTextField();
    
    JLabel lAge = new JLabel("AGE");
    JTextField fAge = new JTextField();
    
    JButton btnAdd = new JButton("ADD");
    
    public InputData(){
        window.setLayout(null);
        window.setSize(500, 200);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
        window.add(lNim);
        window.add(lName);
        window.add(lAge);
        window.add(fNim);
        window.add(fName);
        window.add(fAge);
        window.add(btnAdd);
        
         //LABEL
        lNim.setBounds(5, 35, 120, 20);
        lName.setBounds(5, 60, 120, 20);
        lAge.setBounds(5, 85, 120, 20);
        
        //TEXTFIELD
        fNim.setBounds(150, 35, 120, 20);
        fName.setBounds(150, 60, 120, 20);
        fAge.setBounds(150, 85, 120, 20);
        
        //BUTTONPANEL
        btnAdd.setBounds(300, 35, 90, 20);
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connector.insertData(Integer.parseInt(fNim.getText()), fName.getText(), Integer.parseInt(fAge.getText()));
            }
        });
    }
}
