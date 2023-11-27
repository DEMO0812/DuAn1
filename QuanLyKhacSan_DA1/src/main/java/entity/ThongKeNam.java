package entity;

public class ThongKeNam {
	private String thang;
	private Double doanhthu;
	
	public ThongKeNam(String thang, Double doanhthu) {
		this.thang = thang;
		this.doanhthu = doanhthu;
		
	}
	public ThongKeNam() {
		
	}
	public String getThang() {
		return thang;
	}
	public void setThang(String thang) {
		this.thang = thang;
	}
	public Double getDoanhthu() {
		return doanhthu;
	}
	public void setDoangthu(Double doanhthu) {
		this.doanhthu = doanhthu;
	}

	
	
	
	
}
