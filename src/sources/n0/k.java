package n0;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class k extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f42964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.a f42965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f42966c;

    public k(q qVar, f0.a aVar, h1 h1Var) {
        this.f42964a = qVar;
        this.f42965b = aVar;
        this.f42966c = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f42964a, kVar.f42964a) && kotlin.jvm.internal.m.a(this.f42965b, kVar.f42965b) && this.f42966c == kVar.f42966c;
    }

    @Override // y2.d1
    public final z1.q f() {
        p pVar = new p();
        pVar.Q = this.f42964a;
        pVar.R = this.f42965b;
        pVar.S = this.f42966c;
        return pVar;
    }

    public final int hashCode() {
        return this.f42966c.hashCode() + defpackage.e.e((this.f42965b.hashCode() + (this.f42964a.hashCode() * 31)) * 31, 31, false);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        p pVar = (p) qVar;
        pVar.Q = this.f42964a;
        pVar.R = this.f42965b;
        pVar.S = this.f42966c;
    }
}
