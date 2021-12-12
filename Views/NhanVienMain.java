/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class NhanVienMain extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienMain
     */
    private XemPhongPanel xpPanel;
    private XuatHoaDonPanel XHD;
    private QLKhachThuePanel QLKH;
    private KhoaPhong kKhoaPhong;
    private TraPhongPanel traPhongPanel;
    private QuanLyDatPhong_Panel mouseQuanLyDatPhong;
    public NhanVienMain() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_xemPhong = new javax.swing.JButton();
        btn_traPhong = new javax.swing.JButton();
        btn_khoaPhong = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_QLKhachThue = new javax.swing.JButton();
        btn_QLDatPhong = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_dangXuat = new javax.swing.JButton();
        tbpNhanVienMain = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_DangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnu_Thoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnu_xemPhong = new javax.swing.JMenuItem();
        mnu_TraPhong = new javax.swing.JMenuItem();
        mnu_KhoaPhong = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnu_QLKhachHang = new javax.swing.JMenuItem();
        mnu_QLDatPhong = new javax.swing.JMenuItem();
        mnu_xuatHD = new javax.swing.JMenu();
        mnu_XuatHD = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnu_TroGiup = new javax.swing.JMenuItem();
        mnu_gioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu chính của Nhân viên");

        jToolBar1.setRollover(true);

        btn_xemPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/view.png"))); // NOI18N
        btn_xemPhong.setText("Xem phòng");
        btn_xemPhong.setFocusable(false);
        btn_xemPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_xemPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_xemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_xemPhong);

        btn_traPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pay.png"))); // NOI18N
        btn_traPhong.setText("Trả phòng");
        btn_traPhong.setFocusable(false);
        btn_traPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_traPhong.setName(""); // NOI18N
        btn_traPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_traPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_traPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_traPhong);

        btn_khoaPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N
        btn_khoaPhong.setText("Khóa phòng");
        btn_khoaPhong.setFocusable(false);
        btn_khoaPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_khoaPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_khoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoaPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_khoaPhong);
        jToolBar1.add(jSeparator3);

        btn_QLKhachThue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer.png"))); // NOI18N
        btn_QLKhachThue.setText("Quản lý khách thuê");
        btn_QLKhachThue.setFocusable(false);
        btn_QLKhachThue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_QLKhachThue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_QLKhachThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLKhachThueActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_QLKhachThue);

        btn_QLDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/order_room.png"))); // NOI18N
        btn_QLDatPhong.setText("Quản lý đặt phòng");
        btn_QLDatPhong.setFocusable(false);
        btn_QLDatPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_QLDatPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_QLDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLDatPhongActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_QLDatPhong);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator4);

        btn_dangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        btn_dangXuat.setText("Đăng xuất");
        btn_dangXuat.setFocusable(false);
        btn_dangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_dangXuat);

        jMenu1.setText("Hệ thống");

        mnu_DangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        mnu_DangXuat.setText("Đăng xuất");
        jMenu1.add(mnu_DangXuat);
        jMenu1.add(jSeparator1);

        mnu_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/turn-off.png"))); // NOI18N
        mnu_Thoat.setText("Thoát");
        jMenu1.add(mnu_Thoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tác vụ phòng");

        mnu_xemPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/view.png"))); // NOI18N
        mnu_xemPhong.setText("Xem phòng");
        mnu_xemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_xemPhongActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_xemPhong);

        mnu_TraPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pay.png"))); // NOI18N
        mnu_TraPhong.setText("Trả phòng");
        mnu_TraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_TraPhongActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_TraPhong);

        mnu_KhoaPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N
        mnu_KhoaPhong.setText("Khóa phòng");
        mnu_KhoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_KhoaPhongActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_KhoaPhong);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Quản lý");

        mnu_QLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer.png"))); // NOI18N
        mnu_QLKhachHang.setText("Quản lý khách hàng");
        mnu_QLKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_QLKhachHangActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_QLKhachHang);

        mnu_QLDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/order_room.png"))); // NOI18N
        mnu_QLDatPhong.setText("Quản lý đặt phòng");
        mnu_QLDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_QLDatPhongActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_QLDatPhong);

        jMenuBar1.add(jMenu3);

        mnu_xuatHD.setText("Xuất hóa đơn");

        mnu_XuatHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/printer.png"))); // NOI18N
        mnu_XuatHD.setText("Xuất hóa đơn");
        mnu_XuatHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_XuatHDActionPerformed(evt);
            }
        });
        mnu_xuatHD.add(mnu_XuatHD);

        jMenuBar1.add(mnu_xuatHD);

        jMenu4.setText("Trợ giúp");

        mnu_TroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N
        mnu_TroGiup.setText("Nội dung trợ giúp");
        mnu_TroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_TroGiupActionPerformed(evt);
            }
        });
        jMenu4.add(mnu_TroGiup);

        mnu_gioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/infor.png"))); // NOI18N
        mnu_gioiThieu.setText("Giới thiệu");
        mnu_gioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_gioiThieuActionPerformed(evt);
            }
        });
        jMenu4.add(mnu_gioiThieu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addComponent(tbpNhanVienMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpNhanVienMain, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_QLKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_QLKhachHangActionPerformed
        // TODO add your handling code here:
        btn_QLKhachThueActionPerformed(evt);
    }//GEN-LAST:event_mnu_QLKhachHangActionPerformed

    private void mnu_TroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_TroGiupActionPerformed
        // TODO add your handling code here:
        NDTroGiupDialog ndDialog = new NDTroGiupDialog(this, true);
        ndDialog.setVisible(true);
    }//GEN-LAST:event_mnu_TroGiupActionPerformed

    private void mnu_gioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_gioiThieuActionPerformed
        // TODO add your handling code here:
        GioiThieuDialog gioiThieuDialog = new GioiThieuDialog(this, true);
        gioiThieuDialog.setVisible(true);
    }//GEN-LAST:event_mnu_gioiThieuActionPerformed

    private void btn_QLKhachThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLKhachThueActionPerformed
        // TODO add your handling code here:
        if(QLKH==null){
            QLKH = new QLKhachThuePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/customer.png"));
            tbpNhanVienMain.addTab("Quản Lý Khách Hàng", icon, QLKH, "Quản Lý Khách Hàng");
        }
        tbpNhanVienMain.setSelectedComponent(QLKH);
    }//GEN-LAST:event_btn_QLKhachThueActionPerformed

    private void mnu_xemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_xemPhongActionPerformed
        // TODO add your handling code here:
        if(xpPanel == null){
            xpPanel = new XemPhongPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/view.png"));
            tbpNhanVienMain.addTab("Xem thông tin phòng",icon,xpPanel,"Xem thông tin phòng");
        }
        tbpNhanVienMain.setSelectedComponent(xpPanel);
    }//GEN-LAST:event_mnu_xemPhongActionPerformed

    private void btn_xemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemPhongActionPerformed
        // TODO add your handling code here:
        mnu_xemPhongActionPerformed(evt);
    }//GEN-LAST:event_btn_xemPhongActionPerformed

    private void mnu_XuatHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_XuatHDActionPerformed
        // TODO add your handling code here:
        if(XHD==null){
            XHD = new XuatHoaDonPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/printer.png"));
            tbpNhanVienMain.addTab("Xuất Hóa Đơn", icon, XHD, "Xuất Hóa Đơn");
        }
        tbpNhanVienMain.setSelectedComponent(XHD);
    }//GEN-LAST:event_mnu_XuatHDActionPerformed

    private void btn_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangXuatActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        LoginDialog loginDialog= new LoginDialog(this, true);
        loginDialog.setVisible(true);
    }//GEN-LAST:event_btn_dangXuatActionPerformed

    private void btn_khoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoaPhongActionPerformed
        // TODO add your handling code here:
        if (kKhoaPhong == null) {
          
            try {
                kKhoaPhong = new KhoaPhong();
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienMain.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/lock.png"));
            tbpNhanVienMain.addTab("Khóa Phòng", icon, kKhoaPhong, "Khóa Phòng");
        }
        tbpNhanVienMain.setSelectedComponent(kKhoaPhong);
    }//GEN-LAST:event_btn_khoaPhongActionPerformed

    private void mnu_KhoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_KhoaPhongActionPerformed
        // TODO add your handling code here:
        btn_khoaPhongActionPerformed(evt);
    }//GEN-LAST:event_mnu_KhoaPhongActionPerformed

    private void btn_traPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_traPhongActionPerformed
        // TODO add your handling code here:
        if(traPhongPanel == null){
            traPhongPanel = new TraPhongPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/pay.png"));
            tbpNhanVienMain.addTab("Trả phòng",icon,traPhongPanel,"Trả phòng");
        }
        tbpNhanVienMain.setSelectedComponent(traPhongPanel);
    }//GEN-LAST:event_btn_traPhongActionPerformed

    private void mnu_TraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_TraPhongActionPerformed
        // TODO add your handling code here:
        btn_traPhongActionPerformed(evt);
    }//GEN-LAST:event_mnu_TraPhongActionPerformed

    private void btn_QLDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLDatPhongActionPerformed
        // TODO add your handling code here:
        if (mouseQuanLyDatPhong == null)
        {
            
            try {
                mouseQuanLyDatPhong = new QuanLyDatPhong_Panel();
            } catch (SQLException ex) {
                Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/order_room.png"));
            tbpNhanVienMain.addTab("Quản Lý Đặt Phòng", icon, mouseQuanLyDatPhong,"Quản Lý Đặt Phòng");     
            tbpNhanVienMain.setSelectedComponent(mouseQuanLyDatPhong);
        }
        tbpNhanVienMain.setSelectedComponent(mouseQuanLyDatPhong);
    }//GEN-LAST:event_btn_QLDatPhongActionPerformed

    private void mnu_QLDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_QLDatPhongActionPerformed
        // TODO add your handling code here:
        btn_QLDatPhongActionPerformed(evt);
    }//GEN-LAST:event_mnu_QLDatPhongActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_QLDatPhong;
    private javax.swing.JButton btn_QLKhachThue;
    private javax.swing.JButton btn_dangXuat;
    private javax.swing.JButton btn_khoaPhong;
    private javax.swing.JButton btn_traPhong;
    private javax.swing.JButton btn_xemPhong;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnu_DangXuat;
    private javax.swing.JMenuItem mnu_KhoaPhong;
    private javax.swing.JMenuItem mnu_QLDatPhong;
    private javax.swing.JMenuItem mnu_QLKhachHang;
    private javax.swing.JMenuItem mnu_Thoat;
    private javax.swing.JMenuItem mnu_TraPhong;
    private javax.swing.JMenuItem mnu_TroGiup;
    private javax.swing.JMenuItem mnu_XuatHD;
    private javax.swing.JMenuItem mnu_gioiThieu;
    private javax.swing.JMenuItem mnu_xemPhong;
    private javax.swing.JMenu mnu_xuatHD;
    private javax.swing.JTabbedPane tbpNhanVienMain;
    // End of variables declaration//GEN-END:variables
}