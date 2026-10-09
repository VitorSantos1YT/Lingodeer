package y6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f57174c = new b(new a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f57175d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f57177b;

    static {
        a aVar = new a(-1, -1, new int[0], new x[0], new long[0], new String[0]);
        int[] iArr = aVar.f57146e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f57147f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f57175d = new a(0, aVar.f57143b, iArrCopyOf, (x[]) Arrays.copyOf(aVar.f57145d, 0), jArrCopyOf, (String[]) Arrays.copyOf(aVar.f57148g, 0));
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
        b7.f0.G(4);
    }

    public b(a[] aVarArr) {
        this.f57176a = aVarArr.length;
        this.f57177b = aVarArr;
    }

    public final a a(int i11) {
        return i11 < 0 ? f57175d : this.f57177b[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f57176a == bVar.f57176a && Arrays.equals(this.f57177b, bVar.f57177b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f57177b) + (((((this.f57176a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f57177b;
            if (i11 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i11].getClass();
            for (int i12 = 0; i12 < aVarArr[i11].f57146e.length; i12++) {
                sb2.append("ad(state=");
                int i13 = aVarArr[i11].f57146e[i12];
                if (i13 == 0) {
                    sb2.append('_');
                } else if (i13 == 1) {
                    sb2.append('R');
                } else if (i13 == 2) {
                    sb2.append('S');
                } else if (i13 == 3) {
                    sb2.append('P');
                } else if (i13 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i11].f57147f[i12]);
                sb2.append(')');
                if (i12 < aVarArr[i11].f57146e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i11 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i11++;
        }
    }
}
