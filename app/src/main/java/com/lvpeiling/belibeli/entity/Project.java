package com.lvpeiling.belibeli.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by lpl72 on 2017/6/20.
 */

public class Project {
    private int id;
    private String name;
    private int published_on;
    private int created_on;
    private int modified_on;
    private String url;
    private String privacy;
    private List<String> fields;
    private Map<String,String> covers;
    private int mature_content;
    private String mature_access;
    private Map<Integer, User> owners;
    private Stats stats;
    private int conceived_on;
    private List<Feature> features;
    private List<Color> colors;
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished_on() {
        return published_on;
    }

    public void setPublished_on(int published_on) {
        this.published_on = published_on;
    }

    public int getCreated_on() {
        return created_on;
    }

    public void setCreated_on(int created_on) {
        this.created_on = created_on;
    }

    public int getModified_on() {
        return modified_on;
    }

    public void setModified_on(int modified_on) {
        this.modified_on = modified_on;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }


    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Map<String, String> getCovers() {
        return covers;
    }

    public void setCovers(Map<String, String> covers) {
        this.covers = covers;
    }

    public String getMature_access() {
        return mature_access;
    }

    public void setMature_access(String mature_access) {
        this.mature_access = mature_access;
    }

    public int getConceived_on() {
        return conceived_on;
    }

    public void setConceived_on(int conceived_on) {
        this.conceived_on = conceived_on;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMature_content() {
        return mature_content;
    }

    public void setMature_content(int mature_content) {
        this.mature_content = mature_content;
    }

    public Map<Integer, User> getOwners() {
        return owners;
    }

    public void setOwners(Map<Integer, User> owners) {
        this.owners = owners;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
