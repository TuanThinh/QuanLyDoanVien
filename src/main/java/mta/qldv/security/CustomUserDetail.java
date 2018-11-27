package mta.qldv.security;

import mta.qldv.entity.Quyen;
import mta.qldv.entity.TaiKhoan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CustomUserDetail implements UserDetails {

    private TaiKhoan taiKhoan;

    private Set<GrantedAuthority> grantedAuthorities;

    private List<Quyen> listQuyen;

    public CustomUserDetail() {

    }

    public CustomUserDetail(TaiKhoan taiKhoan, Set<GrantedAuthority> grantedAuthorities) {
        this.taiKhoan = taiKhoan;
        this.grantedAuthorities = grantedAuthorities;
    }

    public List<Quyen> getListQuyen() {
        return listQuyen;
    }

    public void setListQuyen(List<Quyen> listQuyen) {
        this.listQuyen = listQuyen;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public Set<GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

    public void setGrantedAuthorities(Set<GrantedAuthority> grantedAuthorities) {
        this.grantedAuthorities = grantedAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return taiKhoan.getMatKhau();
    }

    @Override
    public String getUsername() {
        return taiKhoan.getTenTaiKhoan();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return taiKhoan.getKichHoat();
    }
}
