package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f29580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f29581b;

    public d0(w wVar, e0 phase) {
        kotlin.jvm.internal.m.f(phase, "phase");
        this.f29580a = wVar;
        this.f29581b = phase;
    }

    public static d0 a(d0 d0Var, e0 phase) {
        w wVar = d0Var.f29580a;
        d0Var.getClass();
        kotlin.jvm.internal.m.f(phase, "phase");
        return new d0(wVar, phase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.m.a(this.f29580a, d0Var.f29580a) && this.f29581b == d0Var.f29581b;
    }

    public final int hashCode() {
        return this.f29581b.hashCode() + (this.f29580a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedSession(session=" + this.f29580a + ", phase=" + this.f29581b + ")";
    }
}
