package p7;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f46336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f46337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f46338c;

    public c1() {
        this(new Random());
    }

    public final c1 a(int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f46337b;
            random = this.f46336a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[iNextInt];
            iArr3[iNextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr2[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= 0) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr3[i14];
                i14++;
            }
        }
        return new c1(iArr4, new Random(random.nextLong()));
    }

    public c1(int[] iArr, Random random) {
        this.f46337b = iArr;
        this.f46336a = random;
        this.f46338c = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f46338c[iArr[i11]] = i11;
        }
    }

    public c1(Random random) {
        this(new int[0], random);
    }
}
