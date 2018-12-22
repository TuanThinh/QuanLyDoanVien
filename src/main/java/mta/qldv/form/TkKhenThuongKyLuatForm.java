package mta.qldv.form;

import java.util.Date;

public class TkKhenThuongKyLuatForm {
    private int soLuong;
    private String hinhThuc;
    private Date thoiGian;
    private int idChiDoan;
    private int idDonVi;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getIdChiDoan() {
        return idChiDoan;
    }

    public void setIdChiDoan(int idChiDoan) {
        this.idChiDoan = idChiDoan;
    }

    public int getIdDonVi() {
        return idDonVi;
    }

    public void setIdDonVi(int idDonVi) {
        this.idDonVi = idDonVi;
    }
}
