package tr.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.Messagebox;

/**
 * Created by asy
 */

@org.springframework.stereotype.Component
@Scope("prototype")
public class LoginComposer extends SelectorComposer {

    private static final Logger logger = LoggerFactory.getLogger(LoginComposer.class);

    @Override
    public void doAfterCompose(Component comp) throws Exception {

        if (!(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)) {
            logger.debug("User already logged in. Skipping login page.");
            Executions.sendRedirect("/secured/index.zul");
        }

        super.doAfterCompose(comp);

        String errorParam = Executions.getCurrent().getParameter("error");
        if (errorParam != null) {
            if ("true".equals(errorParam)) {
                Messagebox.show("Login failed");
            }
        }

    }


}
