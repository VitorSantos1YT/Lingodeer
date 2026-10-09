package mw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e1 extends lw.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f42405a;

    public e1(y2 y2Var) {
        this.f42405a = y2Var;
    }

    @Override // lw.d
    public final String e() {
        return this.f42405a.f42834t.e();
    }

    @Override // lw.d
    public final lw.f f(lw.e1 e1Var, lw.c cVar) {
        return this.f42405a.f42834t.f(e1Var, cVar);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42405a, "delegate");
        return toStringHelperB.toString();
    }
}
