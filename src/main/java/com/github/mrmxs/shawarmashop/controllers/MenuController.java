package com.github.mrmxs.shawarmashop.controllers;

import com.github.mrmxs.shawarmashop.resources.Menu;
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
