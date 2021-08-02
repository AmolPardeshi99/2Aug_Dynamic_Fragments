package com.example.a2aug_dynamic_fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.example.a2aug_dynamic_fragments.ResponseModel;
import androidx.recyclerview.widget.RecyclerView;
public class UserViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvImage;
    private TextView mTvTitle, mTvSubTitle;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        mIvImage = itemView.findViewById(R.id.IvImage);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mTvSubTitle = itemView.findViewById(R.id.tvSubTitle);
    }

    public void setData(ResponseModel responseModel){
        Glide.with(mIvImage).load(responseModel.getImage()).into(mIvImage);
        mTvTitle.setText(responseModel.getTitle());
        mTvSubTitle.setText(responseModel.getSubTitle());
    }
}
