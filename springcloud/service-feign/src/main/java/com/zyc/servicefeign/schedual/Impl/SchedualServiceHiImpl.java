package com.zyc.servicefeign.schedual.Impl;

import com.zyc.servicefeign.schedual.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
