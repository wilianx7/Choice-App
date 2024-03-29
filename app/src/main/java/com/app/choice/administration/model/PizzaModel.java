package com.app.choice.administration.model;

import java.io.Serializable;

public class PizzaModel implements Serializable {
    private Integer id;
    private String flavor;
    private String ingredients;
    private String iconUrl;
    private boolean available;

    public PizzaModel(Integer id, String flavor, String ingredients, boolean available) {
        this.id = id;
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
