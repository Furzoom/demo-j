package com.furzoom.lab;

public class People {
    private String name;
    private long id_card;

    public People(String name, long id_card) {
        this.name = name;
        this.id_card = id_card;
    }

    public long getId_card() {
        return this.id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }
}


