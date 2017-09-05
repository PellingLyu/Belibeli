package com.lvpeiling.belibeli.model;

import android.util.Log;

import com.lvpeiling.belibeli.entity.Project;
import com.lvpeiling.belibeli.entity.ResponseData;
import com.lvpeiling.belibeli.network.RetrofitManager;
import com.lvpeiling.belibeli.presenter.OnProjectListener;

import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;



/**
 * Created by lpl72 on 2017/7/20.
 */

public class ProjectModelImpl implements IProjectModel {
    private List<Project> projectsList;
    @Override
    public void getProjectList(final int page, final OnProjectListener listener) {
        RetrofitManager.getInstance().getProjectList(null,page).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<ResponseData>() {

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ResponseData responseData) {
                        projectsList = responseData.getProjects();
                        listener.onSuccess(projectsList);
                        Log.e("next",projectsList.toString());
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.e("error",e.getMessage());
                        listener.onError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getProjectListQuery(Map<String, String> queryParam, int page, OnProjectListener listener) {
        RetrofitManager.getInstance().getProjectList(queryParam,page);
    }
}
