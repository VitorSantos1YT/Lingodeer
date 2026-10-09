package zu;

import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59382b;

    public b(String oldPassword, String newPassword) {
        kotlin.jvm.internal.m.f(oldPassword, "oldPassword");
        kotlin.jvm.internal.m.f(newPassword, "newPassword");
        this.f59381a = oldPassword;
        this.f59382b = newPassword;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f59381a, bVar.f59381a) && kotlin.jvm.internal.m.a(this.f59382b, bVar.f59382b);
    }

    public final int hashCode() {
        return this.f59382b.hashCode() + (this.f59381a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h(shrCcjmOhAmRC.vulpbniMOhOKT, this.f59381a, ", newPassword=", this.f59382b, ")");
    }
}
