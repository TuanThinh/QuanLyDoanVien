package mta.qldv.form;

public class TKHoatDongHoSoForm {
    private int soLuong;
    private String xepHang;
    private int thoiGian;
    private int idChiDoan;
    private int idDonVi;

    public int getSoLuong() {
        return soLuong;
    }

    public String getXepHang() {
        return xepHang;
    }

    public void setXepHang(String xepHang) {
        this.xepHang = xepHang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
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
