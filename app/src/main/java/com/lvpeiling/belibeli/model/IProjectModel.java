package com.lvpeiling.belibeli.model;

import com.lvpeiling.belibeli.entity.Project;
import com.lvpeiling.belibeli.presenter.OnProjectListener;

import java.util.List;
import java.util.Map;


/**
 * Created by lpl72 on 2017/7/20.
 */

public interface IProjectModel {

//    Observable<Project> getProjectList(int page, OnProjectListener listener);
//    Observable<Project> getProjectListQuery(Map<String,String> queryParam, int page,OnProjectListener listener);

    void getProjectList(int page, OnProjectListener listener);

    void getProjectListQuery(Map<String,String> queryParam, int page,OnProjectListener listener);
}
