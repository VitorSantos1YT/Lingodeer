package mw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5 f42459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42462e;

    public i3(InputStream inputStream, int i11, n5 n5Var) {
        super(inputStream);
        this.f42462e = -1L;
        this.f42458a = i11;
        this.f42459b = n5Var;
    }

    public final void a() {
        long j11 = this.f42461d;
        long j12 = this.f42460c;
        if (j11 > j12) {
            long j13 = j11 - j12;
            for (lw.j jVar : this.f42459b.f42589a) {
                jVar.f(j13);
            }
            this.f42460c = this.f42461d;
        }
    }

    public final void b() {
        long j11 = this.f42461d;
        int i11 = this.f42458a;
        if (j11 <= i11) {
            return;
        }
        throw lw.q1.f40439j.h("Decompressed gRPC message exceeds maximum size " + i11).a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        this.f42462e = this.f42461d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f42461d++;
        }
        b();
        a();
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f42462e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f42461d = this.f42462e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j11);
        this.f42461d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f42461d += (long) i13;
        }
        b();
        a();
        return i13;
    }
}
