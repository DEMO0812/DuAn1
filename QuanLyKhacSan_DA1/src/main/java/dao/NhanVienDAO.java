/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

public class NhanVienDAO extends QLKS_Dao<NhanVien, String> {

    final String INSERT_SQL = "insert into NhanVien(MaNV, MatKhau, TenNV, ChucVu, Hinh) values (?,?,?,?,?)";
    final String UPDATE_SQL = "update NhanVien set MatKhau = ?, TenNV = ?, ChucVu = ?, Hinh = ? where MaNV = ?";
    final String DELETE_SQL = "delete from NhanVien where MaNV = ? ";
    final String SELECT_ALL_SQL = "select * from NhanVien";
    final String SELECT_BY_ID = "select * from NhanVien where MaNV = ? ";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(),entity.getTenNV(), entity.isChucVu(), entity.getHinh());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getTenNV(), entity.isChucVu(),  entity.getHinh(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();// viết đúng như trong sql
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setChucVu(rs.getBoolean("ChucVu"));
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
