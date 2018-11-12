package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lop")
public class ChiDoan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
	private Long id;

    @Column(name = "ten_lop")
	private String tenChiDoan;

    @ManyToOne
    @JoinColumn(name = "id_khoa")
    private DonVi donVi;

//    @OneToMany(mappedBy = "chiDoan")
//    private List<HoSo> listHoSo = new ArrayList<HoSo>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenChiDoan() {
        return tenChiDoan;
    }

    public void setTenChiDoan(String tenChiDoan) {
        this.tenChiDoan = tenChiDoan;
    }

    public DonVi getDonVi() {
        return donVi;
    }

    public void setDonVi(DonVi donVi) {
        this.donVi = donVi;
    }

}
