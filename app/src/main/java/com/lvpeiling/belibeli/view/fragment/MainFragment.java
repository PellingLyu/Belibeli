package com.lvpeiling.belibeli.view.fragment;


import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.lvpeiling.belibeli.R;
import com.lvpeiling.belibeli.entity.Project;
import com.lvpeiling.belibeli.presenter.IProjectPresenter;
import com.lvpeiling.belibeli.presenter.ProjectPresenterImpl;
import com.lvpeiling.belibeli.view.view.IProjectView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainFragment extends BaseFragment implements IProjectView {
    @BindView(R.id.tv_test)
    TextView tvTest;
    @BindView(R.id.progressbar)
    ContentLoadingProgressBar progressbar;
    private IProjectPresenter mProjectPresenter;

    public MainFragment() {

    }


    @Override
    public int getContentViewId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initAllView(Bundle savedInstanceState) {
        mProjectPresenter = new ProjectPresenterImpl(this);
        mProjectPresenter.getProjectList(1);

    }

    @Override
    public void showLoading() {
        if(!progressbar.isShown()){
            progressbar.show();
        }
    }

    @Override
    public void loadProjectList(List<Project> projects) {
        tvTest.setText(projects.toString());
    }


    @Override
    public void hideLoading() {
        if(progressbar.isShown()){
            progressbar.hide();
        }
    }

}
