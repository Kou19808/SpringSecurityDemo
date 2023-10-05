package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoWebController {
    @GetMapping("any1/foo/hello")
    public String any1FooHello() {
        return "any1/foo/hello!";
    }

    @GetMapping("any1/bar/hello")
    public String any1BarHello() {
        return "any1/bar/hello!";
    }

    @GetMapping("any2/foo/hello")
    public String any2FooHello() {
        return "any2/foo/hello!";
    }

    @GetMapping("any2/bar/hello")
    public String any2BarHello() {
        return "any2/bar/hello!";
    }

    @GetMapping("onlyneedslogin")
    public String onlyNeedsLogin() {
        return "onlyneedslogin!";
    }
}
