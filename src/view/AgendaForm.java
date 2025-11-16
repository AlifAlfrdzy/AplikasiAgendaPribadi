package view;

import controller.AgendaController;
import model.Agenda;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import java.util.Locale;

public class AgendaForm extends javax.swing.JFrame {
    
    AgendaController controller = new AgendaController();
    
    public AgendaForm() {
        initComponents();
        tampilkanDataDB();
        
        DefaultTableCellRenderer headerRenderer =
            (DefaultTableCellRenderer) tblAgenda.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        tblAgenda.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Tanggal
        tblAgenda.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Kategori
        tblAgenda.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Deskripsi
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelLeft = new javax.swing.JPanel();
        panelForm = new javax.swing.JPanel();
        lblTanggal = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();
        lblDeskripsi = new javax.swing.JLabel();
        scrollDeskripsi = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        lblCari = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblHari = new javax.swing.JLabel();
        txtHari = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        panelHeader.setBackground(new java.awt.Color(0, 0, 51));
        panelHeader.setPreferredSize(new java.awt.Dimension(900, 70));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("APLIKASI AGENDA PRIBADI");
        panelHeader.add(lblTitle);

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelLeft.setBackground(new java.awt.Color(102, 102, 102));
        panelLeft.setPreferredSize(new java.awt.Dimension(380, 274));

        panelForm.setBackground(new java.awt.Color(102, 102, 102));
        panelForm.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        lblTanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggal.setText("Tanggal");

        lblKategori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKategori.setForeground(new java.awt.Color(255, 255, 255));
        lblKategori.setText("Kategori");

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pribadi", "Kampus", "Kerja", "Acara" }));

        lblDeskripsi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeskripsi.setForeground(new java.awt.Color(255, 255, 255));
        lblDeskripsi.setText("Deskripsi");

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(4);
        scrollDeskripsi.setViewportView(txtDeskripsi);

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(0, 0, 0));
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(0, 0, 0));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(255, 255, 255));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(0, 0, 0));
        btnExport.setText("EXPORT");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(255, 255, 255));
        btnImport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImport.setForeground(new java.awt.Color(0, 0, 0));
        btnImport.setText("IMPORT");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(0, 0, 0));
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTanggalPropertyChange(evt);
            }
        });

        lblCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCari.setForeground(new java.awt.Color(255, 255, 255));
        lblCari.setText("Cari");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblHari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHari.setForeground(new java.awt.Color(255, 255, 255));
        lblHari.setText("Hari");

        txtHari.setEditable(false);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnImport))
                                    .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCari)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKategori)
                                    .addComponent(lblDeskripsi)
                                    .addComponent(lblHari)
                                    .addComponent(lblTanggal))
                                .addGap(18, 18, 18)
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollDeskripsi)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHari))))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHari)
                    .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKategori))
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblDeskripsi)))
                .addGap(24, 24, 24)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus)
                    .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah)
                        .addComponent(btnEdit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImport)
                    .addComponent(btnExport)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCari)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        getContentPane().add(panelLeft, java.awt.BorderLayout.WEST);

        panelTable.setBackground(new java.awt.Color(102, 102, 102));

        scrollTable.setBackground(new java.awt.Color(102, 102, 102));

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal", "Hari", "Kategori", "Deskripsi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendaMouseClicked(evt);
            }
        });
        scrollTable.setViewportView(tblAgenda);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTable)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        getContentPane().add(panelTable, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tampilkanDataDB() {
        DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
        model.setRowCount(0);

        for (Agenda a : controller.getData()) {
            model.addRow(new Object[]{
                a.getTanggal(),
                a.getHari(),
                a.getKategori(),
                a.getDeskripsi()
            });
        }
    }
    
    private String getHariDariTanggal(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", new Locale("id", "ID"));
        return sdf.format(date);
    }
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggal = sdf.format(txtTanggal.getDate());
        
        String hari = txtHari.getText();

        Agenda a = new Agenda(
            tanggal,
            hari,
            cmbKategori.getSelectedItem().toString(),
            txtDeskripsi.getText()
        );

        controller.tambah(a);
        tampilkanDataDB();
        resetForm();

        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = tblAgenda.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggal = sdf.format(txtTanggal.getDate());
        
        String hari = txtHari.getText();

        Agenda a = new Agenda(
            tanggal,
            hari,
            cmbKategori.getSelectedItem().toString(),
            txtDeskripsi.getText()
        );

        controller.edit(row, a);
        tampilkanDataDB();

        JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tblAgenda.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
            return;
        }

        controller.hapus(row);
        tampilkanDataDB();
        resetForm();

        JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
        int row = tblAgenda.getSelectedRow();
        if (row == -1) return;

        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(
                tblAgenda.getValueAt(row, 0).toString()
            );
            txtTanggal.setDate(date);
        } catch (Exception e) {}

        // hari otomatis dari tabel (kolom 1)
        txtHari.setText(tblAgenda.getValueAt(row, 1).toString());

        // kategori (kolom 2)
        cmbKategori.setSelectedItem(tblAgenda.getValueAt(row, 2).toString());

        // deskripsi (kolom 3)
        txtDeskripsi.setText(tblAgenda.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblAgendaMouseClicked

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        exportTXT();
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        importTXT();
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        int pilih = JOptionPane.showConfirmDialog(
            this,
            "Yakin ingin keluar?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION
        );

        if (pilih == JOptionPane.YES_OPTION) {
            dispose(); // menutup jendela
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String keyword = txtSearch.getText().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
        model.setRowCount(0); // bersihkan tabel

        for (Agenda a : controller.getData()) {
            if (a.getTanggal().toLowerCase().contains(keyword) ||
                a.getHari().toLowerCase().contains(keyword) ||
                a.getKategori().toLowerCase().contains(keyword) ||
                a.getDeskripsi().toLowerCase().contains(keyword)) {

                model.addRow(new Object[]{
                    a.getTanggal(),
                    a.getHari(),
                    a.getKategori(),
                    a.getDeskripsi()
                });
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtTanggal.setDate(null);     // kosongkan tanggal
        txtDeskripsi.setText("");     // kosongkan deskripsi
        cmbKategori.setSelectedIndex(0);
        txtHari.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTanggalPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = txtTanggal.getDate();
            if (selectedDate != null) {
                String hari = getHariDariTanggal(selectedDate);
                txtHari.setText(hari);
            }
        }
    }//GEN-LAST:event_txtTanggalPropertyChange

    private void tampilkanData() {
        DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
        model.setRowCount(0);

        for (Agenda a : controller.getData()) {
            model.addRow(new Object[]{
                a.getTanggal(),
                a.getHari(),
                a.getKategori(),
                a.getDeskripsi()
            });
        }
    }

    private void resetForm() {
        txtTanggal.setDate(null);
        cmbKategori.setSelectedIndex(0);
        txtDeskripsi.setText("");
        txtSearch.setText("");
        txtHari.setText("");
    }

    private void exportTXT() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Simpan data agenda ke file .txt");
        fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));

        int result = fc.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fc.getSelectedFile();

            // jika user tidak menulis .txt di akhir → tambahkan otomatis
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }

            try {
                FileWriter fw = new FileWriter(file);

                for (Agenda a : controller.getData()) {
                    fw.write(
                        a.getTanggal() + ";" +
                        a.getHari() + ";" + 
                        a.getKategori() + ";" +
                        a.getDeskripsi().replace("\n", "\\n") + "\n"
                    );
                }

                fw.close();
                JOptionPane.showMessageDialog(this,
                        "Export berhasil!\nDisimpan ke: " + file.getAbsolutePath());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal export: " + e.getMessage());
            }
        }
    }

    private void importTXT() {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Pilih file agenda (.txt)");
        fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));

        int result = fc.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                controller.getData().clear(); // kosongkan data lama

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(";");
                    if (data.length >= 4) {
                        
                        String tanggal      = data[0];
                        String hari         = data[1];   // ← LETAK YANG BENAR
                        String kategori     = data[2];
                        String deskripsi    = data[3];
                        
                        controller.tambah(new Agenda(
                            tanggal,
                            hari,
                            kategori,
                            deskripsi
                        ));
                    }
                }

                br.close();
                tampilkanData();
                JOptionPane.showMessageDialog(this, "Import berhasil dari:\n" + file.getName());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal import: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel lblCari;
    private javax.swing.JLabel lblDeskripsi;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelTable;
    private javax.swing.JScrollPane scrollDeskripsi;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}
