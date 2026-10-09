package q0;

import g3.k;
import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.i f47336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f47338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f47339e;

    public e(boolean z11, h0.i iVar, boolean z12, k kVar, fz.c cVar) {
        this.f47335a = z11;
        this.f47336b = iVar;
        this.f47337c = z12;
        this.f47338d = kVar;
        this.f47339e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f47335a == eVar.f47335a && m.a(this.f47336b, eVar.f47336b) && this.f47337c == eVar.f47337c && this.f47338d.equals(eVar.f47338d) && this.f47339e == eVar.f47339e;
    }

    @Override // y2.d1
    public final q f() {
        return new g(this.f47335a, this.f47336b, this.f47337c, this.f47338d, this.f47339e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f47335a) * 31;
        h0.i iVar = this.f47336b;
        return this.f47339e.hashCode() + defpackage.e.b(this.f47338d.f28656a, defpackage.e.e(defpackage.e.e((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 961, 31, false), 31, this.f47337c), 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        g gVar = (g) qVar;
        boolean z11 = gVar.f47345n0;
        boolean z12 = this.f47335a;
        if (z11 != z12) {
            gVar.f47345n0 = z12;
            y2.f.o(gVar);
        }
        gVar.f47346o0 = this.f47339e;
        gVar.f1(this.f47336b, null, false, this.f47337c, null, this.f47338d, gVar.f47347p0);
    }
}
