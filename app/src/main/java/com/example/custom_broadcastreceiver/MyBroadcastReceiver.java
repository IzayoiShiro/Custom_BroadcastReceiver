package com.example.custom_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 杨天宇 on 2016/7/16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: 自定义的广播接收者接收到了广播事件");
        Log.i(TAG, "onReceive: "+intent.getAction());
    }
}
