package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54219c;

    public f(String lan, String contentType, String str) {
        kotlin.jvm.internal.m.f(lan, "lan");
        kotlin.jvm.internal.m.f(contentType, "contentType");
        this.f54217a = lan;
        this.f54218b = contentType;
        this.f54219c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f54217a, fVar.f54217a) && kotlin.jvm.internal.m.a(this.f54218b, fVar.f54218b) && kotlin.jvm.internal.m.a(this.f54219c, fVar.f54219c);
    }

    public final int hashCode() {
        return this.f54219c.hashCode() + defpackage.e.d(this.f54217a.hashCode() * 31, 31, this.f54218b);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.s("BookmarkFolderNameKey(lan=", this.f54217a, ", contentType=", this.f54218b, ", name="), this.f54219c, ")");
    }
}
