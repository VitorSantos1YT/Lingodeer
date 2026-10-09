package ob;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44818b;

    public j(String workSpecId, int i11) {
        kotlin.jvm.internal.m.f(workSpecId, "workSpecId");
        this.f44817a = workSpecId;
        this.f44818b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f44817a, jVar.f44817a) && this.f44818b == jVar.f44818b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44818b) + (this.f44817a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f44817a);
        sb2.append(", generation=");
        return ep.a.j(sb2, this.f44818b, ')');
    }
}
