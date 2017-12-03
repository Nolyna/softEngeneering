package hotelGUI;

import HSMmodel.Client;
import HSMcontrollers.clientController;
import hotelGUI.clientGUI.*;
import hotelGUI.clientGUI.AmenityPanel;
import hotelGUI.clientGUI.EventPanel;
import hotelGUI.clientGUI.MaintenancePanel;
import hotelGUI.clientGUI.TourPanel;
import hotelGUI.clientGUI.TransportPanel;
import hotelGUI.clientGUI.WakePanel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  Main page for the residents of the hotel
 *  They can access all functions offer by the hotel using this screen
 * @author Jermaine, Noria Soumbou
 */
public class ClientPage extends javax.swing.JFrame {
    
    public static String clientEmail;
    public static Client client = new Client();
    public static clientController cc = new clientController();
    public static int roomId;
    
    GridBagLayout layout = new GridBagLayout();
    MaintenancePanel MaintenanceView; 
    TransportPanel  transportView;
    WakePanel  wakeView;
    AmenityPanel  amenityView;
    TourPanel  tourView;
    EventPanel  eventView;

    /**
     * Constructor for client Page
     * @param mail
     */
    public ClientPage(String mail) {
        initComponents();
        client.setemails(mail);
        client.getClientByEmail();
        usernameLabel.setText(client.getName());
        roomId = client.getRoomId();
        init_panel();
       
    }
    
    /**
     * Constructor for client Page
     */
    public ClientPage() {
        initComponents();
        init_panel();        
    }
    
    private void init_panel(){
        MaintenanceView =  new MaintenancePanel(client.getid(), roomId);
        transportView = new TransportPanel();
        wakeView = new WakePanel(client.getName(), roomId);
        amenityView = new AmenityPanel(client.getid());
        tourView = new TourPanel();
        eventView = new EventPanel(client.getid());
        contentPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0; c.gridy = 0;        
        contentPanel.add(transportView,c);
        hide_panel(transportView);
        
        //c.gridx = 0; c.gridy = 0;        
        contentPanel.add(MaintenanceView,c);
        hide_panel(MaintenanceView);
        
        //c.gridx = 0; c.gridy = 0;        
        contentPanel.add(wakeView,c);
        hide_panel(wakeView);
        
        contentPanel.add(amenityView,c);
        hide_panel(amenityView);
        
        contentPanel.add(eventView,c);
        hide_panel(eventView);
        
        contentPanel.add(tourView,c);
        hide_panel(tourView);
    }
    
    private void click_bg_button(JLabel lbl){
        lbl.setBackground(new Color(22,42,57));
        lbl.setOpaque(true);
    }
    
    private void reset_bg_button( JLabel lbl){
        lbl.setBackground(new Color(23,63,86));
        lbl.setOpaque(false);
    }
    
    
    private void hide_panel(JPanel pnl){
        pnl.setVisible(false);
    }
    
    private void show_panel(JPanel pnl){
        pnl.setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        hoteName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        maitenanceLabel = new javax.swing.JLabel();
        foodLabel = new javax.swing.JLabel();
        tourLabel = new javax.swing.JLabel();
        eventLabel = new javax.swing.JLabel();
        wakeLabel = new javax.swing.JLabel();
        amenityLabel = new javax.swing.JLabel();
        transportLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        hoteName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hoteName.setText("AllSuites Hotel");

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(hoteName)
                .addGap(134, 134, 134)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoteName)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        menuPanel.setBackground(new java.awt.Color(23, 63, 86));

        maitenanceLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        maitenanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        maitenanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maitenanceLabel.setText(" Maintenance Request");
        maitenanceLabel.setToolTipText("");
        maitenanceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maitenanceLabelMouseClicked(evt);
            }
        });

        foodLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(255, 255, 255));
        foodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodLabel.setText("Order Food");
        foodLabel.setToolTipText("");
        foodLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodLabelMouseClicked(evt);
            }
        });

        tourLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tourLabel.setForeground(new java.awt.Color(255, 255, 255));
        tourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tourLabel.setText("Tours");
        tourLabel.setToolTipText("");
        tourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourLabelMouseClicked(evt);
            }
        });

        eventLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        eventLabel.setForeground(new java.awt.Color(255, 255, 255));
        eventLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventLabel.setText("Events");
        eventLabel.setToolTipText("");
        eventLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventLabelMouseClicked(evt);
            }
        });

        wakeLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        wakeLabel.setForeground(new java.awt.Color(255, 255, 255));
        wakeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wakeLabel.setText("Arrange A Wake Up Call");
        wakeLabel.setToolTipText("");
        wakeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wakeLabelMouseClicked(evt);
            }
        });

        amenityLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        amenityLabel.setForeground(new java.awt.Color(255, 255, 255));
        amenityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amenityLabel.setText("Amenities / Requests");
        amenityLabel.setToolTipText("");
        amenityLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amenityLabelMouseClicked(evt);
            }
        });

        transportLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        transportLabel.setForeground(new java.awt.Color(255, 255, 255));
        transportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transportLabel.setText("Transportation Services");
        transportLabel.setToolTipText("");
        transportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transportLabelMouseClicked(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 153, 0));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amenityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maitenanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(amenityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(maitenanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        headerPanel.setBackground(new java.awt.Color(23, 63, 86));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AllSuites Hotel");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(902, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new welcomePage().setVisible(true);  
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void maitenanceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maitenanceLabelMouseClicked
        // button:
        click_bg_button(maitenanceLabel); 
        reset_bg_button(foodLabel);
        reset_bg_button(eventLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(transportLabel);
        reset_bg_button(tourLabel);
        
        //panels:       
        MaintenanceView.setVisible(true); 
        transportView.setVisible(false);
        amenityView.setVisible(false);
        wakeView.setVisible(false);
        eventView.setVisible(false);
        tourView.setVisible(false);
    }//GEN-LAST:event_maitenanceLabelMouseClicked

    private void foodLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodLabelMouseClicked
        // button:
        click_bg_button(foodLabel);
        reset_bg_button(tourLabel);
        reset_bg_button(eventLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(transportLabel);
        
        //panels:
        new foodOrderPage().setVisible(true); 
        tourView.setVisible(false);
        transportView.setVisible(false);
        eventView.setVisible(false);
        MaintenanceView.setVisible(false);
        amenityView.setVisible(false);
        wakeView.setVisible(false);
    }//GEN-LAST:event_foodLabelMouseClicked

    private void tourLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourLabelMouseClicked
        // button:
        click_bg_button(tourLabel);
        reset_bg_button(foodLabel);
        reset_bg_button(eventLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(transportLabel);
        
        //panels:
        tourView.setVisible(true);  
        MaintenanceView.setVisible(false);
        eventView.setVisible(false);
        transportView.setVisible(false);
        amenityView.setVisible(false);
        wakeView.setVisible(false);
    }//GEN-LAST:event_tourLabelMouseClicked

    private void eventLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventLabelMouseClicked
        // button:
        click_bg_button(eventLabel);
        reset_bg_button(foodLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(transportLabel);
        reset_bg_button(tourLabel);
        //panels:
        eventView.setVisible(true);  
        amenityView.setVisible(false);
        MaintenanceView.setVisible(false);
        wakeView.setVisible(false);
        transportView.setVisible(false);
        tourView.setVisible(false);
    }//GEN-LAST:event_eventLabelMouseClicked

    private void wakeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wakeLabelMouseClicked
        // button:
        click_bg_button(wakeLabel);
        reset_bg_button(foodLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(tourLabel);
        reset_bg_button(eventLabel);
        reset_bg_button(transportLabel);
        //panels:
        wakeView.setVisible(true);
        eventView.setVisible(false);
        MaintenanceView.setVisible(false);
        transportView.setVisible(false);
        tourView.setVisible(false);
        amenityView.setVisible(false);
    }//GEN-LAST:event_wakeLabelMouseClicked

    private void amenityLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amenityLabelMouseClicked
        // buttons:
        click_bg_button(amenityLabel);
        reset_bg_button(foodLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(tourLabel);
        reset_bg_button(eventLabel);
        reset_bg_button(transportLabel);
        //panels:
        amenityView.setVisible(true);        
        MaintenanceView.setVisible(false);
        transportView.setVisible(false);
        wakeView.setVisible(false);// TODO add your handling code here:
        eventView.setVisible(false);
        tourView.setVisible(false);
    }//GEN-LAST:event_amenityLabelMouseClicked

    private void transportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportLabelMouseClicked
        // buttons:
        click_bg_button(transportLabel);
        reset_bg_button(amenityLabel);
        reset_bg_button(foodLabel);
        reset_bg_button(maitenanceLabel);
        reset_bg_button(wakeLabel);
        reset_bg_button(tourLabel);
        reset_bg_button(eventLabel);
        
        //panels:
        transportView.setVisible(true);
        MaintenanceView.setVisible(false);
        amenityView.setVisible(false);
        tourView.setVisible(false);
        wakeView.setVisible(false);
    }//GEN-LAST:event_transportLabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new welcomePage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amenityLabel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel hoteName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel maitenanceLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel tourLabel;
    private javax.swing.JLabel transportLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel wakeLabel;
    // End of variables declaration//GEN-END:variables
}
