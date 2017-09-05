package com.lvpeiling.belibeli;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lpl72 on 2017/6/20.
 */

public class ActivityManager {
    private static List<AppCompatActivity> activities;
    public static void addActivity(AppCompatActivity activity){
        if (activities == null){
            activities = new ArrayList<>();
        }
        activities.add(activity);
    }
    public static void removeActivity(AppCompatActivity activity){
        if (activities != null){
            activities.remove(activity);
        }
    }
    public static void finishAll(){
        if(activities != null){
            for (AppCompatActivity activity : activities){
                if (!activity.isFinishing()){
                    activity.finish();
                }
            }
        }
    }
}

