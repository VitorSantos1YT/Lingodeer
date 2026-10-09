package gv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29863a = "https://oss-us-west-1.aliyuncs.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29864b = "lingodeer";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29863a.equals(aVar.f29863a) && this.f29864b.equals(aVar.f29864b);
    }

    public final int hashCode() {
        return Long.hashCode(300L) + defpackage.e.d(this.f29863a.hashCode() * 31, 31, this.f29864b);
    }

    public final String toString() {
        return ep.a.h("OssUploadConfig(endpoint=", this.f29863a, ", bucketName=", this.f29864b, ", tokenRefreshAdvanceTime=300)");
    }
}
