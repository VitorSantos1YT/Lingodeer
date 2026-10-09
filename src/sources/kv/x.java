package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f38830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f38831b;

    public x(e0 e0Var, e0 e0Var2) {
        this.f38830a = e0Var;
        this.f38831b = e0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.f38830a, xVar.f38830a) && kotlin.jvm.internal.m.a(this.f38831b, xVar.f38831b);
    }

    public final int hashCode() {
        return this.f38831b.hashCode() + (this.f38830a.hashCode() * 31);
    }

    public final String toString() {
        return "JPIntroKanaChange(source=" + this.f38830a + ", target=" + this.f38831b + ")";
    }
}
