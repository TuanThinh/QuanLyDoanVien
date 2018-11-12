package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "kt_kl")
public class KhenThuongKyLuat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "id_hs")
	private HoSo hoSo;

	@ManyToOne
    @JoinColumn(name = "id_sqd")
    private SqdKhenThuongKyLuat sqdKhenThuongKyLuat;

	@Column(name = "thoi_gian")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date thoiGian;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HoSo getHoSo() {
        return hoSo;
    }

    public void setHoSo(HoSo hoSo) {
        this.hoSo = hoSo;
    }

    public SqdKhenThuongKyLuat getSqdKhenThuongKyLuat() {
        return sqdKhenThuongKyLuat;
    }

    public void setSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat) {
        this.sqdKhenThuongKyLuat = sqdKhenThuongKyLuat;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
}
