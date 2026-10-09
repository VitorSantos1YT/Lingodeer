package l8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f39819e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f39816b = str;
        this.f39817c = str2;
        this.f39818d = str3;
        this.f39819e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f39816b, fVar.f39816b) && Objects.equals(this.f39817c, fVar.f39817c) && Objects.equals(this.f39818d, fVar.f39818d) && Arrays.equals(this.f39819e, fVar.f39819e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39816b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39817c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39818d;
        return Arrays.hashCode(this.f39819e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": mimeType=" + this.f39816b + ", filename=" + this.f39817c + ", description=" + this.f39818d;
    }
}
