package tr.bean;

import org.springframework.stereotype.Component;

/**
 * Created by asy
 */

@Component
public class TestBean {

    private String a;
    private String b;
    private int c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
