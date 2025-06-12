package railway.reservation.system;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ViewTicket extends javax.swing.JFrame
{
    public ViewTicket()
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
        ViewBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 95)); // NOI18N
        TittleLab.setText("View ticket");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 480, -1));

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

        ViewBtn.setBackground(new java.awt.Color(204, 255, 204));
        ViewBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 150, -1));

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

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/ViewTicket.jpg")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
            String usernameDB = "saivenkatadada";
            String passwordDB = "2005@Sv";
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String ticketNo = TicketNoField.getText(); 
            String Name = NameField.getText(); 
            String sq = "SELECT * FROM reservation WHERE ticket_no = ? AND name = ?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1, ticketNo);
            st.setString(2, Name);
            ResultSet rs = st.executeQuery();
            // Check if ticket details were found
            if (rs.next())
            {
                // Ticket details found, display the details
                String TicketDetails = "Ticket Number : " + rs.getString("ticket_no") + "\n" +
                                       "Name : " + rs.getString("name") + "\n" +
                                       "Age : " + rs.getString("age") + "\n" +
                                       "Gender : " + rs.getString("gender") + "\n" +
                                       "Train Number : " + rs.getString("train_no") + "\n" +
                                       "Berth : " + rs.getString("berth") + "\n" +
                                       "Price : " + rs.getInt("price") + "\n";
                JOptionPane.showMessageDialog(this, TicketDetails, "Ticket Details", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserControlPanel obj=new UserControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            else
            {
                // No ticket found with the provided ticket number and name
                JOptionPane.showMessageDialog(this, "No ticket found with the provided ticket number and name. Please enter valid information.", "Error", JOptionPane.ERROR_MESSAGE);
                dispose();
                UserControlPanel obj=new UserControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
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
    }//GEN-LAST:event_ViewBtnActionPerformed

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
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLab;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField TicketNoField;
    private javax.swing.JLabel TicketNoLab;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JButton ViewBtn;
    // End of variables declaration//GEN-END:variables
}