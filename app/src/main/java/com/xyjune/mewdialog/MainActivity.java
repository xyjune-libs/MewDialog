package com.xyjune.mewdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.xyjune.mdialog.MewDialog;
import com.xyjune.mdialog.TRMenuPopupWindow;
import com.xyjune.mdialog.base.BaseAlertDialog;
import com.xyjune.mdialog.bean.MenuItem;
import com.xyjune.mdialog.popup.BottomPopupWindow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        new MewDialog(this)
                .setTitle("MewDialog")
                .setContentImg(R.mipmap.ic_launcher)
                .setContent("是否好用？")
                .setButtonText("不好", "好用")
                .setButtonListener(new BaseAlertDialog.OnLeftClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "不好用别用!", Toast.LENGTH_SHORT).show();
                    }
                }, new BaseAlertDialog.OnRightClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "谢谢使用!", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public void showPopupWindow(View view) {
        BottomPopupWindow popupWindow = new BottomPopupWindow(this);
        popupWindow.setContentView(LayoutInflater.from(this).inflate(R.layout.popup, null));
        popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.popbg));
        popupWindow.show();
    }

    public void showTopRight(View view) {
        TRMenuPopupWindow popupWindow = new TRMenuPopupWindow(this);
        popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.trm_popup_bg));
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_launcher_background, "lalallala"));
        list.add(new MenuItem(R.drawable.ic_launcher_background, "asfdasfdasfas"));
        popupWindow.setMenu(list);
        popupWindow.setOnMenuListener(new TRMenuPopupWindow.OnMenuListener() {
            @Override
            public void onMenuItemClick(int position) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        popupWindow.showAsDropDown(view, 10, 0);
    }
}
