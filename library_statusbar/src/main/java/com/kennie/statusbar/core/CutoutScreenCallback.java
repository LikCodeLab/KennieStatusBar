package com.kennie.statusbar.core;


import com.kennie.statusbar.model.CutoutScreenInfo;

/**
 * Author:
 * Date: 2021-10-25 17:19
 * Email:
 * Des: 刘海屏信息回调接口
 */
public interface CutoutScreenCallback {
    void onResult(CutoutScreenInfo info);
}
