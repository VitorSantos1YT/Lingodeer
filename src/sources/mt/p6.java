package mt;

import rt.le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p6 implements r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le f41776a;

    public p6(le leVar) {
        this.f41776a = leVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && kotlin.jvm.internal.m.a(this.f41776a, ((p6) obj).f41776a);
    }

    public final int hashCode() {
        return this.f41776a.hashCode();
    }

    public final String toString() {
        return "Custom(dateRange=" + this.f41776a + ")";
    }
}
