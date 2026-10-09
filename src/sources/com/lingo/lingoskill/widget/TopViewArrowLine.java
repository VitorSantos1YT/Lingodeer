package com.lingo.lingoskill.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import kotlin.jvm.internal.m;
import r.y1;
import vh.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TopViewArrowLine extends View {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22169t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f22170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearGradient f22174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f22175f;

    public TopViewArrowLine(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f22170a = paint;
        this.f22172c = -1;
        this.f22175f = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        a();
    }

    public final void a() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        int[] iArr = {this.f22171b, this.f22173d};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f22174e = new LinearGradient(measuredWidth, measuredHeight, CropImageView.DEFAULT_ASPECT_RATIO, measuredHeight2, iArr, (float[]) null, tileMode);
        LinearGradient linearGradient = new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight() / 2, getMeasuredWidth(), getMeasuredHeight() / 2, new int[]{this.f22171b, this.f22173d}, (float[]) null, tileMode);
        Paint paint = this.f22170a;
        int i11 = this.f22172c;
        if (i11 == -1) {
            paint.setShader(this.f22174e);
        } else if (i11 == 1) {
            paint.setShader(linearGradient);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f22175f;
        path.reset();
        int i11 = this.f22172c;
        if (i11 == -1) {
            path.moveTo(getMeasuredWidth(), getMeasuredHeight());
            path.lineTo(h.l(16.0f), getMeasuredHeight() / 2);
            path.lineTo(h.l(16.0f), (getMeasuredHeight() / 2) - h.l(0.25f));
            path.lineTo(getMeasuredWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
            path.close();
        } else if (i11 == 1) {
            path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight());
            path.lineTo(getMeasuredWidth() - h.l(16.0f), getMeasuredHeight() / 2);
            path.lineTo(getMeasuredWidth() - h.l(16.0f), (getMeasuredHeight() / 2) - h.l(0.25f));
            path.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            path.close();
        }
        canvas.drawPath(path, this.f22170a);
    }

    public final void setColor(boolean z11) {
        if (z11) {
            Context context = getContext();
            m.e(context, "getContext(...)");
            this.f22171b = context.getColor(R.color.colorAccent);
            Context context2 = getContext();
            m.e(context2, "getContext(...)");
            this.f22173d = context2.getColor(R.color.colorAccent_alpha);
        } else {
            Context context3 = getContext();
            m.e(context3, "getContext(...)");
            this.f22171b = context3.getColor(R.color.color_E1E9F6);
            Context context4 = getContext();
            m.e(context4, "getContext(...)");
            this.f22173d = context4.getColor(R.color.color_00E1E9F6);
        }
        this.f22170a.setColor(this.f22171b);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new y1(this, 1));
            return;
        }
        try {
            a();
            invalidate();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewArrowLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        Paint paint = new Paint();
        this.f22170a = paint;
        this.f22172c = -1;
        this.f22175f = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f54065f);
        m.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22172c = typedArrayObtainStyledAttributes.getInteger(2, -1);
        this.f22171b = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.f22173d = typedArrayObtainStyledAttributes.getColor(0, -1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        a();
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewArrowLine(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m.f(context, "context");
        Paint paint = new Paint();
        this.f22170a = paint;
        this.f22172c = -1;
        this.f22175f = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f54065f);
        m.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22172c = typedArrayObtainStyledAttributes.getInteger(2, -1);
        this.f22171b = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.f22173d = typedArrayObtainStyledAttributes.getColor(0, -1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        a();
        typedArrayObtainStyledAttributes.recycle();
    }
}
