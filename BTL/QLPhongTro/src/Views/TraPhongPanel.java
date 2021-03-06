/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.KhachHang_Controller;
import Controllers.PhongKhachDatController;
import Controllers.QLPhongController;
import Helpers.DatabaseHelper;
import Helpers.DatabaseHelper_1;
import Models.KhachHang;
import Models.PhongKhachDat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class TraPhongPanel extends javax.swing.JPanel {

    /**
     * Creates new form TraPhongPanel
     */
    
    DatabaseHelper db= new DatabaseHelper();
    QLPhongController qlPhongDao= new QLPhongController();
    PhongKhachDatController pkdDao = new PhongKhachDatController();
    private DefaultTableModel tblModel = new DefaultTableModel();
    private DefaultTableModel tblModel2 = new DefaultTableModel();
    public TraPhongPanel() {
        initComponents();
        //disableTextBox();
        inittableDangSuDung();
        fillTableDangSuDung();
        inittableDaTraPhong();
        fillTableDaTraPhong();
    }
    private void disableTextBox(){
        txt_maDatPhong.setEnabled(false);
        txt_maPhong.setEnabled(false);
        txt_loaiPhong.setEnabled(false);
        txt_giaPhong.setEnabled(false);
        txt_soCMND.setEnabled(false);
        txt_hoTenKH.setEnabled(false);
        txt_ngayDen.setEnabled(false);
        txtNgayDi.setEnabled(false);
        txtTienCoc.setEnabled(false);
        txt_soNguoiO.setEnabled(false);
        txt_tienTraThem.setEnabled(false);
        txt_tongTien.setEnabled(false);
    }
    private void inittableDangSuDung(){
        String[] column = new String[]{"M?? ?????t ph??ng","M?? ph??ng","S??? CMND","S??? ng?????i ???","Ng??y ?????n","Ng??y ??i","Ti???n c???c","T??nh tr???ng","Ghi ch??"};
        tblModel.setColumnIdentifiers(column);
        tb_KhachDangO.setModel(tblModel);
        
    }
    private void fillTableDangSuDung(){
        try{
            PhongKhachDatController pkdDao = new PhongKhachDatController();
            List<PhongKhachDat> list = pkdDao.fillAllDangSuDung();
            tblModel.setRowCount(0);
            for (PhongKhachDat it : list) {
                tblModel.addRow(new Object[]{it.getMaDatPhong(),it.getMaPhong(),it.getSoCMNDKH()
                ,it.getSoNguoiO(),it.getNgayDen(),it.getNgayDi(),it.getTienCoc(),it.getTinhTrang(),it.getGhiChu()});
            }
            tblModel.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(),"L???i",JOptionPane.ERROR_MESSAGE);
        }
    }
    //table da tra phong
     private void inittableDaTraPhong(){
        String[] column = new String[]{"M?? ?????t ph??ng","M?? ph??ng","S??? CMND","S??? ng?????i ???","Ng??y ?????n","Ng??y ??i","Ti???n c???c","T??nh tr???ng","Ghi ch??"};
        tblModel2.setColumnIdentifiers(column);
        tb_KhachTraPhong.setModel(tblModel2);
        
    }
    private void fillTableDaTraPhong(){
        try{
            PhongKhachDatController pkdDao = new PhongKhachDatController();
            List<PhongKhachDat> list = pkdDao.fillAllDaTraPhong();
            tblModel2.setRowCount(0);
            for (PhongKhachDat it : list) {
                Date ngayDen = new SimpleDateFormat("yyyy-MM-dd").parse(it.getNgayDen()+"");
                Date ngayDi = new SimpleDateFormat("yyyy-MM-dd").parse(it.getNgayDi()+"");
                tblModel2.addRow(new Object[]{it.getMaDatPhong(),it.getMaPhong(),it.getSoCMNDKH()
                ,it.getSoNguoiO(),it.getNgayDen(),it.getNgayDi(),it.getTienCoc(),it.getTinhTrang(),it.getGhiChu()});
            }
            tblModel2.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(),"L???i",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void lamMoi(){
        txt_maDatPhong.setText("");
        txt_maPhong.setText("");
        txt_soCMND.setText("");
        txt_giaPhong.setText("");
        txt_loaiPhong.setText("");
        txt_hoTenKH.setText("");
        txt_ngayDen.setText("");
        txtNgayDi.setText("");
        txtTienCoc.setText("");
        txt_soNguoiO.setText("");
        txt_tienTraThem.setText("");
        txt_tongTien.setText("");
        txtCMNDKH.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_KhachDangO = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtCMNDKH = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_ReLoad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_KhachTraPhong = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_maDatPhong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_maPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_soCMND = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_hoTenKH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_soNguoiO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ngayDen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgayDi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTienCoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_tongTien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_tienTraThem = new javax.swing.JTextField();
        btn_traPhong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_loaiPhong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_giaPhong = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("KH??CH ??ANG THU??");

        tb_KhachDangO.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_KhachDangO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_KhachDangOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_KhachDangO);

        jLabel15.setText("Nh???p s??? CMND kh??ch h??ng:");

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/find.png"))); // NOI18N
        btn_TimKiem.setText("T??m ki???m");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_ReLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh.png"))); // NOI18N
        btn_ReLoad.setText("Reload");
        btn_ReLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtCMNDKH, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_TimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ReLoad)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(362, 362, 362))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCMNDKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem)
                    .addComponent(btn_ReLoad))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tb_KhachTraPhong.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tb_KhachTraPhong);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("KH??CH ???? TR??? PH??NG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(329, 329, 329))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Th??ng tin kh??ch tr??? ph??ng"));

        jLabel4.setText("M?? ?????t ph??ng");

        txt_maDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maDatPhongActionPerformed(evt);
            }
        });

        jLabel5.setText("M?? ph??ng");

        txt_maPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maPhongActionPerformed(evt);
            }
        });

        jLabel6.setText("S??? CMND kh??ch h??ng");

        jLabel7.setText("H??? t??n kh??ch tr???");

        jLabel8.setText("S??? ng?????i ???");

        jLabel9.setText("Ng??y ?????n");

        jLabel10.setText("Ng??y ??i");

        txtNgayDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDiActionPerformed(evt);
            }
        });

        jLabel11.setText("Ti???n c???c");

        jLabel12.setText("T???ng ti???n");

        jLabel13.setText("Ti???n tr??? th??m");

        txt_tienTraThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tienTraThemActionPerformed(evt);
            }
        });

        btn_traPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pay.png"))); // NOI18N
        btn_traPhong.setText("Tr??? ph??ng");
        btn_traPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_traPhongActionPerformed(evt);
            }
        });

        jLabel1.setText("Lo???i ph??ng");

        jLabel14.setText("Gi?? ph??ng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(63, 63, 63))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ngayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_maPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(txt_maDatPhong)
                                .addComponent(txt_soCMND)
                                .addComponent(txt_hoTenKH)
                                .addComponent(txt_soNguoiO)
                                .addComponent(txt_loaiPhong)
                                .addComponent(txt_giaPhong))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_traPhong)
                            .addComponent(txt_tienTraThem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_maDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_hoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_soNguoiO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_tienTraThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_traPhong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maPhongActionPerformed

    private void txtNgayDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDiActionPerformed

    private void txt_tienTraThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tienTraThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tienTraThemActionPerformed

    private void btn_traPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_traPhongActionPerformed
        // TODO add your handling code here:
        if(txt_maDatPhong.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Vui l??ng ch???n 1 kh??ch h??ng c???n tr??? ph??ng!", "Th??ng b??o", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(null, "X??c nh???n tr??? ph??ng?", "Th??ng b??o", JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            qlPhongDao.upDatePhongKD(txt_maDatPhong.getText().trim());
            pkdDao.upDatePhongKD(txt_maDatPhong.getText().trim());
            JOptionPane.showMessageDialog(null, "Tr??? ph??ng th??nh c??ng! ","Th??ng b??o",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //pkdDao.upDateNgayDiHT(txt_maDatPhong.getText(), ngayDiDuTinh);
        }
        fillTableDaTraPhong();
        fillTableDangSuDung();
        lamMoi();
    }//GEN-LAST:event_btn_traPhongActionPerformed
    PhongKhachDat pkd = new PhongKhachDat();
    String ngayDiDuTinh=null;
    private void tb_KhachDangOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_KhachDangOMouseClicked
        // TODO add your handling code here:
        try{
            int index = tb_KhachDangO.getSelectedRow();
            pkd=pkdDao.fillByMaDatPhong(tb_KhachDangO.getValueAt(index, 0).toString());
//            ngayDiDuTinh= pkd.getNgayDi();
//            System.out.println(ngayDiDuTinh);
//            Calendar ct = Calendar.getInstance();
//            Date cd= ct.getTime();
//            SimpleDateFormat smf= new SimpleDateFormat("yyyy-MM-dd");
//            String NgayDi=null;
//            NgayDi=smf.format(cd);
//            pkdDao.upDateNgayDiHT(txt_maDatPhong.getText(), NgayDi.toString());
            String sql = "SELECT MaDatPhong,Phong_Khach_Dat.MaPhong,LoaiPhong,GiaPhong,Phong_Khach_Dat.SoCMNDKH,HoTenKH,SoNguoiO,NgayDen,NgayDi,TienCoc,((CONVERT(float,NgayDi-NgayDen)+1)*GiaPhong) AS 'TongTien'"
                         +" FROM Phong_Khach_Dat INNER JOIN Phong ON Phong.MaPhong=Phong_Khach_Dat.MaPhong"
                         +" INNER JOIN KhachHang ON KhachHang.SoCMNDKH=Phong_Khach_Dat.SoCMNDKH"
                         +" WHERE MaDatPhong=?";
            try(
                    Connection con = db.getConnection() ;
                    PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,tb_KhachDangO.getValueAt(index, 0).toString());
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        txt_maDatPhong.setText(rs.getString("MaDatPhong"));
                        txt_maPhong.setText(rs.getString("MaPhong"));
                        txt_loaiPhong.setText(rs.getString("LoaiPhong"));
                        txt_giaPhong.setText(rs.getString("GiaPhong"));
                        txt_soCMND.setText(rs.getString("SoCMNDKH"));
                        txt_hoTenKH.setText(rs.getString("HoTenKH"));
                        txt_soNguoiO.setText(rs.getString("SoNguoiO"));
                        txt_ngayDen.setText(rs.getString("NgayDen"));
                        txtNgayDi.setText(rs.getString("NgayDi"));;
                        txtTienCoc.setText(rs.getString("TienCoc"));
                        txt_tongTien.setText(rs.getString("TongTien"));
                        txt_tienTraThem.setText(""+(Float.parseFloat(txt_tongTien.getText())-Float.parseFloat(txtTienCoc.getText())));
//                        txtSoTienCanTraThem.setText(""+(Float.parseFloat(lblTongTien.getText())-Float.parseFloat(txtTienCoc.getText())));
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(ad, e.getMessage(), "L???i", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_KhachDangOMouseClicked

    private void txt_maDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maDatPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maDatPhongActionPerformed

    private void btn_ReLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReLoadActionPerformed
        // TODO add your handling code here:
        lamMoi();
        fillTableDangSuDung();
        fillTableDaTraPhong();
    }//GEN-LAST:event_btn_ReLoadActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
        ArrayList<PhongKhachDat> lstCanTim= new ArrayList();
        lstCanTim=pkdDao.findHoaDonKH(txtCMNDKH.getText().trim());
        if(lstCanTim.size()==0){
            JOptionPane.showMessageDialog(null, "Kh??ng t???n t???i th??ng tin ?????t ph??ng c???a kh??ch h??ng n??y ho???c b???n nh???p sai CMND c???a kh??ch h??ng", "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        tblModel.setRowCount(0);
        for (PhongKhachDat it : lstCanTim) {
            try {
                Date ngayDen = new SimpleDateFormat("yyyy-MM-dd").parse(it.getNgayDen()+"");
                Date ngayDi = new SimpleDateFormat("yyyy-MM-dd").parse(it.getNgayDi()+"");
                tblModel.addRow(new Object[]{it.getMaDatPhong(),it.getMaPhong(),it.getSoCMNDKH()
                        ,it.getSoNguoiO(),it.getNgayDen(),it.getNgayDi(),it.getTienCoc(),it.getTinhTrang(),it.getGhiChu()});
            } catch (ParseException ex) {
                Logger.getLogger(TraPhongPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            tblModel.fireTableDataChanged();
    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ReLoad;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_traPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tb_KhachDangO;
    private javax.swing.JTable tb_KhachTraPhong;
    private javax.swing.JTextField txtCMNDKH;
    private javax.swing.JTextField txtNgayDi;
    private javax.swing.JTextField txtTienCoc;
    private javax.swing.JTextField txt_giaPhong;
    private javax.swing.JTextField txt_hoTenKH;
    private javax.swing.JTextField txt_loaiPhong;
    private javax.swing.JTextField txt_maDatPhong;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_ngayDen;
    private javax.swing.JTextField txt_soCMND;
    private javax.swing.JTextField txt_soNguoiO;
    private javax.swing.JTextField txt_tienTraThem;
    private javax.swing.JTextField txt_tongTien;
    // End of variables declaration//GEN-END:variables
}
