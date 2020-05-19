package com.xyjune.mdialog;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.xyjune.mdialog.popup.BottomPopupWindow;

import java.util.List;

public class MenuPopupWindow extends BottomPopupWindow {
    private List<String> mStrings;

    public MenuPopupWindow(Context context, List<String> list) {
        super(context);

    }
}
