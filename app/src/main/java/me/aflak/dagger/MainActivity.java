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

        ImageView imageView = findViewById(R.id.main_image);
        downloader.toImageView(imageView, "http://s2.quickmeme.com/img/a6/a69d84379a04cc6f56a58c1c9b8d0826ddd24c9e52644ac7a068705a7be1a6bb.jpg");
    }
}