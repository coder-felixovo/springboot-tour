package pers.felix.springboottour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.felix.springboottour.mapper")
public class SpringbootTourApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTourApplication.class, args);
    }

}
