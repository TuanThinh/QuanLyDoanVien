package mta.qldv.security;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.Quyen;
import mta.qldv.entity.TaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("customUserDetailsService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private TaiKhoanDao taiKhoanDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TaiKhoan taiKhoan = taiKhoanDao.findByUserName(username);
        if (taiKhoan == null) {
            throw new UsernameNotFoundException("user not found!");
        }
        return getUserDetail(taiKhoan);
    }

    private CustomUserDetail getUserDetail(TaiKhoan taiKhoan) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        List<Quyen> quyenList = taiKhoan.getListQuyen();
        quyenList.forEach(quyen -> {
            authorities.add(new SimpleGrantedAuthority(quyen.getTenQuyen()));
        });
        return new CustomUserDetail(taiKhoan, authorities);
    }
}
