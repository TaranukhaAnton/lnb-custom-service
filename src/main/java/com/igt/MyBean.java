package com.igt;


import com.igt.configuration.ConfigProperties;
import com.igt.model.Voucher;

import com.igt.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Optional;

public class MyBean {
    @Autowired
    private ConfigProperties configProperties;

    @Autowired
   private VoucherService voucherService;

    @Scheduled(fixedRate = 2000)
    public void printMessage() {

//        String name = configProperties.getConfigValue("name");
//        Voucher employee = new Voucher();
//        employee.setName(name);

        Optional<Voucher> one = voucherService.findOne(1L);
        System.out.println("one = " + one);


        System.out.println("I am called by Spring scheduler  ");
    }
}
