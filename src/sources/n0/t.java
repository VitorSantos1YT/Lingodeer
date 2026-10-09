package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class t extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f43002a;

    public t(w wVar) {
        this.f43002a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.m.a(this.f43002a, ((t) obj).f43002a);
    }

    @Override // y2.d1
    public final z1.q f() {
        u uVar = new u();
        uVar.Q = this.f43002a;
        return uVar;
    }

    public final int hashCode() {
        return this.f43002a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        u uVar = (u) qVar;
        w wVar = uVar.Q;
        w wVar2 = this.f43002a;
        if (kotlin.jvm.internal.m.a(wVar, wVar2) || !uVar.f58482a.P) {
            return;
        }
        w wVar3 = uVar.Q;
        wVar3.d();
        wVar3.f43010b = null;
        uVar.Q = wVar2;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f43002a + ')';
    }
}
