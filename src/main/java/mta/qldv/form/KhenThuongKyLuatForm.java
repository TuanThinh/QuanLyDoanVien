package mta.qldv.form;

import java.util.Date;

public class KhenThuongKyLuatForm {
    private Long id;
    private Long idHoSo;
    private Long idSqdKtkl;
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

    public Long getIdSqdKtkl() {
        return idSqdKtkl;
    }

    public void setIdSqdKtkl(Long idSqdKtkl) {
        this.idSqdKtkl = idSqdKtkl;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
}
