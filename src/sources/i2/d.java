package i2;

import android.graphics.Paint;
import g2.f0;
import g2.l;
import g2.p;
import g2.p0;
import g2.t;
import g2.v;
import kotlin.jvm.internal.m;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends v3.c {
    static void A(k0 k0Var, g2.h hVar, p pVar, int i11) {
        if ((i11 & 16) != 0) {
            pVar = null;
        }
        b bVar = k0Var.f56937a;
        bVar.f34120a.f34118c.d(hVar, bVar.b(null, g.f34126a, 1.0f, pVar, 3, 1));
    }

    static /* synthetic */ void B0(d dVar, t tVar, long j11, long j12, long j13, e eVar, int i11) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j14 = j11;
        dVar.z(tVar, j14, (i11 & 4) != 0 ? V(dVar.d(), j14) : j12, j13, 1.0f, (i11 & 32) != 0 ? g.f34126a : eVar);
    }

    static void F(k0 k0Var, t tVar, long j11, long j12, float f5, float f11, int i11) {
        if ((i11 & 64) != 0) {
            f11 = 1.0f;
        }
        b bVar = k0Var.f56937a;
        v vVar = bVar.f34120a.f34118c;
        a.a aVarH = bVar.f34123d;
        if (aVarH == null) {
            aVarH = f0.h();
            aVarH.V(1);
            bVar.f34123d = aVarH;
        }
        Paint paint = (Paint) aVarH.f6c;
        if (tVar != null) {
            tVar.a(f11, bVar.d(), aVarH);
        } else if (paint.getAlpha() / 255.0f != f11) {
            aVarH.L(f11);
        }
        if (!m.a((p) aVarH.f8e, null)) {
            aVarH.O(null);
        }
        if (aVarH.f5b != 3) {
            aVarH.M(3);
        }
        if (paint.getStrokeWidth() != f5) {
            aVarH.U(f5);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (aVarH.B() != 0) {
            aVarH.S(0);
        }
        if (aVarH.C() != 0) {
            aVarH.T(0);
        }
        if (!m.a((l) aVarH.f9f, null)) {
            aVarH.Q(null);
        }
        if (!paint.isFilterBitmap()) {
            aVarH.P(1);
        }
        vVar.h(j11, j12, aVarH);
    }

    static /* synthetic */ void U(d dVar, long j11, long j12, long j13, float f5, int i11) {
        if ((i11 & 2) != 0) {
            j12 = 0;
        }
        long j14 = j12;
        dVar.z0(j11, j14, (i11 & 4) != 0 ? V(dVar.d(), j14) : j13, (i11 & 8) != 0 ? 1.0f : f5, (i11 & 64) != 0 ? 3 : 0);
    }

    static long V(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void g(d dVar, p0 p0Var, t tVar, float f5, h hVar, int i11) {
        if ((i11 & 4) != 0) {
            f5 = 1.0f;
        }
        float f11 = f5;
        e eVar = hVar;
        if ((i11 & 8) != 0) {
            eVar = g.f34126a;
        }
        dVar.b0(p0Var, tVar, f11, eVar, (i11 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void j(d dVar, long j11, float f5, long j12, e eVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            f5 = f2.e.c(dVar.d()) / 2.0f;
        }
        float f11 = f5;
        if ((i12 & 4) != 0) {
            j12 = dVar.r0();
        }
        long j13 = j12;
        if ((i12 & 16) != 0) {
            eVar = g.f34126a;
        }
        dVar.v(j11, f11, j13, eVar, (i12 & 64) != 0 ? 3 : i11);
    }

    static /* synthetic */ void o0(d dVar, p0 p0Var, long j11, float f5, e eVar, int i11) {
        if ((i11 & 4) != 0) {
            f5 = 1.0f;
        }
        float f11 = f5;
        if ((i11 & 8) != 0) {
            eVar = g.f34126a;
        }
        dVar.s(p0Var, j11, f11, eVar);
    }

    static /* synthetic */ void p0(d dVar, t tVar, long j11, long j12, float f5, e eVar, int i11) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        dVar.u0(tVar, j13, (i11 & 4) != 0 ? V(dVar.d(), j13) : j12, (i11 & 8) != 0 ? 1.0f : f5, (i11 & 16) != 0 ? g.f34126a : eVar, (i11 & 64) != 0 ? 3 : 9);
    }

    static void t0(d dVar, g2.h hVar, long j11, long j12, float f5, p pVar, int i11, int i12) {
        dVar.E0(hVar, 0L, j11, (i12 & 16) != 0 ? j11 : j12, (i12 & 32) != 0 ? 1.0f : f5, pVar, (i12 & 512) != 0 ? 1 : i11);
    }

    static /* synthetic */ void y(d dVar, long j11, long j12, long j13, long j14, e eVar, int i11) {
        long j15 = (i11 & 2) != 0 ? 0L : j12;
        dVar.w0(j11, j15, (i11 & 4) != 0 ? V(dVar.d(), j15) : j13, j14, (i11 & 16) != 0 ? g.f34126a : eVar, (i11 & 32) != 0 ? 1.0f : 0.7f);
    }

    void D0(long j11, float f5, float f11, long j12, long j13, float f12, e eVar);

    void E0(g2.h hVar, long j11, long j12, long j13, float f5, p pVar, int i11);

    void b0(p0 p0Var, t tVar, float f5, e eVar, int i11);

    default long d() {
        return j0().H();
    }

    void f0(long j11, long j12, long j13, float f5, int i11, l lVar, int i12);

    v3.m getLayoutDirection();

    xq.c j0();

    default long r0() {
        return com.bumptech.glide.g.l(j0().H());
    }

    void s(p0 p0Var, long j11, float f5, e eVar);

    void u0(t tVar, long j11, long j12, float f5, e eVar, int i11);

    void v(long j11, float f5, long j12, e eVar, int i11);

    void w0(long j11, long j12, long j13, long j14, e eVar, float f5);

    void z(t tVar, long j11, long j12, long j13, float f5, e eVar);

    void z0(long j11, long j12, long j13, float f5, int i11);
}
