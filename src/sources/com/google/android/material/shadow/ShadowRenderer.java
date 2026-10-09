package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.yalantis.ucrop.view.CropImageView;
import r4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShadowRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f15178i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f15179j = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f15180k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f15181l = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f15182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f15184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f15188g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f15189h;

    public ShadowRenderer() {
        Paint paint = new Paint();
        this.f15189h = paint;
        this.f15182a = new Paint();
        c(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f15183b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f15184c = new Paint(paint2);
    }

    public final void a(Canvas canvas, Matrix matrix, RectF rectF, int i11, float f5, float f11) {
        boolean z11 = f11 < CropImageView.DEFAULT_ASPECT_RATIO;
        int[] iArr = f15180k;
        Path path = this.f15188g;
        if (z11) {
            iArr[0] = 0;
            iArr[1] = this.f15187f;
            iArr[2] = this.f15186e;
            iArr[3] = this.f15185d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f11);
            path.close();
            float f12 = -i11;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = this.f15185d;
            iArr[2] = this.f15186e;
            iArr[3] = this.f15187f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        float f13 = 1.0f - (i11 / fWidth);
        float[] fArr = f15181l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        boolean z12 = z11;
        Paint paint = this.f15183b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z12) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f15189h);
        }
        canvas.drawArc(rectF, f5, f11, true, paint);
        canvas.restore();
    }

    public final void b(Canvas canvas, Matrix matrix, RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(CropImageView.DEFAULT_ASPECT_RATIO, -i11);
        int i12 = this.f15187f;
        int[] iArr = f15178i;
        iArr[0] = i12;
        iArr[1] = this.f15186e;
        iArr[2] = this.f15185d;
        float f5 = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, f15179j, Shader.TileMode.CLAMP);
        Paint paint = this.f15184c;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final void c(int i11) {
        this.f15185d = c.e(i11, 68);
        this.f15186e = c.e(i11, 20);
        this.f15187f = c.e(i11, 0);
        this.f15182a.setColor(this.f15185d);
    }
}
