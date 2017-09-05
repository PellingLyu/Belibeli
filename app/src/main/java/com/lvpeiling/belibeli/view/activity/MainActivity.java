package com.lvpeiling.belibeli.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.lvpeiling.belibeli.R;
import com.lvpeiling.belibeli.view.fragment.MainFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private static final String TAG = "MainActivity";
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private MainFragment mainFragment;
    private FragmentTransaction mFragmentTransaction;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initAllView(Bundle savedInstanceState) {
        toolbar.setTitle("Bēlibeli");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        bottomNavigationBar.setActiveColor(R.color.colorPrimary)
                .addItem(new BottomNavigationItem(R.mipmap.main, context.getString(R.string.main)))
                .addItem(new BottomNavigationItem(R.mipmap.find, context.getString(R.string.find)))
                .addItem(new BottomNavigationItem(R.mipmap.gallery, context.getString(R.string.gallery)))
                .addItem(new BottomNavigationItem(R.mipmap.job, context.getString(R.string.job)))
                .initialise();
        bottomNavigationBar.setTabSelectedListener(this);
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (mainFragment == null) {
            mainFragment = new MainFragment();
            mFragmentTransaction.add(R.id.container, mainFragment);
        }
        mFragmentTransaction.show(mainFragment).commit();
    }

    @Override
    public void onTabSelected(int position) {
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (position) {
            case 0:
                if (mainFragment == null) {
                    mainFragment = new MainFragment();
                    mFragmentTransaction.add(R.id.container, mainFragment);
                }
                mFragmentTransaction.show(mainFragment).commit();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    @Override
    public void onTabUnselected(int position) {
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (position) {
            case 0:
                if (mainFragment == null) {
                    mainFragment = new MainFragment();
                    mFragmentTransaction.add(mainFragment, "mainFragment");
                }
                mFragmentTransaction.hide(mainFragment).commit();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

    @Override
    public void onTabReselected(int position) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                break;
            case R.id.login:
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
