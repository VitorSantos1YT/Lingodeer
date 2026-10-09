package m00;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f40712b;

    public /* synthetic */ g(k kVar, int i11) {
        this.f40711a = i11;
        this.f40712b = kVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f40711a) {
            case 0:
                jMin = Math.min(((i) this.f40712b).f40718b, Integer.MAX_VALUE);
                break;
            default:
                d0 d0Var = (d0) this.f40712b;
                if (d0Var.f40692c) {
                    throw new IOException("closed");
                }
                jMin = Math.min(d0Var.f40691b.f40718b, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f40711a) {
            case 0:
                break;
            default:
                ((d0) this.f40712b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f40711a) {
            case 0:
                i iVar = (i) this.f40712b;
                if (iVar.f40718b > 0) {
                    return iVar.readByte() & 255;
                }
                return -1;
            default:
                d0 d0Var = (d0) this.f40712b;
                i iVar2 = d0Var.f40691b;
                if (d0Var.f40692c) {
                    throw new IOException("closed");
                }
                if (iVar2.f40718b == 0 && d0Var.f40690a.read(iVar2, 8192L) == -1) {
                    return -1;
                }
                return iVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f40711a) {
            case 0:
                return ((i) this.f40712b) + ".inputStream()";
            default:
                return ((d0) this.f40712b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) throws IOException {
        switch (this.f40711a) {
            case 1:
                kotlin.jvm.internal.m.f(out, "out");
                d0 d0Var = (d0) this.f40712b;
                i iVar = d0Var.f40691b;
                if (d0Var.f40692c) {
                    throw new IOException("closed");
                }
                long j11 = 0;
                while (true) {
                    if (iVar.f40718b == 0 && d0Var.f40690a.read(iVar, 8192L) == -1) {
                        return j11;
                    }
                    long j12 = iVar.f40718b;
                    j11 += j12;
                    iVar.V(out, j12);
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i11, int i12) throws IOException {
        switch (this.f40711a) {
            case 0:
                kotlin.jvm.internal.m.f(sink, "sink");
                return ((i) this.f40712b).read(sink, i11, i12);
            default:
                kotlin.jvm.internal.m.f(sink, "data");
                d0 d0Var = (d0) this.f40712b;
                i iVar = d0Var.f40691b;
                if (!d0Var.f40692c) {
                    b.e(sink.length, i11, i12);
                    if (iVar.f40718b == 0 && d0Var.f40690a.read(iVar, 8192L) == -1) {
                        return -1;
                    }
                    return iVar.read(sink, i11, i12);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
