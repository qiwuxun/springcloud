package com.ye.springcloud.service;

import com.ye.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

  public int createPayment( Payment payment);

  public Payment getPaymentById( Long id);

}
