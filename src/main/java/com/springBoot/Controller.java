package com.springBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
// @RestController 就是 @Controller 和 @ResponseBody
public class Controller {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
