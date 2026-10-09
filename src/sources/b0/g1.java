package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3544a;

    public g1(int i11) {
        this.f3544a = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g1) && ((g1) obj).f3544a == this.f3544a;
    }

    public final int hashCode() {
        return this.f3544a;
    }

    @Override // b0.m
    public final n2 a(j2 j2Var) {
        return new s2(this.f3544a);
    }
}
