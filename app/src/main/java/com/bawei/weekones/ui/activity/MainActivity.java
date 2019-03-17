package com.bawei.weekones.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bawei.weekones.R;
import com.bawei.weekones.data.bean.InfoBean;
import com.bawei.weekones.di.contract.IShowDataContract;
import com.bawei.weekones.di.presenter.IShowDataPresenterImp;
import com.bawei.weekones.ui.adapter.ShowDataAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IShowDataContract.IShowDataContractView {

    @BindView(R.id.cycle)
    RecyclerView cycle;
    private ShowDataAdapter showDataAdapter;
    private IShowDataPresenterImp presenterImp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenterImp = new IShowDataPresenterImp();
        presenterImp.atteachView(this);
        presenterImp.responseData();
    }

    @Override
    public void showData(InfoBean infoBean) {
        List<InfoBean.DataBean> data = infoBean.getData();
        showDataAdapter = new ShowDataAdapter(R.layout.item_data,data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        cycle.setLayoutManager(layoutManager);
        cycle.setAdapter(showDataAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenterImp.deatachView(this);
    }
}
