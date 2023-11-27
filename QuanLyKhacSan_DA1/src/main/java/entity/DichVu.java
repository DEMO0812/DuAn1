
package entity;

/**
 *
 * @author DEMO
 */
public class DichVu {
    private String maDV, loai;
    private Double giaTien;

    public DichVu() {
    }

    public DichVu(String maDV, String loai, Double giaTien) {
        this.maDV = maDV;
        this.loai = loai;
        this.giaTien = giaTien;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String lao) {
        this.loai = lao;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    

    
   
}
