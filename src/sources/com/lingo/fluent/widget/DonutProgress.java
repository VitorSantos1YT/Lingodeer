package com.lingo.fluent.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import vh.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DonutProgress extends View {
    private int attributeResourceId;
    private final int default_finished_color;
    private final int default_inner_background_color;
    private final int default_inner_bottom_text_color;
    private final float default_inner_bottom_text_size;
    private final int default_max;
    private final int default_startingDegree;
    private final float default_stroke_width;
    private final int default_text_color;
    private final float default_text_size;
    private final int default_unfinished_color;
    private final RectF finishedOuterRect;
    private Paint finishedPaint;
    private int finishedStrokeColor;
    private float finishedStrokeWidth;
    private int innerBackgroundColor;
    private String innerBottomText;
    private int innerBottomTextColor;
    private float innerBottomTextHeight;
    private Paint innerBottomTextPaint;
    private float innerBottomTextSize;
    private Paint innerCirclePaint;
    private boolean isShowText;
    private int max;
    private final int min_size;
    private String prefixText;
    private float progress;
    private int startingDegree;
    private String suffixText;
    private String text;
    private int textColor;
    private Paint textPaint;
    private float textSize;
    private final RectF unfinishedOuterRect;
    private Paint unfinishedPaint;
    private int unfinishedStrokeColor;
    private float unfinishedStrokeWidth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String INSTANCE_STATE = "saved_instance";
    private static final String INSTANCE_TEXT_COLOR = "text_color";
    private static final String INSTANCE_TEXT_SIZE = "text_size";
    private static final String INSTANCE_TEXT = "text";
    private static final String INSTANCE_INNER_BOTTOM_TEXT_SIZE = "inner_bottom_text_size";
    private static final String INSTANCE_INNER_BOTTOM_TEXT = "inner_bottom_text";
    private static final String INSTANCE_INNER_BOTTOM_TEXT_COLOR = "inner_bottom_text_color";
    private static final String INSTANCE_FINISHED_STROKE_COLOR = "finished_stroke_color";
    private static final String INSTANCE_UNFINISHED_STROKE_COLOR = "unfinished_stroke_color";
    private static final String INSTANCE_MAX = "max";
    private static final String INSTANCE_PROGRESS = "progress";
    private static final String INSTANCE_SUFFIX = "suffix";
    private static final String INSTANCE_PREFIX = RequestParameters.PREFIX;
    private static final String INSTANCE_FINISHED_STROKE_WIDTH = "finished_stroke_width";
    private static final String INSTANCE_UNFINISHED_STROKE_WIDTH = "unfinished_stroke_width";
    private static final String INSTANCE_BACKGROUND_COLOR = "inner_background_color";
    private static final String INSTANCE_STARTING_DEGREE = "starting_degree";
    private static final String INSTANCE_INNER_DRAWABLE = "inner_drawable";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutProgress(Context context) {
        this(context, null, 0, 6, null);
        m.f(context, "context");
    }

    private final float getProgressAngle() {
        return (this.progress / this.max) * 360.0f;
    }

    private final int measure(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            return size;
        }
        int i12 = this.min_size;
        return mode == Integer.MIN_VALUE ? Math.min(i12, size) : i12;
    }

    public final int getAttributeResourceId() {
        return this.attributeResourceId;
    }

    public final int getFinishedStrokeColor() {
        return this.finishedStrokeColor;
    }

    public final float getFinishedStrokeWidth() {
        return this.finishedStrokeWidth;
    }

    public final int getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    public final String getInnerBottomText() {
        return this.innerBottomText;
    }

    public final int getInnerBottomTextColor() {
        return this.innerBottomTextColor;
    }

    public final float getInnerBottomTextSize() {
        return this.innerBottomTextSize;
    }

    public final int getMax() {
        return this.max;
    }

    public final String getPrefixText() {
        return this.prefixText;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getStartingDegree() {
        return this.startingDegree;
    }

    public final String getSuffixText() {
        return this.suffixText;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final int getUnfinishedStrokeColor() {
        return this.unfinishedStrokeColor;
    }

    public final float getUnfinishedStrokeWidth() {
        return this.unfinishedStrokeWidth;
    }

    public final void initByAttributes(TypedArray attributes) {
        m.f(attributes, "attributes");
        this.finishedStrokeColor = attributes.getColor(2, this.default_finished_color);
        this.unfinishedStrokeColor = attributes.getColor(16, this.default_unfinished_color);
        this.isShowText = attributes.getBoolean(11, true);
        this.attributeResourceId = attributes.getResourceId(7, 0);
        setMax(attributes.getInt(8, this.default_max));
        setProgress(attributes.getFloat(10, CropImageView.DEFAULT_ASPECT_RATIO));
        this.finishedStrokeWidth = attributes.getDimension(3, this.default_stroke_width);
        this.unfinishedStrokeWidth = attributes.getDimension(17, this.default_stroke_width);
        if (this.isShowText) {
            if (attributes.getString(9) != null) {
                this.prefixText = attributes.getString(9);
            }
            if (attributes.getString(12) != null) {
                this.suffixText = attributes.getString(12);
            }
            if (attributes.getString(13) != null) {
                this.text = attributes.getString(13);
            }
            this.textColor = attributes.getColor(14, this.default_text_color);
            this.textSize = attributes.getDimension(15, this.default_text_size);
            this.innerBottomTextSize = attributes.getDimension(6, this.default_inner_bottom_text_size);
            this.innerBottomTextColor = attributes.getColor(5, this.default_inner_bottom_text_color);
            this.innerBottomText = attributes.getString(4);
        }
        this.innerBottomTextSize = attributes.getDimension(6, this.default_inner_bottom_text_size);
        this.innerBottomTextColor = attributes.getColor(5, this.default_inner_bottom_text_color);
        this.innerBottomText = attributes.getString(4);
        this.startingDegree = attributes.getInt(1, this.default_startingDegree);
        this.innerBackgroundColor = attributes.getColor(0, this.default_inner_background_color);
    }

    public final void initPainters() {
        if (this.isShowText) {
            TextPaint textPaint = new TextPaint();
            this.textPaint = textPaint;
            textPaint.setColor(this.textColor);
            Paint paint = this.textPaint;
            if (paint == null) {
                m.n("textPaint");
                throw null;
            }
            paint.setTextSize(this.textSize);
            Paint paint2 = this.textPaint;
            if (paint2 == null) {
                m.n("textPaint");
                throw null;
            }
            paint2.setAntiAlias(true);
            TextPaint textPaint2 = new TextPaint();
            this.innerBottomTextPaint = textPaint2;
            textPaint2.setColor(this.innerBottomTextColor);
            Paint paint3 = this.innerBottomTextPaint;
            if (paint3 == null) {
                m.n("innerBottomTextPaint");
                throw null;
            }
            paint3.setTextSize(this.innerBottomTextSize);
            Paint paint4 = this.innerBottomTextPaint;
            if (paint4 == null) {
                m.n("innerBottomTextPaint");
                throw null;
            }
            paint4.setAntiAlias(true);
        }
        Paint paint5 = new Paint();
        this.finishedPaint = paint5;
        paint5.setColor(this.finishedStrokeColor);
        Paint paint6 = this.finishedPaint;
        m.c(paint6);
        Paint.Style style = Paint.Style.STROKE;
        paint6.setStyle(style);
        Paint paint7 = this.finishedPaint;
        m.c(paint7);
        paint7.setAntiAlias(true);
        Paint paint8 = this.finishedPaint;
        m.c(paint8);
        paint8.setStrokeWidth(this.finishedStrokeWidth);
        Paint paint9 = new Paint();
        this.unfinishedPaint = paint9;
        paint9.setColor(this.unfinishedStrokeColor);
        Paint paint10 = this.unfinishedPaint;
        m.c(paint10);
        paint10.setStyle(style);
        Paint paint11 = this.unfinishedPaint;
        m.c(paint11);
        paint11.setAntiAlias(true);
        Paint paint12 = this.unfinishedPaint;
        m.c(paint12);
        paint12.setStrokeWidth(this.unfinishedStrokeWidth);
        Paint paint13 = new Paint();
        this.innerCirclePaint = paint13;
        paint13.setColor(this.innerBackgroundColor);
        Paint paint14 = this.innerCirclePaint;
        m.c(paint14);
        paint14.setAntiAlias(true);
    }

    @Override // android.view.View
    public void invalidate() {
        initPainters();
        super.invalidate();
    }

    public final boolean isShowText() {
        return this.isShowText;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        float f5 = 2;
        float fMax = Math.max(this.finishedStrokeWidth, this.unfinishedStrokeWidth) / f5;
        this.finishedOuterRect.set(fMax, fMax, getWidth() - fMax, getHeight() - fMax);
        this.unfinishedOuterRect.set(fMax, fMax, getWidth() - fMax, getHeight() - fMax);
        float fAbs = (Math.abs(this.finishedStrokeWidth - this.unfinishedStrokeWidth) + (getWidth() - Math.min(this.finishedStrokeWidth, this.unfinishedStrokeWidth))) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.innerCirclePaint;
        m.c(paint);
        canvas.drawCircle(width, height, fAbs, paint);
        RectF rectF = this.finishedOuterRect;
        float startingDegree = getStartingDegree();
        float progressAngle = getProgressAngle();
        Paint paint2 = this.finishedPaint;
        m.c(paint2);
        canvas.drawArc(rectF, startingDegree, progressAngle, false, paint2);
        RectF rectF2 = this.unfinishedOuterRect;
        float progressAngle2 = getProgressAngle() + getStartingDegree();
        float progressAngle3 = 360 - getProgressAngle();
        Paint paint3 = this.unfinishedPaint;
        m.c(paint3);
        canvas.drawArc(rectF2, progressAngle2, progressAngle3, false, paint3);
        if (this.isShowText) {
            String str = this.text;
            if (str == null) {
                str = this.prefixText + this.progress + this.suffixText;
            }
            if (!TextUtils.isEmpty(str)) {
                Paint paint4 = this.textPaint;
                if (paint4 == null) {
                    m.n("textPaint");
                    throw null;
                }
                float fDescent = paint4.descent();
                Paint paint5 = this.textPaint;
                if (paint5 == null) {
                    m.n("textPaint");
                    throw null;
                }
                float fAscent = paint5.ascent() + fDescent;
                m.c(str);
                float width2 = getWidth();
                Paint paint6 = this.textPaint;
                if (paint6 == null) {
                    m.n("textPaint");
                    throw null;
                }
                float fMeasureText = (width2 - paint6.measureText(str)) / 2.0f;
                float width3 = (getWidth() - fAscent) / 2.0f;
                Paint paint7 = this.textPaint;
                if (paint7 == null) {
                    m.n("textPaint");
                    throw null;
                }
                canvas.drawText(str, fMeasureText, width3, paint7);
            }
            if (!TextUtils.isEmpty(getInnerBottomText())) {
                Paint paint8 = this.innerBottomTextPaint;
                if (paint8 == null) {
                    m.n("innerBottomTextPaint");
                    throw null;
                }
                paint8.setTextSize(this.innerBottomTextSize);
                float height2 = getHeight() - this.innerBottomTextHeight;
                Paint paint9 = this.textPaint;
                if (paint9 == null) {
                    m.n("textPaint");
                    throw null;
                }
                float fDescent2 = paint9.descent();
                Paint paint10 = this.textPaint;
                if (paint10 == null) {
                    m.n("textPaint");
                    throw null;
                }
                float fAscent2 = height2 - ((paint10.ascent() + fDescent2) / f5);
                String innerBottomText = getInnerBottomText();
                m.c(innerBottomText);
                float width4 = getWidth();
                Paint paint11 = this.innerBottomTextPaint;
                if (paint11 == null) {
                    m.n("innerBottomTextPaint");
                    throw null;
                }
                float fMeasureText2 = (width4 - paint11.measureText(getInnerBottomText())) / 2.0f;
                Paint paint12 = this.innerBottomTextPaint;
                if (paint12 == null) {
                    m.n("innerBottomTextPaint");
                    throw null;
                }
                canvas.drawText(innerBottomText, fMeasureText2, fAscent2, paint12);
            }
        }
        if (this.attributeResourceId != 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.attributeResourceId);
            canvas.drawBitmap(bitmapDecodeResource, (getWidth() - bitmapDecodeResource.getWidth()) / 2.0f, (getHeight() - bitmapDecodeResource.getHeight()) / 2.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(measure(i11), measure(i12));
        this.innerBottomTextHeight = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        m.f(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        this.textColor = bundle.getInt(INSTANCE_TEXT_COLOR);
        this.textSize = bundle.getFloat(INSTANCE_TEXT_SIZE);
        this.innerBottomTextSize = bundle.getFloat(INSTANCE_INNER_BOTTOM_TEXT_SIZE);
        this.innerBottomText = bundle.getString(INSTANCE_INNER_BOTTOM_TEXT);
        this.innerBottomTextColor = bundle.getInt(INSTANCE_INNER_BOTTOM_TEXT_COLOR);
        this.finishedStrokeColor = bundle.getInt(INSTANCE_FINISHED_STROKE_COLOR);
        this.unfinishedStrokeColor = bundle.getInt(INSTANCE_UNFINISHED_STROKE_COLOR);
        this.finishedStrokeWidth = bundle.getFloat(INSTANCE_FINISHED_STROKE_WIDTH);
        this.unfinishedStrokeWidth = bundle.getFloat(INSTANCE_UNFINISHED_STROKE_WIDTH);
        this.innerBackgroundColor = bundle.getInt(INSTANCE_BACKGROUND_COLOR);
        this.attributeResourceId = bundle.getInt(INSTANCE_INNER_DRAWABLE);
        initPainters();
        setMax(bundle.getInt(INSTANCE_MAX));
        setStartingDegree(bundle.getInt(INSTANCE_STARTING_DEGREE));
        setProgress(bundle.getFloat(INSTANCE_PROGRESS));
        this.prefixText = bundle.getString(INSTANCE_PREFIX);
        this.suffixText = bundle.getString(INSTANCE_SUFFIX);
        this.text = bundle.getString(INSTANCE_TEXT);
        super.onRestoreInstanceState(bundle.getParcelable(INSTANCE_STATE));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(INSTANCE_STATE, super.onSaveInstanceState());
        bundle.putInt(INSTANCE_TEXT_COLOR, getTextColor());
        bundle.putFloat(INSTANCE_TEXT_SIZE, getTextSize());
        bundle.putFloat(INSTANCE_INNER_BOTTOM_TEXT_SIZE, getInnerBottomTextSize());
        String str = INSTANCE_INNER_BOTTOM_TEXT_COLOR;
        bundle.putFloat(str, getInnerBottomTextColor());
        bundle.putString(INSTANCE_INNER_BOTTOM_TEXT, getInnerBottomText());
        bundle.putInt(str, getInnerBottomTextColor());
        bundle.putInt(INSTANCE_FINISHED_STROKE_COLOR, getFinishedStrokeColor());
        bundle.putInt(INSTANCE_UNFINISHED_STROKE_COLOR, getUnfinishedStrokeColor());
        bundle.putInt(INSTANCE_MAX, this.max);
        bundle.putInt(INSTANCE_STARTING_DEGREE, getStartingDegree());
        bundle.putFloat(INSTANCE_PROGRESS, this.progress);
        bundle.putString(INSTANCE_SUFFIX, getSuffixText());
        bundle.putString(INSTANCE_PREFIX, getPrefixText());
        bundle.putString(INSTANCE_TEXT, getText());
        bundle.putFloat(INSTANCE_FINISHED_STROKE_WIDTH, getFinishedStrokeWidth());
        bundle.putFloat(INSTANCE_UNFINISHED_STROKE_WIDTH, getUnfinishedStrokeWidth());
        bundle.putInt(INSTANCE_BACKGROUND_COLOR, getInnerBackgroundColor());
        bundle.putInt(INSTANCE_INNER_DRAWABLE, this.attributeResourceId);
        return bundle;
    }

    public final void setAttributeResourceId(int i11) {
        this.attributeResourceId = i11;
    }

    public final void setDonut_progress(String percent) {
        m.f(percent, "percent");
        if (TextUtils.isEmpty(percent)) {
            return;
        }
        setProgress(Integer.parseInt(percent));
    }

    public final void setFinishedStrokeColor(int i11) {
        this.finishedStrokeColor = i11;
        invalidate();
    }

    public final void setFinishedStrokeWidth(float f5) {
        this.finishedStrokeWidth = f5;
        invalidate();
    }

    public final void setInnerBackgroundColor(int i11) {
        this.innerBackgroundColor = i11;
        invalidate();
    }

    public final void setInnerBottomText(String innerBottomText) {
        m.f(innerBottomText, "innerBottomText");
        this.innerBottomText = innerBottomText;
        invalidate();
    }

    public final void setInnerBottomTextColor(int i11) {
        this.innerBottomTextColor = i11;
        invalidate();
    }

    public final void setInnerBottomTextSize(float f5) {
        this.innerBottomTextSize = f5;
        invalidate();
    }

    public final void setMax(int i11) {
        if (i11 > 0) {
            this.max = i11;
            invalidate();
        }
    }

    public final void setPrefixText(String prefixText) {
        m.f(prefixText, "prefixText");
        this.prefixText = prefixText;
        invalidate();
    }

    public final void setProgress(float f5) {
        this.progress = f5;
        int i11 = this.max;
        if (f5 > i11) {
            this.progress = f5 % i11;
        }
        invalidate();
    }

    public final void setShowText(boolean z11) {
        this.isShowText = z11;
    }

    public final void setStartingDegree(int i11) {
        this.startingDegree = i11;
        invalidate();
    }

    public final void setSuffixText(String suffixText) {
        m.f(suffixText, "suffixText");
        this.suffixText = suffixText;
        invalidate();
    }

    public final void setText(String text) {
        m.f(text, "text");
        this.text = text;
        invalidate();
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
        invalidate();
    }

    public final void setTextSize(float f5) {
        this.textSize = f5;
        invalidate();
    }

    public final void setUnfinishedStrokeColor(int i11) {
        this.unfinishedStrokeColor = i11;
        invalidate();
    }

    public final void setUnfinishedStrokeWidth(float f5) {
        this.unfinishedStrokeWidth = f5;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.f(context, "context");
    }

    public /* synthetic */ DonutProgress(Context context, AttributeSet attributeSet, int i11, int i12, f fVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonutProgress(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m.f(context, "context");
        this.finishedOuterRect = new RectF();
        this.unfinishedOuterRect = new RectF();
        this.prefixText = BuildConfig.VERSION_NAME;
        this.suffixText = "%";
        this.default_finished_color = Color.rgb(66, 145, 241);
        this.default_unfinished_color = Color.rgb(204, 204, 204);
        this.default_text_color = Color.rgb(66, 145, 241);
        this.default_inner_bottom_text_color = Color.rgb(66, 145, 241);
        this.default_max = 100;
        this.default_text_size = j3.Z(18, context);
        this.min_size = (int) j3.Z(100, context);
        this.default_stroke_width = j3.Z(10, context);
        this.default_inner_bottom_text_size = j3.Z(18, context);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.f54062c, i11, 0);
        m.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        initByAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        initPainters();
    }
}
