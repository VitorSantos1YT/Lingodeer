package y0;

import d1.r0;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f56794a;

    public e(r0 r0Var) {
        this.f56794a = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f56794a == ((e) obj).f56794a;
        }
        return false;
    }

    @Override // y2.d1
    public final q f() {
        return new g(this.f56794a);
    }

    public final int hashCode() {
        return this.f56794a.hashCode();
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((g) qVar).S = this.f56794a;
    }
}
