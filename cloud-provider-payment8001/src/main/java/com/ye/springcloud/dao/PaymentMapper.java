package com.ye.springcloud.dao;


import com.ye.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface PaymentMapper {

  public int createPayment(@Param(value = "payment") Payment payment);

  public Payment getPaymentById(@Param("id") Long id);

}
