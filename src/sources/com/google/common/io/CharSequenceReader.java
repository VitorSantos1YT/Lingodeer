package com.google.common.io;

import com.google.common.base.Preconditions;
import dl.ExOZ.xItStCyvVEZ;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CharSequenceReader extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f17443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17445c;

    public final void a() throws IOException {
        if (this.f17443a == null) {
            throw new IOException("reader closed");
        }
    }

    public final int b() {
        Objects.requireNonNull(this.f17443a);
        return this.f17443a.length() - this.f17444b;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17443a = null;
    }

    @Override // java.io.Reader
    public final synchronized void mark(int i11) {
        Preconditions.b(i11, "readAheadLimit (%s) may not be negative", i11 >= 0);
        a();
        this.f17445c = this.f17444b;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final synchronized int read() {
        int iCharAt;
        a();
        Objects.requireNonNull(this.f17443a);
        if (b() > 0) {
            CharSequence charSequence = this.f17443a;
            int i11 = this.f17444b;
            this.f17444b = i11 + 1;
            iCharAt = charSequence.charAt(i11);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public final synchronized boolean ready() {
        a();
        return true;
    }

    @Override // java.io.Reader
    public final synchronized void reset() {
        a();
        this.f17444b = this.f17445c;
    }

    @Override // java.io.Reader
    public final synchronized long skip(long j11) {
        int iMin;
        Preconditions.d(j11, xItStCyvVEZ.ECwMwaMM, j11 >= 0);
        a();
        iMin = (int) Math.min(b(), j11);
        this.f17444b += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final synchronized int read(char[] cArr, int i11, int i12) {
        Preconditions.m(i11, i11 + i12, cArr.length);
        a();
        Objects.requireNonNull(this.f17443a);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(i12, b());
        for (int i13 = 0; i13 < iMin; i13++) {
            CharSequence charSequence = this.f17443a;
            int i14 = this.f17444b;
            this.f17444b = i14 + 1;
            cArr[i11 + i13] = charSequence.charAt(i14);
        }
        return iMin;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final synchronized int read(CharBuffer charBuffer) {
        charBuffer.getClass();
        a();
        Objects.requireNonNull(this.f17443a);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), b());
        for (int i11 = 0; i11 < iMin; i11++) {
            CharSequence charSequence = this.f17443a;
            int i12 = this.f17444b;
            this.f17444b = i12 + 1;
            charBuffer.put(charSequence.charAt(i12));
        }
        return iMin;
    }
}
