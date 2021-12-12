/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.NhanVien;
import Models.Phong;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author MinhQuan
 */
public class CustomtableKhoaphong extends AbstractTableModel{
     private String[] tenCot = {"Mã phòng", "Loại phòng","Giá tiền","Tình trạng"};
    Class[] kieuDuLieu = {String.class, String.class,String.class,String.class};
    
    ArrayList<Phong> ds = new ArrayList<>();

    public CustomtableKhoaphong() {
    }
    
    public CustomtableKhoaphong(ArrayList<Phong> ds) {
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
            case 0: return ds.get(rowIndex).getMaPhong();
            case 1: return ds.get(rowIndex).getLoaiPhong();
            case 2: return ds.get(rowIndex).getGiaPhong();
            case 3: return ds.get(rowIndex).getTinhTrang();
          
//               case 9: return ds.get(rowIndex).getGhiChu();
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
