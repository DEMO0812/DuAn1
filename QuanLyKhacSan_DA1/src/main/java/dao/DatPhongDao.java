/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.DatPhong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

/**
 *
 * @author DEMO
 */
public class DatPhongDao extends QLKS_Dao<DatPhong, String>{

    final String INSERT_SQL = "insert into DatPhong(MaDP,MaKH,MaPhong,MaDV,NgayDat,NgayTra,GhiChu,TinhTrang) values(?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update DatPhong set MaKH = ?, MaPhong = ?, MaDV = ?, NgayDat = ?, NgayTra = ?,  GhiChu = ?, TongTien = ?, TinhTrang = ? where MaDP = ?";
    final String DELETE_SQL = "delete from DatPhong where MaDP =  ?";
    final String SELECT_ALL_SQL = "Select * from DatPhong";
    final String SELECT_BY_ID_SQL = "Select * from DatPhong where MaDP = ?";
    
    @Override
    public void insert(DatPhong entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaDP(), entity.getMaKH(), entity.getMaPhong(),
                entity.getMaDV(), entity.getNgayDat(), entity.getNgayTra(),
                entity.getGhiChu(),  entity.isTinhTrang());
   }

    @Override
    public void update(DatPhong entity) {
        JdbcHelper.update(UPDATE_SQL, 
                entity.getMaKH(), entity.getMaPhong(), entity.getMaDV(),
                entity.getNgayDat(), entity.getNgayTra(), entity.getGhiChu(),
                entity.getTongtien(),entity.isTinhTrang(),
                entity.getMaDP());
   }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
   }

    @Override
    public List<DatPhong> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
   }

    @Override
    public DatPhong selectById(String id) {
        List<DatPhong> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }return list.get(0);
   }

    @Override
    public List<DatPhong> selectBySql(String sql, Object... args) {
        List<DatPhong> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                DatPhong entity = new DatPhong();
                entity.setMaDP(rs.getString("MaDP"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaPhong(rs.getString("MaPhong"));
                entity.setMaDV(rs.getString("MaDV"));
                entity.setNgayDat(rs.getDate("NgayDat"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setTongtien(rs.getDouble("TongTien"));
                entity.setTinhTrang(rs.getBoolean("TinhTrang"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
   }
    
}
