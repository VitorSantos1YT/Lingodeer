package m0;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f40548a;

    public f(x xVar) {
        this.f40548a = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // n0.q
    public final int a() {
        return ((q) ry.m.z0(this.f40548a.g().m)).f40606a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.q
    public final int b() {
        int i11;
        x xVar = this.f40548a;
        int i12 = 0;
        if (xVar.g().m.isEmpty()) {
            return 0;
        }
        p pVarG = xVar.g();
        h1 h1Var = pVarG.f40603q;
        h1 h1Var2 = h1.Vertical;
        int iE = (int) (h1Var == h1Var2 ? pVarG.e() & 4294967295L : pVarG.e() >> 32);
        p pVarG2 = xVar.g();
        boolean z11 = pVarG2.f40603q == h1Var2;
        ?? r9 = pVarG2.m;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < r9.size()) {
            int iO = o00.a.O(z11, pVarG2, i13);
            if (iO == -1) {
                i13++;
            } else {
                int iMax = i12;
                while (i13 < r9.size() && o00.a.O(z11, pVarG2, i13) == iO) {
                    iMax = Math.max(iMax, (int) (z11 ? ((q) r9.get(i13)).f40618n & 4294967295L : ((q) r9.get(i13)).f40618n >> 32));
                    i13++;
                    z11 = z11;
                }
                i14 += iMax;
                i15++;
                z11 = z11;
                i12 = 0;
            }
        }
        int i16 = (i14 / i15) + pVarG2.f40605s;
        if (i16 != 0 && (i11 = iE / i16) >= 1) {
            return i11;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // n0.q
    public final boolean c() {
        return !this.f40548a.g().m.isEmpty();
    }

    @Override // n0.q
    public final int d() {
        return this.f40548a.f40653d.f39181b.l();
    }

    @Override // n0.q
    public final int getItemCount() {
        return this.f40548a.g().f40602p;
    }
}
