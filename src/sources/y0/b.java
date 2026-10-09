package y0;

import ch.z;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class b extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f56792a;

    public b(z zVar) {
        this.f56792a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f56792a == ((b) obj).f56792a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        c cVar = new c();
        cVar.S = this.f56792a;
        s0.a aVar = new s0.a(cVar, 27);
        a aVar2 = new a();
        aVar2.Q = aVar;
        cVar.T0(aVar2);
        return cVar;
    }

    public final int hashCode() {
        return this.f56792a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((c) qVar).S = this.f56792a;
    }
}
