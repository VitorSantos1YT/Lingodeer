package xs;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {
    public final int H;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Canvas f56247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f56248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HwView f56249c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f56253t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56252f = false;
    public final d L = new d();
    public float M = CropImageView.DEFAULT_ASPECT_RATIO;
    public final float[] N = new float[2];
    public final ArrayList O = new ArrayList();
    public PathMeasure P = null;
    public ValueAnimator Q = null;
    public boolean R = false;
    public final ArrayList S = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PathMeasure f56250d = new PathMeasure();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56251e = 0;

    public i(HwView hwView, double d5) {
        this.f56247a = null;
        this.f56249c = hwView;
        this.f56253t = (int) (50.0d * d5);
        this.H = (int) (60.0d * d5);
        this.K = (int) (d5 * 40.0d);
        this.f56247a = new Canvas(hwView.M);
    }

    @Override // xs.k
    public final boolean a() {
        return this.f56252f;
    }

    @Override // xs.k
    public final void b(Canvas canvas) {
        int i11 = this.f56251e;
        HwView hwView = this.f56249c;
        if (i11 != hwView.K.size() && this.f56252f && this.f56251e < hwView.K.size()) {
            canvas.drawBitmap(hwView.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
        }
    }

    @Override // xs.k
    public final void c() {
        this.f56252f = true;
        Bitmap bitmap = this.f56249c.M;
        if (bitmap == null) {
            return;
        }
        this.f56251e = 0;
        bitmap.eraseColor(0);
        j();
        f();
    }

    @Override // xs.k
    public final void d() {
        this.f56252f = false;
        reset();
    }

    public final void f() {
        this.R = true;
        HwView hwView = this.f56249c;
        Bitmap bitmap = hwView.M;
        ArrayList arrayList = hwView.H;
        bitmap.eraseColor(0);
        if (this.R) {
            this.S.clear();
            if (this.P == null) {
                this.P = new PathMeasure();
            }
            this.P.setPath(((f) arrayList.get(this.f56251e)).f56233a, false);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, this.P.getLength());
            this.Q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new oa.a(this));
            this.Q.addListener(new fw.d(this, 13));
            this.Q.setDuration((long) ((this.P.getLength() / this.f56253t) * 100.0f));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.start();
        }
        this.Q.start();
        this.O.clear();
        this.M = CropImageView.DEFAULT_ASPECT_RATIO;
        Path path = ((f) arrayList.get(this.f56251e)).f56233a;
        PathMeasure pathMeasure = this.f56250d;
        pathMeasure.setPath(path, false);
        float[] fArr = this.N;
        pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr, null);
        float f5 = fArr[0];
        float f11 = fArr[1];
        d dVar = this.L;
        dVar.f56228a = f5;
        dVar.f56229b = f11;
        Canvas canvas = this.f56247a;
        canvas.save();
        i(canvas);
        hwView.invalidate();
    }

    @Override // xs.k
    public final void g(j jVar) {
        this.f56248b = jVar;
    }

    public final void h(float f5, float f11) {
        d dVar = this.L;
        float f12 = dVar.f56228a;
        double dSqrt = Math.sqrt(Math.pow(dVar.f56229b - f11, 2.0d) + Math.pow(f12 - f5, 2.0d));
        if (dSqrt < this.H) {
            do {
                this.O.add(new d(dVar.f56228a, dVar.f56229b));
                double d5 = this.f56253t;
                if (dSqrt < d5) {
                    d5 = dSqrt;
                }
                float f13 = (float) (((double) this.M) + d5);
                this.M = f13;
                dSqrt -= d5;
                PathMeasure pathMeasure = this.f56250d;
                if (f13 > pathMeasure.getLength()) {
                    this.M = pathMeasure.getLength();
                    dSqrt = 0.0d;
                }
                float f14 = this.M;
                float[] fArr = this.N;
                pathMeasure.getPosTan(f14, fArr, null);
                dVar.f56228a = fArr[0];
                dVar.f56229b = fArr[1];
            } while (dSqrt > 0.0d);
            Canvas canvas = this.f56247a;
            canvas.save();
            i(canvas);
            this.f56249c.invalidate();
        }
    }

    public final void i(Canvas canvas) {
        boolean z11 = this.f56252f;
        int i11 = this.f56253t;
        HwView hwView = this.f56249c;
        if (z11) {
            int i12 = this.f56251e;
            ArrayList arrayList = hwView.K;
            ArrayList arrayList2 = hwView.K;
            if (i12 < arrayList.size()) {
                hwView.M.eraseColor(0);
                Path path = new Path();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.O;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    d dVar = (d) arrayList3.get(i13);
                    path.addCircle(dVar.f56228a, dVar.f56229b, i11, Path.Direction.CW);
                    i13++;
                }
                canvas.clipPath((Path) arrayList2.get(this.f56251e));
                canvas.clipPath(path, Region.Op.INTERSECT);
                hwView.b(canvas);
                canvas.restore();
                for (int i14 = 0; i14 < this.f56251e; i14++) {
                    canvas.save();
                    canvas.clipPath((Path) arrayList2.get(i14));
                    hwView.b(canvas);
                    canvas.restore();
                }
                canvas.save();
            }
        }
        if (this.R) {
            int i15 = this.f56251e;
            ArrayList arrayList4 = hwView.K;
            Paint paint = hwView.f22277f;
            if (i15 < arrayList4.size()) {
                ArrayList arrayList5 = this.S;
                if (arrayList5.size() > 0) {
                    Path path2 = new Path();
                    for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                        d dVar2 = (d) arrayList5.get(i16);
                        path2.addCircle(dVar2.f56228a, dVar2.f56229b, i11, Path.Direction.CW);
                    }
                    canvas.clipPath((Path) hwView.K.get(this.f56251e));
                    canvas.clipPath(path2, Region.Op.INTERSECT);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(ju.a.f37324l1);
                    paint.setAlpha(50);
                    canvas.drawPath(hwView.f22278t.a(hwView.L), paint);
                    canvas.restore();
                    paint.setAlpha(100);
                }
            }
        }
    }

    public final void j() {
        this.S.clear();
        this.R = false;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f56252f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            h(motionEvent.getX(), motionEvent.getY());
            j();
            return true;
        }
        if (action == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            float f5 = this.M;
            PathMeasure pathMeasure = this.f56250d;
            if (f5 == pathMeasure.getLength() || pathMeasure.getLength() - this.M < this.K) {
                int i11 = this.f56251e + 1;
                this.f56251e = i11;
                HwView hwView = this.f56249c;
                if (i11 < hwView.H.size()) {
                    f();
                    return true;
                }
                this.f56252f = false;
                j jVar = this.f56248b;
                if (jVar != null) {
                    jVar.a();
                }
                hwView.invalidate();
                return true;
            }
        } else if (action == 2) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            h(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        return true;
    }

    @Override // xs.k
    public final void reset() {
        this.f56251e = 0;
        this.O.clear();
        this.M = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f56252f = false;
        j();
    }
}
