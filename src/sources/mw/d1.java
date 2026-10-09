package mw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d1 implements f0 {
    @Override // mw.g3
    public final Runnable a(f3 f3Var) {
        return e().a(f3Var);
    }

    @Override // mw.g3
    public void c(lw.q1 q1Var) {
        e().c(q1Var);
    }

    @Override // lw.e0
    public final lw.f0 d() {
        return e().d();
    }

    public abstract f0 e();

    @Override // mw.f0
    public final lw.b getAttributes() {
        return e().getAttributes();
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(e(), "delegate");
        return toStringHelperB.toString();
    }
}
