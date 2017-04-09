package test;

import java.util.Date;

/**
 * Created by Alexk on 17/4/5.
 */
public class SuperTest extends Date {

    private static final long serialVersionUID = 1L;

    private void test() {
        System.out.println(super.getClass().getSuperclass().getName());
      }

    public static void main(String[] args) {
        new SuperTest().test();
    }
}
