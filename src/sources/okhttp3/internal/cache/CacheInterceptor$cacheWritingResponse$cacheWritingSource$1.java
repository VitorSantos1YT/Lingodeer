package okhttp3.internal.cache;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m00.i;
import m00.i0;
import m00.k0;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45209a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f45209a) {
            throw null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        m.f(timeUnit, "timeUnit");
        try {
            zG = _UtilJvmKt.g(this, 100);
        } catch (IOException unused) {
            zG = false;
        }
        if (zG) {
            throw null;
        }
        this.f45209a = true;
        throw null;
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        m.f(sink, "sink");
        throw null;
    }

    @Override // m00.i0
    public final k0 timeout() {
        throw null;
    }
}
