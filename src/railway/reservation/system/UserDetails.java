package railway.reservation.system;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class UserDetails extends javax.swing.JFrame 
{
    public UserDetails()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ShowDataBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        DataScrollPane = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("User Details");

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BackBtn.setText("<- Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

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

        DataTable.setBackground(new java.awt.Color(153, 153, 153));
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DataScrollPane.setViewportView(DataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(ShowDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(TittleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(DataScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TittleLab))
                    .addComponent(BackBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(DataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBtn)
                    .addComponent(ShowDataBtn))
                .addGap(37, 37, 37))
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
            String sq = "SELECT s_no, firstname, lastname, username, emailid, phoneno FROM users";     
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
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String userName = rs.getString("username");
                String emailId = rs.getString("emailid");
                String phoneno = rs.getString("phoneno");
                String[] row = {SNo, firstName, lastName, userName, emailId, phoneno};
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
                new UserDetails().setVisible(true);
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