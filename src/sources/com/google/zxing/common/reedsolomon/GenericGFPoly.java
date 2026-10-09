package com.google.zxing.common.reedsolomon;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class GenericGFPoly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21497b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f21496a = genericGF;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f21497b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f21497b = new int[]{0};
            return;
        }
        int i12 = length - i11;
        int[] iArr2 = new int[i12];
        this.f21497b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
    }

    public final GenericGFPoly a(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.f21496a;
        GenericGF genericGF2 = this.f21496a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return genericGFPoly;
        }
        if (genericGFPoly.c()) {
            return this;
        }
        int[] iArr = genericGFPoly.f21497b;
        int[] iArr2 = this.f21497b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = iArr2[i11 - length] ^ iArr[i11];
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final int b() {
        return this.f21497b.length - 1;
    }

    public final boolean c() {
        return this.f21497b[0] == 0;
    }

    public final GenericGFPoly d(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        GenericGF genericGF = this.f21496a;
        if (i12 == 0) {
            return genericGF.f21492c;
        }
        int[] iArr = this.f21497b;
        int length = iArr.length;
        int[] iArr2 = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr2[i13] = genericGF.a(iArr[i13], i12);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f21497b;
            int i11 = iArr[(iArr.length - 1) - iB];
            if (i11 != 0) {
                if (i11 < 0) {
                    sb2.append(" - ");
                    i11 = -i11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iB == 0 || i11 != 1) {
                    GenericGF genericGF = this.f21496a;
                    if (i11 == 0) {
                        genericGF.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i12 = genericGF.f21491b[i11];
                    if (i12 == 0) {
                        sb2.append('1');
                    } else if (i12 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i12);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iB);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
