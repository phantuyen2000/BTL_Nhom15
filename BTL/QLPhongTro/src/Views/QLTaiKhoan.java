/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.QLPhongController;
import Controllers.TaiKhoanController;
import Helpers.DatabaseHelper;
import Models.CustomTaiKhoan;
import Models.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QLTaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form QLTaiKhoan
     */
    ArrayList<TaiKhoan> lstTaiKhoan = new ArrayList<>();
    TaiKhoanController tkDao= new TaiKhoanController();
    public QLTaiKhoan() {
        initComponents();
        loadMaNV();
        loadData();
    }
    public void loadData(){
        lstTaiKhoan=tkDao.showTaiKhoan();
        tb_TaiKhoan.setModel(new CustomTaiKhoan(lstTaiKhoan));
        loadMaNV();
    }
    DatabaseHelper db = new DatabaseHelper();
    Connection con = db.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    public void loadMaNV(){
        cbb_maNV.removeAllItems();
        try {
            String sql = "Select MaNV from NhanVien";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cbb_maNV.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoaTrang(){
        txt_tenDN.setText("");
        txt_matKhau.setText("");
        txt_quyen.setText("");
        txt_tenDN.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_tenDN = new javax.swing.JTextField();
        txt_matKhau = new javax.swing.JTextField();
        txt_quyen = new javax.swing.JTextField();
        cbb_maNV = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TaiKhoan = new javax.swing.JTable();

        jLabel3.setText("T??n ????ng nh???p:");

        txt_quyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quyenActionPerformed(evt);
            }
        });

        jLabel4.setText("M???t kh???u:");

        jLabel5.setText("Quy???n:");

        jLabel6.setText("M?? nh??n vi??n:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbb_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        btn_them.setText("Th??m m???i");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        btn_sua.setText("S???a");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        btn_xoa.setText("X??a");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh.png"))); // NOI18N
        btn_reload.setText("Reload");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        jLabel2.setText("M?? NV:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/find.png"))); // NOI18N
        jButton1.setText("T??m");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_reload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        tb_TaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TaiKhoan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_quyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quyenActionPerformed

    private void tb_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TaiKhoanMouseClicked
        // TODO add your handling code here:
        int index=tb_TaiKhoan.getSelectedRow();
        txt_tenDN.setText(""+tb_TaiKhoan.getValueAt(index, 0));
        txt_matKhau.setText(""+tb_TaiKhoan.getValueAt(index, 1));
        txt_quyen.setText(""+tb_TaiKhoan.getValueAt(index, 2));
        cbb_maNV.setSelectedItem(""+tb_TaiKhoan.getValueAt(index, 3));
    }//GEN-LAST:event_tb_TaiKhoanMouseClicked

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        // TODO add your handling code here:
        lstTaiKhoan.removeAll(lstTaiKhoan);
        loadData();
        xoaTrang();
        loadMaNV();
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        try {
            if(txt_tenDN.getText().trim().equals("")||txt_matKhau.getText().trim().equals("")||txt_quyen.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "T??n ????ng nh???p, m???t kh???u v?? quy???n kh??ng ???????c ????? tr???ng");
                return;
            }
            int dem=0;
            Iterator<TaiKhoan> it = lstTaiKhoan.iterator();
            while (it.hasNext()) {
                TaiKhoan next = it.next();
                if(next.getTenDangNhap().trim().equals(txt_tenDN.getText().trim())||next.getMaNV().trim().equals(cbb_maNV.getSelectedItem().toString())){
                    dem++;
                }
            }
            if(dem==0){
                lstTaiKhoan.removeAll(lstTaiKhoan);
                tkDao.insertTaiKhoan(txt_tenDN.getText().trim(), txt_matKhau.getText().trim(),txt_quyen.getText().trim(),cbb_maNV.getSelectedItem().toString());
                loadData();
                JOptionPane.showMessageDialog(null, "Th??m th??nh c??ng");
            }
            else{
                JOptionPane.showMessageDialog(null, "T??n ????ng nh???p ???? t???n t???i ho???c nh??n vi??n ???? c?? t??i kho???n tr??n h??? th???ng!");
                return;
            }
            xoaTrang();
        }
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
         try {
            if(txt_tenDN.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Vui l??ng click v??o 1 d??ng ????? s???a ho???c nh???p t??n t??i kho???n c???n s???a");
                return;
            }
            if(txt_matKhau.getText().trim().equals("")||txt_quyen.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Vui l??ng nh???p th??ng tin cho t??i kho???n c???n s???a");
                return;
            }
            int dem=0;
            Iterator<TaiKhoan> it = lstTaiKhoan.iterator();
            while (it.hasNext()) {
                TaiKhoan next = it.next();
                if(next.getTenDangNhap().trim().equals(txt_tenDN.getText().trim())){
                    dem++;
                }
            }
            if(dem!=0){
                lstTaiKhoan.removeAll(lstTaiKhoan);
                tkDao.updateTaiKhoan(txt_tenDN.getText().trim(), txt_matKhau.getText().trim(),txt_quyen.getText().trim(),cbb_maNV.getSelectedItem().toString());
                loadData();
                JOptionPane.showMessageDialog(null, "S???a th??nh c??ng");
            }
            else{
                JOptionPane.showMessageDialog(null, "T??n ????ng nh???p kh??ng t???n t???i");
                //loadData();
                return;
            }
            xoaTrang();
        }
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btn_suaMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            if(txt_tenDN.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n ????ng nh???p ho???c click v??o 1 d??ng ????? x??a");
                return;
            }
            int dem=0;
            Iterator<TaiKhoan> it = lstTaiKhoan.iterator();
            while (it.hasNext()) {
                TaiKhoan next = it.next();
                if(next.getTenDangNhap().trim().equals(txt_tenDN.getText().trim())){
                    if(next.getQuyen()==1){
                        JOptionPane.showMessageDialog(null, "Kh??ng th??? x??a t??i kho???n admin n??y!","Th??ng b??o",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    dem++;
                }
            }
            if(dem>0){
                lstTaiKhoan.removeAll(lstTaiKhoan);
                if(JOptionPane.showConfirmDialog(this, "X??c nh???n", "X??a t??i kho???n n??y?", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                tkDao.deteleTaiKhoan(txt_tenDN.getText().trim());
                loadData();
                JOptionPane.showMessageDialog(null, "X??a th??nh c??ng");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "T??n ????ng nh???p kh??ng t???n t???i");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        xoaTrang();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<TaiKhoan> lstCanTim=new ArrayList<>();
            // TODO add your handling code here
            if(txtMaNV.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Vui l??ng nh???p m?? nh??n vi??n c???n t??m");
                return;
            }
            int dem=0;
            Iterator<TaiKhoan> it = lstTaiKhoan.iterator();
            while (it.hasNext()) {
                TaiKhoan next = it.next();
                if(next.getMaNV().trim().equals(txtMaNV.getText().trim())){
                    dem++;
                }
            }
            if(dem>0){
                    lstCanTim=tkDao.findTaiKhoan(txtMaNV.getText().trim());
                    tb_TaiKhoan.setModel(new CustomTaiKhoan(lstCanTim));
                    JOptionPane.showMessageDialog(null, "Nh??n vi??n n??y ???? t??i kho???n ????ng nh???p"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Kh??ng t???n t???i nh??n vi??n n??y ho???c nh??n vi??n ch??a c?? t??i kho???n ????ng nh???p");
            }
            xoaTrang();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        txtMaNV.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_maNV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb_TaiKhoan;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txt_matKhau;
    private javax.swing.JTextField txt_quyen;
    private javax.swing.JTextField txt_tenDN;
    // End of variables declaration//GEN-END:variables
}
