package com.ye.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiwu
 * @date 2021-02-03 17:17
 */
@Configuration
public class ApplicationConfig {

  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
