/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.TellerControl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import model.Teller;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

import exception.PasswordException;
import exception.UsernameException;
import exception.InvalidInputanKosongException;
import exception.InputKosongException;

public class ManajerTellerPage extends javax.swing.JFrame {

    private TellerControl tlControl;
    
    List<Teller> listTeller;
    String action = null;
    
    public ManajerTellerPage() {
        tlControl = new TellerControl();
        
        initComponents();
        setComponent(false);
        clearText();
        
        updateButton.setEnabled(false);
        firedButton.setEnabled(false);
        
        showData();
    }

     public void setComponent(boolean value){
        idJtext.setEnabled(value);
        namaJtext.setEnabled(value);
        usernameJtext.setEnabled(value);
        passwordJtext.setEnabled(value);
        //jDateChooser.setEnabled(value);
        gajiJtext.setEnabled(value);
    }
    
    public void clearText(){
        idJtext.setText("");
        namaJtext.setText("");
        usernameJtext.setText("");
        passwordJtext.setText("");
        //jDateChooser.setDate(null);
        //jDateChooser.setToolTipText("");
        gajiJtext.setText("");
    }

    
    public void setDefaultID(){
        String AutoID = tlControl.AutoID();
        idJtext.setText(AutoID);
    }
    
    public void showData(){
        tableTeller.setModel((TableModel) tlControl.showTeller(""));
    }
    
    public void inputKosongException() throws InputKosongException{
        if(namaJtext.getText().isEmpty() || usernameJtext.getText().isEmpty() || passwordJtext.getText().isEmpty()
                || tanggalLahirJtext.getText().isEmpty() || gajiJtext.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        HeaderTitle5 = new javax.swing.JLabel();
        Logo5 = new javax.swing.JLabel();
        logoutButton5 = new javax.swing.JButton();
        PagePanel = new javax.swing.JPanel();
        ManagerCSPanel = new javax.swing.JPanel();
        findJtext = new javax.swing.JTextArea();
        searchButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        usernameJtext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTeller = new javax.swing.JTable();
        labelNama = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        namaJtext = new javax.swing.JTextArea();
        passwordLabel = new javax.swing.JLabel();
        passwordJtext = new javax.swing.JTextArea();
        tanggalLahirLabel = new javax.swing.JLabel();
        tanggalLahirJtext = new javax.swing.JTextArea();
        gajiJtext = new javax.swing.JTextArea();
        gajiLabel = new javax.swing.JLabel();
        recruitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        firedButton = new javax.swing.JButton();
        idJtext = new javax.swing.JTextArea();
        labelID = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(51, 51, 255));

        HeaderTitle5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        HeaderTitle5.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle5.setText("Teller Management");

        Logo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo cba.png"))); // NOI18N

        logoutButton5.setBackground(new java.awt.Color(255, 0, 51));
        logoutButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton5.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton5.setText("LOGOUT");
        logoutButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Logo5)
                .addGap(18, 18, 18)
                .addComponent(HeaderTitle5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton5)
                .addGap(50, 50, 50))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo5)
                    .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HeaderTitle5)
                        .addComponent(logoutButton5)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PagePanel.setBackground(new java.awt.Color(255, 255, 255));

        ManagerCSPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        pageLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageLabel.setForeground(new java.awt.Color(51, 102, 255));
        pageLabel.setText("Teller Management");

        usernameJtext.setColumns(20);
        usernameJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameJtext.setForeground(new java.awt.Color(0, 0, 0));
        usernameJtext.setRows(5);

        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        tableTeller.setBackground(new java.awt.Color(204, 204, 204));
        tableTeller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "cs_id", "username", "nama", "tanggal_lahir", "gaji"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableTeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTellerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableTeller);

        labelNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(0, 0, 0));
        labelNama.setText("Nama");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username");

        namaJtext.setColumns(20);
        namaJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaJtext.setForeground(new java.awt.Color(0, 0, 0));
        namaJtext.setRows(5);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");

        passwordJtext.setColumns(20);
        passwordJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordJtext.setForeground(new java.awt.Color(0, 0, 0));
        passwordJtext.setRows(5);

        tanggalLahirLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanggalLahirLabel.setForeground(new java.awt.Color(0, 0, 0));
        tanggalLahirLabel.setText("Tanggal Lahir");

        tanggalLahirJtext.setColumns(20);
        tanggalLahirJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanggalLahirJtext.setForeground(new java.awt.Color(0, 0, 0));
        tanggalLahirJtext.setRows(5);

        gajiJtext.setColumns(20);
        gajiJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gajiJtext.setForeground(new java.awt.Color(0, 0, 0));
        gajiJtext.setRows(5);

        gajiLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gajiLabel.setForeground(new java.awt.Color(0, 0, 0));
        gajiLabel.setText("Gaji");

        recruitButton.setBackground(new java.awt.Color(51, 102, 255));
        recruitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recruitButton.setForeground(new java.awt.Color(255, 255, 255));
        recruitButton.setText("RECRUIT");
        recruitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 102, 255));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        firedButton.setBackground(new java.awt.Color(255, 0, 51));
        firedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firedButton.setForeground(new java.awt.Color(255, 255, 255));
        firedButton.setText("FIRED");
        firedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firedButtonActionPerformed(evt);
            }
        });

        idJtext.setColumns(20);
        idJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idJtext.setForeground(new java.awt.Color(0, 0, 0));
        idJtext.setRows(5);

        labelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(0, 0, 0));
        labelID.setText("ID");

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(51, 204, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setForeground(new java.awt.Color(204, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManagerCSPanelLayout = new javax.swing.GroupLayout(ManagerCSPanel);
        ManagerCSPanel.setLayout(ManagerCSPanelLayout);
        ManagerCSPanelLayout.setHorizontalGroup(
            ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerCSPanelLayout.createSequentialGroup()
                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pageLabel)
                                    .addComponent(labelNama)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel)
                                    .addComponent(tanggalLahirLabel)
                                    .addComponent(gajiLabel)
                                    .addComponent(idJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelID)
                                    .addComponent(tanggalLahirJtext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerCSPanelLayout.createSequentialGroup()
                                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(gajiJtext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                            .addComponent(passwordJtext, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernameJtext, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firedButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                                        .addComponent(namaJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(recruitButton)))
                                .addGap(94, 94, 94))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerCSPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)
                        .addGap(84, 84, 84)))
                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                        .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        ManagerCSPanelLayout.setVerticalGroup(
            ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pageLabel)
                        .addGap(23, 23, 23)
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recruitButton))
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firedButton))
                        .addGap(18, 18, 18)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton))
                        .addGap(18, 18, 18)
                        .addComponent(tanggalLahirLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggalLahirJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(gajiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gajiJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saveButton)
                                .addComponent(cancelButton))
                            .addGroup(ManagerCSPanelLayout.createSequentialGroup()
                                .addGroup(ManagerCSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PagePanelLayout = new javax.swing.GroupLayout(PagePanel);
        PagePanel.setLayout(PagePanelLayout);
        PagePanelLayout.setHorizontalGroup(
            PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PagePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ManagerCSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PagePanelLayout.setVerticalGroup(
            PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PagePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ManagerCSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(PagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton5ActionPerformed
        ManajerTellerPage t = new ManajerTellerPage();
        TellerLandingPage m = new TellerLandingPage();

        t.setVisible(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButton5ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        setEditDeleteBtn(true);

        try{
            Teller t = tlControl.showTellerby(findJtext.getText());
            if(t == null){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                idJtext.setText(t.getTeller_id());
                namaJtext.setText(t.getNama());
                usernameJtext.setText(t.getUsername());
                passwordJtext.setText(t.getPassword());
                String gaji = String.valueOf(t.getGaji());
                gajiJtext.setText(gaji);

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                //jDateChooser.setDateFormatString("yyyy-MM-dd");
                Date tanggalLahir = dateFormat.parse(t.getTanggalLahir());
                //jDateChooser.setDate(tanggalLahir);
            }
        }catch(Exception e){
            System.out.println("Error:  "+e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void recruitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitButtonActionPerformed
        setComponent(true);
        clearText();
        setDefaultID();
        idJtext.setEnabled(false);
        action = "Recruit";
    }//GEN-LAST:event_recruitButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        setComponent(true);
        idJtext.setEditable(false);
        action = "Update";
    }//GEN-LAST:event_updateButtonActionPerformed

    private void firedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firedButtonActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin memberhentikan Karyawan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                tlControl.deleteDataTeller(idJtext.getText());
                clearText();
                showData();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }catch(Exception e){
                System.out.println("Error:  "+e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus");
        }
    }//GEN-LAST:event_firedButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int i = 0;
        try {
            inputKosongException();
            String gajiStr = gajiJtext.getText().trim();
            double gaji = Double.parseDouble(gajiStr);
            String tanggalLahir = tanggalLahirJtext.getText().trim();
            Teller t = new Teller(idJtext.getText(), usernameJtext.getText(), passwordJtext.getText(), namaJtext.getText(), tanggalLahir, gaji);

            if (action.equals("Recruit")) {
                tlControl.insertDataTeller(t);
            } else {
                tlControl.updateDataTeller(t, idJtext.getText());
            }

            JOptionPane.showMessageDialog(ManagerCSPanel, "Data Berhasil Disimpan");
            i = 1;
        } catch (InputKosongException e) {
            JOptionPane.showMessageDialog(this, e.message());
        }

        if (i == 1) {
            clearText();
            showData();
            setComponent(false);
            setEditDeleteBtn(false);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tableTellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTellerMouseClicked
        int indexTeller = -1;
        int selectedId = 0;
        setEditDeleteBtn(true);
        
        setComponent(false);
        
        int clickedRow = tableTeller.getSelectedRow();
        TableModel tableModel = tableTeller.getModel();
        
        idJtext.setText(tableModel.getValueAt(clickedRow, 0).toString());
        namaJtext.setText(tableModel.getValueAt(clickedRow, 1).toString());
        usernameJtext.setText(tableModel.getValueAt(clickedRow, 2).toString());
        tanggalLahirJtext.setText(tableModel.getValueAt(clickedRow, 3).toString());
        gajiJtext.setText(tableModel.getValueAt(clickedRow, 4).toString());
        
    }//GEN-LAST:event_tableTellerMouseClicked

    public void setEditDeleteBtn(boolean value){
        updateButton.setEnabled(value);
        firedButton.setEnabled(value);
    }
    
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
            java.util.logging.Logger.getLogger(ManajerTellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajerTellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajerTellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajerTellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajerTellerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HeaderTitle5;
    private javax.swing.JLabel Logo5;
    private javax.swing.JPanel ManagerCSPanel;
    private javax.swing.JPanel PagePanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea findJtext;
    private javax.swing.JButton firedButton;
    private javax.swing.JTextArea gajiJtext;
    private javax.swing.JLabel gajiLabel;
    private javax.swing.JTextArea idJtext;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNama;
    private javax.swing.JButton logoutButton5;
    private javax.swing.JTextArea namaJtext;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTextArea passwordJtext;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton recruitButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableTeller;
    private javax.swing.JTextArea tanggalLahirJtext;
    private javax.swing.JLabel tanggalLahirLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextArea usernameJtext;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
