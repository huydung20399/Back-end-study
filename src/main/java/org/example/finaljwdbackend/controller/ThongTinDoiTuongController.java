package org.example.finaljwdbackend.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.finaljwdbackend.dto.request.DoiTuongCapNhatDTO;
import org.example.finaljwdbackend.dto.request.ThongTinDoiTuongDTO;
import org.example.finaljwdbackend.dto.request.TimKiemThongTinDTO;
import org.example.finaljwdbackend.model.PhongCachLy;
import org.example.finaljwdbackend.model.ThongTinDoiTuong;
import org.example.finaljwdbackend.service.PhongCachLyService;
import org.example.finaljwdbackend.service.ThongTinDoiTuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Ho Huy Dung - 1999/03/20
 * Viết controller cho thông tin đối tượng
 */
@Controller
@RequestMapping(path = "/ttdt")
public class ThongTinDoiTuongController {
    @Autowired
    private ThongTinDoiTuongService thongTinDoiTuongService;

    @Autowired
    private PhongCachLyService phongCachLyService;

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Ho Huy Dung - 1999/03/20
     * viết model cho trang thêm thông tin đối tượng
     * @param model
     */
    @GetMapping("/themThongTin")
    public String modelThongTinDoiTuong(Model model) {
        List<PhongCachLy> phongCachLyList = phongCachLyService.findAll();
        model.addAttribute("phongCachLyList", phongCachLyList);
        model.addAttribute("thongTinDoiTuong", new ThongTinDoiTuongDTO());
        return "themThongTinDoiTuong";
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * get các thông tin từ form và lưu vào database
     * @param thongTinDoiTuongDTO
     */
    @PostMapping("/themDoiTuong")
    public String themThongTinDoiTuong(@ModelAttribute ThongTinDoiTuongDTO thongTinDoiTuongDTO) {
        String maDoiTuong = thongTinDoiTuongDTO.getMaDoiTuong();
        String hoTen = thongTinDoiTuongDTO.getHoTen();
        String gioiTinh = thongTinDoiTuongDTO.getGioiTinh();
        LocalDate ngaySinh = thongTinDoiTuongDTO.getNgaySinh();
        String diaChi = thongTinDoiTuongDTO.getDiaChi();
        String soDienThoai = thongTinDoiTuongDTO.getSoDienThoai();
        LocalDate ngayTiepXucF0 = thongTinDoiTuongDTO.getNgayTiepXucF0();

        String maPhongCachLy = thongTinDoiTuongDTO.getMaPhongCachLy();
        PhongCachLy phongCachLy = phongCachLyService.findById(maPhongCachLy);

        LocalDate ngayBatDauCachLy = thongTinDoiTuongDTO.getNgayBatDauCachLy();
        LocalDate ngayKetThucCachLyDuKien = thongTinDoiTuongDTO.getNgayKetThucCachLy();

        int soNgay = (int) ngayBatDauCachLy.until(ngayKetThucCachLyDuKien, ChronoUnit.DAYS);
        double chiPhiThanhToan = phongCachLy.getTrungTamCachLy().getPhiCachLy();
        double chiPhiThanhToanDuKien = chiPhiThanhToan * soNgay;

        ThongTinDoiTuong thongTinDoiTuong = new ThongTinDoiTuong();
        thongTinDoiTuong.setMaDT(maDoiTuong);
        thongTinDoiTuong.setHoTen(hoTen);
        thongTinDoiTuong.setGioiTinh(gioiTinh);
        thongTinDoiTuong.setNgaySinh(ngaySinh);
        thongTinDoiTuong.setDiaChi(diaChi);
        thongTinDoiTuong.setSoDienThoai(soDienThoai);
        thongTinDoiTuong.setNgayTiepXucF0(ngayTiepXucF0);
        thongTinDoiTuong.setPhongCachLy(phongCachLy);
        thongTinDoiTuong.setNgayBDCL(ngayBatDauCachLy);
        thongTinDoiTuong.setNgayKTCLDK(ngayKetThucCachLyDuKien);
        thongTinDoiTuong.setChiPhiThanhToanDK(chiPhiThanhToanDuKien);

        thongTinDoiTuongService.insert(thongTinDoiTuong);

        return "redirect:/ttdt/lietKeThongTinDoiTuong";
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param model
     */
    @GetMapping("/lietKeThongTinDoiTuong")
    public String lietKeThongTinDoiTuong(Model model) {
        List<ThongTinDoiTuong> thongTinDoiTuongList = thongTinDoiTuongService.getAllByNgayKTCLTTAfterToDay();
        model.addAttribute("thongTinDoiTuongList", thongTinDoiTuongList);
        model.addAttribute("timKiemDoiTuong", new TimKiemThongTinDTO());
        return "lietKeThongTinDoiTuong";
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param timKiemThongTinDTO
     * @param model
     */
    @GetMapping("/timKiemThongTinDoiTuong")
    public String timKiemThongTinDoiTuong(@ModelAttribute("timKiemDoiTuong") TimKiemThongTinDTO timKiemThongTinDTO, Model model) {
        List<ThongTinDoiTuong> thongTinDoiTuongList = thongTinDoiTuongService.getByCondition(timKiemThongTinDTO.getHoTenDoiTuong());
        model.addAttribute("thongTinDoiTuongList", thongTinDoiTuongList);
        return "lietKeThongTinDoiTuong";
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param model
     */
    @GetMapping("/capNhatDoiTuong")
    public String modelCapNhatDoiTuong(Model model) {
        List<ThongTinDoiTuong> thongTinDoiTuongList = thongTinDoiTuongService.findAll();
        model.addAttribute("thongTinDoiTuongList", thongTinDoiTuongList);
        model.addAttribute("capNhatDoiTuong", new DoiTuongCapNhatDTO());
        return "capNhatThongTinDoiTuong";
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param doiTuongCapNhatDTO
     */
    @PostMapping("/capNhatDoiTuongPhatBenh")
    public String capNhatDoiTuong(@ModelAttribute DoiTuongCapNhatDTO doiTuongCapNhatDTO) {
        thongTinDoiTuongService.update(doiTuongCapNhatDTO.getMaDoiTuong(),
                                        doiTuongCapNhatDTO.getNgayPhatBenh(),
                                        doiTuongCapNhatDTO.getNgayKTCLTT());
        return "redirect:/ttdt/capNhatDoiTuong";
    }
}
