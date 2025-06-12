package railway.reservation.system;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class UserLogin extends javax.swing.JFrame
{
    public UserLogin()
    {            
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        UsernameLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        CreateAccountBtn = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        BackBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("User Login");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 370, -1));

        UsernameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 255, 0));
        UsernameLab.setText("Username");
        getContentPane().add(UsernameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        PasswordLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        PasswordLab.setForeground(new java.awt.Color(255, 255, 0));
        PasswordLab.setText("Password");
        getContentPane().add(PasswordLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, 50));

        UsernameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 235, -1));

        LoginBtn.setBackground(new java.awt.Color(0, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(0, 0, 0));
        LoginBtn.setText("Login");
        LoginBtn.setBorderPainted(false);
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 110, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 153, 102));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 110, -1));

        CreateAccountBtn.setBackground(new java.awt.Color(255, 51, 51));
        CreateAccountBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CreateAccountBtn.setText("Create Account");
        CreateAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 235, -1));

        PasswordField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 235, -1));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BackBtn.setText("<- Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/UserLogin.jpg")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBtnActionPerformed
        dispose();
        NewUser obj=new NewUser();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_CreateAccountBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        String username = UsernameField.getText();
        char[] passwordChars = PasswordField.getPassword();
        String password = new String(passwordChars);
        try
        {
            // Load MySQL JDBC driver and establish connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
            String usernameDB = "saivenkatadada";
            String passwordDB = "2005@Sv";
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            // Define SQL query to check if user exists and password matches
            String sq = "SELECT COUNT(*) FROM users WHERE username = ?";                // sq=Select Query
            PreparedStatement st = con.prepareStatement(sq);                            // st=Select Statement
            st.setString(1, username);
            ResultSet rs = st.executeQuery();                                           // rs=Result Set
            rs.next(); 
            int count = rs.getInt(1);
            if (count > 0)
            {
                // User exists, check password
                String spq = "SELECT password FROM users WHERE username = ?";           // spq=Select Password Query
                PreparedStatement spt = con.prepareStatement(spq);                      // spt=Select Password Statement
                spt.setString(1, username);
                ResultSet prs = spt.executeQuery();
                prs.next();
                String OriginalPass = prs.getString("password");                        // prs=Password Result Set
                if (OriginalPass.equals(password))
                {
                    // Password matches, show welcome message
                    JOptionPane.showMessageDialog(this, "Welcome!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    UserControlPanel obj=new UserControlPanel(username);
                    obj.setLocationRelativeTo(null); 
                    obj.setVisible(true);
                } 
                else
                {
                    // Password is incorrect
                    JOptionPane.showMessageDialog(this, "Incorrect password. Please try again.");
                }
                // Close resources
                prs.close();
                spt.close();
            } 
            else
            {
                // User doesn't exist
                int option = JOptionPane.showConfirmDialog(this, "No account exists with the provided username. Do you want to create a new account?", "Create Account", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION)
                {
                    dispose();
                    NewUser obj=new NewUser();
                    obj.setLocationRelativeTo(null); 
                    obj.setVisible(true);
                }
            }
            // Close resources
            rs.close();
            st.close();
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        UsernameField.setText(""); 
        PasswordField.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        MainScreen obj=new MainScreen();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JButton CreateAccountBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLab;
    // End of variables declaration//GEN-END:variables
}