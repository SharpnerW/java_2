package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Register extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JCheckBox sendAllTheDataCheckBox;
    private JButton button1;
    public Register(){
        setContentPane(panel1);
        this.pack();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().isEmpty() && !passwordField1.getText().isEmpty()){
                    if (sendAllTheDataCheckBox.isSelected()){
                        JOptionPane.showMessageDialog(null, "Success! Now you are registered!");
                        JOptionPane.showMessageDialog(null, "Your login is: "+textField1.getText()+"\nYour password is: "+passwordField1.getText(), "Microsoft", JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
            }
                    else {
                        JOptionPane.showMessageDialog(null, "You have no choice,\nWe will still collect all the data.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Your info is not entered.\nSorry, but we need to NUKE YOU!!!");
                }
            }
        });
    }
}
