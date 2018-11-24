package mta.qldv.utils;

import mta.qldv.security.CustomUserDetail;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {

    public static CustomUserDetail getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            return null;
        }
        if (auth instanceof AnonymousAuthenticationToken) {
            return null;
        }
        return (CustomUserDetail) auth.getPrincipal();
    }
}
