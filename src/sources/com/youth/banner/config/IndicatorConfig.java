package com.youth.banner.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class IndicatorConfig {
    private int currentPosition;
    private int indicatorSize;
    private Margins margins;
    private int gravity = 1;
    private int indicatorSpace = BannerConfig.INDICATOR_SPACE;
    private int normalWidth = BannerConfig.INDICATOR_NORMAL_WIDTH;
    private int selectedWidth = BannerConfig.INDICATOR_SELECTED_WIDTH;
    private int normalColor = BannerConfig.INDICATOR_NORMAL_COLOR;
    private int selectedColor = BannerConfig.INDICATOR_SELECTED_COLOR;
    private int radius = BannerConfig.INDICATOR_RADIUS;
    private int height = BannerConfig.INDICATOR_HEIGHT;
    private boolean attachToBanner = true;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
        public static final int CENTER = 1;
        public static final int LEFT = 0;
        public static final int RIGHT = 2;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Margins {
        public int bottomMargin;
        public int leftMargin;
        public int rightMargin;
        public int topMargin;

        public Margins() {
            this(BannerConfig.INDICATOR_MARGIN);
        }

        public Margins(int i11) {
            this(i11, i11, i11, i11);
        }

        public Margins(int i11, int i12, int i13, int i14) {
            this.leftMargin = i11;
            this.topMargin = i12;
            this.rightMargin = i13;
            this.bottomMargin = i14;
        }
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getGravity() {
        return this.gravity;
    }

    public int getHeight() {
        return this.height;
    }

    public int getIndicatorSize() {
        return this.indicatorSize;
    }

    public int getIndicatorSpace() {
        return this.indicatorSpace;
    }

    public Margins getMargins() {
        if (this.margins == null) {
            setMargins(new Margins());
        }
        return this.margins;
    }

    public int getNormalColor() {
        return this.normalColor;
    }

    public int getNormalWidth() {
        return this.normalWidth;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getSelectedWidth() {
        return this.selectedWidth;
    }

    public boolean isAttachToBanner() {
        return this.attachToBanner;
    }

    public IndicatorConfig setAttachToBanner(boolean z11) {
        this.attachToBanner = z11;
        return this;
    }

    public IndicatorConfig setCurrentPosition(int i11) {
        this.currentPosition = i11;
        return this;
    }

    public IndicatorConfig setGravity(int i11) {
        this.gravity = i11;
        return this;
    }

    public IndicatorConfig setHeight(int i11) {
        this.height = i11;
        return this;
    }

    public IndicatorConfig setIndicatorSize(int i11) {
        this.indicatorSize = i11;
        return this;
    }

    public IndicatorConfig setIndicatorSpace(int i11) {
        this.indicatorSpace = i11;
        return this;
    }

    public IndicatorConfig setMargins(Margins margins) {
        this.margins = margins;
        return this;
    }

    public IndicatorConfig setNormalColor(int i11) {
        this.normalColor = i11;
        return this;
    }

    public IndicatorConfig setNormalWidth(int i11) {
        this.normalWidth = i11;
        return this;
    }

    public IndicatorConfig setRadius(int i11) {
        this.radius = i11;
        return this;
    }

    public IndicatorConfig setSelectedColor(int i11) {
        this.selectedColor = i11;
        return this;
    }

    public IndicatorConfig setSelectedWidth(int i11) {
        this.selectedWidth = i11;
        return this;
    }
}
