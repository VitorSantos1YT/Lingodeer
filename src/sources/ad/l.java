package ad;

import hh.p0;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f621b;

    public l(int i11, int i12) {
        this.f620a = i11;
        this.f621b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f620a == lVar.f620a && this.f621b == lVar.f621b;
    }

    @Override // y2.d1
    public final z1.q f() {
        m mVar = new m();
        mVar.Q = this.f620a;
        mVar.R = this.f621b;
        return mVar;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f621b) + (Integer.hashCode(this.f620a) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        m node = (m) qVar;
        kotlin.jvm.internal.m.f(node, "node");
        node.Q = this.f620a;
        node.R = this.f621b;
    }

    public final String toString() {
        return p0.l("LottieAnimationSizeElement(width=", this.f620a, ", height=", this.f621b, ")");
    }
}
