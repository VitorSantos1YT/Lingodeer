package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f9680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f9685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9686h;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzcd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c11 = cArr[i11];
            if (!(c11 < 128)) {
                throw new IllegalArgumentException(zzaq.a("Non-ASCII character: %s", Character.valueOf(c11)));
            }
            if (!(bArr[c11] == -1)) {
                throw new IllegalArgumentException(zzaq.a("Duplicate character: %s", Character.valueOf(c11)));
            }
            bArr[c11] = (byte) i11;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcd)) {
            return false;
        }
        zzcd zzcdVar = (zzcd) obj;
        return this.f9686h == zzcdVar.f9686h && Arrays.equals(this.f9680b, zzcdVar.f9680b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9680b) + (true != this.f9686h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f9679a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public zzcd(String str, char[] cArr, byte[] bArr, boolean z11) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i11;
        this.f9679a = str;
        cArr.getClass();
        this.f9680b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (zzci.f9692a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f9682d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i12 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f9683e = i12;
                        this.f9684f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f9681c = length - 1;
                        this.f9685g = bArr;
                        zArr = new boolean[i12];
                        for (i11 = 0; i11 < this.f9684f; i11++) {
                            int i13 = this.f9682d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[zzcj.a(i11 * 8, i13)] = true;
                        }
                        this.f9686h = z11;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f9682d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i14 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f9683e = i14;
                        this.f9684f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f9681c = length - 1;
                        this.f9685g = bArr;
                        zArr = new boolean[i14];
                        while (i11 < this.f9684f) {
                            int i15 = this.f9682d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[zzcj.a(i11 * 8, i15)] = true;
                        }
                        this.f9686h = z11;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f9682d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i16 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f9683e = i16;
                        this.f9684f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f9681c = length - 1;
                        this.f9685g = bArr;
                        zArr = new boolean[i16];
                        while (i11 < this.f9684f) {
                            int i17 = this.f9682d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[zzcj.a(i11 * 8, i17)] = true;
                        }
                        this.f9686h = z11;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e8) {
            throw new IllegalArgumentException(p.j(cArr.length, "Illegal alphabet length "), e8);
        }
    }
}
