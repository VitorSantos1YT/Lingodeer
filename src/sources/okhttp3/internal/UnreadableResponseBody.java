package okhttp3.internal;

import kotlin.jvm.internal.m;
import m00.b;
import m00.i;
import m00.i0;
import m00.k;
import m00.k0;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UnreadableResponseBody extends ResponseBody implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaType f45199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45200b;

    public UnreadableResponseBody(MediaType mediaType, long j11) {
        this.f45199a = mediaType;
        this.f45200b = j11;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f45200b;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f45199a;
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        m.f(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public final k source() {
        return b.c(this);
    }

    @Override // m00.i0
    public final k0 timeout() {
        return k0.f40719d;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
