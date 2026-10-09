package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class AspectRatioTextView extends AppCompatTextView {
    private final float MARGIN_MULTIPLIER;
    private float mAspectRatio;
    private String mAspectRatioTitle;
    private float mAspectRatioX;
    private float mAspectRatioY;
    private final Rect mCanvasClipBounds;
    private Paint mDotPaint;
    private int mDotSize;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    private void applyActiveColor(int i11) {
        Paint paint = this.mDotPaint;
        if (paint != null) {
            paint.setColor(i11);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i11, getContext().getColor(com.yalantis.ucrop.R.color.ucrop_color_widget)}));
    }

    private void init(TypedArray typedArray) {
        setGravity(1);
        this.mAspectRatioTitle = typedArray.getString(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.mAspectRatioX = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, CropImageView.DEFAULT_ASPECT_RATIO);
        float f5 = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, CropImageView.DEFAULT_ASPECT_RATIO);
        this.mAspectRatioY = f5;
        float f11 = this.mAspectRatioX;
        if (f11 == CropImageView.DEFAULT_ASPECT_RATIO || f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mAspectRatio = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            this.mAspectRatio = f11 / f5;
        }
        this.mDotSize = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.mDotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void setTitle() {
        if (!TextUtils.isEmpty(this.mAspectRatioTitle)) {
            setText(this.mAspectRatioTitle);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.mAspectRatioX) + ":" + ((int) this.mAspectRatioY));
    }

    private void toggleAspectRatio() {
        if (this.mAspectRatio != CropImageView.DEFAULT_ASPECT_RATIO) {
            float f5 = this.mAspectRatioX;
            float f11 = this.mAspectRatioY;
            this.mAspectRatioX = f11;
            this.mAspectRatioY = f5;
            this.mAspectRatio = f11 / f5;
        }
    }

    public float getAspectRatio(boolean z11) {
        if (z11) {
            toggleAspectRatio();
            setTitle();
        }
        return this.mAspectRatio;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.mCanvasClipBounds);
            Rect rect = this.mCanvasClipBounds;
            float f5 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i11 = this.mDotSize;
            canvas.drawCircle(f5, f11 - (i11 * 1.5f), i11 / 2.0f, this.mDotPaint);
        }
    }

    public void setActiveColor(int i11) {
        applyActiveColor(i11);
        invalidate();
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        this.mAspectRatioTitle = aspectRatio.getAspectRatioTitle();
        this.mAspectRatioX = aspectRatio.getAspectRatioX();
        float aspectRatioY = aspectRatio.getAspectRatioY();
        this.mAspectRatioY = aspectRatioY;
        float f5 = this.mAspectRatioX;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO || aspectRatioY == CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mAspectRatio = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            this.mAspectRatio = f5 / aspectRatioY;
        }
        setTitle();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }
}
