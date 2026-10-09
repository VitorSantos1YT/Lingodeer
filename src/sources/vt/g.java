package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54227d;

    public g(int i11, String str, String str2, String folderId) {
        kotlin.jvm.internal.m.f(folderId, "folderId");
        this.f54224a = str;
        this.f54225b = str2;
        this.f54226c = i11;
        this.f54227d = folderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f54224a, gVar.f54224a) && kotlin.jvm.internal.m.a(this.f54225b, gVar.f54225b) && this.f54226c == gVar.f54226c && kotlin.jvm.internal.m.a(this.f54227d, gVar.f54227d);
    }

    public final int hashCode() {
        return this.f54227d.hashCode() + defpackage.e.b(this.f54226c, defpackage.e.d(this.f54224a.hashCode() * 31, 31, this.f54225b), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("BookmarkFolderNodeId(lan=", this.f54224a, ", contentType=", this.f54225b, ", serverId=");
        sbS.append(this.f54226c);
        sbS.append(", folderId=");
        sbS.append(this.f54227d);
        sbS.append(")");
        return sbS.toString();
    }
}
