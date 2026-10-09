package g3;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d1 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f28640b;

    public b(fz.c cVar, boolean z11) {
        this.f28639a = z11;
        this.f28640b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f28639a == bVar.f28639a && this.f28640b == bVar.f28640b;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new e(this.f28639a, false, this.f28640b);
    }

    @Override // g3.q
    public final o h() {
        o oVar = new o();
        oVar.f28693c = this.f28639a;
        this.f28640b.invoke(oVar);
        return oVar;
    }

    public final int hashCode() {
        return this.f28640b.hashCode() + (Boolean.hashCode(this.f28639a) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        e eVar = (e) qVar;
        eVar.Q = this.f28639a;
        eVar.S = this.f28640b;
    }
}
