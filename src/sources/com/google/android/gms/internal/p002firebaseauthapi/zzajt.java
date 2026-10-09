package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzajt extends zzajq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f10083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10089l;

    public zzajt(byte[] bArr, int i11, int i12) {
        super(0);
        this.f10089l = Integer.MAX_VALUE;
        this.f10083f = bArr;
        this.f10084g = i12 + i11;
        this.f10086i = i11;
        this.f10087j = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean A() {
        return this.f10086i == this.f10084g;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean B() {
        return G() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[PHI: r3
      0x0069: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v12 int) binds: [B:15:0x003f, B:19:0x004b, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public final int C() throws zzale {
        try {
            int i11 = this.f10086i;
            byte[] bArr = this.f10083f;
            int i12 = i11 + 1;
            int i13 = bArr[i11];
            if (i13 < 0) {
                int i14 = i11 + 2;
                int i15 = (bArr[i12] << 7) ^ i13;
                if (i15 < 0) {
                    i13 = (i15 == true ? 1 : 0) ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (i15 == true ? 1 : 0) ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        int i18 = i17 ^ 16256;
                        i12 = i16;
                        i13 = i18;
                    } else {
                        i14 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i13 = i19 ^ (-2080896);
                        } else {
                            int i21 = i11 + 5;
                            int i22 = bArr[i14];
                            int i23 = (i19 ^ (i22 << 28)) ^ 266354560;
                            if (i22 < 0) {
                                i14 = i11 + 6;
                                if (bArr[i21] < 0) {
                                    i21 = i11 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i11 + 8;
                                        if (bArr[i21] < 0) {
                                            i21 = i11 + 9;
                                            if (bArr[i14] < 0) {
                                                int i24 = i11 + 10;
                                                if (bArr[i21] < 0) {
                                                    throw zzale.d();
                                                }
                                                i13 = i23;
                                                i12 = i24;
                                            } else {
                                                int i25 = i21;
                                                i13 = i23;
                                                i12 = i25;
                                            }
                                        }
                                    } else {
                                        int i26 = i21;
                                        i13 = i23;
                                        i12 = i26;
                                    }
                                }
                                i13 = i23;
                            } else {
                                int i27 = i21;
                                i13 = i23;
                                i12 = i27;
                            }
                        }
                    }
                }
                i12 = i14;
            }
            this.f10086i = i12;
            if (i12 <= this.f10084g) {
                return i13;
            }
            throw zzale.g();
        } catch (zzale e8) {
            if (this.f10086i > this.f10084g) {
                throw zzale.g();
            }
            throw e8;
        } catch (IndexOutOfBoundsException unused) {
            throw zzale.g();
        }
    }

    public final int D() {
        int i11;
        int i12 = this.f10086i;
        int i13 = this.f10084g;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f10083f;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f10086i = i14;
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
                this.f10086i = i15;
                return i11;
            }
        }
        return (int) J();
    }

    public final int E() throws zzale {
        int i11 = this.f10086i;
        if (this.f10084g - i11 < 4) {
            throw zzale.g();
        }
        this.f10086i = i11 + 4;
        byte[] bArr = this.f10083f;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long F() throws zzale {
        int i11 = this.f10086i;
        if (this.f10084g - i11 < 8) {
            throw zzale.g();
        }
        this.f10086i = i11 + 8;
        byte[] bArr = this.f10083f;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final long G() {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11 = this.f10086i;
        int i12 = this.f10084g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f10083f;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f10086i = i13;
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
                this.f10086i = i14;
                return j11;
            }
        }
        return J();
    }

    public final void H() {
        int i11 = this.f10084g + this.f10085h;
        this.f10084g = i11;
        int i12 = i11 - this.f10087j;
        int i13 = this.f10089l;
        if (i12 <= i13) {
            this.f10085h = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f10085h = i14;
        this.f10084g = i11 - i14;
    }

    public final void I(int i11) throws zzale {
        if (i11 >= 0) {
            int i12 = this.f10084g;
            int i13 = this.f10086i;
            if (i11 <= i12 - i13) {
                this.f10086i = i13 + i11;
                return;
            }
        }
        if (i11 >= 0) {
            throw zzale.g();
        }
        throw zzale.e();
    }

    public final long J() throws zzale {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f10086i;
            if (i12 == this.f10084g) {
                throw zzale.g();
            }
            this.f10086i = i12 + 1;
            byte b3 = this.f10083f[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw zzale.d();
    }

    public abstract int K();

    public abstract int L();

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final double a() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final float e() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int f(int i11) {
        if (i11 < 0) {
            throw zzale.e();
        }
        int iG = i11 + g();
        if (iG < 0) {
            throw new zzale("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f10089l;
        if (iG > i12) {
            throw zzale.g();
        }
        this.f10089l = iG;
        H();
        return i12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int g() {
        return this.f10086i - this.f10087j;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final void h(int i11) throws zzale {
        if (this.f10088k != i11) {
            throw new zzale("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int i() {
        return K();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final void j(int i11) {
        this.f10089l = i11;
        H();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int k() {
        return E();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final boolean l(int i11) throws zzale {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                I(8);
                return true;
            }
            if (i12 == 2) {
                I(L());
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
            I(4);
            return true;
        }
        int i14 = this.f10084g - this.f10086i;
        byte[] bArr = this.f10083f;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f10086i;
                this.f10086i = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw zzale.d();
        }
        while (i13 < 10) {
            int i16 = this.f10086i;
            if (i16 == this.f10084g) {
                throw zzale.g();
            }
            this.f10086i = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw zzale.d();
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int m() {
        return K();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int n() {
        return E();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int o() {
        return zzajq.b(L());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int p() throws zzale {
        if (A()) {
            this.f10088k = 0;
            return 0;
        }
        int iL = L();
        this.f10088k = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw zzale.b();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final int q() {
        return L();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long r() {
        return F();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long s() {
        return G();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long t() {
        return F();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long u() {
        return zzajq.c(G());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final long v() {
        return G();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final zzaje w() throws zzale {
        byte[] bArrCopyOfRange;
        int iL = L();
        byte[] bArr = this.f10083f;
        if (iL > 0) {
            int i11 = this.f10084g;
            int i12 = this.f10086i;
            if (iL <= i11 - i12) {
                zzaje zzajeVarM = zzaje.m(bArr, i12, iL);
                this.f10086i += iL;
                return zzajeVarM;
            }
        }
        if (iL == 0) {
            return zzaje.f10066b;
        }
        if (iL > 0) {
            int i13 = this.f10084g;
            int i14 = this.f10086i;
            if (iL <= i13 - i14) {
                int i15 = iL + i14;
                this.f10086i = i15;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i14, i15);
            } else {
                if (iL <= 0) {
                    throw zzale.g();
                }
                if (iL == 0) {
                    throw zzale.e();
                }
                bArrCopyOfRange = zzakw.f10134a;
            }
        } else {
            if (iL <= 0) {
                throw zzale.g();
            }
            if (iL == 0) {
                throw zzale.e();
            }
            bArrCopyOfRange = zzakw.f10134a;
        }
        zzaje zzajeVar = zzaje.f10066b;
        return bArrCopyOfRange.length == 0 ? zzaje.f10066b : new zzajp(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final String x() throws zzale {
        int iL = L();
        if (iL > 0) {
            int i11 = this.f10084g;
            int i12 = this.f10086i;
            if (iL <= i11 - i12) {
                String str = new String(this.f10083f, i12, iL, StandardCharsets.UTF_8);
                this.f10086i += iL;
                return str;
            }
        }
        if (iL == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iL < 0) {
            throw zzale.e();
        }
        throw zzale.g();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajq
    public final String y() throws zzale {
        int iL = L();
        if (iL > 0) {
            int i11 = this.f10084g;
            int i12 = this.f10086i;
            if (iL <= i11 - i12) {
                String strC = zzanl.c(this.f10083f, i12, iL);
                this.f10086i += iL;
                return strC;
            }
        }
        if (iL == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iL <= 0) {
            throw zzale.e();
        }
        throw zzale.g();
    }
}
