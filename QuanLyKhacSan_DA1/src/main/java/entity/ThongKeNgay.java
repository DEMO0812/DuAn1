
package entity;

public class ThongKeNgay {
    private String madp;
    private String ngaytra;
    private Double doanhthu;
    
	public ThongKeNgay(String madp, String ngaytra, Double doanhthu) {
		this.madp = madp;
		this.ngaytra = ngaytra;
		this.doanhthu = doanhthu;
	}
    
	public ThongKeNgay() {
		
	}

	public String getMadp() {
		return madp;
	}

	public void setMadp(String madp) {
		this.madp = madp;
	}

	public String getNgaytra() {
		return ngaytra;
	}

	public void setNgaytra(String ngaytra) {
		this.ngaytra = ngaytra;
	}

	public Double getDoanhthu() {
		return doanhthu;
	}

	public void setDoanhthu(Double doanhthu) {
		this.doanhthu = doanhthu;
	}
    
    
}
