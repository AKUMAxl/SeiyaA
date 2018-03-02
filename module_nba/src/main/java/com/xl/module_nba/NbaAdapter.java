package com.xl.module_nba;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.xl.module_library.Bean.NBA_JH;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 2018/2/28.
 */

public class NbaAdapter extends RecyclerView.Adapter<NbaAdapter.ViewHolder>{

    private Context context;
    private List<NBA_JH.ListBean.TrBean> list = new ArrayList<>();

    public NbaAdapter(Context context,List<NBA_JH.ListBean.TrBean> list){
        this.context = context;
        this.list = list;
    }

    public void updateData(List<NBA_JH.ListBean.TrBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nba,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getScore());
        Picasso.with(context).load(list.get(position).getPlayer1logo()).resize(64,64).into(holder.iv_team1);
        Picasso.with(context).load(list.get(position).getPlayer2logo()).resize(64,64).into(holder.iv_team2);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView iv_team1,iv_team2;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_score);
            iv_team1 = itemView.findViewById(R.id.nba_team1_pic);
            iv_team2 = itemView.findViewById(R.id.nba_team2_pic);
        }
    }

}
