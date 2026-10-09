package zc;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collections;
import ob.u;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f59130a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f59131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f59132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f59133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f59134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f59135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f59136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f59137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f59138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f59139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f59140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f59141l;
    public d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f59142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f59143o;

    public o(ed.e eVar) {
        ed.c cVar = eVar.f25473a;
        this.f59135f = cVar == null ? null : cVar.I();
        ed.f fVar = eVar.f25474b;
        this.f59136g = fVar == null ? null : fVar.I();
        ed.a aVar = eVar.f25475c;
        this.f59137h = aVar == null ? null : aVar.I();
        ed.b bVar = eVar.f25476d;
        this.f59138i = bVar == null ? null : bVar.I();
        ed.b bVar2 = eVar.f25478f;
        g gVarI = bVar2 == null ? null : bVar2.I();
        this.f59140k = gVarI;
        this.f59143o = eVar.f25482j;
        if (gVarI != null) {
            this.f59131b = new Matrix();
            this.f59132c = new Matrix();
            this.f59133d = new Matrix();
            this.f59134e = new float[9];
        } else {
            this.f59131b = null;
            this.f59132c = null;
            this.f59133d = null;
            this.f59134e = null;
        }
        ed.b bVar3 = eVar.f25479g;
        this.f59141l = bVar3 == null ? null : bVar3.I();
        ed.a aVar2 = eVar.f25477e;
        if (aVar2 != null) {
            this.f59139j = aVar2.I();
        }
        ed.b bVar4 = eVar.f25480h;
        if (bVar4 != null) {
            this.m = bVar4.I();
        } else {
            this.m = null;
        }
        ed.b bVar5 = eVar.f25481i;
        if (bVar5 != null) {
            this.f59142n = bVar5.I();
        } else {
            this.f59142n = null;
        }
    }

    public final void a(gd.c cVar) {
        cVar.g(this.f59139j);
        cVar.g(this.m);
        cVar.g(this.f59142n);
        cVar.g(this.f59135f);
        cVar.g(this.f59136g);
        cVar.g(this.f59137h);
        cVar.g(this.f59138i);
        cVar.g(this.f59140k);
        cVar.g(this.f59141l);
    }

    public final void b(a aVar) {
        d dVar = this.f59139j;
        if (dVar != null) {
            dVar.a(aVar);
        }
        d dVar2 = this.m;
        if (dVar2 != null) {
            dVar2.a(aVar);
        }
        d dVar3 = this.f59142n;
        if (dVar3 != null) {
            dVar3.a(aVar);
        }
        d dVar4 = this.f59135f;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
        d dVar5 = this.f59136g;
        if (dVar5 != null) {
            dVar5.a(aVar);
        }
        d dVar6 = this.f59137h;
        if (dVar6 != null) {
            dVar6.a(aVar);
        }
        d dVar7 = this.f59138i;
        if (dVar7 != null) {
            dVar7.a(aVar);
        }
        g gVar = this.f59140k;
        if (gVar != null) {
            gVar.a(aVar);
        }
        g gVar2 = this.f59141l;
        if (gVar2 != null) {
            gVar2.a(aVar);
        }
    }

    public final boolean c(Object obj, u uVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        if (obj == z.f55043a) {
            d dVar = this.f59135f;
            if (dVar == null) {
                this.f59135f = new p(new PointF(), uVar);
                return true;
            }
            dVar.k(uVar);
            return true;
        }
        if (obj == z.f55044b) {
            d dVar2 = this.f59136g;
            if (dVar2 == null) {
                this.f59136g = new p(new PointF(), uVar);
                return true;
            }
            dVar2.k(uVar);
            return true;
        }
        if (obj == z.f55045c) {
            d dVar3 = this.f59136g;
            if (dVar3 instanceof m) {
                ((m) dVar3).m = uVar;
                return true;
            }
        }
        if (obj == z.f55046d) {
            d dVar4 = this.f59136g;
            if (dVar4 instanceof m) {
                ((m) dVar4).f59126n = uVar;
                return true;
            }
        }
        if (obj == z.f55052j) {
            d dVar5 = this.f59137h;
            if (dVar5 == null) {
                this.f59137h = new p(new ld.c(), uVar);
                return true;
            }
            dVar5.k(uVar);
            return true;
        }
        if (obj == z.f55053k) {
            d dVar6 = this.f59138i;
            if (dVar6 == null) {
                this.f59138i = new p(fValueOf2, uVar);
                return true;
            }
            dVar6.k(uVar);
            return true;
        }
        if (obj == 3) {
            d dVar7 = this.f59139j;
            if (dVar7 == null) {
                this.f59139j = new p(100, uVar);
                return true;
            }
            dVar7.k(uVar);
            return true;
        }
        if (obj == z.f55065x) {
            d dVar8 = this.m;
            if (dVar8 == null) {
                this.m = new p(fValueOf, uVar);
                return true;
            }
            dVar8.k(uVar);
            return true;
        }
        if (obj == z.f55066y) {
            d dVar9 = this.f59142n;
            if (dVar9 == null) {
                this.f59142n = new p(fValueOf, uVar);
                return true;
            }
            dVar9.k(uVar);
            return true;
        }
        if (obj == z.f55054l) {
            if (this.f59140k == null) {
                this.f59140k = new g(Collections.singletonList(new ld.a(fValueOf2)));
            }
            this.f59140k.k(uVar);
            return true;
        }
        if (obj != z.m) {
            return false;
        }
        if (this.f59141l == null) {
            this.f59141l = new g(Collections.singletonList(new ld.a(fValueOf2)));
        }
        this.f59141l.k(uVar);
        return true;
    }

    public final void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f59134e[i11] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        ld.c cVar;
        PointF pointF2;
        Matrix matrix = this.f59130a;
        matrix.reset();
        d dVar = this.f59136g;
        if (dVar != null && (pointF2 = (PointF) dVar.f()) != null) {
            float f5 = pointF2.x;
            if (f5 != CropImageView.DEFAULT_ASPECT_RATIO || pointF2.y != CropImageView.DEFAULT_ASPECT_RATIO) {
                matrix.preTranslate(f5, pointF2.y);
            }
        }
        if (!this.f59143o) {
            d dVar2 = this.f59138i;
            if (dVar2 != null) {
                float fFloatValue = dVar2 instanceof p ? ((Float) dVar2.f()).floatValue() : ((g) dVar2).m();
                if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (dVar != null) {
            float f11 = dVar.f59096d;
            PointF pointF3 = (PointF) dVar.f();
            float f12 = pointF3.x;
            float f13 = pointF3.y;
            dVar.j(1.0E-4f + f11);
            PointF pointF4 = (PointF) dVar.f();
            dVar.j(f11);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
        }
        g gVar = this.f59140k;
        if (gVar != null) {
            g gVar2 = this.f59141l;
            float fCos = gVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-gVar2.m()) + 90.0f));
            g gVar3 = this.f59141l;
            float fSin = gVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-gVar3.m()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(gVar.m()));
            d();
            float[] fArr = this.f59134e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f59131b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f59132c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f14;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f59133d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        d dVar3 = this.f59137h;
        if (dVar3 != null && (cVar = (ld.c) dVar3.f()) != null) {
            float f15 = cVar.f39910a;
            if (f15 != 1.0f || cVar.f39911b != 1.0f) {
                matrix.preScale(f15, cVar.f39911b);
            }
        }
        d dVar4 = this.f59135f;
        if (dVar4 != null && (pointF = (PointF) dVar4.f()) != null) {
            float f16 = pointF.x;
            if (f16 != CropImageView.DEFAULT_ASPECT_RATIO || pointF.y != CropImageView.DEFAULT_ASPECT_RATIO) {
                matrix.preTranslate(-f16, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f5) {
        d dVar = this.f59136g;
        PointF pointF = dVar == null ? null : (PointF) dVar.f();
        d dVar2 = this.f59137h;
        ld.c cVar = dVar2 == null ? null : (ld.c) dVar2.f();
        Matrix matrix = this.f59130a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f5, pointF.y * f5);
        }
        if (cVar != null) {
            double d5 = f5;
            matrix.preScale((float) Math.pow(cVar.f39910a, d5), (float) Math.pow(cVar.f39911b, d5));
        }
        d dVar3 = this.f59138i;
        if (dVar3 != null) {
            float fFloatValue = ((Float) dVar3.f()).floatValue();
            d dVar4 = this.f59135f;
            PointF pointF2 = dVar4 != null ? (PointF) dVar4.f() : null;
            float f11 = fFloatValue * f5;
            float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
            float f13 = pointF2 == null ? 0.0f : pointF2.x;
            if (pointF2 != null) {
                f12 = pointF2.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return matrix;
    }
}
