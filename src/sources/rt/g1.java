package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49773b;

    public g1(long j11, List items) {
        kotlin.jvm.internal.m.f(items, "items");
        this.f49772a = j11;
        this.f49773b = items;
    }

    @Override // rt.h1
    public final long a() {
        return this.f49772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f49772a == g1Var.f49772a && kotlin.jvm.internal.m.a(this.f49773b, g1Var.f49773b);
    }

    public final int hashCode() {
        return this.f49773b.hashCode() + (Long.hashCode(this.f49772a) * 31);
    }

    public final String toString() {
        return "Success(sourceRevision=" + this.f49772a + ", items=" + this.f49773b + ")";
    }
}
