package com.trungdang.chatdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

public class TinnhanAdapter extends RecyclerView.Adapter<TinnhanAdapter.ViewHolder>{
    ArrayList<tinnhan> tinnhanArrayList;
    Context context;

    public TinnhanAdapter(ArrayList<tinnhan> tinnhanArrayList, Context context) {
        this.tinnhanArrayList = tinnhanArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemview= inflater.inflate(R.layout.custom_item_recyclerview,parent,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ten.setText(tinnhanArrayList.get(position).getTen());
        holder.tinnnhan.setText(tinnhanArrayList.get(position).getTinnhan());
        holder.thongbao.setText(tinnhanArrayList.get(position).getThongbao());
        holder.thoigian.setText(tinnhanArrayList.get(position).getThoigian());
        holder.img.setImageResource(tinnhanArrayList.get(position).getHinh());

    }

    @Override
    public int getItemCount() {
        return tinnhanArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView ten,tinnnhan,thoigian,thongbao;
        CircularImageView img;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.txtTen);
            tinnnhan=itemView.findViewById(R.id.txttinnhan);
            thoigian=itemView.findViewById(R.id.txtthoigian);
            thongbao=itemView.findViewById(R.id.txtthongbaotrongrecycleview);
            img=itemView.findViewById(R.id.imgAvatar);
            relativeLayout=itemView.findViewById(R.id.relativelayoutchinh);

        }
    }
}
