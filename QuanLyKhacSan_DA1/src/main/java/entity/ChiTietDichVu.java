/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author DEMO
 */
public class ChiTietDichVu {
    private String maDV, maDP;
    private int soLuong;
    private double tongTien;

    public ChiTietDichVu() {
    }

    public ChiTietDichVu(String maDV, String maDP, int soLuong, double tongTien) {
        this.maDV = maDV;
        this.maDP = maDP;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getMaDP() {
        return maDP;
    }

    public void setMaDP(String maDP) {
        this.maDP = maDP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
