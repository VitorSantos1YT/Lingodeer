package androidx.datastore.preferences.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    public int H;
    public int K;
    public int L = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f1497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1500f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1501t;

    public k(FileInputStream fileInputStream) {
        Charset charset = e0.f1463a;
        this.f1497c = fileInputStream;
        this.f1498d = new byte[4096];
        this.f1499e = 0;
        this.f1501t = 0;
        this.K = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int A() throws InvalidProtocolBufferException {
        if (c()) {
            this.H = 0;
            return 0;
        }
        int iK = K();
        this.H = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int B() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long C() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean D(int i11) throws InvalidProtocolBufferException {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                P(8);
                return true;
            }
            if (i12 == 2) {
                P(K());
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
            P(4);
            return true;
        }
        int i14 = this.f1499e - this.f1501t;
        byte[] bArr = this.f1498d;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f1501t;
                this.f1501t = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i13 < 10) {
            if (this.f1501t == this.f1499e) {
                O(1);
            }
            int i16 = this.f1501t;
            this.f1501t = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final byte[] F(int i11) throws IOException {
        byte[] bArrG = G(i11);
        if (bArrG != null) {
            return bArrG;
        }
        int i12 = this.f1501t;
        int i13 = this.f1499e;
        int length = i13 - i12;
        this.K += i13;
        this.f1501t = 0;
        this.f1499e = 0;
        ArrayList arrayListH = H(i11 - length);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f1498d, i12, bArr, 0, length);
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

    public final byte[] G(int i11) throws IOException {
        if (i11 == 0) {
            return e0.f1464b;
        }
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i12 = this.K;
        int i13 = this.f1501t;
        int i14 = i12 + i13 + i11;
        if (i14 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i15 = this.L;
        if (i14 > i15) {
            P((i15 - i12) - i13);
            throw InvalidProtocolBufferException.e();
        }
        int i16 = this.f1499e - i13;
        int i17 = i11 - i16;
        FileInputStream fileInputStream = this.f1497c;
        if (i17 >= 4096) {
            try {
                if (i17 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e8) {
                e8.f1444a = true;
                throw e8;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f1498d, this.f1501t, bArr, 0, i16);
        this.K += this.f1499e;
        this.f1501t = 0;
        this.f1499e = 0;
        while (i16 < i11) {
            try {
                int i18 = fileInputStream.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.K += i18;
                i16 += i18;
            } catch (InvalidProtocolBufferException e10) {
                e10.f1444a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                int i13 = this.f1497c.read(bArr, i12, iMin - i12);
                if (i13 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.K += i13;
                i12 += i13;
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws InvalidProtocolBufferException {
        int i11 = this.f1501t;
        if (this.f1499e - i11 < 4) {
            O(4);
            i11 = this.f1501t;
        }
        this.f1501t = i11 + 4;
        byte[] bArr = this.f1498d;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long J() throws InvalidProtocolBufferException {
        int i11 = this.f1501t;
        if (this.f1499e - i11 < 8) {
            O(8);
            i11 = this.f1501t;
        }
        this.f1501t = i11 + 8;
        byte[] bArr = this.f1498d;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final int K() {
        int i11;
        int i12 = this.f1501t;
        int i13 = this.f1499e;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f1498d;
            byte b3 = bArr[i12];
            if (b3 >= 0) {
                this.f1501t = i14;
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
                this.f1501t = i15;
                return i11;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11 = this.f1501t;
        int i12 = this.f1499e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1498d;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f1501t = i13;
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
                this.f1501t = i14;
                return j11;
            }
        }
        return M();
    }

    public final long M() throws InvalidProtocolBufferException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f1501t == this.f1499e) {
                O(1);
            }
            int i12 = this.f1501t;
            this.f1501t = i12 + 1;
            byte b3 = this.f1498d[i12];
            j11 |= ((long) (b3 & 127)) << i11;
            if ((b3 & 128) == 0) {
                return j11;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void N() {
        int i11 = this.f1499e + this.f1500f;
        this.f1499e = i11;
        int i12 = this.K + i11;
        int i13 = this.L;
        if (i12 <= i13) {
            this.f1500f = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f1500f = i14;
        this.f1499e = i11 - i14;
    }

    public final void O(int i11) throws InvalidProtocolBufferException {
        if (Q(i11)) {
            return;
        }
        if (i11 <= (Integer.MAX_VALUE - this.K) - this.f1501t) {
            throw InvalidProtocolBufferException.e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i11) throws InvalidProtocolBufferException {
        int i12 = this.f1499e;
        int i13 = this.f1501t;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f1501t = i13 + i11;
            return;
        }
        FileInputStream fileInputStream = this.f1497c;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i15 = this.K;
        int i16 = i15 + i13;
        int i17 = i16 + i11;
        int i18 = this.L;
        if (i17 > i18) {
            P((i18 - i15) - i13);
            throw InvalidProtocolBufferException.e();
        }
        this.K = i16;
        this.f1499e = 0;
        this.f1501t = 0;
        while (i14 < i11) {
            long j11 = i11 - i14;
            try {
                try {
                    long jSkip = fileInputStream.skip(j11);
                    if (jSkip < 0 || jSkip > j11) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e8) {
                    e8.f1444a = true;
                    throw e8;
                }
            } catch (Throwable th2) {
                this.K += i14;
                N();
                throw th2;
            }
        }
        this.K += i14;
        N();
        if (i14 >= i11) {
            return;
        }
        int i19 = this.f1499e;
        int i21 = i19 - this.f1501t;
        this.f1501t = i19;
        O(1);
        while (true) {
            int i22 = i11 - i21;
            int i23 = this.f1499e;
            if (i22 <= i23) {
                this.f1501t = i22;
                return;
            } else {
                i21 += i23;
                this.f1501t = i23;
                O(1);
            }
        }
    }

    public final boolean Q(int i11) throws IOException {
        FileInputStream fileInputStream = this.f1497c;
        int i12 = this.f1501t;
        int i13 = i12 + i11;
        int i14 = this.f1499e;
        if (i13 <= i14) {
            throw new IllegalStateException(hh.p0.h(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i15 = this.K;
        if (i11 <= (Integer.MAX_VALUE - i15) - i12 && i15 + i12 + i11 <= this.L) {
            byte[] bArr = this.f1498d;
            if (i12 > 0) {
                if (i14 > i12) {
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.K += i12;
                this.f1499e -= i12;
                this.f1501t = 0;
            }
            int i16 = this.f1499e;
            try {
                int i17 = fileInputStream.read(bArr, i16, Math.min(bArr.length - i16, (Integer.MAX_VALUE - this.K) - i16));
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 > 0) {
                    this.f1499e += i17;
                    N();
                    if (this.f1499e >= i11) {
                        return true;
                    }
                    return Q(i11);
                }
            } catch (InvalidProtocolBufferException e8) {
                e8.f1444a = true;
                throw e8;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void a(int i11) throws InvalidProtocolBufferException {
        if (this.H != i11) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int b() {
        return this.K + this.f1501t;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean c() {
        return this.f1501t == this.f1499e && !Q(1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void i(int i11) {
        this.L = i11;
        N();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int j(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i12 = this.K + this.f1501t + i11;
        if (i12 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i13 = this.L;
        if (i12 > i13) {
            throw InvalidProtocolBufferException.e();
        }
        this.L = i12;
        N();
        return i13;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean k() {
        return L() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final h l() throws IOException {
        int iK = K();
        int i11 = this.f1499e;
        int i12 = this.f1501t;
        int i13 = i11 - i12;
        byte[] bArr = this.f1498d;
        if (iK <= i13 && iK > 0) {
            h hVarE = i.e(bArr, i12, iK);
            this.f1501t += iK;
            return hVarE;
        }
        if (iK == 0) {
            return i.f1484b;
        }
        if (iK < 0) {
            throw InvalidProtocolBufferException.d();
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return i.e(bArrG, 0, bArrG.length);
        }
        int i14 = this.f1501t;
        int i15 = this.f1499e;
        int length = i15 - i14;
        this.K += i15;
        this.f1501t = 0;
        this.f1499e = 0;
        ArrayList arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
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
        h hVar = i.f1484b;
        return new h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final double n() {
        return Double.longBitsToDouble(J());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int o() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int p() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long q() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final float r() {
        return Float.intBitsToFloat(I());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int s() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long t() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int u() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long v() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int w() {
        int iK = K();
        return (-(iK & 1)) ^ (iK >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long x() {
        long jL = L();
        return (-(jL & 1)) ^ (jL >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String y() throws InvalidProtocolBufferException {
        int iK = K();
        byte[] bArr = this.f1498d;
        if (iK > 0) {
            int i11 = this.f1499e;
            int i12 = this.f1501t;
            if (iK <= i11 - i12) {
                String str = new String(bArr, i12, iK, e0.f1463a);
                this.f1501t += iK;
                return str;
            }
        }
        if (iK == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iK < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (iK > this.f1499e) {
            return new String(F(iK), e0.f1463a);
        }
        O(iK);
        String str2 = new String(bArr, this.f1501t, iK, e0.f1463a);
        this.f1501t += iK;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String z() throws IOException {
        int iK = K();
        int i11 = this.f1501t;
        int i12 = this.f1499e;
        int i13 = i12 - i11;
        byte[] bArrF = this.f1498d;
        if (iK <= i13 && iK > 0) {
            this.f1501t = i11 + iK;
        } else {
            if (iK == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iK < 0) {
                throw InvalidProtocolBufferException.d();
            }
            i11 = 0;
            if (iK <= i12) {
                O(iK);
                this.f1501t = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return t1.f1566a.r(bArrF, i11, iK);
    }
}
