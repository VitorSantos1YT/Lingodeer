package l8;

import java.util.Arrays;
import java.util.Objects;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f39800e;

    public a(int i11, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f39797b = str;
        this.f39798c = str2;
        this.f39799d = i11;
        this.f39800e = bArr;
    }

    @Override // y6.b0
    public final void b(z zVar) {
        zVar.a(this.f39800e, this.f39799d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f39799d == aVar.f39799d && Objects.equals(this.f39797b, aVar.f39797b) && Objects.equals(this.f39798c, aVar.f39798c) && Arrays.equals(this.f39800e, aVar.f39800e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (527 + this.f39799d) * 31;
        String str = this.f39797b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39798c;
        return Arrays.hashCode(this.f39800e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": mimeType=" + this.f39797b + ", description=" + this.f39798c;
    }
}
