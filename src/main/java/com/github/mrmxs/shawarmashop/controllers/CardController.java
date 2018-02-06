package com.github.mrmxs.shawarmashop.controllers;

import com.github.mrmxs.shawarmashop.resources.Card;
import com.github.mrmxs.shawarmashop.resources.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/card")
public class CardController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("")
    public Card all(@RequestParam(value = "name", defaultValue = "Traditional") String name) {
        return new Card(
                counter.incrementAndGet(),
                new Menu[]{Menu.valueOf(name)});
    }
}
