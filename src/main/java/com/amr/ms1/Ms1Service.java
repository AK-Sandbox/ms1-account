package com.amr.ms1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Ms1Service {

    @Value("${password}")
    String password;

    public String hello() {
        return "Hello from ms1, password is " + password;
    }
}
