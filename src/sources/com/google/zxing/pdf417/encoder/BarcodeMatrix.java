package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BarcodeMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeRow[] f21563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21566d;

    public BarcodeMatrix(int i11, int i12) {
        this.f21563a = new BarcodeRow[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            this.f21563a[i13] = new BarcodeRow(((i12 + 4) * 17) + 1);
        }
        this.f21566d = i12 * 17;
        this.f21565c = i11;
        this.f21564b = -1;
    }

    public final BarcodeRow a() {
        return this.f21563a[this.f21564b];
    }

    public final byte[][] b(int i11, int i12) {
        int i13 = this.f21565c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i13 * i12, this.f21566d * i11);
        int i14 = i13 * i12;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = (i14 - i15) - 1;
            byte[] bArr2 = this.f21563a[i15 / i12].f21567a;
            int length = bArr2.length * i11;
            byte[] bArr3 = new byte[length];
            for (int i17 = 0; i17 < length; i17++) {
                bArr3[i17] = bArr2[i17 / i11];
            }
            bArr[i16] = bArr3;
        }
        return bArr;
    }
}
