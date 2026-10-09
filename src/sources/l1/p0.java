package l1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f39389b;

    public p0(int i11, boolean z11) {
        switch (i11) {
            case 1:
                this.f39389b = new int[10];
                break;
            default:
                this.f39389b = new int[10];
                break;
        }
    }

    public boolean a(int i11) {
        return ((1 << i11) & this.f39388a) != 0;
    }

    public int b(int i11) {
        int i12 = this.f39388a - 1;
        return i12 >= 0 ? this.f39389b[i12] : i11;
    }

    public int c() {
        int[] iArr = this.f39389b;
        int i11 = this.f39388a - 1;
        this.f39388a = i11;
        return iArr[i11];
    }

    public void d(int i11) {
        int[] iArrCopyOf = this.f39389b;
        if (this.f39388a >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f39389b = iArrCopyOf;
        }
        int i12 = this.f39388a;
        this.f39388a = i12 + 1;
        iArrCopyOf[i12] = i11;
    }

    public void e(int i11, int i12, int i13) {
        int i14 = this.f39388a;
        int[] iArrCopyOf = this.f39389b;
        int i15 = i14 + 3;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f39389b = iArrCopyOf;
        }
        iArrCopyOf[i14] = i11 + i13;
        iArrCopyOf[i14 + 1] = i12 + i13;
        iArrCopyOf[i14 + 2] = i13;
        this.f39388a = i15;
    }

    public void f(int i11, int i12, int i13, int i14) {
        int i15 = this.f39388a;
        int[] iArrCopyOf = this.f39389b;
        int i16 = i15 + 4;
        if (i16 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f39389b = iArrCopyOf;
        }
        iArrCopyOf[i15] = i11;
        iArrCopyOf[i15 + 1] = i12;
        iArrCopyOf[i15 + 2] = i13;
        iArrCopyOf[i15 + 3] = i14;
        this.f39388a = i16;
    }

    public void g(int i11, int i12) {
        if (i11 < i12) {
            int i13 = i11 - 3;
            for (int i14 = i11; i14 < i12; i14 += 3) {
                int[] iArr = this.f39389b;
                int i15 = iArr[i14];
                int i16 = iArr[i12];
                if (i15 < i16 || (i15 == i16 && iArr[i14 + 1] <= iArr[i12 + 1])) {
                    i13 += 3;
                    i(i13, i14);
                }
            }
            i(i13 + 3, i12);
            g(i11, i13);
            g(i13 + 6, i12);
        }
    }

    public void h(int i11, int i12) {
        int[] iArr = this.f39389b;
        if (i11 >= iArr.length) {
            return;
        }
        this.f39388a = (1 << i11) | this.f39388a;
        iArr[i11] = i12;
    }

    public void i(int i11, int i12) {
        int[] iArr = this.f39389b;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
        int i17 = i11 + 2;
        int i18 = i12 + 2;
        int i19 = iArr[i17];
        iArr[i17] = iArr[i18];
        iArr[i18] = i19;
    }

    public p0(int i11) {
        this.f39389b = new int[i11];
    }
}
