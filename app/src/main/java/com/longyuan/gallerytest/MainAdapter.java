package com.longyuan.gallerytest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by loxu on 02/10/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.GalleryViewHolder> {


    private List<String> mImageList = new ArrayList<>();

    private Context mContext;



    private MainClickListener mMainClickListener;

    public MainAdapter(Context context,List<String> imageList) {

        mContext = context;
        mImageList = imageList;
    }

    @Override
    public GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item,parent,false);

        return new GalleryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GalleryViewHolder holder, final int position) {

        //holder.mImageView.setImageResource(android.R.drawable.btn_star);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mMainClickListener.onClick(v,position);
            }
        });

        Glide.with(mContext).load(R.drawable.mona_lisa).into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }

    public void setMainClickListener(MainClickListener mMainClickListener) {
        this.mMainClickListener = mMainClickListener;
    }


    public static class GalleryViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;

        public GalleryViewHolder(View itemView) {
            super(itemView);

            mImageView = (ImageView) itemView.findViewById(R.id.image_item);
        }
    }
}
