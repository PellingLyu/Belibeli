package com.lvpeiling.belibeli.entity;

import java.util.List;

/**
 * Created by lpl72 on 2017/9/4.
 */

public class ResponseData<T> {
    List<T> projects;
    int http_code;

    public List<T> getProjects() {
        return projects;
    }

    public void setData(List<T> projects) {
        this.projects = projects;
    }

    public int getHttp_code() {
        return http_code;
    }

    public void setHttp_code(int http_code) {
        this.http_code = http_code;
    }
}
