package com.google.zxing.common.reedsolomon;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GenericGF {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final GenericGF f21484g = new GenericGF(4201, 4096, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GenericGF f21485h = new GenericGF(1033, 1024, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final GenericGF f21486i = new GenericGF(67, 64, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final GenericGF f21487j = new GenericGF(19, 16, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final GenericGF f21488k = new GenericGF(285, 256, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GenericGF f21489l = new GenericGF(301, 256, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GenericGFPoly f21492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21495f;

    public GenericGF(int i11, int i12, int i13) {
        this.f21494e = i11;
        this.f21493d = i12;
        this.f21495f = i13;
        this.f21490a = new int[i12];
        this.f21491b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f21490a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f21491b[this.f21490a[i16]] = i16;
        }
        this.f21492c = new GenericGFPoly(this, new int[]{0});
        new GenericGFPoly(this, new int[]{1});
    }

    public final int a(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f21491b;
        return this.f21490a[(iArr[i11] + iArr[i12]) % (this.f21493d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f21494e));
        sb2.append(',');
        return a.j(sb2, this.f21493d, ')');
    }
}
