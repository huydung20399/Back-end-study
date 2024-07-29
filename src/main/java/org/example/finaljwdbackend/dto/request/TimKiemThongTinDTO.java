package org.example.finaljwdbackend.dto.request;

/**
 * Ho Huy Dung - 1999/03/20
 * tạo DoiTuongCapNhatDTO
 */
public class TimKiemThongTinDTO {
    private String hoTenDoiTuong;
    private String maTTCL;

    public TimKiemThongTinDTO(String hoTenDoiTuong, String maTTCL) {
        this.hoTenDoiTuong = hoTenDoiTuong;
        this.maTTCL = maTTCL;
    }

    public TimKiemThongTinDTO() {
    }

    public String getHoTenDoiTuong() {
        return hoTenDoiTuong;
    }

    public void setHoTenDoiTuong(String hoTenDoiTuong) {
        this.hoTenDoiTuong = hoTenDoiTuong;
    }

    public String getMaTTCL() {
        return maTTCL;
    }

    public void setMaTTCL(String maDoiTuong) {
        this.maTTCL = maTTCL;
    }
}
