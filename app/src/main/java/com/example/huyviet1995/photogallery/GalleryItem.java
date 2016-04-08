package com.example.huyviet1995.photogallery;

/**
 * Created by huyviet1995 on 4/7/16.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    @Override
    public String toString() {
        return mCaption;
    }


    public void setId(String id) {
        this.mId = id;
    }

    public void setCaption(String caption) {
        this.mCaption = caption;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}
