package org.example.finaljwdbackend.service;

import org.example.finaljwdbackend.model.ThongTinDoiTuong;

import java.time.LocalDate;
import java.util.List;

public interface ThongTinDoiTuongService {
    List<ThongTinDoiTuong> findAll();
    ThongTinDoiTuong findById(String id);
    List<ThongTinDoiTuong> getAllByNgayKTCLTTAfterToDay();
    List<ThongTinDoiTuong> getByCondition(String hoTen);
    void insert(ThongTinDoiTuong thongTinDoiTuong);
    void update(String maDT, LocalDate ngayPhatBenh, LocalDate ngayKTCLTT);
    void delete(String id);
}
