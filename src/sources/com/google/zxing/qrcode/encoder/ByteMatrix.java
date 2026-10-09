package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ByteMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f21596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21598c;

    public ByteMatrix(int i11, int i12) {
        this.f21596a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.f21597b = i11;
        this.f21598c = i12;
    }

    public final byte a(int i11, int i12) {
        return this.f21596a[i12][i11];
    }

    public final void b(int i11, int i12, int i13) {
        this.f21596a[i12][i11] = (byte) i13;
    }

    public final void c(int i11, int i12, boolean z11) {
        this.f21596a[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i11 = this.f21597b;
        int i12 = this.f21598c;
        StringBuilder sb2 = new StringBuilder((i11 * 2 * i12) + 2);
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr = this.f21596a[i13];
            for (int i14 = 0; i14 < i11; i14++) {
                byte b3 = bArr[i14];
                if (b3 == 0) {
                    sb2.append(" 0");
                } else if (b3 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
