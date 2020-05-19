package com.xyjune.mdialog;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xyjune.mdialog.bean.MenuItem;

import java.util.List;

public class TRMenuAdapter extends BaseQuickAdapter<MenuItem, BaseViewHolder> {
    public TRMenuAdapter(@Nullable List<MenuItem> data) {
        super(R.layout.item_top_right_menu, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MenuItem item) {
        helper.setImageResource(R.id.item_icon, item.getIcon());
        helper.setText(R.id.item_label, item.getText());
    }
}
