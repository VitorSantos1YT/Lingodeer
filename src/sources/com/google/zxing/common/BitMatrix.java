package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BitMatrix implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f21483d;

    public BitMatrix(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f21480a = i11;
        this.f21481b = i12;
        int i13 = (i11 + 31) / 32;
        this.f21482c = i13;
        this.f21483d = new int[i13 * i12];
    }

    public final boolean a(int i11, int i12) {
        return ((this.f21483d[(i11 / 32) + (i12 * this.f21482c)] >>> (i11 & 31)) & 1) != 0;
    }

    public final void c(int i11, int i12) {
        int i13 = (i11 / 32) + (i12 * this.f21482c);
        int[] iArr = this.f21483d;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public final Object clone() {
        return new BitMatrix(this.f21480a, this.f21481b, this.f21482c, (int[]) this.f21483d.clone());
    }

    public final void d(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i14 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i15 = i13 + i11;
        int i16 = i14 + i12;
        if (i16 > this.f21481b || i15 > this.f21480a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i12 < i16) {
            int i17 = this.f21482c * i12;
            for (int i18 = i11; i18 < i15; i18++) {
                int i19 = (i18 / 32) + i17;
                int[] iArr = this.f21483d;
                iArr[i19] = iArr[i19] | (1 << (i18 & 31));
            }
            i12++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.f21480a == bitMatrix.f21480a && this.f21481b == bitMatrix.f21481b && this.f21482c == bitMatrix.f21482c && Arrays.equals(this.f21483d, bitMatrix.f21483d);
    }

    public final int hashCode() {
        int i11 = this.f21480a;
        return Arrays.hashCode(this.f21483d) + (((((((i11 * 31) + i11) * 31) + this.f21481b) * 31) + this.f21482c) * 31);
    }

    public final String toString() {
        int i11 = this.f21480a;
        int i12 = this.f21481b;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i12);
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sb2.append(a(i14, i13) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public BitMatrix(int i11, int i12, int i13, int[] iArr) {
        this.f21480a = i11;
        this.f21481b = i12;
        this.f21482c = i13;
        this.f21483d = iArr;
    }
}
