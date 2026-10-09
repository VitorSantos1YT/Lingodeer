package com.google.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CodedInputStreamReader f21173d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ArrayDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f21174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f21178i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f21179j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f21180k;

        public ArrayDecoder(byte[] bArr, int i11, int i12, boolean z11) {
            super(0);
            this.f21180k = Integer.MAX_VALUE;
            this.f21174e = bArr;
            this.f21175f = i12 + i11;
            this.f21177h = i11;
            this.f21178i = i11;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i11) throws InvalidProtocolBufferException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    J(8);
                    return true;
                }
                if (i12 == 2) {
                    J(F());
                    return true;
                }
                if (i12 == 3) {
                    C();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                J(4);
                return true;
            }
            int i14 = this.f21175f - this.f21177h;
            byte[] bArr = this.f21174e;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f21177h;
                    this.f21177h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i13 < 10) {
                int i16 = this.f21177h;
                if (i16 == this.f21175f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f21177h = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            int i11 = this.f21177h;
            if (this.f21175f - i11 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21177h = i11 + 4;
            byte[] bArr = this.f21174e;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            int i11 = this.f21177h;
            if (this.f21175f - i11 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21177h = i11 + 8;
            byte[] bArr = this.f21174e;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        public final int F() {
            int i11;
            int i12 = this.f21177h;
            int i13 = this.f21175f;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f21174e;
                byte b3 = bArr[i12];
                if (b3 >= 0) {
                    this.f21177h = i14;
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
                    this.f21177h = i15;
                    return i11;
                }
            }
            return (int) H();
        }

        public final long G() {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f21177h;
            int i12 = this.f21175f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f21174e;
                byte b3 = bArr[i11];
                if (b3 >= 0) {
                    this.f21177h = i13;
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
                    this.f21177h = i14;
                    return j11;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                int i12 = this.f21177h;
                if (i12 == this.f21175f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f21177h = i12 + 1;
                byte b3 = this.f21174e[i12];
                j11 |= ((long) (b3 & 127)) << i11;
                if ((b3 & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void I() {
            int i11 = this.f21175f + this.f21176g;
            this.f21175f = i11;
            int i12 = i11 - this.f21178i;
            int i13 = this.f21180k;
            if (i12 <= i13) {
                this.f21176g = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f21176g = i14;
            this.f21175f = i11 - i14;
        }

        public final void J(int i11) throws InvalidProtocolBufferException {
            if (i11 >= 0) {
                int i12 = this.f21175f;
                int i13 = this.f21177h;
                if (i11 <= i12 - i13) {
                    this.f21177h = i13 + i11;
                    return;
                }
            }
            if (i11 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i11) throws InvalidProtocolBufferException {
            if (this.f21179j != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return this.f21177h - this.f21178i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.f21177h == this.f21175f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i11) {
            this.f21180k = i11;
            I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i11 + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i12 = this.f21180k;
            if (iD > i12) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21180k = iD;
            I();
            return i12;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iF = F();
            byte[] bArr = this.f21174e;
            if (iF > 0) {
                int i11 = this.f21175f;
                int i12 = this.f21177h;
                if (iF <= i11 - i12) {
                    ByteString byteStringG = ByteString.g(bArr, i12, iF);
                    this.f21177h += iF;
                    return byteStringG;
                }
            }
            if (iF == 0) {
                return ByteString.f21158b;
            }
            if (iF > 0) {
                int i13 = this.f21175f;
                int i14 = this.f21177h;
                if (iF <= i13 - i14) {
                    int i15 = iF + i14;
                    this.f21177h = i15;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i14, i15);
                } else {
                    if (iF <= 0) {
                        throw InvalidProtocolBufferException.h();
                    }
                    if (iF == 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    bArrCopyOfRange = Internal.f21283b;
                }
            } else {
                if (iF <= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (iF == 0) {
                    throw InvalidProtocolBufferException.f();
                }
                bArrCopyOfRange = Internal.f21283b;
            }
            ByteString byteString = ByteString.f21158b;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i11 = this.f21175f;
                int i12 = this.f21177h;
                if (iF <= i11 - i12) {
                    String str = new String(this.f21174e, i12, iF, Internal.f21282a);
                    this.f21177h += iF;
                    return str;
                }
            }
            if (iF == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i11 = this.f21175f;
                int i12 = this.f21177h;
                if (iF <= i11 - i12) {
                    String strA = Utf8.f21424a.a(this.f21174e, i12, iF);
                    this.f21177h += iF;
                    return strA;
                }
            }
            if (iF == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f21179j = 0;
                return 0;
            }
            int iF = F();
            this.f21179j = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Iterator f21181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ByteBuffer f21182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21184h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f21185i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f21186j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f21187k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f21188l;
        public long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f21189n;

        public IterableDirectByteBufferDecoder(int i11, ArrayList arrayList) {
            super(0);
            this.f21185i = Integer.MAX_VALUE;
            this.f21183g = i11;
            this.f21181e = arrayList.iterator();
            this.f21187k = 0;
            if (i11 != 0) {
                N();
                return;
            }
            this.f21182f = Internal.f21284c;
            this.f21188l = 0L;
            this.m = 0L;
            this.f21189n = 0L;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i11) throws InvalidProtocolBufferException {
            int i12 = i11 & 7;
            if (i12 == 0) {
                for (int i13 = 0; i13 < 10; i13++) {
                    if (E() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i12 == 1) {
                M(8);
                return true;
            }
            if (i12 == 2) {
                M(I());
                return true;
            }
            if (i12 == 3) {
                C();
                a(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            M(4);
            return true;
        }

        public final long D() {
            return this.f21189n - this.f21188l;
        }

        public final byte E() throws InvalidProtocolBufferException {
            if (D() == 0) {
                if (!this.f21181e.hasNext()) {
                    throw InvalidProtocolBufferException.h();
                }
                N();
            }
            long j11 = this.f21188l;
            this.f21188l = 1 + j11;
            return UnsafeUtil.f21417c.f(j11);
        }

        public final void F(byte[] bArr, int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > L()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (D() == 0) {
                    if (!this.f21181e.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    N();
                }
                int iMin = Math.min(i12, (int) D());
                long j11 = iMin;
                UnsafeUtil.f21417c.c(this.f21188l, bArr, i11 - i12, j11);
                i12 -= iMin;
                this.f21188l += j11;
            }
        }

        public final int G() {
            if (D() < 4) {
                return (E() & 255) | ((E() & 255) << 8) | ((E() & 255) << 16) | ((E() & 255) << 24);
            }
            long j11 = this.f21188l;
            this.f21188l = 4 + j11;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            return ((memoryAccessor.f(j11 + 3) & 255) << 24) | (memoryAccessor.f(j11) & 255) | ((memoryAccessor.f(1 + j11) & 255) << 8) | ((memoryAccessor.f(2 + j11) & 255) << 16);
        }

        public final long H() {
            if (D() < 8) {
                return (((long) E()) & 255) | ((((long) E()) & 255) << 8) | ((((long) E()) & 255) << 16) | ((((long) E()) & 255) << 24) | ((((long) E()) & 255) << 32) | ((((long) E()) & 255) << 40) | ((((long) E()) & 255) << 48) | ((((long) E()) & 255) << 56);
            }
            long j11 = this.f21188l;
            this.f21188l = 8 + j11;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            return (((long) memoryAccessor.f(j11)) & 255) | ((((long) memoryAccessor.f(j11 + 1)) & 255) << 8) | ((((long) memoryAccessor.f(j11 + 2)) & 255) << 16) | ((((long) memoryAccessor.f(3 + j11)) & 255) << 24) | ((((long) memoryAccessor.f(4 + j11)) & 255) << 32) | ((((long) memoryAccessor.f(5 + j11)) & 255) << 40) | ((((long) memoryAccessor.f(6 + j11)) & 255) << 48) | ((((long) memoryAccessor.f(j11 + 7)) & 255) << 56);
        }

        public final int I() {
            int i11;
            long j11 = this.f21188l;
            if (this.f21189n != j11) {
                long j12 = j11 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                byte bF = memoryAccessor.f(j11);
                if (bF >= 0) {
                    this.f21188l++;
                    return bF;
                }
                if (this.f21189n - this.f21188l >= 10) {
                    long j13 = 2 + j11;
                    int iF = (memoryAccessor.f(j12) << 7) ^ bF;
                    if (iF < 0) {
                        i11 = iF ^ (-128);
                    } else {
                        long j14 = 3 + j11;
                        int iF2 = (memoryAccessor.f(j13) << 14) ^ iF;
                        if (iF2 >= 0) {
                            i11 = iF2 ^ 16256;
                        } else {
                            long j15 = 4 + j11;
                            int iF3 = iF2 ^ (memoryAccessor.f(j14) << 21);
                            if (iF3 < 0) {
                                i11 = (-2080896) ^ iF3;
                            } else {
                                j14 = 5 + j11;
                                byte bF2 = memoryAccessor.f(j15);
                                int i12 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                                if (bF2 < 0) {
                                    j15 = 6 + j11;
                                    if (memoryAccessor.f(j14) < 0) {
                                        j14 = 7 + j11;
                                        if (memoryAccessor.f(j15) < 0) {
                                            j15 = 8 + j11;
                                            if (memoryAccessor.f(j14) < 0) {
                                                j14 = 9 + j11;
                                                if (memoryAccessor.f(j15) < 0) {
                                                    long j16 = j11 + 10;
                                                    if (memoryAccessor.f(j14) >= 0) {
                                                        i11 = i12;
                                                        j13 = j16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                i11 = i12;
                            }
                            j13 = j15;
                        }
                        j13 = j14;
                    }
                    this.f21188l = j13;
                    return i11;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j11;
            long j12;
            long j13;
            long j14 = this.f21188l;
            if (this.f21189n != j14) {
                long j15 = j14 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                byte bF = memoryAccessor.f(j14);
                if (bF >= 0) {
                    this.f21188l++;
                    return bF;
                }
                if (this.f21189n - this.f21188l >= 10) {
                    long j16 = 2 + j14;
                    int iF = (memoryAccessor.f(j15) << 7) ^ bF;
                    if (iF < 0) {
                        j11 = iF ^ (-128);
                    } else {
                        long j17 = 3 + j14;
                        int iF2 = (memoryAccessor.f(j16) << 14) ^ iF;
                        if (iF2 >= 0) {
                            j11 = iF2 ^ 16256;
                        } else {
                            long j18 = 4 + j14;
                            int iF3 = iF2 ^ (memoryAccessor.f(j17) << 21);
                            if (iF3 < 0) {
                                j11 = (-2080896) ^ iF3;
                                j16 = j18;
                            } else {
                                long j19 = 5 + j14;
                                long jF = (((long) memoryAccessor.f(j18)) << 28) ^ ((long) iF3);
                                if (jF >= 0) {
                                    j13 = 266354560;
                                } else {
                                    j17 = 6 + j14;
                                    long jF2 = jF ^ (((long) memoryAccessor.f(j19)) << 35);
                                    if (jF2 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        j19 = 7 + j14;
                                        jF = jF2 ^ (((long) memoryAccessor.f(j17)) << 42);
                                        if (jF >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            j17 = 8 + j14;
                                            jF2 = jF ^ (((long) memoryAccessor.f(j19)) << 49);
                                            if (jF2 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                j19 = 9 + j14;
                                                long jF3 = (jF2 ^ (((long) memoryAccessor.f(j17)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j21 = j14 + 10;
                                                    if (memoryAccessor.f(j19) >= 0) {
                                                        j16 = j21;
                                                        j11 = jF3;
                                                    }
                                                } else {
                                                    j11 = jF3;
                                                    j16 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j11 = j12 ^ jF2;
                                }
                                j11 = j13 ^ jF;
                                j16 = j19;
                            }
                        }
                        j16 = j17;
                    }
                    this.f21188l = j16;
                    return j11;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte bE = E();
                j11 |= ((long) (bE & 127)) << i11;
                if ((bE & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final int L() {
            return (int) ((((long) (this.f21183g - this.f21187k)) - this.f21188l) + this.m);
        }

        public final void M(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > (((long) (this.f21183g - this.f21187k)) - this.f21188l) + this.m) {
                if (i11 >= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i11 > 0) {
                if (D() == 0) {
                    if (!this.f21181e.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    N();
                }
                int iMin = Math.min(i11, (int) D());
                i11 -= iMin;
                this.f21188l += (long) iMin;
            }
        }

        public final void N() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f21181e.next();
            this.f21182f = byteBuffer;
            this.f21187k += (int) (this.f21188l - this.m);
            long jPosition = byteBuffer.position();
            this.f21188l = jPosition;
            this.m = jPosition;
            this.f21189n = this.f21182f.limit();
            long jB = UnsafeUtil.b(this.f21182f);
            this.f21188l += jB;
            this.m += jB;
            this.f21189n += jB;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i11) throws InvalidProtocolBufferException {
            if (this.f21186j != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return (int) ((((long) this.f21187k) + this.f21188l) - this.m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return (((long) this.f21187k) + this.f21188l) - this.m == ((long) this.f21183g);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i11) {
            this.f21185i = i11;
            int i12 = this.f21183g + this.f21184h;
            this.f21183g = i12;
            if (i12 <= i11) {
                this.f21184h = 0;
                return;
            }
            int i13 = i12 - i11;
            this.f21184h = i13;
            this.f21183g = i12 - i13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i11 + d();
            int i12 = this.f21185i;
            if (iD > i12) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21185i = iD;
            int i13 = this.f21183g + this.f21184h;
            this.f21183g = i13;
            if (i13 <= iD) {
                this.f21184h = 0;
                return i12;
            }
            int i14 = i13 - iD;
            this.f21184h = i14;
            this.f21183g = i13 - i14;
            return i12;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j11 = I;
                long j12 = this.f21189n;
                long j13 = this.f21188l;
                if (j11 <= j12 - j13) {
                    byte[] bArr = new byte[I];
                    UnsafeUtil.f21417c.c(j13, bArr, 0L, j11);
                    this.f21188l += j11;
                    ByteString byteString = ByteString.f21158b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (I > 0 && I <= L()) {
                byte[] bArr2 = new byte[I];
                F(bArr2, I);
                ByteString byteString2 = ByteString.f21158b;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (I == 0) {
                return ByteString.f21158b;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j11 = I;
                long j12 = this.f21189n;
                long j13 = this.f21188l;
                if (j11 <= j12 - j13) {
                    byte[] bArr = new byte[I];
                    UnsafeUtil.f21417c.c(j13, bArr, 0L, j11);
                    String str = new String(bArr, Internal.f21282a);
                    this.f21188l += j11;
                    return str;
                }
            }
            if (I > 0 && I <= L()) {
                byte[] bArr2 = new byte[I];
                F(bArr2, I);
                return new String(bArr2, Internal.f21282a);
            }
            if (I == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j11 = I;
                long j12 = this.f21189n;
                long j13 = this.f21188l;
                if (j11 <= j12 - j13) {
                    String strC = Utf8.c(this.f21182f, (int) (j13 - this.m), I);
                    this.f21188l += j11;
                    return strC;
                }
            }
            if (I >= 0 && I <= L()) {
                byte[] bArr = new byte[I];
                F(bArr, I);
                return Utf8.f21424a.a(bArr, 0, I);
            }
            if (I == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (I <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f21186j = 0;
                return 0;
            }
            int I = I();
            this.f21186j = I;
            if ((I >>> 3) != 0) {
                return I;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StreamDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InputStream f21190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f21191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f21194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f21195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f21196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f21197l;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public interface RefillCallback {
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            super(0);
            this.f21197l = Integer.MAX_VALUE;
            Internal.a(inputStream, "input");
            this.f21190e = inputStream;
            this.f21191f = new byte[4096];
            this.f21192g = 0;
            this.f21194i = 0;
            this.f21196k = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i11) throws InvalidProtocolBufferException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    N(8);
                    return true;
                }
                if (i12 == 2) {
                    N(I());
                    return true;
                }
                if (i12 == 3) {
                    C();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                N(4);
                return true;
            }
            int i14 = this.f21192g - this.f21194i;
            byte[] bArr = this.f21191f;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f21194i;
                    this.f21194i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i13 < 10) {
                if (this.f21194i == this.f21192g) {
                    M(1);
                }
                int i16 = this.f21194i;
                this.f21194i = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final byte[] D(int i11) throws IOException {
            byte[] bArrE = E(i11);
            if (bArrE != null) {
                return bArrE;
            }
            int i12 = this.f21194i;
            int i13 = this.f21192g;
            int length = i13 - i12;
            this.f21196k += i13;
            this.f21194i = 0;
            this.f21192g = 0;
            ArrayList arrayListF = F(i11 - length);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f21191f, i12, bArr, 0, length);
            int size = arrayListF.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayListF.get(i14);
                i14++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] E(int i11) throws IOException {
            if (i11 == 0) {
                return Internal.f21283b;
            }
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i12 = this.f21196k;
            int i13 = this.f21194i;
            int i14 = i12 + i13 + i11;
            if (i14 - this.f21172c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i15 = this.f21197l;
            if (i14 > i15) {
                N((i15 - i12) - i13);
                throw InvalidProtocolBufferException.h();
            }
            int i16 = this.f21192g - i13;
            int i17 = i11 - i16;
            InputStream inputStream = this.f21190e;
            if (i17 >= 4096) {
                try {
                    if (i17 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e8) {
                    e8.f21286b = true;
                    throw e8;
                }
            }
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f21191f, this.f21194i, bArr, 0, i16);
            this.f21196k += this.f21192g;
            this.f21194i = 0;
            this.f21192g = 0;
            while (i16 < i11) {
                try {
                    int i18 = inputStream.read(bArr, i16, i11 - i16);
                    if (i18 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f21196k += i18;
                    i16 += i18;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f21286b = true;
                    throw e10;
                }
            }
            return bArr;
        }

        public final ArrayList F(int i11) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i11 > 0) {
                int iMin = Math.min(i11, 4096);
                byte[] bArr = new byte[iMin];
                int i12 = 0;
                while (i12 < iMin) {
                    int i13 = this.f21190e.read(bArr, i12, iMin - i12);
                    if (i13 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f21196k += i13;
                    i12 += i13;
                }
                i11 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int G() throws InvalidProtocolBufferException {
            int i11 = this.f21194i;
            if (this.f21192g - i11 < 4) {
                M(4);
                i11 = this.f21194i;
            }
            this.f21194i = i11 + 4;
            byte[] bArr = this.f21191f;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long H() throws InvalidProtocolBufferException {
            int i11 = this.f21194i;
            if (this.f21192g - i11 < 8) {
                M(8);
                i11 = this.f21194i;
            }
            this.f21194i = i11 + 8;
            byte[] bArr = this.f21191f;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        public final int I() {
            int i11;
            int i12 = this.f21194i;
            int i13 = this.f21192g;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f21191f;
                byte b3 = bArr[i12];
                if (b3 >= 0) {
                    this.f21194i = i14;
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
                    this.f21194i = i15;
                    return i11;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f21194i;
            int i12 = this.f21192g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f21191f;
                byte b3 = bArr[i11];
                if (b3 >= 0) {
                    this.f21194i = i13;
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
                    this.f21194i = i14;
                    return j11;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                if (this.f21194i == this.f21192g) {
                    M(1);
                }
                int i12 = this.f21194i;
                this.f21194i = i12 + 1;
                byte b3 = this.f21191f[i12];
                j11 |= ((long) (b3 & 127)) << i11;
                if ((b3 & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void L() {
            int i11 = this.f21192g + this.f21193h;
            this.f21192g = i11;
            int i12 = this.f21196k + i11;
            int i13 = this.f21197l;
            if (i12 <= i13) {
                this.f21193h = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f21193h = i14;
            this.f21192g = i11 - i14;
        }

        public final void M(int i11) throws InvalidProtocolBufferException {
            if (O(i11)) {
                return;
            }
            if (i11 <= (this.f21172c - this.f21196k) - this.f21194i) {
                throw InvalidProtocolBufferException.h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void N(int i11) throws InvalidProtocolBufferException {
            int i12 = this.f21192g;
            int i13 = this.f21194i;
            if (i11 <= i12 - i13 && i11 >= 0) {
                this.f21194i = i13 + i11;
                return;
            }
            InputStream inputStream = this.f21190e;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i14 = this.f21196k;
            int i15 = i14 + i13;
            int i16 = i15 + i11;
            int i17 = this.f21197l;
            if (i16 > i17) {
                N((i17 - i14) - i13);
                throw InvalidProtocolBufferException.h();
            }
            this.f21196k = i15;
            int i18 = i12 - i13;
            this.f21192g = 0;
            this.f21194i = 0;
            while (i18 < i11) {
                long j11 = i11 - i18;
                try {
                    try {
                        long jSkip = inputStream.skip(j11);
                        if (jSkip < 0 || jSkip > j11) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i18 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e8) {
                        e8.f21286b = true;
                        throw e8;
                    }
                } catch (Throwable th2) {
                    this.f21196k += i18;
                    L();
                    throw th2;
                }
            }
            this.f21196k += i18;
            L();
            if (i18 >= i11) {
                return;
            }
            int i19 = this.f21192g;
            int i21 = i19 - this.f21194i;
            this.f21194i = i19;
            M(1);
            while (true) {
                int i22 = i11 - i21;
                int i23 = this.f21192g;
                if (i22 <= i23) {
                    this.f21194i = i22;
                    return;
                } else {
                    i21 += i23;
                    this.f21194i = i23;
                    M(1);
                }
            }
        }

        public final boolean O(int i11) throws IOException {
            InputStream inputStream = this.f21190e;
            int i12 = this.f21194i;
            int i13 = i12 + i11;
            int i14 = this.f21192g;
            if (i13 <= i14) {
                throw new IllegalStateException(p0.h(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i15 = this.f21172c;
            int i16 = this.f21196k;
            if (i11 <= (i15 - i16) - i12 && i16 + i12 + i11 <= this.f21197l) {
                byte[] bArr = this.f21191f;
                if (i12 > 0) {
                    if (i14 > i12) {
                        System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                    }
                    this.f21196k += i12;
                    this.f21192g -= i12;
                    this.f21194i = 0;
                }
                int i17 = this.f21192g;
                try {
                    int i18 = inputStream.read(bArr, i17, Math.min(bArr.length - i17, (this.f21172c - this.f21196k) - i17));
                    if (i18 == 0 || i18 < -1 || i18 > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i18 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i18 > 0) {
                        this.f21192g += i18;
                        L();
                        if (this.f21192g >= i11) {
                            return true;
                        }
                        return O(i11);
                    }
                } catch (InvalidProtocolBufferException e8) {
                    e8.f21286b = true;
                    throw e8;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i11) throws InvalidProtocolBufferException {
            if (this.f21195j != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return this.f21196k + this.f21194i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.f21194i == this.f21192g && !O(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i11) {
            this.f21197l = i11;
            L();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i12 = this.f21196k + this.f21194i + i11;
            int i13 = this.f21197l;
            if (i12 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21197l = i12;
            L();
            return i13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws IOException {
            int I = I();
            int i11 = this.f21192g;
            int i12 = this.f21194i;
            int i13 = i11 - i12;
            byte[] bArr = this.f21191f;
            if (I <= i13 && I > 0) {
                ByteString byteStringG = ByteString.g(bArr, i12, I);
                this.f21194i += I;
                return byteStringG;
            }
            if (I == 0) {
                return ByteString.f21158b;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            byte[] bArrE = E(I);
            if (bArrE != null) {
                return ByteString.g(bArrE, 0, bArrE.length);
            }
            int i14 = this.f21194i;
            int i15 = this.f21192g;
            int length = i15 - i14;
            this.f21196k += i15;
            this.f21194i = 0;
            this.f21192g = 0;
            ArrayList arrayListF = F(I - length);
            byte[] bArr2 = new byte[I];
            System.arraycopy(bArr, i14, bArr2, 0, length);
            int size = arrayListF.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayListF.get(i16);
                i16++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f21158b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I = I();
            byte[] bArr = this.f21191f;
            if (I > 0) {
                int i11 = this.f21192g;
                int i12 = this.f21194i;
                if (I <= i11 - i12) {
                    String str = new String(bArr, i12, I, Internal.f21282a);
                    this.f21194i += I;
                    return str;
                }
            }
            if (I == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (I > this.f21192g) {
                return new String(D(I), Internal.f21282a);
            }
            M(I);
            String str2 = new String(bArr, this.f21194i, I, Internal.f21282a);
            this.f21194i += I;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws IOException {
            int I = I();
            int i11 = this.f21194i;
            int i12 = this.f21192g;
            int i13 = i12 - i11;
            byte[] bArrD = this.f21191f;
            if (I <= i13 && I > 0) {
                this.f21194i = i11 + I;
            } else {
                if (I == 0) {
                    return BuildConfig.VERSION_NAME;
                }
                if (I < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                i11 = 0;
                if (I <= i12) {
                    M(I);
                    this.f21194i = I;
                } else {
                    bArrD = D(I);
                }
            }
            return Utf8.f21424a.a(bArrD, i11, I);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f21195j = 0;
                return 0;
            }
            int I = I();
            this.f21195j = I;
            if ((I >>> 3) != 0) {
                return I;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ByteBuffer f21198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f21199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f21200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f21201h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f21202i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f21203j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f21204k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f21205l;

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer) {
            super(0);
            this.f21205l = Integer.MAX_VALUE;
            this.f21198e = byteBuffer;
            long jB = UnsafeUtil.b(byteBuffer);
            this.f21199f = jB;
            this.f21200g = ((long) byteBuffer.limit()) + jB;
            long jPosition = jB + ((long) byteBuffer.position());
            this.f21201h = jPosition;
            this.f21202i = jPosition;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i11) throws InvalidProtocolBufferException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    J(8);
                    return true;
                }
                if (i12 == 2) {
                    J(F());
                    return true;
                }
                if (i12 == 3) {
                    C();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    return false;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                J(4);
                return true;
            }
            if (((int) (this.f21200g - this.f21201h)) >= 10) {
                while (i13 < 10) {
                    long j11 = this.f21201h;
                    this.f21201h = j11 + 1;
                    if (UnsafeUtil.f21417c.f(j11) < 0) {
                        i13++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i13 < 10) {
                long j12 = this.f21201h;
                if (j12 == this.f21200g) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f21201h = j12 + 1;
                if (UnsafeUtil.f21417c.f(j12) < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            long j11 = this.f21201h;
            if (this.f21200g - j11 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21201h = 4 + j11;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            return ((memoryAccessor.f(j11 + 3) & 255) << 24) | (memoryAccessor.f(j11) & 255) | ((memoryAccessor.f(1 + j11) & 255) << 8) | ((memoryAccessor.f(2 + j11) & 255) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            long j11 = this.f21201h;
            if (this.f21200g - j11 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21201h = 8 + j11;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            return ((((long) memoryAccessor.f(j11 + 7)) & 255) << 56) | (((long) memoryAccessor.f(j11)) & 255) | ((((long) memoryAccessor.f(1 + j11)) & 255) << 8) | ((((long) memoryAccessor.f(2 + j11)) & 255) << 16) | ((((long) memoryAccessor.f(3 + j11)) & 255) << 24) | ((((long) memoryAccessor.f(4 + j11)) & 255) << 32) | ((((long) memoryAccessor.f(5 + j11)) & 255) << 40) | ((((long) memoryAccessor.f(6 + j11)) & 255) << 48);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
          0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int F() {
            /*
                r12 = this;
                long r0 = r12.f21201h
                long r2 = r12.f21200g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                com.google.protobuf.UnsafeUtil$MemoryAccessor r4 = com.google.protobuf.UnsafeUtil.f21417c
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f21201h = r2
                return r5
            L18:
                long r6 = r12.f21200g
                long r6 = r6 - r2
                r8 = 9
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L93
            L23:
                r6 = 2
                long r6 = r6 + r0
                byte r2 = r4.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r5
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La0
            L33:
                r10 = 3
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r3 = r3 << 14
                r2 = r2 ^ r3
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r10
                goto La0
            L43:
                r5 = 4
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto La0
            L55:
                r10 = 5
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r5 = r3 << 28
                r2 = r2 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r5
                if (r3 >= 0) goto L9e
                r5 = 6
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                r10 = 7
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9e
                r5 = 8
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                long r8 = r8 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9b
                r5 = 10
                long r6 = r0 + r5
                byte r0 = r4.f(r8)
                if (r0 >= 0) goto L99
            L93:
                long r0 = r12.H()
                int r0 = (int) r0
                return r0
            L99:
                r0 = r2
                goto La0
            L9b:
                r0 = r2
                r6 = r8
                goto La0
            L9e:
                r0 = r2
                goto L41
            La0:
                r12.f21201h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.F():int");
        }

        public final long G() {
            long j11;
            long j12;
            long j13;
            int i11;
            long j14 = this.f21201h;
            if (this.f21200g != j14) {
                long j15 = 1 + j14;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
                byte bF = memoryAccessor.f(j14);
                if (bF >= 0) {
                    this.f21201h = j15;
                    return bF;
                }
                if (this.f21200g - j15 >= 9) {
                    long j16 = 2 + j14;
                    int iF = (memoryAccessor.f(j15) << 7) ^ bF;
                    if (iF >= 0) {
                        long j17 = 3 + j14;
                        int iF2 = iF ^ (memoryAccessor.f(j16) << 14);
                        if (iF2 < 0) {
                            j16 = j14 + 4;
                            int iF3 = iF2 ^ (memoryAccessor.f(j17) << 21);
                            if (iF3 < 0) {
                                i11 = (-2080896) ^ iF3;
                            } else {
                                j17 = 5 + j14;
                                long jF = ((long) iF3) ^ (((long) memoryAccessor.f(j16)) << 28);
                                if (jF >= 0) {
                                    j13 = 266354560;
                                } else {
                                    long j18 = 6 + j14;
                                    long jF2 = jF ^ (((long) memoryAccessor.f(j17)) << 35);
                                    if (jF2 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        j17 = 7 + j14;
                                        jF = jF2 ^ (((long) memoryAccessor.f(j18)) << 42);
                                        if (jF >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j14;
                                            jF2 = jF ^ (((long) memoryAccessor.f(j17)) << 49);
                                            if (jF2 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                long j19 = j14 + 9;
                                                long jF3 = (jF2 ^ (((long) memoryAccessor.f(j18)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j21 = j14 + 10;
                                                    if (memoryAccessor.f(j19) >= 0) {
                                                        j16 = j21;
                                                        j11 = jF3;
                                                    }
                                                } else {
                                                    j11 = jF3;
                                                    j16 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j11 = j12 ^ jF2;
                                    j16 = j18;
                                }
                                j11 = j13 ^ jF;
                            }
                            this.f21201h = j16;
                            return j11;
                        }
                        j11 = iF2 ^ 16256;
                        j16 = j17;
                        this.f21201h = j16;
                        return j11;
                    }
                    i11 = iF ^ (-128);
                    j11 = i11;
                    this.f21201h = j16;
                    return j11;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                long j12 = this.f21201h;
                if (j12 == this.f21200g) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f21201h = 1 + j12;
                byte bF = UnsafeUtil.f21417c.f(j12);
                j11 |= ((long) (bF & 127)) << i11;
                if ((bF & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void I() {
            long j11 = this.f21200g + ((long) this.f21203j);
            this.f21200g = j11;
            int i11 = (int) (j11 - this.f21202i);
            int i12 = this.f21205l;
            if (i11 <= i12) {
                this.f21203j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f21203j = i13;
            this.f21200g = j11 - ((long) i13);
        }

        public final void J(int i11) throws InvalidProtocolBufferException {
            if (i11 >= 0) {
                long j11 = this.f21200g;
                long j12 = this.f21201h;
                if (i11 <= ((int) (j11 - j12))) {
                    this.f21201h = j12 + ((long) i11);
                    return;
                }
            }
            if (i11 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i11) throws InvalidProtocolBufferException {
            if (this.f21204k != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return (int) (this.f21201h - this.f21202i);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.f21201h == this.f21200g;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i11) {
            this.f21205l = i11;
            I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i11 + d();
            int i12 = this.f21205l;
            if (iD > i12) {
                throw InvalidProtocolBufferException.h();
            }
            this.f21205l = iD;
            I();
            return i12;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j11 = this.f21200g;
                long j12 = this.f21201h;
                if (iF <= ((int) (j11 - j12))) {
                    byte[] bArr = new byte[iF];
                    long j13 = iF;
                    UnsafeUtil.f21417c.c(j12, bArr, 0L, j13);
                    this.f21201h += j13;
                    ByteString byteString = ByteString.f21158b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iF == 0) {
                return ByteString.f21158b;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j11 = this.f21200g;
                long j12 = this.f21201h;
                if (iF <= ((int) (j11 - j12))) {
                    byte[] bArr = new byte[iF];
                    long j13 = iF;
                    UnsafeUtil.f21417c.c(j12, bArr, 0L, j13);
                    String str = new String(bArr, Internal.f21282a);
                    this.f21201h += j13;
                    return str;
                }
            }
            if (iF == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j11 = this.f21200g;
                long j12 = this.f21201h;
                if (iF <= ((int) (j11 - j12))) {
                    String strC = Utf8.c(this.f21198e, (int) (j12 - this.f21199f), iF);
                    this.f21201h += (long) iF;
                    return strC;
                }
            }
            if (iF == 0) {
                return BuildConfig.VERSION_NAME;
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.f21204k = 0;
                return 0;
            }
            int iF = F();
            this.f21204k = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    public /* synthetic */ CodedInputStream(int i11) {
        this();
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static CodedInputStream f(InputStream inputStream) {
        if (inputStream != null) {
            return new StreamDecoder(inputStream);
        }
        byte[] bArr = Internal.f21283b;
        return g(bArr, 0, bArr.length, false);
    }

    public static CodedInputStream g(byte[] bArr, int i11, int i12, boolean z11) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i11, i12, z11);
        try {
            arrayDecoder.i(i12);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract long A();

    public abstract boolean B(int i11);

    public final void C() throws InvalidProtocolBufferException {
        boolean zB;
        do {
            int iY = y();
            if (iY == 0) {
                return;
            }
            int i11 = this.f21170a;
            if (i11 >= this.f21171b) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f21170a = i11 + 1;
            zB = B(iY);
            this.f21170a--;
        } while (zB);
    }

    public abstract void a(int i11);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i11);

    public abstract int i(int i11);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();

    private CodedInputStream() {
        this.f21171b = 100;
        this.f21172c = Integer.MAX_VALUE;
    }
}
