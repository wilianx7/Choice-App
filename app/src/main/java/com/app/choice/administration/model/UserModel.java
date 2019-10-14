package com.app.choice.administration.model;

import java.io.Serializable;

public class UserModel implements Serializable {
    private Integer id;
    private Integer establishment_id;
    private Integer login_id;
    private String name;
    private String cell_phone;
    private boolean isAdmin;

    public UserModel() {
    }

    public UserModel(Integer id, Integer establishment_id, Integer login_id, String name, String cell_phone, boolean isAdmin) {
        this.id = id;
        this.establishment_id = establishment_id;
        this.login_id = login_id;
        this.name = name;
        this.cell_phone = cell_phone;
        this.isAdmin = isAdmin;
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

    public Integer getLogin_id() {
        return login_id;
    }

    public void setLogin_id(Integer login_id) {
        this.login_id = login_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
