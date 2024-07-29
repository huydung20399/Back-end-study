package org.example.finaljwdbackend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Ho Huy Dung - 1999/03/20
 * Tạo model cho Phong cach ly
 */
@Entity
@Table(name = "phong_cach_ly")
public class PhongCachLy {
    @Id
    @Column(name = "ma_phong")
    private String maPhong;

    @Column(name = "ten_phong")
    private String tenPhong;

    @ManyToOne
    @JoinColumn(name = "ma_ttcl", referencedColumnName = "ma_ttcl")
    private TrungTamCachLy trungTamCachLy;

    @OneToMany(mappedBy = "phongCachLy")
    private List<ThongTinDoiTuong> thongTinDoiTuongs;

    public PhongCachLy(String maPhong, String tenPhong, TrungTamCachLy trungTamCachLy) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.trungTamCachLy = trungTamCachLy;
    }

    public PhongCachLy() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public TrungTamCachLy getTrungTamCachLy() {
        return trungTamCachLy;
    }

    public void setTrungTamCachLy(TrungTamCachLy trungTamCachLy) {
        this.trungTamCachLy = trungTamCachLy;
    }

    public List<ThongTinDoiTuong> getThongTinDoiTuongs() {
        return thongTinDoiTuongs;
    }

    public void setThongTinDoiTuongs(ThongTinDoiTuong thongTinDoiTuongs) {
        if (this.thongTinDoiTuongs == null) {
            this.thongTinDoiTuongs = new ArrayList<>();
        }
        this.thongTinDoiTuongs.add(thongTinDoiTuongs);
    }
}
