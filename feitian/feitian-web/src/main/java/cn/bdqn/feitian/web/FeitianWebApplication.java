package cn.bdqn.feitian.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.bdqn.feitian.dao")
@ComponentScan("cn.bdqn.feitian")
public class FeitianWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeitianWebApplication.class, args);
    }

}
