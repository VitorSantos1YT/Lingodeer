package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BitArray implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21479b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f21478a = new int[1];

    public final void a(boolean z11) {
        d(this.f21479b + 1);
        if (z11) {
            int[] iArr = this.f21478a;
            int i11 = this.f21479b;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f21479b++;
    }

    public final void c(int i11, int i12) {
        if (i12 < 0 || i12 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        d(this.f21479b + i12);
        while (i12 > 0) {
            boolean z11 = true;
            if (((i11 >> (i12 - 1)) & 1) != 1) {
                z11 = false;
            }
            a(z11);
            i12--;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f21478a.clone();
        int i11 = this.f21479b;
        BitArray bitArray = new BitArray();
        bitArray.f21478a = iArr;
        bitArray.f21479b = i11;
        return bitArray;
    }

    public final void d(int i11) {
        int[] iArr = this.f21478a;
        if (i11 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i11 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f21478a = iArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.f21479b == bitArray.f21479b && Arrays.equals(this.f21478a, bitArray.f21478a);
    }

    public final boolean f(int i11) {
        return ((1 << (i11 & 31)) & this.f21478a[i11 / 32]) != 0;
    }

    public final int g() {
        return (this.f21479b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21478a) + (this.f21479b * 31);
    }

    public final String toString() {
        int i11 = this.f21479b;
        StringBuilder sb2 = new StringBuilder((i11 / 8) + i11 + 1);
        for (int i12 = 0; i12 < this.f21479b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(f(i12) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
