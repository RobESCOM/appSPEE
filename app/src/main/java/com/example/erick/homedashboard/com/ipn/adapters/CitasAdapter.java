package com.example.erick.homedashboard.com.ipn.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.erick.homedashboard.R;

import java.util.List;

public class CitasAdapter extends RecyclerView.Adapter<CitasAdapter.MyViewHolder> {

    private List<String> items;
    private Context context;

    public CitasAdapter(Context context, List<String> items) {
        this.context = context;
        this.items= items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder itemsViewHolder, int i) {
        itemsViewHolder.vTitle.setText(items.get(i));
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_citas, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        protected TextView vTitle;

        public MyViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}