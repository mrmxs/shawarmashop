package com.github.mrmxs.shawarmashop.source;

public class Cart {
    private final long id;
    private final Menu[] content;

    public Cart(long id, Menu[] content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public Menu[] getContent() {
        return content;
    }
}
