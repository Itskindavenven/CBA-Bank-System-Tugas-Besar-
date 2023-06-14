package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

import model.Nasabah;
import control.NasabahControl;

public class registerNasabahPage extends javax.swing.JFrame {

    private NasabahControl nControl;
    
    List<Nasabah> listN;
    String action = null;
    
    public registerNasabahPage() {
        nControl = new NasabahControl();
        
        initComponents();
        clearText();
        setDefaultID();
        cinJtext.setEditable(false);
//        checkTextFields();
    }

    public void setComponent(boolean value){
        cinJtext.setEnabled(value);
        namaJtext.setEnabled(value);
        nikJtext.setEnabled(value);
        jDateChooser.setEnabled(value);
        alamatJtext.setEnabled(value);
        pekerjaanJtext.setEnabled(value);
    }
    
    public void clearText(){
        cinJtext.setText("");
        namaJtext.setText("");
        nikJtext.setText("");
        jDateChooser.setDate(null);
        jDateChooser.setToolTipText("");
        alamatJtext.setText("");
        pekerjaanJtext.setText("");
    }
    
    public void setDefaultID(){
        String AutoID = nControl.AutoID();
        cinJtext.setText(AutoID);
    }
    
//    public void setSaveCancleBtn(boolean value){
//        saveButton.setEnabled(value);
//        cancleButton.setEnabled(value);
//    }
//    
//    public void checkTextFields() {
//        boolean isAllFieldsFilled = !cinJtext.getText().isEmpty()
//                && !namaJtext.getText().isEmpty()
//                && !nikJtext.getText().isEmpty()
//                && jDateChooser.getDate() != null
//                && !alamatJtext.getText().isEmpty()
//                && !pekerjaanJtext.getText().isEmpty();
//
//        setSaveCancleBtn(isAllFieldsFilled);
//    }
//    
//    private boolean isAnyFieldEmpty() {
//        return cinJtext.getText().isEmpty()
//                || namaJtext.getText().isEmpty()
//                || nikJtext.getText().isEmpty()
//                || jDateChooser.getDate() == null
//                || alamatJtext.getText().isEmpty()
//                || pekerjaanJtext.getText().isEmpty();
//    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        optionToDoCS = new javax.swing.JPanel();
        registNasabahPanel = new javax.swing.JPanel();
        regNasabahLabel = new javax.swing.JLabel();
        logoRegNasabah = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        rekeningPanel = new javax.swing.JPanel();
        rekeningLabel = new javax.swing.JLabel();
        logoRekening = new javax.swing.JLabel();
        detailNasabahPanel = new javax.swing.JPanel();
        detailLabel = new javax.swing.JLabel();
        logoDetail = new javax.swing.JLabel();
        registPanel = new javax.swing.JPanel();
        mainPanelTitle = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaJtext = new javax.swing.JTextArea();
        nikLabel = new javax.swing.JLabel();
        nikJtext = new javax.swing.JTextArea();
        tanggalLahirLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        alamatJtext = new javax.swing.JTextArea();
        alamatLabel = new javax.swing.JLabel();
        pekerjaanJtext = new javax.swing.JTextArea();
        pekerjaanLabel = new javax.swing.JLabel();
        cinJtext = new javax.swing.JTextArea();
        cinLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(51, 51, 255));

        HeaderTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("Customer Service ");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo cba.png"))); // NOI18N

        BackButton.setBackground(new java.awt.Color(153, 153, 153));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(93, 93, 93))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HeaderTitle)
                        .addComponent(BackButton)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        optionToDoCS.setBackground(new java.awt.Color(51, 51, 255));

        registNasabahPanel.setBackground(new java.awt.Color(153, 153, 153));
        registNasabahPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registNasabahPanelMouseClicked(evt);
            }
        });

        regNasabahLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regNasabahLabel.setForeground(new java.awt.Color(255, 255, 255));
        regNasabahLabel.setText("Register Nasabah");

        logoRegNasabah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/nasabah regist logo.png"))); // NOI18N

        javax.swing.GroupLayout registNasabahPanelLayout = new javax.swing.GroupLayout(registNasabahPanel);
        registNasabahPanel.setLayout(registNasabahPanelLayout);
        registNasabahPanelLayout.setHorizontalGroup(
            registNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registNasabahPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(logoRegNasabah)
                .addGap(27, 27, 27)
                .addComponent(regNasabahLabel)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        registNasabahPanelLayout.setVerticalGroup(
            registNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registNasabahPanelLayout.createSequentialGroup()
                .addGroup(registNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registNasabahPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(regNasabahLabel))
                    .addGroup(registNasabahPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logoRegNasabah)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        logoutButton.setBackground(new java.awt.Color(255, 0, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
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
        rekeningLabel.setText("Rekening");

        logoRekening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/rekening logo.png"))); // NOI18N

        javax.swing.GroupLayout rekeningPanelLayout = new javax.swing.GroupLayout(rekeningPanel);
        rekeningPanel.setLayout(rekeningPanelLayout);
        rekeningPanelLayout.setHorizontalGroup(
            rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rekeningPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(logoRekening)
                .addGap(33, 33, 33)
                .addComponent(rekeningLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rekeningPanelLayout.setVerticalGroup(
            rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekeningPanelLayout.createSequentialGroup()
                .addGroup(rekeningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rekeningPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rekeningLabel))
                    .addGroup(rekeningPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logoRekening)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        detailNasabahPanel.setBackground(new java.awt.Color(51, 51, 255));
        detailNasabahPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailNasabahPanelMouseClicked(evt);
            }
        });

        detailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(255, 255, 255));
        detailLabel.setText("Detail Nasabah");

        logoDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/detail logo.png"))); // NOI18N

        javax.swing.GroupLayout detailNasabahPanelLayout = new javax.swing.GroupLayout(detailNasabahPanel);
        detailNasabahPanel.setLayout(detailNasabahPanelLayout);
        detailNasabahPanelLayout.setHorizontalGroup(
            detailNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailNasabahPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logoDetail)
                .addGap(34, 34, 34)
                .addComponent(detailLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailNasabahPanelLayout.setVerticalGroup(
            detailNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailNasabahPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(detailLabel)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailNasabahPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoDetail)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout optionToDoCSLayout = new javax.swing.GroupLayout(optionToDoCS);
        optionToDoCS.setLayout(optionToDoCSLayout);
        optionToDoCSLayout.setHorizontalGroup(
            optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registNasabahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rekeningPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailNasabahPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optionToDoCSLayout.setVerticalGroup(
            optionToDoCSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionToDoCSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registNasabahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rekeningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailNasabahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(27, 27, 27))
        );

        registPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainPanelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mainPanelTitle.setForeground(new java.awt.Color(51, 51, 255));
        mainPanelTitle.setText("REGISTRASI NASABAH BARU");

        namaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(51, 51, 255));
        namaLabel.setText("Nama");

        namaJtext.setColumns(20);
        namaJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaJtext.setForeground(new java.awt.Color(0, 0, 0));
        namaJtext.setRows(5);

        nikLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nikLabel.setForeground(new java.awt.Color(51, 51, 255));
        nikLabel.setText("NIK");

        nikJtext.setColumns(20);
        nikJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nikJtext.setForeground(new java.awt.Color(0, 0, 0));
        nikJtext.setRows(5);

        tanggalLahirLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanggalLahirLabel.setForeground(new java.awt.Color(51, 51, 255));
        tanggalLahirLabel.setText("Tanggal Lahir");

        jDateChooser.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser.setDateFormatString("yyyy-MM-dd\n");

        alamatJtext.setColumns(20);
        alamatJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alamatJtext.setForeground(new java.awt.Color(0, 0, 0));
        alamatJtext.setRows(5);

        alamatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alamatLabel.setForeground(new java.awt.Color(51, 51, 255));
        alamatLabel.setText("Alamat");

        pekerjaanJtext.setColumns(20);
        pekerjaanJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pekerjaanJtext.setForeground(new java.awt.Color(0, 0, 0));
        pekerjaanJtext.setRows(5);

        pekerjaanLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pekerjaanLabel.setForeground(new java.awt.Color(51, 51, 255));
        pekerjaanLabel.setText("Pekerjaan");

        cinJtext.setColumns(20);
        cinJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cinJtext.setForeground(new java.awt.Color(0, 0, 0));
        cinJtext.setRows(5);

        cinLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cinLabel.setForeground(new java.awt.Color(51, 51, 255));
        cinLabel.setText("CIN");

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(51, 204, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancleButton.setBackground(new java.awt.Color(255, 255, 255));
        cancleButton.setForeground(new java.awt.Color(204, 0, 0));
        cancleButton.setText("Cancel");
        cancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registPanelLayout = new javax.swing.GroupLayout(registPanel);
        registPanel.setLayout(registPanelLayout);
        registPanelLayout.setHorizontalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registPanelLayout.createSequentialGroup()
                        .addComponent(mainPanelTitle)
                        .addGap(297, 297, 297))
                    .addGroup(registPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registPanelLayout.createSequentialGroup()
                                .addComponent(pekerjaanLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createSequentialGroup()
                                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(registPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(saveButton))
                                    .addGroup(registPanelLayout.createSequentialGroup()
                                        .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(alamatLabel)
                                            .addComponent(nikJtext)
                                            .addComponent(tanggalLahirLabel)
                                            .addComponent(namaLabel)
                                            .addComponent(nikLabel)
                                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                            .addComponent(namaJtext)
                                            .addComponent(alamatJtext)
                                            .addComponent(pekerjaanJtext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                        .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cinLabel)
                                                .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cancleButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(191, 191, 191))))))
        );
        registPanelLayout.setVerticalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mainPanelTitle)
                .addGap(34, 34, 34)
                .addComponent(cinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nikJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalLahirLabel)
                    .addComponent(cancleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alamatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pekerjaanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pekerjaanJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(optionToDoCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionToDoCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registNasabahPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registNasabahPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registNasabahPanelMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void rekeningPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rekeningPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rekeningPanelMouseClicked

    private void detailNasabahPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailNasabahPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_detailNasabahPanelMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        CSLandingPage cs = new CSLandingPage();
        registerNasabahPage r = new registerNasabahPage();

        cs.setVisible(true);
        r.setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void cancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleButtonActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ignin membatalkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            clearText();
        }else{
            
        }
    }//GEN-LAST:event_cancleButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            String tanggalLahir = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
            Nasabah n = new Nasabah(cinJtext.getText(), nikJtext.getText(), namaJtext.getText(), alamatJtext.getText(), tanggalLahir, pekerjaanJtext.getText());

            nControl.insertDataNasabah(n);
            JOptionPane.showMessageDialog(registNasabahPanel, "Data Berhasil Disimpan");

            clearText();
            setComponent(false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(registNasabahPanel, "Gagal menyimpan data");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(registerNasabahPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerNasabahPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerNasabahPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerNasabahPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerNasabahPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextArea alamatJtext;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JButton cancleButton;
    private javax.swing.JTextArea cinJtext;
    private javax.swing.JLabel cinLabel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JPanel detailNasabahPanel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel logoDetail;
    private javax.swing.JLabel logoRegNasabah;
    private javax.swing.JLabel logoRekening;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mainPanelTitle;
    private javax.swing.JTextArea namaJtext;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextArea nikJtext;
    private javax.swing.JLabel nikLabel;
    private javax.swing.JPanel optionToDoCS;
    private javax.swing.JTextArea pekerjaanJtext;
    private javax.swing.JLabel pekerjaanLabel;
    private javax.swing.JLabel regNasabahLabel;
    private javax.swing.JPanel registNasabahPanel;
    private javax.swing.JPanel registPanel;
    private javax.swing.JLabel rekeningLabel;
    private javax.swing.JPanel rekeningPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tanggalLahirLabel;
    // End of variables declaration//GEN-END:variables
}
