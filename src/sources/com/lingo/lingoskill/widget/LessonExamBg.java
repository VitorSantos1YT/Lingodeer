package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LessonExamBg extends View {
    public Paint H;
    public final double K;
    public Bitmap L;
    public Path M;
    public Path N;
    public final Matrix O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22105f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f22106t;

    public LessonExamBg(Context context) {
        super(context);
        this.K = 18.4236d;
        this.O = new Matrix();
        a();
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.f22106t = paint;
        Context context = getContext();
        m.f(context, "context");
        paint.setColor(context.getColor(R.color.color_F6F6F6));
        Paint paint2 = this.f22106t;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.H = paint3;
        Context context2 = getContext();
        m.f(context2, "context");
        paint3.setColor(context2.getColor(R.color.color_E1E9F6));
        this.H.setStyle(Paint.Style.STROKE);
        this.H.setStrokeWidth(h.l(2.0f));
        Paint paint4 = new Paint(1);
        paint4.setColor(-65536);
        paint4.setStyle(style);
        Paint paint5 = new Paint(1);
        Context context3 = getContext();
        m.f(context3, "context");
        paint5.setColor(context3.getColor(R.color.color_1Affffff));
        paint5.setStyle(style);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        Drawable drawable = lingoSkillApplication.getDrawable(R.drawable.ic_exam_ship);
        if (drawable != null) {
            this.L = ((BitmapDrawable) drawable).getBitmap();
        }
    }

    public PointF getCurrentPoint() {
        PointF pointF = new PointF();
        pointF.x = CropImageView.DEFAULT_ASPECT_RATIO;
        pointF.y = this.f22102c;
        return pointF;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.L == null) {
            return;
        }
        if (this.M == null) {
            this.M = new Path();
        }
        this.M.reset();
        this.M.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight());
        this.M.lineTo(CropImageView.DEFAULT_ASPECT_RATIO, getMeasuredHeight() - h.l(16.0f));
        this.M.quadTo(getMeasuredWidth() / 2, h.l(40.0f), getMeasuredWidth(), getMeasuredHeight() - h.l(16.0f));
        this.M.lineTo(getMeasuredWidth(), getMeasuredHeight());
        this.M.close();
        canvas.drawPath(this.M, this.f22106t);
        if (this.N == null) {
            this.N = new Path();
        }
        this.N.reset();
        this.N.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, this.f22103d);
        this.N.quadTo(this.f22100a, this.f22101b, this.f22104e, this.f22105f);
        canvas.drawPath(this.N, this.H);
        float width = CropImageView.DEFAULT_ASPECT_RATIO - (this.L.getWidth() / 4);
        float height = this.f22102c - ((this.L.getHeight() * 3) / 4);
        canvas.save();
        double d5 = this.K;
        if (!Double.isNaN(d5)) {
            canvas.rotate((float) (-d5), CropImageView.DEFAULT_ASPECT_RATIO, this.f22102c);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().locateLanguage == 51) {
                Matrix matrix = this.O;
                matrix.reset();
                matrix.preScale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
                canvas.setMatrix(matrix);
            }
            canvas.drawBitmap(this.L, width, height, (Paint) null);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i12);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i11);
        this.f22103d = (defaultSize - h.l(16.0f)) - h.l(1.0f);
        this.f22100a = defaultSize2 / 2;
        this.f22101b = (h.l(56.0f) - h.l(16.0f)) - h.l(1.0f);
        this.f22104e = defaultSize2;
        this.f22105f = (defaultSize - h.l(1.0f)) - h.l(16.0f);
        this.f22102c = (defaultSize - h.l(16.0f)) - h.l(1.0f);
    }

    public LessonExamBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 18.4236d;
        this.O = new Matrix();
        a();
    }

    public LessonExamBg(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.K = 18.4236d;
        this.O = new Matrix();
        a();
    }

    public void setDuration(int i11) {
    }
}
