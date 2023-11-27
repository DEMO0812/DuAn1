/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.DatPhong;
import java.text.SimpleDateFormat;
import ui.QLDatPhongJDialog;

public class AppUtils {
    DatPhong dp = new DatPhong();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    
    public static double tinhTienPhong(DatPhong dp){
        String sql = "select GiaTien from Phong where MaPhong = ?";
        double tienPhong = (double) JdbcHelper.value(sql, dp.getMaPhong());
        return tienPhong;
    }
    
    public static double tinhTienDV(String maDV){
        String sql = "select TongTien from ChiTietDV where MaDV = ?";
        double tienDV = (double) JdbcHelper.value(sql, maDV);
        return tienDV;
    }
    
    public double tinhNgay(){
        int soNgay = 0;
        
        try {
            long ngayDat = dp.getNgayDat().getTime();
            long ngayTra = dp.getNgayTra().getTime();
            long tmp = Math.abs(ngayDat - ngayTra);
            
             soNgay = (int) (tmp/(24*60*60*1000));
            
        } catch (Exception e) {
        }
       
        return soNgay;
    }
    
    public double tongTienHD(DatPhong dp){
        double tongTien = tinhNgay() * tinhTienPhong(dp) ;
        return tongTien;
    }
}
