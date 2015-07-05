package com.muzammilpeer.valuware.api.com.muzammilpeer.valuware.models;

/**
 * Created by muzammilpeer on 05/07/15.
 */
public class TrackModel {

    String title;
    String singer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", singer=" + singer + "]";
    }
}
