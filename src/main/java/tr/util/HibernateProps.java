package tr.util;

import java.util.Properties;

/**
 * Created by asy
 */
public class HibernateProps {

    public static Properties hibernateProps;


    static {
        hibernateProps = new Properties();
        hibernateProps.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        /*hibernateProps.put("", "");
        hibernateProps.put("", "");
        hibernateProps.put("", "");
        hibernateProps.put("", "");
        hibernateProps.put("", "");
        hibernateProps.put("", "");
        hibernateProps.put("", "");*/
    }

}
