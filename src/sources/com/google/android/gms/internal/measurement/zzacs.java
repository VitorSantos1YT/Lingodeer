package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzacs extends zzacv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11215d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11217f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11220i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11216e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11218g = 0;

    public /* synthetic */ zzacs(byte[] bArr) {
        this.f11215d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int A() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int B() {
        return N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int C() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long D() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int E() {
        return zzacv.j(M());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long F() {
        return zzacv.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int G() {
        return N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long H() {
        long j11;
        long j12;
        long j13;
        int i11 = this.f11218g;
        int i12 = this.f11216e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f11215d;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f11218g = i13;
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
                this.f11218g = i14;
                return j11;
            }
        }
        return I();
    }

    public final long I() throws zzaeh {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f11218g;
            if (i12 == this.f11216e) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f11218g = i12 + 1;
            byte b3 = this.f11215d[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int J() throws zzaeh {
        int i11 = this.f11218g;
        if (this.f11216e - i11 < 4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11218g = i11 + 4;
        byte[] bArr = this.f11215d;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final long K() throws zzaeh {
        int i11 = this.f11218g;
        if (this.f11216e - i11 < 8) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11218g = i11 + 8;
        byte[] bArr = this.f11215d;
        long j11 = bArr[i11];
        long j12 = (((long) bArr[i11 + 1]) & 255) << 8;
        long j13 = bArr[i11 + 2];
        long j14 = bArr[i11 + 3];
        return ((((long) bArr[i11 + 6]) & 255) << 48) | (j11 & 255) | j12 | ((j13 & 255) << 16) | ((j14 & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public final byte[] L(int i11) throws zzaeh {
        if (i11 > 0) {
            int i12 = this.f11216e;
            int i13 = this.f11218g;
            if (i11 <= i12 - i13) {
                int i14 = i11 + i13;
                this.f11218g = i14;
                return Arrays.copyOfRange(this.f11215d, i13, i14);
            }
        }
        if (i11 > 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            return zzaed.f11274a;
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public abstract int M();

    public abstract int N();

    public final int O() {
        int i11;
        int i12 = this.f11218g;
        int i13 = this.f11216e;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f11215d;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f11218g = i14;
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
                this.f11218g = i15;
                return i11;
            }
        }
        return (int) I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int a(int i11) {
        if (i11 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = i11 + this.f11218g;
        if (i12 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.f11220i;
        if (i12 > i13) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11220i = i12;
        int i14 = this.f11216e + this.f11217f;
        this.f11216e = i14;
        if (i14 <= i12) {
            this.f11217f = 0;
            return i13;
        }
        int i15 = i14 - i12;
        this.f11217f = i15;
        this.f11216e = i14 - i15;
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void b(int i11) {
        this.f11220i = i11;
        int i12 = this.f11216e + this.f11217f;
        this.f11216e = i12;
        if (i12 <= i11) {
            this.f11217f = 0;
            return;
        }
        int i13 = i12 - i11;
        this.f11217f = i13;
        this.f11216e = i12 - i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int c() {
        int i11 = this.f11220i;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - this.f11218g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean d() {
        return this.f11218g == this.f11216e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int e() {
        return this.f11218g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int f(byte[] bArr, int i11, int i12) {
        if ((bArr.length - i11) - i12 < 0 || (i11 | i12) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, this.f11216e - this.f11218g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f11215d, this.f11218g, bArr, i11, iMin);
        this.f11218g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void g(int i11) throws zzaeh {
        if (i11 >= 0) {
            int i12 = this.f11216e;
            int i13 = this.f11218g;
            if (i11 <= i12 - i13) {
                this.f11218g = i13 + i11;
                return;
            }
        }
        if (i11 >= 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int l() throws zzaeh {
        if (d()) {
            this.f11219h = 0;
            return 0;
        }
        int iM = M();
        this.f11219h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void m(int i11) throws zzaeh {
        if (this.f11219h != i11) {
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
                g(M());
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
        int i14 = this.f11216e - this.f11218g;
        byte[] bArr = this.f11215d;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f11218g;
                this.f11218g = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
        }
        while (i13 < 10) {
            int i16 = this.f11218g;
            if (i16 == this.f11216e) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f11218g = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float p() {
        return Float.intBitsToFloat(J());
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
        return N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String w() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11216e;
            int i12 = this.f11218g;
            if (iM <= i11 - i12) {
                String str = new String(this.f11215d, i12, iM, StandardCharsets.UTF_8);
                this.f11218g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iM < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String x() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11216e;
            int i12 = this.f11218g;
            if (iM <= i11 - i12) {
                String strD = zzagl.d(this.f11215d, i12, iM);
                this.f11218g += iM;
                return strD;
            }
        }
        if (iM == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iM <= 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr y() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11216e;
            int i12 = this.f11218g;
            if (iM <= i11 - i12) {
                zzacr zzacrVarL = zzacr.l(this.f11215d, i12, iM);
                this.f11218g += iM;
                return zzacrVarL;
            }
        }
        if (iM == 0) {
            return zzacr.f11213b;
        }
        byte[] bArrL = L(iM);
        zzacr zzacrVar = zzacr.f11213b;
        return bArrL.length == 0 ? zzacr.f11213b : new zzacq(bArrL);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] z() {
        return L(M());
    }
}
