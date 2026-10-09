package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class MultiReader extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Reader f17453a;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.f17453a;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f17453a = null;
            }
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i11, int i12) throws IOException {
        cArr.getClass();
        Reader reader = this.f17453a;
        if (reader == null) {
            return -1;
        }
        int i13 = reader.read(cArr, i11, i12);
        if (i13 != -1) {
            return i13;
        }
        close();
        throw null;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        Reader reader = this.f17453a;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public final long skip(long j11) throws IOException {
        Reader reader;
        Preconditions.e("n is negative", j11 >= 0);
        if (j11 <= 0 || (reader = this.f17453a) == null) {
            return 0L;
        }
        long jSkip = reader.skip(j11);
        if (jSkip > 0) {
            return jSkip;
        }
        close();
        throw null;
    }
}
