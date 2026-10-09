package y;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f56790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56791b;

    public z(int i11) {
        this.f56790a = i11 == 0 ? q.f56750a : new long[i11];
    }

    public final void a(long j11) {
        int i11 = this.f56791b + 1;
        long[] jArr = this.f56790a;
        if (jArr.length < i11) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i11, (jArr.length * 3) / 2));
            kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
            this.f56790a = jArrCopyOf;
        }
        long[] jArr2 = this.f56790a;
        int i12 = this.f56791b;
        jArr2[i12] = j11;
        this.f56791b = i12 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i11 = zVar.f56791b;
            int i12 = this.f56791b;
            if (i11 == i12) {
                long[] jArr = this.f56790a;
                long[] jArr2 = zVar.f56790a;
                lz.g gVarU = hz.b.U(0, i12);
                int i13 = gVarU.f40532a;
                int i14 = gVarU.f40533b;
                if (i13 > i14) {
                    return true;
                }
                while (jArr[i13] == jArr2[i13]) {
                    if (i13 == i14) {
                        return true;
                    }
                    i13++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f56790a;
        int i11 = this.f56791b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Long.hashCode(jArr[i12]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f56790a;
        int i11 = this.f56791b;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j11);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return string2;
    }
}
