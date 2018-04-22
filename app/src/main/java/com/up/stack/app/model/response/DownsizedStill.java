
package com.up.stack.app.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DownsizedStill {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("size")
    @Expose
    private String size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownsizedStill() {
    }

    /**
     * 
     * @param height
     * @param width
     * @param url
     * @param size
     */
    public DownsizedStill(String url, String width, String height, String size) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
