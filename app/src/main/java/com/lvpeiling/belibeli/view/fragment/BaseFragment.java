package com.lvpeiling.belibeli.view.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {
    protected abstract int getContentViewId();
    private Unbinder unbinder;
    private Context context;
    protected View mRootView;
    protected abstract void initAllView(Bundle savedInstanceState);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = this.getContext();
        mRootView = LayoutInflater.from(context).inflate(getContentViewId(),container,false);
        unbinder = ButterKnife.bind(this,mRootView);
        initAllView(savedInstanceState);
        return mRootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
