package ws;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements j {
    public d H;
    public float K;
    public float[] L;
    public ArrayList M;
    public ArrayList N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public boolean U;
    public Path V;
    public ArrayList W;
    public float[] X;
    public float[] Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f55216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f55217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HwViewNew f55218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f55221f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f55222t;

    @Override // ws.j
    public final boolean a() {
        return this.f55220e;
    }

    @Override // ws.j
    public final void b(Canvas canvas) {
        HwViewNew hwViewNew = this.f55218c;
        Bitmap bitmap = hwViewNew.M;
        ArrayList arrayList = hwViewNew.H;
        ArrayList arrayList2 = hwViewNew.K;
        Paint paint = hwViewNew.f22266f;
        if (bitmap == null || this.f55219d == arrayList2.size()) {
            return;
        }
        if (!this.f55220e || this.f55219d >= arrayList2.size()) {
            if (!this.O || this.f55219d >= arrayList2.size()) {
                return;
            }
            canvas.drawBitmap(hwViewNew.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
            return;
        }
        if (hwViewNew.R) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(hwViewNew.f22263c);
            paint.setStrokeCap(Paint.Cap.ROUND);
            Context context = hwViewNew.getContext();
            m.f(context, "context");
            paint.setStrokeWidth((int) ((1.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
            canvas.drawPath(((f) arrayList.get(this.f55219d)).f55214a, paint);
            canvas.drawPath(((f) arrayList.get(this.f55219d)).f55215b, paint);
        }
        canvas.drawBitmap(hwViewNew.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    @Override // ws.j
    public final void c() {
        this.f55220e = true;
        this.W.clear();
        Bitmap bitmap = this.f55218c.M;
        if (bitmap == null) {
            return;
        }
        this.f55219d = 0;
        bitmap.eraseColor(0);
        f();
    }

    @Override // ws.j
    public final void d() {
        this.f55220e = false;
        reset();
    }

    @Override // ws.j
    public final void e(i iVar) {
        this.f55217b = iVar;
    }

    public final void f() {
        float[] fArr = this.L;
        PathMeasure pathMeasure = this.f55221f;
        HwViewNew hwViewNew = this.f55218c;
        Bitmap bitmap = hwViewNew.M;
        ArrayList arrayList = hwViewNew.H;
        if (bitmap != null && this.f55219d < arrayList.size()) {
            this.M.clear();
            this.K = CropImageView.DEFAULT_ASPECT_RATIO;
            pathMeasure.setPath(((f) arrayList.get(this.f55219d)).f55214a, false);
            pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr, null);
            d dVar = this.H;
            float f5 = fArr[0];
            float f11 = fArr[1];
            dVar.f55209a = f5;
            dVar.f55210b = f11;
            this.T = 0;
            this.P = f5;
            this.Q = f11;
            i();
            hwViewNew.invalidate();
        }
    }

    public final void h(float f5, float f11) {
        float[] fArr = this.L;
        PathMeasure pathMeasure = this.f55221f;
        d dVar = this.H;
        float f12 = dVar.f55209a;
        double dSqrt = Math.sqrt(Math.pow(dVar.f55210b - f11, 2.0d) + Math.pow(f12 - f5, 2.0d));
        int i11 = this.f55222t;
        double d5 = i11;
        if (dSqrt <= d5) {
            float length = this.K + i11;
            if (length > pathMeasure.getLength()) {
                length = pathMeasure.getLength();
            }
            pathMeasure.getPosTan(length, fArr, null);
            float f13 = fArr[0];
            if (Math.sqrt(Math.pow(fArr[1] - f11, 2.0d) + Math.pow(f13 - f5, 2.0d)) <= d5) {
                this.M.add(new d(f5, f11));
                this.N.add(new d(f5, f11));
                float f14 = (float) (((double) this.K) + dSqrt);
                this.K = f14;
                if (f14 > pathMeasure.getLength()) {
                    this.K = pathMeasure.getLength();
                }
                pathMeasure.getPosTan(this.K, fArr, null);
                dVar.f55209a = fArr[0];
                dVar.f55210b = fArr[1];
                return;
            }
        }
        this.T++;
    }

    public final void i() {
        Canvas canvas = this.f55216a;
        HwViewNew hwViewNew = this.f55218c;
        int i11 = 0;
        if ((this.f55220e || this.O) && this.f55219d < hwViewNew.K.size()) {
            hwViewNew.M.eraseColor(0);
            canvas.save();
            canvas.clipPath(new Path(), Region.Op.INTERSECT);
            hwViewNew.a(canvas);
            canvas.restore();
        }
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Paint paint = hwViewNew.f22266f;
            Paint paint2 = hwViewNew.f22266f;
            paint.setStyle(Paint.Style.STROKE);
            paint2.setColor(hwViewNew.f22262b);
            Context context = hwViewNew.getContext();
            m.f(context, "context");
            paint2.setStrokeWidth((int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            canvas.save();
            canvas.drawPath((Path) obj, paint2);
            canvas.restore();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x0145  */
    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164 A[LOOP:1: B:54:0x0162->B:55:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0 A[LOOP:2: B:57:0x01ae->B:58:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0274  */
    /* JADX WARN: Code duplicated, block: B:95:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r5 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // ws.j
    public final void reset() {
        this.f55219d = 0;
        this.M.clear();
        this.K = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f55220e = false;
    }
}
