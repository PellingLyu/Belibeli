package com.lvpeiling.belibeli.view.view;

import android.support.annotation.Nullable;

import com.lvpeiling.belibeli.entity.Project;

import java.util.List;

/**
 * Created by lpl72 on 2017/7/20.
 */

public interface IProjectView {
    void showLoading();
    void loadProjectList(List<Project> projects);
    void hideLoading();
}
