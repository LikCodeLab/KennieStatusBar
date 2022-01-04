package com.kennie.statusbar.core.not;

import android.app.Activity;
import android.view.View;

import com.kennie.statusbar.core.CutoutScreen;
import com.kennie.statusbar.utils.ScreenUtil;


/**
 * Author:
 * Date: 2021-10-21 15:56
 * Email:
 * Des: 非刘海屏
 */
public class NotCutoutScreen implements CutoutScreen {

    @Override
    public boolean hasCutout(Activity activity) {
        return false;
    }

    @Override
    public void setDisplayInCutout(final Activity activity) {
        final View contentView = activity.getWindow().getDecorView();
        contentView.post(new Runnable() {
            @Override
            public void run() {
                View view = ScreenUtil.getContentFirstChild(activity);
                if (view == null) {
                    return;
                }
                view.setPadding(0,0,0,0);
            }
        });
    }

    @Override
    public void getCutoutRect(Activity activity, CutoutSizeCallback callback) {
        callback.onResult(null);
    }
}
