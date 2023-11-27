package entity;

public class ThongKeThang {
	private String Thang;
	private Double doanhthu;
	public ThongKeThang(String thang, Double doanhthu) {
		Thang = thang;
		this.doanhthu = doanhthu;
	}
	public ThongKeThang() {
		
	}
	public String getThang() {
		return Thang;
	}
	public void setThang(String thang) {
		Thang = thang;
	}
	public Double getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(Double doanhthu) {
		this.doanhthu = doanhthu;
	}
}
