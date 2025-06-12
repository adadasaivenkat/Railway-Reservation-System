package railway.reservation.system;

import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class SearchTrains extends javax.swing.JFrame
{
    public SearchTrains()
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
        SearchLab = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setText("Search Trains");

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

        SearchLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SearchLab.setForeground(new java.awt.Color(204, 0, 51));
        SearchLab.setText("Search");

        SearchField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(ShowDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(DataScrollPane)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(TittleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchLab, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TittleLab)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(DataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBtn)
                    .addComponent(ShowDataBtn))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        DataTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_ClearBtnActionPerformed

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
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();                           // rsmd=Result Set Meta Data
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
        UserControlPanel obj=new UserControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
        DefaultTableModel obj=(DefaultTableModel) DataTable.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        DataTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(SearchField.getText()));
    }//GEN-LAST:event_SearchFieldKeyReleased

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchTrains().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JScrollPane DataScrollPane;
    private javax.swing.JTable DataTable;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel SearchLab;
    private javax.swing.JButton ShowDataBtn;
    private javax.swing.JLabel TittleLab;
    // End of variables declaration//GEN-END:variables
}