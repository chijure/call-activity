package com.reateguisolisjm.plugins.callactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ComponentName;
import android.content.Intent;

public class CallActivity {
    public void openActivity(AppCompatActivity baseActivity, String packageName, String activity) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(packageName, packageName + "." + activity));
            baseActivity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
