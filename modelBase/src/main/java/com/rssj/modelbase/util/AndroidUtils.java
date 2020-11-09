package com.rssj.modelbase.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Create by rssj on 2020/11/9
 */
public class AndroidUtils {

    public static void startAct(Context context, String actName){
        try {
            Intent intent = new Intent(context, Class.forName(actName));
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
