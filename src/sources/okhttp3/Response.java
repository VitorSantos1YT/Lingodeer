package okhttp3;

import java.io.Closeable;
import kotlin.jvm.internal.m;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Response implements Closeable {
    public final Response H;
    public final Response K;
    public final Response L;
    public final long M;
    public final long N;
    public final Exchange O;
    public final TrailersSource P;
    public CacheControl Q;
    public final boolean R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f45158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Protocol f45159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handshake f45162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f45163f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ResponseBody f45164t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Request f45165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Protocol f45166b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handshake f45169e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Response f45172h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Response f45173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Response f45174j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f45175k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45176l;
        public Exchange m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45167c = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ResponseBody f45171g = ResponseBody.EMPTY;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TrailersSource f45177n = TrailersSource.f45188a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Headers.Builder f45170f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.H != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.K != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.L != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i11 = this.f45167c;
            if (i11 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f45167c).toString());
            }
            Request request = this.f45165a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f45166b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f45168d;
            if (str != null) {
                return new Response(request, protocol, str, i11, this.f45169e, this.f45170f.d(), this.f45171g, this.f45172h, this.f45173i, this.f45174j, this.f45175k, this.f45176l, this.m, this.f45177n);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(Headers headers) {
            m.f(headers, "headers");
            this.f45170f = headers.e();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i11, Handshake handshake, Headers headers, ResponseBody body, Response response, Response response2, Response response3, long j11, long j12, Exchange exchange, TrailersSource trailersSource) {
        m.f(request, "request");
        m.f(protocol, "protocol");
        m.f(message, "message");
        m.f(body, "body");
        m.f(trailersSource, "trailersSource");
        this.f45158a = request;
        this.f45159b = protocol;
        this.f45160c = message;
        this.f45161d = i11;
        this.f45162e = handshake;
        this.f45163f = headers;
        this.f45164t = body;
        this.H = response;
        this.K = response2;
        this.L = response3;
        this.M = j11;
        this.N = j12;
        this.O = exchange;
        this.P = trailersSource;
        boolean z11 = false;
        if (200 <= i11 && i11 < 300) {
            z11 = true;
        }
        this.R = z11;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f45167c = -1;
        builder.f45171g = ResponseBody.EMPTY;
        builder.f45177n = TrailersSource.f45188a;
        builder.f45165a = this.f45158a;
        builder.f45166b = this.f45159b;
        builder.f45167c = this.f45161d;
        builder.f45168d = this.f45160c;
        builder.f45169e = this.f45162e;
        builder.f45170f = this.f45163f.e();
        builder.f45171g = this.f45164t;
        builder.f45172h = this.H;
        builder.f45173i = this.K;
        builder.f45174j = this.L;
        builder.f45175k = this.M;
        builder.f45176l = this.N;
        builder.m = this.O;
        builder.f45177n = this.P;
        return builder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45164t.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f45159b + ", code=" + this.f45161d + ", message=" + this.f45160c + ", url=" + this.f45158a.f45134a + '}';
    }
}
