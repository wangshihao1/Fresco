package com.bawei.weekones.ui.adapter;

import android.support.annotation.Nullable;
import com.bawei.weekones.R;
import com.bawei.weekones.data.bean.InfoBean;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class ShowDataAdapter extends BaseQuickAdapter<InfoBean.DataBean,BaseViewHolder> {


    public ShowDataAdapter(int layoutResId, @Nullable List<InfoBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, InfoBean.DataBean item) {
        SimpleDraweeView view = helper.getView(R.id.simple);
        helper.setText(R.id.tv_info,item.getTitle());
        Glide.with(mContext).load(item.getThumbnail_pic_s()).into(view);
    }
}
