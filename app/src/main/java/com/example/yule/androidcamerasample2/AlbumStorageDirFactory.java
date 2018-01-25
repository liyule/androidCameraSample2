package com.example.yule.androidcamerasample2;

/**
 * Created by yule on 24/1/2018.
 */

import java.io.File;

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}