package com.binco.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PaymentApplication.class, args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
