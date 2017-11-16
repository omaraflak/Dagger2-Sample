package me.aflak.dagger.module;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aflak.dagger.model.ImageDownloader;

/**
 * Created by Omar on 04/06/2016.
 */
@Module
public class ImageDownloaderModule {
    private Context context;

    public ImageDownloaderModule(Context context){
        this.context = context;
    }

    @Provides @Singleton
    Context provideContext(){
        return context;
    }

    @Provides @Singleton
    ImageDownloader provideImageDownloader(Context context){
        return new ImageDownloader(context);
    }
}
