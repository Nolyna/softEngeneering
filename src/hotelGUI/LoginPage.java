/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelGUI;

import HSMmodel.employee;
import dbConnexion.SQLiteJDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Noria Soumbou
 */
public class LoginPage extends javax.swing.JFrame {
    
    final private SQLiteJDBConnection db = new SQLiteJDBConnection();
    
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }
          
    public boolean clientLogin(JTextField email, JPasswordField psd  ){
        boolean found = false;
        String sql = "SELECT idClient FROM client where email = ? AND password = ?";
        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email.getText());
            pstmt.setString(2, new String(psd.getPassword()));
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("1:"+rs.getInt(1));
                if(rs.next()) {
                    found = true;
                    System.out.println("2:"+rs.getInt(1));
                }
                System.out.println("3:"+rs.getInt(1));
                //rs.close();
            }catch(SQLException e){ System.out.println("client check result: "+e.getMessage()); }            
            //pstmt.close();
            //conn.close();
        } catch (SQLException e) {
            System.out.println("select"+e.getMessage());
        }        
        return found;
    }
    
    public int employeeLogin(JTextField email, JPasswordField psd  ){
        int found = 0;
        String sql1 = "SELECT idEmployee FROM employee where email = ? AND password = ?";
        String sql2 = "SELECT * FROM manager where idEmployee = ?";
        
        try (Connection conn = db.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql1)) {
            pstmt.setString(1, email.getText());
            pstmt.setString(2, new String(psd.getPassword()));
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    //check if manager
                    try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)){
                        pstmt2.setInt(1, rs.getInt(1));
                        try (ResultSet rs2 = pstmt2.executeQuery()) {
                            if(rs2.next()) {
                                found = 2;
                            }else{
                                found = 1;
                            }
                        }
                    }catch (SQLException e) {
                        System.out.println(" manager error "+e.getMessage());
                    }  
                }
            }
            //pstmt.close();
            //conn.close();
        } catch (SQLException e) {
            System.out.println(" error "+e.getMessage());
        }        
        System.out.println("found "+ found);
        return found;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        txtManager = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        buttonLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtManager.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        txtManager.setText("Log-In");

        jLabel1.setText("Email");

        jLabel2.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        buttonLogIn.setText("Log-In");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(32, 32, 32)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addComponent(txtManager)
                            .addGap(109, 109, 109)))
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonLogIn)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtManager)
                .addGap(42, 42, 42)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonLogIn)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(passwordField.getPassword().length == 0 || emailfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter email and/or password");
        }else{
            if(clientLogin(emailfield,passwordField)){
                this.dispose();
                new ClientPage(emailfield.getText()).setVisible(true);
            }else{
                int x = employeeLogin(emailfield,passwordField);
                switch (x) {
                    case 2:
                        this.dispose();
                        new ManagerPage(emailfield.getText()).setVisible(true);
                        break;
                    case 1:
                        employee emp = new employee();
                        emp.setemail(emailfield.getText());
                        emp.getEmployeeByEmail();
                        int rep = emp.getEmployeeDepartmentId();
                        this.dispose();
                        if( rep == 6){
                            new ReceptionistPage(emailfield.getText()).setVisible(true);
                        }else{
                            new EmployeePage(emailfield.getText()).setVisible(true);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please try again! Email or password invalid");
                        break;
                }
            }        
                
        }
    }                                       

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel txtManager;
    // End of variables declaration                   
}
