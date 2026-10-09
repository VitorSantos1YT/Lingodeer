package fd;

import fb.g0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f27148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f27149b;

    public c(float[] fArr, int[] iArr) {
        this.f27148a = fArr;
        this.f27149b = iArr;
    }

    public final void a(c cVar) {
        int i11 = 0;
        while (true) {
            int[] iArr = cVar.f27149b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f27148a[i11] = cVar.f27148a[i11];
            this.f27149b[i11] = iArr[i11];
            i11++;
        }
    }

    public final c b(float[] fArr) {
        int iN;
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            float f5 = fArr[i11];
            float[] fArr2 = this.f27148a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f5);
            int[] iArr2 = this.f27149b;
            if (iBinarySearch >= 0) {
                iN = iArr2[iBinarySearch];
            } else {
                int i12 = -(iBinarySearch + 1);
                if (i12 == 0) {
                    iN = iArr2[0];
                } else if (i12 == iArr2.length - 1) {
                    iN = iArr2[iArr2.length - 1];
                } else {
                    int i13 = i12 - 1;
                    float f11 = fArr2[i13];
                    iN = g0.n(iArr2[i13], (f5 - f11) / (fArr2[i12] - f11), iArr2[i12]);
                }
            }
            iArr[i11] = iN;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f27148a, cVar.f27148a) && Arrays.equals(this.f27149b, cVar.f27149b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27149b) + (Arrays.hashCode(this.f27148a) * 31);
    }
}
