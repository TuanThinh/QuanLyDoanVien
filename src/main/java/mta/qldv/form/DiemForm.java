package mta.qldv.form;

import java.util.Date;

public class DiemForm {
    private Long id;
    private Long idHoSo;
    private Double diem;
    private Date thoiGian;
    private String ghiChu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdHoSo() {
        return idHoSo;
    }

    public void setIdHoSo(Long idHoSo) {
        this.idHoSo = idHoSo;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
