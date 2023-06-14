/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import table.TableTransaksi;
import control.TransaksiControl;

import exception.PasswordException;
import exception.UsernameException;
import exception.InvalidInputanKosongException;
import exception.InputKosongException;
import java.util.List;
import javax.swing.table.TableModel;
import model.Transaksi;

public class TellerLandingPage extends javax.swing.JFrame {

    private TransaksiControl tControl;
    
    List<Transaksi> listTransaksi;
    public TellerLandingPage() {
        tControl = new TransaksiControl();
        
        initComponents();
        showData();
    }
    
    public void showData(){
        tableTransaksi.setModel((TableModel) tControl.showTransaksi(""));
    }
    
    public void showDataBy(String query){
        tableTransaksi.setModel((TableModel) tControl.showTransaksiBy(query));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PagePanel = new javax.swing.JPanel();
        optionToDoCS = new javax.swing.JPanel();
        withdrawalPanel = new javax.swing.JPanel();
        regNasabahLabel = new javax.swing.JLabel();
        logoRegNasabah = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        depositPanel = new javax.swing.JPanel();
        rekeningLabel = new javax.swing.JLabel();
        logoDeposit = new javax.swing.JLabel();
        historiPanel = new javax.swing.JPanel();
        rekeningLabel1 = new javax.swing.JLabel();
        logoDeposit1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        findJtext = new javax.swing.JTextArea();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(51, 51, 255));

        HeaderTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("Teller Page");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo cba.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(HeaderTitle)
                .addContainerGap(965, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo)
                    .addComponent(HeaderTitle))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PagePanel.setBackground(new java.awt.Color(255, 255, 255));

        optionToDoCS.setBackground(new java.awt.Color(51, 51, 255));

        withdrawalPanel.setBackground(new java.awt.Color(51, 51, 255));
        withdrawalPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawalPanelMouseClicked(evt);
            }
        });

        regNasabahLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regNasabahLabel.setForeground(new java.awt.Color(255, 255, 255));
        regNasabahLabel.setText("WITHDRAWAL");

        logoRegNasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/withdrawal logo.png"))); // NOI18N

        javax.swing.GroupLayout withdrawalPanelLayout = new javax.swing.GroupLayout(withdrawalPanel);
        withdrawalPanel.setLayout(withdrawalPanelLayout);
        withdrawalPanelLayout.setHorizontalGroup(
            withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawalPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(logoRegNasabah)
                .addGap(36, 36, 36)
                .addComponent(regNasabahLabel)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        withdrawalPanelLayout.setVerticalGroup(
            withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalPanelLayout.createSequentialGroup()
                .addGroup(withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(withdrawalPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(regNasabahLabel))
                    .addGroup(withdrawalPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logoRegNasabah)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        logoutButton1.setBackground(new java.awt.Color(255, 0, 51));
        logoutButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton1.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton1.setText("LOGOUT");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        depositPanel.setBackground(new java.awt.Color(51, 51, 255));
        depositPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositPanelMouseClicked(evt);
            }
        });

        rekeningLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rekeningLabel.setForeground(new java.awt.Color(255, 255, 255));
        rekeningLabel.setText("DEPOSIT");

        logoDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/deposit logo.png"))); // NOI18N

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoDeposit)
                .addGap(37, 37, 37)
                .addComponent(rekeningLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rekeningLabel))
                    .addGroup(depositPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(logoDeposit)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        historiPanel.setBackground(new java.awt.Color(51, 51, 255));
        historiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historiPanelMouseClicked(evt);
            }
        });

        rekeningLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rekeningLabel1.setForeground(new java.awt.Color(255, 255, 255));
        rekeningLabel1.setText("HISTORI");

        logoDeposit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/deposit logo.png"))); // NOI18N

        javax.swing.GroupLayout historiPanelLayout = new javax.swing.GroupLayout(historiPanel);
        historiPanel.setLayout(historiPanelLayout);
        historiPanelLayout.setHorizontalGroup(
            historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historiPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoDeposit1)
                .addGap(37, 37, 37)
                .addComponent(rekeningLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        historiPanelLayout.setVerticalGroup(
            historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiPanelLayout.createSequentialGroup()
                .addGroup(historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historiPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rekeningLabel1))
                    .addGroup(historiPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(logoDeposit1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout optionToDoCSLayout = new javax.swing.GroupLayout(optionToDoCS);
        optionToDoCS.setLayout(optionToDoCSLayout);
        optionToDoCSLayout.setHorizontalGroup(
            optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logoutButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(withdrawalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historiPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optionToDoCSLayout.setVerticalGroup(
            optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1)
                .addGap(27, 27, 27))
        );

        tableTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableTransaksi);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("HISTORI TRANSAKSI");

        findJtext.setBackground(new java.awt.Color(204, 204, 204));
        findJtext.setColumns(20);
        findJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        findJtext.setRows(5);

        searchButton.setBackground(new java.awt.Color(51, 102, 255));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PagePanelLayout = new javax.swing.GroupLayout(PagePanel);
        PagePanel.setLayout(PagePanelLayout);
        PagePanelLayout.setHorizontalGroup(
            PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagePanelLayout.createSequentialGroup()
                .addComponent(optionToDoCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        PagePanelLayout.setVerticalGroup(
            PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionToDoCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagePanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawalPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawalPanelMouseClicked
        TellerLandingPage t = new TellerLandingPage();
        WithdrawalPage w = new WithdrawalPage();
        
        t.setVisible(false);
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_withdrawalPanelMouseClicked

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin LOGOUT?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Berhasil LOGOUT!");
            LoginPage l = new LoginPage();
            TellerLandingPage t = new TellerLandingPage();

            l.setVisible(true);
            t.setVisible(false);
            dispose();
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Batal LOGOUT!");
        }
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void depositPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositPanelMouseClicked
        TellerLandingPage t = new TellerLandingPage();
        DepositPage d = new DepositPage();
        
        t.setVisible(false);
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_depositPanelMouseClicked

    private void historiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_historiPanelMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
      
        
        try {
            TableTransaksi t = tControl.showTransaksiBy(findJtext.getText());
            if(t == null){
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                showDataBy(findJtext.getText());
            }
            
        } catch (Exception e) {
            System.out.println("Eror :" + e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
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
            java.util.logging.Logger.getLogger(TellerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TellerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TellerLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TellerLandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PagePanel;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JTextArea findJtext;
    private javax.swing.JPanel historiPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoDeposit;
    private javax.swing.JLabel logoDeposit1;
    private javax.swing.JLabel logoRegNasabah;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JPanel optionToDoCS;
    private javax.swing.JLabel regNasabahLabel;
    private javax.swing.JLabel rekeningLabel;
    private javax.swing.JLabel rekeningLabel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableTransaksi;
    private javax.swing.JPanel withdrawalPanel;
    // End of variables declaration//GEN-END:variables
}
