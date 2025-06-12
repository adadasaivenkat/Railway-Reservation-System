package railway.reservation.system;

public class UserControlPanel extends javax.swing.JFrame
{
    private String luser;
    public UserControlPanel()
    {
        initComponents();
    }
    public UserControlPanel(String loginUser)
    {
        this();                                             // Call the default constructor to initialize GUI components
        luser = loginUser;
        String currentText = WelcomeLab.getText();     
        WelcomeLab.setText(currentText + " , " + loginUser+" ! "); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeLab = new javax.swing.JLabel();
        SearchTrainsBtn = new javax.swing.JButton();
        ViewTicketBtn = new javax.swing.JButton();
        ReserveSeatUserBtn = new javax.swing.JButton();
        CancelTicketBtn = new javax.swing.JButton();
        TittleLab = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLab.setFont(new java.awt.Font("Yrsa Medium", 1, 24)); // NOI18N
        WelcomeLab.setText("Welcome");
        getContentPane().add(WelcomeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        SearchTrainsBtn.setBackground(new java.awt.Color(204, 204, 204));
        SearchTrainsBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SearchTrainsBtn.setText("Search Trains");
        SearchTrainsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTrainsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTrainsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 216, -1));

        ViewTicketBtn.setBackground(new java.awt.Color(204, 204, 204));
        ViewTicketBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ViewTicketBtn.setText("View Ticket");
        ViewTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTicketBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 216, -1));

        ReserveSeatUserBtn.setBackground(new java.awt.Color(204, 204, 204));
        ReserveSeatUserBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ReserveSeatUserBtn.setText("Reserve Seat");
        ReserveSeatUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveSeatUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ReserveSeatUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 216, -1));

        CancelTicketBtn.setBackground(new java.awt.Color(204, 204, 204));
        CancelTicketBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CancelTicketBtn.setText("Cancel Ticket");
        CancelTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelTicketBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 216, -1));

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("User Dashboard");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 530, -1));

        LogOutBtn.setBackground(new java.awt.Color(204, 255, 204));
        LogOutBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        LogOutBtn.setText("Log out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 130, -1));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BackBtn.setText(" Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 140, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/UserControlPanel.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTicketBtnActionPerformed
        dispose();
        ViewTicket obj=new ViewTicket();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_ViewTicketBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        dispose();
        MainScreen obj=new MainScreen();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        UserLogin obj=new UserLogin();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SearchTrainsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTrainsBtnActionPerformed
        dispose();
        SearchTrains obj=new SearchTrains();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_SearchTrainsBtnActionPerformed

    private void CancelTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelTicketBtnActionPerformed
        dispose();
        CancelTicket obj=new CancelTicket();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_CancelTicketBtnActionPerformed

    private void ReserveSeatUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveSeatUserBtnActionPerformed
        dispose();
        ReserveSeatUser obj=new ReserveSeatUser();
        obj.setLocationRelativeTo(null); 
        obj.setVisible(true);
    }//GEN-LAST:event_ReserveSeatUserBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JButton CancelTicketBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ReserveSeatUserBtn;
    private javax.swing.JButton SearchTrainsBtn;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JButton ViewTicketBtn;
    private javax.swing.JLabel WelcomeLab;
    // End of variables declaration//GEN-END:variables
}