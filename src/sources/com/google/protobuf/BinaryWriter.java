package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21149a;

    /* JADX INFO: renamed from: com.google.protobuf.BinaryWriter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21150a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21150a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21150a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21150a[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21150a[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21150a[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21150a[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21150a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21150a[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21150a[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21150a[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21150a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21150a[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21150a[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21150a[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21150a[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21150a[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21150a[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeDirectWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21151b;

        @Override // com.google.protobuf.Writer
        public final void G(int i11, long j11) {
            U(15);
            b0(j11);
            c0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void I(int i11) {
            c0(i11, 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void O(int i11, int i12) {
            U(10);
            a0(i12);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i11 = this.f21151b;
            if (i11 + 1 >= iRemaining) {
                this.f21151b = i11 - iRemaining;
                throw null;
            }
            this.f21149a += iRemaining;
            AllocatedBuffer.a(byteBuffer);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            int i13 = this.f21151b;
            if (i13 + 1 >= i12) {
                this.f21151b = i13 - i12;
                throw null;
            }
            this.f21149a += i12;
            AllocatedBuffer.b(bArr, i11, i12);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.f21151b) + this.f21149a;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void U(int i11) {
            if (this.f21151b + 1 >= i11) {
                return;
            }
            Math.max(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void V(boolean z11) {
            this.f21151b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void W(int i11) {
            this.f21151b -= 4;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void X(long j11) {
            this.f21151b -= 8;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void Y(int i11) {
            if (i11 < 0) {
                e0(i11);
            } else {
                d0(i11);
                throw null;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void a0(int i11) {
            d0(CodedOutputStream.Y(i11));
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void b0(long j11) {
            e0(CodedOutputStream.Z(j11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void c0(int i11, int i12) {
            d0((i11 << 3) | i12);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void d(int i11, int i12) {
            U(10);
            d0(i12);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void d0(int i11) {
            if ((i11 & (-128)) == 0) {
                this.f21151b--;
                throw null;
            }
            if ((i11 & (-16384)) == 0) {
                h0(i11);
                throw null;
            }
            if (((-2097152) & i11) == 0) {
                g0(i11);
                throw null;
            }
            if (((-268435456) & i11) == 0) {
                f0(i11);
                throw null;
            }
            this.f21151b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void e0(long j11) {
            switch (BinaryWriter.S(j11)) {
                case 1:
                    this.f21151b--;
                    throw null;
                case 2:
                    h0((int) j11);
                    throw null;
                case 3:
                    g0((int) j11);
                    throw null;
                case 4:
                    f0((int) j11);
                    throw null;
                case 5:
                    this.f21151b -= 5;
                    throw null;
                case 6:
                    this.f21151b -= 6;
                    throw null;
                case 7:
                    this.f21151b -= 7;
                    throw null;
                case 8:
                    this.f21151b -= 8;
                    throw null;
                case 9:
                    this.f21151b--;
                    throw null;
                case 10:
                    this.f21151b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.protobuf.Writer
        public final void f(int i11, int i12) {
            U(9);
            W(i12);
            throw null;
        }

        public final void f0(int i11) {
            this.f21151b -= 4;
            throw null;
        }

        public final void g0(int i11) {
            this.f21151b -= 3;
            throw null;
        }

        public final void h0(int i11) {
            this.f21151b -= 2;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void j(int i11, Object obj, Schema schema) {
            int iT = T();
            schema.e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void k(int i11, long j11) {
            U(13);
            X(j11);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void n(int i11, String str) {
            int i12;
            int i13;
            int i14;
            int iT = T();
            U(str.length());
            int length = str.length();
            int i15 = length - 1;
            this.f21151b -= i15;
            if (i15 >= 0 && str.charAt(i15) < 128) {
                throw null;
            }
            if (i15 != -1) {
                this.f21151b += i15;
                while (i15 >= 0) {
                    char cCharAt = str.charAt(i15);
                    if (cCharAt < 128 && (i14 = this.f21151b) >= 0) {
                        this.f21151b = i14 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i13 = this.f21151b) > 0) {
                        this.f21151b = i13 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i12 = this.f21151b) > 1) {
                        this.f21151b = i12 - 1;
                        throw null;
                    }
                    if (this.f21151b > 2) {
                        if (i15 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.f21151b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i15);
                    }
                    U(i15);
                }
            } else {
                this.f21151b--;
            }
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void o(int i11, long j11) {
            U(15);
            e0(j11);
            c0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void p(int i11, Object obj) {
            int iT = T();
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void s(int i11, boolean z11) {
            U(6);
            this.f21151b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void t(int i11, Object obj, Schema schema) {
            c0(i11, 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void v(int i11) {
            c0(i11, 3);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void w(int i11, ByteString byteString) {
            try {
                byteString.w(this);
                U(10);
                d0(byteString.size());
                throw null;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void x(int i11, int i12) {
            U(15);
            Y(i12);
            c0(i11, 0);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeHeapWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21152b;

        @Override // com.google.protobuf.Writer
        public final void G(int i11, long j11) {
            U(15);
            b0(j11);
            c0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void I(int i11) {
            c0(i11, 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void O(int i11, int i12) {
            U(10);
            a0(i12);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i11 = this.f21152b;
            if (i11 < iRemaining) {
                this.f21149a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            int i12 = i11 - iRemaining;
            this.f21152b = i12;
            byteBuffer.get(null, i12 + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            int i13 = this.f21152b;
            if (i13 < i12) {
                this.f21149a += i12;
                AllocatedBuffer.b(bArr, i11, i12);
                throw null;
            }
            int i14 = i13 - i12;
            this.f21152b = i14;
            System.arraycopy(bArr, i11, null, i14 + 1, i12);
        }

        @Override // com.google.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.f21152b) + this.f21149a;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void U(int i11) {
            if (this.f21152b >= i11) {
                return;
            }
            Math.max(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void V(boolean z11) {
            this.f21152b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void W(int i11) {
            this.f21152b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void X(long j11) {
            this.f21152b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void Y(int i11) {
            if (i11 < 0) {
                e0(i11);
            } else {
                d0(i11);
                throw null;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void a0(int i11) {
            d0(CodedOutputStream.Y(i11));
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void b0(long j11) {
            e0(CodedOutputStream.Z(j11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void c0(int i11, int i12) {
            d0((i11 << 3) | i12);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void d(int i11, int i12) {
            U(10);
            d0(i12);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void d0(int i11) {
            if ((i11 & (-128)) == 0) {
                this.f21152b--;
                throw null;
            }
            if ((i11 & (-16384)) == 0) {
                this.f21152b--;
                throw null;
            }
            if (((-2097152) & i11) == 0) {
                this.f21152b--;
                throw null;
            }
            if ((i11 & (-268435456)) == 0) {
                this.f21152b--;
                throw null;
            }
            this.f21152b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void e0(long j11) {
            switch (BinaryWriter.S(j11)) {
                case 1:
                    this.f21152b--;
                    throw null;
                case 2:
                    this.f21152b--;
                    throw null;
                case 3:
                    this.f21152b--;
                    throw null;
                case 4:
                    this.f21152b--;
                    throw null;
                case 5:
                    this.f21152b--;
                    throw null;
                case 6:
                    this.f21152b--;
                    throw null;
                case 7:
                    this.f21152b--;
                    throw null;
                case 8:
                    this.f21152b--;
                    throw null;
                case 9:
                    this.f21152b--;
                    throw null;
                case 10:
                    this.f21152b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.protobuf.Writer
        public final void f(int i11, int i12) {
            U(9);
            W(i12);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void j(int i11, Object obj, Schema schema) {
            int iT = T();
            schema.e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void k(int i11, long j11) {
            U(13);
            X(j11);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void n(int i11, String str) {
            int i12;
            int i13;
            int i14;
            int iT = T();
            U(str.length());
            int length = str.length();
            int i15 = length - 1;
            this.f21152b -= i15;
            if (i15 >= 0 && str.charAt(i15) < 128) {
                throw null;
            }
            if (i15 != -1) {
                this.f21152b += i15;
                while (i15 >= 0) {
                    char cCharAt = str.charAt(i15);
                    if (cCharAt < 128 && (i14 = this.f21152b) > 0) {
                        this.f21152b = i14 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i13 = this.f21152b) > 0) {
                        this.f21152b = i13 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i12 = this.f21152b) > 1) {
                        this.f21152b = i12 - 1;
                        throw null;
                    }
                    if (this.f21152b > 2) {
                        if (i15 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.f21152b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i15);
                    }
                    U(i15);
                }
            } else {
                this.f21152b--;
            }
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void o(int i11, long j11) {
            U(15);
            e0(j11);
            c0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void p(int i11, Object obj) {
            int iT = T();
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void s(int i11, boolean z11) {
            U(6);
            this.f21152b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void t(int i11, Object obj, Schema schema) {
            c0(i11, 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void v(int i11) {
            c0(i11, 3);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void w(int i11, ByteString byteString) {
            try {
                byteString.w(this);
                U(10);
                d0(byteString.size());
                throw null;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void x(int i11, int i12) {
            U(15);
            Y(i12);
            c0(i11, 0);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f21153b;

        @Override // com.google.protobuf.Writer
        public final void G(int i11, long j11) {
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void I(int i11) {
            c0(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void O(int i11, int i12) {
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final int T() {
            return this.f21149a + ((int) (0 - this.f21153b));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void U(int i11) {
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void V(boolean z11) {
            byte b3 = z11 ? (byte) 1 : (byte) 0;
            long j11 = this.f21153b;
            this.f21153b = j11 - 1;
            UnsafeUtil.l(j11, b3);
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void W(int i11) {
            long j11 = this.f21153b;
            this.f21153b = j11 - 1;
            UnsafeUtil.l(j11, (byte) ((i11 >> 24) & 255));
            long j12 = this.f21153b;
            this.f21153b = j12 - 1;
            UnsafeUtil.l(j12, (byte) ((i11 >> 16) & 255));
            long j13 = this.f21153b;
            this.f21153b = j13 - 1;
            UnsafeUtil.l(j13, (byte) ((i11 >> 8) & 255));
            long j14 = this.f21153b;
            this.f21153b = j14 - 1;
            UnsafeUtil.l(j14, (byte) (i11 & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void X(long j11) {
            long j12 = this.f21153b;
            this.f21153b = j12 - 1;
            UnsafeUtil.l(j12, (byte) (((int) (j11 >> 56)) & 255));
            long j13 = this.f21153b;
            this.f21153b = j13 - 1;
            UnsafeUtil.l(j13, (byte) (((int) (j11 >> 48)) & 255));
            long j14 = this.f21153b;
            this.f21153b = j14 - 1;
            UnsafeUtil.l(j14, (byte) (((int) (j11 >> 40)) & 255));
            long j15 = this.f21153b;
            this.f21153b = j15 - 1;
            UnsafeUtil.l(j15, (byte) (((int) (j11 >> 32)) & 255));
            long j16 = this.f21153b;
            this.f21153b = j16 - 1;
            UnsafeUtil.l(j16, (byte) (((int) (j11 >> 24)) & 255));
            long j17 = this.f21153b;
            this.f21153b = j17 - 1;
            UnsafeUtil.l(j17, (byte) (((int) (j11 >> 16)) & 255));
            long j18 = this.f21153b;
            this.f21153b = j18 - 1;
            UnsafeUtil.l(j18, (byte) (((int) (j11 >> 8)) & 255));
            long j19 = this.f21153b;
            this.f21153b = j19 - 1;
            UnsafeUtil.l(j19, (byte) (((int) j11) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void Y(int i11) {
            if (i11 >= 0) {
                d0(i11);
            } else {
                e0(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void a0(int i11) {
            d0(CodedOutputStream.Y(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void b0(long j11) {
            e0(CodedOutputStream.Z(j11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void c0(int i11, int i12) {
            d0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.Writer
        public final void d(int i11, int i12) {
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void d0(int i11) {
            if ((i11 & (-128)) == 0) {
                long j11 = this.f21153b;
                this.f21153b = j11 - 1;
                UnsafeUtil.l(j11, (byte) i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                long j12 = this.f21153b;
                this.f21153b = j12 - 1;
                UnsafeUtil.l(j12, (byte) (i11 >>> 7));
                long j13 = this.f21153b;
                this.f21153b = j13 - 1;
                UnsafeUtil.l(j13, (byte) ((i11 & 127) | 128));
                return;
            }
            if (((-2097152) & i11) == 0) {
                long j14 = this.f21153b;
                this.f21153b = j14 - 1;
                UnsafeUtil.l(j14, (byte) (i11 >>> 14));
                long j15 = this.f21153b;
                this.f21153b = j15 - 1;
                UnsafeUtil.l(j15, (byte) (((i11 >>> 7) & 127) | 128));
                long j16 = this.f21153b;
                this.f21153b = j16 - 1;
                UnsafeUtil.l(j16, (byte) ((i11 & 127) | 128));
                return;
            }
            if (((-268435456) & i11) == 0) {
                long j17 = this.f21153b;
                this.f21153b = j17 - 1;
                UnsafeUtil.l(j17, (byte) (i11 >>> 21));
                long j18 = this.f21153b;
                this.f21153b = j18 - 1;
                UnsafeUtil.l(j18, (byte) (((i11 >>> 14) & 127) | 128));
                long j19 = this.f21153b;
                this.f21153b = j19 - 1;
                UnsafeUtil.l(j19, (byte) (((i11 >>> 7) & 127) | 128));
                long j21 = this.f21153b;
                this.f21153b = j21 - 1;
                UnsafeUtil.l(j21, (byte) ((i11 & 127) | 128));
                return;
            }
            long j22 = this.f21153b;
            this.f21153b = j22 - 1;
            UnsafeUtil.l(j22, (byte) (i11 >>> 28));
            long j23 = this.f21153b;
            this.f21153b = j23 - 1;
            UnsafeUtil.l(j23, (byte) (((i11 >>> 21) & 127) | 128));
            long j24 = this.f21153b;
            this.f21153b = j24 - 1;
            UnsafeUtil.l(j24, (byte) (((i11 >>> 14) & 127) | 128));
            long j25 = this.f21153b;
            this.f21153b = j25 - 1;
            UnsafeUtil.l(j25, (byte) (((i11 >>> 7) & 127) | 128));
            long j26 = this.f21153b;
            this.f21153b = j26 - 1;
            UnsafeUtil.l(j26, (byte) ((i11 & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void e0(long j11) {
            switch (BinaryWriter.S(j11)) {
                case 1:
                    long j12 = this.f21153b;
                    this.f21153b = j12 - 1;
                    UnsafeUtil.l(j12, (byte) j11);
                    break;
                case 2:
                    long j13 = this.f21153b;
                    this.f21153b = j13 - 1;
                    UnsafeUtil.l(j13, (byte) (j11 >>> 7));
                    long j14 = this.f21153b;
                    this.f21153b = j14 - 1;
                    UnsafeUtil.l(j14, (byte) ((((int) j11) & 127) | 128));
                    break;
                case 3:
                    long j15 = this.f21153b;
                    this.f21153b = j15 - 1;
                    UnsafeUtil.l(j15, (byte) (((int) j11) >>> 14));
                    long j16 = this.f21153b;
                    this.f21153b = j16 - 1;
                    UnsafeUtil.l(j16, (byte) (((j11 >>> 7) & 127) | 128));
                    long j17 = this.f21153b;
                    this.f21153b = j17 - 1;
                    UnsafeUtil.l(j17, (byte) ((j11 & 127) | 128));
                    break;
                case 4:
                    long j18 = this.f21153b;
                    this.f21153b = j18 - 1;
                    UnsafeUtil.l(j18, (byte) (j11 >>> 21));
                    long j19 = this.f21153b;
                    this.f21153b = j19 - 1;
                    UnsafeUtil.l(j19, (byte) (((j11 >>> 14) & 127) | 128));
                    long j21 = this.f21153b;
                    this.f21153b = j21 - 1;
                    UnsafeUtil.l(j21, (byte) (((j11 >>> 7) & 127) | 128));
                    long j22 = this.f21153b;
                    this.f21153b = j22 - 1;
                    UnsafeUtil.l(j22, (byte) ((j11 & 127) | 128));
                    break;
                case 5:
                    long j23 = this.f21153b;
                    this.f21153b = j23 - 1;
                    UnsafeUtil.l(j23, (byte) (j11 >>> 28));
                    long j24 = this.f21153b;
                    this.f21153b = j24 - 1;
                    UnsafeUtil.l(j24, (byte) (((j11 >>> 21) & 127) | 128));
                    long j25 = this.f21153b;
                    this.f21153b = j25 - 1;
                    UnsafeUtil.l(j25, (byte) (((j11 >>> 14) & 127) | 128));
                    long j26 = this.f21153b;
                    this.f21153b = j26 - 1;
                    UnsafeUtil.l(j26, (byte) (((j11 >>> 7) & 127) | 128));
                    long j27 = this.f21153b;
                    this.f21153b = j27 - 1;
                    UnsafeUtil.l(j27, (byte) ((j11 & 127) | 128));
                    break;
                case 6:
                    long j28 = this.f21153b;
                    this.f21153b = j28 - 1;
                    UnsafeUtil.l(j28, (byte) (j11 >>> 35));
                    long j29 = this.f21153b;
                    this.f21153b = j29 - 1;
                    UnsafeUtil.l(j29, (byte) (((j11 >>> 28) & 127) | 128));
                    long j30 = this.f21153b;
                    this.f21153b = j30 - 1;
                    UnsafeUtil.l(j30, (byte) (((j11 >>> 21) & 127) | 128));
                    long j31 = this.f21153b;
                    this.f21153b = j31 - 1;
                    UnsafeUtil.l(j31, (byte) (((j11 >>> 14) & 127) | 128));
                    long j32 = this.f21153b;
                    this.f21153b = j32 - 1;
                    UnsafeUtil.l(j32, (byte) (((j11 >>> 7) & 127) | 128));
                    long j33 = this.f21153b;
                    this.f21153b = j33 - 1;
                    UnsafeUtil.l(j33, (byte) ((j11 & 127) | 128));
                    break;
                case 7:
                    long j34 = this.f21153b;
                    this.f21153b = j34 - 1;
                    UnsafeUtil.l(j34, (byte) (j11 >>> 42));
                    long j35 = this.f21153b;
                    this.f21153b = j35 - 1;
                    UnsafeUtil.l(j35, (byte) (((j11 >>> 35) & 127) | 128));
                    long j36 = this.f21153b;
                    this.f21153b = j36 - 1;
                    UnsafeUtil.l(j36, (byte) (((j11 >>> 28) & 127) | 128));
                    long j37 = this.f21153b;
                    this.f21153b = j37 - 1;
                    UnsafeUtil.l(j37, (byte) (((j11 >>> 21) & 127) | 128));
                    long j38 = this.f21153b;
                    this.f21153b = j38 - 1;
                    UnsafeUtil.l(j38, (byte) (((j11 >>> 14) & 127) | 128));
                    long j39 = this.f21153b;
                    this.f21153b = j39 - 1;
                    UnsafeUtil.l(j39, (byte) (((j11 >>> 7) & 127) | 128));
                    long j40 = this.f21153b;
                    this.f21153b = j40 - 1;
                    UnsafeUtil.l(j40, (byte) ((j11 & 127) | 128));
                    break;
                case 8:
                    long j41 = this.f21153b;
                    this.f21153b = j41 - 1;
                    UnsafeUtil.l(j41, (byte) (j11 >>> 49));
                    long j42 = this.f21153b;
                    this.f21153b = j42 - 1;
                    UnsafeUtil.l(j42, (byte) (((j11 >>> 42) & 127) | 128));
                    long j43 = this.f21153b;
                    this.f21153b = j43 - 1;
                    UnsafeUtil.l(j43, (byte) (((j11 >>> 35) & 127) | 128));
                    long j44 = this.f21153b;
                    this.f21153b = j44 - 1;
                    UnsafeUtil.l(j44, (byte) (((j11 >>> 28) & 127) | 128));
                    long j45 = this.f21153b;
                    this.f21153b = j45 - 1;
                    UnsafeUtil.l(j45, (byte) (((j11 >>> 21) & 127) | 128));
                    long j46 = this.f21153b;
                    this.f21153b = j46 - 1;
                    UnsafeUtil.l(j46, (byte) (((j11 >>> 14) & 127) | 128));
                    long j47 = this.f21153b;
                    this.f21153b = j47 - 1;
                    UnsafeUtil.l(j47, (byte) (((j11 >>> 7) & 127) | 128));
                    long j48 = this.f21153b;
                    this.f21153b = j48 - 1;
                    UnsafeUtil.l(j48, (byte) ((j11 & 127) | 128));
                    break;
                case 9:
                    long j49 = this.f21153b;
                    this.f21153b = j49 - 1;
                    UnsafeUtil.l(j49, (byte) (j11 >>> 56));
                    long j50 = this.f21153b;
                    this.f21153b = j50 - 1;
                    UnsafeUtil.l(j50, (byte) (((j11 >>> 49) & 127) | 128));
                    long j51 = this.f21153b;
                    this.f21153b = j51 - 1;
                    UnsafeUtil.l(j51, (byte) (((j11 >>> 42) & 127) | 128));
                    long j52 = this.f21153b;
                    this.f21153b = j52 - 1;
                    UnsafeUtil.l(j52, (byte) (((j11 >>> 35) & 127) | 128));
                    long j53 = this.f21153b;
                    this.f21153b = j53 - 1;
                    UnsafeUtil.l(j53, (byte) (((j11 >>> 28) & 127) | 128));
                    long j54 = this.f21153b;
                    this.f21153b = j54 - 1;
                    UnsafeUtil.l(j54, (byte) (((j11 >>> 21) & 127) | 128));
                    long j55 = this.f21153b;
                    this.f21153b = j55 - 1;
                    UnsafeUtil.l(j55, (byte) (((j11 >>> 14) & 127) | 128));
                    long j56 = this.f21153b;
                    this.f21153b = j56 - 1;
                    UnsafeUtil.l(j56, (byte) (((j11 >>> 7) & 127) | 128));
                    long j57 = this.f21153b;
                    this.f21153b = j57 - 1;
                    UnsafeUtil.l(j57, (byte) ((j11 & 127) | 128));
                    break;
                case 10:
                    long j58 = this.f21153b;
                    this.f21153b = j58 - 1;
                    UnsafeUtil.l(j58, (byte) (j11 >>> 63));
                    long j59 = this.f21153b;
                    this.f21153b = j59 - 1;
                    UnsafeUtil.l(j59, (byte) (((j11 >>> 56) & 127) | 128));
                    long j60 = this.f21153b;
                    this.f21153b = j60 - 1;
                    UnsafeUtil.l(j60, (byte) (((j11 >>> 49) & 127) | 128));
                    long j61 = this.f21153b;
                    this.f21153b = j61 - 1;
                    UnsafeUtil.l(j61, (byte) (((j11 >>> 42) & 127) | 128));
                    long j62 = this.f21153b;
                    this.f21153b = j62 - 1;
                    UnsafeUtil.l(j62, (byte) (((j11 >>> 35) & 127) | 128));
                    long j63 = this.f21153b;
                    this.f21153b = j63 - 1;
                    UnsafeUtil.l(j63, (byte) (((j11 >>> 28) & 127) | 128));
                    long j64 = this.f21153b;
                    this.f21153b = j64 - 1;
                    UnsafeUtil.l(j64, (byte) (((j11 >>> 21) & 127) | 128));
                    long j65 = this.f21153b;
                    this.f21153b = j65 - 1;
                    UnsafeUtil.l(j65, (byte) (((j11 >>> 14) & 127) | 128));
                    long j66 = this.f21153b;
                    this.f21153b = j66 - 1;
                    UnsafeUtil.l(j66, (byte) (((j11 >>> 7) & 127) | 128));
                    long j67 = this.f21153b;
                    this.f21153b = j67 - 1;
                    UnsafeUtil.l(j67, (byte) ((j11 & 127) | 128));
                    break;
            }
        }

        @Override // com.google.protobuf.Writer
        public final void f(int i11, int i12) {
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void j(int i11, Object obj, Schema schema) {
            schema.e(obj, this);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void k(int i11, long j11) {
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void n(int i11, String str) {
            str.length();
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void o(int i11, long j11) {
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void p(int i11, Object obj) {
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).e(obj, this);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void s(int i11, boolean z11) {
            throw null;
        }

        @Override // com.google.protobuf.Writer
        public final void t(int i11, Object obj, Schema schema) {
            c0(i11, 4);
            schema.e(obj, this);
            c0(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void v(int i11) {
            c0(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void w(int i11, ByteString byteString) {
            try {
                byteString.w(this);
                throw null;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void x(int i11, int i12) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f21154b;

        @Override // com.google.protobuf.Writer
        public final void G(int i11, long j11) {
            U(15);
            b0(j11);
            c0(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void I(int i11) {
            c0(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void O(int i11, int i12) {
            U(10);
            a0(i12);
            c0(i11, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            long j11 = this.f21154b;
            if (((int) j11) < iRemaining) {
                this.f21149a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            long j12 = j11 - ((long) iRemaining);
            this.f21154b = j12;
            byteBuffer.get(null, ((int) j12) + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            if (i11 < 0 || i11 + i12 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long j11 = this.f21154b;
            if (((int) j11) < i12) {
                this.f21149a += i12;
                AllocatedBuffer.b(bArr, i11, i12);
                throw null;
            }
            long j12 = j11 - ((long) i12);
            this.f21154b = j12;
            System.arraycopy(bArr, i11, null, ((int) j12) + 1, i12);
        }

        @Override // com.google.protobuf.BinaryWriter
        public final int T() {
            return this.f21149a + ((int) (0 - this.f21154b));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void U(int i11) {
            if (((int) this.f21154b) >= i11) {
                return;
            }
            Math.max(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void V(boolean z11) {
            byte b3 = z11 ? (byte) 1 : (byte) 0;
            long j11 = this.f21154b;
            this.f21154b = j11 - 1;
            UnsafeUtil.m(null, j11, b3);
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void W(int i11) {
            long j11 = this.f21154b;
            this.f21154b = j11 - 1;
            UnsafeUtil.m(null, j11, (byte) ((i11 >> 24) & 255));
            long j12 = this.f21154b;
            this.f21154b = j12 - 1;
            UnsafeUtil.m(null, j12, (byte) ((i11 >> 16) & 255));
            long j13 = this.f21154b;
            this.f21154b = j13 - 1;
            UnsafeUtil.m(null, j13, (byte) ((i11 >> 8) & 255));
            long j14 = this.f21154b;
            this.f21154b = j14 - 1;
            UnsafeUtil.m(null, j14, (byte) (i11 & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void X(long j11) {
            long j12 = this.f21154b;
            this.f21154b = j12 - 1;
            UnsafeUtil.m(null, j12, (byte) (((int) (j11 >> 56)) & 255));
            long j13 = this.f21154b;
            this.f21154b = j13 - 1;
            UnsafeUtil.m(null, j13, (byte) (((int) (j11 >> 48)) & 255));
            long j14 = this.f21154b;
            this.f21154b = j14 - 1;
            UnsafeUtil.m(null, j14, (byte) (((int) (j11 >> 40)) & 255));
            long j15 = this.f21154b;
            this.f21154b = j15 - 1;
            UnsafeUtil.m(null, j15, (byte) (((int) (j11 >> 32)) & 255));
            long j16 = this.f21154b;
            this.f21154b = j16 - 1;
            UnsafeUtil.m(null, j16, (byte) (((int) (j11 >> 24)) & 255));
            long j17 = this.f21154b;
            this.f21154b = j17 - 1;
            UnsafeUtil.m(null, j17, (byte) (((int) (j11 >> 16)) & 255));
            long j18 = this.f21154b;
            this.f21154b = j18 - 1;
            UnsafeUtil.m(null, j18, (byte) (((int) (j11 >> 8)) & 255));
            long j19 = this.f21154b;
            this.f21154b = j19 - 1;
            UnsafeUtil.m(null, j19, (byte) (((int) j11) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void Y(int i11) {
            if (i11 >= 0) {
                d0(i11);
            } else {
                e0(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void a0(int i11) {
            d0(CodedOutputStream.Y(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void b0(long j11) {
            e0(CodedOutputStream.Z(j11));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void c0(int i11, int i12) {
            d0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.Writer
        public final void d(int i11, int i12) {
            U(10);
            d0(i12);
            c0(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void d0(int i11) {
            if ((i11 & (-128)) == 0) {
                long j11 = this.f21154b;
                this.f21154b = j11 - 1;
                UnsafeUtil.m(null, j11, (byte) i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                long j12 = this.f21154b;
                this.f21154b = j12 - 1;
                UnsafeUtil.m(null, j12, (byte) (i11 >>> 7));
                long j13 = this.f21154b;
                this.f21154b = j13 - 1;
                UnsafeUtil.m(null, j13, (byte) ((i11 & 127) | 128));
                return;
            }
            if (((-2097152) & i11) == 0) {
                long j14 = this.f21154b;
                this.f21154b = j14 - 1;
                UnsafeUtil.m(null, j14, (byte) (i11 >>> 14));
                long j15 = this.f21154b;
                this.f21154b = j15 - 1;
                UnsafeUtil.m(null, j15, (byte) (((i11 >>> 7) & 127) | 128));
                long j16 = this.f21154b;
                this.f21154b = j16 - 1;
                UnsafeUtil.m(null, j16, (byte) ((i11 & 127) | 128));
                return;
            }
            if (((-268435456) & i11) == 0) {
                long j17 = this.f21154b;
                this.f21154b = j17 - 1;
                UnsafeUtil.m(null, j17, (byte) (i11 >>> 21));
                long j18 = this.f21154b;
                this.f21154b = j18 - 1;
                UnsafeUtil.m(null, j18, (byte) (((i11 >>> 14) & 127) | 128));
                long j19 = this.f21154b;
                this.f21154b = j19 - 1;
                UnsafeUtil.m(null, j19, (byte) (((i11 >>> 7) & 127) | 128));
                long j21 = this.f21154b;
                this.f21154b = j21 - 1;
                UnsafeUtil.m(null, j21, (byte) ((i11 & 127) | 128));
                return;
            }
            long j22 = this.f21154b;
            this.f21154b = j22 - 1;
            UnsafeUtil.m(null, j22, (byte) (i11 >>> 28));
            long j23 = this.f21154b;
            this.f21154b = j23 - 1;
            UnsafeUtil.m(null, j23, (byte) (((i11 >>> 21) & 127) | 128));
            long j24 = this.f21154b;
            this.f21154b = j24 - 1;
            UnsafeUtil.m(null, j24, (byte) (((i11 >>> 14) & 127) | 128));
            long j25 = this.f21154b;
            this.f21154b = j25 - 1;
            UnsafeUtil.m(null, j25, (byte) (((i11 >>> 7) & 127) | 128));
            long j26 = this.f21154b;
            this.f21154b = j26 - 1;
            UnsafeUtil.m(null, j26, (byte) ((i11 & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        public final void e0(long j11) {
            switch (BinaryWriter.S(j11)) {
                case 1:
                    long j12 = this.f21154b;
                    this.f21154b = j12 - 1;
                    UnsafeUtil.m(null, j12, (byte) j11);
                    break;
                case 2:
                    long j13 = this.f21154b;
                    this.f21154b = j13 - 1;
                    UnsafeUtil.m(null, j13, (byte) (j11 >>> 7));
                    long j14 = this.f21154b;
                    this.f21154b = j14 - 1;
                    UnsafeUtil.m(null, j14, (byte) ((((int) j11) & 127) | 128));
                    break;
                case 3:
                    long j15 = this.f21154b;
                    this.f21154b = j15 - 1;
                    UnsafeUtil.m(null, j15, (byte) (((int) j11) >>> 14));
                    long j16 = this.f21154b;
                    this.f21154b = j16 - 1;
                    UnsafeUtil.m(null, j16, (byte) (((j11 >>> 7) & 127) | 128));
                    long j17 = this.f21154b;
                    this.f21154b = j17 - 1;
                    UnsafeUtil.m(null, j17, (byte) ((j11 & 127) | 128));
                    break;
                case 4:
                    long j18 = this.f21154b;
                    this.f21154b = j18 - 1;
                    UnsafeUtil.m(null, j18, (byte) (j11 >>> 21));
                    long j19 = this.f21154b;
                    this.f21154b = j19 - 1;
                    UnsafeUtil.m(null, j19, (byte) (((j11 >>> 14) & 127) | 128));
                    long j21 = this.f21154b;
                    this.f21154b = j21 - 1;
                    UnsafeUtil.m(null, j21, (byte) (((j11 >>> 7) & 127) | 128));
                    long j22 = this.f21154b;
                    this.f21154b = j22 - 1;
                    UnsafeUtil.m(null, j22, (byte) ((j11 & 127) | 128));
                    break;
                case 5:
                    long j23 = this.f21154b;
                    this.f21154b = j23 - 1;
                    UnsafeUtil.m(null, j23, (byte) (j11 >>> 28));
                    long j24 = this.f21154b;
                    this.f21154b = j24 - 1;
                    UnsafeUtil.m(null, j24, (byte) (((j11 >>> 21) & 127) | 128));
                    long j25 = this.f21154b;
                    this.f21154b = j25 - 1;
                    UnsafeUtil.m(null, j25, (byte) (((j11 >>> 14) & 127) | 128));
                    long j26 = this.f21154b;
                    this.f21154b = j26 - 1;
                    UnsafeUtil.m(null, j26, (byte) (((j11 >>> 7) & 127) | 128));
                    long j27 = this.f21154b;
                    this.f21154b = j27 - 1;
                    UnsafeUtil.m(null, j27, (byte) ((j11 & 127) | 128));
                    break;
                case 6:
                    long j28 = this.f21154b;
                    this.f21154b = j28 - 1;
                    UnsafeUtil.m(null, j28, (byte) (j11 >>> 35));
                    long j29 = this.f21154b;
                    this.f21154b = j29 - 1;
                    UnsafeUtil.m(null, j29, (byte) (((j11 >>> 28) & 127) | 128));
                    long j30 = this.f21154b;
                    this.f21154b = j30 - 1;
                    UnsafeUtil.m(null, j30, (byte) (((j11 >>> 21) & 127) | 128));
                    long j31 = this.f21154b;
                    this.f21154b = j31 - 1;
                    UnsafeUtil.m(null, j31, (byte) (((j11 >>> 14) & 127) | 128));
                    long j32 = this.f21154b;
                    this.f21154b = j32 - 1;
                    UnsafeUtil.m(null, j32, (byte) (((j11 >>> 7) & 127) | 128));
                    long j33 = this.f21154b;
                    this.f21154b = j33 - 1;
                    UnsafeUtil.m(null, j33, (byte) ((j11 & 127) | 128));
                    break;
                case 7:
                    long j34 = this.f21154b;
                    this.f21154b = j34 - 1;
                    UnsafeUtil.m(null, j34, (byte) (j11 >>> 42));
                    long j35 = this.f21154b;
                    this.f21154b = j35 - 1;
                    UnsafeUtil.m(null, j35, (byte) (((j11 >>> 35) & 127) | 128));
                    long j36 = this.f21154b;
                    this.f21154b = j36 - 1;
                    UnsafeUtil.m(null, j36, (byte) (((j11 >>> 28) & 127) | 128));
                    long j37 = this.f21154b;
                    this.f21154b = j37 - 1;
                    UnsafeUtil.m(null, j37, (byte) (((j11 >>> 21) & 127) | 128));
                    long j38 = this.f21154b;
                    this.f21154b = j38 - 1;
                    UnsafeUtil.m(null, j38, (byte) (((j11 >>> 14) & 127) | 128));
                    long j39 = this.f21154b;
                    this.f21154b = j39 - 1;
                    UnsafeUtil.m(null, j39, (byte) (((j11 >>> 7) & 127) | 128));
                    long j40 = this.f21154b;
                    this.f21154b = j40 - 1;
                    UnsafeUtil.m(null, j40, (byte) ((j11 & 127) | 128));
                    break;
                case 8:
                    long j41 = this.f21154b;
                    this.f21154b = j41 - 1;
                    UnsafeUtil.m(null, j41, (byte) (j11 >>> 49));
                    long j42 = this.f21154b;
                    this.f21154b = j42 - 1;
                    UnsafeUtil.m(null, j42, (byte) (((j11 >>> 42) & 127) | 128));
                    long j43 = this.f21154b;
                    this.f21154b = j43 - 1;
                    UnsafeUtil.m(null, j43, (byte) (((j11 >>> 35) & 127) | 128));
                    long j44 = this.f21154b;
                    this.f21154b = j44 - 1;
                    UnsafeUtil.m(null, j44, (byte) (((j11 >>> 28) & 127) | 128));
                    long j45 = this.f21154b;
                    this.f21154b = j45 - 1;
                    UnsafeUtil.m(null, j45, (byte) (((j11 >>> 21) & 127) | 128));
                    long j46 = this.f21154b;
                    this.f21154b = j46 - 1;
                    UnsafeUtil.m(null, j46, (byte) (((j11 >>> 14) & 127) | 128));
                    long j47 = this.f21154b;
                    this.f21154b = j47 - 1;
                    UnsafeUtil.m(null, j47, (byte) (((j11 >>> 7) & 127) | 128));
                    long j48 = this.f21154b;
                    this.f21154b = j48 - 1;
                    UnsafeUtil.m(null, j48, (byte) ((j11 & 127) | 128));
                    break;
                case 9:
                    long j49 = this.f21154b;
                    this.f21154b = j49 - 1;
                    UnsafeUtil.m(null, j49, (byte) (j11 >>> 56));
                    long j50 = this.f21154b;
                    this.f21154b = j50 - 1;
                    UnsafeUtil.m(null, j50, (byte) (((j11 >>> 49) & 127) | 128));
                    long j51 = this.f21154b;
                    this.f21154b = j51 - 1;
                    UnsafeUtil.m(null, j51, (byte) (((j11 >>> 42) & 127) | 128));
                    long j52 = this.f21154b;
                    this.f21154b = j52 - 1;
                    UnsafeUtil.m(null, j52, (byte) (((j11 >>> 35) & 127) | 128));
                    long j53 = this.f21154b;
                    this.f21154b = j53 - 1;
                    UnsafeUtil.m(null, j53, (byte) (((j11 >>> 28) & 127) | 128));
                    long j54 = this.f21154b;
                    this.f21154b = j54 - 1;
                    UnsafeUtil.m(null, j54, (byte) (((j11 >>> 21) & 127) | 128));
                    long j55 = this.f21154b;
                    this.f21154b = j55 - 1;
                    UnsafeUtil.m(null, j55, (byte) (((j11 >>> 14) & 127) | 128));
                    long j56 = this.f21154b;
                    this.f21154b = j56 - 1;
                    UnsafeUtil.m(null, j56, (byte) (((j11 >>> 7) & 127) | 128));
                    long j57 = this.f21154b;
                    this.f21154b = j57 - 1;
                    UnsafeUtil.m(null, j57, (byte) ((j11 & 127) | 128));
                    break;
                case 10:
                    long j58 = this.f21154b;
                    this.f21154b = j58 - 1;
                    UnsafeUtil.m(null, j58, (byte) (j11 >>> 63));
                    long j59 = this.f21154b;
                    this.f21154b = j59 - 1;
                    UnsafeUtil.m(null, j59, (byte) (((j11 >>> 56) & 127) | 128));
                    long j60 = this.f21154b;
                    this.f21154b = j60 - 1;
                    UnsafeUtil.m(null, j60, (byte) (((j11 >>> 49) & 127) | 128));
                    long j61 = this.f21154b;
                    this.f21154b = j61 - 1;
                    UnsafeUtil.m(null, j61, (byte) (((j11 >>> 42) & 127) | 128));
                    long j62 = this.f21154b;
                    this.f21154b = j62 - 1;
                    UnsafeUtil.m(null, j62, (byte) (((j11 >>> 35) & 127) | 128));
                    long j63 = this.f21154b;
                    this.f21154b = j63 - 1;
                    UnsafeUtil.m(null, j63, (byte) (((j11 >>> 28) & 127) | 128));
                    long j64 = this.f21154b;
                    this.f21154b = j64 - 1;
                    UnsafeUtil.m(null, j64, (byte) (((j11 >>> 21) & 127) | 128));
                    long j65 = this.f21154b;
                    this.f21154b = j65 - 1;
                    UnsafeUtil.m(null, j65, (byte) (((j11 >>> 14) & 127) | 128));
                    long j66 = this.f21154b;
                    this.f21154b = j66 - 1;
                    UnsafeUtil.m(null, j66, (byte) (((j11 >>> 7) & 127) | 128));
                    long j67 = this.f21154b;
                    this.f21154b = j67 - 1;
                    UnsafeUtil.m(null, j67, (byte) ((j11 & 127) | 128));
                    break;
            }
        }

        @Override // com.google.protobuf.Writer
        public final void f(int i11, int i12) {
            U(9);
            W(i12);
            c0(i11, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void j(int i11, Object obj, Schema schema) {
            int iT = T();
            schema.e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            c0(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void k(int i11, long j11) {
            U(13);
            X(j11);
            c0(i11, 1);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0074  */
        /* JADX WARN: Code duplicated, block: B:26:0x0079  */
        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code duplicated, block: B:37:0x0106  */
        /* JADX WARN: Code duplicated, block: B:44:0x00fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x00fe A[SYNTHETIC] */
        @Override // com.google.protobuf.Writer
        public final void n(int i11, String str) {
            long j11;
            char cCharAt;
            long j12;
            char cCharAt2;
            int iT = T();
            U(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                long j13 = this.f21154b;
                this.f21154b = j13 - 1;
                UnsafeUtil.m(null, j13, (byte) cCharAt2);
            }
            if (length != -1) {
                while (length >= 0) {
                    char cCharAt3 = str.charAt(length);
                    if (cCharAt3 < 128) {
                        long j14 = this.f21154b;
                        if (j14 > 0) {
                            this.f21154b = j14 - 1;
                            UnsafeUtil.m(null, j14, (byte) cCharAt3);
                        } else if (cCharAt3 < 2048) {
                            j12 = this.f21154b;
                            if (j12 > 0) {
                                this.f21154b = j12 - 1;
                                UnsafeUtil.m(null, j12, (byte) ((cCharAt3 & '?') | 128));
                                long j15 = this.f21154b;
                                this.f21154b = j15 - 1;
                                UnsafeUtil.m(null, j15, (byte) ((cCharAt3 >>> 6) | 960));
                            } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                                j11 = this.f21154b;
                                if (j11 > 1) {
                                    this.f21154b = j11 - 1;
                                    UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                                    long j16 = this.f21154b;
                                    this.f21154b = j16 - 1;
                                    UnsafeUtil.m(null, j16, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                    long j17 = this.f21154b;
                                    this.f21154b = j17 - 1;
                                    UnsafeUtil.m(null, j17, (byte) ((cCharAt3 >>> '\f') | 480));
                                } else {
                                    if (this.f21154b > 2) {
                                        if (length != 0) {
                                            cCharAt = str.charAt(length - 1);
                                            if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                                length--;
                                                int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                                long j18 = this.f21154b;
                                                this.f21154b = j18 - 1;
                                                UnsafeUtil.m(null, j18, (byte) ((codePoint & 63) | 128));
                                                long j19 = this.f21154b;
                                                this.f21154b = j19 - 1;
                                                UnsafeUtil.m(null, j19, (byte) (((codePoint >>> 6) & 63) | 128));
                                                long j21 = this.f21154b;
                                                this.f21154b = j21 - 1;
                                                UnsafeUtil.m(null, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                                                long j22 = this.f21154b;
                                                this.f21154b = j22 - 1;
                                                UnsafeUtil.m(null, j22, (byte) ((codePoint >>> 18) | 240));
                                            }
                                        }
                                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                    }
                                    U(length);
                                    length++;
                                }
                            } else {
                                if (this.f21154b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j110 = this.f21154b;
                                            this.f21154b = j110 - 1;
                                            UnsafeUtil.m(null, j110, (byte) ((codePoint2 & 63) | 128));
                                            long j111 = this.f21154b;
                                            this.f21154b = j111 - 1;
                                            UnsafeUtil.m(null, j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            long j23 = this.f21154b;
                                            this.f21154b = j23 - 1;
                                            UnsafeUtil.m(null, j23, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j24 = this.f21154b;
                                            this.f21154b = j24 - 1;
                                            UnsafeUtil.m(null, j24, (byte) ((codePoint2 >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                U(length);
                                length++;
                            }
                        } else if (cCharAt3 >= 55296) {
                            j11 = this.f21154b;
                            if (j11 > 1) {
                                this.f21154b = j11 - 1;
                                UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                                long j112 = this.f21154b;
                                this.f21154b = j112 - 1;
                                UnsafeUtil.m(null, j112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j113 = this.f21154b;
                                this.f21154b = j113 - 1;
                                UnsafeUtil.m(null, j113, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f21154b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j114 = this.f21154b;
                                            this.f21154b = j114 - 1;
                                            UnsafeUtil.m(null, j114, (byte) ((codePoint3 & 63) | 128));
                                            long j115 = this.f21154b;
                                            this.f21154b = j115 - 1;
                                            UnsafeUtil.m(null, j115, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                            long j25 = this.f21154b;
                                            this.f21154b = j25 - 1;
                                            UnsafeUtil.m(null, j25, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                            long j26 = this.f21154b;
                                            this.f21154b = j26 - 1;
                                            UnsafeUtil.m(null, j26, (byte) ((codePoint3 >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                U(length);
                                length++;
                            }
                        } else {
                            j11 = this.f21154b;
                            if (j11 > 1) {
                                this.f21154b = j11 - 1;
                                UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                                long j116 = this.f21154b;
                                this.f21154b = j116 - 1;
                                UnsafeUtil.m(null, j116, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j117 = this.f21154b;
                                this.f21154b = j117 - 1;
                                UnsafeUtil.m(null, j117, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f21154b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j118 = this.f21154b;
                                            this.f21154b = j118 - 1;
                                            UnsafeUtil.m(null, j118, (byte) ((codePoint4 & 63) | 128));
                                            long j119 = this.f21154b;
                                            this.f21154b = j119 - 1;
                                            UnsafeUtil.m(null, j119, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                            long j27 = this.f21154b;
                                            this.f21154b = j27 - 1;
                                            UnsafeUtil.m(null, j27, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                            long j28 = this.f21154b;
                                            this.f21154b = j28 - 1;
                                            UnsafeUtil.m(null, j28, (byte) ((codePoint4 >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                U(length);
                                length++;
                            }
                        }
                    } else if (cCharAt3 < 2048) {
                        j12 = this.f21154b;
                        if (j12 > 0) {
                            this.f21154b = j12 - 1;
                            UnsafeUtil.m(null, j12, (byte) ((cCharAt3 & '?') | 128));
                            long j120 = this.f21154b;
                            this.f21154b = j120 - 1;
                            UnsafeUtil.m(null, j120, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296) {
                            j11 = this.f21154b;
                            if (j11 > 1) {
                                this.f21154b = j11 - 1;
                                UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                                long j1110 = this.f21154b;
                                this.f21154b = j1110 - 1;
                                UnsafeUtil.m(null, j1110, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j1111 = this.f21154b;
                                this.f21154b = j1111 - 1;
                                UnsafeUtil.m(null, j1111, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f21154b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j1112 = this.f21154b;
                                            this.f21154b = j1112 - 1;
                                            UnsafeUtil.m(null, j1112, (byte) ((codePoint5 & 63) | 128));
                                            long j1113 = this.f21154b;
                                            this.f21154b = j1113 - 1;
                                            UnsafeUtil.m(null, j1113, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                            long j29 = this.f21154b;
                                            this.f21154b = j29 - 1;
                                            UnsafeUtil.m(null, j29, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                            long j210 = this.f21154b;
                                            this.f21154b = j210 - 1;
                                            UnsafeUtil.m(null, j210, (byte) ((codePoint5 >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                U(length);
                                length++;
                            }
                        } else {
                            j11 = this.f21154b;
                            if (j11 > 1) {
                                this.f21154b = j11 - 1;
                                UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                                long j1114 = this.f21154b;
                                this.f21154b = j1114 - 1;
                                UnsafeUtil.m(null, j1114, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j1115 = this.f21154b;
                                this.f21154b = j1115 - 1;
                                UnsafeUtil.m(null, j1115, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f21154b > 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j1116 = this.f21154b;
                                            this.f21154b = j1116 - 1;
                                            UnsafeUtil.m(null, j1116, (byte) ((codePoint6 & 63) | 128));
                                            long j1117 = this.f21154b;
                                            this.f21154b = j1117 - 1;
                                            UnsafeUtil.m(null, j1117, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                            long j211 = this.f21154b;
                                            this.f21154b = j211 - 1;
                                            UnsafeUtil.m(null, j211, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                            long j212 = this.f21154b;
                                            this.f21154b = j212 - 1;
                                            UnsafeUtil.m(null, j212, (byte) ((codePoint6 >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                U(length);
                                length++;
                            }
                        }
                    } else if (cCharAt3 >= 55296) {
                        j11 = this.f21154b;
                        if (j11 > 1) {
                            this.f21154b = j11 - 1;
                            UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                            long j1118 = this.f21154b;
                            this.f21154b = j1118 - 1;
                            UnsafeUtil.m(null, j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1119 = this.f21154b;
                            this.f21154b = j1119 - 1;
                            UnsafeUtil.m(null, j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f21154b > 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11110 = this.f21154b;
                                        this.f21154b = j11110 - 1;
                                        UnsafeUtil.m(null, j11110, (byte) ((codePoint7 & 63) | 128));
                                        long j11111 = this.f21154b;
                                        this.f21154b = j11111 - 1;
                                        UnsafeUtil.m(null, j11111, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                        long j213 = this.f21154b;
                                        this.f21154b = j213 - 1;
                                        UnsafeUtil.m(null, j213, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                        long j214 = this.f21154b;
                                        this.f21154b = j214 - 1;
                                        UnsafeUtil.m(null, j214, (byte) ((codePoint7 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            U(length);
                            length++;
                        }
                    } else {
                        j11 = this.f21154b;
                        if (j11 > 1) {
                            this.f21154b = j11 - 1;
                            UnsafeUtil.m(null, j11, (byte) ((cCharAt3 & '?') | 128));
                            long j11112 = this.f21154b;
                            this.f21154b = j11112 - 1;
                            UnsafeUtil.m(null, j11112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j11113 = this.f21154b;
                            this.f21154b = j11113 - 1;
                            UnsafeUtil.m(null, j11113, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f21154b > 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11114 = this.f21154b;
                                        this.f21154b = j11114 - 1;
                                        UnsafeUtil.m(null, j11114, (byte) ((codePoint8 & 63) | 128));
                                        long j11115 = this.f21154b;
                                        this.f21154b = j11115 - 1;
                                        UnsafeUtil.m(null, j11115, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                        long j215 = this.f21154b;
                                        this.f21154b = j215 - 1;
                                        UnsafeUtil.m(null, j215, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                        long j216 = this.f21154b;
                                        this.f21154b = j216 - 1;
                                        UnsafeUtil.m(null, j216, (byte) ((codePoint8 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            U(length);
                            length++;
                        }
                    }
                    length--;
                }
            }
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            c0(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void o(int i11, long j11) {
            U(15);
            e0(j11);
            c0(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void p(int i11, Object obj) {
            int iT = T();
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).e(obj, this);
            int iT2 = T() - iT;
            U(10);
            d0(iT2);
            c0(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void s(int i11, boolean z11) {
            U(6);
            byte b3 = z11 ? (byte) 1 : (byte) 0;
            long j11 = this.f21154b;
            this.f21154b = j11 - 1;
            UnsafeUtil.m(null, j11, b3);
            c0(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void t(int i11, Object obj, Schema schema) {
            c0(i11, 4);
            schema.e(obj, this);
            c0(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void v(int i11) {
            c0(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void w(int i11, ByteString byteString) {
            try {
                byteString.w(this);
                U(10);
                d0(byteString.size());
                c0(i11, 2);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void x(int i11, int i12) {
            U(15);
            Y(i12);
            c0(i11, 0);
        }
    }

    public static byte S(long j11) {
        byte b3;
        if (((-128) & j11) == 0) {
            return (byte) 1;
        }
        if (j11 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j11) != 0) {
            b3 = (byte) 6;
            j11 >>>= 28;
        } else {
            b3 = 2;
        }
        if (((-2097152) & j11) != 0) {
            b3 = (byte) (b3 + 2);
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? (byte) (b3 + 1) : b3;
    }

    public static final void Z(BinaryWriter binaryWriter, int i11, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.f21150a[fieldType.ordinal()]) {
            case 1:
                binaryWriter.s(i11, ((Boolean) obj).booleanValue());
                return;
            case 2:
                binaryWriter.f(i11, ((Integer) obj).intValue());
                return;
            case 3:
                binaryWriter.k(i11, ((Long) obj).longValue());
                return;
            case 4:
                binaryWriter.x(i11, ((Integer) obj).intValue());
                return;
            case 5:
                binaryWriter.o(i11, ((Long) obj).longValue());
                return;
            case 6:
                binaryWriter.f(i11, ((Integer) obj).intValue());
                return;
            case 7:
                binaryWriter.k(i11, ((Long) obj).longValue());
                return;
            case 8:
                binaryWriter.O(i11, ((Integer) obj).intValue());
                return;
            case 9:
                binaryWriter.G(i11, ((Long) obj).longValue());
                return;
            case 10:
                binaryWriter.n(i11, (String) obj);
                return;
            case 11:
                binaryWriter.d(i11, ((Integer) obj).intValue());
                return;
            case 12:
                binaryWriter.o(i11, ((Long) obj).longValue());
                return;
            case 13:
                binaryWriter.H(i11, ((Float) obj).floatValue());
                return;
            case 14:
                binaryWriter.g(i11, ((Double) obj).doubleValue());
                return;
            case 15:
                binaryWriter.p(i11, obj);
                return;
            case 16:
                binaryWriter.w(i11, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    binaryWriter.x(i11, ((Internal.EnumLite) obj).d());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    binaryWriter.x(i11, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void A(int i11, long j11) {
        k(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void B(int i11, List list, boolean z11) {
        if (!(list instanceof IntArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    f(i11, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 4) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(((Integer) list.get(size2)).intValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z11) {
            for (int i12 = intArrayList.f21281c - 1; i12 >= 0; i12--) {
                f(i11, intArrayList.f(i12));
            }
            return;
        }
        U((intArrayList.f21281c * 4) + 10);
        int iT2 = T();
        for (int i13 = intArrayList.f21281c - 1; i13 >= 0; i13--) {
            W(intArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void C(int i11, List list, boolean z11) {
        if (!(list instanceof BooleanArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    s(i11, ((Boolean) list.get(size)).booleanValue());
                }
                return;
            }
            U(list.size() + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                V(((Boolean) list.get(size2)).booleanValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z11) {
            for (int i12 = booleanArrayList.f21157c - 1; i12 >= 0; i12--) {
                booleanArrayList.e(i12);
                s(i11, booleanArrayList.f21156b[i12]);
            }
            return;
        }
        U(booleanArrayList.f21157c + 10);
        int iT2 = T();
        for (int i13 = booleanArrayList.f21157c - 1; i13 >= 0; i13--) {
            booleanArrayList.e(i13);
            V(booleanArrayList.f21156b[i13]);
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void D(int i11, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int iT = T();
            Z(this, 2, metadata.f21315b, entry.getValue());
            Z(this, 1, metadata.f21314a, entry.getKey());
            d0(T() - iT);
            c0(i11, 2);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void E(int i11, List list, boolean z11) {
        if (!(list instanceof IntArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    d(i11, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 5) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                d0(((Integer) list.get(size2)).intValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z11) {
            for (int i12 = intArrayList.f21281c - 1; i12 >= 0; i12--) {
                d(i11, intArrayList.f(i12));
            }
            return;
        }
        U((intArrayList.f21281c * 5) + 10);
        int iT2 = T();
        for (int i13 = intArrayList.f21281c - 1; i13 >= 0; i13--) {
            d0(intArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void F(int i11, List list, boolean z11) {
        if (!(list instanceof LongArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    G(i11, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                b0(((Long) list.get(size2)).longValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z11) {
            for (int i12 = longArrayList.f21306c - 1; i12 >= 0; i12--) {
                G(i11, longArrayList.f(i12));
            }
            return;
        }
        U((longArrayList.f21306c * 10) + 10);
        int iT2 = T();
        for (int i13 = longArrayList.f21306c - 1; i13 >= 0; i13--) {
            b0(longArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void H(int i11, float f5) {
        f(i11, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.protobuf.Writer
    public final void J(int i11, List list, boolean z11) {
        if (!(list instanceof IntArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    O(i11, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 5) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                a0(((Integer) list.get(size2)).intValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z11) {
            for (int i12 = intArrayList.f21281c - 1; i12 >= 0; i12--) {
                O(i11, intArrayList.f(i12));
            }
            return;
        }
        U((intArrayList.f21281c * 5) + 10);
        int iT2 = T();
        for (int i13 = intArrayList.f21281c - 1; i13 >= 0; i13--) {
            a0(intArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void K(int i11, int i12) {
        x(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void L(int i11, List list, boolean z11) {
        i(i11, list, z11);
    }

    @Override // com.google.protobuf.Writer
    public final void M(int i11, List list, boolean z11) {
        q(i11, list, z11);
    }

    @Override // com.google.protobuf.Writer
    public final void N(int i11, List list, boolean z11) {
        if (!(list instanceof DoubleArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    g(i11, ((Double) list.get(size)).doubleValue());
                }
                return;
            }
            U((list.size() * 8) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(Double.doubleToRawLongBits(((Double) list.get(size2)).doubleValue()));
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z11) {
            for (int i12 = doubleArrayList.f21233c - 1; i12 >= 0; i12--) {
                doubleArrayList.e(i12);
                g(i11, doubleArrayList.f21232b[i12]);
            }
            return;
        }
        U((doubleArrayList.f21233c * 8) + 10);
        int iT2 = T();
        for (int i13 = doubleArrayList.f21233c - 1; i13 >= 0; i13--) {
            doubleArrayList.e(i13);
            X(Double.doubleToRawLongBits(doubleArrayList.f21232b[i13]));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void P(int i11, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            w(i11, (ByteString) list.get(size));
        }
    }

    public abstract int T();

    public abstract void U(int i11);

    public abstract void V(boolean z11);

    public abstract void W(int i11);

    public abstract void X(long j11);

    public abstract void Y(int i11);

    @Override // com.google.protobuf.Writer
    public final void a(int i11, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            j(i11, list.get(size), schema);
        }
    }

    public abstract void a0(int i11);

    @Override // com.google.protobuf.Writer
    public final void b(int i11, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            t(i11, list.get(size), schema);
        }
    }

    public abstract void b0(long j11);

    @Override // com.google.protobuf.Writer
    public final void c(int i11, List list, boolean z11) {
        if (!(list instanceof FloatArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    H(i11, ((Float) list.get(size)).floatValue());
                }
                return;
            }
            U((list.size() * 4) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(Float.floatToRawIntBits(((Float) list.get(size2)).floatValue()));
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z11) {
            for (int i12 = floatArrayList.f21261c - 1; i12 >= 0; i12--) {
                floatArrayList.e(i12);
                H(i11, floatArrayList.f21260b[i12]);
            }
            return;
        }
        U((floatArrayList.f21261c * 4) + 10);
        int iT2 = T();
        for (int i13 = floatArrayList.f21261c - 1; i13 >= 0; i13--) {
            floatArrayList.e(i13);
            W(Float.floatToRawIntBits(floatArrayList.f21260b[i13]));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    public abstract void c0(int i11, int i12);

    public abstract void d0(int i11);

    @Override // com.google.protobuf.Writer
    public final void e(int i11, Object obj) {
        c0(1, 4);
        if (obj instanceof ByteString) {
            w(3, (ByteString) obj);
        } else {
            p(3, obj);
        }
        d(2, i11);
        c0(1, 3);
    }

    public abstract void e0(long j11);

    @Override // com.google.protobuf.Writer
    public final void g(int i11, double d5) {
        k(i11, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.protobuf.Writer
    public final void h(int i11, List list, boolean z11) {
        y(i11, list, z11);
    }

    @Override // com.google.protobuf.Writer
    public final void i(int i11, List list, boolean z11) {
        if (!(list instanceof LongArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    o(i11, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                e0(((Long) list.get(size2)).longValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z11) {
            for (int i12 = longArrayList.f21306c - 1; i12 >= 0; i12--) {
                o(i11, longArrayList.f(i12));
            }
            return;
        }
        U((longArrayList.f21306c * 10) + 10);
        int iT2 = T();
        for (int i13 = longArrayList.f21306c - 1; i13 >= 0; i13--) {
            e0(longArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder l() {
        return Writer.FieldOrder.DESCENDING;
    }

    @Override // com.google.protobuf.Writer
    public final void m(int i11, List list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n(i11, (String) list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object objJ1 = lazyStringList.j1(size2);
            if (objJ1 instanceof String) {
                n(i11, (String) objJ1);
            } else {
                w(i11, (ByteString) objJ1);
            }
        }
    }

    @Override // com.google.protobuf.Writer
    public final void q(int i11, List list, boolean z11) {
        if (!(list instanceof IntArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    x(i11, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U((list.size() * 10) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Y(((Integer) list.get(size2)).intValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z11) {
            for (int i12 = intArrayList.f21281c - 1; i12 >= 0; i12--) {
                x(i11, intArrayList.f(i12));
            }
            return;
        }
        U((intArrayList.f21281c * 10) + 10);
        int iT2 = T();
        for (int i13 = intArrayList.f21281c - 1; i13 >= 0; i13--) {
            Y(intArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void r(int i11, long j11) {
        o(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void u(int i11, int i12) {
        f(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void y(int i11, List list, boolean z11) {
        if (!(list instanceof LongArrayList)) {
            if (!z11) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    k(i11, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U((list.size() * 8) + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(((Long) list.get(size2)).longValue());
            }
            d0(T() - iT);
            c0(i11, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z11) {
            for (int i12 = longArrayList.f21306c - 1; i12 >= 0; i12--) {
                k(i11, longArrayList.f(i12));
            }
            return;
        }
        U((longArrayList.f21306c * 8) + 10);
        int iT2 = T();
        for (int i13 = longArrayList.f21306c - 1; i13 >= 0; i13--) {
            X(longArrayList.f(i13));
        }
        d0(T() - iT2);
        c0(i11, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void z(int i11, List list, boolean z11) {
        B(i11, list, z11);
    }
}
