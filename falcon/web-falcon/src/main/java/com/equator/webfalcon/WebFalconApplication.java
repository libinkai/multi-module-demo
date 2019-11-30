package com.equator.webfalcon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScans({
        @ComponentScan("com.equator"),
})
//扫描Servlet
@ServletComponentScan({"com.equator.webfalcon.filter"})
@MapperScan("com.equator.dao")
@EnableTransactionManagement(proxyTargetClass = true)
public class WebFalconApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFalconApplication.class, args);
    }

}
