package p0;

import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f46238a;

    public a(c cVar) {
        this.f46238a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.f46238a, ((a) obj).f46238a);
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        e eVar = new e();
        eVar.Q = this.f46238a;
        return eVar;
    }

    public final int hashCode() {
        return this.f46238a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        e eVar = (e) qVar;
        c cVar = eVar.Q;
        if (cVar != null) {
            cVar.f46246a.k(eVar);
        }
        c cVar2 = this.f46238a;
        if (cVar2 != null) {
            cVar2.f46246a.c(eVar);
        }
        eVar.Q = cVar2;
    }
}
