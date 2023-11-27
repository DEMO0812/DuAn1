/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

/**
 *
 * @author NHU Y
 */
public class KhachHangDAO extends QLKS_Dao<KhachHang, String>{
    final String INSERT_SQL = "insert into KhachHang(MaKH, TenKH, Sdt, CCCD) values (?,?,?,?)";
    final String UPDATE_SQL = "update KhachHang set TenKH = ?, Sdt = ?, CCCD = ?  where MaKH = ?";
    final String DELETE_SQL = "delete from KhachHang where MaKH = ?";
    final String SELECT_ALL_SQL = "Select * from KhachHang";
    final String SELECT_BY_ID_SQL = "Select * from KhachHang where MaKH = ?";
    

    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaKH(), entity.getTenKH(),
                entity.getSDT(), entity.getCCCD());
         }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMaKH(), entity.getTenKH(),
                entity.getSDT(), entity.getCCCD());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }return list.get(0);
     }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setSDT(rs.getString("Sdt"));
                entity.setCCCD(rs.getString("CCCD"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
    }
    
    
}
