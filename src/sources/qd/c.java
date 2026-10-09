package qd;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47714b;

    public c(BufferedInputStream bufferedInputStream, long j11) {
        super(bufferedInputStream);
        this.f47713a = j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11 = super.read();
        if (i11 != -1) {
            this.f47714b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f47714b += (long) i13;
        }
        return i13;
    }
}
