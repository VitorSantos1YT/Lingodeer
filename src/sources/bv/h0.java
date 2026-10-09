package bv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f6301a;

    public h0(l0 result) {
        kotlin.jvm.internal.m.f(result, "result");
        this.f6301a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.m.a(this.f6301a, ((h0) obj).f6301a);
    }

    public final int hashCode() {
        return this.f6301a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f6301a + ")";
    }
}
