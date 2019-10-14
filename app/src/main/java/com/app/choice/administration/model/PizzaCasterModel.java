package com.app.choice.administration.model;

import java.util.Date;

public class PizzaCasterModel {
    private Integer id;
    private Integer establishment_id;
    private String name;
    private Date created_date;
    private boolean is_active;

    public PizzaCasterModel(Integer id, Integer establishment_id, String name, Date date, boolean is_active) {
        this.id = id;
        this.establishment_id = establishment_id;
        this.name = name;
        this.created_date = date;
        this.is_active = is_active;
    }

    public PizzaCasterModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstablishment_id() {
        return establishment_id;
    }

    public void setEstablishment_id(Integer establishment_id) {
        this.establishment_id = establishment_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date date) {
        this.created_date = date;
    }

    public boolean is_active() {
        return is_active;
    }

    public void set_active(boolean is_active) {
        this.is_active = is_active;
    }
}
