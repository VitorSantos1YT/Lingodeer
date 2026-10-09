package q0;

import d0.g1;
import g3.k;
import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class h extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3.a f47348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.i f47349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f47350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f47352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.a f47353f;

    public h(i3.a aVar, h0.i iVar, g1 g1Var, boolean z11, k kVar, fz.a aVar2) {
        this.f47348a = aVar;
        this.f47349b = iVar;
        this.f47350c = g1Var;
        this.f47351d = z11;
        this.f47352e = kVar;
        this.f47353f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f47348a == hVar.f47348a && m.a(this.f47349b, hVar.f47349b) && m.a(this.f47350c, hVar.f47350c) && this.f47351d == hVar.f47351d && this.f47352e.equals(hVar.f47352e) && this.f47353f == hVar.f47353f;
    }

    @Override // y2.d1
    public final q f() {
        i iVar = new i(this.f47349b, this.f47350c, false, this.f47351d, null, this.f47352e, this.f47353f);
        iVar.f47354n0 = this.f47348a;
        return iVar;
    }

    public final int hashCode() {
        int iHashCode = this.f47348a.hashCode() * 31;
        h0.i iVar = this.f47349b;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        g1 g1Var = this.f47350c;
        return this.f47353f.hashCode() + defpackage.e.b(this.f47352e.f28656a, defpackage.e.e(defpackage.e.e((iHashCode2 + (g1Var != null ? g1Var.hashCode() : 0)) * 31, 31, false), 31, this.f47351d), 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        i iVar = (i) qVar;
        i3.a aVar = iVar.f47354n0;
        i3.a aVar2 = this.f47348a;
        if (aVar != aVar2) {
            iVar.f47354n0 = aVar2;
            y2.f.o(iVar);
        }
        iVar.f1(this.f47349b, this.f47350c, false, this.f47351d, null, this.f47352e, this.f47353f);
    }
}
