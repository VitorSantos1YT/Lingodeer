package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3.c f35657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35659c;

    public a0(r3.c cVar, int i11, int i12) {
        this.f35657a = cVar;
        this.f35658b = i11;
        this.f35659c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f35657a.equals(a0Var.f35657a) && this.f35658b == a0Var.f35658b && this.f35659c == a0Var.f35659c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35659c) + defpackage.e.b(this.f35658b, this.f35657a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f35657a);
        sb2.append(", startIndex=");
        sb2.append(this.f35658b);
        sb2.append(", endIndex=");
        return ep.a.j(sb2, this.f35659c, ')');
    }
}
