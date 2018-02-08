package com.github.mrmxs.shawarmashop.controller;

import com.github.mrmxs.shawarmashop.source.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @RequestMapping("")
    public Menu[] all() {
        return Menu.values();
    }
}
