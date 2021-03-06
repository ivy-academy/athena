package academy.ivy.athena.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @GetMapping
    public String hello(String name) {
        return "hello, " + (name == null ? "" : name);
    }
}
