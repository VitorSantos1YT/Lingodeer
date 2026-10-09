package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.k0;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import i.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class UCrop {
    public static final String EXTRA_ASPECT_RATIO_X = "com.yalantis.ucrop.AspectRatioX";
    public static final String EXTRA_ASPECT_RATIO_Y = "com.yalantis.ucrop.AspectRatioY";
    public static final String EXTRA_ERROR = "com.yalantis.ucrop.Error";
    public static final String EXTRA_INPUT_URI = "com.yalantis.ucrop.InputUri";
    public static final String EXTRA_MAX_SIZE_X = "com.yalantis.ucrop.MaxSizeX";
    public static final String EXTRA_MAX_SIZE_Y = "com.yalantis.ucrop.MaxSizeY";
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = "com.yalantis.ucrop.CropAspectRatio";
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = "com.yalantis.ucrop.ImageHeight";
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = "com.yalantis.ucrop.ImageWidth";
    public static final String EXTRA_OUTPUT_OFFSET_X = "com.yalantis.ucrop.OffsetX";
    public static final String EXTRA_OUTPUT_OFFSET_Y = "com.yalantis.ucrop.OffsetY";
    public static final String EXTRA_OUTPUT_URI = "com.yalantis.ucrop.OutputUri";
    private static final String EXTRA_PREFIX = "com.yalantis.ucrop";
    public static final int MIN_SIZE = 10;
    public static final int REQUEST_CROP = 69;
    public static final int RESULT_ERROR = 96;
    private Intent mCropIntent = new Intent();
    private Bundle mCropOptionsBundle;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Options {
        public static final String EXTRA_ALLOWED_GESTURES = "com.yalantis.ucrop.AllowedGestures";
        public static final String EXTRA_ASPECT_RATIO_OPTIONS = "com.yalantis.ucrop.AspectRatioOptions";
        public static final String EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT = "com.yalantis.ucrop.AspectRatioSelectedByDefault";
        public static final String EXTRA_CIRCLE_DIMMED_LAYER = "com.yalantis.ucrop.CircleDimmedLayer";
        public static final String EXTRA_COMPRESSION_FORMAT_NAME = "com.yalantis.ucrop.CompressionFormatName";
        public static final String EXTRA_COMPRESSION_QUALITY = "com.yalantis.ucrop.CompressionQuality";
        public static final String EXTRA_CROP_FRAME_COLOR = "com.yalantis.ucrop.CropFrameColor";
        public static final String EXTRA_CROP_FRAME_STROKE_WIDTH = "com.yalantis.ucrop.CropFrameStrokeWidth";
        public static final String EXTRA_CROP_GRID_COLOR = "com.yalantis.ucrop.CropGridColor";
        public static final String EXTRA_CROP_GRID_COLUMN_COUNT = "com.yalantis.ucrop.CropGridColumnCount";
        public static final String EXTRA_CROP_GRID_ROW_COUNT = "com.yalantis.ucrop.CropGridRowCount";
        public static final String EXTRA_CROP_GRID_STROKE_WIDTH = "com.yalantis.ucrop.CropGridStrokeWidth";
        public static final String EXTRA_DIMMED_LAYER_COLOR = "com.yalantis.ucrop.DimmedLayerColor";
        public static final String EXTRA_FREE_STYLE_CROP = "com.yalantis.ucrop.FreeStyleCrop";
        public static final String EXTRA_HIDE_BOTTOM_CONTROLS = "com.yalantis.ucrop.HideBottomControls";
        public static final String EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration";
        public static final String EXTRA_MAX_BITMAP_SIZE = "com.yalantis.ucrop.MaxBitmapSize";
        public static final String EXTRA_MAX_SCALE_MULTIPLIER = "com.yalantis.ucrop.MaxScaleMultiplier";
        public static final String EXTRA_NAVIGATION_BAR_LIGHT = "com.yalantis.ucrop.NavigationBarLight";
        public static final String EXTRA_SHOW_CROP_FRAME = "com.yalantis.ucrop.ShowCropFrame";
        public static final String EXTRA_SHOW_CROP_GRID = "com.yalantis.ucrop.ShowCropGrid";
        public static final String EXTRA_STATUS_BAR_LIGHT = "com.yalantis.ucrop.StatusBarLight";
        public static final String EXTRA_TOOL_BAR_COLOR = "com.yalantis.ucrop.ToolbarColor";
        public static final String EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE = "com.yalantis.ucrop.UcropColorControlsWidgetActive";
        public static final String EXTRA_UCROP_LOGO_COLOR = "com.yalantis.ucrop.UcropLogoColor";
        public static final String EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR = "com.yalantis.ucrop.UcropRootViewBackgroundColor";
        public static final String EXTRA_UCROP_TITLE_TEXT_TOOLBAR = "com.yalantis.ucrop.UcropToolbarTitleText";
        public static final String EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCancelDrawable";
        public static final String EXTRA_UCROP_WIDGET_COLOR_TOOLBAR = "com.yalantis.ucrop.UcropToolbarWidgetColor";
        public static final String EXTRA_UCROP_WIDGET_CROP_DRAWABLE = "com.yalantis.ucrop.UcropToolbarCropDrawable";
        private final Bundle mOptionBundle = new Bundle();

        public Bundle getOptionBundle() {
            return this.mOptionBundle;
        }

        public void setActiveControlsWidgetColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, i11);
        }

        public void setAllowedGestures(int i11, int i12, int i13) {
            this.mOptionBundle.putIntArray(EXTRA_ALLOWED_GESTURES, new int[]{i11, i12, i13});
        }

        public void setAspectRatioOptions(int i11, AspectRatio... aspectRatioArr) {
            if (i11 >= aspectRatioArr.length) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(p0.l("Index [selectedByDefault = ", i11, "] (0-based) cannot be higher or equal than aspect ratio options count [count = ", aspectRatioArr.length, "]."));
            }
            this.mOptionBundle.putInt(EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, i11);
            this.mOptionBundle.putParcelableArrayList(EXTRA_ASPECT_RATIO_OPTIONS, new ArrayList<>(Arrays.asList(aspectRatioArr)));
        }

        public void setCircleDimmedLayer(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_CIRCLE_DIMMED_LAYER, z11);
        }

        public void setCompressionFormat(Bitmap.CompressFormat compressFormat) {
            this.mOptionBundle.putString(EXTRA_COMPRESSION_FORMAT_NAME, compressFormat.name());
        }

        public void setCompressionQuality(int i11) {
            this.mOptionBundle.putInt(EXTRA_COMPRESSION_QUALITY, i11);
        }

        public void setCropFrameColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_COLOR, i11);
        }

        public void setCropFrameStrokeWidth(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_STROKE_WIDTH, i11);
        }

        public void setCropGridColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLOR, i11);
        }

        public void setCropGridColumnCount(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLUMN_COUNT, i11);
        }

        public void setCropGridRowCount(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_ROW_COUNT, i11);
        }

        public void setCropGridStrokeWidth(int i11) {
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_STROKE_WIDTH, i11);
        }

        public void setDimmedLayerColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_DIMMED_LAYER_COLOR, i11);
        }

        public void setFreeStyleCropEnabled(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_FREE_STYLE_CROP, z11);
        }

        public void setHideBottomControls(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_HIDE_BOTTOM_CONTROLS, z11);
        }

        public void setImageToCropBoundsAnimDuration(int i11) {
            this.mOptionBundle.putInt(EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, i11);
        }

        public void setLogoColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_LOGO_COLOR, i11);
        }

        public void setMaxBitmapSize(int i11) {
            this.mOptionBundle.putInt(EXTRA_MAX_BITMAP_SIZE, i11);
        }

        public void setMaxScaleMultiplier(float f5) {
            this.mOptionBundle.putFloat(EXTRA_MAX_SCALE_MULTIPLIER, f5);
        }

        public void setNavigationBarLight(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_NAVIGATION_BAR_LIGHT, z11);
        }

        public void setRootViewBackgroundColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, i11);
        }

        public void setShowCropFrame(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_FRAME, z11);
        }

        public void setShowCropGrid(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_GRID, z11);
        }

        public void setStatusBarLight(boolean z11) {
            this.mOptionBundle.putBoolean(EXTRA_STATUS_BAR_LIGHT, z11);
        }

        public void setToolbarCancelDrawable(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, i11);
        }

        public void setToolbarColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_TOOL_BAR_COLOR, i11);
        }

        public void setToolbarCropDrawable(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CROP_DRAWABLE, i11);
        }

        public void setToolbarTitle(String str) {
            this.mOptionBundle.putString(EXTRA_UCROP_TITLE_TEXT_TOOLBAR, str);
        }

        public void setToolbarWidgetColor(int i11) {
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, i11);
        }

        public void useSourceImageAspectRatio() {
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, CropImageView.DEFAULT_ASPECT_RATIO);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, CropImageView.DEFAULT_ASPECT_RATIO);
        }

        public void withAspectRatio(float f5, float f11) {
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, f5);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, f11);
        }

        public void withMaxResultSize(int i11, int i12) {
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_X, i11);
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_Y, i12);
        }
    }

    private UCrop(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(EXTRA_INPUT_URI, uri);
        this.mCropOptionsBundle.putParcelable(EXTRA_OUTPUT_URI, uri2);
    }

    public static Throwable getError(Intent intent) {
        return (Throwable) intent.getSerializableExtra(EXTRA_ERROR);
    }

    public static Uri getOutput(Intent intent) {
        return (Uri) intent.getParcelableExtra(EXTRA_OUTPUT_URI);
    }

    public static float getOutputCropAspectRatio(Intent intent) {
        return intent.getFloatExtra(EXTRA_OUTPUT_CROP_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public static int getOutputImageHeight(Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_HEIGHT, -1);
    }

    public static int getOutputImageWidth(Intent intent) {
        return intent.getIntExtra(EXTRA_OUTPUT_IMAGE_WIDTH, -1);
    }

    public static UCrop of(Uri uri, Uri uri2) {
        return new UCrop(uri, uri2);
    }

    public UCropFragment getFragment() {
        return UCropFragment.newInstance(this.mCropOptionsBundle);
    }

    public Intent getIntent(Context context) {
        this.mCropIntent.setClass(context, UCropActivity.class);
        this.mCropIntent.putExtras(this.mCropOptionsBundle);
        return this.mCropIntent;
    }

    public void start(Activity activity) {
        start(activity, 69);
    }

    public UCrop useSourceImageAspectRatio() {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, CropImageView.DEFAULT_ASPECT_RATIO);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, CropImageView.DEFAULT_ASPECT_RATIO);
        return this;
    }

    public UCrop withAspectRatio(float f5, float f11) {
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, f5);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, f11);
        return this;
    }

    public UCrop withMaxResultSize(int i11, int i12) {
        if (i11 < 10) {
            i11 = 10;
        }
        if (i12 < 10) {
            i12 = 10;
        }
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_X, i11);
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_Y, i12);
        return this;
    }

    public UCrop withOptions(Options options) {
        this.mCropOptionsBundle.putAll(options.getOptionBundle());
        return this;
    }

    public UCropFragment getFragment(Bundle bundle) {
        this.mCropOptionsBundle = bundle;
        return getFragment();
    }

    public void start(Activity activity, int i11) {
        activity.startActivityForResult(getIntent(activity), i11);
    }

    public void start(Context context, k0 k0Var) {
        start(context, k0Var, 69);
    }

    public void start(Context context, k0 k0Var, int i11) {
        k0Var.startActivityForResult(getIntent(context), i11);
    }

    public void start(Context context, c cVar) {
        cVar.a(getIntent(context));
    }
}
