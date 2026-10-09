package com.google.zxing.pdf417.decoder.ec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ModulusPoly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21562a;

    public ModulusPoly(int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f21562a = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f21562a = new int[]{0};
            return;
        }
        int i12 = length - i11;
        int[] iArr2 = new int[i12];
        this.f21562a = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
    }

    public final String toString() {
        int[] iArr = this.f21562a;
        StringBuilder sb2 = new StringBuilder((iArr.length - 1) * 8);
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i11 = iArr[(iArr.length - 1) - length];
            if (i11 != 0) {
                if (i11 < 0) {
                    sb2.append(" - ");
                    i11 = -i11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (length == 0 || i11 != 1) {
                    sb2.append(i11);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(length);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
