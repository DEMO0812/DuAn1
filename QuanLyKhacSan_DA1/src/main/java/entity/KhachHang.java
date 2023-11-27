/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author DEMO
 */
public class KhachHang {

    private String maKH, tenKH, SDT, CCCD;


    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String SDT, String CCCD) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }

   

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    

}
