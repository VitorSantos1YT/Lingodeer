package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacu extends zzacv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f11221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f11222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11228k = Integer.MAX_VALUE;

    public /* synthetic */ zzacu(InputStream inputStream, int i11) {
        this.f11221d = inputStream;
        this.f11222e = new byte[i11 < 8 ? 8 : i11];
        this.f11223f = 0;
        this.f11225h = 0;
        this.f11227j = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int A() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int B() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int C() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long D() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int E() {
        return zzacv.j(G());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long F() {
        return zzacv.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int G() {
        int i11;
        int i12 = this.f11225h;
        int i13 = this.f11223f;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f11222e;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f11225h = i14;
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
                this.f11225h = i15;
                return i11;
            }
        }
        return (int) O();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long H() {
        long j11;
        long j12;
        long j13;
        int i11 = this.f11225h;
        int i12 = this.f11223f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f11222e;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f11225h = i13;
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
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j14 = (-2080896) ^ i19;
                            i14 = i18;
                            j11 = j14;
                        } else {
                            i16 = i11 + 5;
                            long j15 = ((long) i19) ^ (((long) bArr[i18]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i21 = i11 + 6;
                                long j16 = j15 ^ (((long) bArr[i16]) << 35);
                                if (j16 < 0) {
                                    j13 = -34093383808L;
                                } else {
                                    i16 = i11 + 7;
                                    j15 = j16 ^ (((long) bArr[i21]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i21 = i11 + 8;
                                        j16 = j15 ^ (((long) bArr[i16]) << 49);
                                        if (j16 < 0) {
                                            j13 = -558586000294016L;
                                        } else {
                                            i16 = i11 + 9;
                                            j15 = j16 ^ (((long) bArr[i21]) << 56);
                                            if (j15 >= 0) {
                                                j12 = 71499008037633920L;
                                            } else {
                                                int i22 = i11 + 10;
                                                long j17 = j15 ^ (((long) bArr[i16]) << 63);
                                                if (j17 >= 0) {
                                                    j11 = j17 ^ (-9151873028817141888L);
                                                    i14 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j16 ^ j13;
                                i14 = i21;
                            }
                            j11 = j15 ^ j12;
                        }
                    }
                    i14 = i16;
                }
                this.f11225h = i14;
                return j11;
            }
        }
        return O();
    }

    public final void I() {
        int i11 = this.f11223f + this.f11224g;
        this.f11223f = i11;
        int i12 = this.f11227j + i11;
        int i13 = this.f11228k;
        if (i12 <= i13) {
            this.f11224g = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f11224g = i14;
        this.f11223f = i11 - i14;
    }

    public final void J(int i11) throws zzaeh {
        if (K(i11)) {
            return;
        }
        if (i11 <= (Integer.MAX_VALUE - this.f11227j) - this.f11225h) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean K(int i11) throws IOException {
        InputStream inputStream = this.f11221d;
        int i12 = this.f11225h;
        int i13 = i12 + i11;
        int i14 = this.f11223f;
        if (i13 <= i14) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i15 = this.f11227j;
        if (i11 > (Integer.MAX_VALUE - i15) - i12 || i15 + i12 + i11 > this.f11228k) {
            return false;
        }
        byte[] bArr = this.f11222e;
        if (i12 > 0) {
            if (i14 > i12) {
                System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
            }
            i15 = this.f11227j + i12;
            this.f11227j = i15;
            i14 = this.f11223f - i12;
            this.f11223f = i14;
            this.f11225h = 0;
        }
        try {
            int i16 = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - i15) - i14));
            if (i16 != 0 && i16 >= -1 && i16 <= bArr.length) {
                if (i16 <= 0) {
                    return false;
                }
                this.f11223f += i16;
                I();
                return this.f11223f >= i11 || K(i11);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb3 = new StringBuilder(String.valueOf(i16).length() + strValueOf.length() + 39 + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i16);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzaeh e8) {
            e8.f11277a = true;
            throw e8;
        }
    }

    public final byte[] L(int i11) throws IOException {
        byte[] bArrM = M(i11);
        if (bArrM != null) {
            return bArrM;
        }
        int i12 = this.f11225h;
        int i13 = this.f11223f;
        int i14 = i13 - i12;
        this.f11227j += i13;
        this.f11225h = 0;
        this.f11223f = 0;
        ArrayList arrayListN = N(i11 - i14);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f11222e, i12, bArr, 0, i14);
        int size = arrayListN.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayListN.get(i15);
            i15++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return bArr;
    }

    public final byte[] M(int i11) throws IOException {
        if (i11 == 0) {
            return zzaed.f11274a;
        }
        int i12 = this.f11227j;
        int i13 = this.f11225h;
        int i14 = i12 + i13 + i11;
        if ((-2147483647) + i14 > 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i15 = this.f11228k;
        if (i14 > i15) {
            g((i15 - i12) - i13);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i16 = this.f11223f - i13;
        int i17 = i11 - i16;
        InputStream inputStream = this.f11221d;
        if (i17 >= 4096) {
            try {
                if (i17 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e8) {
                e8.f11277a = true;
                throw e8;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f11222e, this.f11225h, bArr, 0, i16);
        this.f11227j += this.f11223f;
        this.f11225h = 0;
        this.f11223f = 0;
        while (i16 < i11) {
            try {
                int i18 = inputStream.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f11227j += i18;
                i16 += i18;
            } catch (zzaeh e10) {
                e10.f11277a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList N(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                try {
                    int i13 = this.f11221d.read(bArr, i12, iMin - i12);
                    if (i13 == -1) {
                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f11227j += i13;
                    i12 += i13;
                } catch (zzaeh e8) {
                    e8.f11277a = true;
                    throw e8;
                }
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() throws zzaeh {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f11225h == this.f11223f) {
                J(1);
            }
            int i12 = this.f11225h;
            this.f11225h = i12 + 1;
            byte b3 = this.f11222e[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int P() throws zzaeh {
        int i11 = this.f11225h;
        if (this.f11223f - i11 < 4) {
            J(4);
            i11 = this.f11225h;
        }
        this.f11225h = i11 + 4;
        byte[] bArr = this.f11222e;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final long Q() throws zzaeh {
        int i11 = this.f11225h;
        if (this.f11223f - i11 < 8) {
            J(8);
            i11 = this.f11225h;
        }
        this.f11225h = i11 + 8;
        byte[] bArr = this.f11222e;
        long j11 = bArr[i11];
        long j12 = (((long) bArr[i11 + 1]) & 255) << 8;
        long j13 = bArr[i11 + 2];
        long j14 = bArr[i11 + 3];
        return ((((long) bArr[i11 + 6]) & 255) << 48) | (j11 & 255) | j12 | ((j13 & 255) << 16) | ((j14 & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int a(int i11) throws zzaeh {
        if (i11 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.f11227j + this.f11225h + i11;
        if (i12 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.f11228k;
        if (i12 > i13) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11228k = i12;
        I();
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void b(int i11) {
        this.f11228k = i11;
        I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int c() {
        int i11 = this.f11228k;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f11227j + this.f11225h);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean d() {
        return this.f11225h == this.f11223f && !K(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int e() {
        return this.f11227j + this.f11225h;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int f(byte[] bArr, int i11, int i12) throws IOException {
        if ((bArr.length - i11) - i12 < 0 || (i11 | i12) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f11223f;
        int i14 = this.f11225h;
        int i15 = i13 - i14;
        if (i15 > 0) {
            int iMin = Math.min(i12, i15);
            System.arraycopy(this.f11222e, this.f11225h, bArr, i11, iMin);
            this.f11225h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i12, (this.f11228k - this.f11227j) - i14);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i16 = this.f11221d.read(bArr, i11, iMin2);
            if (i16 != -1) {
                this.f11227j += i16;
            }
            return i16;
        } catch (zzaeh e8) {
            e8.f11277a = true;
            throw e8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void g(int i11) throws zzaeh {
        InputStream inputStream = this.f11221d;
        int i12 = this.f11223f;
        int i13 = this.f11225h;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f11225h = i13 + i11;
            return;
        }
        if (i11 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i15 = this.f11227j;
        int i16 = i15 + i13;
        int i17 = this.f11228k;
        if (i16 + i11 > i17) {
            g((i17 - i15) - i13);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11227j = i16;
        this.f11223f = 0;
        this.f11225h = 0;
        while (i14 < i11) {
            long j11 = i11 - i14;
            try {
                try {
                    long jSkip = inputStream.skip(j11);
                    if (jSkip < 0 || jSkip > j11) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (zzaeh e8) {
                    e8.f11277a = true;
                    throw e8;
                }
            } catch (Throwable th2) {
                this.f11227j += i14;
                I();
                throw th2;
            }
        }
        this.f11227j += i14;
        I();
        if (i14 >= i11) {
            return;
        }
        int i18 = this.f11223f;
        int i19 = i18 - this.f11225h;
        this.f11225h = i18;
        J(1);
        while (true) {
            int i21 = i11 - i19;
            int i22 = this.f11223f;
            if (i21 <= i22) {
                this.f11225h = i21;
                return;
            } else {
                i19 += i22;
                this.f11225h = i22;
                J(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int l() throws zzaeh {
        if (d()) {
            this.f11226i = 0;
            return 0;
        }
        int iG = G();
        this.f11226i = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void m(int i11) throws zzaeh {
        if (this.f11226i != i11) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean n(int i11) throws zzaeh {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                g(8);
                return true;
            }
            if (i12 == 2) {
                g(G());
                return true;
            }
            if (i12 == 3) {
                i();
                m(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                if (this.f11230b == 0) {
                    m(0);
                }
                return false;
            }
            if (i12 != 5) {
                throw new zzaeg();
            }
            g(4);
            return true;
        }
        int i14 = this.f11223f - this.f11225h;
        byte[] bArr = this.f11222e;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f11225h;
                this.f11225h = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
        }
        while (i13 < 10) {
            if (this.f11225h == this.f11223f) {
                J(1);
            }
            int i16 = this.f11225h;
            this.f11225h = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double o() {
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float p() {
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long r() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int u() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String w() throws zzaeh {
        int iG = G();
        byte[] bArr = this.f11222e;
        if (iG > 0) {
            int i11 = this.f11223f;
            int i12 = this.f11225h;
            if (iG <= i11 - i12) {
                String str = new String(bArr, i12, iG, StandardCharsets.UTF_8);
                this.f11225h += iG;
                return str;
            }
        }
        if (iG == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iG < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iG > this.f11223f) {
            return new String(L(iG), StandardCharsets.UTF_8);
        }
        J(iG);
        String str2 = new String(bArr, this.f11225h, iG, StandardCharsets.UTF_8);
        this.f11225h += iG;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String x() throws IOException {
        int iG = G();
        int i11 = this.f11225h;
        int i12 = this.f11223f;
        int i13 = i12 - i11;
        byte[] bArrL = this.f11222e;
        if (iG <= i13 && iG > 0) {
            this.f11225h = i11 + iG;
        } else {
            if (iG == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iG < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i11 = 0;
            if (iG <= i12) {
                J(iG);
                this.f11225h = iG;
            } else {
                bArrL = L(iG);
            }
        }
        return zzagl.d(bArrL, i11, iG);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr y() throws IOException {
        int iG = G();
        int i11 = this.f11223f;
        int i12 = this.f11225h;
        int i13 = i11 - i12;
        byte[] bArr = this.f11222e;
        if (iG <= i13 && iG > 0) {
            zzacr zzacrVarL = zzacr.l(bArr, i12, iG);
            this.f11225h += iG;
            return zzacrVarL;
        }
        if (iG == 0) {
            return zzacr.f11213b;
        }
        if (iG < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrM = M(iG);
        if (bArrM != null) {
            return zzacr.l(bArrM, 0, bArrM.length);
        }
        int i14 = this.f11225h;
        int i15 = this.f11223f;
        int i16 = i15 - i14;
        this.f11227j += i15;
        this.f11225h = 0;
        this.f11223f = 0;
        ArrayList arrayListN = N(iG - i16);
        byte[] bArr2 = new byte[iG];
        System.arraycopy(bArr, i14, bArr2, 0, i16);
        int size = arrayListN.size();
        int i17 = 0;
        while (i17 < size) {
            Object obj = arrayListN.get(i17);
            i17++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i16, length);
            i16 += length;
        }
        try {
            zzacr zzacrVar = zzacr.f11213b;
            return iG == 0 ? zzacr.f11213b : new zzacq(bArr2);
        } catch (zzaeh e8) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] z() throws zzaeh {
        int iG = G();
        int i11 = this.f11223f;
        int i12 = this.f11225h;
        if (iG > i11 - i12 || iG <= 0) {
            if (iG >= 0) {
                return L(iG);
            }
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f11222e, i12, i12 + iG);
        this.f11225h += iG;
        return bArrCopyOfRange;
    }
}
