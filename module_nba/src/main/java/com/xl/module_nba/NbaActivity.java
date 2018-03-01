package com.xl.module_nba;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xl.module_library.Base.BaseActivity;
import com.xl.module_library.Bean.NBA_JH;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.SimpleCallback;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ADMIN on 2018/2/28.
 */

@Route(path = "/module_nba/nba_activity")
public class NbaActivity extends BaseActivity implements NbaView{

    private List<NBA_JH.ListBean> list = new ArrayList<>();
    private RecyclerView rv;
    private NbaAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private NbaPsersenter nbaPsersenter;
    private RefreshLayout refreshLayout;

    @Override
    public void loadView() {
        setContentView(R.layout.activity_nba);
        rv = findViewById(R.id.rv);
        refreshLayout = findViewById(R.id.nba_sfl);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mAdapter = new NbaAdapter(getApplicationContext(),list);
        // 设置布局管理器
        rv.setLayoutManager(mLayoutManager);

        // 设置Item添加和移除的动画
        rv.setItemAnimator(new DefaultItemAnimator());
        // 设置Item之间间隔样式
        //rv.addItemDecoration(mDividerItemDecoration);
    }

    @Override
    public void initData() {
        // 设置adapter
        rv.setAdapter(mAdapter);
        nbaPsersenter = new NbaPersenterImpl(this);
        nbaPsersenter.getData(getApplication());

        //设置 Header 为 BezierRadar 样式
        refreshLayout.setRefreshHeader(new BezierRadarHeader(this).setEnableHorizontalDrag(true));
        //设置 Footer 为 球脉冲
        refreshLayout.setRefreshFooter(new BallPulseFooter(this).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setPrimaryColorsId(R.color.bottom_icon, R.color.colorWhite);
        //refreshLayout.setEnableLoadmore(true);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                Logger.i("--------刷新");
                //orderPersenter.getMinatainOrderList(String.valueOf(current_state),0,20);
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });

        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                Logger.i("--------加载");
                //orderPersenter.getMinatainOrderList(String.valueOf(current_state),0,20);
                refreshlayout.finishLoadmore(2000/*true*/);//传入false表示加载失败
            }
        });

    }

    @Override
    public void setData(NBA_JH nba_jh) {
        list.clear();
        list.addAll(nba_jh.getList());
        mAdapter.updateData(list);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        nbaPsersenter.onDestory();
    }
}
