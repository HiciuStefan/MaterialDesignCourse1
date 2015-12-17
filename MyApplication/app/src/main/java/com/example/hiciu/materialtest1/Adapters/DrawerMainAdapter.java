package com.example.hiciu.materialtest1.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hiciu.materialtest1.Models.ModelDrawerMain;
import com.example.hiciu.materialtest1.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Hiciu on 12/16/2015.
 */
public class DrawerMainAdapter extends RecyclerView.Adapter<DrawerMainAdapter.MyViewHolder> {
    private LayoutInflater layoutInflater;
    List<ModelDrawerMain> data = Collections.emptyList();
    String TAG  = "Adapter  ";

    public DrawerMainAdapter(Context context, List<ModelDrawerMain> data) {
        layoutInflater = LayoutInflater.from(context);
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        Log.d(TAG, "onCreateViewHolder ");
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ModelDrawerMain current = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
        Log.d(TAG, "onBindViewHolder: " + position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }
    }
}
