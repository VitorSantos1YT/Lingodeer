package mw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1 implements y {
    @Override // mw.y
    public final void e(dm.a aVar) {
        ((u1) this).f42711a.e(aVar);
    }

    @Override // mw.y
    public final void h() {
        ((u1) this).f42711a.h();
    }

    @Override // mw.y
    public final void j(lw.c1 c1Var) {
        ((u1) this).f42711a.j(c1Var);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(((u1) this).f42711a, "delegate");
        return toStringHelperB.toString();
    }
}
