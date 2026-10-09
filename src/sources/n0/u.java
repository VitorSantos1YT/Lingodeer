package n0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends z1.q implements y2.q {
    public w Q;

    @Override // z1.q
    public final void L0() {
        this.Q.getClass();
    }

    @Override // z1.q
    public final void M0() {
        w wVar = this.Q;
        wVar.d();
        wVar.f43010b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.Q, ((u) obj).Q);
    }

    public final int hashCode() {
        return this.Q.hashCode();
    }

    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        ArrayList arrayList = this.Q.f43016h;
        if (arrayList.size() <= 0) {
            k0Var.a();
        } else {
            hh.p0.z(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.Q + ')';
    }
}
