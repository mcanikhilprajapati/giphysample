package com.up.stack.app.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.up.stack.app.R;
import com.up.stack.app.database.DBController;
import com.up.stack.app.database.GiphyOBox;
import com.up.stack.app.player.ExoPlayerActivity;

import java.util.ArrayList;
import java.util.List;

public class GiphysAdapter extends RecyclerView.Adapter<GiphysAdapter.MyViewHolder> {
    private Context mContext;
    private List<GiphyOBox> data = new ArrayList<>();

    public GiphysAdapter(Context c) {
        this.mContext = c;
    }

    public void setData(List<GiphyOBox> data) {
        //data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final GiphyOBox datum = data.get(position);

        if (!TextUtils.isEmpty(datum.getThumbs())) {
//            Glide.with(mContext)
//                    .load(datum.getGifURl())
//                    .asGif()
//                    .placeholder(R.drawable.ic_launcher)
//                    .crossFade()
//                    .into(holder.img_thumb);
            Glide.with(mContext)
                    .load(datum.getThumbs())
                    .dontAnimate()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .into(holder.img_thumb);
        }
        if (datum.getUpvotes() != 0) {
            holder.txt_upvote.setText(String.valueOf(datum.getUpvotes()));
        } else {
            holder.txt_upvote.setText("");
        }

        if (datum.getDownvotes() != 0) {
            holder.txt_downvote.setText(String.valueOf(datum.getDownvotes()));
        } else {
            holder.txt_downvote.setText("");
        }

        holder.img_thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ExoPlayerActivity.class);
                intent.putExtra("myvideo", datum.getVideoURl());
                mContext.startActivity(intent);
            }
        });
        holder.txt_upvote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GiphyOBox ex = data.get(position);
                ex.setUpvotes(ex.getUpvotes() + 1);
                DBController.getInstance().update(ex);
                //data.get(position).setUpvotes(data.get(position).getUpvotes() + 1);
                notifyItemChanged(position);
            }
        });

        holder.txt_downvote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GiphyOBox ex = data.get(position);
                ex.setDownvotes(ex.getDownvotes() + 1);
                DBController.getInstance().update(ex);
               // data.get(position).setDownvotes(data.get(position).getDownvotes() + 1);
                notifyItemChanged(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public AppCompatImageView img_thumb;
        public TextView txt_upvote;
        public TextView txt_downvote;

        public MyViewHolder(View view) {
            super(view);
            img_thumb = (AppCompatImageView) view.findViewById(R.id.img_thumb);
            txt_upvote = (TextView) view.findViewById(R.id.txt_upvote);
            txt_downvote = (TextView) view.findViewById(R.id.txt_downvote);

        }

    }


}