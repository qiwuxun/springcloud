package com.ye.springcloud.controller;

import com.ye.springcloud.entities.CommonResult;
import com.ye.springcloud.entities.Payment;
import com.ye.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author qiwu
 * @date 2021-01-31 15:15
 */

@RestController
@RequestMapping("/provider")
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @PostMapping("/createPayment")
    public CommonResult createPayment(Payment payment){

        int result = paymentService.createPayment(payment);
        if(result>0){

         return  new CommonResult(200,"添加成功",result);
        }else{

            return  new CommonResult(200,"添加失败",result);
        }
    }

    @GetMapping("/getPayment/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        try {

            Payment payment = paymentService.getPaymentById(id);


                return new CommonResult(200, "查询成功", payment);

        }catch (Exception e){
            e.printStackTrace();
            return new CommonResult(500, "查询失败", null);
        }
    }

}
