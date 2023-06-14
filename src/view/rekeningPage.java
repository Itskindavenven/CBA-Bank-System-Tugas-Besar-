package view;

import control.NasabahControl;
import control.RekeningControl;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static javax.management.Query.value;
import javax.swing.JOptionPane;
import model.Nasabah;
import model.Rekening;

public class rekeningPage extends javax.swing.JFrame {

    NasabahControl nControl = new NasabahControl();
    RekeningControl rControl = new RekeningControl();
            
    public rekeningPage() {
        initComponents();
        setComponent(false);
        setActionCommandRadio();
    }

    public void setComponent(boolean value){
        namaJtext.setEditable(value);
        nikJtext.setEditable(value);
        jDateChooser.getDateEditor().setEnabled(false);
        alamatJtext.setEditable(value);
        pekerjaanJtext.setEditable(value);
        
        saldoJtext.setEnabled(value);
        norekJtext.setEditable(value);
    }
    
    public void setRadioJenis(Boolean value){
        tahapanRadioButton.setEnabled(value);
        goldRadioButton.setEnabled(value);
        depositoRadioButton.setEnabled(value);
    }
    
    public void clearText(){
        namaJtext.setText("");
        nikJtext.setText("");
        jDateChooser.setDate(null);
        alamatJtext.setText("");
        pekerjaanJtext.setText("");
        
        saldoJtext.setText("");
        norekJtext.setText("");
    }
    
    public void generateNomorRekening() {
        Random random = new Random();
        long min = 100_000_000_000L;
        long max = 999_999_999_999L;

        long nomorRekening = Math.abs(random.nextLong()) % (max - min + 1) + min;
        norekJtext.setText(Long.toString(nomorRekening));
    }
    
    public void setActionCommandRadio(){
        tahapanRadioButton.setActionCommand("Tahapan");
        goldRadioButton.setActionCommand("Gold");
        depositoRadioButton.setActionCommand("Deposito");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisButtonGroup = new javax.swing.ButtonGroup();
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
        rekeningMainPanel = new javax.swing.JPanel();
        cinLabel = new javax.swing.JLabel();
        findJtext = new javax.swing.JTextArea();
        searchButton = new javax.swing.JButton();
        mainPanelTitle = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaJtext = new javax.swing.JTextArea();
        nikLabel = new javax.swing.JLabel();
        nikJtext = new javax.swing.JTextArea();
        tanggalLahirLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        alamatLabel = new javax.swing.JLabel();
        alamatJtext = new javax.swing.JTextArea();
        saldoJtext = new javax.swing.JTextArea();
        saldoLabel = new javax.swing.JLabel();
        tahapanRadioButton = new javax.swing.JRadioButton();
        goldRadioButton = new javax.swing.JRadioButton();
        depositoRadioButton = new javax.swing.JRadioButton();
        jenisRekeningLabel = new javax.swing.JLabel();
        norekJtext = new javax.swing.JTextArea();
        norekLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancleButton1 = new javax.swing.JButton();
        pekerjaanJtext = new javax.swing.JTextArea();
        pekerjaanLabel = new javax.swing.JLabel();
        cinJtext = new javax.swing.JTextArea();
        namaLabel1 = new javax.swing.JLabel();

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
                .addGap(90, 90, 90))
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

        registNasabahPanel.setBackground(new java.awt.Color(51, 51, 255));
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

        rekeningPanel.setBackground(new java.awt.Color(153, 153, 153));
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

        rekeningMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        cinLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cinLabel.setForeground(new java.awt.Color(51, 51, 255));
        cinLabel.setText("CIN / NIK ");

        findJtext.setColumns(20);
        findJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        findJtext.setForeground(new java.awt.Color(0, 0, 0));
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

        mainPanelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mainPanelTitle.setForeground(new java.awt.Color(51, 51, 255));
        mainPanelTitle.setText("PENDAFTARAN REKENING");

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

        alamatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alamatLabel.setForeground(new java.awt.Color(51, 51, 255));
        alamatLabel.setText("Alamat");

        alamatJtext.setColumns(20);
        alamatJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alamatJtext.setForeground(new java.awt.Color(0, 0, 0));
        alamatJtext.setRows(5);

        saldoJtext.setColumns(20);
        saldoJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saldoJtext.setForeground(new java.awt.Color(0, 0, 0));
        saldoJtext.setRows(5);

        saldoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saldoLabel.setForeground(new java.awt.Color(51, 51, 255));
        saldoLabel.setText("Saldo Awal");

        jenisButtonGroup.add(tahapanRadioButton);
        tahapanRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tahapanRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        tahapanRadioButton.setText("Tahapan");
        tahapanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahapanRadioButtonActionPerformed(evt);
            }
        });

        jenisButtonGroup.add(goldRadioButton);
        goldRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goldRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        goldRadioButton.setText("Gold");

        jenisButtonGroup.add(depositoRadioButton);
        depositoRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        depositoRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        depositoRadioButton.setText("Deposito");

        jenisRekeningLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jenisRekeningLabel.setForeground(new java.awt.Color(51, 51, 255));
        jenisRekeningLabel.setText("Jenis Rekening");

        norekJtext.setColumns(20);
        norekJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        norekJtext.setForeground(new java.awt.Color(0, 0, 0));
        norekJtext.setRows(5);

        norekLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        norekLabel.setForeground(new java.awt.Color(51, 51, 255));
        norekLabel.setText("Nomor Rekening");

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(51, 204, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancleButton1.setBackground(new java.awt.Color(255, 255, 255));
        cancleButton1.setForeground(new java.awt.Color(204, 0, 0));
        cancleButton1.setText("Cancel");

        pekerjaanJtext.setColumns(20);
        pekerjaanJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pekerjaanJtext.setForeground(new java.awt.Color(0, 0, 0));
        pekerjaanJtext.setRows(5);

        pekerjaanLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pekerjaanLabel.setForeground(new java.awt.Color(51, 51, 255));
        pekerjaanLabel.setText("Pekerjaan");

        cinJtext.setColumns(20);
        cinJtext.setRows(5);

        namaLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaLabel1.setForeground(new java.awt.Color(51, 51, 255));
        namaLabel1.setText("CIN");

        javax.swing.GroupLayout rekeningMainPanelLayout = new javax.swing.GroupLayout(rekeningMainPanel);
        rekeningMainPanel.setLayout(rekeningMainPanelLayout);
        rekeningMainPanelLayout.setHorizontalGroup(
            rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rekeningMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                        .addComponent(mainPanelTitle)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rekeningMainPanelLayout.createSequentialGroup()
                        .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveButton)
                            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                .addComponent(cinLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addGap(310, 310, 310))))
            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                        .addComponent(pekerjaanLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                        .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                    .addComponent(nikJtext)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                    .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                        .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alamatLabel)
                                            .addComponent(tanggalLahirLabel)
                                            .addComponent(nikLabel))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(alamatJtext)
                                    .addComponent(pekerjaanJtext))
                                .addGap(138, 138, 138))
                            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                .addComponent(namaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldoJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saldoLabel)
                            .addComponent(jenisRekeningLabel)
                            .addComponent(norekJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(norekLabel)
                            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                .addComponent(tahapanRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(goldRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(depositoRadioButton))
                            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(cancleButton1)))
                        .addGap(31, 31, 31))
                    .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                        .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLabel1)
                            .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        rekeningMainPanelLayout.setVerticalGroup(
            rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekeningMainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(mainPanelTitle)
                .addGap(25, 25, 25)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinLabel)
                    .addComponent(findJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(1, 1, 1)
                .addComponent(namaLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(saldoLabel))
                .addGap(12, 12, 12)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nikLabel)
                    .addComponent(jenisRekeningLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nikJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahapanRadioButton)
                    .addComponent(goldRadioButton)
                    .addComponent(depositoRadioButton))
                .addGap(18, 18, 18)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalLahirLabel)
                    .addComponent(norekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(norekJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alamatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rekeningMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton)
                    .addComponent(cancleButton1))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optionToDoCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(rekeningMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(rekeningMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        rekeningPage r = new rekeningPage();

        cs.setVisible(true);
        r.setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        try{
            Nasabah n = nControl.showNasabahby(findJtext.getText());
            if(n == null){
                clearText();
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                namaJtext.setText(n.getNama());
                nikJtext.setText(n.getNik());
                alamatJtext.setText(n.getAlamat());
                pekerjaanJtext.setText(n.getPekerjaan());
                generateNomorRekening();
                
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                jDateChooser.setDateFormatString("yyyy-MM-dd");
                Date tanggalLahir = dateFormat.parse(n.getTanggalLahir());
                jDateChooser.setDate(tanggalLahir);
                setComponent(false);
                saldoJtext.setEnabled(true);
                norekJtext.setEditable(false);
                tahapanRadioButton.setEnabled(true);
                goldRadioButton.setEnabled(true);
                depositoRadioButton.setEnabled(true);
            }
        }catch(Exception e){
            System.out.println("Error:  "+e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       if (jenisButtonGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(registNasabahPanel, "Pilih jenis rekening terlebih dahulu");
            return; // Hentikan eksekusi metode jika tidak ada radio button yang dipilih
        }

        String jenisRekening = jenisButtonGroup.getSelection().getActionCommand();

        try {
            String saldoStr = saldoJtext.getText().trim();
            BigInteger saldo = new BigInteger(saldoStr);

            if (jenisRekening.equals("Tahapan")) {
                Rekening r = new Rekening(norekJtext.getText(), cinJtext.getText(), "Tahapan", saldo);
                rControl.insertRekening(r);
                JOptionPane.showMessageDialog(registNasabahPanel, "Berhasil menambahkan Rekening Baru");
            } else if (jenisRekening.equals("Gold")) {
                BigInteger minimumSaldo = new BigInteger("100000000");
                if (saldo.compareTo(minimumSaldo) >= 0) {
                    Rekening r = new Rekening(norekJtext.getText(), cinJtext.getText(), "Gold", saldo);
                    rControl.insertRekening(r);
                    JOptionPane.showMessageDialog(registNasabahPanel, "Berhasil menambahkan Rekening Baru");
                } else {
                    JOptionPane.showMessageDialog(registNasabahPanel, "Saldo minimum jenis GOLD adalah Rp. 100.000.000,00");
                }
            } else if (jenisRekening.equals("Deposito")) {
                Rekening r = new Rekening(norekJtext.getText(), cinJtext.getText(), "Deposito", saldo);
                rControl.insertRekening(r);
                JOptionPane.showMessageDialog(registNasabahPanel, "Berhasil menambahkan Rekening Baru");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(registNasabahPanel, "Gagal menyimpan data");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tahapanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahapanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahapanRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(rekeningPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rekeningPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rekeningPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rekeningPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rekeningPage().setVisible(true);
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
    private javax.swing.JButton cancleButton1;
    private javax.swing.JTextArea cinJtext;
    private javax.swing.JLabel cinLabel;
    private javax.swing.JRadioButton depositoRadioButton;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JPanel detailNasabahPanel;
    private javax.swing.JTextArea findJtext;
    private javax.swing.JRadioButton goldRadioButton;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.ButtonGroup jenisButtonGroup;
    private javax.swing.JLabel jenisRekeningLabel;
    private javax.swing.JLabel logoDetail;
    private javax.swing.JLabel logoRegNasabah;
    private javax.swing.JLabel logoRekening;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mainPanelTitle;
    private javax.swing.JTextArea namaJtext;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaLabel1;
    private javax.swing.JTextArea nikJtext;
    private javax.swing.JLabel nikLabel;
    private javax.swing.JTextArea norekJtext;
    private javax.swing.JLabel norekLabel;
    private javax.swing.JPanel optionToDoCS;
    private javax.swing.JTextArea pekerjaanJtext;
    private javax.swing.JLabel pekerjaanLabel;
    private javax.swing.JLabel regNasabahLabel;
    private javax.swing.JPanel registNasabahPanel;
    private javax.swing.JLabel rekeningLabel;
    private javax.swing.JPanel rekeningMainPanel;
    private javax.swing.JPanel rekeningPanel;
    private javax.swing.JTextArea saldoJtext;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton tahapanRadioButton;
    private javax.swing.JLabel tanggalLahirLabel;
    // End of variables declaration//GEN-END:variables
}
