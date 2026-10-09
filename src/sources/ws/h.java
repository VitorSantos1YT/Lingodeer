package ws;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j {
    public float[] H;
    public ArrayList K;
    public ArrayList L;
    public float[] M;
    public float[] N;
    public ArrayList O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f55223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f55224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HwViewNew f55225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PathMeasure f55226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55228f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f55229t;

    @Override // ws.j
    public final boolean a() {
        return this.f55228f;
    }

    @Override // ws.j
    public final void b(Canvas canvas) {
        int i11 = this.f55227e;
        HwViewNew hwViewNew = this.f55225c;
        if (i11 != hwViewNew.K.size() && this.f55228f && this.f55227e < hwViewNew.K.size()) {
            canvas.drawBitmap(hwViewNew.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
        }
    }

    @Override // ws.j
    public final void c() {
        this.f55228f = true;
        Bitmap bitmap = this.f55225c.M;
        if (bitmap == null) {
            return;
        }
        this.f55227e = 0;
        bitmap.eraseColor(0);
        this.O.clear();
        f();
    }

    @Override // ws.j
    public final void d() {
        this.f55228f = false;
        reset();
    }

    @Override // ws.j
    public final void e(i iVar) {
        this.f55224b = iVar;
    }

    public final void f() {
        HwViewNew hwViewNew = this.f55225c;
        Bitmap bitmap = hwViewNew.M;
        ArrayList arrayList = hwViewNew.K;
        Paint paint = hwViewNew.f22266f;
        bitmap.eraseColor(0);
        this.O.clear();
        this.L.clear();
        PathMeasure pathMeasure = this.f55226d;
        pathMeasure.setPath(((f) hwViewNew.H.get(this.f55227e)).f55214a, false);
        float[] fArr = this.H;
        pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr, null);
        d dVar = this.f55229t;
        float f5 = fArr[0];
        float f11 = fArr[1];
        dVar.f55209a = f5;
        dVar.f55210b = f11;
        Canvas canvas = this.f55223a;
        canvas.save();
        ArrayList arrayList2 = this.K;
        if (this.f55228f && this.f55227e < arrayList.size()) {
            hwViewNew.M.eraseColor(0);
            Path path = new Path();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                d dVar2 = (d) arrayList2.get(i11);
                path.addCircle(dVar2.f55209a, dVar2.f55210b, 5.0f, Path.Direction.CW);
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(hwViewNew.f22262b);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
        }
        hwViewNew.invalidate();
        Path path2 = (Path) arrayList.get(this.f55227e);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#1A000000"));
        canvas.drawPath(path2, paint);
    }

    public final void h(float f5, float f11) {
        d dVar = this.f55229t;
        float f12 = dVar.f55209a;
        Math.sqrt(Math.pow(dVar.f55210b - f11, 2.0d) + Math.pow(f12 - f5, 2.0d));
        this.K.add(new d(f5, f11));
        this.L.add(new d(f5, f11));
        this.f55223a.save();
        HwViewNew hwViewNew = this.f55225c;
        hwViewNew.f22266f.setStyle(Paint.Style.STROKE);
        Paint paint = hwViewNew.f22266f;
        paint.setColor(hwViewNew.f22262b);
        Context context = hwViewNew.getContext();
        m.f(context, "context");
        paint.setStrokeWidth((int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        float[] fArr = this.M;
        float f13 = fArr[0];
        float[] fArr2 = this.N;
        if (f13 == fArr2[0]) {
            float f14 = fArr2[1];
            throw null;
        }
        if (fArr[1] != fArr2[1]) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = this.L;
        HwViewNew hwViewNew = this.f55225c;
        if (!this.f55228f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            h(motionEvent.getX(), motionEvent.getY());
            throw null;
        }
        if (action == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            Path path = (Path) hwViewNew.K.get(this.f55227e);
            Region region = new Region();
            region.setPath(path, new Region(0, 0, hwViewNew.getMeasuredWidth(), hwViewNew.getMeasuredHeight()));
            boolean z11 = true;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                d dVar = (d) arrayList.get(i11);
                if (!region.contains((int) dVar.f55209a, (int) dVar.f55210b)) {
                    z11 = false;
                }
            }
            if (z11) {
                int i12 = this.f55227e + 1;
                this.f55227e = i12;
                if (i12 >= hwViewNew.H.size()) {
                    this.f55228f = false;
                    i iVar = this.f55224b;
                    if (iVar != null) {
                        ((lp.b) iVar).j();
                    }
                    hwViewNew.invalidate();
                    return true;
                }
                f();
            }
        } else if (action == 2) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            h(motionEvent.getX(), motionEvent.getY());
            throw null;
        }
        return true;
    }

    @Override // ws.j
    public final void reset() {
        this.f55227e = 0;
        this.K.clear();
        this.f55228f = false;
        this.O.clear();
    }
}
