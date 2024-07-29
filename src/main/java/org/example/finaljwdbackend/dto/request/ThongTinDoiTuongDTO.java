package org.example.finaljwdbackend.dto.request;

import java.time.LocalDate;

/**
 * Ho Huy Dung - 1999/03/20
 * tạo DoiTuongCapNhatDTO
 */
public class ThongTinDoiTuongDTO {
    private String maDoiTuong;
    private String hoTen;
    private String gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;
    private String soDienThoai;
    private LocalDate ngayTiepXucF0;
    private String maPhongCachLy;
    private LocalDate ngayBatDauCachLy;
    private LocalDate ngayKetThucCachLy;
    private double chiPhiThanhToan;

    public ThongTinDoiTuongDTO(String maDoiTuong, String hoTen, String gioiTinh, LocalDate ngaySinh,
                               String diaChi, String soDienThoai, LocalDate ngayTiepXucF0, String maPhongCachLy,
                               LocalDate ngayBatDauCachLy, LocalDate ngayKetThucCachLy, double chiPhiThanhToan) {
        this.maDoiTuong = maDoiTuong;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngayTiepXucF0 = ngayTiepXucF0;
        this.maPhongCachLy = maPhongCachLy;
        this.ngayBatDauCachLy = ngayBatDauCachLy;
        this.ngayKetThucCachLy = ngayKetThucCachLy;
        this.chiPhiThanhToan = chiPhiThanhToan;
    }

    public ThongTinDoiTuongDTO() {
    }

    public String getMaDoiTuong() {
        return maDoiTuong;
    }

    public void setMaDoiTuong(String maDoiTuong) {
        this.maDoiTuong = maDoiTuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgayTiepXucF0() {
        return ngayTiepXucF0;
    }

    public void setNgayTiepXucF0(LocalDate ngayTiepXucF0) {
        this.ngayTiepXucF0 = ngayTiepXucF0;
    }

    public String getMaPhongCachLy() {
        return maPhongCachLy;
    }

    public void setMaPhongCachLy(String maPhongCachLy) {
        this.maPhongCachLy = maPhongCachLy;
    }

    public LocalDate getNgayBatDauCachLy() {
        return ngayBatDauCachLy;
    }

    public void setNgayBatDauCachLy(LocalDate ngayBatDauCachLy) {
        this.ngayBatDauCachLy = ngayBatDauCachLy;
    }

    public LocalDate getNgayKetThucCachLy() {
        return ngayKetThucCachLy;
    }

    public void setNgayKetThucCachLy(LocalDate ngayKetThucCachLy) {
        this.ngayKetThucCachLy = ngayKetThucCachLy;
    }

    public double getChiPhiThanhToan() {
        return chiPhiThanhToan;
    }

    public void setChiPhiThanhToan(double chiPhiThanhToan) {
        this.chiPhiThanhToan = chiPhiThanhToan;
    }
}
