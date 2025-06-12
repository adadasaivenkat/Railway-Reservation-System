package railway.reservation.system;

public class AdminControlPanel extends javax.swing.JFrame
{
    private String ID;
    public AdminControlPanel()
    {
        initComponents();
    }
    public AdminControlPanel(String ID)
    {
        this(); 
        this.ID=ID;
        String currentText = WelcomeLab.getText(); 
        WelcomeLab.setText(currentText + " , " + ID + " ! ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeLab = new javax.swing.JLabel();
        TittleLab = new javax.swing.JLabel();
        AllTrainsBtn = new javax.swing.JButton();
        ReserveSeatBtn = new javax.swing.JButton();
        ViewReservationsBtn = new javax.swing.JButton();
        UserDetailsBtn = new javax.swing.JButton();
        EmployeeDetailsBtn = new javax.swing.JButton();
        AddTrainsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLab.setFont(new java.awt.Font("Yrsa Medium", 1, 24)); // NOI18N
        WelcomeLab.setText("Welcome");
        getContentPane().add(WelcomeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 23));

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 60)); // NOI18N
        TittleLab.setText("Admin Dashboard");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        AllTrainsBtn.setBackground(new java.awt.Color(204, 204, 204));
        AllTrainsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        AllTrainsBtn.setText("All Trains");
        AllTrainsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllTrainsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AllTrainsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 216, -1));

        ReserveSeatBtn.setBackground(new java.awt.Color(204, 204, 204));
        ReserveSeatBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ReserveSeatBtn.setText("Reserve Seat");
        ReserveSeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveSeatBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ReserveSeatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 214, -1));

        ViewReservationsBtn.setBackground(new java.awt.Color(204, 204, 204));
        ViewReservationsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ViewReservationsBtn.setText("View Reservations");
        ViewReservationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservationsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewReservationsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 216, -1));

        UserDetailsBtn.setBackground(new java.awt.Color(204, 204, 204));
        UserDetailsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        UserDetailsBtn.setText("User Details");
        UserDetailsBtn.setActionCommand("");
        UserDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UserDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 216, -1));

        EmployeeDetailsBtn.setBackground(new java.awt.Color(204, 204, 204));
        EmployeeDetailsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        EmployeeDetailsBtn.setText("Employee Details");
        EmployeeDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EmployeeDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 216, -1));

        AddTrainsBtn.setBackground(new java.awt.Color(204, 204, 204));
        AddTrainsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        AddTrainsBtn.setText("Add Trains");
        AddTrainsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddTrainsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 216, -1));

        LogOutBtn.setBackground(new java.awt.Color(204, 255, 204));
        LogOutBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        LogOutBtn.setText("Log out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 630, 150, -1));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BackBtn.setText("<- Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/AdminControlPanel.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewReservationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservationsBtnActionPerformed
        dispose();
        ViewReservations obj=new ViewReservations();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_ViewReservationsBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        dispose();
        MainScreen obj=new MainScreen();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        AdminLogin obj=new AdminLogin();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AddTrainsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainsBtnActionPerformed
        dispose();
        AddTrains obj=new AddTrains();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_AddTrainsBtnActionPerformed

    private void AllTrainsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllTrainsBtnActionPerformed
        dispose();
        AllTrains obj=new AllTrains();
        obj.setLocationRelativeTo(null); 
        obj.setVisible(true);
    }//GEN-LAST:event_AllTrainsBtnActionPerformed

    private void EmployeeDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDetailsBtnActionPerformed
        dispose();
        EmployeeDetails obj=new EmployeeDetails();
        obj.setLocationRelativeTo(null); 
        obj.setVisible(true);
    }//GEN-LAST:event_EmployeeDetailsBtnActionPerformed

    private void UserDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDetailsBtnActionPerformed
        dispose();
        UserDetails obj=new UserDetails();
        obj.setLocationRelativeTo(null); 
        obj.setVisible(true);
    }//GEN-LAST:event_UserDetailsBtnActionPerformed

    private void ReserveSeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveSeatBtnActionPerformed
        dispose();
        ReserveSeat obj=new ReserveSeat();
        obj.setLocationRelativeTo(null); 
        obj.setVisible(true);
    }//GEN-LAST:event_ReserveSeatBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainsBtn;
    private javax.swing.JButton AllTrainsBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JButton EmployeeDetailsBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ReserveSeatBtn;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JButton UserDetailsBtn;
    private javax.swing.JButton ViewReservationsBtn;
    private javax.swing.JLabel WelcomeLab;
    // End of variables declaration//GEN-END:variables
}