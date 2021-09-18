package com.reateguisolisjm.plugins.callactivity;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CallActivity")
public class CallActivityPlugin extends Plugin {

    private CallActivity implementation = new CallActivity();

    @PluginMethod
    public void openActivity(PluginCall call) {
        String packageName = call.getString("package");
        String activity = call.getString("activity");

        if (packageName == null || activity == null) {
            call.reject("package and activity are required");
            return;
        }

        implementation.openActivity(getActivity(), packageName, activity);

        call.resolve();
    }
}
