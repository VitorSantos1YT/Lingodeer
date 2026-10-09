package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class ReaderInputStream extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharBuffer f17454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f17455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17457d;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(null) != 1) {
            return -1;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws CharacterCodingException {
        Preconditions.m(i11, i11 + i12, bArr.length);
        if (i12 == 0) {
            return 0;
        }
        int i13 = 0;
        while (true) {
            if (this.f17456c) {
                int iMin = Math.min(i12 - i13, this.f17455b.remaining());
                this.f17455b.get(bArr, i11 + i13, iMin);
                i13 += iMin;
                if (i13 == i12 || this.f17457d) {
                    break;
                }
                this.f17456c = false;
                this.f17455b.clear();
            }
            while (true) {
                if (!this.f17457d) {
                    throw null;
                }
                CoderResult coderResult = CoderResult.UNDERFLOW;
                if (coderResult.isOverflow()) {
                    break;
                }
                if (coderResult.isUnderflow()) {
                    CharBuffer charBuffer = this.f17454a;
                    if (charBuffer.capacity() - charBuffer.limit() == 0) {
                        if (this.f17454a.position() > 0) {
                            this.f17454a.compact().flip();
                        } else {
                            CharBuffer charBuffer2 = this.f17454a;
                            CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer2.array(), charBuffer2.capacity() * 2));
                            charBufferWrap.position(charBuffer2.position());
                            charBufferWrap.limit(charBuffer2.limit());
                            this.f17454a = charBufferWrap;
                        }
                    }
                    this.f17454a.limit();
                    this.f17454a.array();
                    CharBuffer charBuffer3 = this.f17454a;
                    charBuffer3.capacity();
                    charBuffer3.limit();
                    throw null;
                }
                if (coderResult.isError()) {
                    coderResult.throwException();
                    return 0;
                }
            }
            this.f17455b.flip();
            if (this.f17455b.remaining() == 0) {
                this.f17455b = ByteBuffer.allocate(this.f17455b.capacity() * 2);
            } else {
                this.f17456c = true;
            }
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}
