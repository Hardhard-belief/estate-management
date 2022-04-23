package com.heima.estatemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
//在引导类中即项目启动类添加项目扫描的包，扫描的数据库层
@SpringBootApplication
//注意：@MapperScan注解要导入TK包下的
@MapperScan(basePackages = "com.heima.estatemanagement.dao")
//不给提示容易写错，直接去包内复制
public class EstateManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstateManagementApplication.class, args);
    }

}
