package com.app.choice.administration.model;

import java.util.Date;

public class CommandModel {
    private Integer id;
    private Integer caster_has_table_id;
    private Date date;
    private boolean isActive;

    public CommandModel() {
    }

    public CommandModel(Integer id, Integer caster_has_table_id, Date date, boolean isActive) {
        this.id = id;
        this.caster_has_table_id = caster_has_table_id;
        this.date = date;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaster_has_table_id() {
        return caster_has_table_id;
    }

    public void setCaster_has_table_id(Integer caster_has_table_id) {
        this.caster_has_table_id = caster_has_table_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
