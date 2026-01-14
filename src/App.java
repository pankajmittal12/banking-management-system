import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import frontend.login_system.Signup;

public class App extends JFrame {
    private final JMenuBar menuBar;
    private final JMenu newMenu, checkBalanceMenu, depositMenu, loanMenu, schemeMenu, profileMenu;
    private final JMenuItem currentAccountItem, savingAccountItem, currentAccountItem2, savingAccountItem2, 
    currentAccountItem3, savingAccountItem3, pandingLoans, newLoan;
    private final Signup signup;
    App(){
        // this setting is for frame class

        setTitle("Bank Management System");
        setBounds(180,50, 1200, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // this are the allocated class objects

        menuBar = new JMenuBar(); // this is menubar class object

        menuBar.setBackground(Color.LIGHT_GRAY); // there are the menubar settings 

        // New Menu 

        newMenu = new JMenu("New Account"); // this is menu

        newMenu.setForeground(Color.DARK_GRAY); // this are menu settings

        newMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this are menu settings

        currentAccountItem = new JMenuItem("New Current Account");  // this are menu items

        savingAccountItem = new JMenuItem("new Saving Account"); // this are menu items

        newMenu.add(currentAccountItem); // this i added the menu items here

        currentAccountItem.setForeground(Color.DARK_GRAY); // this i added the menu items settings

        currentAccountItem.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu items settings

        newMenu.add(savingAccountItem); // this i added the menu items here

        savingAccountItem.setForeground(Color.DARK_GRAY); // this i added the menu items setting

        savingAccountItem.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu items setting

        // Check Balance

        checkBalanceMenu = new JMenu("Check Balance"); // this i added the menu here

        checkBalanceMenu.setForeground(Color.DARK_GRAY); // this i added the menu here

        checkBalanceMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu here

        currentAccountItem2 = new JMenuItem("Check Current Account");  // this are menu items

        currentAccountItem2.setForeground(Color.DARK_GRAY); // this i added the menu items settings

        currentAccountItem2.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));
        
        savingAccountItem2 = new JMenuItem("Check Saving Account"); // this are menu items

        savingAccountItem2.setForeground(Color.DARK_GRAY); // this i added the menu items setting

        savingAccountItem2.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu items setting

        checkBalanceMenu.add(currentAccountItem2);

        checkBalanceMenu.add(savingAccountItem2);

        // Deposit 

        depositMenu = new JMenu("Deposit"); // this is menu

        depositMenu.setForeground(Color.DARK_GRAY);  // this are menu settings

        depositMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));  // this are menu settings

        currentAccountItem3 = new JMenuItem("Deposit Current Account");  // this are menu items

        currentAccountItem3.setForeground(Color.DARK_GRAY); // this i added the menu items settings

        currentAccountItem3.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));
        
        savingAccountItem3 = new JMenuItem("Deposit Saving Account"); // this are menu items

        savingAccountItem3.setForeground(Color.DARK_GRAY); // this i added the menu items setting

        savingAccountItem3.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu items setting

        depositMenu.add(currentAccountItem3);

        depositMenu.add(savingAccountItem3);

        // Loans

        loanMenu = new JMenu("Loans"); // this is menu

        loanMenu.setForeground(Color.DARK_GRAY);  // this are menu settings

        loanMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));  // this are menu settings

        pandingLoans = new JMenuItem("Pending Loans");  // this are menu items

        pandingLoans.setForeground(Color.DARK_GRAY); // this i added the menu items settings

        pandingLoans.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));
        
        newLoan = new JMenuItem("New Loans"); // this are menu items

        newLoan.setForeground(Color.DARK_GRAY); // this i added the menu items setting

        newLoan.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12)); // this i added the menu items setting

        loanMenu.add(pandingLoans);

        loanMenu.add(newLoan);

        // Schemes 

        schemeMenu = new JMenu("Schemes"); // this is menu

        schemeMenu.setForeground(Color.DARK_GRAY);  // this are menu settings 

        schemeMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));  // this are menu settings

        // Profile

        profileMenu = new JMenu("Profile"); // this is menu

        profileMenu.setForeground(Color.DARK_GRAY);  // this are menu settings

        profileMenu.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 12));  // this are menu settings

        setJMenuBar(menuBar); // here i add menu bar

        // here we add menu to menu bar 

        menuBar.add(newMenu);
        menuBar.add(checkBalanceMenu);
        menuBar.add(depositMenu);
        menuBar.add(loanMenu);
        menuBar.add(schemeMenu);
        menuBar.add(profileMenu);

        signup = new Signup();

        add(signup);

        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
