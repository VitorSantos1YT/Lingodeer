package a1;

import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.a f269a;

    public a(fz.a aVar) {
        this.f269a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f269a == ((a) obj).f269a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        return new e(this.f269a);
    }

    public final int hashCode() {
        return this.f269a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((e) qVar).S = this.f269a;
    }
}
