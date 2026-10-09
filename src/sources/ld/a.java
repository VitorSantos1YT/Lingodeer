package ld;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import com.yalantis.ucrop.view.CropImageView;
import wc.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f39888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f39891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f39892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f39893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f39895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f39896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f39897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39899l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f39900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f39901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f39902p;

    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f5, Float f11) {
        this.f39896i = -3987645.8f;
        this.f39897j = -3987645.8f;
        this.f39898k = 784923401;
        this.f39899l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f39900n = Float.MIN_VALUE;
        this.f39901o = null;
        this.f39902p = null;
        this.f39888a = hVar;
        this.f39889b = obj;
        this.f39890c = obj2;
        this.f39891d = baseInterpolator;
        this.f39892e = null;
        this.f39893f = null;
        this.f39894g = f5;
        this.f39895h = f11;
    }

    public final float a() {
        h hVar = this.f39888a;
        if (hVar == null) {
            return 1.0f;
        }
        if (this.f39900n == Float.MIN_VALUE) {
            if (this.f39895h == null) {
                this.f39900n = 1.0f;
            } else {
                this.f39900n = (float) (((double) b()) + (((double) (this.f39895h.floatValue() - this.f39894g)) / ((double) (hVar.m - hVar.f54968l))));
            }
        }
        return this.f39900n;
    }

    public final float b() {
        h hVar = this.f39888a;
        if (hVar == null) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (this.m == Float.MIN_VALUE) {
            float f5 = hVar.f54968l;
            this.m = (this.f39894g - f5) / (hVar.m - f5);
        }
        return this.m;
    }

    public final boolean c() {
        return this.f39891d == null && this.f39892e == null && this.f39893f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f39889b + ", endValue=" + this.f39890c + ", startFrame=" + this.f39894g + ", endFrame=" + this.f39895h + ", interpolator=" + this.f39891d + '}';
    }

    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f5) {
        this.f39896i = -3987645.8f;
        this.f39897j = -3987645.8f;
        this.f39898k = 784923401;
        this.f39899l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f39900n = Float.MIN_VALUE;
        this.f39901o = null;
        this.f39902p = null;
        this.f39888a = hVar;
        this.f39889b = obj;
        this.f39890c = obj2;
        this.f39891d = null;
        this.f39892e = baseInterpolator;
        this.f39893f = baseInterpolator2;
        this.f39894g = f5;
        this.f39895h = null;
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f5, Float f11) {
        this.f39896i = -3987645.8f;
        this.f39897j = -3987645.8f;
        this.f39898k = 784923401;
        this.f39899l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f39900n = Float.MIN_VALUE;
        this.f39901o = null;
        this.f39902p = null;
        this.f39888a = hVar;
        this.f39889b = obj;
        this.f39890c = obj2;
        this.f39891d = interpolator;
        this.f39892e = interpolator2;
        this.f39893f = interpolator3;
        this.f39894g = f5;
        this.f39895h = f11;
    }

    public a(Object obj) {
        this.f39896i = -3987645.8f;
        this.f39897j = -3987645.8f;
        this.f39898k = 784923401;
        this.f39899l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f39900n = Float.MIN_VALUE;
        this.f39901o = null;
        this.f39902p = null;
        this.f39888a = null;
        this.f39889b = obj;
        this.f39890c = obj;
        this.f39891d = null;
        this.f39892e = null;
        this.f39893f = null;
        this.f39894g = Float.MIN_VALUE;
        this.f39895h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(fd.c cVar, fd.c cVar2) {
        this.f39896i = -3987645.8f;
        this.f39897j = -3987645.8f;
        this.f39898k = 784923401;
        this.f39899l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f39900n = Float.MIN_VALUE;
        this.f39901o = null;
        this.f39902p = null;
        this.f39888a = null;
        this.f39889b = cVar;
        this.f39890c = cVar2;
        this.f39891d = null;
        this.f39892e = null;
        this.f39893f = null;
        this.f39894g = Float.MIN_VALUE;
        this.f39895h = Float.valueOf(Float.MAX_VALUE);
    }
}
