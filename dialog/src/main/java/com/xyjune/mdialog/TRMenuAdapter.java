package com.xyjune.mdialog;

import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xyjune.mdialog.bean.MenuItem;

import java.util.List;

public class TRMenuAdapter extends BaseQuickAdapter<MenuItem, BaseViewHolder> {

    private int iconWidth;
    private int iconHeight;

    public TRMenuAdapter(@Nullable List<MenuItem> data) {
        super(R.layout.item_top_right_menu, data);
        iconWidth = -1;
        iconHeight = -1;
    }

    @Override
    protected void convert(BaseViewHolder helper, MenuItem item) {
        ImageView icon = helper.getView(R.id.item_icon);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) icon.getLayoutParams();
        if (iconWidth != -1) {
            layoutParams.width = iconWidth;
        }
        if (iconHeight != -1) {
            layoutParams.height = iconHeight;
        }
        icon.setLayoutParams(layoutParams);
        helper.setImageResource(R.id.item_icon, item.getIcon());
        helper.setText(R.id.item_label, item.getText());
    }

    public void setIconSize(int width, int height) {
        iconHeight = height;
        iconWidth = width;
        notifyDataSetChanged();
    }
}
