package com.up.stack.app.database;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class GiphyOBox {
    @Id
    private Long Ids;
    public String id;
    private String gifURl;
    private String videoURl;
    private String thumbs;
    private int upvotes=0;
    private int downvotes=0;

    public GiphyOBox() {

    }

    public GiphyOBox(String id, String gifURl, String videoURl, String thumbs) {
        this.id = id;
        this.gifURl = gifURl;
        this.videoURl = videoURl;
        this.thumbs = thumbs;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGifURl() {
        return gifURl;
    }

    public void setGifURl(String gifURl) {
        this.gifURl = gifURl;
    }

    public String getVideoURl() {
        return videoURl;
    }

    public void setVideoURl(String videoURl) {
        this.videoURl = videoURl;
    }

    public String getThumbs() {
        return thumbs;
    }

    public void setThumbs(String thumbs) {
        this.thumbs = thumbs;
    }

    public Long getIds() {
        return Ids;
    }

    public void setIds(Long ids) {
        Ids = ids;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }
}
