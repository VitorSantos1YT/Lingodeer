package com.google.protobuf;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class NioByteString extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f21347d;

    /* JADX INFO: renamed from: com.google.protobuf.NioByteString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends InputStream {
        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void mark(int i11) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw null;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) {
            throw null;
        }
    }

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = Internal.f21282a;
        this.f21347d = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.f21347d.slice();
        int iRemaining = byteBufferSlice.remaining();
        ByteString.f(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer b() {
        return this.f21347d.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final byte d(int i11) {
        try {
            return this.f21347d.get(i11);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f21347d;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return byteBuffer.equals(((NioByteString) obj).f21347d);
        }
        return obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.b());
    }

    @Override // com.google.protobuf.ByteString
    public final void h(int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer byteBufferSlice = this.f21347d.slice();
        byteBufferSlice.position(i11);
        byteBufferSlice.get(bArr, i12, i13);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean l() {
        Utf8.Processor processor = Utf8.f21424a;
        ByteBuffer byteBuffer = this.f21347d;
        return processor.f(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream n() {
        ByteBuffer byteBuffer = this.f21347d;
        if (byteBuffer.hasArray()) {
            return CodedInputStream.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
        }
        if (byteBuffer.isDirect() && UnsafeUtil.f21418d) {
            return new CodedInputStream.UnsafeDirectNioDecoder(byteBuffer);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return CodedInputStream.g(bArr, 0, iRemaining, true);
    }

    @Override // com.google.protobuf.ByteString
    public final int o(int i11, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + this.f21347d.get(i14);
        }
        return i11;
    }

    @Override // com.google.protobuf.ByteString
    public final int r(int i11, int i12, int i13) {
        return Utf8.f21424a.f(i11, i12, i13 + i12, this.f21347d);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString s(int i11, int i12) {
        try {
            return new NioByteString(z(i11, i12));
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f21347d.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final String u(Charset charset) {
        byte[] bArrT;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f21347d;
        if (byteBuffer.hasArray()) {
            bArrT = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrT = t();
            length = bArrT.length;
            iPosition = 0;
        }
        return new String(bArrT, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void v(ByteOutput byteOutput) {
        byteOutput.Q(this.f21347d.slice());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public final boolean x(ByteString byteString, int i11, int i12) {
        return s(0, i12).equals(byteString.s(i11, i12 + i11));
    }

    public final ByteBuffer z(int i11, int i12) {
        ByteBuffer byteBuffer = this.f21347d;
        if (i11 < byteBuffer.position() || i12 > byteBuffer.limit() || i11 > i12) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i11 - byteBuffer.position());
        byteBufferSlice.limit(i12 - byteBuffer.position());
        return byteBufferSlice;
    }
}
