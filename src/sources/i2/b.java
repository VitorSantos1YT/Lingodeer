package i2;

import android.graphics.Paint;
import android.graphics.Shader;
import g2.f0;
import g2.l;
import g2.p;
import g2.p0;
import g2.t;
import g2.v;
import g2.x;
import kotlin.NoWhenBranchMatchedException;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq.c f34121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a f34122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.a f34123d;

    public b() {
        m mVar = m.Ltr;
        a aVar = new a();
        aVar.f34116a = c.f34124a;
        aVar.f34117b = mVar;
        aVar.f34118c = f.f34125a;
        aVar.f34119d = 0L;
        this.f34120a = aVar;
        this.f34121b = new xq.c(this);
    }

    public static a.a a(b bVar, long j11, e eVar, float f5, int i11) {
        a.a aVarC = bVar.c(eVar);
        if (f5 != 1.0f) {
            j11 = x.c(j11, x.e(j11) * f5);
        }
        Paint paint = (Paint) aVarC.f6c;
        if (!x.d(f0.c(paint.getColor()), j11)) {
            aVarC.N(j11);
        }
        if (((Shader) aVarC.f7d) != null) {
            aVarC.R(null);
        }
        if (!kotlin.jvm.internal.m.a((p) aVarC.f8e, null)) {
            aVarC.O(null);
        }
        if (aVarC.f5b != i11) {
            aVarC.M(i11);
        }
        if (paint.isFilterBitmap()) {
            return aVarC;
        }
        aVarC.P(1);
        return aVarC;
    }

    @Override // i2.d
    public final void D0(long j11, float f5, float f11, long j12, long j13, float f12, e eVar) {
        int i11 = (int) (j12 >> 32);
        int i12 = (int) (j12 & 4294967295L);
        this.f34120a.f34118c.k(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i12), f5, f11, a(this, j11, eVar, f12, 3));
    }

    @Override // i2.d
    public final void E0(g2.h hVar, long j11, long j12, long j13, float f5, p pVar, int i11) {
        this.f34120a.f34118c.c(hVar, j11, j12, j13, b(null, g.f34126a, f5, pVar, 3, i11));
    }

    @Override // v3.c
    public final float Z() {
        return this.f34120a.f34116a.Z();
    }

    public final a.a b(t tVar, e eVar, float f5, p pVar, int i11, int i12) {
        a.a aVarC = c(eVar);
        if (tVar != null) {
            tVar.a(f5, d(), aVarC);
        } else {
            Paint paint = (Paint) aVarC.f6c;
            if (((Shader) aVarC.f7d) != null) {
                aVarC.R(null);
            }
            long jC = f0.c(paint.getColor());
            long j11 = x.f28615b;
            if (!x.d(jC, j11)) {
                aVarC.N(j11);
            }
            if (paint.getAlpha() / 255.0f != f5) {
                aVarC.L(f5);
            }
        }
        if (!kotlin.jvm.internal.m.a((p) aVarC.f8e, pVar)) {
            aVarC.O(pVar);
        }
        if (aVarC.f5b != i11) {
            aVarC.M(i11);
        }
        if (((Paint) aVarC.f6c).isFilterBitmap() == i12) {
            return aVarC;
        }
        aVarC.P(i12);
        return aVarC;
    }

    @Override // i2.d
    public final void b0(p0 p0Var, t tVar, float f5, e eVar, int i11) {
        this.f34120a.f34118c.j(p0Var, b(tVar, eVar, f5, null, i11, 1));
    }

    public final a.a c(e eVar) {
        if (kotlin.jvm.internal.m.a(eVar, g.f34126a)) {
            a.a aVar = this.f34122c;
            if (aVar != null) {
                return aVar;
            }
            a.a aVarH = f0.h();
            aVarH.V(0);
            this.f34122c = aVarH;
            return aVarH;
        }
        if (!(eVar instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        a.a aVarH2 = this.f34123d;
        if (aVarH2 == null) {
            aVarH2 = f0.h();
            aVarH2.V(1);
            this.f34123d = aVarH2;
        }
        Paint paint = (Paint) aVarH2.f6c;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        l lVar = hVar.f34131e;
        float f5 = hVar.f34127a;
        if (strokeWidth != f5) {
            aVarH2.U(f5);
        }
        int iB = aVarH2.B();
        int i11 = hVar.f34129c;
        if (iB != i11) {
            aVarH2.S(i11);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = hVar.f34128b;
        if (strokeMiter != f11) {
            paint.setStrokeMiter(f11);
        }
        int iC = aVarH2.C();
        int i12 = hVar.f34130d;
        if (iC != i12) {
            aVarH2.T(i12);
        }
        if (!kotlin.jvm.internal.m.a((l) aVarH2.f9f, lVar)) {
            aVarH2.Q(lVar);
        }
        return aVarH2;
    }

    @Override // i2.d
    public final void f0(long j11, long j12, long j13, float f5, int i11, l lVar, int i12) {
        v vVar = this.f34120a.f34118c;
        a.a aVarH = this.f34123d;
        if (aVarH == null) {
            aVarH = f0.h();
            aVarH.V(1);
            this.f34123d = aVarH;
        }
        a.a aVar = aVarH;
        Paint paint = (Paint) aVar.f6c;
        if (!x.d(f0.c(paint.getColor()), j11)) {
            aVar.N(j11);
        }
        if (((Shader) aVar.f7d) != null) {
            aVar.R(null);
        }
        if (!kotlin.jvm.internal.m.a((p) aVar.f8e, null)) {
            aVar.O(null);
        }
        if (aVar.f5b != i12) {
            aVar.M(i12);
        }
        if (paint.getStrokeWidth() != f5) {
            aVar.U(f5);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (aVar.B() != i11) {
            aVar.S(i11);
        }
        if (aVar.C() != 0) {
            aVar.T(0);
        }
        if (!kotlin.jvm.internal.m.a((l) aVar.f9f, lVar)) {
            aVar.Q(lVar);
        }
        if (!paint.isFilterBitmap()) {
            aVar.P(1);
        }
        vVar.h(j12, j13, aVar);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f34120a.f34116a.getDensity();
    }

    @Override // i2.d
    public final m getLayoutDirection() {
        return this.f34120a.f34117b;
    }

    @Override // i2.d
    public final xq.c j0() {
        return this.f34121b;
    }

    @Override // i2.d
    public final void s(p0 p0Var, long j11, float f5, e eVar) {
        this.f34120a.f34118c.j(p0Var, a(this, j11, eVar, f5, 3));
    }

    @Override // i2.d
    public final void u0(t tVar, long j11, long j12, float f5, e eVar, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.f34120a.f34118c.o(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i13), b(tVar, eVar, f5, null, i11, 1));
    }

    @Override // i2.d
    public final void v(long j11, float f5, long j12, e eVar, int i11) {
        this.f34120a.f34118c.s(f5, j12, a(this, j11, eVar, 1.0f, i11));
    }

    @Override // i2.d
    public final void w0(long j11, long j12, long j13, long j14, e eVar, float f5) {
        int i11 = (int) (j12 >> 32);
        int i12 = (int) (j12 & 4294967295L);
        this.f34120a.f34118c.i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), a(this, j11, eVar, f5, 3));
    }

    @Override // i2.d
    public final void z(t tVar, long j11, long j12, long j13, float f5, e eVar) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f34120a.f34118c.i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), b(tVar, eVar, f5, null, 3, 1));
    }

    @Override // i2.d
    public final void z0(long j11, long j12, long j13, float f5, int i11) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        this.f34120a.f34118c.o(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (4294967295L & j13)) + Float.intBitsToFloat(i13), a(this, j11, g.f34126a, f5, i11));
    }
}
