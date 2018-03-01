package com.xl.module_nba;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xl.module_library.Bean.NBA_JH;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 2018/2/28.
 */

public class NbaAdapter extends RecyclerView.Adapter<NbaAdapter.ViewHolder>{

    private Context context;
    private List<NBA_JH.ListBean> list = new ArrayList<>();

    public NbaAdapter(Context context,List<NBA_JH.ListBean> list){
        this.context = context;
        this.list = list;
    }

    public void updateData(List<NBA_JH.ListBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nba,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }

}
