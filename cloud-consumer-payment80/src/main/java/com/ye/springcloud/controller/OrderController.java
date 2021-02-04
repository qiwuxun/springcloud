package com.ye.springcloud.controller;

import com.ye.springcloud.entities.CommonResult;
import com.ye.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author qiwu
 * @date 2021-02-03 17:15
 */

@RestController
@Slf4j
public class OrderController {

  @Resource
  private RestTemplate restTemplate;

  private static final String PAYMENT_URL="http://localhost:8001";


  @GetMapping("/consumer/createPayment")
  public CommonResult<Payment> createPayment(Payment payment){
    return restTemplate.postForObject(PAYMENT_URL+"/provider/createPayment",payment,CommonResult.class);
  }

@GetMapping("/consumer/getPayment/{id}")
  public CommonResult<Payment>   getPayment(@PathVariable(value = "id") Long id){
    return restTemplate.getForObject(PAYMENT_URL+"/provider/getPayment/"+id, CommonResult.class);
  }

}
