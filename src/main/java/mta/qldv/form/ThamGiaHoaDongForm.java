package mta.qldv.form;

import java.util.Date;

public class ThamGiaHoaDongForm {
    private Long id;
    private Long idHoSo;
    private Long idHoatDong;
    private Date thoiGian;

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

    public Long getIdHoatDong() {
        return idHoatDong;
    }

    public void setIdHoatDong(Long idHoatDong) {
        this.idHoatDong = idHoatDong;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
}
