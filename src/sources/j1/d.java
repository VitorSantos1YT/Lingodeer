package j1;

import rz.e0;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f35466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f35467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35468d;

    public d(boolean z11, fz.a aVar, q qVar, float f5) {
        this.f35465a = z11;
        this.f35466b = aVar;
        this.f35467c = qVar;
        this.f35468d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f35465a == dVar.f35465a && kotlin.jvm.internal.m.a(this.f35466b, dVar.f35466b) && kotlin.jvm.internal.m.a(this.f35467c, dVar.f35467c) && v3.f.b(this.f35468d, dVar.f35468d);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new p(this.f35465a, this.f35466b, this.f35467c, this.f35468d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f35468d) + ((this.f35467c.hashCode() + defpackage.e.e((this.f35466b.hashCode() + (Boolean.hashCode(this.f35465a) * 31)) * 31, 31, true)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        p pVar = (p) qVar;
        pVar.T = this.f35466b;
        pVar.U = true;
        pVar.V = this.f35467c;
        pVar.W = this.f35468d;
        boolean z11 = pVar.S;
        boolean z12 = this.f35465a;
        if (z11 != z12) {
            pVar.S = z12;
            e0.B(pVar.H0(), null, null, new m(pVar, null, 2), 3);
        }
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.f35465a + ", onRefresh=" + this.f35466b + ", enabled=true, state=" + this.f35467c + ", threshold=" + ((Object) v3.f.c(this.f35468d)) + ')';
    }
}
