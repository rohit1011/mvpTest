package com.example.mvppractice.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvppractice.R;
import com.example.mvppractice.model.Breakfast;
import com.squareup.picasso.Picasso;

import java.util.List;


public class BreakFastAdapter extends RecyclerView.Adapter<BreakFastAdapter.ViewHolder> {
    private Context mContext;
    private List<Breakfast> breakfast;
    public void setBreakfasts(List<Breakfast> breakfasts) {
        this.breakfast = breakfasts;
        notifyDataSetChanged();
    }

    public BreakFastAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_itemview_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.product_name.setText(breakfast.get(i).getTitle());
        viewHolder.price.setText(breakfast.get(i).getPrice());
        Picasso.get().load(breakfast.get(i).getUrl()).into(viewHolder.imageView);
        Log.i("ROHIT","MEASADE"+breakfast.size());
        Log.i("r","tahj"+breakfast.size());
    }

    @Override
    public int getItemCount() {
        if (breakfast==null){
            return 10;
        }
        else
            return breakfast.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView product_name,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.product_imag);
            product_name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
