package com.lvpeiling.belibeli.presenter;

import java.util.Map;

/**
 * Created by lpl72 on 2017/7/21.
 */

public interface IProjectPresenter {

    void getProjectList(int page);

    void getQueryProjectList(Map<String,String> param, int page);
}
