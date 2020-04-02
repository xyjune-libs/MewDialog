package com.xyjune.mewdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.xyjune.mdialog.MewDialog;
import com.xyjune.mdialog.base.BaseAlertDialog;

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
}
