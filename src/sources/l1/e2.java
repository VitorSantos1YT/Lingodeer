package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f39286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39287e;

    public e2(t tVar, int i11) {
        this.f39286d = tVar;
        this.f39287e = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return kotlin.jvm.internal.m.a(e2Var.f39286d, this.f39286d) && e2Var.f39287e == this.f39287e;
    }

    public final int hashCode() {
        return this.f39286d.hashCode() + (this.f39287e * 31);
    }
}
