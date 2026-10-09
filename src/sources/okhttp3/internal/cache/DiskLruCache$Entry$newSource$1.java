package okhttp3.internal.cache;

import java.io.IOException;
import m00.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DiskLruCache$Entry$newSource$1 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45212a;

    @Override // m00.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f45212a) {
            return;
        }
        this.f45212a = true;
        throw null;
    }
}
