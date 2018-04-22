
package com.up.stack.app.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("480w_still")
    @Expose
    private com.up.stack.app.model.response._480wStill _480wStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param previewGif
     * @param originalMp4
     * @param originalStill
     * @param fixedHeightSmallStill
     * @param downsizedMedium
     * @param previewWebp
     * @param fixedWidth
     * @param looping
     * @param downsizedLarge
     * @param downsizedStill
     * @param fixedWidthSmallStill
     * @param fixedWidthSmall
     * @param fixedHeight
     * @param fixedWidthStill
     * @param fixedWidthDownsampled
     * @param preview
     * @param fixedHeightSmall
     * @param downsizedSmall
     * @param original
     * @param _480wStill
     * @param fixedHeightDownsampled
     * @param fixedHeightStill
     * @param downsized
     */
    public Images(FixedHeightStill fixedHeightStill, OriginalStill originalStill, FixedWidth fixedWidth, FixedHeightSmallStill fixedHeightSmallStill, FixedHeightDownsampled fixedHeightDownsampled, Preview preview, FixedHeightSmall fixedHeightSmall, DownsizedStill downsizedStill, Downsized downsized, DownsizedLarge downsizedLarge, FixedWidthSmallStill fixedWidthSmallStill, PreviewWebp previewWebp, FixedWidthStill fixedWidthStill, com.up.stack.app.model.response._480wStill _480wStill, FixedWidthSmall fixedWidthSmall, DownsizedSmall downsizedSmall, FixedWidthDownsampled fixedWidthDownsampled, DownsizedMedium downsizedMedium, Original original, FixedHeight fixedHeight, Looping looping, OriginalMp4 originalMp4, PreviewGif previewGif) {
        super();
        this.fixedHeightStill = fixedHeightStill;
        this.originalStill = originalStill;
        this.fixedWidth = fixedWidth;
        this.fixedHeightSmallStill = fixedHeightSmallStill;
        this.fixedHeightDownsampled = fixedHeightDownsampled;
        this.preview = preview;
        this.fixedHeightSmall = fixedHeightSmall;
        this.downsizedStill = downsizedStill;
        this.downsized = downsized;
        this.downsizedLarge = downsizedLarge;
        this.fixedWidthSmallStill = fixedWidthSmallStill;
        this.previewWebp = previewWebp;
        this.fixedWidthStill = fixedWidthStill;
        this._480wStill = _480wStill;
        this.fixedWidthSmall = fixedWidthSmall;
        this.downsizedSmall = downsizedSmall;
        this.fixedWidthDownsampled = fixedWidthDownsampled;
        this.downsizedMedium = downsizedMedium;
        this.original = original;
        this.fixedHeight = fixedHeight;
        this.looping = looping;
        this.originalMp4 = originalMp4;
        this.previewGif = previewGif;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public com.up.stack.app.model.response._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(com.up.stack.app.model.response._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

}
