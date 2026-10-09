package d7;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f23219b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23221d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23222e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23220c = new byte[1];

    public g(f fVar, h hVar) {
        this.f23218a = fVar;
        this.f23219b = hVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23222e) {
            return;
        }
        this.f23218a.close();
        this.f23222e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f23220c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        b7.a.j(!this.f23222e);
        boolean z11 = this.f23221d;
        f fVar = this.f23218a;
        if (!z11) {
            fVar.u(this.f23219b);
            this.f23221d = true;
        }
        int i13 = fVar.read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        return i13;
    }
}
