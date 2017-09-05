package com.lvpeiling.belibeli.entity;

/**
 * Created by lpl72 on 2017/6/20.
 */

public class Site {
    private int id;
    private int parent_id;
    private String name;
    private String key;
    private String icon;
    private String app_icon;
    private String domain;
    private String url;
    private Ribbon ribbon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getApp_icon() {
        return app_icon;
    }

    public void setApp_icon(String app_icon) {
        this.app_icon = app_icon;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(Ribbon ribbon) {
        this.ribbon = ribbon;
    }
}
