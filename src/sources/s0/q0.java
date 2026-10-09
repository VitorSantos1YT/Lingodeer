package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f51140c = new q0(null, null, 63);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f51141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f51142b;

    public q0(fz.c cVar, fz.c cVar2, int i11) {
        cVar = (i11 & 1) != 0 ? null : cVar;
        cVar2 = (i11 & 16) != 0 ? null : cVar2;
        this.f51141a = cVar;
        this.f51142b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f51141a == q0Var.f51141a && this.f51142b == q0Var.f51142b;
    }

    public final int hashCode() {
        fz.c cVar = this.f51141a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 923521;
        fz.c cVar2 = this.f51142b;
        return (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
    }
}
