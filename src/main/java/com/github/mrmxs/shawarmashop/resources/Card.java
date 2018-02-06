package com.github.mrmxs.shawarmashop.resources;

public class Card {
    private final long id;
    private final Menu[] content;

    public Card(long id, Menu[] content) {
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
