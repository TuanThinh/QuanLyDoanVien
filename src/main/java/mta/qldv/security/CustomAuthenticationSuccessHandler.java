package mta.qldv.security;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.utils.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Service("authenticationSuccessHandler")
public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Autowired
    private TaiKhoanDao taiKhoanDao;
    public CustomAuthenticationSuccessHandler() {
        super();
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        CustomUserDetail userDetail = SecurityUtil.getCurrentUser();
        TaiKhoan taiKhoan = userDetail.getTaiKhoan();
        taiKhoan.setTruyCapLanCuoi(taiKhoan.getTruyCapHienTai());
        taiKhoan.setTruyCapHienTai(new Date());
        taiKhoanDao.updateTaiKhoan(taiKhoan);
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
