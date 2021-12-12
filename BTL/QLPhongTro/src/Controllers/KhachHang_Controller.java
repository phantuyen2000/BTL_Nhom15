/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Helpers.DatabaseHelper_1;
import Models.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class KhachHang_Controller {
    public boolean insert(KhachHang kh) throws Exception{
        String sql = "INSERT INTO KhachHang VALUES(?,?,?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, kh.getSoCMNDKH());
            pstmt.setString(2, kh.getHoTenKH());
            pstmt.setString(3, kh.getNgaySinh());
            pstmt.setString(4, kh.getGioiTinh());
            pstmt.setString(5, kh.getSoDT());
            pstmt.setString(6, kh.getEmail());
            pstmt.setString(7, kh.getDiaChi());
            pstmt.setString(8, kh.getGhiChu());
            
            return pstmt.executeUpdate()>0;
        }
    }
    public boolean update(KhachHang kh) throws Exception{
        String sql = "UPDATE KhachHang SET HoTenKH=?,NgaySinh=?,GioiTinh=?"
                + ",SoDT=?,Email=?,DiaChi=?,GhiChu=?"
                + " WHERE SoCMNDKH=?";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(8, kh.getSoCMNDKH());
            pstmt.setString(1, kh.getHoTenKH());
            pstmt.setString(2, kh.getNgaySinh());
            pstmt.setString(3, kh.getGioiTinh());
            pstmt.setString(4, kh.getSoDT());
            pstmt.setString(5, kh.getEmail());
            pstmt.setString(6, kh.getDiaChi());
            pstmt.setString(7, kh.getGhiChu());
            
            return pstmt.executeUpdate()>0;
        }
    }
    public boolean delete(String soCMNDKH) throws Exception{
        String sql = "DELETE FROM KhachHang WHERE SoCMNDKH=?";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, soCMNDKH);
            
            return pstmt.executeUpdate()>0;
        }
    }
    public KhachHang findBySoCMND(String soCMNDKH) throws Exception{
        String sql = "SELECT * FROM KhachHang WHERE SoCMNDKH=?";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, soCMNDKH);
            try( ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    KhachHang kh = new KhachHang();
                    kh.setSoCMNDKH(rs.getString("SoCMNDKH"));
                    kh.setHoTenKH(rs.getString("HoTenKH"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    kh.setGioiTinh(rs.getString("GioiTinh"));
                    kh.setSoDT(rs.getString("SoDT"));
                    kh.setEmail(rs.getString("Email"));
                    kh.setDiaChi(rs.getString("DiaChi"));
                    kh.setGhiChu(rs.getString("GhiChu"));
                    return kh;
                }
            }
        }
        return null;
    }
    public List<KhachHang> findAll() throws Exception{
        String sql = "SELECT * FROM KhachHang";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            try( ResultSet rs = pstmt.executeQuery()){
                List<KhachHang> list = new ArrayList<>();
                while(rs.next()){
                    KhachHang kh = new KhachHang();
                    kh.setSoCMNDKH(rs.getString("SoCMNDKH"));
                    kh.setHoTenKH(rs.getString("HoTenKH"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    kh.setGioiTinh(rs.getString("GioiTinh"));
                    kh.setSoDT(rs.getString("SoDT"));
                    kh.setEmail(rs.getString("Email"));
                    kh.setDiaChi(rs.getString("DiaChi"));
                    kh.setGhiChu(rs.getString("GhiChu"));
                    list.add(kh);
                }
                return list;
            }
        }
    }
    public List<KhachHang> findAllDaTraPhong() throws Exception{
        String sql = "SELECT KhachHang.SoCMNDKH,HoTenKH,NgaySinh,GioiTinh,SoDT,Email,DiaChi,KhachHang.GhiChu"
                + " FROM KhachHang INNER JOIN Phong_Khach_Dat ON KhachHang.SoCMNDKH=Phong_Khach_Dat.SoCMNDKH"
                + " WHERE TinhTrang=?";
        try(
                Connection con = DatabaseHelper_1.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, "Đã thanh toán");
            try( ResultSet rs = pstmt.executeQuery()){
                List<KhachHang> list = new ArrayList<>();
                while(rs.next()){
                    KhachHang kh = new KhachHang();
                    kh.setSoCMNDKH(rs.getString("SoCMNDKH"));
                    kh.setHoTenKH(rs.getString("HoTenKH"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    kh.setGioiTinh(rs.getString("GioiTinh"));
                    kh.setSoDT(rs.getString("SoDT"));
                    kh.setEmail(rs.getString("Email"));
                    kh.setDiaChi(rs.getString("DiaChi"));
                    kh.setGhiChu(rs.getString("GhiChu"));
                    if(!list.contains(kh)){
                        list.add(kh);
                    }
                    //list.add(kh);
                }
                return list;
            }
        }
    }
}
