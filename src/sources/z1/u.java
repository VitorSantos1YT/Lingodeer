package z1;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58491a;

    public u(float f5) {
        this.f58491a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f58491a, ((u) obj).f58491a) == 0;
    }

    @Override // y2.d1
    public final q f() {
        v vVar = new v();
        vVar.Q = this.f58491a;
        return vVar;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58491a);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        ((v) qVar).Q = this.f58491a;
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("ZIndexElement(zIndex="), this.f58491a, ')');
    }
}
