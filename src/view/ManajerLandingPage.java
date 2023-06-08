/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ManajerLandingPage extends javax.swing.JFrame {

    /**
     * Creates new form ManajerLandingPage
     */
    public ManajerLandingPage() {
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

        Header = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        pagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CSButton = new javax.swing.JButton();
        TellerButton = new javax.swing.JButton();
        BOButton = new javax.swing.JButton();
        logoCS = new javax.swing.JLabel();
        logoTeller = new javax.swing.JLabel();
        logoBO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(51, 51, 255));

        HeaderTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("Manager Page");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo cba.png"))); // NOI18N

        logoutButton.setBackground(new java.awt.Color(255, 0, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(HeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(81, 81, 81))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HeaderTitle)
                        .addComponent(logoutButton)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pagePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DASHBOARD");

        CSButton.setBackground(new java.awt.Color(51, 102, 255));
        CSButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CSButton.setForeground(new java.awt.Color(255, 255, 255));
        CSButton.setText("Customer Service");
        CSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSButtonActionPerformed(evt);
            }
        });

        TellerButton.setBackground(new java.awt.Color(51, 102, 255));
        TellerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TellerButton.setForeground(new java.awt.Color(255, 255, 255));
        TellerButton.setText("Teller");
        TellerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TellerButtonActionPerformed(evt);
            }
        });

        BOButton.setBackground(new java.awt.Color(51, 102, 255));
        BOButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOButton.setForeground(new java.awt.Color(255, 255, 255));
        BOButton.setText("Back Officer");
        BOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOButtonActionPerformed(evt);
            }
        });

        logoCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/CS logo.png"))); // NOI18N

        logoTeller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo teller.png"))); // NOI18N

        logoBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo backoffice.png"))); // NOI18N

        javax.swing.GroupLayout pagePanelLayout = new javax.swing.GroupLayout(pagePanel);
        pagePanel.setLayout(pagePanelLayout);
        pagePanelLayout.setHorizontalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoCS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoTeller, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoBO, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOButton)
                    .addComponent(TellerButton)
                    .addComponent(CSButton))
                .addGap(469, 469, 469))
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(logoCS))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(CSButton)))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logoTeller))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(TellerButton)))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BOButton))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(logoBO)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin LOGOUT?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Berhasil LOGOUT!");
            LoginPage l = new LoginPage();
            ManajerLandingPage m = new ManajerLandingPage();
            
            l.setVisible(true);
            m.setVisible(false);
            dispose();
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Batal LOGOUT!");
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void CSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSButtonActionPerformed
        ManajerCSPage c = new ManajerCSPage();
        ManajerLandingPage m = new ManajerLandingPage();
        
        c.setVisible(true);
        m.setVisible(false);
        dispose();
    }//GEN-LAST:event_CSButtonActionPerformed

    private void TellerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TellerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TellerButtonActionPerformed

    private void BOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManajerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajerLandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOButton;
    private javax.swing.JButton CSButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton TellerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoBO;
    private javax.swing.JLabel logoCS;
    private javax.swing.JLabel logoTeller;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel pagePanel;
    // End of variables declaration//GEN-END:variables
}
