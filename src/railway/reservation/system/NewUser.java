package railway.reservation.system;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class NewUser extends javax.swing.JFrame
{
    public NewUser()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        SignInBtn = new javax.swing.JButton();
        TittleLab = new javax.swing.JLabel();
        FirstNameLab = new javax.swing.JLabel();
        LastNameLab = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        UsernameLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        EmailIdLab = new javax.swing.JLabel();
        PhonenoLab = new javax.swing.JLabel();
        EmailIdField = new javax.swing.JTextField();
        PhonenoField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterBtn.setBackground(new java.awt.Color(51, 255, 255));
        RegisterBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 120, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 0, 51));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 120, -1));

        SignInBtn.setBackground(new java.awt.Color(51, 255, 51));
        SignInBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        SignInBtn.setText("Already have account ? Sign in");
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("Registration");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 430, -1));

        FirstNameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        FirstNameLab.setForeground(new java.awt.Color(255, 255, 0));
        FirstNameLab.setText("First Name");
        getContentPane().add(FirstNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        LastNameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        LastNameLab.setForeground(new java.awt.Color(255, 255, 0));
        LastNameLab.setText("Last Name");
        getContentPane().add(LastNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 130, -1));

        FirstNameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(FirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 235, -1));

        LastNameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 235, -1));

        UsernameLab.setBackground(new java.awt.Color(255, 255, 255));
        UsernameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 255, 0));
        UsernameLab.setText("Username");
        getContentPane().add(UsernameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 120, 30));

        PasswordLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        PasswordLab.setForeground(new java.awt.Color(255, 255, 0));
        PasswordLab.setText("Password");
        getContentPane().add(PasswordLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 120, -1));

        UsernameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 235, -1));

        EmailIdLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        EmailIdLab.setForeground(new java.awt.Color(255, 255, 0));
        EmailIdLab.setText("Email ID");
        getContentPane().add(EmailIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 120, -1));

        PhonenoLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        PhonenoLab.setForeground(new java.awt.Color(255, 255, 0));
        PhonenoLab.setText("Phone no");
        getContentPane().add(PhonenoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 120, -1));

        EmailIdField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(EmailIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 235, -1));

        PhonenoField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(PhonenoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 235, -1));

        PasswordField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 235, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/NewUser.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        String username = UsernameField.getText();
        char[] passwordChars = PasswordField.getPassword();
        String password = new String(passwordChars);
        String email = EmailIdField.getText();
        String phone = PhonenoField.getText();
        String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
        String usernameDB = "saivenkatadada";
        String passwordDB = "2005@Sv";
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            // Check if the user already exists
            String sq = "SELECT COUNT(*) FROM users WHERE username = ?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            rs.next(); 
            int count = rs.getInt(1);
            if (count > 0)
            {
                JOptionPane.showMessageDialog(this, "A user account with the provided username already exists. Please choose another username or log in with the existing one.","Duplicate Entry!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserLogin obj=new UserLogin();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
                return; // Stop further execution
            }
            // Define SQL insert statement
            String iq = "INSERT INTO users (firstname, lastname, username, password, emailid, phoneno) VALUES (?, ?, ?, ?, ?, ?)";   // iq=Insert Query
            PreparedStatement is = con.prepareStatement(iq);                                                                         // is=Insert Statement
            // Set parameters
            is.setString(1, firstName);
            is.setString(2, lastName);
            is.setString(3, username);
            is.setString(4, password);
            is.setString(5, email);
            is.setString(6, phone);
            // Execute the insert statement
            int temp = is.executeUpdate();
            if (temp == 1)
            {
                JOptionPane.showMessageDialog(this, "Your Registration has been Successful.", "Thanks For Registering!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserLogin obj=new UserLogin();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            // Close resources
            is.close();
            st.close();
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        FirstNameField.setText(""); 
        LastNameField.setText(""); 
        UsernameField.setText(""); 
        PasswordField.setText(""); 
        EmailIdField.setText(""); 
        PhonenoField.setText(""); 
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
        dispose();
        UserLogin obj=new UserLogin();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_SignInBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLab;
    private javax.swing.JTextField EmailIdField;
    private javax.swing.JLabel EmailIdLab;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel FirstNameLab;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel LastNameLab;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JTextField PhonenoField;
    private javax.swing.JLabel PhonenoLab;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLab;
    // End of variables declaration//GEN-END:variables
}