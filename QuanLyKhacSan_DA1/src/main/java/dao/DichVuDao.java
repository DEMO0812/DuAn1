package dao;

import entity.DatPhong;
import entity.DichVu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

public class DichVuDao extends QLKS_Dao<DichVu, String> {

    final String INSERT_SQL = "insert into DichVu(MaDV,Loai,GiaTien) values(?,?,?)";
    final String UPDATE_SQL = "update DichVu set MaDV = ?, Loai = ?, GiaTien = ?";
    final String DELETE_SQL = "delete from DichVu where MaDV =  ?";
    final String SELECT_ALL_SQL = "Select * from DichVu";
    final String SELECT_BY_ID_SQL = "Select * from DichVu where MaDV = ?";

    @Override
    public void insert(DichVu entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaDV(), entity.getLoai(), entity.getGiaTien());
    }

    @Override
    public void update(DichVu entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaDV(), entity.getLoai(), entity.getGiaTien());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<DichVu> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DichVu selectById(String id) {
        List<DichVu> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DichVu entity = new DichVu();
                entity.setMaDV(rs.getString("MaDV"));
                entity.setLoai(rs.getString("LoaiDV"));
                entity.setGiaTien(rs.getDouble("GiaTien"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return list;
    }

}
