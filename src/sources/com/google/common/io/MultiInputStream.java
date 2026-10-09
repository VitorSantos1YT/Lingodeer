package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class MultiInputStream extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f17452a;

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f17452a;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f17452a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f17452a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.f17452a;
        if (inputStream == null) {
            return -1;
        }
        int i11 = inputStream.read();
        if (i11 != -1) {
            return i11;
        }
        close();
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j11) throws IOException {
        InputStream inputStream = this.f17452a;
        if (inputStream == null || j11 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j11);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f17452a.skip(j11 - 1) + 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        bArr.getClass();
        InputStream inputStream = this.f17452a;
        if (inputStream == null) {
            return -1;
        }
        int i13 = inputStream.read(bArr, i11, i12);
        if (i13 != -1) {
            return i13;
        }
        close();
        throw null;
    }
}
