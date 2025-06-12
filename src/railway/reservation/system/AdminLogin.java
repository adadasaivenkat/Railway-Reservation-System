package railway.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame
{
    public AdminLogin()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        TittleLab = new javax.swing.JLabel();
        IDLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        BackBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 235, -1));

        LoginBtn.setBackground(new java.awt.Color(0, 204, 204));
        LoginBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));

        ResetBtn.setBackground(new java.awt.Color(102, 255, 102));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("Admin Login");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 450, -1));

        IDLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        IDLab.setForeground(new java.awt.Color(255, 204, 0));
        IDLab.setText("ID");
        getContentPane().add(IDLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        PasswordLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        PasswordLab.setForeground(new java.awt.Color(255, 204, 0));
        PasswordLab.setText("Password");
        getContentPane().add(PasswordLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, -1));

        PasswordField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 240, -1));

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

        BackLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BackLab.setForeground(new java.awt.Color(0, 0, 0));
        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/AdminLogin.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        String ID = IDField.getText();
        char[] passwordChars = PasswordField.getPassword();
        String password = new String(passwordChars);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
            String usernameDB = "saivenkatadada";
            String passwordDB = "2005@Sv";
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String sq = "SELECT COUNT(*) FROM admins WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1, ID);
            ResultSet rs = st.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0)
            {
                String spq = "SELECT password FROM admins WHERE id = ?";
                PreparedStatement spt = con.prepareStatement(spq);
                spt.setString(1, ID);
                ResultSet prs = spt.executeQuery();
                prs.next();
                String OriginalPass = prs.getString("password");
                if (OriginalPass.equals(password))
                {
                    // Password matches, show welcome message
                    JOptionPane.showMessageDialog(this, "Welcome!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    AdminControlPanel obj=new AdminControlPanel(ID);
                    obj.setLocationRelativeTo(null); 
                    obj.setVisible(true);
                } 
                else
                {
                    // Password is incorrect
                    JOptionPane.showMessageDialog(this, "Incorrect password. Please try again.");
                    PasswordField.setText("");
                }
                prs.close();
                spt.close();
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Unknown Login. Not a valid ID. Please try again.", "Message", JOptionPane.INFORMATION_MESSAGE);
                IDField.setText("");
                PasswordField.setText("");
            }
            rs.close();
            st.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        MainScreen obj=new MainScreen();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        IDField.setText("");
        PasswordField.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLab;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel TittleLab;
    // End of variables declaration//GEN-END:variables
}