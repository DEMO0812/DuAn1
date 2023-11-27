/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import utils.AppUtils;
import utils.JdbcHelper;
import utils.MsgBox;

/**
 *
 * @author DEMO
 */
public class DatPhong {
//    AppUtils app = new AppUtils();

    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    private String maDP, maKH, maPhong, maDV, ghiChu;
    private Date ngayDat, ngayTra;
    private Double tienTra;
    private boolean tinhTrang;

   

    public DatPhong() {
    }

    public DatPhong(String maDP, String maKH, String maPhong, String maDV, String ghiChu, Date ngayDat, Date ngayTra, Double tienTra, boolean tinhTrang) {
        this.maDP = maDP;
        this.maKH = maKH;
        this.maPhong = maPhong;
        this.maDV = maDV;
        this.ghiChu = ghiChu;
        this.ngayDat = ngayDat;
        this.ngayTra = ngayTra;
        this.tienTra = tienTra;
        this.tinhTrang = tinhTrang;
    }
    
     public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    

    

    public Double getTongtien() {
        if (getMaPhong() != null) {
            if (getMaPhong().equalsIgnoreCase("LP101")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP102")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP103")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP104")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP201")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP202")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP203")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP204")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP301")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP302")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP303")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP304")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP401")) {
                tienTra = tinhNgay() * 2000000;
            } else if (getMaPhong().equalsIgnoreCase("LP402")) {
                tienTra = tinhNgay() * 200000;
            } else if (getMaPhong().equalsIgnoreCase("LP403")) {
                tienTra = tinhNgay() * 400000;
            } else if (getMaPhong().equalsIgnoreCase("LP404")) {
                tienTra = tinhNgay() * 600000;
            }
        }
        
        return tienTra;
    }

    public void setTongtien(Double tienTra) {
        if (tienTra !=null) {
            this.tienTra = tienTra;
        }
    }
//    public DatPhong(String maDP, String maKH, String maPhong, String maDV, String ghiChu, Date ngayDat, Date ngayTra) {
//        this.maDP = maDP;
//        this.maKH = maKH;
//        this.maPhong = maPhong;
//        this.maDV = maDV;
//        this.ghiChu = ghiChu;
//        this.ngayDat = ngayDat;
//        this.ngayTra = ngayTra;
//    }

    public String getMaDP() {
        return maDP;
    }

    public void setMaDP(String maDP) {
        this.maDP = maDP;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double TongTienHD() {
        double tienTra = 0;

        if (getMaPhong() != null) {
            if (getMaPhong().equalsIgnoreCase("LP101")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP102")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP103")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP104")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP201")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP202")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP203")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP204")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP301")) {
                tienTra = tinhNgay() * 700000;
            } else if (getMaPhong().equalsIgnoreCase("LP302")) {
                tienTra = tinhNgay() * 900000;
            } else if (getMaPhong().equalsIgnoreCase("LP303")) {
                tienTra = tinhNgay() * 1000000;
            } else if (getMaPhong().equalsIgnoreCase("LP304")) {
                tienTra = tinhNgay() * 1500000;
            } else if (getMaPhong().equalsIgnoreCase("LP401")) {
                tienTra = tinhNgay() * 2000000;
            } else if (getMaPhong().equalsIgnoreCase("LP402")) {
                tienTra = tinhNgay() * 200000;
            } else if (getMaPhong().equalsIgnoreCase("LP403")) {
                tienTra = tinhNgay() * 400000;
            } else if (getMaPhong().equalsIgnoreCase("LP404")) {
                tienTra = tinhNgay() * 600000;
            }
        }else{
//            MsgBox.alert(null, "Chưa ở ngày nào");
        }
        return tienTra;
    }

    public double tinhTienPhong(String maPhong) {
        String sql = "select GiaTien from Phong where MaPhong = ?";
        double tienPhong = (double) JdbcHelper.value(sql, maPhong);
        return tienPhong;
    }

    public double tinhNgay() {
        int soNgay = 0;

        try {
            long ngayDat = getNgayDat().getTime();
            long ngayTra = getNgayTra().getTime();
            long tmp = Math.abs(ngayDat - ngayTra);

            soNgay = (int) (tmp / (24 * 60 * 60 * 1000));

        } catch (Exception e) {
        }

        return soNgay;
    }

    public double tongTienHD() {
        double tongTien = tinhNgay();
        return tongTien;
    }

}
