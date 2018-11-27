package mta.qldv.dto;

import java.math.BigInteger;
import java.util.Date;

public class HoatDongHoSoDto {
    private String maSv;
    private String hoTen;
    private Date ngaySinh;
    private String chiDoan;
    private String donVi;
    private Integer thoiGian;
    private BigInteger soLuong;

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChiDoan() {
        return chiDoan;
    }

    public void setChiDoan(String chiDoan) {
        this.chiDoan = chiDoan;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public Integer getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Integer thoiGian) {
        this.thoiGian = thoiGian;
    }

    public BigInteger getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(BigInteger soLuong) {
        this.soLuong = soLuong;
    }
}
