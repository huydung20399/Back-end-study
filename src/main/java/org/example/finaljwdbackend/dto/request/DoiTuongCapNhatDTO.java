package org.example.finaljwdbackend.dto.request;

import java.time.LocalDate;

/**
 * Ho Huy Dung - 1999/03/20
 * tạo DoiTuongCapNhatDTO
 */
public class DoiTuongCapNhatDTO {
    private String maDoiTuong;

    private String hoTen;
    private LocalDate ngayPhatBenh;
    private LocalDate ngayKTCLTT;

    public DoiTuongCapNhatDTO(String maDoiTuong, String hoTen, LocalDate ngayPhatBenh, LocalDate ngayKTCLTT) {
        this.maDoiTuong = maDoiTuong;
        this.hoTen = hoTen;
        this.ngayPhatBenh = ngayPhatBenh;
        this.ngayKTCLTT = ngayKTCLTT;
    }

    public DoiTuongCapNhatDTO() {
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

    public LocalDate getNgayPhatBenh() {
        return ngayPhatBenh;
    }

    public void setNgayPhatBenh(LocalDate ngayPhatBenh) {
        this.ngayPhatBenh = ngayPhatBenh;
    }

    public LocalDate getNgayKTCLTT() {
        return ngayKTCLTT;
    }

    public void setNgayKTCLTT(LocalDate ngayKTCLTT) {
        this.ngayKTCLTT = ngayKTCLTT;
    }
}
