package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f35805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f35806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f35807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f35808d;

    public v0(p0 p0Var, p0 p0Var2, p0 p0Var3, p0 p0Var4) {
        this.f35805a = p0Var;
        this.f35806b = p0Var2;
        this.f35807c = p0Var3;
        this.f35808d = p0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.m.a(this.f35805a, v0Var.f35805a) && kotlin.jvm.internal.m.a(this.f35806b, v0Var.f35806b) && kotlin.jvm.internal.m.a(this.f35807c, v0Var.f35807c) && kotlin.jvm.internal.m.a(this.f35808d, v0Var.f35808d);
    }

    public final int hashCode() {
        p0 p0Var = this.f35805a;
        int iHashCode = (p0Var != null ? p0Var.hashCode() : 0) * 31;
        p0 p0Var2 = this.f35806b;
        int iHashCode2 = (iHashCode + (p0Var2 != null ? p0Var2.hashCode() : 0)) * 31;
        p0 p0Var3 = this.f35807c;
        int iHashCode3 = (iHashCode2 + (p0Var3 != null ? p0Var3.hashCode() : 0)) * 31;
        p0 p0Var4 = this.f35808d;
        return iHashCode3 + (p0Var4 != null ? p0Var4.hashCode() : 0);
    }

    public /* synthetic */ v0(p0 p0Var, p0 p0Var2, int i11) {
        this((i11 & 1) != 0 ? null : p0Var, null, (i11 & 4) != 0 ? null : p0Var2, null);
    }
}
