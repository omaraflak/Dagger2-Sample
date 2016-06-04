package me.aflak.dagger.component;

import dagger.Component;
import me.aflak.dagger.MainActivity;
import me.aflak.dagger.module.ImageDownloaderModule;

/**
 * Created by Omar on 04/06/2016.
 */
@Component (modules = ImageDownloaderModule.class)
public interface ImageDownloaderComponent {
    void inject(MainActivity mainActivity);
}
