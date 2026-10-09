package i1;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class c0<T> extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.s f33987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.e f33988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f33989c;

    public c0(ob.s sVar, fz.e eVar, h1 h1Var) {
        this.f33987a = sVar;
        this.f33988b = eVar;
        this.f33989c = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f33987a, c0Var.f33987a) && this.f33988b == c0Var.f33988b && this.f33989c == c0Var.f33989c;
    }

    @Override // y2.d1
    public final z1.q f() {
        d0 d0Var = new d0();
        d0Var.Q = this.f33987a;
        d0Var.R = this.f33988b;
        d0Var.S = this.f33989c;
        return d0Var;
    }

    public final int hashCode() {
        return this.f33989c.hashCode() + ((this.f33988b.hashCode() + (this.f33987a.hashCode() * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        d0 d0Var = (d0) qVar;
        d0Var.Q = this.f33987a;
        d0Var.R = this.f33988b;
        d0Var.S = this.f33989c;
    }
}
