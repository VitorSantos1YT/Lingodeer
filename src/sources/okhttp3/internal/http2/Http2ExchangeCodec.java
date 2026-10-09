package okhttp3.internal.http2;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import lt.AJC.PQgum;
import m00.h0;
import m00.i0;
import m00.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f45444g = new Companion(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f45445h = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f45446i = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnection f45447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RealInterceptorChain f45448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Http2Connection f45449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Http2Stream f45450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Protocol f45451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f45452f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        m.f(http2Connection, "http2Connection");
        this.f45447a = realConnection;
        this.f45448b = realInterceptorChain;
        this.f45449c = http2Connection;
        List list = okHttpClient.f45101s;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f45451e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() throws SocketTimeoutException {
        Http2Stream http2Stream = this.f45450d;
        m.c(http2Stream);
        http2Stream.K.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        boolean z11;
        Http2Stream http2Stream = this.f45450d;
        if (http2Stream == null) {
            return false;
        }
        synchronized (http2Stream) {
            Http2Stream.FramingSource framingSource = http2Stream.H;
            z11 = framingSource.f45476b && framingSource.f45478d.R();
        }
        return z11;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f45452f = true;
        Http2Stream http2Stream = this.f45450d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final i0 d(Response response) {
        Http2Stream http2Stream = this.f45450d;
        m.c(http2Stream);
        return http2Stream.H;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() {
        this.f45449c.Z.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long g(Response response) {
        if (HttpHeaders.a(response)) {
            return _UtilJvmKt.e(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier h() {
        return this.f45447a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final h0 i(Request request, long j11) {
        m.f(request, "request");
        Http2Stream http2Stream = this.f45450d;
        m.c(http2Stream);
        return http2Stream.K;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) throws IOException {
        int i11;
        Http2Stream http2Stream;
        boolean z11;
        m.f(request, "request");
        if (this.f45450d != null) {
            return;
        }
        boolean z12 = request.f45137d != null;
        f45444g.getClass();
        Headers headers = request.f45136c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f45391f, request.f45135b));
        l lVar = Header.f45392g;
        RequestLine requestLine = RequestLine.f45357a;
        HttpUrl httpUrl = request.f45134a;
        requestLine.getClass();
        arrayList.add(new Header(lVar, RequestLine.a(httpUrl)));
        String strB = request.f45136c.b(PQgum.EPdoXnSpUOQwUd);
        if (strB != null) {
            arrayList.add(new Header(Header.f45394i, strB));
        }
        arrayList.add(new Header(Header.f45393h, httpUrl.f45045a));
        int size = headers.size();
        for (int i12 = 0; i12 < size; i12++) {
            String strD = headers.d(i12);
            Locale US = Locale.US;
            m.e(US, "US");
            String lowerCase = strD.toLowerCase(US);
            m.e(lowerCase, "toLowerCase(...)");
            if (!f45445h.contains(lowerCase) || (lowerCase.equals("te") && headers.g(i12).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, headers.g(i12)));
            }
        }
        Http2Connection http2Connection = this.f45449c;
        http2Connection.getClass();
        boolean z13 = !z12;
        synchronized (http2Connection.Z) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.f45429e > 1073741823) {
                        http2Connection.d(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f45430f) {
                        throw new ConnectionShutdownException();
                    }
                    i11 = http2Connection.f45429e;
                    http2Connection.f45429e = i11 + 2;
                    http2Stream = new Http2Stream(i11, http2Connection, z13, false, null);
                    z11 = !z12 || http2Connection.W >= http2Connection.X || http2Stream.f45467d >= http2Stream.f45468e;
                    if (http2Stream.h()) {
                        http2Connection.f45425b.put(Integer.valueOf(i11), http2Stream);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            http2Connection.Z.e(i11, arrayList, z13);
        }
        if (z11) {
            http2Connection.Z.flush();
        }
        this.f45450d = http2Stream;
        if (this.f45452f) {
            Http2Stream http2Stream2 = this.f45450d;
            m.c(http2Stream2);
            http2Stream2.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f45450d;
        m.c(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.L;
        long j11 = this.f45448b.f45351g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j11, timeUnit);
        Http2Stream http2Stream4 = this.f45450d;
        m.c(http2Stream4);
        http2Stream4.M.g(this.f45448b.f45352h, timeUnit);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder e(boolean z11) throws IOException {
        int i11;
        Headers headers;
        Http2Stream http2Stream = this.f45450d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (http2Stream) {
            while (true) {
                if (!http2Stream.f45469f.isEmpty() || http2Stream.f() != null) {
                    break;
                }
                if (!z11) {
                    http2Stream.f45465b.getClass();
                    Http2Stream.FramingSink framingSink = http2Stream.K;
                    i11 = framingSink.f45473c || framingSink.f45471a ? 1 : 0;
                }
                if (i11 != 0) {
                    http2Stream.L.h();
                }
                try {
                    try {
                        http2Stream.wait();
                        if (i11 != 0) {
                            http2Stream.L.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    if (i11 != 0) {
                        http2Stream.L.k();
                    }
                    throw th2;
                }
            }
            if (http2Stream.f45469f.isEmpty()) {
                IOException iOException = http2Stream.O;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeF = http2Stream.f();
                m.c(errorCodeF);
                throw new StreamResetException(errorCodeF);
            }
            Object objRemoveFirst = http2Stream.f45469f.removeFirst();
            m.e(objRemoveFirst, FpIL.CmYQjBS);
            headers = (Headers) objRemoveFirst;
        }
        Companion companion = f45444g;
        Protocol protocol = this.f45451e;
        companion.getClass();
        m.f(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLineA = null;
        for (i11 = 0; i11 < size; i11++) {
            String strD = headers.d(i11);
            String strG = headers.g(i11);
            if (strD.equals(":status")) {
                StatusLine.Companion companion2 = StatusLine.f45359d;
                String strConcat = "HTTP/1.1 ".concat(strG);
                companion2.getClass();
                statusLineA = StatusLine.Companion.a(strConcat);
            } else if (!f45446i.contains(strD)) {
                builder.b(strD, strG);
            }
        }
        if (statusLineA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f45166b = protocol;
        builder2.f45167c = statusLineA.f45361b;
        String message = statusLineA.f45362c;
        m.f(message, "message");
        builder2.f45168d = message;
        builder2.c(builder.d());
        if (z11 && builder2.f45167c == 100) {
            return null;
        }
        return builder2;
    }
}
