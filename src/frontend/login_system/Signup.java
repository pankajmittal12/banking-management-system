package frontend.login_system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Signup extends JPanel {
    private final JLabel titleLabel, nameLabel, numberLabel, fsciCodeLabel, accountNumber, 
    accountHolderName, password, comformPassword;
    private final JTextArea textArea1, textArea2, textArea3, textArea4, textArea5, textArea6, textArea7;
    private final JButton submitButton, showButtom1, showButton2, clearButton; 
    public Signup(){
        // this basic panel settings

        setBackground(Color.lightGray);
        setBounds(0,0,1200,700);
        setLayout(null);

        // title label

        titleLabel = new JLabel("Sign Up");
        titleLabel.setForeground(Color.DARK_GRAY);
        titleLabel.setFont(new Font("Verdana", Font.TRUETYPE_FONT, 24));
        titleLabel.setBounds(550, -75, 300, 300);

        // name label

        nameLabel = new JLabel("Full Name");
        nameLabel.setForeground(Color.DARK_GRAY);
        nameLabel.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        nameLabel.setBounds(300, 5, 300, 300);
        textArea1 = new JTextArea();
        textArea1.setForeground(Color.lightGray);
        textArea1.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea1.setBackground(Color.DARK_GRAY);
        textArea1.setBounds(550, 145, 300, 20);

        // number label

        numberLabel = new JLabel("Phone Number");
        numberLabel.setForeground(Color.DARK_GRAY);
        numberLabel.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        numberLabel.setBounds(300, 75, 300, 300);
        textArea2 = new JTextArea();
        textArea2.setForeground(Color.lightGray);
        textArea2.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea2.setBackground(Color.DARK_GRAY);
        textArea2.setBounds(550, 215, 300, 20);

        // fsci code label

        fsciCodeLabel = new JLabel("FSCI Code");
        fsciCodeLabel.setForeground(Color.DARK_GRAY);
        fsciCodeLabel.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        fsciCodeLabel.setBounds(300, 145, 300, 300);
        textArea3 = new JTextArea();
        textArea3.setForeground(Color.lightGray);
        textArea3.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea3.setBackground(Color.DARK_GRAY);
        textArea3.setBounds(550, 280, 300, 20);

        // account holder name

        accountHolderName = new JLabel("Account Holder Name");
        accountHolderName.setForeground(Color.DARK_GRAY);
        accountHolderName.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        accountHolderName.setBounds(300, 205, 300, 300);
        textArea4 = new JTextArea();
        textArea4.setForeground(Color.lightGray);
        textArea4.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea4.setBackground(Color.DARK_GRAY);
        textArea4.setBounds(550, 345, 300, 20);

        // account number

        accountNumber = new JLabel("Account Number");
        accountNumber.setForeground(Color.DARK_GRAY);
        accountNumber.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        accountNumber.setBounds(300, 275, 300, 300);
        textArea5 = new JTextArea();
        textArea5.setForeground(Color.lightGray);
        textArea5.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea5.setBackground(Color.DARK_GRAY);
        textArea5.setBounds(550, 415, 300, 20);

        // password

        password = new JLabel("Password");
        password.setForeground(Color.DARK_GRAY);
        password.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        password.setBounds(300, 345, 300, 300);
        textArea6 = new JTextArea();
        textArea6.setForeground(Color.lightGray);
        textArea6.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea6.setBackground(Color.DARK_GRAY);
        textArea6.setBounds(550, 480, 300, 20);

        // conform password

        comformPassword = new JLabel("Confirm Password");
        comformPassword.setForeground(Color.DARK_GRAY);
        comformPassword.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 15));
        comformPassword.setBounds(300, 405, 300, 300);
        textArea7 = new JTextArea();
        textArea7.setForeground(Color.lightGray);
        textArea7.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        textArea7.setBackground(Color.DARK_GRAY);
        textArea7.setBounds(550, 545, 300, 20);

        // Buttons 

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 14));
        submitButton.setBackground(Color.lightGray);
        submitButton.setBounds(300, 590, 100, 30);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 14));
        clearButton.setBackground(Color.lightGray);
        clearButton.setBounds(750, 590, 100, 30);

        showButtom1 = new JButton("Show");
        showButtom1.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        showButtom1.setBackground(Color.lightGray);
        showButtom1.setBounds(950, 475, 100, 30);

        showButton2 = new JButton("Show");
        showButton2.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 13));
        showButton2.setBackground(Color.lightGray);
        showButton2.setBounds(950, 539, 100, 30);

        add(titleLabel);
        add(nameLabel);
        add(numberLabel);
        add(fsciCodeLabel);
        add(accountHolderName);
        add(accountNumber);
        add(password);
        add(comformPassword);
        add(textArea1);
        add(textArea2);
        add(textArea3);
        add(textArea4);
        add(textArea5);
        add(textArea6);
        add(textArea7);
        add(submitButton);
        add(clearButton);
        add(showButtom1);
        add(showButton2);
    }
}
