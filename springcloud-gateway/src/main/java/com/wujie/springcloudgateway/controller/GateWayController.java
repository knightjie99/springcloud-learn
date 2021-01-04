package com.wujie.springcloudgateway.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gateWay/")
public class GateWayController {


    @RequestMapping("test")
    public void testGateWay(){
        System.out.println("hah");
    }
}
