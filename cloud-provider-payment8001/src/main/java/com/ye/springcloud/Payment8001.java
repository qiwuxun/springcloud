package com.ye.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qiwu
 * @date 2021-01-31 15:11
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ye.springcloud.dao")
public class Payment8001 {

  public static void main(String[] args) {
    SpringApplication.run(Payment8001.class,args);
  }

}
