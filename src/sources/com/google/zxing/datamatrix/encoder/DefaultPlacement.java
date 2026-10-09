package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultPlacement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f21504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21507d;

    public DefaultPlacement(String str, int i11, int i12) {
        this.f21504a = str;
        this.f21506c = i11;
        this.f21505b = i12;
        byte[] bArr = new byte[i11 * i12];
        this.f21507d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            int i15 = this.f21505b;
            i11 += i15;
            i12 += 4 - ((i15 + 4) % 8);
        }
        int i16 = this.f21506c;
        if (i12 < 0) {
            i12 += i16;
            i11 += 4 - ((i16 + 4) % 8);
        }
        this.f21507d[(i11 * i16) + i12] = (byte) ((this.f21504a.charAt(i13) & (1 << (8 - i14))) == 0 ? 0 : 1);
    }

    public final void b(int i11, int i12, int i13) {
        int i14 = i11 - 2;
        int i15 = i12 - 2;
        a(i14, i15, i13, 1);
        int i16 = i12 - 1;
        a(i14, i16, i13, 2);
        int i17 = i11 - 1;
        a(i17, i15, i13, 3);
        a(i17, i16, i13, 4);
        a(i17, i12, i13, 5);
        a(i11, i15, i13, 6);
        a(i11, i16, i13, 7);
        a(i11, i12, i13, 8);
    }
}
