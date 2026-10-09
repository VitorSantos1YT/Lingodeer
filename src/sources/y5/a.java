package y5;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f57091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f57092b;

    public a(g gVar) {
        this.f57092b = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j11, byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (j11 < 0) {
            return -1;
        }
        try {
            long j12 = this.f57091a;
            g gVar = this.f57092b;
            if (j12 != j11) {
                if (j12 >= 0 && j11 >= j12 + ((long) gVar.f57093a.available())) {
                    return -1;
                }
                gVar.b(j11);
                this.f57091a = j11;
            }
            if (i12 > gVar.f57093a.available()) {
                i12 = gVar.f57093a.available();
            }
            int i13 = gVar.read(bArr, i11, i12);
            if (i13 >= 0) {
                this.f57091a += (long) i13;
                return i13;
            }
        } catch (IOException unused) {
        }
        this.f57091a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
