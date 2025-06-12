package railway.reservation.system;

public class MainScreen extends javax.swing.JFrame
{
    public MainScreen()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        UserLoginBtn = new javax.swing.JButton();
        AdminLoginBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setBackground(new java.awt.Color(255, 255, 255));
        TittleLab.setFont(new java.awt.Font("Yrsa SemiBold", 1, 48)); // NOI18N
        TittleLab.setText("Railway Reservation System");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        UserLoginBtn.setBackground(new java.awt.Color(255, 204, 0));
        UserLoginBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        UserLoginBtn.setText("User Login");
        UserLoginBtn.setBorderPainted(false);
        UserLoginBtn.setPreferredSize(new java.awt.Dimension(132, 32));
        UserLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UserLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 150, -1));

        AdminLoginBtn.setBackground(new java.awt.Color(0, 204, 255));
        AdminLoginBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        AdminLoginBtn.setText("Admin Login");
        AdminLoginBtn.setBorderPainted(false);
        AdminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdminLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 150, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/MainScreen.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginBtnActionPerformed
        dispose();
        UserLogin obj=new UserLogin();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_UserLoginBtnActionPerformed

    private void AdminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginBtnActionPerformed
        dispose();
        AdminLogin obj=new AdminLogin();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_AdminLoginBtnActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLoginBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JButton UserLoginBtn;
    // End of variables declaration//GEN-END:variables
}