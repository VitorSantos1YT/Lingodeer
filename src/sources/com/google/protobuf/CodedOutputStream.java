package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f21211b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f21212c = UnsafeUtil.f21419e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CodedOutputStreamWriter f21213a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f21214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21216f;

        public AbstractBufferedEncoder(int i11) {
            super(0);
            if (i11 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int iMax = Math.max(i11, 20);
            this.f21214d = new byte[iMax];
            this.f21215e = iMax;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int c0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void s0(byte b3) {
            int i11 = this.f21216f;
            this.f21216f = i11 + 1;
            this.f21214d[i11] = b3;
        }

        public final void t0(int i11) {
            int i12 = this.f21216f;
            int i13 = i12 + 1;
            this.f21216f = i13;
            byte[] bArr = this.f21214d;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.f21216f = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.f21216f = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.f21216f = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        }

        public final void u0(long j11) {
            int i11 = this.f21216f;
            int i12 = i11 + 1;
            this.f21216f = i12;
            byte[] bArr = this.f21214d;
            bArr[i11] = (byte) (j11 & 255);
            int i13 = i11 + 2;
            this.f21216f = i13;
            bArr[i12] = (byte) ((j11 >> 8) & 255);
            int i14 = i11 + 3;
            this.f21216f = i14;
            bArr[i13] = (byte) ((j11 >> 16) & 255);
            int i15 = i11 + 4;
            this.f21216f = i15;
            bArr[i14] = (byte) (255 & (j11 >> 24));
            int i16 = i11 + 5;
            this.f21216f = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.f21216f = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.f21216f = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.f21216f = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        }

        public final void v0(int i11, int i12) {
            w0((i11 << 3) | i12);
        }

        public final void w0(int i11) {
            boolean z11 = CodedOutputStream.f21212c;
            byte[] bArr = this.f21214d;
            if (z11) {
                while ((i11 & (-128)) != 0) {
                    int i12 = this.f21216f;
                    this.f21216f = i12 + 1;
                    UnsafeUtil.m(bArr, i12, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                int i13 = this.f21216f;
                this.f21216f = i13 + 1;
                UnsafeUtil.m(bArr, i13, (byte) i11);
                return;
            }
            while ((i11 & (-128)) != 0) {
                int i14 = this.f21216f;
                this.f21216f = i14 + 1;
                bArr[i14] = (byte) ((i11 & 127) | 128);
                i11 >>>= 7;
            }
            int i15 = this.f21216f;
            this.f21216f = i15 + 1;
            bArr[i15] = (byte) i11;
        }

        public final void x0(long j11) {
            boolean z11 = CodedOutputStream.f21212c;
            byte[] bArr = this.f21214d;
            if (z11) {
                while ((j11 & (-128)) != 0) {
                    int i11 = this.f21216f;
                    this.f21216f = i11 + 1;
                    UnsafeUtil.m(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                int i12 = this.f21216f;
                this.f21216f = i12 + 1;
                UnsafeUtil.m(bArr, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                int i13 = this.f21216f;
                this.f21216f = i13 + 1;
                bArr[i13] = (byte) ((((int) j11) & 127) | 128);
                j11 >>>= 7;
            }
            int i14 = this.f21216f;
            this.f21216f = i14 + 1;
            bArr[i14] = (byte) j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ArrayEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f21217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21219f;

        public ArrayEncoder(byte[] bArr, int i11, int i12) {
            super(0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            this.f21217d = bArr;
            this.f21219f = i11;
            this.f21218e = i13;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f21217d, this.f21219f, iRemaining);
                this.f21219f += iRemaining;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), Integer.valueOf(iRemaining)), e8);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            s0(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int c0() {
            return this.f21218e - this.f21219f;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 0);
            q0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d0(byte b3) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f21217d;
                int i11 = this.f21219f;
                this.f21219f = i11 + 1;
                bArr[i11] = b3;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e0(byte[] bArr, int i11) throws OutOfSpaceException {
            q0(i11);
            s0(bArr, 0, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 5);
            g0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(ByteString byteString) throws OutOfSpaceException {
            q0(byteString.size());
            byteString.v(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i11) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f21217d;
                int i12 = this.f21219f;
                int i13 = i12 + 1;
                this.f21219f = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i12 + 2;
                this.f21219f = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i12 + 3;
                this.f21219f = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.f21219f = i12 + 4;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(long j11) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f21217d;
                int i11 = this.f21219f;
                int i12 = i11 + 1;
                this.f21219f = i12;
                bArr[i11] = (byte) (((int) j11) & 255);
                int i13 = i11 + 2;
                this.f21219f = i13;
                bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
                int i14 = i11 + 3;
                this.f21219f = i14;
                bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
                int i15 = i11 + 4;
                this.f21219f = i15;
                bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
                int i16 = i11 + 5;
                this.f21219f = i16;
                bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
                int i17 = i11 + 6;
                this.f21219f = i17;
                bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
                int i18 = i11 + 7;
                this.f21219f = i18;
                bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
                this.f21219f = i11 + 8;
                bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(int i11) throws OutOfSpaceException {
            if (i11 >= 0) {
                q0(i11);
            } else {
                r0(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i11, MessageLite messageLite) throws OutOfSpaceException {
            p0(i11, 2);
            l0(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k(int i11, long j11) throws OutOfSpaceException {
            p0(i11, 1);
            h0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i11, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            p0(i11, 2);
            q0(((AbstractMessageLite) messageLite).k(schema));
            schema.e(messageLite, this.f21213a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(MessageLite messageLite) throws OutOfSpaceException {
            q0(messageLite.h());
            messageLite.d(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i11, MessageLite messageLite) throws OutOfSpaceException {
            p0(1, 3);
            d(2, i11);
            j0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n(int i11, String str) throws OutOfSpaceException {
            p0(i11, 2);
            o0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i11, ByteString byteString) throws OutOfSpaceException {
            p0(1, 3);
            d(2, i11);
            w(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o(int i11, long j11) throws OutOfSpaceException {
            p0(i11, 0);
            r0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(String str) throws OutOfSpaceException {
            int i11 = this.f21219f;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                byte[] bArr = this.f21217d;
                if (iW2 != iW) {
                    q0(Utf8.d(str));
                    this.f21219f = Utf8.f21424a.d(str, bArr, this.f21219f, c0());
                    return;
                }
                int i12 = i11 + iW2;
                this.f21219f = i12;
                int iD = Utf8.f21424a.d(str, bArr, i12, c0());
                this.f21219f = i11;
                q0((iD - i11) - iW2);
                this.f21219f = iD;
            } catch (Utf8.UnpairedSurrogateException e8) {
                this.f21219f = i11;
                a0(str, e8);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i11, int i12) throws OutOfSpaceException {
            q0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i11) throws OutOfSpaceException {
            while (true) {
                int i12 = i11 & (-128);
                byte[] bArr = this.f21217d;
                if (i12 == 0) {
                    int i13 = this.f21219f;
                    this.f21219f = i13 + 1;
                    bArr[i13] = (byte) i11;
                    return;
                } else {
                    try {
                        int i14 = this.f21219f;
                        this.f21219f = i14 + 1;
                        bArr[i14] = (byte) ((i11 & 127) | 128);
                        i11 >>>= 7;
                    } catch (IndexOutOfBoundsException e8) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(long j11) throws OutOfSpaceException {
            boolean z11 = CodedOutputStream.f21212c;
            byte[] bArr = this.f21217d;
            if (z11 && c0() >= 10) {
                while ((j11 & (-128)) != 0) {
                    int i11 = this.f21219f;
                    this.f21219f = i11 + 1;
                    UnsafeUtil.m(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                int i12 = this.f21219f;
                this.f21219f = i12 + 1;
                UnsafeUtil.m(bArr, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    int i13 = this.f21219f;
                    this.f21219f = i13 + 1;
                    bArr[i13] = (byte) ((((int) j11) & 127) | 128);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), 1), e8);
                }
            }
            int i14 = this.f21219f;
            this.f21219f = i14 + 1;
            bArr[i14] = (byte) j11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s(int i11, boolean z11) throws OutOfSpaceException {
            p0(i11, 0);
            d0(z11 ? (byte) 1 : (byte) 0);
        }

        public final void s0(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i11, this.f21217d, this.f21219f, i12);
                this.f21219f += i12;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21219f), Integer.valueOf(this.f21218e), Integer.valueOf(i12)), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w(int i11, ByteString byteString) throws OutOfSpaceException {
            p0(i11, 2);
            f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 0);
            i0(i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            if (this.f21216f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            if (this.f21216f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d(int i11, int i12) {
            y0(20);
            v0(i11, 0);
            w0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d0(byte b3) {
            if (this.f21216f == this.f21215e) {
                throw null;
            }
            s0(b3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e0(byte[] bArr, int i11) {
            q0(i11);
            if (this.f21216f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f(int i11, int i12) {
            y0(14);
            v0(i11, 5);
            t0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(ByteString byteString) {
            q0(byteString.size());
            byteString.v(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i11) {
            y0(4);
            t0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(long j11) {
            y0(8);
            u0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(int i11) {
            if (i11 >= 0) {
                q0(i11);
            } else {
                r0(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i11, MessageLite messageLite) {
            p0(i11, 2);
            l0(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k(int i11, long j11) {
            y0(18);
            v0(i11, 1);
            u0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i11, MessageLite messageLite, Schema schema) {
            p0(i11, 2);
            q0(((AbstractMessageLite) messageLite).k(schema));
            schema.e(messageLite, this.f21213a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(MessageLite messageLite) {
            q0(messageLite.h());
            messageLite.d(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i11, MessageLite messageLite) {
            p0(1, 3);
            d(2, i11);
            j0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n(int i11, String str) throws OutOfSpaceException {
            p0(i11, 2);
            o0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i11, ByteString byteString) {
            p0(1, 3);
            d(2, i11);
            w(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o(int i11, long j11) {
            y0(20);
            v0(i11, 0);
            x0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iW = CodedOutputStream.W(length);
            int i11 = iW + length;
            int i12 = this.f21215e;
            if (i11 > i12) {
                q0(Utf8.f21424a.d(str, new byte[length], 0, length));
                if (this.f21216f > 0) {
                    throw null;
                }
                throw null;
            }
            int i13 = this.f21216f;
            if (i11 > i12 - i13) {
                throw null;
            }
            try {
                int iW2 = CodedOutputStream.W(str.length());
                byte[] bArr = this.f21214d;
                if (iW2 != iW) {
                    int iD = Utf8.d(str);
                    w0(iD);
                    this.f21216f = Utf8.f21424a.d(str, bArr, this.f21216f, iD);
                    return;
                }
                int i14 = i13 + iW2;
                this.f21216f = i14;
                int iD2 = Utf8.f21424a.d(str, bArr, i14, i12 - i14);
                this.f21216f = i13;
                w0((iD2 - i13) - iW2);
                this.f21216f = iD2;
            } catch (Utf8.UnpairedSurrogateException e8) {
                this.f21216f = i13;
                a0(str, e8);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i11, int i12) {
            q0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i11) {
            y0(5);
            w0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(long j11) {
            y0(10);
            x0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s(int i11, boolean z11) {
            y0(11);
            v0(i11, 0);
            s0(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w(int i11, ByteString byteString) {
            p0(i11, 2);
            f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x(int i11, int i12) {
            y0(20);
            v0(i11, 0);
            if (i12 >= 0) {
                w0(i12);
            } else {
                x0(i12);
            }
        }

        public final void y0(int i11) {
            if (this.f21215e - this.f21216f < i11) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final OutputStream f21220g;

        public OutputStreamEncoder(OutputStream outputStream, int i11) {
            super(i11);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f21220g = outputStream;
        }

        public final void A0(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f21216f;
            int i14 = this.f21215e;
            int i15 = i14 - i13;
            byte[] bArr2 = this.f21214d;
            if (i15 >= i12) {
                System.arraycopy(bArr, i11, bArr2, i13, i12);
                this.f21216f += i12;
                return;
            }
            System.arraycopy(bArr, i11, bArr2, i13, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.f21216f = i14;
            y0();
            if (i17 > i14) {
                this.f21220g.write(bArr, i16, i17);
            } else {
                System.arraycopy(bArr, i16, bArr2, 0, i17);
                this.f21216f = i17;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i11 = this.f21216f;
            int i12 = this.f21215e;
            int i13 = i12 - i11;
            byte[] bArr = this.f21214d;
            if (i13 >= iRemaining) {
                byteBuffer.get(bArr, i11, iRemaining);
                this.f21216f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i11, i13);
            int i14 = iRemaining - i13;
            this.f21216f = i12;
            y0();
            while (i14 > i12) {
                byteBuffer.get(bArr, 0, i12);
                this.f21220g.write(bArr, 0, i12);
                i14 -= i12;
            }
            byteBuffer.get(bArr, 0, i14);
            this.f21216f = i14;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) throws IOException {
            A0(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d(int i11, int i12) throws IOException {
            z0(20);
            v0(i11, 0);
            w0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d0(byte b3) throws IOException {
            if (this.f21216f == this.f21215e) {
                y0();
            }
            s0(b3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e0(byte[] bArr, int i11) throws IOException {
            q0(i11);
            A0(bArr, 0, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f(int i11, int i12) throws IOException {
            z0(14);
            v0(i11, 5);
            t0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(ByteString byteString) throws IOException {
            q0(byteString.size());
            byteString.v(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i11) throws IOException {
            z0(4);
            t0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(long j11) throws IOException {
            z0(8);
            u0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(int i11) throws IOException {
            if (i11 >= 0) {
                q0(i11);
            } else {
                r0(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i11, MessageLite messageLite) throws IOException {
            p0(i11, 2);
            l0(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k(int i11, long j11) throws IOException {
            z0(18);
            v0(i11, 1);
            u0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i11, MessageLite messageLite, Schema schema) throws IOException {
            p0(i11, 2);
            q0(((AbstractMessageLite) messageLite).k(schema));
            schema.e(messageLite, this.f21213a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(MessageLite messageLite) throws IOException {
            q0(messageLite.h());
            messageLite.d(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i11, MessageLite messageLite) throws IOException {
            p0(1, 3);
            d(2, i11);
            j0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n(int i11, String str) throws IOException {
            p0(i11, 2);
            o0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i11, ByteString byteString) throws IOException {
            p0(1, 3);
            d(2, i11);
            w(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o(int i11, long j11) throws IOException {
            z0(20);
            v0(i11, 0);
            x0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.W(length);
                int i11 = iW + length;
                int i12 = this.f21215e;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int iD = Utf8.f21424a.d(str, bArr, 0, length);
                    q0(iD);
                    A0(bArr, 0, iD);
                    return;
                }
                if (i11 > i12 - this.f21216f) {
                    y0();
                }
                int iW2 = CodedOutputStream.W(str.length());
                int i13 = this.f21216f;
                byte[] bArr2 = this.f21214d;
                try {
                    try {
                        if (iW2 == iW) {
                            int i14 = i13 + iW2;
                            this.f21216f = i14;
                            int iD2 = Utf8.f21424a.d(str, bArr2, i14, i12 - i14);
                            this.f21216f = i13;
                            w0((iD2 - i13) - iW2);
                            this.f21216f = iD2;
                        } else {
                            int iD3 = Utf8.d(str);
                            w0(iD3);
                            this.f21216f = Utf8.f21424a.d(str, bArr2, this.f21216f, iD3);
                        }
                    } catch (Utf8.UnpairedSurrogateException e8) {
                        this.f21216f = i13;
                        throw e8;
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(e10);
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                a0(str, e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i11, int i12) throws IOException {
            q0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i11) throws IOException {
            z0(5);
            w0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(long j11) throws IOException {
            z0(10);
            x0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s(int i11, boolean z11) throws IOException {
            z0(11);
            v0(i11, 0);
            s0(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w(int i11, ByteString byteString) throws IOException {
            p0(i11, 2);
            f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x(int i11, int i12) throws IOException {
            z0(20);
            v0(i11, 0);
            if (i12 >= 0) {
                w0(i12);
            } else {
                x0(i12);
            }
        }

        public final void y0() throws IOException {
            this.f21220g.write(this.f21214d, 0, this.f21216f);
            this.f21216f = 0;
        }

        public final void z0(int i11) throws IOException {
            if (this.f21215e - this.f21216f < i11) {
                y0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int c0() {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d(int i11, int i12) {
            p0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d0(byte b3) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e0(byte[] bArr, int i11) {
            q0(i11);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f(int i11, int i12) {
            p0(i11, 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(ByteString byteString) {
            q0(byteString.size());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i11) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(long j11) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(int i11) {
            if (i11 >= 0) {
                q0(i11);
                throw null;
            }
            r0(i11);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i11, MessageLite messageLite) {
            p0(i11, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k(int i11, long j11) {
            p0(i11, 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i11, MessageLite messageLite, Schema schema) {
            p0(i11, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(MessageLite messageLite) {
            q0(messageLite.h());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i11, MessageLite messageLite) {
            p0(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n(int i11, String str) {
            p0(i11, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i11, ByteString byteString) {
            p0(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o(int i11, long j11) {
            p0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(String str) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i11, int i12) {
            q0((i11 << 3) | i12);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i11) {
            if ((i11 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(long j11) {
            if ((j11 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s(int i11, boolean z11) {
            p0(i11, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w(int i11, ByteString byteString) {
            p0(i11, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x(int i11, int i12) {
            p0(i11, 0);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f21221d;

        @Override // com.google.protobuf.ByteOutput
        public final void Q(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void R(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            s0(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int c0() {
            return (int) (0 - this.f21221d);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 0);
            q0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d0(byte b3) throws OutOfSpaceException {
            long j11 = this.f21221d;
            if (j11 >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f21221d), 0L, 1));
            }
            this.f21221d = 1 + j11;
            UnsafeUtil.l(j11, b3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e0(byte[] bArr, int i11) throws OutOfSpaceException {
            q0(i11);
            s0(bArr, 0, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(ByteString byteString) throws OutOfSpaceException {
            q0(byteString.size());
            byteString.v(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i11) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(long j11) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void i0(int i11) throws OutOfSpaceException {
            if (i11 >= 0) {
                q0(i11);
            } else {
                r0(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(int i11, MessageLite messageLite) throws OutOfSpaceException {
            p0(i11, 2);
            l0(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k(int i11, long j11) throws OutOfSpaceException {
            p0(i11, 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i11, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            p0(i11, 2);
            q0(((AbstractMessageLite) messageLite).k(schema));
            schema.e(messageLite, this.f21213a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(MessageLite messageLite) throws OutOfSpaceException {
            q0(messageLite.h());
            messageLite.d(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i11, MessageLite messageLite) throws OutOfSpaceException {
            p0(1, 3);
            d(2, i11);
            j0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n(int i11, String str) throws OutOfSpaceException {
            p0(i11, 2);
            o0(str);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void n0(int i11, ByteString byteString) throws OutOfSpaceException {
            p0(1, 3);
            d(2, i11);
            w(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o(int i11, long j11) throws OutOfSpaceException {
            p0(i11, 0);
            r0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void o0(String str) throws OutOfSpaceException {
            long j11 = this.f21221d;
            try {
                if (CodedOutputStream.W(str.length()) == CodedOutputStream.W(str.length() * 3)) {
                    throw null;
                }
                q0(Utf8.d(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.f21221d = j11;
                throw null;
            } catch (IllegalArgumentException e8) {
                throw new OutOfSpaceException(e8);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(int i11, int i12) throws OutOfSpaceException {
            q0((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i11) throws OutOfSpaceException {
            if (this.f21221d <= 0) {
                while ((i11 & (-128)) != 0) {
                    long j11 = this.f21221d;
                    this.f21221d = j11 + 1;
                    UnsafeUtil.l(j11, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                long j12 = this.f21221d;
                this.f21221d = 1 + j12;
                UnsafeUtil.l(j12, (byte) i11);
                return;
            }
            while (true) {
                long j13 = this.f21221d;
                if (j13 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f21221d), 0L, 1));
                }
                if ((i11 & (-128)) == 0) {
                    this.f21221d = 1 + j13;
                    UnsafeUtil.l(j13, (byte) i11);
                    return;
                } else {
                    this.f21221d = j13 + 1;
                    UnsafeUtil.l(j13, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(long j11) throws OutOfSpaceException {
            if (this.f21221d <= 0) {
                while ((j11 & (-128)) != 0) {
                    long j12 = this.f21221d;
                    this.f21221d = j12 + 1;
                    UnsafeUtil.l(j12, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                long j13 = this.f21221d;
                this.f21221d = 1 + j13;
                UnsafeUtil.l(j13, (byte) j11);
                return;
            }
            while (true) {
                long j14 = this.f21221d;
                if (j14 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f21221d), 0L, 1));
                }
                if ((j11 & (-128)) == 0) {
                    this.f21221d = 1 + j14;
                    UnsafeUtil.l(j14, (byte) j11);
                    return;
                } else {
                    this.f21221d = j14 + 1;
                    UnsafeUtil.l(j14, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s(int i11, boolean z11) throws OutOfSpaceException {
            p0(i11, 0);
            d0(z11 ? (byte) 1 : (byte) 0);
        }

        public final void s0(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            if (bArr != null && i11 >= 0 && i12 >= 0 && bArr.length - i12 >= i11) {
                long j11 = i12;
                long j12 = 0 - j11;
                long j13 = this.f21221d;
                if (j12 >= j13) {
                    UnsafeUtil.f21417c.d(bArr, i11, j13, j11);
                    this.f21221d += j11;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f21221d), 0L, Integer.valueOf(i12)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w(int i11, ByteString byteString) throws OutOfSpaceException {
            p0(i11, 2);
            f0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x(int i11, int i12) throws OutOfSpaceException {
            p0(i11, 0);
            i0(i12);
        }
    }

    public /* synthetic */ CodedOutputStream(int i11) {
        this();
    }

    public static int S(int i11) {
        if (i11 >= 0) {
            return W(i11);
        }
        return 10;
    }

    public static int T(LazyFieldLite lazyFieldLite) {
        int iH;
        if (lazyFieldLite.f21297b != null) {
            iH = lazyFieldLite.f21297b.size();
        } else {
            iH = lazyFieldLite.f21296a != null ? lazyFieldLite.f21296a.h() : 0;
        }
        return W(iH) + iH;
    }

    public static int U(String str) {
        int length;
        try {
            length = Utf8.d(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f21282a).length;
        }
        return W(length) + length;
    }

    public static int V(int i11) {
        return W(i11 << 3);
    }

    public static int W(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            j11 >>>= 28;
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    public static int Y(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long Z(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static CodedOutputStream b0(byte[] bArr, int i11, int i12) {
        return new ArrayEncoder(bArr, i11, i12);
    }

    public final void a0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        f21211b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f21282a);
        try {
            q0(bytes.length);
            R(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new OutOfSpaceException(e8);
        }
    }

    public abstract int c0();

    public abstract void d(int i11, int i12);

    public abstract void d0(byte b3);

    public abstract void e0(byte[] bArr, int i11);

    public abstract void f(int i11, int i12);

    public abstract void f0(ByteString byteString);

    public abstract void g0(int i11);

    public abstract void h0(long j11);

    public abstract void i0(int i11);

    public abstract void j0(int i11, MessageLite messageLite);

    public abstract void k(int i11, long j11);

    public abstract void k0(int i11, MessageLite messageLite, Schema schema);

    public abstract void l0(MessageLite messageLite);

    public abstract void m0(int i11, MessageLite messageLite);

    public abstract void n(int i11, String str);

    public abstract void n0(int i11, ByteString byteString);

    public abstract void o(int i11, long j11);

    public abstract void o0(String str);

    public abstract void p0(int i11, int i12);

    public abstract void q0(int i11);

    public abstract void r0(long j11);

    public abstract void s(int i11, boolean z11);

    public abstract void w(int i11, ByteString byteString);

    public abstract void x(int i11, int i12);

    private CodedOutputStream() {
    }
}
