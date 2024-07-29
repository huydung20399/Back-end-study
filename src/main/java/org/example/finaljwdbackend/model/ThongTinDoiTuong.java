package org.example.finaljwdbackend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Ho Huy Dung - 1999/03/20
 * Tạo model cho Thong tin doi tuong
 */
@Entity
@Table(name = "thong_tin_doi_tuong")
public class ThongTinDoiTuong {
    @Id
    @Column(name = "ma_doi_tuong")
    private String maDT;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "ngay_tiep_xuc_f0")
    private LocalDate ngayTiepXucF0;

    @ManyToOne
    @JoinColumn(name = "ma_phong", referencedColumnName = "ma_phong")
    private PhongCachLy phongCachLy;

    @Column(name = "ngay_bdcl")
    private LocalDate ngayBDCL;

    @Column(name = "ngay_ktcldk")
    private LocalDate ngayKTCLDK;

    @Column(name = "chi_phi_thanh_toan_dk")
    private double chiPhiThanhToanDK;

    @Column(name = "ngay_phat_benh")
    private LocalDate ngayPhatBenh;

    @Column(name = "ngay_ktcltt")
    private LocalDate ngayKTCLTT;

    public ThongTinDoiTuong(String maDT, String hoTen, String gioiTinh, LocalDate ngaySinh, String diaChi,
                            String soDienThoai, LocalDate ngayTiepXucF0, PhongCachLy phongCachLy, LocalDate ngayBDCL,
                            LocalDate ngayKTCLDK, double chiPhiThanhToanDK, LocalDate ngayPhatBenh, LocalDate ngayKTCLTT) {
        this.maDT = maDT;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngayTiepXucF0 = ngayTiepXucF0;
        this.phongCachLy = phongCachLy;
        this.ngayBDCL = ngayBDCL;
        this.ngayKTCLDK = ngayKTCLDK;
        this.chiPhiThanhToanDK = chiPhiThanhToanDK;
        this.ngayPhatBenh = ngayPhatBenh;
        this.ngayKTCLTT = ngayKTCLTT;
    }

    public ThongTinDoiTuong() {
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
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

    public PhongCachLy getPhongCachLy() {
        return phongCachLy;
    }

    public void setPhongCachLy(PhongCachLy phongCachLy) {
        this.phongCachLy = phongCachLy;
    }

    public LocalDate getNgayBDCL() {
        return ngayBDCL;
    }

    public void setNgayBDCL(LocalDate ngayBDCL) {
        this.ngayBDCL = ngayBDCL;
    }

    public LocalDate getNgayKTCLDK() {
        return ngayKTCLDK;
    }

    public void setNgayKTCLDK(LocalDate ngayKTCLDK) {
        this.ngayKTCLDK = ngayKTCLDK;
    }

    public double getChiPhiThanhToanDK() {
        return chiPhiThanhToanDK;
    }

    public void setChiPhiThanhToanDK(double chiPhiThanhToanDK) {
        this.chiPhiThanhToanDK = chiPhiThanhToanDK;
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
