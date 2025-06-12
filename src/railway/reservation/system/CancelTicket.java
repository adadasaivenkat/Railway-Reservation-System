package railway.reservation.system;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CancelTicket extends javax.swing.JFrame
{
    public CancelTicket()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        TicketNoField = new javax.swing.JTextField();
        TicketNoLab = new javax.swing.JLabel();
        NameLab = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 95)); // NOI18N
        TittleLab.setText("Cancel ticket");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 530, -1));

        NameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 360, -1));

        TicketNoField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(TicketNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 360, -1));

        TicketNoLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        TicketNoLab.setForeground(new java.awt.Color(255, 255, 0));
        TicketNoLab.setText("Ticket No");
        getContentPane().add(TicketNoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 40));

        NameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        NameLab.setForeground(new java.awt.Color(255, 255, 0));
        NameLab.setText("Name");
        getContentPane().add(NameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 120, 40));

        CancelBtn.setBackground(new java.awt.Color(204, 255, 204));
        CancelBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 150, -1));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BackBtn.setText(" Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 140, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 0, 51));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, 140, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/CancelTicket.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
            String usernameDB = "saivenkatadada";
            String passwordDB = "2005@Sv";
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String ticketNo = TicketNoField.getText(); 
            String name = NameField.getText(); 
            String dq = "DELETE FROM reservation WHERE ticket_no = ? AND name = ?";            // dq=Delete Query , dt=Delete Statement
            PreparedStatement dt = con.prepareStatement(dq);
            dt.setString(1, ticketNo);
            dt.setString(2, name);
            int RowsAffected = dt.executeUpdate();
            // Check if the ticket was successfully cancelled
            if (RowsAffected > 0)
            {
                JOptionPane.showMessageDialog(this, "Ticket with ticket number " + ticketNo + " and name " + name + " has been successfully cancelled.", "Cancellation Successful", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserControlPanel obj=new UserControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No ticket found with the provided ticket number and name.", "Error", JOptionPane.ERROR_MESSAGE);
                dispose();
                UserControlPanel obj=new UserControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            // Close resources
            dt.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        UserControlPanel obj=new UserControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        NameField.setText(""); 
        TicketNoField.setText(""); 
    }//GEN-LAST:event_ResetBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTicket().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLab;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField TicketNoField;
    private javax.swing.JLabel TicketNoLab;
    private javax.swing.JLabel TittleLab;
    // End of variables declaration//GEN-END:variables
}