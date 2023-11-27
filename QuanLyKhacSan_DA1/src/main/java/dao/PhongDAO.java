/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Phong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

/**
 *
 * @author DEMO
 */
public class PhongDAO extends QLKS_Dao<Phong, String> {

    final String INSERT_SQL = "insert into Phong(MaPhong,LoaiPhong,GiaTien,Hinh,TinhTrang) values (?,?,?,?,?)";
    final String UPDATE_SQL = "update Phong set LoaiPhong = ?, GiaTien = ?, Hinh = ?, TinhTrang = ?  where MaPhong = ?";
    final String DELETE_SQL = "delete from Phong where MaPhong = ?";
    final String SELECT_ALL_SQL = "Select * from Phong";
    final String SELECT_BY_ID_SQL = "Select * from Phong where MaPhong = ?";
    final String update_TinhTrang = "update Phong set TinhTrang = ? where MaPhong = ?";

    @Override
    public void insert(Phong entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaPhong(), entity.getLoaiPhong(),
                entity.getGiaTien(), entity.getHinh(), entity.isTinhTrang());
    }

    @Override
    public void update(Phong entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getLoaiPhong(), entity.getGiaTien(),
                entity.getHinh(), entity.isTinhTrang(), entity.getMaPhong());
    }

    public void updateTT(String MaPhong, boolean TinhTrang) {
        JdbcHelper.update(update_TinhTrang, MaPhong, TinhTrang);
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Phong> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Phong selectById(String id) {
        List<Phong> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Phong> selectBySql(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Phong entity = new Phong();
                entity.setMaPhong(rs.getString("MaPhong"));
                entity.setLoaiPhong(rs.getString("LoaiPhong"));
                entity.setGiaTien(rs.getDouble("GiaTien"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
    }

}
