package tr.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created by asy
 */
public class PrivilegeChecker {

    public static boolean isPrivileged(String role) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        if (securityContext != null) {
            if (securityContext.getAuthentication() != null && securityContext.getAuthentication().getPrincipal() != null) {
                for (GrantedAuthority grantedAuthority : securityContext.getAuthentication().getAuthorities()) {
                    if (grantedAuthority.getAuthority().equals(role)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String getLoggedInUserName() {
        try {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return user.getUsername();
        } catch (Exception e) {
            e.printStackTrace();
            return "N/A";
        }
    }

}
