package com.lvpeiling.belibeli.presenter;

import com.lvpeiling.belibeli.entity.Project;
import com.lvpeiling.belibeli.model.IProjectModel;
import com.lvpeiling.belibeli.model.ProjectModelImpl;
import com.lvpeiling.belibeli.view.view.IProjectView;

import java.util.List;
import java.util.Map;

/**
 * Created by lpl72 on 2017/7/20.
 */

public class ProjectPresenterImpl implements IProjectPresenter,OnProjectListener{

    private IProjectModel projectModel;
    private IProjectView projectView;

    public ProjectPresenterImpl(IProjectView projectView){
        projectModel = new ProjectModelImpl();
        this.projectView = projectView;
    }

    @Override
    public void getProjectList(int page) {
        this.projectView.showLoading();
        projectModel.getProjectList(page,this);
    }

    @Override
    public void getQueryProjectList(Map<String, String> param, int page) {
        projectView.showLoading();
        projectModel.getProjectListQuery(param, page, this);
    }

    @Override
    public void onSuccess(List<Project> projects) {
        projectView.hideLoading();
        projectView.loadProjectList(projects);

    }

    @Override
    public void onError() {
        projectView.hideLoading();
    }
}
