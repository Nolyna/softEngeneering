/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelGUI;

import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Jermaine
 */
public class employeeLogInPage extends javax.swing.JFrame {
    
 
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    
   // public void open (String input){
   //     input obj = new input();
   //     obj.setVisible(true);
   // }

    /**
     * Creates new form managerLogIn
     */
    public employeeLogInPage() {
        initComponents();
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
        txtManager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        fieldPasswordManager = new javax.swing.JPasswordField();
        buttonLogIn = new javax.swing.JButton();
        buttonBackManagerLogIn = new javax.swing.JButton();
        buttonRoomServices = new javax.swing.JButton();
        buttonKitchen = new javax.swing.JButton();
        buttonMaintenance = new javax.swing.JButton();
        buttonRep = new javax.swing.JButton();
        buttonCleaningServices = new javax.swing.JButton();
        buttonManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtManager.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        txtManager.setText("Log-In");

        jLabel1.setText("Employee ID");

        jLabel2.setText("Password");

        fieldPasswordManager.setText("jPrdField1");
        fieldPasswordManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordManagerActionPerformed(evt);
            }
        });

        buttonLogIn.setText("Log-In");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        buttonBackManagerLogIn.setText("Back");
        buttonBackManagerLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackManagerLogInActionPerformed(evt);
            }
        });

        buttonRoomServices.setText("Room Services");
        buttonRoomServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRoomServicesActionPerformed(evt);
            }
        });

        buttonKitchen.setText("Kitchen");
        buttonKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKitchenActionPerformed(evt);
            }
        });

        buttonMaintenance.setText("Maintenance");
        buttonMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMaintenanceActionPerformed(evt);
            }
        });

        buttonRep.setText("Rep");
        buttonRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRepActionPerformed(evt);
            }
        });

        buttonCleaningServices.setText("Cleaning Services");
        buttonCleaningServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleaningServicesActionPerformed(evt);
            }
        });

        buttonManager.setText("Manager");
        buttonManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldID)
                                    .addComponent(fieldPasswordManager, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonBackManagerLogIn)
                                .addComponent(buttonLogIn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(txtManager)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonKitchen)
                    .addComponent(buttonRoomServices)
                    .addComponent(buttonMaintenance)
                    .addComponent(buttonRep)
                    .addComponent(buttonCleaningServices)
                    .addComponent(buttonManager))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtManager)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fieldPasswordManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonLogIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBackManagerLogIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(buttonRoomServices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonKitchen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMaintenance)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCleaningServices)
                        .addGap(18, 18, 18)
                        .addComponent(buttonManager)))
                .addContainerGap(412, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1350, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldPasswordManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordManagerActionPerformed

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonBackManagerLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackManagerLogInActionPerformed
        // TODO add your handling code here:
        memberLogInPage obj = new memberLogInPage();
        obj.setVisible(true);
        close();
    }//GEN-LAST:event_buttonBackManagerLogInActionPerformed

    private void buttonKitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKitchenActionPerformed
        // TODO add your handling code here:
        kitchenPage obj = new kitchenPage();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonKitchenActionPerformed

    private void buttonMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMaintenanceActionPerformed
        // TODO add your handling code here:
        maintenancePage obj = new maintenancePage();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonMaintenanceActionPerformed

    private void buttonRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRepActionPerformed
        // TODO add your handling code here:
        repPage obj = new repPage();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonRepActionPerformed

    private void buttonCleaningServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleaningServicesActionPerformed
        // TODO add your handling code here:
        cleaningServicesPage obj = new cleaningServicesPage();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonCleaningServicesActionPerformed

    private void buttonManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManagerActionPerformed
        // TODO add your handling code here:
        managerPg obj = new managerPg();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonManagerActionPerformed

    private void buttonRoomServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRoomServicesActionPerformed
        // TODO add your handling code here:
        roomServicesPage obj = new roomServicesPage();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonRoomServicesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(employeeLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeLogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeLogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBackManagerLogIn;
    private javax.swing.JButton buttonCleaningServices;
    private javax.swing.JButton buttonKitchen;
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JButton buttonMaintenance;
    private javax.swing.JButton buttonManager;
    private javax.swing.JButton buttonRep;
    private javax.swing.JButton buttonRoomServices;
    private javax.swing.JTextField fieldID;
    private javax.swing.JPasswordField fieldPasswordManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtManager;
    // End of variables declaration//GEN-END:variables
}