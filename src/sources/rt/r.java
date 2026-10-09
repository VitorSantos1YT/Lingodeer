package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50321d;

    public r(int i11, String id2, String name, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(name, "name");
        this.f50318a = id2;
        this.f50319b = name;
        this.f50320c = i11;
        this.f50321d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.f50318a, rVar.f50318a) && kotlin.jvm.internal.m.a(this.f50319b, rVar.f50319b) && this.f50320c == rVar.f50320c && this.f50321d == rVar.f50321d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50321d) + defpackage.e.b(this.f50320c, defpackage.e.d(this.f50318a.hashCode() * 31, 31, this.f50319b), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("BookmarkFolderSummary(id=", this.f50318a, ", name=", this.f50319b, ", count=");
        sbS.append(this.f50320c);
        sbS.append(", isDefault=");
        sbS.append(this.f50321d);
        sbS.append(")");
        return sbS.toString();
    }
}
