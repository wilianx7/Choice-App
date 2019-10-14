package com.app.choice.administration.model;

import java.io.Serializable;

public class TabletModel implements Serializable {
    private Integer id;
    private Integer table_id;
    private String name;
    private String code;
    private boolean isActive;

    public TabletModel() {
    }

    public TabletModel(Integer id, Integer table_id, String name, String code, boolean isActive) {
        this.id = id;
        this.table_id = table_id;
        this.name = name;
        this.code = code;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTable_id() {
        return table_id;
    }

    public void setTable_id(Integer table_id) {
        this.table_id = table_id;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
