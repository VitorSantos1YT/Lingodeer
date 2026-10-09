package w2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3.m f54507a = v3.m.Rtl;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f54508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f54509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f54510d;

    public h0(m0 m0Var) {
        this.f54510d = m0Var;
    }

    @Override // w2.q1
    public final List C(Object obj, fz.e eVar) {
        m0 m0Var = this.f54510d;
        m0Var.g();
        y2.i0 i0Var = m0Var.f54542a;
        y2.e0 e0Var = i0Var.f56893j0.f56963d;
        y2.e0 e0Var2 = y2.e0.Measuring;
        if (e0Var != e0Var2 && e0Var != y2.e0.LayingOut && e0Var != y2.e0.LookaheadMeasuring && e0Var != y2.e0.LookaheadLayingOut) {
            v2.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        y.i0 i0Var2 = m0Var.f54548t;
        Object objG = i0Var2.g(obj);
        if (objG == null) {
            objG = (y2.i0) m0Var.L.k(obj);
            if (objG != null) {
                if (m0Var.Q <= 0) {
                    v2.a.b("Check failed.");
                }
                m0Var.Q--;
            } else {
                objG = m0Var.m(obj);
                if (objG == null) {
                    int i11 = m0Var.f54545d;
                    y2.i0 i0Var3 = new y2.i0(2);
                    i0Var.T = true;
                    i0Var.C(i11, i0Var3);
                    i0Var.T = false;
                    objG = i0Var3;
                }
            }
            i0Var2.m(obj, objG);
        }
        y2.i0 i0Var4 = (y2.i0) objG;
        if (ry.m.t0(m0Var.f54545d, i0Var.p()) != i0Var4) {
            int iJ = ((n1.e) ((n1.b) i0Var.p()).f43104b).j(i0Var4);
            if (iJ < m0Var.f54545d) {
                v2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i12 = m0Var.f54545d;
            if (i12 != iJ) {
                m0Var.i(iJ, i12);
            }
        }
        m0Var.f54545d++;
        m0Var.l(i0Var4, obj, false, eVar);
        return (e0Var == e0Var2 || e0Var == y2.e0.LayingOut) ? i0Var4.n() : i0Var4.m();
    }

    @Override // w2.s0
    public final r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2) {
        if ((i11 & (-16777216)) != 0 || ((-16777216) & i12) != 0) {
            v2.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new g0(i11, i12, map, cVar, this, this.f54510d, cVar2);
    }

    @Override // v3.c
    public final float Z() {
        return this.f54509c;
    }

    @Override // w2.s
    public final boolean c0() {
        y2.e0 e0Var = this.f54510d.f54542a.f56893j0.f56963d;
        return e0Var == y2.e0.LookaheadLayingOut || e0Var == y2.e0.LookaheadMeasuring;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f54508b;
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.f54507a;
    }
}
