package g3;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d1 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f28641a;

    public c(fz.c cVar) {
        this.f28641a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f28641a == ((c) obj).f28641a;
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new e(false, true, this.f28641a);
    }

    @Override // g3.q
    public final o h() {
        o oVar = new o();
        oVar.f28693c = false;
        oVar.f28694d = true;
        this.f28641a.invoke(oVar);
        return oVar;
    }

    public final int hashCode() {
        return this.f28641a.hashCode();
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((e) qVar).S = this.f28641a;
    }
}
