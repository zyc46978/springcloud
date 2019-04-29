package com.zyc.servicefeign.controller;

import com.zyc.servicefeign.schedual.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
