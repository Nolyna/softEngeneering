/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelGUI;

import HSMmodel.employee;
import hotelGUI.employeeGUI.ClockPanel;
import hotelGUI.employeeGUI.HoursPanel;
import hotelGUI.employeeGUI.KitchenStockPanel;
import hotelGUI.employeeGUI.MaintenanceDutiesPanel;
import hotelGUI.employeeGUI.ProfilePanel;
import hotelGUI.employeeGUI.cleaningDutiesPanel;
import hotelGUI.employeeGUI.deliveriesDutiesPanel;
import hotelGUI.employeeGUI.kitchenFoodPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Noria Soumbou, jermaine anderson
 */
public class EmployeePage extends javax.swing.JFrame {
    public static employee emp = new employee();
    GridBagLayout layout = new GridBagLayout();
    final ClockPanel clockView; 
    final ProfilePanel  profileView;
    final HoursPanel  hoursView;
    final MaintenanceDutiesPanel maintenanceDuties;
    final deliveriesDutiesPanel deliveriesDuties;
    final cleaningDutiesPanel cleaningDuties;
    final KitchenStockPanel kitchenStock;
    final kitchenFoodPanel menuView;
    
    /**
     * Creates new form EmployeeGUI
     * @param email employee email use to log in
     */
    public EmployeePage( String email) {
        initComponents();
        emp.setemail(email);
        emp.getEmployeeByEmail();
        this.setTitle(" Hello "+ emp.getfullname());
        
        clockView =  new ClockPanel(emp.getid());
        profileView = new ProfilePanel();
        hoursView = new HoursPanel();
        menuView = new kitchenFoodPanel();
        maintenanceDuties = new MaintenanceDutiesPanel();
        deliveriesDuties = new deliveriesDutiesPanel();
        cleaningDuties = new cleaningDutiesPanel();
        kitchenStock = new KitchenStockPanel();
        contentPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(profileView,c);
        profileView.setVisible(false);
        
         c.gridx = 0; c.gridy = 0;        
        contentPanel.add(menuView,c);
        menuView.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(clockView,c);
        clockView.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(hoursView,c);
        hoursView.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(maintenanceDuties,c);
        maintenanceDuties.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(deliveriesDuties,c);
        deliveriesDuties.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(cleaningDuties,c);
        cleaningDuties.setVisible(false);
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(kitchenStock,c);
        kitchenStock.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        profileMenu = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        dutiesMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        clockMenu = new javax.swing.JMenuItem();
        hoursMenu = new javax.swing.JMenuItem();
        kitchenMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        hitchenfood = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("User");

        profileMenu.setText("Profile");
        profileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileMenuActionPerformed(evt);
            }
        });
        jMenu1.add(profileMenu);

        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        dutiesMenu.setText("Duties");
        dutiesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dutiesMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(dutiesMenu);

        jMenu3.setText("Time");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        clockMenu.setText("clock in / clock out");
        clockMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockMenuActionPerformed(evt);
            }
        });
        jMenu3.add(clockMenu);

        hoursMenu.setText("hours summary");
        hoursMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursMenuActionPerformed(evt);
            }
        });
        jMenu3.add(hoursMenu);

        jMenuBar1.add(jMenu3);

        kitchenMenu.setText("Kitchen");

        jMenuItem2.setText("Stock");
        kitchenMenu.add(jMenuItem2);

        hitchenfood.setText("menu Gestion");
        hitchenfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitchenfoodActionPerformed(evt);
            }
        });
        kitchenMenu.add(hitchenfood);

        jMenuBar1.add(kitchenMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileMenuActionPerformed
        // TODO add your handling code here:
        profileView.setVisible(true);
        hoursView.setVisible(false);
        clockView.setVisible(false);
        menuView.setVisible(false);
        cleaningDuties.setVisible(false);
        maintenanceDuties.setVisible(false);
        deliveriesDuties.setVisible(false);
        kitchenStock.setVisible(false);
    }//GEN-LAST:event_profileMenuActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        /*/ TODO add your handling code here:
        clockView.setVisible(true);
        hoursView.setVisible(false);
        profileView.setVisible(false);
        menuView.setVisible(false);
        cleaningDuties.setVisible(false);
        maintenanceDuties.setVisible(false);
        deliveriesDuties.setVisible(false);
        kitchenStock.setVisible(false);*/
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void hoursMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursMenuActionPerformed
        // TODO add your handling code here:
        hoursView.setVisible(true);
        menuView.setVisible(false);
        clockView.setVisible(false);
        profileView.setVisible(false);
        cleaningDuties.setVisible(false);
        maintenanceDuties.setVisible(false);
        deliveriesDuties.setVisible(false);
        kitchenStock.setVisible(false);
    }//GEN-LAST:event_hoursMenuActionPerformed

    private void clockMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockMenuActionPerformed
        // TODO add your handling code here:
        clockView.setVisible(true);
        menuView.setVisible(false);
        hoursView.setVisible(false);
        profileView.setVisible(false);
        cleaningDuties.setVisible(false);
        maintenanceDuties.setVisible(false);
        deliveriesDuties.setVisible(false);
        kitchenStock.setVisible(false);
    }//GEN-LAST:event_clockMenuActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here: logout user
        this.dispose();
        new welcomePage().setVisible(true);   
    }//GEN-LAST:event_logoutActionPerformed

    private void hitchenfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitchenfoodActionPerformed
        // TODO add your handling code here:clockView.setVisible(true);
        menuView.setVisible(true);
        hoursView.setVisible(false);
        profileView.setVisible(false);
        cleaningDuties.setVisible(false);
        maintenanceDuties.setVisible(false);
        deliveriesDuties.setVisible(false);
        kitchenStock.setVisible(false);
    }//GEN-LAST:event_hitchenfoodActionPerformed

    private void dutiesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dutiesMenuActionPerformed
        int x = emp.getEmployeeDepartmentId();
        switch (x) {
            case 2:
                maintenanceDuties.setVisible(true);
                break;
            case 3:
                break;
            case 4:
                deliveriesDuties.setVisible(true);
                break;
            case 5:
                cleaningDuties.setVisible(true);
                break;
            default:
                break;
        }
        menuView.setVisible(true);
        hoursView.setVisible(false);
        profileView.setVisible(false);        
        kitchenStock.setVisible(false);
    }//GEN-LAST:event_dutiesMenuActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clockMenu;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenu dutiesMenu;
    private javax.swing.JMenuItem hitchenfood;
    private javax.swing.JMenuItem hoursMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu kitchenMenu;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem profileMenu;
    // End of variables declaration//GEN-END:variables
}
