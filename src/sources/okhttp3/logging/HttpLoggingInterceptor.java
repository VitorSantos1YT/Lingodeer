package okhttp3.logging;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m00.i;
import m00.k;
import m00.u;
import ns.o;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import okhttp3.logging.internal.IsProbablyUtf8Kt;
import ry.t;
import w4.c;
import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f45583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile t f45584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile t f45585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Level f45586d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Level {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level BASIC;
        public static final Level BODY;
        public static final Level HEADERS;
        public static final Level NONE;

        static {
            Level level = new Level("NONE", 0);
            NONE = level;
            Level level2 = new Level("BASIC", 1);
            BASIC = level2;
            Level level3 = new Level("HEADERS", 2);
            HEADERS = level3;
            Level level4 = new Level("BODY", 3);
            BODY = level4;
            Level[] levelArr = {level, level2, level3, level4};
            $VALUES = levelArr;
            $ENTRIES = ub.a.U(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f45587a;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f45588a = 0;

            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String message) {
                    m.f(message, "message");
                    Platform.f45527a.getClass();
                    Platform.f45528b.j(message, 4, null);
                }
            }

            static {
                new Companion();
            }

            private Companion() {
            }
        }

        static {
            int i11 = Companion.f45588a;
            f45587a = new Companion.DefaultLogger();
        }

        void a(String str);
    }

    static {
        new Companion(0);
    }

    public HttpLoggingInterceptor() {
        Logger logger = Logger.f45587a;
        m.f(logger, "logger");
        this.f45583a = logger;
        t tVar = t.f50856a;
        this.f45584b = tVar;
        this.f45585c = tVar;
        this.f45586d = Level.NONE;
    }

    public final void a(Headers headers, int i11) {
        t tVar = this.f45584b;
        headers.d(i11);
        tVar.getClass();
        String strG = headers.g(i11);
        this.f45583a.a(headers.d(i11) + ": " + strG);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z11;
        String str;
        Long lValueOf;
        Charset charsetA;
        Long lValueOf2;
        Charset charsetA2;
        Level level = this.f45586d;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f45349e;
        if (level == Level.NONE) {
            return realInterceptorChain.a(request);
        }
        boolean z12 = true;
        boolean z13 = level == Level.BODY;
        if (!z13 && level != Level.HEADERS) {
            z12 = false;
        }
        RequestBody requestBody = request.f45137d;
        Exchange exchange = realInterceptorChain.f45348d;
        RealConnection realConnectionB = exchange != null ? exchange.b() : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.f45135b);
        sb2.append(' ');
        HttpUrl url = request.f45134a;
        String str2 = "url";
        m.f(url, "url");
        this.f45585c.getClass();
        sb2.append(url.f45053i);
        String str3 = OYAvlbfUyD.GbfzrEAPd;
        sb2.append(realConnectionB != null ? str3 + realConnectionB.H : BuildConfig.VERSION_NAME);
        String string = sb2.toString();
        if (!z12 && requestBody != null) {
            StringBuilder sbR = e.r(string, " (");
            sbR.append(requestBody.contentLength());
            sbR.append("-byte body)");
            string = sbR.toString();
        }
        this.f45583a.a(string);
        if (z12) {
            Headers headers = request.f45136c;
            if (requestBody != null) {
                MediaType mediaTypeContentType = requestBody.contentType();
                z11 = z13;
                if (mediaTypeContentType != null && headers.b(HttpHeaders.CONTENT_TYPE) == null) {
                    this.f45583a.a("Content-Type: " + mediaTypeContentType);
                }
                if (requestBody.contentLength() != -1 && headers.b(HttpHeaders.CONTENT_LENGTH) == null) {
                    this.f45583a.a("Content-Length: " + requestBody.contentLength());
                }
            } else {
                z11 = z13;
                z12 = z12;
                str2 = "url";
            }
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                a(headers, i11);
            }
            if (!z11 || requestBody == null) {
                this.f45583a.a("--> END " + request.f45135b);
            } else {
                String strB = request.f45136c.b(HttpHeaders.CONTENT_ENCODING);
                if (strB != null && !strB.equalsIgnoreCase("identity") && !strB.equalsIgnoreCase("gzip")) {
                    this.f45583a.a("--> END " + request.f45135b + " (encoded body omitted)");
                } else if (requestBody.isDuplex()) {
                    this.f45583a.a("--> END " + request.f45135b + " (duplex request body omitted)");
                } else if (requestBody.isOneShot()) {
                    this.f45583a.a("--> END " + request.f45135b + " (one-shot body omitted)");
                } else {
                    i iVar = new i();
                    requestBody.writeTo(iVar);
                    if ("gzip".equalsIgnoreCase(headers.b(HttpHeaders.CONTENT_ENCODING))) {
                        lValueOf2 = Long.valueOf(iVar.f40718b);
                        u uVar = new u(iVar);
                        try {
                            iVar = new i();
                            iVar.m0(uVar);
                            uVar.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                o.m(uVar, th2);
                                throw th3;
                            }
                        }
                    } else {
                        lValueOf2 = null;
                    }
                    MediaType mediaTypeContentType2 = requestBody.contentType();
                    if (mediaTypeContentType2 == null || (charsetA2 = MediaType.a(mediaTypeContentType2)) == null) {
                        charsetA2 = oz.a.f46133a;
                    }
                    this.f45583a.a(BuildConfig.VERSION_NAME);
                    if (!IsProbablyUtf8Kt.a(iVar)) {
                        this.f45583a.a("--> END " + request.f45135b + " (binary " + requestBody.contentLength() + "-byte body omitted)");
                    } else if (lValueOf2 != null) {
                        this.f45583a.a("--> END " + request.f45135b + " (" + iVar.f40718b + "-byte, " + lValueOf2 + "-gzipped-byte body)");
                    } else {
                        this.f45583a.a(iVar.s0(charsetA2));
                        this.f45583a.a("--> END " + request.f45135b + " (" + requestBody.contentLength() + "-byte body)");
                    }
                }
            }
        } else {
            z11 = z13;
            z12 = z12;
            str3 = str3;
            str2 = "url";
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseA = ((RealInterceptorChain) chain).a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBody = responseA.f45164t;
            m.c(responseBody);
            long jContentLength = responseBody.contentLength();
            String str4 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            Logger logger = this.f45583a;
            StringBuilder sb3 = new StringBuilder();
            String str5 = str3;
            sb3.append("<-- " + responseA.f45161d);
            if (responseA.f45160c.length() > 0) {
                str = str5;
                sb3.append(str + responseA.f45160c);
            } else {
                str = str5;
            }
            StringBuilder sb4 = new StringBuilder(str);
            HttpUrl httpUrl = responseA.f45158a.f45134a;
            m.f(httpUrl, str2);
            this.f45585c.getClass();
            sb4.append(httpUrl.f45053i);
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb3.append(sb4.toString());
            if (!z12) {
                sb3.append(", " + str4 + " body");
            }
            sb3.append(")");
            logger.a(sb3.toString());
            if (z12) {
                Headers headers2 = responseA.f45163f;
                int size2 = headers2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    a(headers2, i12);
                }
                if (z11 && okhttp3.internal.http.HttpHeaders.a(responseA)) {
                    String strB2 = responseA.f45163f.b(HttpHeaders.CONTENT_ENCODING);
                    if (strB2 != null && !strB2.equalsIgnoreCase("identity") && !strB2.equalsIgnoreCase("gzip")) {
                        this.f45583a.a("<-- END HTTP (encoded body omitted)");
                        return responseA;
                    }
                    MediaType mediaTypeContentType3 = responseA.f45164t.contentType();
                    if (mediaTypeContentType3 != null && mediaTypeContentType3.f45066b.equals("text") && mediaTypeContentType3.f45067c.equals("event-stream")) {
                        this.f45583a.a("<-- END HTTP (streaming)");
                        return responseA;
                    }
                    k kVarSource = responseBody.source();
                    kVarSource.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    i iVarN = kVarSource.n();
                    if ("gzip".equalsIgnoreCase(headers2.b(HttpHeaders.CONTENT_ENCODING))) {
                        lValueOf = Long.valueOf(iVarN.f40718b);
                        u uVar2 = new u(iVarN.clone());
                        try {
                            iVarN = new i();
                            iVarN.m0(uVar2);
                            uVar2.close();
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                o.m(uVar2, th4);
                                throw th5;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType mediaTypeContentType4 = responseBody.contentType();
                    if (mediaTypeContentType4 == null || (charsetA = MediaType.a(mediaTypeContentType4)) == null) {
                        charsetA = oz.a.f46133a;
                    }
                    if (!IsProbablyUtf8Kt.a(iVarN)) {
                        this.f45583a.a(BuildConfig.VERSION_NAME);
                        Logger logger2 = this.f45583a;
                        StringBuilder sbJ = c.j(millis2, "<-- END HTTP (", "ms, binary ");
                        sbJ.append(iVarN.f40718b);
                        sbJ.append("-byte body omitted)");
                        logger2.a(sbJ.toString());
                        return responseA;
                    }
                    if (jContentLength != 0) {
                        this.f45583a.a(BuildConfig.VERSION_NAME);
                        this.f45583a.a(iVarN.clone().s0(charsetA));
                    }
                    Logger logger3 = this.f45583a;
                    StringBuilder sb5 = new StringBuilder();
                    StringBuilder sbJ2 = c.j(millis2, "<-- END HTTP (", "ms, ");
                    sbJ2.append(iVarN.f40718b);
                    sbJ2.append("-byte");
                    sb5.append(sbJ2.toString());
                    if (lValueOf != null) {
                        sb5.append(", " + lValueOf + "-gzipped-byte");
                    }
                    sb5.append(" body)");
                    logger3.a(sb5.toString());
                    return responseA;
                }
                this.f45583a.a("<-- END HTTP");
            }
            return responseA;
        } catch (Exception e8) {
            this.f45583a.a("<-- HTTP FAILED: " + e8);
            throw e8;
        }
    }
}
