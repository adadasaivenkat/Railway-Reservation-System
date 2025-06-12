package railway.reservation.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ReserveSeatUser extends javax.swing.JFrame 
{
    public ReserveSeatUser()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ContinueBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        AgeField = new javax.swing.JTextField();
        GenderField = new javax.swing.JTextField();
        NameLab = new javax.swing.JLabel();
        AgeLab = new javax.swing.JLabel();
        BerthLab = new javax.swing.JLabel();
        GenderLab = new javax.swing.JLabel();
        TrainIDLab = new javax.swing.JLabel();
        TrainIDField = new javax.swing.JTextField();
        BerthField = new javax.swing.JTextField();
        TypeG_SLab = new javax.swing.JLabel();
        GCheckBox = new javax.swing.JCheckBox();
        SCheckBox = new javax.swing.JCheckBox();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("Reserve Seat");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 437, -1));

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

        ContinueBtn.setBackground(new java.awt.Color(0, 255, 51));
        ContinueBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ContinueBtn.setText("Continue");
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ContinueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 160, -1));

        CancelBtn.setBackground(new java.awt.Color(102, 255, 255));
        CancelBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 160, -1));

        NameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 220, -1));

        AgeField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(AgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 220, -1));

        GenderField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(GenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 220, -1));

        NameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        NameLab.setForeground(new java.awt.Color(255, 255, 0));
        NameLab.setText("Name");
        getContentPane().add(NameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 120, 40));

        AgeLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        AgeLab.setForeground(new java.awt.Color(255, 255, 0));
        AgeLab.setText("Age");
        getContentPane().add(AgeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        BerthLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BerthLab.setForeground(new java.awt.Color(255, 255, 0));
        BerthLab.setText("Berth");
        getContentPane().add(BerthLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        GenderLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        GenderLab.setForeground(new java.awt.Color(255, 255, 0));
        GenderLab.setText("Gender");
        getContentPane().add(GenderLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        TrainIDLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        TrainIDLab.setForeground(new java.awt.Color(255, 255, 0));
        TrainIDLab.setText("Train ID");
        getContentPane().add(TrainIDLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        TrainIDField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(TrainIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 220, -1));

        BerthField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(BerthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 220, -1));

        TypeG_SLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        TypeG_SLab.setForeground(new java.awt.Color(255, 255, 0));
        TypeG_SLab.setText("Type");
        getContentPane().add(TypeG_SLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 70, -1));

        GCheckBox.setBackground(new java.awt.Color(255, 153, 153));
        GCheckBox.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        GCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        GCheckBox.setText("General");
        GCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(GCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, -1, -1));

        SCheckBox.setBackground(new java.awt.Color(255, 153, 153));
        SCheckBox.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SCheckBox.setText("Sleeper");
        SCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));

        BackLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BackLab.setForeground(new java.awt.Color(255, 255, 0));
        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/ReserveSeatUser.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        UserControlPanel obj=new UserControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        String trainID = TrainIDField.getText();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
            String usernameDB = "saivenkatadada";
            String passwordDB = "2005@Sv";
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String sq = "SELECT general_price, sleeper_price FROM trains WHERE train_no = ?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1, trainID);
            ResultSet rs = st.executeQuery();
            if (!rs.next())
            {
                // Train ID is not valid
                JOptionPane.showMessageDialog(this, "No train exists with the provided train ID. Please try with a valid train ID.", "Message", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserControlPanel obj = new UserControlPanel();
                obj.setLocationRelativeTo(null); 
                obj.setVisible(true);
            } 
            else
            {
                // Determine which price to use based on checkbox selection
                boolean GSel = GCheckBox.isSelected();                              // GSel=Is General Selected? 
                // Get Result Set Meta Data
                ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                int numcols = rsmd.getColumnCount();
                int generalPriceIndex = -1;
                int sleeperPriceIndex = -1;
                // Find the indices of general_price and sleeper_price columns
                for (int i = 1; i <= numcols; i++)
                {
                    String colName = rsmd.getColumnName(i);
                    if (colName.equalsIgnoreCase("general_price"))
                    {
                        generalPriceIndex = i;
                    }
                    else if (colName.equalsIgnoreCase("sleeper_price"))
                    {
                        sleeperPriceIndex = i;
                    }
                }
                int price = 0;
                if (GSel && generalPriceIndex != -1)
                {
                    price = rs.getInt(generalPriceIndex);
                }
                else if (!GSel && sleeperPriceIndex != -1)
                {
                    price = rs.getInt(sleeperPriceIndex);
                }
                if (price > 0)
                {
                    String Name = NameField.getText();
                    String Age = AgeField.getText();
                    String Gender = GenderField.getText();
                    String Berth = BerthField.getText();
                    // Generate a random ticket number
                    Random rand = new Random();
                    int ticketNo = rand.nextInt(1000000);       // Generates a random number between 0 to 999999
                    try
                    {
                        // iq=Insert Query, it=Insert Statement
                        String iq = "INSERT INTO reservation (ticket_no, name, age, gender, train_no, berth, price) VALUES (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement it = con.prepareStatement(iq);
                        it.setInt(1, ticketNo);                 // Set the randomly generated ticket number
                        it.setString(2, Name);
                        it.setString(3, Age);
                        it.setString(4, Gender);
                        it.setString(5, trainID);
                        it.setString(6, Berth);
                        it.setInt(7, price);                    // Set the price based on checkbox selection
                        int temp = it.executeUpdate();
                        if (temp == 1)
                        {
                            // Seat reserved successfully, now prompt the user to confirm the payment
                            int PaymentConfirm = JOptionPane.showConfirmDialog(this, "Your seat has been reserved." + "\nPrice : " + price + " Rupees" + "\nConfirm payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION);
                            if (PaymentConfirm == JOptionPane.YES_OPTION)
                            {
                                dispose(); 
                                MakePayment obj = new MakePayment(ticketNo, price);
                                obj.setLocationRelativeTo(null);
                                obj.setVisible(true);
                            } 
                            else
                            {
                                // Payment not confirmed
                                JOptionPane.showMessageDialog(this, "Payment not confirmed. Your reservation will be cancelled.", "Payment Cancellation", JOptionPane.WARNING_MESSAGE);
                                // Rollback the reservation by deleting the entry from the database
                                String dq = "DELETE FROM reservation WHERE ticket_no = ?";
                                PreparedStatement dt = con.prepareStatement(dq);
                                dt.setInt(1, ticketNo);
                                dt.executeUpdate();
                                dt.close();
                                con.close();
                                dispose();
                                UserControlPanel obj = new UserControlPanel();
                                obj.setLocationRelativeTo(null); 
                                obj.setVisible(true);
                            }
                        }
                        it.close();
                    }
                    catch (SQLException e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                }
                else
                {
                    JOptionPane.showConfirmDialog(this, "No train exists with the provided train ID. Please try with a valid train ID.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    UserControlPanel obj = new UserControlPanel();
                    obj.setLocationRelativeTo(null); 
                    obj.setVisible(true);
                }
            }
            rs.close();
            st.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        NameField.setText("");
        AgeField.setText("");
        GenderField.setText("");
        TrainIDField.setText("");
        BerthField.setText("");
        GCheckBox.setSelected(false); 
        SCheckBox.setSelected(false); 
        dispose();
        UserControlPanel obj=new UserControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void GCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GCheckBoxActionPerformed
        SCheckBox.setSelected(false); 
    }//GEN-LAST:event_GCheckBoxActionPerformed

    private void SCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCheckBoxActionPerformed
        GCheckBox.setSelected(false); 
    }//GEN-LAST:event_SCheckBoxActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveSeat().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeLab;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JTextField BerthField;
    private javax.swing.JLabel BerthLab;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ContinueBtn;
    private javax.swing.JCheckBox GCheckBox;
    private javax.swing.JTextField GenderField;
    private javax.swing.JLabel GenderLab;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLab;
    private javax.swing.JCheckBox SCheckBox;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JTextField TrainIDField;
    private javax.swing.JLabel TrainIDLab;
    private javax.swing.JLabel TypeG_SLab;
    // End of variables declaration//GEN-END:variables
}