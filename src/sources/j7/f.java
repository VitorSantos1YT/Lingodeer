package j7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36126c;

    public f(String str, String str2, String str3) {
        this.f36124a = str;
        this.f36125b = str2;
        this.f36126c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f36124a, fVar.f36124a) && Objects.equals(this.f36125b, fVar.f36125b) && Objects.equals(this.f36126c, fVar.f36126c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36124a.hashCode() * 31;
        String str = this.f36125b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36126c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
