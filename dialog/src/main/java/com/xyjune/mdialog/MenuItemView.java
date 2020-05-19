package com.xyjune.mdialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MenuItemView extends LinearLayout {

    private ImageView mIcon;
    private TextView mLabel;

    public MenuItemView(Context context) {
        this(context, null);
    }

    public MenuItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mIcon = new ImageView(getContext());
        mIcon.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(mIcon);
        mLabel = new TextView(getContext());
        mLabel.setTextSize(14);
        mLabel.setTextColor(Color.parseColor("#333333"));
        addView(mLabel, new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    public void setIconSize(int width, int height) {
        LayoutParams layoutParams = (LayoutParams) mIcon.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        mIcon.setLayoutParams(layoutParams);
    }

    public void setIcon(int id) {
        mIcon.setImageResource(id);
    }

    public void setText(String text) {
        mLabel.setText(text);
    }

    public void hideIcon() {
        mIcon.setVisibility(GONE);
    }

    public void showIcon() {
        mIcon.setVisibility(VISIBLE);
    }

    public void setTextSize(float size) {
        mLabel.setTextSize(size);
    }

    public void setTextColor(int color) {
        mLabel.setTextColor(color);
    }
}
