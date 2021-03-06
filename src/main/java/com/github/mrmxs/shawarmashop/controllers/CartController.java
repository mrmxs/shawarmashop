package com.github.mrmxs.shawarmashop.controllers;

import com.github.mrmxs.shawarmashop.resources.Cart;
import com.github.mrmxs.shawarmashop.resources.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/card")
public class CartController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("")
    public Cart all(@RequestParam(value = "name", defaultValue = "Traditional") String name) {
        return new Cart(
                counter.incrementAndGet(),
                new Menu[]{Menu.valueOf(name)});
    }
}
