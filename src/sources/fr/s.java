package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27822c;

    public s(String lan, String contentType, int i11) {
        kotlin.jvm.internal.m.f(lan, "lan");
        kotlin.jvm.internal.m.f(contentType, "contentType");
        this.f27820a = lan;
        this.f27821b = contentType;
        this.f27822c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.f27820a, sVar.f27820a) && kotlin.jvm.internal.m.a(this.f27821b, sVar.f27821b) && this.f27822c == sVar.f27822c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27822c) + defpackage.e.d(this.f27820a.hashCode() * 31, 31, this.f27821b);
    }

    public final String toString() {
        return hh.p0.i(this.f27822c, ")", defpackage.e.s("BookmarkFolderServerKey(lan=", this.f27820a, ", contentType=", this.f27821b, ", serverId="));
    }
}
