package com.gmail.zabolotniipavel.renttools.model;

import javax.validation.constraints.NotEmpty;

public class Offer {
    @NotEmpty
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
