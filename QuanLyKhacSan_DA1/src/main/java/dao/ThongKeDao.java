
package dao;

import utils.JdbcHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Phong;
import entity.ThongKeNam;
import entity.ThongKeNgay;
import entity.ThongKeThang;

/**
 *
 * @author DEMO
 */
public class ThongKeDao extends QLKS_Dao<ThongKeNgay, String> {
	 final String SELECT_ALL_SQL = "select DatPhong.MaDP, Phong.GiaTien	as 'Giá Phòng', DatPhong.NgayDat, DatPhong.NgayTra,DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra) as 'Khoang Cach', DichVu.GiaTien as 'Giá DV', sum(ChiTietDV.SoLuong) as 'Tong SL'\r\n"
	 		+ "       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "				inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "				inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "				group by DatPhong.MaDP,Phong.GiaTien,DatPhong.NgayDat,DatPhong.NgayTra,DichVu.GiaTien";
	 final String SELECT_ALL_SQLTKT = "select Month(DatPhong.NgayTra)as'Tháng Trả',\r\n"
	 		+ "sum(ChiTietDV.TongTien*ChiTietDV.SoLuong) as 'Giá DV',sum(Phong.GiaTien) as'Doanh Thu',sum(ChiTietDV.TongTien*ChiTietDV.SoLuong)+sum(Phong.GiaTien) as 'Tổng tiền'\r\n"
	 		+ "	 		       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "	 					inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "	 					inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "	 					group by Month(DatPhong.NgayTra)";
	 final String SELECT_ALL_SQLFindTKT = "select Month(DatPhong.NgayTra)as'Tháng Trả',\r\n"
	 		+ "sum(ChiTietDV.TongTien*ChiTietDV.SoLuong) as 'Giá DV',sum(Phong.GiaTien) as'Doanh Thu',sum(ChiTietDV.TongTien*ChiTietDV.SoLuong)+sum(Phong.GiaTien) as 'Tổng tiền'\r\n"
	 		+ "	 		       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "	 					inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "	 					inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "						where Month(DatPhong.NgayTra) =?\r\n"
	 		+ "	 					group by Month(DatPhong.NgayTra)";
	 //Lớn dần
	 final String SELECT_ALL_SQL_DESC="\r\n"
	 		+ "select DatPhong.MaDP, Phong.GiaTien	as 'Giá Phòng',Phong.GiaTien*DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra)+DichVu.GiaTien*sum(ChiTietDV.SoLuong)as'Tổng tiền', DatPhong.NgayDat, DatPhong.NgayTra,DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra) as 'Khoang Cach', DichVu.GiaTien as 'Giá DV', sum(ChiTietDV.SoLuong) as 'Tong SL'\r\n"
	 		+ "       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "				inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "				inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "				group by DatPhong.MaDP,Phong.GiaTien,DatPhong.NgayDat,DatPhong.NgayTra,DichVu.GiaTien\r\n"
	 		+ "				order by Phong.GiaTien*DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra)+DichVu.GiaTien*sum(ChiTietDV.SoLuong) desc";
	 //Nhỏ dần
	 final String SELECT_ALL_SQL_ASC="\r\n"
		 		+ "select DatPhong.MaDP, Phong.GiaTien	as 'Giá Phòng',Phong.GiaTien*DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra)+DichVu.GiaTien*sum(ChiTietDV.SoLuong)as'Tổng tiền', DatPhong.NgayDat, DatPhong.NgayTra,DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra) as 'Khoang Cach', DichVu.GiaTien as 'Giá DV', sum(ChiTietDV.SoLuong) as 'Tong SL'\r\n"
		 		+ "       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
		 		+ "				inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
		 		+ "				inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
		 		+ "				group by DatPhong.MaDP,Phong.GiaTien,DatPhong.NgayDat,DatPhong.NgayTra,DichVu.GiaTien\r\n"
		 		+ "				order by Phong.GiaTien*DATEDIFF(DAY,DatPhong.NgayDat,DatPhong.NgayTra)+DichVu.GiaTien*sum(ChiTietDV.SoLuong) asc";
	 
	 final String SELECT_ALL_SQLTKN="select Year(DatPhong.NgayTra)as'Năm Trả',\r\n"
	 		+ " sum(ChiTietDV.TongTien*ChiTietDV.SoLuong) as 'Giá DV',sum(Phong.GiaTien),sum(ChiTietDV.TongTien*ChiTietDV.SoLuong)+sum(Phong.GiaTien) as 'Tổng tiền'\r\n"
	 		+ "	 		       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "	 					inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "	 					inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "	 					group by Year(DatPhong.NgayTra)";
	 final String SELECT_ALL_FindTKN="select Year(DatPhong.NgayTra)as'Năm Trả',\r\n"
	 		+ " sum(ChiTietDV.TongTien*ChiTietDV.SoLuong) as 'Giá DV',sum(Phong.GiaTien),sum(ChiTietDV.TongTien*ChiTietDV.SoLuong)+sum(Phong.GiaTien) as 'Tổng tiền'\r\n"
	 		+ "	 		       from Phong inner join DatPhong on Phong.MaPhong=DatPhong.MaPhong\r\n"
	 		+ "	 					inner join ChiTietDV on DatPhong.MaDV=ChiTietDV.MaDV\r\n"
	 		+ "	 					inner join DichVu on ChiTietDV.MaDV=DichVu.MaDV\r\n"
	 		+ "						where Year(DatPhong.NgayTra)=?\r\n"
	 		+ "	 					group by Year(DatPhong.NgayTra)";
    private  List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]>list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();  
            
        }
    }
    
    public  List<Object[]> getTKTheoNgay(Integer maDP){
        String sql = "{CALL sp_TheoNgay(?)}";
        String[] cols = {"MaDP","DoanhThu"};
        return getListOfArray(sql, cols, maDP);
    }
    public  List<Object[]> getTKTheoThang(){
        String sql = "{CALL sp_TheoThang}";
        String[] cols = {"Thang","DoanhThu",};
        return getListOfArray(sql, cols);
    }
    public  List<Object[]> getTKTheoNam(){
        String sql = "{CALL sp_TheoNam}";
        String[] cols = {"Thang","DoanhThu","ThapNhat","CaoNhat"};
        return getListOfArray(sql, cols);
    }
//    public  List<Object[]> getDoanhThu(Integer nam){
//        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
//        String[] cols = {"ChuyenDe","SoKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
//        return getListOfArray(sql, cols, nam);
//    }
//    

	@Override
	public void insert(ThongKeNgay entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ThongKeNgay entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ThongKeNgay> selectAll() {
		// TODO Auto-generated method stub
		return selectBySql(SELECT_ALL_SQL);
	}
	public Double selectAllDESC() {
		// TODO Auto-generated method stub
		return selectBySqlDESC(SELECT_ALL_SQL_DESC);
	}
	public Double selectAllASC() {
		// TODO Auto-generated method stub
		return selectBySqlASC(SELECT_ALL_SQL_ASC);
	}
	public List<ThongKeThang> selectAllTKT() {
		// TODO Auto-generated method stub
		return selectBySqlTKT(SELECT_ALL_SQLTKT);
	}
	public List<ThongKeThang> selectAllFindTKT(String t) {
		// TODO Auto-generated method stub
		return selectBySqlFindTKT(SELECT_ALL_SQLFindTKT,t);
	}
	public List<ThongKeNam> selectAllTKN() {
		// TODO Auto-generated method stub
		return selectBySqlTKN(SELECT_ALL_SQLTKN);
	}
	public List<ThongKeNam> selectAllFindTKN(String t) {
		// TODO Auto-generated method stub
		return selectBySqlFindTKN(SELECT_ALL_FindTKN,t);
	}
	@Override
	public ThongKeNgay selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ThongKeNgay> selectBySql(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeNgay> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            while(rs.next()){
	                ThongKeNgay TKN = new ThongKeNgay();
	                TKN.setMadp(rs.getString("MaDP"));
	                TKN.setNgaytra(rs.getDate("NgayTra")+"");
	                TKN.setDoanhthu((Double.valueOf(rs.getString("Giá Phòng"))*Integer.valueOf(rs.getString("Khoang Cach")))+(Double.valueOf(rs.getString("Giá DV"))*Integer.valueOf(rs.getString("Tong SL"))));
	                list.add(TKN);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return list;
	}
	public List<ThongKeThang> selectBySqlTKT(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeThang> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            while(rs.next()){
	            	
	                ThongKeThang TKT = new ThongKeThang();
	                TKT.setThang(rs.getString("Tháng Trả"));
	                TKT.setDoanhthu(Double.valueOf(rs.getString("Tổng tiền")));
	                
	                
	                list.add(TKT);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return list;
	}
	public List<ThongKeThang> selectBySqlFindTKT(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeThang> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            while(rs.next()){
	                ThongKeThang TKT = new ThongKeThang();
	                
	                TKT.setThang(rs.getString("Tháng Trả"));
	                TKT.setDoanhthu(Double.valueOf(rs.getString("Tổng tiền")));
	                
	                list.add(TKT);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return list;
	}
	public List<ThongKeNam> selectBySqlTKN(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeNam> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            while(rs.next()){
	            	
	                ThongKeNam TKT = new ThongKeNam();
	                TKT.setThang(rs.getString("Năm Trả"));
	                TKT.setDoangthu(Double.valueOf(rs.getString("Tổng tiền")));
	                
	                
	                list.add(TKT);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return list;
	}
	public List<ThongKeNam> selectBySqlFindTKN(String sql, Object... args) {
		// TODO Auto-generated method stub
		List<ThongKeNam> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
            	
                ThongKeNam TKT = new ThongKeNam();
                TKT.setThang(rs.getString("Năm Trả"));
                TKT.setDoangthu(Double.valueOf(rs.getString("Tổng tiền")));
                
                
                list.add(TKT);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
	}
	public Double selectBySqlDESC(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeNgay> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            rs.next();
	              Double a= (Double.valueOf(rs.getString("Giá Phòng"))*Integer.valueOf(rs.getString("Khoang Cach")))+(Double.valueOf(rs.getString("Giá DV"))*Integer.valueOf(rs.getString("Tong SL")));
	                       return a;
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return null;
	}
	public Double selectBySqlASC(String sql, Object... args) {
		// TODO Auto-generated method stub
		 List<ThongKeNgay> list = new ArrayList<>();
	        try {
	            ResultSet rs = JdbcHelper.query(sql, args);
	            rs.next();
	              Double a= (Double.valueOf(rs.getString("Giá Phòng"))*Integer.valueOf(rs.getString("Khoang Cach")))+(Double.valueOf(rs.getString("Giá DV"))*Integer.valueOf(rs.getString("Tong SL")));
	                       return a;
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	        }
	        return null;
	}

   
}
