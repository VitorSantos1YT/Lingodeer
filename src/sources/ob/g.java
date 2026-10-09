package ob;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44810c;

    public g(String workSpecId, int i11, int i12) {
        kotlin.jvm.internal.m.f(workSpecId, "workSpecId");
        this.f44808a = workSpecId;
        this.f44809b = i11;
        this.f44810c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f44808a, gVar.f44808a) && this.f44809b == gVar.f44809b && this.f44810c == gVar.f44810c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44810c) + defpackage.e.b(this.f44809b, this.f44808a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f44808a);
        sb2.append(", generation=");
        sb2.append(this.f44809b);
        sb2.append(", systemId=");
        return ep.a.j(sb2, this.f44810c, ')');
    }
}
