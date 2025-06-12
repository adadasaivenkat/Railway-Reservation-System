package railway.reservation.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ViewReservations extends javax.swing.JFrame
{
    public ViewReservations()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        DataScrollPane = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        ShowDataBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("Reservations");

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BackBtn.setText("<- Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        DataTable.setBackground(new java.awt.Color(153, 153, 153));
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DataScrollPane.setViewportView(DataTable);

        ShowDataBtn.setBackground(new java.awt.Color(255, 204, 51));
        ShowDataBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ShowDataBtn.setText("Show Data");
        ShowDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(102, 255, 255));
        ClearBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(ShowDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addComponent(DataScrollPane)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TittleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackBtn)
                .addGap(13, 13, 13)
                .addComponent(TittleLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowDataBtn)
                    .addComponent(ClearBtn))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        AdminControlPanel obj=new AdminControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ShowDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataBtnActionPerformed
        String databaseURL = "jdbc:mysql://localhost:3306/asv_info_admin_railway";
        String usernameDB = "saivenkatadada";
        String passwordDB = "2005@Sv";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(databaseURL, usernameDB, passwordDB);
            String sq = "SELECT s_no, ticket_no, name, age, gender, train_no, berth, price FROM reservation"; 
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
                String ticketNo = rs.getString("ticket_no");
                String Name = rs.getString("name");
                String Age = rs.getString("age");
                String Gender = rs.getString("gender");
                String trainNo = rs.getString("train_no");
                String Berth = rs.getString("berth");
                String Price = rs.getString("price");
                String[] row = {SNo, ticketNo, Name, Age, Gender, trainNo, Berth, Price};
                model.addRow(row);
            }
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_ShowDataBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        DataTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_ClearBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReservations().setVisible(true);
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