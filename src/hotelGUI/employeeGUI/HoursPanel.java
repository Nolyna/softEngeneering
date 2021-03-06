/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelGUI.employeeGUI;

import dbConnexion.SQLiteJDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noria Soumbou
 */
public class HoursPanel extends javax.swing.JPanel {
private int eid;
    final private SQLiteJDBConnection db = new SQLiteJDBConnection();
    
    /**
     * Creates new form hoursPanel
     */
    public HoursPanel(int EID) {
        initComponents();
        eid = EID;
         fillTable();
         
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(() -> {
            fillTable(); 
        }, 0, 1, TimeUnit.MINUTES);
    }
    
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tableHoursWorked.getModel();
        model.setRowCount(0);
        String sql = "SELECT * FROM in_out where idEmployee = ? ";
        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, eid);
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                  String x =  totalhours(rs.getTime("checkin"), rs.getTime("checkout"), rs.getTime("breakin"), rs.getTime("breakout")); 
                  String y =  breakhours(rs.getTime("breakin"), rs.getTime("breakout")); 
                  model.addRow(new Object[]{ rs.getDate("dates").toString(), rs.getTime("checkin").toString(), rs.getTime("checkout"), x, y});
                  
                }
                rs.close();
            }catch(SQLException e){ System.out.println("all event: "+e.getMessage()); }            
            pstmt.close();
            //conn.close();
        } catch (SQLException e) {
            System.out.println("all event db"+e.getMessage());
        }
        //System.out.println(tableHoursWorked.getValueAt(1, 1));
        tableHoursWorked.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSearch2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHoursWorked = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtSearch2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtSearch2.setText("Clock ...");

        tableHoursWorked.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "In", "Out", "Total hours", "Break"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHoursWorked);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch2)
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch2)
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHoursWorked;
    private javax.swing.JLabel txtSearch2;
    // End of variables declaration//GEN-END:variables
    /**
     * 
     * @param t1 time in
     * @param t2
     * @param b1 break in
     * @param b2 break out
     * @return 
     */
    private String totalhours(Time t1, Time t2, Time b1, Time b2) {
        String total = "0 hours";
        long diff1 = b1.getTime() - t1.getTime();
        long diff2 = t2.getTime() - b2.getTime();
        long diff = (diff1 + diff2) / (60 * 60 * 1000) % 24;
        long diffMinutes = (diff1 + diff2) / (60 * 1000) % 60;
        System.out.print(diffMinutes + " minutes, ");
        total =  diff +" hours";
        return total;
    }

    private String breakhours(Time time, Time time0) {
       String total = "0 hours";
        long diff1 = time0.getTime() - time.getTime();
        long diff = (diff1 ) / (60 * 60 * 1000) % 24;
        long diffMinutes = diff / (60 * 1000) % 60;
        total = (diffMinutes + " minutes, ");
        //total =  diff +" hours";
        return total;
    }
}
