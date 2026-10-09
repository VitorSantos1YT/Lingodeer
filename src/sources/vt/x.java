package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54293a;

    public x(String str) {
        this.f54293a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.m.a(this.f54293a, ((x) obj).f54293a);
    }

    public final int hashCode() {
        String str = this.f54293a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ep.a.g("Success(folderId=", this.f54293a, ")");
    }
}
