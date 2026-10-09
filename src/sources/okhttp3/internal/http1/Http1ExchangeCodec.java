package okhttp3.internal.http1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m00.h0;
import m00.i;
import m00.i0;
import m00.j;
import m00.k;
import m00.k0;
import m00.s;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Headers f45365g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f45366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExchangeCodec.Carrier f45367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f45368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f45369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HeadersReader f45371f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class AbstractSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpUrl f45372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f45373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f45375d;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            m.f(url, "url");
            this.f45375d = http1ExchangeCodec;
            this.f45372a = url;
            this.f45373b = new s(http1ExchangeCodec.f45368c.timeout());
        }

        public final void a(Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            m.f(trailers, "trailers");
            Http1ExchangeCodec http1ExchangeCodec = this.f45375d;
            int i11 = http1ExchangeCodec.f45370e;
            if (i11 == 6) {
                return;
            }
            if (i11 != 5) {
                throw new IllegalStateException("state: " + http1ExchangeCodec.f45370e);
            }
            s sVar = this.f45373b;
            k0 k0Var = sVar.f40741e;
            sVar.f40741e = k0.f40719d;
            k0Var.a();
            k0Var.b();
            http1ExchangeCodec.f45370e = 6;
            if (trailers.size() <= 0 || (okHttpClient = http1ExchangeCodec.f45366a) == null || (cookieJar = okHttpClient.f45093j) == null) {
                return;
            }
            HttpHeaders.d(cookieJar, this.f45372a, trailers);
        }

        @Override // m00.i0
        public long read(i sink, long j11) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.f45375d;
            m.f(sink, "sink");
            try {
                return http1ExchangeCodec.f45368c.read(sink, j11);
            } catch (IOException e8) {
                http1ExchangeCodec.f45367b.e();
                a(Http1ExchangeCodec.f45365g);
                throw e8;
            }
        }

        @Override // m00.i0
        public final k0 timeout() {
            return this.f45373b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ChunkedSink implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f45376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45377b;

        public ChunkedSink() {
            this.f45376a = new s(Http1ExchangeCodec.this.f45369d.timeout());
        }

        @Override // m00.h0
        public final void K0(i source, long j11) {
            j jVar = Http1ExchangeCodec.this.f45369d;
            m.f(source, "source");
            if (this.f45377b) {
                throw new IllegalStateException("closed");
            }
            if (j11 == 0) {
                return;
            }
            jVar.A0(j11);
            jVar.l0("\r\n");
            jVar.K0(source, j11);
            jVar.l0("\r\n");
        }

        @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f45377b) {
                return;
            }
            this.f45377b = true;
            Http1ExchangeCodec.this.f45369d.l0("0\r\n\r\n");
            s sVar = this.f45376a;
            k0 k0Var = sVar.f40741e;
            sVar.f40741e = k0.f40719d;
            k0Var.a();
            k0Var.b();
            Http1ExchangeCodec.this.f45370e = 3;
        }

        @Override // m00.h0, java.io.Flushable
        public final synchronized void flush() {
            if (this.f45377b) {
                return;
            }
            Http1ExchangeCodec.this.f45369d.flush();
        }

        @Override // m00.h0
        public final k0 timeout() {
            return this.f45376a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ChunkedSource extends AbstractSource {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45380f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f45381t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            m.f(url, "url");
            this.f45381t = http1ExchangeCodec;
            this.f45379e = -1L;
            this.f45380f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.f45374c) {
                return;
            }
            if (this.f45380f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeZone timeZone = _UtilJvmKt.f45204a;
                m.f(timeUnit, "timeUnit");
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.f45381t.f45367b.e();
                    a(Http1ExchangeCodec.f45365g);
                }
            }
            this.f45374c = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, m00.i0
        public final long read(i sink, long j11) throws IOException {
            long j12;
            Http1ExchangeCodec http1ExchangeCodec = this.f45381t;
            k kVar = http1ExchangeCodec.f45368c;
            m.f(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(e.h(j11, "byteCount < 0: ").toString());
            }
            if (this.f45374c) {
                throw new IllegalStateException("closed");
            }
            long j13 = -1;
            if (!this.f45380f) {
                return -1L;
            }
            long j14 = this.f45379e;
            if (j14 == 0 || j14 == -1) {
                if (j14 != -1) {
                    kVar.R0();
                }
                try {
                    this.f45379e = kVar.z1();
                    String string = q.i1(kVar.R0()).toString();
                    if (this.f45379e < 0 || (string.length() > 0 && !x.s0(string, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f45379e + string + '\"');
                    }
                    if (this.f45379e == 0) {
                        this.f45380f = false;
                        HeadersReader headersReader = http1ExchangeCodec.f45371f;
                        headersReader.getClass();
                        Headers.Builder builder = new Headers.Builder();
                        while (true) {
                            String strC0 = headersReader.f45363a.c0(headersReader.f45364b);
                            j12 = j13;
                            headersReader.f45364b -= (long) strC0.length();
                            if (strC0.length() == 0) {
                                break;
                            }
                            int iH0 = q.H0(strC0, ':', 1, 4);
                            if (iH0 != -1) {
                                String strSubstring = strC0.substring(0, iH0);
                                m.e(strSubstring, "substring(...)");
                                String strSubstring2 = strC0.substring(iH0 + 1);
                                m.e(strSubstring2, "substring(...)");
                                builder.b(strSubstring, strSubstring2);
                            } else if (strC0.charAt(0) == ':') {
                                String strSubstring3 = strC0.substring(1);
                                m.e(strSubstring3, "substring(...)");
                                builder.b(BuildConfig.VERSION_NAME, strSubstring3);
                            } else {
                                builder.b(BuildConfig.VERSION_NAME, strC0);
                            }
                            j13 = j12;
                        }
                        a(builder.d());
                    } else {
                        j12 = -1;
                    }
                    if (!this.f45380f) {
                        return j12;
                    }
                } catch (NumberFormatException e8) {
                    throw new ProtocolException(e8.getMessage());
                }
            } else {
                j12 = -1;
            }
            long j15 = super.read(sink, Math.min(j11, this.f45379e));
            if (j15 != j12) {
                this.f45379e -= j15;
                return j15;
            }
            http1ExchangeCodec.f45367b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(Http1ExchangeCodec.f45365g);
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class FixedLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f45383f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url, long j11) {
            super(http1ExchangeCodec, url);
            m.f(url, "url");
            this.f45383f = http1ExchangeCodec;
            this.f45382e = j11;
            if (j11 == 0) {
                a(Headers.f45041c);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.f45374c) {
                return;
            }
            if (this.f45382e != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeZone timeZone = _UtilJvmKt.f45204a;
                m.f(timeUnit, "timeUnit");
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.f45383f.f45367b.e();
                    a(Http1ExchangeCodec.f45365g);
                }
            }
            this.f45374c = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, m00.i0
        public final long read(i sink, long j11) throws IOException {
            m.f(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(e.h(j11, "byteCount < 0: ").toString());
            }
            if (this.f45374c) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f45382e;
            if (j12 == 0) {
                return -1L;
            }
            long j13 = super.read(sink, Math.min(j12, j11));
            if (j13 == -1) {
                this.f45383f.f45367b.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(Http1ExchangeCodec.f45365g);
                throw protocolException;
            }
            long j14 = this.f45382e - j13;
            this.f45382e = j14;
            if (j14 == 0) {
                a(Headers.f45041c);
            }
            return j13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KnownLengthSink implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f45384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45385b;

        public KnownLengthSink() {
            this.f45384a = new s(Http1ExchangeCodec.this.f45369d.timeout());
        }

        @Override // m00.h0
        public final void K0(i source, long j11) {
            m.f(source, "source");
            if (this.f45385b) {
                throw new IllegalStateException("closed");
            }
            _UtilCommonKt.a(source.f40718b, 0L, j11);
            Http1ExchangeCodec.this.f45369d.K0(source, j11);
        }

        @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f45385b) {
                return;
            }
            this.f45385b = true;
            Headers headers = Http1ExchangeCodec.f45365g;
            s sVar = this.f45384a;
            k0 k0Var = sVar.f40741e;
            sVar.f40741e = k0.f40719d;
            k0Var.a();
            k0Var.b();
            Http1ExchangeCodec.this.f45370e = 3;
        }

        @Override // m00.h0, java.io.Flushable
        public final void flush() {
            if (this.f45385b) {
                return;
            }
            Http1ExchangeCodec.this.f45369d.flush();
        }

        @Override // m00.h0
        public final k0 timeout() {
            return this.f45384a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class UnknownLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45387e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f45374c) {
                return;
            }
            if (!this.f45387e) {
                a(Http1ExchangeCodec.f45365g);
            }
            this.f45374c = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, m00.i0
        public final long read(i sink, long j11) throws IOException {
            m.f(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(e.h(j11, "byteCount < 0: ").toString());
            }
            if (this.f45374c) {
                throw new IllegalStateException("closed");
            }
            if (this.f45387e) {
                return -1L;
            }
            long j12 = super.read(sink, j11);
            if (j12 != -1) {
                return j12;
            }
            this.f45387e = true;
            a(Headers.f45041c);
            return -1L;
        }
    }

    static {
        new Companion(0);
        Headers.f45040b.getClass();
        f45365g = Headers.Companion.a("OkHttp-Response-Body", "Truncated");
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, k source, j sink) {
        m.f(source, "source");
        m.f(sink, "sink");
        this.f45366a = okHttpClient;
        this.f45367b = carrier;
        this.f45368c = source;
        this.f45369d = sink;
        this.f45371f = new HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.f45369d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        m.f(request, "request");
        RequestLine requestLine = RequestLine.f45357a;
        Proxy.Type type = this.f45367b.h().f45186b.type();
        m.e(type, "type(...)");
        requestLine.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f45135b);
        sb2.append(' ');
        HttpUrl httpUrl = request.f45134a;
        if (httpUrl.f() || type != Proxy.Type.HTTP) {
            sb2.append(RequestLine.a(httpUrl));
        } else {
            sb2.append(httpUrl);
        }
        sb2.append(" HTTP/1.1");
        l(request.f45136c, sb2.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        return this.f45370e == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f45367b.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final i0 d(Response response) {
        Request request = response.f45158a;
        if (!HttpHeaders.a(response)) {
            return j(request.f45134a, 0L);
        }
        String strB = response.f45163f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            HttpUrl httpUrl = request.f45134a;
            if (this.f45370e == 4) {
                this.f45370e = 5;
                return new ChunkedSource(this, httpUrl);
            }
            throw new IllegalStateException(("state: " + this.f45370e).toString());
        }
        long jE = _UtilJvmKt.e(response);
        if (jE != -1) {
            return j(request.f45134a, jE);
        }
        HttpUrl url = request.f45134a;
        if (this.f45370e != 4) {
            throw new IllegalStateException(("state: " + this.f45370e).toString());
        }
        this.f45370e = 5;
        this.f45367b.e();
        m.f(url, "url");
        return new UnknownLengthSource(this, url);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder e(boolean z11) throws IOException {
        HeadersReader headersReader = this.f45371f;
        int i11 = this.f45370e;
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            throw new IllegalStateException(("state: " + this.f45370e).toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f45359d;
            String strC0 = headersReader.f45363a.c0(headersReader.f45364b);
            headersReader.f45364b -= (long) strC0.length();
            companion.getClass();
            StatusLine statusLineA = StatusLine.Companion.a(strC0);
            int i12 = statusLineA.f45361b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.f45360a;
            m.f(protocol, "protocol");
            builder.f45166b = protocol;
            builder.f45167c = i12;
            String message = statusLineA.f45362c;
            m.f(message, "message");
            builder.f45168d = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strC1 = headersReader.f45363a.c0(headersReader.f45364b);
                headersReader.f45364b -= (long) strC1.length();
                if (strC1.length() == 0) {
                    break;
                }
                int iH0 = q.H0(strC1, ':', 1, 4);
                if (iH0 != -1) {
                    String strSubstring = strC1.substring(0, iH0);
                    m.e(strSubstring, "substring(...)");
                    String strSubstring2 = strC1.substring(iH0 + 1);
                    m.e(strSubstring2, "substring(...)");
                    builder2.b(strSubstring, strSubstring2);
                } else if (strC1.charAt(0) == ':') {
                    String strSubstring3 = strC1.substring(1);
                    m.e(strSubstring3, "substring(...)");
                    builder2.b(BuildConfig.VERSION_NAME, strSubstring3);
                } else {
                    builder2.b(BuildConfig.VERSION_NAME, strC1);
                }
            }
            builder.c(builder2.d());
            if (z11 && i12 == 100) {
                return null;
            }
            if (i12 == 100) {
                this.f45370e = 3;
                return builder;
            }
            if (102 > i12 || i12 >= 200) {
                this.f45370e = 4;
                return builder;
            }
            this.f45370e = 3;
            return builder;
        } catch (EOFException e8) {
            throw new IOException(a.e("unexpected end of stream on ", this.f45367b.h().f45185a.f44940i.h()), e8);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() {
        this.f45369d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long g(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        String strB = response.f45163f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            return -1L;
        }
        return _UtilJvmKt.e(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier h() {
        return this.f45367b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final h0 i(Request request, long j11) throws ProtocolException {
        m.f(request, "request");
        RequestBody requestBody = request.f45137d;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f45136c.b("Transfer-Encoding"))) {
            if (this.f45370e == 1) {
                this.f45370e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException(("state: " + this.f45370e).toString());
        }
        if (j11 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f45370e == 1) {
            this.f45370e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f45370e).toString());
    }

    public final i0 j(HttpUrl httpUrl, long j11) {
        if (this.f45370e == 4) {
            this.f45370e = 5;
            return new FixedLengthSource(this, httpUrl, j11);
        }
        throw new IllegalStateException(("state: " + this.f45370e).toString());
    }

    public final void k(Response response) {
        long jE = _UtilJvmKt.e(response);
        if (jE == -1) {
            return;
        }
        i0 i0VarJ = j(response.f45158a.f45134a, jE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        _UtilJvmKt.g(i0VarJ, Integer.MAX_VALUE);
        ((FixedLengthSource) i0VarJ).close();
    }

    public final void l(Headers headers, String requestLine) {
        m.f(headers, "headers");
        m.f(requestLine, "requestLine");
        if (this.f45370e != 0) {
            throw new IllegalStateException(("state: " + this.f45370e).toString());
        }
        j jVar = this.f45369d;
        jVar.l0(requestLine).l0("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            jVar.l0(headers.d(i11)).l0(": ").l0(headers.g(i11)).l0("\r\n");
        }
        jVar.l0("\r\n");
        this.f45370e = 1;
    }
}
