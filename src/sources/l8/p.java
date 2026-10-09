package l8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39840c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f39839b = str2;
        this.f39840c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f39825a.equals(pVar.f39825a) && Objects.equals(this.f39839b, pVar.f39839b) && Objects.equals(this.f39840c, pVar.f39840c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = defpackage.e.d(527, 31, this.f39825a);
        String str = this.f39839b;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39840c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": url=" + this.f39840c;
    }
}
