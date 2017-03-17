
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 8.1
 */
public class tabel_Penumpang extends javax.swing.JFrame {

    /**
     * Creates new form tabel_Penumpang
     */
    public tabel_Penumpang() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lokasiawal = new javax.swing.JComboBox<>();
        LokasiTujuan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rEkonomi = new javax.swing.JRadioButton();
        rEksekutif = new javax.swing.JRadioButton();
        rBisnis = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        waktuberangkat = new javax.swing.JComboBox<>();
        tempatduduk = new javax.swing.JComboBox<>();
        btn_Save = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setForeground(new java.awt.Color(204, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        jLabel4.setFont(new java.awt.Font("Sakkal Majalla", 1, 36)); // NOI18N
        jLabel4.setText("Daftar penumpang");

        jLabel2.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel2.setText("Nama :");

        nama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel3.setText("NO ID KTP : ");

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel5.setText("Stasiun Awal :");

        lokasiawal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lokasiawal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Lokasi Awal ---", "Malang", "Surabaya", "Sidoarjo", "Jember", "Jombang", "Jakarta", "Bandung", "Jogja", "Kediri", "Lawang", "Blitar" }));

        LokasiTujuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LokasiTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Lokasi Tujan ---", "Malang", "Surabaya", "Sidoarjo", "Jember", "Jombang", "Jakarta", "Bandung", "Jogja", "Kediri", "Lawang", "Blitar" }));

        jLabel10.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel10.setText("Stasiun Tujuan :");

        jLabel9.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel9.setText("Tempat Duduk : ");

        jLabel8.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel8.setText("Waktu Berangkat : ");

        jLabel6.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel6.setText("Tanggal Berangkat :");

        jLabel7.setFont(new java.awt.Font("Sakkal Majalla", 1, 24)); // NOI18N
        jLabel7.setText("Jenis Kereta : ");

        buttonGroup1.add(rEkonomi);
        rEkonomi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rEkonomi.setText("Ekonomi");

        buttonGroup1.add(rEksekutif);
        rEksekutif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rEksekutif.setText("Eksekutif");

        buttonGroup1.add(rBisnis);
        rBisnis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rBisnis.setText("Bisnis");

        waktuberangkat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        waktuberangkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- Pilih Waktu Berangkat -----", "Pagi ", "Siang ", "Sore ", "Malam ", " " }));

        tempatduduk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tempatduduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- Pilih tempat duduk anda -----", "Gerbong 1 ", "Gerbong 2 ", "Gerbong 3 ", "Gerbong 4 ", "Gerbong 5" }));

        btn_Save.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel4)))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lokasiawal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel7))
                                .addComponent(jLabel6))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(80, 80, 80)
                                            .addComponent(rEksekutif))
                                        .addComponent(rEkonomi))
                                    .addGap(1, 1, 1)
                                    .addComponent(rBisnis))
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(jLabel8)
                            .addGap(19, 19, 19)
                            .addComponent(waktuberangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(25, 25, 25)
                            .addComponent(LokasiTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel9)
                            .addGap(20, 20, 20)
                            .addComponent(tempatduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lokasiawal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 70, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rEksekutif)
                                .addComponent(rEkonomi)
                                .addComponent(rBisnis))
                            .addGap(25, 25, 25)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(waktuberangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(LokasiTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(tempatduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 77, Short.MAX_VALUE)))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Stasiun Awal ", "Stasiun Tujan", "Tanggal", "Jenis Kereta", "Waktu Berangkat", "Tempat Duduk", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_delete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Data Penumpang");

        btn_edit.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(290, 353, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 352, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 770));

        setBounds(0, 0, 948, 641);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Data Penumpang Stasiun saya");
        MessageFormat footer = new MessageFormat("Copyright @Prasetya");
        
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,null,true,null);   
        } catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String tanggal = dateFormat.format(jDateChooser1.getDate());
    String harga = "";
    String JK = "";
            if(rEkonomi.isSelected()){
                JK = "Ekonomi";
                harga = "Rp.50000";
            }else if(rEksekutif.isSelected()){
                JK = "Eksekutif";
                harga = "Rp.100.000";
            }else{
                JK = "Bisnis";
                harga = "Rp.75.000";
            }    
         if("".equals(id.getText()) || 
            "".equals(nama.getText()) || 
                  "--- Pilih Lokasi Awal ---".equals(lokasiawal.getSelectedItem()) || 
                  "--- Pilih Lokasi Tujan ---".equals(LokasiTujuan.getSelectedItem()) ||
                  "----- Pilih Waktu Berangkat -----".equals(waktuberangkat.getSelectedItem()) ||
                  "----- Pilih tempat duduk anda -----".equals(tempatduduk.getSelectedItem())||
                 JK.equals(""))
            {
    JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
    }else {
       
        
        String SQL = "INSERT INTO tb_penumpang "
                + "(`id`,`nama`,`stasiun_awal`,`stasiun_tujuan`,`tanggal`,`jenis_kereta`,`waktu_berangkat`,`tempat_duduk`,`harga`)"
                + "VALUES('"+id.getText()+"','"
                +nama.getText()+"','"
                +lokasiawal.getSelectedItem()+"','"
                +LokasiTujuan.getSelectedItem()+"','"
                +tanggal+"','"
                +JK+"','"
                +waktuberangkat.getSelectedItem()+"','"
                +tempatduduk.getSelectedItem()+"','"
                +harga+"')";
        int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
   
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
       selectData();         // TODO add your handling code here:
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
    id.setText("");
    nama.setText("");
    buttonGroup1.clearSelection();
    lokasiawal.setSelectedItem("--- Pilih Lokasi Awal ---");
    LokasiTujuan.setSelectedItem("--- Pilih Lokasi Tujan ---");
    waktuberangkat.setSelectedItem("----- Pilih Waktu Berangkat -----");
    tempatduduk.setSelectedItem("----- Pilih tempat duduk anda -----");
    
// TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
    int baris = jTable1.getSelectedRow();
        if (baris != -1){
            String no_id = jTable1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_penumpang WHERE id='"+no_id+"'";
            int status = KoneksiDB.execute(SQL);
                if(status==1){
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
                
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih baris data terlebih dahulu","Error", JOptionPane.WARNING_MESSAGE);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String tanggal = dateFormat.format(jDateChooser1.getDate());
    String harga = "";
    String JK = "";
            if(rEkonomi.isSelected()){
                JK = "Ekonomi";
                harga = "Rp.50000";
            }else if(rEksekutif.isSelected()){
                JK = "Eksekutif";
                harga = "Rp.100.000";
            }else{
                JK = "Bisnis";
                harga = "Rp.75.000";
            }    
         if("".equals(id.getText()) || 
            "".equals(nama.getText()) || 
                  "--- Pilih Lokasi Awal ---".equals(lokasiawal.getSelectedItem()) || 
                  "--- Pilih Lokasi Tujan ---".equals(LokasiTujuan.getSelectedItem()) ||
                  "----- Pilih Waktu Berangkat -----".equals(waktuberangkat.getSelectedItem()) ||
                  "----- Pilih tempat duduk anda -----".equals(tempatduduk.getSelectedItem())||
                 JK.equals(""))
            {
    JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
    }else {
       
        
        String SQL = "UPDATE `tb_penumpang` SET "
                +"WHERE id='"+id.getText()+"','"
                +"WHERE nama='"+nama.getText()+"','"
                +"WHERE stasiun_awal='"+lokasiawal.getSelectedItem()+"','"
                +"WHERE stasiun_tujuan='"+LokasiTujuan.getSelectedItem()+"','"
                +"WHERE tanggal='"+tanggal+"','"
                +"WHERE jenis_kereta='"+JK+"','"
                +"WHERE waktu_berangkat='"+waktuberangkat.getSelectedItem()+"','"
                +"WHERE tempat_duduk='"+tempatduduk.getSelectedItem()+"','"
                +"WHERE harga='"+harga+"')";  
        
       int status = KoneksiDB.execute(SQL);
       if(status==0){
           JOptionPane.showMessageDialog(this,"Data berhasil diupdate","Sukses",JOptionPane.INFORMATION_MESSAGE);
           selectData();
       }else {
           JOptionPane.showMessageDialog(this,"Data gagal diupdate","Sukses",JOptionPane.WARNING_MESSAGE);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed
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
            java.util.logging.Logger.getLogger(tabel_Penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabel_Penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabel_Penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabel_Penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabel_Penumpang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LokasiTujuan;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> lokasiawal;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rBisnis;
    private javax.swing.JRadioButton rEkonomi;
    private javax.swing.JRadioButton rEksekutif;
    private javax.swing.JComboBox<String> tempatduduk;
    private javax.swing.JComboBox<String> waktuberangkat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"id","Nama","Stasiun Awal","Stasiun Tujuan","Tanggal","Jenis Kereta","Waktu Berangkat","Tempat Duduk","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_penumpang";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String Stasiun_awal = rs.getString(3);
                String Stasiun_tujuan = rs.getString(4);
                String Tanggal = rs.getString(5);
                String JenisKereta = "";
                if("Ekonomi".equals(rs.getString(6))){
                    JenisKereta="Ekonomi";
                }else if("Eksekutif".equals(rs.getString(6))){
                    JenisKereta = "Eksekutif";
                }else{
                    JenisKereta = "Bisnis";
                }
                String Waktu_berangkat = rs.getString(7);
                String Tempat_duduk = rs.getString(8);
                String Harga = rs.getString(9);
               
                String data[] = {id,nama,Stasiun_awal,Stasiun_tujuan,Tanggal,JenisKereta,Waktu_berangkat,Tempat_duduk,Harga};
                dtm.addRow(data);
            }
        }catch(SQLException ex){
            Logger.getLogger(tabel_Penumpang.class.getName()).log(Level.SEVERE,null,ex);
        }
        jTable1.setModel(dtm);
    }
}
