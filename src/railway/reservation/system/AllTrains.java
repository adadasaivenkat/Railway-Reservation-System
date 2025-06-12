package railway.reservation.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class AllTrains extends javax.swing.JFrame
{
    public AllTrains()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowDataBtn = new javax.swing.JButton();
        TittleLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        DataScrollPane = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowDataBtn.setBackground(new java.awt.Color(255, 204, 51));
        ShowDataBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ShowDataBtn.setText("Show Data");
        ShowDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ShowDataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 160, -1));

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("All Trains");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, -1));

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

        DataTable.setBackground(new java.awt.Color(153, 153, 153));
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DataScrollPane.setViewportView(DataTable);

        getContentPane().add(DataScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 500));

        ClearBtn.setBackground(new java.awt.Color(102, 255, 255));
        ClearBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 670, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataBtnActionPerformed
        String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
        String usernameDB = "saivenkatadada";
        String passwordDB = "2005@Sv";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String sq = "SELECT * FROM trains"; 
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sq);
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) DataTable.getModel();
            int cols=rsmd.getColumnCount();
            String [] colName=new String[cols];
            for(int i=1; i<=cols; i++) 
            { 
                colName[i-1]=rsmd.getColumnName(i); 
            }
            model.setColumnIdentifiers(colName);
            while (rs.next())
            {
                String SNo = String.valueOf(rs.getInt("s_no"));
                String trainName = rs.getString("train_name");
                String trainID = rs.getString("train_no");
                String source = rs.getString("source");
                String destination = rs.getString("destination");
                String SETime = rs.getString("start_time_end_time");
                String service = rs.getString("service");
                String generalPrice = rs.getString("general_price");
                String sleeperPrice = rs.getString("sleeper_price");
                String[] row = {SNo, trainName, trainID, source, destination, SETime, service, generalPrice, sleeperPrice};
                model.addRow(row);
            }
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_ShowDataBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        AdminControlPanel obj=new AdminControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        DataTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_ClearBtnActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllTrains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JScrollPane DataScrollPane;
    private javax.swing.JTable DataTable;
    private javax.swing.JButton ShowDataBtn;
    private javax.swing.JLabel TittleLab;
    // End of variables declaration//GEN-END:variables
}