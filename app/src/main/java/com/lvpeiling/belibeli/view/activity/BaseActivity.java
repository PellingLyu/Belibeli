package com.lvpeiling.belibeli.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lvpeiling.belibeli.ActivityManager;
import com.lvpeiling.belibeli.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
    public abstract int getContentViewId();
    public Context context;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        unbinder = ButterKnife.bind(this);
        context = this;
        initAllView(savedInstanceState);
        ActivityManager.addActivity(this);
    }
    protected abstract void initAllView(Bundle savedInstanceState);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.removeActivity(this);
        unbinder.unbind();
    }

}
