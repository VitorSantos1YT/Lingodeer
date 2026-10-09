package id;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f34369a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34370b = b1.p.E("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1.p f34371c = b1.p.E("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        BaseInterpolator pathInterpolator;
        pointF.x = kd.h.b(pointF.x, -1.0f, 1.0f);
        pointF.y = kd.h.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = kd.h.b(pointF2.x, -1.0f, 1.0f);
        float fB = kd.h.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        Matrix matrix = kd.k.f38124a;
        wc.a aVar = wc.d.f54943a;
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e8) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e8.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, CropImageView.DEFAULT_ASPECT_RATIO), pointF2.y) : new LinearInterpolator();
        }
        wc.a aVar2 = wc.d.f54943a;
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0227  */
    public static ld.a b(jd.d dVar, wc.h hVar, float f5, f0 f0Var, boolean z11, boolean z12) {
        Object obj;
        BaseInterpolator baseInterpolatorA;
        BaseInterpolator baseInterpolatorA2;
        BaseInterpolator baseInterpolatorA3;
        Object obj2;
        ld.a aVar;
        b1.p pVar;
        LinearInterpolator linearInterpolator;
        b1.p pVar2;
        PointF pointF;
        float f11;
        b1.p pVar3 = f34370b;
        LinearInterpolator linearInterpolator2 = f34369a;
        if (!z11 || !z12) {
            b1.p pVar4 = pVar3;
            if (!z11) {
                return new ld.a(f0Var.a(dVar, f5));
            }
            dVar.b();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z13 = false;
            Object objA = null;
            float fI = CropImageView.DEFAULT_ASPECT_RATIO;
            Object objA2 = null;
            while (dVar.f()) {
                pVar4 = pVar4;
                switch (dVar.y(pVar4)) {
                    case 0:
                        fI = (float) dVar.i();
                        continue;
                    case 1:
                        objA = f0Var.a(dVar, f5);
                        break;
                    case 2:
                        objA2 = f0Var.a(dVar, f5);
                        break;
                    case 3:
                        pointFB4 = o.b(dVar, 1.0f);
                        break;
                    case 4:
                        pointFB = o.b(dVar, 1.0f);
                        break;
                    case 5:
                        z13 = dVar.p() == 1;
                        break;
                    case 6:
                        pointFB2 = o.b(dVar, f5);
                        break;
                    case 7:
                        pointFB3 = o.b(dVar, f5);
                        break;
                    default:
                        dVar.B();
                        break;
                }
            }
            dVar.d();
            if (!z13) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objA2;
                } else {
                    baseInterpolatorA = a(pointFB4, pointFB);
                    obj = objA2;
                }
                ld.a aVar2 = new ld.a(hVar, objA, obj, baseInterpolatorA, fI, (Float) null);
                aVar2.f39901o = pointFB2;
                aVar2.f39902p = pointFB3;
                return aVar2;
            }
            obj = objA;
            baseInterpolatorA = linearInterpolator2;
            ld.a aVar3 = new ld.a(hVar, objA, obj, baseInterpolatorA, fI, (Float) null);
            aVar3.f39901o = pointFB2;
            aVar3.f39902p = pointFB3;
            return aVar3;
        }
        dVar.b();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z14 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objA3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fI2 = CropImageView.DEFAULT_ASPECT_RATIO;
        Object objA4 = null;
        while (dVar.f()) {
            int iY = dVar.y(pVar3);
            b1.p pVar5 = f34371c;
            switch (iY) {
                case 0:
                    pVar = pVar3;
                    linearInterpolator = linearInterpolator2;
                    fI2 = (float) dVar.i();
                    break;
                case 1:
                    objA3 = f0Var.a(dVar, f5);
                    continue;
                case 2:
                    objA4 = f0Var.a(dVar, f5);
                    continue;
                case 3:
                    b1.p pVar6 = pVar3;
                    PointF pointF6 = pointFB5;
                    LinearInterpolator linearInterpolator3 = linearInterpolator2;
                    boolean z15 = z14;
                    Object obj3 = objA3;
                    if (dVar.v() == jd.c.BEGIN_OBJECT) {
                        dVar.b();
                        float fI3 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI4 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI6 = CropImageView.DEFAULT_ASPECT_RATIO;
                        while (dVar.f()) {
                            int iY2 = dVar.y(pVar5);
                            if (iY2 == 0) {
                                jd.c cVarV = dVar.v();
                                jd.c cVar = jd.c.NUMBER;
                                if (cVarV == cVar) {
                                    fI5 = (float) dVar.i();
                                    fI3 = fI5;
                                } else {
                                    dVar.a();
                                    fI3 = (float) dVar.i();
                                    fI5 = dVar.v() == cVar ? (float) dVar.i() : fI3;
                                    dVar.c();
                                }
                            } else if (iY2 != 1) {
                                dVar.B();
                            } else {
                                jd.c cVarV2 = dVar.v();
                                jd.c cVar2 = jd.c.NUMBER;
                                if (cVarV2 == cVar2) {
                                    fI6 = (float) dVar.i();
                                    fI4 = fI6;
                                } else {
                                    dVar.a();
                                    fI4 = (float) dVar.i();
                                    fI6 = dVar.v() == cVar2 ? (float) dVar.i() : fI4;
                                    dVar.c();
                                }
                            }
                        }
                        pointF3 = new PointF(fI3, fI4);
                        pointF4 = new PointF(fI5, fI6);
                        dVar.d();
                    } else {
                        pointFB7 = o.b(dVar, f5);
                    }
                    z14 = z15;
                    objA3 = obj3;
                    linearInterpolator2 = linearInterpolator3;
                    pVar3 = pVar6;
                    pointFB5 = pointF6;
                    continue;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    boolean z16 = z14;
                    if (dVar.v() == jd.c.BEGIN_OBJECT) {
                        dVar.b();
                        float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI7 = CropImageView.DEFAULT_ASPECT_RATIO;
                        float fI8 = CropImageView.DEFAULT_ASPECT_RATIO;
                        while (dVar.f()) {
                            objA3 = objA3;
                            int iY3 = dVar.y(pVar5);
                            if (iY3 != 0) {
                                pVar2 = pVar3;
                                if (iY3 != 1) {
                                    dVar.B();
                                    objA3 = objA3;
                                    pVar3 = pVar2;
                                } else {
                                    jd.c cVarV3 = dVar.v();
                                    jd.c cVar3 = jd.c.NUMBER;
                                    if (cVarV3 == cVar3) {
                                        pointF = pointFB5;
                                        fI8 = (float) dVar.i();
                                        pointFB6 = pointFB6;
                                        f13 = fI8;
                                    } else {
                                        pointF = pointFB5;
                                        PointF pointF7 = pointFB6;
                                        dVar.a();
                                        float fI9 = (float) dVar.i();
                                        if (dVar.v() == cVar3) {
                                            f13 = fI9;
                                            fI8 = (float) dVar.i();
                                        } else {
                                            f13 = fI9;
                                            fI8 = f13;
                                        }
                                        dVar.c();
                                        pointFB6 = pointF7;
                                    }
                                }
                            } else {
                                pVar2 = pVar3;
                                pointF = pointFB5;
                                PointF pointF8 = pointFB6;
                                jd.c cVarV4 = dVar.v();
                                jd.c cVar4 = jd.c.NUMBER;
                                if (cVarV4 == cVar4) {
                                    fI7 = (float) dVar.i();
                                    pointFB6 = pointF8;
                                    f12 = fI7;
                                } else {
                                    dVar.a();
                                    pointFB6 = pointF8;
                                    float fI10 = (float) dVar.i();
                                    if (dVar.v() == cVar4) {
                                        f11 = fI10;
                                        fI7 = (float) dVar.i();
                                    } else {
                                        f11 = fI10;
                                        fI7 = f11;
                                    }
                                    dVar.c();
                                    f12 = f11;
                                }
                            }
                            pVar3 = pVar2;
                            pointFB5 = pointF;
                        }
                        pVar = pVar3;
                        PointF pointF9 = new PointF(f12, f13);
                        pointF2 = new PointF(fI7, fI8);
                        dVar.d();
                        z14 = z16;
                        pointF5 = pointF9;
                    } else {
                        pointFB8 = o.b(dVar, f5);
                        z14 = z16;
                        linearInterpolator2 = linearInterpolator;
                    }
                    break;
                case 5:
                    if (dVar.p() == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                        continue;
                    }
                    break;
                case 6:
                    pointFB5 = o.b(dVar, f5);
                    continue;
                case 7:
                    pointFB6 = o.b(dVar, f5);
                    continue;
                default:
                    dVar.B();
                    continue;
            }
            linearInterpolator2 = linearInterpolator;
            pVar3 = pVar;
        }
        PointF pointF10 = pointFB5;
        BaseInterpolator baseInterpolatorA4 = linearInterpolator2;
        boolean z17 = z14;
        Object obj4 = objA3;
        dVar.d();
        if (z17) {
            obj2 = obj4;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF4 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorA2 = a(pointF3, pointF5);
                    baseInterpolatorA3 = a(pointF4, pointF2);
                    obj2 = objA4;
                    baseInterpolatorA4 = null;
                }
                if (baseInterpolatorA2 != null || baseInterpolatorA3 == null) {
                    aVar = new ld.a(hVar, obj4, obj2, baseInterpolatorA4, fI2, (Float) null);
                } else {
                    aVar = new ld.a(hVar, obj4, obj2, baseInterpolatorA2, baseInterpolatorA3, fI2);
                }
                aVar.f39901o = pointF10;
                aVar.f39902p = pointFB6;
                return aVar;
            }
            baseInterpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objA4;
        }
        baseInterpolatorA2 = null;
        baseInterpolatorA3 = null;
        if (baseInterpolatorA2 != null) {
            aVar = new ld.a(hVar, obj4, obj2, baseInterpolatorA4, fI2, (Float) null);
        } else {
            aVar = new ld.a(hVar, obj4, obj2, baseInterpolatorA4, fI2, (Float) null);
        }
        aVar.f39901o = pointF10;
        aVar.f39902p = pointFB6;
        return aVar;
    }
}
