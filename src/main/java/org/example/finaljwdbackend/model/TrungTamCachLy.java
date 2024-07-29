package org.example.finaljwdbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Ho Huy Dung - 1999/03/20
 * Tạo model cho Trung tam cach ly
 */
@Entity
@Table (name = "trung_tam_cach_ly")
public class TrungTamCachLy {
    @Id
    @Column(name = "ma_ttcl")
    private String MaTTCL;

    @Column(name = "ten_ttcl")
    private String tenTTCL;

    @Column(name = "dia_chi")
    private String DiaChi;

    @Column(name = "phi_cach_ly")
    private double PhiCachLy;

    @OneToMany(mappedBy = "trungTamCachLy")
    @JsonBackReference
    private List<PhongCachLy> phongCachLy;

    public TrungTamCachLy(String maTTCL, String tenTTCL, String diaChi, double phiCachLy) {
        MaTTCL = maTTCL;
        this.tenTTCL = tenTTCL;
        DiaChi = diaChi;
        PhiCachLy = phiCachLy;
    }

    public TrungTamCachLy() {
    }

    public String getMaTTCL() {
        return MaTTCL;
    }

    public void setMaTTCL(String maTTCL) {
        MaTTCL = maTTCL;
    }

    public String getTenTTCL() {
        return tenTTCL;
    }

    public void setTenTTCL(String tenTTCL) {
        this.tenTTCL = tenTTCL;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public double getPhiCachLy() {
        return PhiCachLy;
    }

    public void setPhiCachLy(double phiCachLy) {
        PhiCachLy = phiCachLy;
    }

    public List<PhongCachLy> getPhongCachLy() {
        return phongCachLy;
    }

    public void setPhongCachLy(PhongCachLy phongCachLy) {
        if (this.phongCachLy == null) {
            this.phongCachLy = new ArrayList<>();
        }
        this.phongCachLy.add(phongCachLy);
    }
}
