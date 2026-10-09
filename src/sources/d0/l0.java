package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class l0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f22753a;

    public l0(h0.i iVar) {
        this.f22753a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return kotlin.jvm.internal.m.a(this.f22753a, ((l0) obj).f22753a);
        }
        return false;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new n0(this.f22753a, 1, null);
    }

    public final int hashCode() {
        h0.i iVar = this.f22753a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((n0) qVar).Y0(this.f22753a);
    }
}
