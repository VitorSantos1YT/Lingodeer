package l0;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f39106a;

    public e(w wVar) {
        this.f39106a = wVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // n0.q
    public final int a() {
        return Math.min(getItemCount() - 1, ((p) ry.m.z0(this.f39106a.h().f39156k)).f39162a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.q
    public final int b() {
        int i11;
        w wVar = this.f39106a;
        if (wVar.h().f39156k.isEmpty()) {
            return 0;
        }
        o oVarH = wVar.h();
        int iE = (int) (oVarH.f39159o == h1.Vertical ? oVarH.e() & 4294967295L : oVarH.e() >> 32);
        int iC = vc.a.C(wVar.h());
        if (iC != 0 && (i11 = iE / iC) >= 1) {
            return i11;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // n0.q
    public final boolean c() {
        return !this.f39106a.h().f39156k.isEmpty();
    }

    @Override // n0.q
    public final int d() {
        return Math.max(0, this.f39106a.f39206e.f39181b.l());
    }

    @Override // n0.q
    public final int getItemCount() {
        return this.f39106a.h().f39158n;
    }
}
