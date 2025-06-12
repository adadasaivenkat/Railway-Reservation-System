package railway.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddTrains extends javax.swing.JFrame {
    
    public AddTrains()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        TrainNameLab = new javax.swing.JLabel();
        TrainNameField = new javax.swing.JTextField();
        TrainIDLab = new javax.swing.JLabel();
        TrainIDField = new javax.swing.JTextField();
        SourceLab = new javax.swing.JLabel();
        SourceField = new javax.swing.JTextField();
        DestinationLab = new javax.swing.JLabel();
        DestinationField = new javax.swing.JTextField();
        SETimeLab = new javax.swing.JLabel();
        SETimeField = new javax.swing.JTextField();
        ServiceLab = new javax.swing.JLabel();
        ServiceField = new javax.swing.JTextField();
        GeneralPriceLab = new javax.swing.JLabel();
        GeneralPriceField = new javax.swing.JTextField();
        SleeperPriceLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        SleeperPriceField = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 60)); // NOI18N
        TittleLab.setText("Add Trains");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        TrainNameLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        TrainNameLab.setForeground(new java.awt.Color(255, 255, 0));
        TrainNameLab.setText("Train Name");
        getContentPane().add(TrainNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        TrainNameField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(TrainNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 235, -1));

        TrainIDLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        TrainIDLab.setForeground(new java.awt.Color(255, 255, 0));
        TrainIDLab.setText("Train ID");
        getContentPane().add(TrainIDLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 90, -1));

        TrainIDField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(TrainIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 235, -1));

        SourceLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SourceLab.setForeground(new java.awt.Color(255, 255, 0));
        SourceLab.setText("Source");
        getContentPane().add(SourceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        SourceField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(SourceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 235, -1));

        DestinationLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        DestinationLab.setForeground(new java.awt.Color(255, 255, 0));
        DestinationLab.setText("Destination");
        getContentPane().add(DestinationLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        DestinationField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(DestinationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 235, -1));

        SETimeLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SETimeLab.setForeground(new java.awt.Color(255, 255, 0));
        SETimeLab.setText("Start Time - End Time");
        getContentPane().add(SETimeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        SETimeField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(SETimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 235, -1));

        ServiceLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ServiceLab.setForeground(new java.awt.Color(255, 255, 0));
        ServiceLab.setText("Service");
        getContentPane().add(ServiceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        ServiceField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(ServiceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 235, -1));

        GeneralPriceLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        GeneralPriceLab.setForeground(new java.awt.Color(255, 255, 0));
        GeneralPriceLab.setText("General Price");
        getContentPane().add(GeneralPriceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));

        GeneralPriceField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(GeneralPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 235, -1));

        SleeperPriceLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SleeperPriceLab.setForeground(new java.awt.Color(255, 255, 0));
        SleeperPriceLab.setText("Sleeper Price");
        getContentPane().add(SleeperPriceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BackBtn.setText("<- Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, -1));

        SleeperPriceField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(SleeperPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 235, -1));

        AddBtn.setBackground(new java.awt.Color(204, 255, 204));
        AddBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 150, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 0, 51));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 150, -1));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/AddTrains.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        String trainName = TrainNameField.getText();
        String trainId = TrainIDField.getText();
        String source = SourceField.getText();
        String destination = DestinationField.getText();
        String SETime = SETimeField.getText();
        String service = ServiceField.getText();
        String generalPrice = GeneralPriceField.getText();
        String sleeperPrice = SleeperPriceField.getText();
        String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
        String usernameDB = "saivenkatadada";
        String passwordDB = "2005@Sv";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String sq = "SELECT COUNT(*) FROM trains WHERE train_no = ?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1, trainId);
            ResultSet rs = st.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count > 0)
            {
                JOptionPane.showMessageDialog(this, "A train with the provided ID already exists. Please try again.","Duplicate Entry!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                AdminControlPanel obj=new AdminControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            String iq = "INSERT INTO trains (train_name, train_no, source, destination, start_time_end_time, service, general_price, sleeper_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement it = con.prepareStatement(iq);
            it.setString(1, trainName);
            it.setString(2, trainId);
            it.setString(3, source);
            it.setString(4, destination);  
            it.setString(5, SETime);
            it.setString(6, service);
            it.setString(7, generalPrice);
            it.setString(8, sleeperPrice);
            int temp = it.executeUpdate();
            if (temp == 1)
            {
                JOptionPane.showMessageDialog(this, "Added Successfully.","Message", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                AdminControlPanel obj=new AdminControlPanel();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
            // Close resources
            it.close();
            st.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        AdminControlPanel obj=new AdminControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        TrainNameField.setText("");
        TrainIDField.setText("");  
        SourceField.setText("");  
        DestinationField.setText("");  
        SETimeField.setText("");
        ServiceField.setText("");  
        GeneralPriceField.setText("");  
        SleeperPriceField.setText("");  
    }//GEN-LAST:event_ResetBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JTextField DestinationField;
    private javax.swing.JLabel DestinationLab;
    private javax.swing.JTextField GeneralPriceField;
    private javax.swing.JLabel GeneralPriceLab;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField SETimeField;
    private javax.swing.JLabel SETimeLab;
    private javax.swing.JTextField ServiceField;
    private javax.swing.JLabel ServiceLab;
    private javax.swing.JTextField SleeperPriceField;
    private javax.swing.JLabel SleeperPriceLab;
    private javax.swing.JTextField SourceField;
    private javax.swing.JLabel SourceLab;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JTextField TrainIDField;
    private javax.swing.JLabel TrainIDLab;
    private javax.swing.JTextField TrainNameField;
    private javax.swing.JLabel TrainNameLab;
    // End of variables declaration//GEN-END:variables
}
