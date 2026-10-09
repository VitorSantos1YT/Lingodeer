package lw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k1 extends f {
    @Override // lw.f
    public void a(String str, Throwable th2) {
        r().a(str, th2);
    }

    @Override // lw.f
    public final void g() {
        r().g();
    }

    @Override // lw.f
    public final void l() {
        r().l();
    }

    public abstract f r();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(r(), "delegate");
        return toStringHelperB.toString();
    }
}
