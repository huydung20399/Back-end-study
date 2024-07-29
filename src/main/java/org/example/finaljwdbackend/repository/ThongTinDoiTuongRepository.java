package org.example.finaljwdbackend.repository;

import org.example.finaljwdbackend.model.ThongTinDoiTuong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Ho Huy Dung - 1999/03/20
 * tạo Repository cho thong tin doi tuong
 */
@Repository
public interface ThongTinDoiTuongRepository extends JpaRepository<ThongTinDoiTuong, String> {
    /**
     * Ho Huy Dung - 1999/03/20
     * tạo phương thức lấy các đối tượng có ngày KTCLTT > ngày hiện tại
     */
    @Query("SELECT ttdt FROM ThongTinDoiTuong ttdt WHERE ttdt.ngayKTCLTT > CURRENT_DATE() OR ttdt.ngayKTCLTT is null ")
    List<ThongTinDoiTuong> getAllByNgayKTCLTTAfterToDay();

    /**
     * Ho Huy Dung - 1999/03/20
     * @param hoTen
     * @return
     */
    @Query("SELECT ttdt FROM ThongTinDoiTuong ttdt " +
            "JOIN FETCH ttdt.phongCachLy pcl " +
            "JOIN FETCH pcl.trungTamCachLy ttcl " +
            "WHERE LOWER(ttdt.hoTen) LIKE LOWER(concat('%', :hoTen, '%'))")
    List<ThongTinDoiTuong> findByHoTen(@Param("hoTen") String hoTen);
}
