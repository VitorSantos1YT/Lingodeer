package h4;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f31778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f31779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f31780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f31781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f31782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f31783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f31784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f31785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f31786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f31787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f31789l = new Rect();
    public final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f31790n;

    public u(MotionLayout motionLayout) {
        this.f31790n = motionLayout;
        Paint paint = new Paint();
        this.f31782e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f31783f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f31784g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f31785h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f31787j = new float[8];
        Paint paint5 = new Paint();
        this.f31786i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, CropImageView.DEFAULT_ASPECT_RATIO));
        this.f31780c = new float[100];
        this.f31779b = new int[50];
    }

    public final void a(Canvas canvas, int i11, int i12, q qVar) {
        Canvas canvas2;
        int width;
        int height;
        float f5;
        boolean z11;
        Paint paint = this.f31784g;
        int[] iArr = this.f31779b;
        boolean z12 = false;
        int i13 = 4;
        if (i11 == 4) {
            int i14 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i14 < this.f31788k) {
                int i15 = iArr[i14];
                if (i15 == 1) {
                    z11 = z13;
                    z11 = true;
                }
                if (i15 == 0) {
                    z14 = true;
                }
                i14++;
                z13 = z11;
                z14 = z14;
            }
            if (z13) {
                float[] fArr = this.f31778a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z14) {
                b(canvas);
            }
        }
        if (i11 == 2) {
            float[] fArr2 = this.f31778a;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float f13 = fArr2[fArr2.length - 2];
            float f14 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f11, f12, f13, f14, paint);
        } else {
            canvas2 = canvas;
        }
        if (i11 == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.f31778a, this.f31782e);
        View view = qVar.f31748b;
        if (view != null) {
            width = view.getWidth();
            height = qVar.f31748b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i16 = 1;
        while (i16 < i12 - 1) {
            if (i11 != i13 || iArr[i16 - 1] != 0) {
                int i17 = i16 * 2;
                float[] fArr3 = this.f31780c;
                float f15 = fArr3[i17];
                float f16 = fArr3[i17 + 1];
                this.f31781d.reset();
                this.f31781d.moveTo(f15, f16 + 10.0f);
                this.f31781d.lineTo(f15 + 10.0f, f16);
                this.f31781d.lineTo(f15, f16 - 10.0f);
                this.f31781d.lineTo(f15 - 10.0f, f16);
                this.f31781d.close();
                int i18 = i16 - 1;
                Paint paint2 = this.f31786i;
                if (i11 == i13) {
                    int i19 = iArr[i18];
                    if (i19 == 1) {
                        d(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f16 - CropImageView.DEFAULT_ASPECT_RATIO);
                    } else if (i19 == 0) {
                        c(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f16 - CropImageView.DEFAULT_ASPECT_RATIO);
                    } else {
                        if (i19 == 2) {
                            f5 = f16;
                            e(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f5 - CropImageView.DEFAULT_ASPECT_RATIO, width, height);
                        }
                        canvas2.drawPath(this.f31781d, paint2);
                    }
                    f5 = f16;
                    canvas2.drawPath(this.f31781d, paint2);
                } else {
                    f5 = f16;
                }
                if (i11 == 2) {
                    d(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f5 - CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i11 == 3) {
                    c(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f5 - CropImageView.DEFAULT_ASPECT_RATIO);
                }
                if (i11 == 6) {
                    e(canvas2, f15 - CropImageView.DEFAULT_ASPECT_RATIO, f5 - CropImageView.DEFAULT_ASPECT_RATIO, width, height);
                }
                canvas2.drawPath(this.f31781d, paint2);
            }
            i16++;
            z12 = z12;
            i13 = 4;
        }
        boolean z15 = z12;
        float[] fArr4 = this.f31778a;
        if (fArr4.length > 1) {
            float f17 = fArr4[z15 ? 1 : 0];
            float f18 = fArr4[1];
            Paint paint3 = this.f31783f;
            canvas2.drawCircle(f17, f18, 8.0f, paint3);
            float[] fArr5 = this.f31778a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f31778a;
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        float fMin = Math.min(f5, f12);
        float fMax = Math.max(f11, f13);
        float fMax2 = Math.max(f5, f12);
        float fMax3 = Math.max(f11, f13);
        Paint paint = this.f31784g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f5, f12), Math.min(f11, f13), Math.min(f5, f12), Math.max(f11, f13), paint);
    }

    public final void c(Canvas canvas, float f5, float f11) {
        float[] fArr = this.f31778a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fMin = Math.min(f12, f14);
        float fMax = Math.max(f13, f15);
        float fMin2 = f5 - Math.min(f12, f14);
        float fMax2 = Math.max(f13, f15) - f11;
        String str = BuildConfig.VERSION_NAME + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f31785h;
        Rect rect = this.f31789l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f11 - 20.0f, paint);
        float fMin3 = Math.min(f12, f14);
        Paint paint2 = this.f31784g;
        canvas.drawLine(f5, f11, fMin3, f11, paint2);
        String str2 = BuildConfig.VERSION_NAME + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f5 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f5, f11, f5, Math.max(f13, f15), paint2);
    }

    public final void d(Canvas canvas, float f5, float f11) {
        float[] fArr = this.f31778a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float f18 = (((f11 - f13) * f17) + ((f5 - f12) * f16)) / (fHypot * fHypot);
        float f19 = (f16 * f18) + f12;
        float f21 = (f18 * f17) + f13;
        Path path = new Path();
        path.moveTo(f5, f11);
        path.lineTo(f19, f21);
        float fHypot2 = (float) Math.hypot(f19 - f5, f21 - f11);
        String str = BuildConfig.VERSION_NAME + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f31785h;
        Rect rect = this.f31789l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f5, f11, f19, f21, this.f31784g);
    }

    public final void e(Canvas canvas, float f5, float f11, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(BuildConfig.VERSION_NAME);
        MotionLayout motionLayout = this.f31790n;
        sb2.append(((int) (((double) (((f5 - (i11 / 2)) * 100.0f) / (motionLayout.getWidth() - i11))) + 0.5d)) / 100.0f);
        String string = sb2.toString();
        int length = string.length();
        Paint paint = this.f31785h;
        Rect rect = this.f31789l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f5 / 2.0f) - (rect.width() / 2)) + CropImageView.DEFAULT_ASPECT_RATIO, f11 - 20.0f, paint);
        float fMin = Math.min(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        Paint paint2 = this.f31784g;
        canvas.drawLine(f5, f11, fMin, f11, paint2);
        String str = BuildConfig.VERSION_NAME + (((int) (((double) (((f11 - (i12 / 2)) * 100.0f) / (motionLayout.getHeight() - i12))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f5 + 5.0f, CropImageView.DEFAULT_ASPECT_RATIO - ((f11 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f5, f11, f5, Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), paint2);
    }
}
