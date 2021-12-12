/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import Models.NhanVien;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MinhQuan
 */
public class CustomtableQuanLyNhanVien extends AbstractTableModel {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

   private String[] tenCot = {"Mã nhân viên ", "Họ tên ","CMND","Ngày sinh", "Giới tính","Email","SĐT", "Địa chỉ", "Chức vụ"};
    Class[] kieuDuLieu = {String.class, String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<NhanVien> ds = new ArrayList<>();

    public CustomtableQuanLyNhanVien() {
    }
    
    public CustomtableQuanLyNhanVien(ArrayList<NhanVien> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return tenCot.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMaNV();
            case 1: return ds.get(rowIndex).getHoTenNV();
            case 2: return ds.get(rowIndex).getSoCMND();
            case 3: return ds.get(rowIndex).getNgaySinh();
            case 4: return ds.get(rowIndex).getGioiTinh();
             case 5: return ds.get(rowIndex).getEmail();
            case 6: return ds.get(rowIndex).getSoDienThoai();
             case 7: return ds.get(rowIndex).getDiaChi();
              case 8: return ds.get(rowIndex).getChucVu();
//              case 9: return ds.get(rowIndex).getGhiChu();
            default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return kieuDuLieu[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return tenCot[column];
    }
     
}


  
