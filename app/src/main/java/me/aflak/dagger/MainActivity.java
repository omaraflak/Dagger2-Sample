package me.aflak.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import javax.inject.Inject;

import me.aflak.dagger.model.ImageDownloader;

public class MainActivity extends AppCompatActivity {
    @Inject ImageDownloader downloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.app().getImageDownloaderComponent().inject(this);

        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        downloader.toImageView(imageView, "http://i.imgur.com/EjH6r8C.png");
    }
}