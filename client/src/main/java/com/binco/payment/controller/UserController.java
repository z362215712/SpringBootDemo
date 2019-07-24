package com.binco.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangqiaoguo
 * @date 2019-07-21 15:25
 * @copyright Copyright (c) 2019 wuzhenpay Inc. All Rights Reserved.
 * @description
 */
@RestController
public class UserController {

    @GetMapping("/index")
    public void test() {
        System.out.println("halo");
    }
}
