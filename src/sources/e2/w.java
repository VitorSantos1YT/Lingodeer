package e2;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class w extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f24764a;

    public w(v vVar) {
        this.f24764a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.m.a(this.f24764a, ((w) obj).f24764a);
    }

    @Override // y2.d1
    public final z1.q f() {
        y yVar = new y();
        yVar.Q = this.f24764a;
        return yVar;
    }

    public final int hashCode() {
        return this.f24764a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        y yVar = (y) qVar;
        yVar.Q.f24763a.k(yVar);
        v vVar = this.f24764a;
        yVar.Q = vVar;
        vVar.f24763a.c(yVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f24764a + ')';
    }
}
