package com.cheer.projectmyself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.cheer.projectmyself.User.mapper")
@SpringBootApplication
public class ProjectMyselfApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMyselfApplication.class, args);
    }

}
