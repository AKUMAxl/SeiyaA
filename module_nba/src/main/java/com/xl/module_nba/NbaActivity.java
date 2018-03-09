package com.xl.module_nba;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

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
import com.xl.module_library.Base.SectionDecoration;
import com.xl.module_library.Bean.NBA_JH;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.SimpleCallback;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by ADMIN on 2018/2/28.
 */

@Route(path = "/module_nba/nba_activity")
public class NbaActivity extends BaseActivity implements NbaView{

    private List<NBA_JH.ListBean.TrBean> list = new ArrayList<>();
    private List<String> list_section = new ArrayList<>();
    private RecyclerView rv;
    private NbaAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private NbaPsersenter nbaPsersenter;
    private RefreshLayout refreshLayout;
    private Toolbar toolbar;

    @Override
    public void loadView() {

        setContentView(R.layout.activity_nba);
        rv = findViewById(R.id.rv);
        refreshLayout = findViewById(R.id.nba_sfl);
        refreshLayout.setEnableLoadmore(true);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mAdapter = new NbaAdapter(getApplicationContext(),list);
        // 设置布局管理器
        rv.setLayoutManager(mLayoutManager);

        // 设置Item添加和移除的动画
        rv.setItemAnimator(new DefaultItemAnimator());

        // 设置Item之间间隔样式
        rv.addItemDecoration(new SectionDecoration(list_section,getApplication(), new SectionDecoration.DecorationCallback() {
            //返回标记id (即每一项对应的标志性的字符串)
            @Override
            public String getGroupId(int position) {
                if (list_section.size()==position||list_section.size()<position){
                    return "-1";
                }
                if(list_section.get(position)!=null) {
                    return list_section.get(position);
                }
                return "-1";
            }

            //获取同组中的第一个内容
            @Override
            public String getGroupFirstLine(int position) {
                if (list_section.size()==position||list_section.size()<position){
                    return "";
                }
                if(list_section.get(position)!=null) {
                    return list_section.get(position);
                }
                return "";
            }
        }));
    }

    @Override
    public void initData() {
        // 设置adapter
        rv.setAdapter(mAdapter);
        nbaPsersenter = new NbaPersenterImpl(this);
        //nbaPsersenter.getData(getApplication());

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.getState();
                if (refreshlayout.isEnableRefresh()){
                    nbaPsersenter.getData(getApplication());
                }else {
                    refreshlayout.finishRefresh(2000,false);
                }
            }
        });

        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                Logger.i("--------加载");
                refreshlayout.finishLoadmore(2000/*true*/);//传入false表示加载失败
            }
        });

    }

    @Override
    public void firstRequestNet() {
        super.firstRequestNet();
        refreshLayout.autoRefresh();
    }

    @Override
    public void setData(NBA_JH nba_jh) {
        refreshLayout.finishLoadmore(true);
        refreshLayout.finishRefresh(true);
        list.clear();
        String date = "";
        for (int i=0;i<nba_jh.getList().size();i++){
            date = nba_jh.getList().get(i).getTitle();
            for (int j=0;j<nba_jh.getList().get(i).getTr().size();j++){
                list.add(nba_jh.getList().get(i).getTr().get(j));
                list_section.add(date);
            }
        }
        mAdapter.updateData(list);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        nbaPsersenter.onDestory();
    }
}
