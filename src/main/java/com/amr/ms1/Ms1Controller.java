package com.amr.ms1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Ms1Controller {


    private Ms1Service ms1Service;

    @GetMapping("/hello")
    public String hello() {
        return ms1Service.hello();
    }
}
