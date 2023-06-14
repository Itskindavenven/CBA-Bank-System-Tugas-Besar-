package view;


import javax.swing.JOptionPane;

import control.RekeningControl;
import control.TransaksiControl;
import java.math.BigInteger;
import javax.swing.JTextField;
import model.Rekening;
import model.Transaksi;

public class WithdrawalPage extends javax.swing.JFrame {

    TransaksiControl tControl = new TransaksiControl();
    RekeningControl rControl = new RekeningControl();
    
    
    public WithdrawalPage() {
        initComponents();
        setDefaultID();
    }
    
    public void setDefaultID(){
        String AutoID = tControl.autoID();
        idTransaksiJtext.setText(AutoID);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        optionToDoTeller = new javax.swing.JPanel();
        registNasabahPanel5 = new javax.swing.JPanel();
        regNasabahLabel5 = new javax.swing.JLabel();
        logoRegNasabah5 = new javax.swing.JLabel();
        logoutButton1 = new javax.swing.JButton();
        rekeningPanel = new javax.swing.JPanel();
        rekeningLabel = new javax.swing.JLabel();
        logoDeposit = new javax.swing.JLabel();
        WithdrawalPanel = new javax.swing.JPanel();
        titleMainPanel = new javax.swing.JLabel();
        findJtext = new javax.swing.JTextArea();
        norekLabel = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        jumlahJtext = new javax.swing.JTextArea();
        cinJtext = new javax.swing.JTextArea();
        idTransaksiJtext = new javax.swing.JTextArea();
        norekLabel1 = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        cinLabel = new javax.swing.JLabel();
        saldoJtext = new javax.swing.JTextArea();
        saldoLabel = new javax.swing.JLabel();
        withdrawalButton = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        tanggalLabel = new javax.swing.JLabel();
        jenisNorekJtext = new javax.swing.JTextArea();
        idTransaksiLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        namaJtext1 = new javax.swing.JTextArea();
        jenisRekLabel = new javax.swing.JLabel();

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

        optionToDoTeller.setBackground(new java.awt.Color(51, 51, 255));

        registNasabahPanel5.setBackground(new java.awt.Color(153, 153, 153));
        registNasabahPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registNasabahPanel5MouseClicked(evt);
            }
        });

        regNasabahLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regNasabahLabel5.setForeground(new java.awt.Color(255, 255, 255));
        regNasabahLabel5.setText("WITHDRAWAL");

        logoRegNasabah5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/withdrawal logo.png"))); // NOI18N

        javax.swing.GroupLayout registNasabahPanel5Layout = new javax.swing.GroupLayout(registNasabahPanel5);
        registNasabahPanel5.setLayout(registNasabahPanel5Layout);
        registNasabahPanel5Layout.setHorizontalGroup(
            registNasabahPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registNasabahPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(logoRegNasabah5)
                .addGap(36, 36, 36)
                .addComponent(regNasabahLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registNasabahPanel5Layout.setVerticalGroup(
            registNasabahPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registNasabahPanel5Layout.createSequentialGroup()
                .addGroup(registNasabahPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registNasabahPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(regNasabahLabel5))
                    .addGroup(registNasabahPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logoRegNasabah5)))
                .addContainerGap(50, Short.MAX_VALUE))
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

        rekeningPanel.setBackground(new java.awt.Color(51, 51, 255));
        rekeningPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rekeningPanelMouseClicked(evt);
            }
        });

        rekeningLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rekeningLabel.setForeground(new java.awt.Color(255, 255, 255));
        rekeningLabel.setText("DEPOSIT");

        logoDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/deposit logo.png"))); // NOI18N

        javax.swing.GroupLayout rekeningPanelLayout = new javax.swing.GroupLayout(rekeningPanel);
        rekeningPanel.setLayout(rekeningPanelLayout);
        rekeningPanelLayout.setHorizontalGroup(
            rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rekeningPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoDeposit)
                .addGap(37, 37, 37)
                .addComponent(rekeningLabel)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        rekeningPanelLayout.setVerticalGroup(
            rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekeningPanelLayout.createSequentialGroup()
                .addGroup(rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rekeningPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rekeningLabel))
                    .addGroup(rekeningPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(logoDeposit)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout optionToDoTellerLayout = new javax.swing.GroupLayout(optionToDoTeller);
        optionToDoTeller.setLayout(optionToDoTellerLayout);
        optionToDoTellerLayout.setHorizontalGroup(
            optionToDoTellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoTellerLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logoutButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(optionToDoTellerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rekeningPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(registNasabahPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        optionToDoTellerLayout.setVerticalGroup(
            optionToDoTellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoTellerLayout.createSequentialGroup()
                .addComponent(registNasabahPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rekeningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(logoutButton1)
                .addGap(27, 27, 27))
        );

        WithdrawalPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleMainPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleMainPanel.setForeground(new java.awt.Color(51, 51, 255));
        titleMainPanel.setText("WITHDRAWAL");

        findJtext.setColumns(20);
        findJtext.setRows(5);

        norekLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        norekLabel.setForeground(new java.awt.Color(51, 51, 255));
        norekLabel.setText("No. Rekening");

        findButton.setBackground(new java.awt.Color(51, 51, 255));
        findButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findButton.setForeground(new java.awt.Color(255, 255, 255));
        findButton.setText("Search");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        jumlahJtext.setColumns(20);
        jumlahJtext.setRows(5);

        cinJtext.setColumns(20);
        cinJtext.setRows(5);

        idTransaksiJtext.setColumns(20);
        idTransaksiJtext.setRows(5);

        norekLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        norekLabel1.setForeground(new java.awt.Color(51, 51, 255));
        norekLabel1.setText("Nama");

        jumlahLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jumlahLabel.setForeground(new java.awt.Color(51, 51, 255));
        jumlahLabel.setText("Jumlah Withdrawal");

        cinLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cinLabel.setForeground(new java.awt.Color(51, 51, 255));
        cinLabel.setText("CIN");

        saldoJtext.setColumns(20);
        saldoJtext.setRows(5);

        saldoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saldoLabel.setForeground(new java.awt.Color(51, 51, 255));
        saldoLabel.setText("SALDO");

        withdrawalButton.setBackground(new java.awt.Color(51, 51, 255));
        withdrawalButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        withdrawalButton.setForeground(new java.awt.Color(255, 255, 255));
        withdrawalButton.setText("WITHDAWL");
        withdrawalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalButtonActionPerformed(evt);
            }
        });

        jDateChooser.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser.setDateFormatString("yyyy-MM-dd\n");

        tanggalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(51, 51, 255));
        tanggalLabel.setText("Tanggal");

        jenisNorekJtext.setColumns(20);
        jenisNorekJtext.setRows(5);

        idTransaksiLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTransaksiLabel.setForeground(new java.awt.Color(51, 51, 255));
        idTransaksiLabel.setText("Transaksi id");

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setForeground(new java.awt.Color(204, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        namaJtext1.setColumns(20);
        namaJtext1.setRows(5);

        jenisRekLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jenisRekLabel.setForeground(new java.awt.Color(51, 51, 255));
        jenisRekLabel.setText("Jenis Rekening");

        javax.swing.GroupLayout WithdrawalPanelLayout = new javax.swing.GroupLayout(WithdrawalPanel);
        WithdrawalPanel.setLayout(WithdrawalPanelLayout);
        WithdrawalPanelLayout.setHorizontalGroup(
            WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                        .addComponent(norekLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTransaksiJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTransaksiLabel))
                        .addGap(124, 124, 124))))
            .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaJtext1)
                            .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                                .addComponent(jenisRekLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cinLabel)
                                        .addComponent(norekLabel1)
                                        .addComponent(tanggalLabel)
                                        .addComponent(jenisNorekJtext)
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saldoLabel)
                                    .addComponent(saldoJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                                        .addComponent(withdrawalButton)
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WithdrawalPanelLayout.createSequentialGroup()
                                        .addComponent(cancelButton)
                                        .addGap(83, 83, 83))))))
                    .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(titleMainPanel))
                    .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(findButton)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        WithdrawalPanelLayout.setVerticalGroup(
            WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleMainPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(norekLabel)
                    .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(idTransaksiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTransaksiJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldoLabel)
                            .addComponent(norekLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldoJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaJtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(WithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahLabel)
                            .addComponent(jenisRekLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addGroup(WithdrawalPanelLayout.createSequentialGroup()
                        .addComponent(jenisNorekJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tanggalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionToDoTeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WithdrawalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionToDoTeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WithdrawalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registNasabahPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registNasabahPanel5MouseClicked
        
    }//GEN-LAST:event_registNasabahPanel5MouseClicked

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin LOGOUT?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Berhasil LOGOUT!");
            LoginPage l = new LoginPage();
            CSLandingPage cs = new CSLandingPage();

            l.setVisible(true);
            cs.setVisible(false);
            dispose();
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Batal LOGOUT!");
        }
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void rekeningPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rekeningPanelMouseClicked
        rekeningPage re = new rekeningPage();
        CSLandingPage cs = new CSLandingPage();

        re.setVisible(true);
        cs.setVisible(false);
        dispose();
    }//GEN-LAST:event_rekeningPanelMouseClicked

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        try {
            // Periksa apakah objek rControl telah diinisialisasi
            if (rControl == null) {
                JOptionPane.showMessageDialog(null, "Objek rControl belum diinisialisasi", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Periksa apakah objek findJtext telah diinisialisasi dan tidak kosong
            if (findJtext == null || findJtext.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kolom pencarian tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Rekening r = rControl.getRekeningByNoRekening(findJtext.getText());
            if (r == null) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cinJtext.setText(r.getCin());
                namaJtext1.setText(r.getNamaNasabah());
                saldoJtext.setText(String.valueOf(r.getSaldo()));
                jenisNorekJtext.setText(r.getJenis());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void withdrawalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawalButtonActionPerformed
        
        try{
            String tanggalLahir = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
            String saldoStr = saldoJtext.getText().trim();
            BigInteger saldo = new BigInteger(saldoStr);
            String jumlahStr = jumlahJtext.getText().trim();
            BigInteger jumlah = new BigInteger(jumlahStr);
            
            BigInteger saldoBaru = saldo.subtract(jumlah);
            
            if (saldoBaru.compareTo(BigInteger.ZERO) < 0){
                JOptionPane.showMessageDialog(WithdrawalPanel, "Saldo tidak cukup untuk melakukan penarikan!");
            }else{
                Transaksi t = new Transaksi(idTransaksiJtext.getText(), findJtext.getText(), tanggalLahir, jumlah, "Withdrawal");
                tControl.insertTransaksi(t);
                Rekening r = new Rekening(findJtext.getText(), cinJtext.getText(), jenisNorekJtext.getText(), saldoBaru);
                rControl.updateRekening(r);
                JOptionPane.showMessageDialog(WithdrawalPanel, "Berhasil melakukan penarikan!");
            }
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(WithdrawalPanel, "Gagal menyimpan data");
        }
        
    }//GEN-LAST:event_withdrawalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel WithdrawalPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea cinJtext;
    private javax.swing.JLabel cinLabel;
    private javax.swing.JButton findButton;
    private javax.swing.JTextArea findJtext;
    private javax.swing.JTextArea idTransaksiJtext;
    private javax.swing.JLabel idTransaksiLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JTextArea jenisNorekJtext;
    private javax.swing.JLabel jenisRekLabel;
    private javax.swing.JTextArea jumlahJtext;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JLabel logoDeposit;
    private javax.swing.JLabel logoRegNasabah5;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextArea namaJtext1;
    private javax.swing.JLabel norekLabel;
    private javax.swing.JLabel norekLabel1;
    private javax.swing.JPanel optionToDoTeller;
    private javax.swing.JLabel regNasabahLabel5;
    private javax.swing.JPanel registNasabahPanel5;
    private javax.swing.JLabel rekeningLabel;
    private javax.swing.JPanel rekeningPanel;
    private javax.swing.JTextArea saldoJtext;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JLabel titleMainPanel;
    private javax.swing.JButton withdrawalButton;
    // End of variables declaration//GEN-END:variables
}
