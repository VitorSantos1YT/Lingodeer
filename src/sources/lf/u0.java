package lf;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends BufferedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HttpURLConnection f40125a;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        j1.k(this.f40125a);
    }
}
