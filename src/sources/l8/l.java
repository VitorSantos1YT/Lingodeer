package l8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39829d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f39827b = str;
        this.f39828c = str2;
        this.f39829d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f39828c, lVar.f39828c) && Objects.equals(this.f39827b, lVar.f39827b) && Objects.equals(this.f39829d, lVar.f39829d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39827b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39828c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39829d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": domain=" + this.f39827b + ", description=" + this.f39828c;
    }
}
