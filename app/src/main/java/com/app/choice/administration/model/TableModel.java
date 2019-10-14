package com.app.choice.administration.model;

import java.io.Serializable;

public class TableModel implements Serializable {
    private Integer id;
    private Integer establishment_id;
    private String name;
    private String code;
    private boolean is_active;

    public TableModel(Integer id, Integer establishment_id, String name, String code, boolean is_active) {
        this.id = id;
        this.establishment_id = establishment_id;
        this.name = name;
        this.code = code;
        this.is_active = is_active;
    }

    public TableModel() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean is_active() {
        return is_active;
    }

    public void set_active(boolean is_active) {
        this.is_active = is_active;
    }
}
