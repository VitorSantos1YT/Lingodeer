package com.google.firebase.platforminfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20635b;

    public AutoValue_LibraryVersion(String str, String str2) {
        this.f20634a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f20635b = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String a() {
        return this.f20634a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String b() {
        return this.f20635b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f20634a.equals(libraryVersion.a()) && this.f20635b.equals(libraryVersion.b());
    }

    public final int hashCode() {
        return ((this.f20634a.hashCode() ^ 1000003) * 1000003) ^ this.f20635b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f20634a);
        sb2.append(", version=");
        return ep.a.k(sb2, this.f20635b, "}");
    }
}
