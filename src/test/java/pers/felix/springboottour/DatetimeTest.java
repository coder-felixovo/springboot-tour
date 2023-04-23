package pers.felix.springboottour;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author Felix Lee
 * @date 2023/4/23 20:44
 */
public class DatetimeTest {
    @Test
    public void test01() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
    }
}
