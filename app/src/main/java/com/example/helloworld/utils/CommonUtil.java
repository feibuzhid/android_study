package com.example.helloworld.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;

import com.example.helloworld.R;
import com.example.helloworld.bean.ListPatternBase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author fei
 * @since 2023/10/5
 */
public class CommonUtil {

    private static final String LOG_TAG = "======CommonUtil======";

    public static String[] getDefaultStringArray() {
        return new String[]{"java", "c++", "python", "php", "go"};
    }

    public static List<ListPatternBase> getDefaultPatternBaseList() {
        String[] message = getDefaultStringArray();
        List<ListPatternBase> res = new ArrayList<>();
        for (String s : message) {
            res.add(new ListPatternBase(s, R.drawable.car));
        }
        return res;
    }

    public static String object2String(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(object);
    }

    public static List<ListPatternBase> getAppInfo(Context context) throws PackageManager.NameNotFoundException {
        // 获取PackageManager对象
        PackageManager pm = context.getPackageManager();
        // 设置<intent-filter>标签内需要满足的条件
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_DEFAULT);

        // 通过queryIntentActivities获取ResolveInfo对象
        List<ResolveInfo> resolveInfos = pm.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);

        // 调用系统排序，根据name排序
        // 该排序很重要，否则只能显示系统应用，不能显示第三方应用
        // 其实我测试发现有没有其实是一样的，就是输出的顺序是乱的
        Collections.sort(resolveInfos,
                new ResolveInfo.DisplayNameComparator(pm));

        int flag = 0;
        for (ResolveInfo resolveInfo : resolveInfos) {
            String appName = resolveInfo.loadLabel(pm).toString();// 获取应用名称
            String packageName = resolveInfo.activityInfo.packageName;// 包名
            String className = resolveInfo.activityInfo.name;// 入口类名
//            Log.w(LOG_TAG, "程序名: " + appName + System.lineSeparator()
//                    + "包名: " + packageName + System.lineSeparator()
//                    + "入口类名: " + className);

            if (flag <= 3) {
                ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
                Log.w(LOG_TAG, object2String(applicationInfo));
                flag++;
            }
        }
        flag = 0;

        int loopTimes = Math.min(resolveInfos.size(), 6);
        List<ListPatternBase> res = new ArrayList<>();
        for (int i = 0; i < loopTimes; i++) {
            String packageName = resolveInfos.get(i).activityInfo.packageName;
            res.add(new ListPatternBase(packageName, pm.getApplicationIcon(packageName)));
        }
        return res;
    }
}
