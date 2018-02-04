package com.github.mrmxs.shawarmashop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class GreetingController {
    private static final String template = "Welcome to the World of %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greet")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Shawarma") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
