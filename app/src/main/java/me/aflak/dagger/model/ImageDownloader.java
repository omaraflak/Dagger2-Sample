package me.aflak.dagger.model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

/**
 * Created by Omar on 04/06/2016.
 */
public class ImageDownloader {
    private Context context;

    @Inject
    public ImageDownloader(Context context) {
        this.context = context;
    }

    public void toImageView(ImageView imageView, String url){
        Glide.with(context).load(url).into(imageView);
        // (one of the) advantage of Dagger: you can now simply switch between two libraries
        // Picasso.with(context).load(url).into(imageView);
    }
}
