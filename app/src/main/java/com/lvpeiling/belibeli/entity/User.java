package com.lvpeiling.belibeli.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by lpl72 on 2017/6/20.
 */

public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private String city;
    private String state;
    private String country;
    private String location;
    private String company;
    private String occupation;
    private int created_on;
    private String url;
    private String display_name;
    private Map<Integer, String> images;
    private List<String> fields;
    private int has_default_image;
    private String website;
    private Stats stats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getCreated_on() {
        return created_on;
    }

    public void setCreated_on(int created_on) {
        this.created_on = created_on;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Map<Integer, String> getImages() {
        return images;
    }

    public void setImages(Map<Integer, String> images) {
        this.images = images;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }
}
