package com.lvpeiling.belibeli.presenter;

import com.lvpeiling.belibeli.entity.Project;

import java.util.List;

/**
 * Created by lpl72 on 2017/7/21.
 */

public interface OnProjectListener {
    void onSuccess(List<Project> projects);
    void onError();
}
