package l8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f39833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f39834f;

    public m(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        super("MLLT");
        this.f39830b = i11;
        this.f39831c = i12;
        this.f39832d = i13;
        this.f39833e = iArr;
        this.f39834f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f39830b == mVar.f39830b && this.f39831c == mVar.f39831c && this.f39832d == mVar.f39832d && Arrays.equals(this.f39833e, mVar.f39833e) && Arrays.equals(this.f39834f, mVar.f39834f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39834f) + ((Arrays.hashCode(this.f39833e) + ((((((527 + this.f39830b) * 31) + this.f39831c) * 31) + this.f39832d) * 31)) * 31);
    }
}
