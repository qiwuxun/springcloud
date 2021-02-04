package com.ye.springcloud.service.imp;

import com.ye.springcloud.dao.PaymentMapper;
import com.ye.springcloud.entities.Payment;
import com.ye.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImp implements PaymentService {

  @Autowired
  private PaymentMapper paymentDao;

  @Override
  public int createPayment(Payment payment) {
    return paymentDao.createPayment(payment);
  }

  @Override
  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
