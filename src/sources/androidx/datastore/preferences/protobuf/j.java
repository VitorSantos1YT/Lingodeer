package androidx.datastore.preferences.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l {
    public int H;
    public int K = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1494f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1495t;

    public j(byte[] bArr, int i11, int i12, boolean z11) {
        this.f1491c = bArr;
        this.f1492d = i12 + i11;
        this.f1494f = i11;
        this.f1495t = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int A() throws InvalidProtocolBufferException {
        if (c()) {
            this.H = 0;
            return 0;
        }
        int iH = H();
        this.H = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int B() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long C() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean D(int i11) throws InvalidProtocolBufferException {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                L(8);
                return true;
            }
            if (i12 == 2) {
                L(H());
                return true;
            }
            if (i12 == 3) {
                E();
                a(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            L(4);
            return true;
        }
        int i14 = this.f1492d - this.f1494f;
        byte[] bArr = this.f1491c;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f1494f;
                this.f1494f = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i13 < 10) {
            int i16 = this.f1494f;
            if (i16 == this.f1492d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f1494f = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final int F() throws InvalidProtocolBufferException {
        int i11 = this.f1494f;
        if (this.f1492d - i11 < 4) {
            throw InvalidProtocolBufferException.e();
        }
        this.f1494f = i11 + 4;
        byte[] bArr = this.f1491c;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long G() throws InvalidProtocolBufferException {
        int i11 = this.f1494f;
        if (this.f1492d - i11 < 8) {
            throw InvalidProtocolBufferException.e();
        }
        this.f1494f = i11 + 8;
        byte[] bArr = this.f1491c;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final int H() {
        int i11;
        int i12 = this.f1494f;
        int i13 = this.f1492d;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f1491c;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f1494f = i14;
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
                this.f1494f = i15;
                return i11;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11 = this.f1494f;
        int i12 = this.f1492d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1491c;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f1494f = i13;
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
                                j13 = 266354560;
                            } else {
                                i18 = i11 + 6;
                                long j17 = j16 ^ (((long) bArr[i14]) << 35);
                                if (j17 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i11 + 7;
                                    j16 = j17 ^ (((long) bArr[i18]) << 42);
                                    if (j16 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i18 = i11 + 8;
                                        j17 = j16 ^ (((long) bArr[i14]) << 49);
                                        if (j17 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i11 + 9;
                                            long j18 = (j17 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                            if (j18 < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i14 = i21;
                                                }
                                            }
                                            j11 = j18;
                                        }
                                    }
                                }
                                j14 = j12 ^ j17;
                            }
                            j11 = j13 ^ j16;
                        }
                        i14 = i18;
                        j11 = j14;
                    }
                }
                this.f1494f = i14;
                return j11;
            }
        }
        return J();
    }

    public final long J() throws InvalidProtocolBufferException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f1494f;
            if (i12 == this.f1492d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f1494f = i12 + 1;
            byte b3 = this.f1491c[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void K() {
        int i11 = this.f1492d + this.f1493e;
        this.f1492d = i11;
        int i12 = i11 - this.f1495t;
        int i13 = this.K;
        if (i12 <= i13) {
            this.f1493e = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f1493e = i14;
        this.f1492d = i11 - i14;
    }

    public final void L(int i11) throws InvalidProtocolBufferException {
        if (i11 >= 0) {
            int i12 = this.f1492d;
            int i13 = this.f1494f;
            if (i11 <= i12 - i13) {
                this.f1494f = i13 + i11;
                return;
            }
        }
        if (i11 >= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void a(int i11) throws InvalidProtocolBufferException {
        if (this.H != i11) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int b() {
        return this.f1494f - this.f1495t;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean c() {
        return this.f1494f == this.f1492d;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void i(int i11) {
        this.K = i11;
        K();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int j(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iB = b() + i11;
        if (iB < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i12 = this.K;
        if (iB > i12) {
            throw InvalidProtocolBufferException.e();
        }
        this.K = iB;
        K();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean k() {
        return I() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.l
    public final h l() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iH = H();
        byte[] bArr = this.f1491c;
        if (iH > 0) {
            int i11 = this.f1492d;
            int i12 = this.f1494f;
            if (iH <= i11 - i12) {
                h hVarE = i.e(bArr, i12, iH);
                this.f1494f += iH;
                return hVarE;
            }
        }
        if (iH == 0) {
            return i.f1484b;
        }
        if (iH > 0) {
            int i13 = this.f1492d;
            int i14 = this.f1494f;
            if (iH <= i13 - i14) {
                int i15 = iH + i14;
                this.f1494f = i15;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i14, i15);
            } else {
                if (iH <= 0) {
                    throw InvalidProtocolBufferException.e();
                }
                if (iH == 0) {
                    throw InvalidProtocolBufferException.d();
                }
                bArrCopyOfRange = e0.f1464b;
            }
        } else {
            if (iH <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (iH == 0) {
                throw InvalidProtocolBufferException.d();
            }
            bArrCopyOfRange = e0.f1464b;
        }
        h hVar = i.f1484b;
        return new h(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final double n() {
        return Double.longBitsToDouble(G());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int o() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int p() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long q() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final float r() {
        return Float.intBitsToFloat(F());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int s() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long t() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int u() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long v() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int w() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long x() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String y() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i11 = this.f1492d;
            int i12 = this.f1494f;
            if (iH <= i11 - i12) {
                String str = new String(this.f1491c, i12, iH, e0.f1463a);
                this.f1494f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iH < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String z() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i11 = this.f1492d;
            int i12 = this.f1494f;
            if (iH <= i11 - i12) {
                String strR = t1.f1566a.r(this.f1491c, i12, iH);
                this.f1494f += iH;
                return strR;
            }
        }
        if (iH == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iH <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }
}
