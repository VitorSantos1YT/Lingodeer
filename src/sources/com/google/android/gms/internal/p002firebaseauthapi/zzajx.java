package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajx extends zzajq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteArrayInputStream f10090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f10091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10096l;
    public int m;

    public zzajx(ByteArrayInputStream byteArrayInputStream) {
        super(0);
        this.m = Integer.MAX_VALUE;
        byte[] bArr = zzakw.f10134a;
        this.f10090f = byteArrayInputStream;
        this.f10091g = new byte[4096];
        this.f10092h = 0;
        this.f10094j = 0;
        this.f10096l = 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean A() {
        return this.f10094j == this.f10092h && !K(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean B() {
        return F() != 0;
    }

    public final byte[] C(int i11) throws IOException {
        byte[] bArrL = L(i11);
        if (bArrL != null) {
            return bArrL;
        }
        int i12 = this.f10094j;
        int i13 = this.f10092h;
        int length = i13 - i12;
        this.f10096l += i13;
        this.f10094j = 0;
        this.f10092h = 0;
        ArrayList arrayListH = H(i11 - length);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f10091g, i12, bArr, 0, length);
        int size = arrayListH.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayListH.get(i14);
            i14++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final int D() {
        int i11;
        int i12 = this.f10094j;
        int i13 = this.f10092h;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f10091g;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f10094j = i14;
                return b3;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b3;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b11 = bArr[i19];
                            int i22 = (i21 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f10094j = i15;
                return i11;
            }
        }
        return (int) M();
    }

    public final long E() throws zzale {
        int i11 = this.f10094j;
        if (this.f10092h - i11 < 8) {
            I(8);
            i11 = this.f10094j;
        }
        this.f10094j = i11 + 8;
        byte[] bArr = this.f10091g;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final long F() {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11 = this.f10094j;
        int i12 = this.f10092h;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f10091g;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f10094j = i13;
                return b3;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b3;
                if (i15 < 0) {
                    j11 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j11 = i17 ^ 16256;
                        i14 = i16;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            j14 = (-2080896) ^ i19;
                        } else {
                            long j15 = i19;
                            i14 = i11 + 5;
                            long j16 = j15 ^ (((long) bArr[i18]) << 28);
                            if (j16 >= 0) {
                                j12 = 266354560;
                            } else {
                                i18 = i11 + 6;
                                long j17 = j16 ^ (((long) bArr[i14]) << 35);
                                if (j17 < 0) {
                                    j13 = -34093383808L;
                                } else {
                                    i14 = i11 + 7;
                                    j16 = j17 ^ (((long) bArr[i18]) << 42);
                                    if (j16 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i18 = i11 + 8;
                                        j17 = j16 ^ (((long) bArr[i14]) << 49);
                                        if (j17 < 0) {
                                            j13 = -558586000294016L;
                                        } else {
                                            i14 = i11 + 9;
                                            j16 = j17 ^ (((long) bArr[i18]) << 56);
                                            if (j16 >= 0) {
                                                j12 = 71499008037633920L;
                                            } else {
                                                int i21 = i11 + 10;
                                                long j18 = (((long) bArr[i14]) << 63) ^ j16;
                                                if (j18 >= 0) {
                                                    j11 = j18 ^ (-9151873028817141888L);
                                                    i14 = i21;
                                                }
                                            }
                                        }
                                    }
                                }
                                j14 = j13 ^ j17;
                            }
                            j11 = j12 ^ j16;
                        }
                        i14 = i18;
                        j11 = j14;
                    }
                }
                this.f10094j = i14;
                return j11;
            }
        }
        return M();
    }

    public final void G() {
        int i11 = this.f10092h + this.f10093i;
        this.f10092h = i11;
        int i12 = this.f10096l + i11;
        int i13 = this.m;
        if (i12 <= i13) {
            this.f10093i = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f10093i = i14;
        this.f10092h = i11 - i14;
    }

    public final ArrayList H(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                try {
                    int i13 = this.f10090f.read(bArr, i12, iMin - i12);
                    if (i13 == -1) {
                        throw zzale.g();
                    }
                    this.f10096l += i13;
                    i12 += i13;
                } catch (zzale e8) {
                    e8.f10145a = true;
                    throw e8;
                }
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void I(int i11) throws zzale {
        if (K(i11)) {
            return;
        }
        if (i11 <= (this.f10081d - this.f10096l) - this.f10094j) {
            throw zzale.g();
        }
        throw new zzale("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void J(int i11) throws zzale {
        ByteArrayInputStream byteArrayInputStream = this.f10090f;
        int i12 = this.f10092h;
        int i13 = this.f10094j;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f10094j = i13 + i11;
            return;
        }
        if (i11 < 0) {
            throw zzale.e();
        }
        int i15 = this.f10096l;
        int i16 = i15 + i13;
        int i17 = i16 + i11;
        int i18 = this.m;
        if (i17 > i18) {
            J((i18 - i15) - i13);
            throw zzale.g();
        }
        this.f10096l = i16;
        this.f10092h = 0;
        this.f10094j = 0;
        while (i14 < i11) {
            long j11 = i11 - i14;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j11);
                    if (jSkip >= 0 && jSkip <= j11) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i14 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (zzale e8) {
                    e8.f10145a = true;
                    throw e8;
                }
            } catch (Throwable th2) {
                this.f10096l += i14;
                G();
                throw th2;
            }
        }
        this.f10096l += i14;
        G();
        if (i14 >= i11) {
            return;
        }
        int i19 = this.f10092h;
        int i21 = i19 - this.f10094j;
        this.f10094j = i19;
        I(1);
        while (true) {
            int i22 = i11 - i21;
            int i23 = this.f10092h;
            if (i22 <= i23) {
                this.f10094j = i22;
                return;
            } else {
                i21 += i23;
                this.f10094j = i23;
                I(1);
            }
        }
    }

    public final boolean K(int i11) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f10090f;
        int i12 = this.f10094j;
        int i13 = i12 + i11;
        int i14 = this.f10092h;
        if (i13 <= i14) {
            throw new IllegalStateException(p0.h(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i15 = this.f10096l;
        int i16 = this.f10081d;
        if (i11 <= (i16 - i15) - i12 && i15 + i12 + i11 <= this.m) {
            byte[] bArr = this.f10091g;
            if (i12 > 0) {
                if (i14 > i12) {
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.f10096l += i12;
                this.f10092h -= i12;
                this.f10094j = 0;
            }
            int i17 = this.f10092h;
            try {
                int i18 = byteArrayInputStream.read(bArr, i17, Math.min(bArr.length - i17, (i16 - this.f10096l) - i17));
                if (i18 == 0 || i18 < -1 || i18 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#read(byte[]) returned invalid result: " + i18 + "\nThe InputStream implementation is buggy.");
                }
                if (i18 > 0) {
                    this.f10092h += i18;
                    G();
                    if (this.f10092h >= i11 || K(i11)) {
                        return true;
                    }
                }
            } catch (zzale e8) {
                e8.f10145a = true;
                throw e8;
            }
        }
        return false;
    }

    public final byte[] L(int i11) throws IOException {
        if (i11 == 0) {
            return zzakw.f10134a;
        }
        if (i11 < 0) {
            throw zzale.e();
        }
        int i12 = this.f10096l;
        int i13 = this.f10094j;
        int i14 = i12 + i13 + i11;
        if (i14 - this.f10081d > 0) {
            throw new zzale("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i15 = this.m;
        if (i14 > i15) {
            J((i15 - i12) - i13);
            throw zzale.g();
        }
        int i16 = this.f10092h - i13;
        int i17 = i11 - i16;
        ByteArrayInputStream byteArrayInputStream = this.f10090f;
        if (i17 >= 4096) {
            try {
                if (i17 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (zzale e8) {
                e8.f10145a = true;
                throw e8;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f10091g, this.f10094j, bArr, 0, i16);
        this.f10096l += this.f10092h;
        this.f10094j = 0;
        this.f10092h = 0;
        while (i16 < i11) {
            try {
                int i18 = byteArrayInputStream.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    throw zzale.g();
                }
                this.f10096l += i18;
                i16 += i18;
            } catch (zzale e10) {
                e10.f10145a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final long M() throws zzale {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f10094j == this.f10092h) {
                I(1);
            }
            int i12 = this.f10094j;
            this.f10094j = i12 + 1;
            byte b3 = this.f10091g[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw zzale.d();
    }

    public final int N() throws zzale {
        int i11 = this.f10094j;
        if (this.f10092h - i11 < 4) {
            I(4);
            i11 = this.f10094j;
        }
        this.f10094j = i11 + 4;
        byte[] bArr = this.f10091g;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final double a() {
        return Double.longBitsToDouble(E());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final float e() {
        return Float.intBitsToFloat(N());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int f(int i11) throws zzale {
        if (i11 < 0) {
            throw zzale.e();
        }
        int i12 = this.f10096l + this.f10094j + i11;
        if (i12 < 0) {
            throw new zzale("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.m;
        if (i12 > i13) {
            throw zzale.g();
        }
        this.m = i12;
        G();
        return i13;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int g() {
        return this.f10096l + this.f10094j;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final void h(int i11) throws zzale {
        if (this.f10095k != i11) {
            throw new zzale("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int i() {
        return D();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final void j(int i11) {
        this.m = i11;
        G();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int k() {
        return N();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean l(int i11) throws zzale {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                J(8);
                return true;
            }
            if (i12 == 2) {
                J(D());
                return true;
            }
            if (i12 == 3) {
                z();
                h(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                if (this.f10079b == 0) {
                    h(0);
                }
                return false;
            }
            if (i12 != 5) {
                throw zzale.a();
            }
            J(4);
            return true;
        }
        int i14 = this.f10092h - this.f10094j;
        byte[] bArr = this.f10091g;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f10094j;
                this.f10094j = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw zzale.d();
        }
        while (i13 < 10) {
            if (this.f10094j == this.f10092h) {
                I(1);
            }
            int i16 = this.f10094j;
            this.f10094j = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw zzale.d();
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int m() {
        return D();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int n() {
        return N();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int o() {
        return zzajq.b(D());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int p() throws zzale {
        if (A()) {
            this.f10095k = 0;
            return 0;
        }
        int iD = D();
        this.f10095k = iD;
        if ((iD >>> 3) != 0) {
            return iD;
        }
        throw zzale.b();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int q() {
        return D();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long r() {
        return E();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long s() {
        return F();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long t() {
        return E();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long u() {
        return zzajq.c(F());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long v() {
        return F();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final zzaje w() throws IOException {
        int iD = D();
        int i11 = this.f10092h;
        int i12 = this.f10094j;
        int i13 = i11 - i12;
        byte[] bArr = this.f10091g;
        if (iD <= i13 && iD > 0) {
            zzaje zzajeVarM = zzaje.m(bArr, i12, iD);
            this.f10094j += iD;
            return zzajeVarM;
        }
        if (iD == 0) {
            return zzaje.f10066b;
        }
        if (iD < 0) {
            throw zzale.e();
        }
        byte[] bArrL = L(iD);
        if (bArrL != null) {
            return zzaje.m(bArrL, 0, bArrL.length);
        }
        int i14 = this.f10094j;
        int i15 = this.f10092h;
        int length = i15 - i14;
        this.f10096l += i15;
        this.f10094j = 0;
        this.f10092h = 0;
        ArrayList arrayListH = H(iD - length);
        byte[] bArr2 = new byte[iD];
        System.arraycopy(bArr, i14, bArr2, 0, length);
        int size = arrayListH.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayListH.get(i16);
            i16++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        try {
            zzaje zzajeVar = zzaje.f10066b;
            return iD == 0 ? zzaje.f10066b : new zzajp(bArr2);
        } catch (zzale e8) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final String x() throws zzale {
        int iD = D();
        byte[] bArr = this.f10091g;
        if (iD > 0) {
            int i11 = this.f10092h;
            int i12 = this.f10094j;
            if (iD <= i11 - i12) {
                String str = new String(bArr, i12, iD, StandardCharsets.UTF_8);
                this.f10094j += iD;
                return str;
            }
        }
        if (iD == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iD < 0) {
            throw zzale.e();
        }
        if (iD > this.f10092h) {
            return new String(C(iD), StandardCharsets.UTF_8);
        }
        I(iD);
        String str2 = new String(bArr, this.f10094j, iD, StandardCharsets.UTF_8);
        this.f10094j += iD;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final String y() throws IOException {
        int iD = D();
        int i11 = this.f10094j;
        int i12 = this.f10092h;
        int i13 = i12 - i11;
        byte[] bArrC = this.f10091g;
        if (iD <= i13 && iD > 0) {
            this.f10094j = i11 + iD;
        } else {
            if (iD == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iD < 0) {
                throw zzale.e();
            }
            i11 = 0;
            if (iD <= i12) {
                I(iD);
                this.f10094j = iD;
            } else {
                bArrC = C(iD);
            }
        }
        return zzanl.c(bArrC, i11, iD);
    }
}
