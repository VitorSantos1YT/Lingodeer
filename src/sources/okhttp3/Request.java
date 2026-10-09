package okhttp3;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import ns.o;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;
import oz.x;
import qy.l;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f45134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Headers f45136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestBody f45137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f45138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CacheControl f45139f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpUrl f45140a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RequestBody f45143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f45144e = s.f50855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45141b = "GET";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Headers.Builder f45142c = new Headers.Builder();

        public final void a(CacheControl cacheControl) {
            m.f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.f45142c.e(HttpHeaders.CACHE_CONTROL);
            } else {
                b(HttpHeaders.CACHE_CONTROL, string);
            }
        }

        public final void b(String str, String value) {
            m.f(value, "value");
            Headers.Builder builder = this.f45142c;
            builder.getClass();
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(value, str);
            builder.e(str);
            _HeadersCommonKt.a(builder, str, value);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
        public final void d(Class type, Object obj) {
            Map mapC;
            m.f(type, "type");
            e eVarA = z.a(type);
            if (obj == null) {
                if (this.f45144e.isEmpty()) {
                    return;
                }
                Object obj2 = this.f45144e;
                m.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                c0.c(obj2).remove(eVarA);
                return;
            }
            if (this.f45144e.isEmpty()) {
                mapC = new LinkedHashMap();
                this.f45144e = mapC;
            } else {
                Object obj3 = this.f45144e;
                m.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapC = c0.c(obj3);
            }
            f.l(eVarA, obj);
            mapC.put(eVarA, obj);
        }

        public final void e(String url) {
            m.f(url, "url");
            HttpUrl.Companion companion = HttpUrl.f45044j;
            if (x.s0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                m.e(strSubstring, "substring(...)");
                url = "http:".concat(strSubstring);
            } else if (x.s0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                m.e(strSubstring2, "substring(...)");
                url = "https:".concat(strSubstring2);
            }
            companion.getClass();
            this.f45140a = HttpUrl.Companion.c(url);
        }

        public final void c(String method, RequestBody requestBody) {
            m.f(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f45344a;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(ep.a.g("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.a(method)) {
                throw new IllegalArgumentException(ep.a.g("method ", method, IMCc.SDuLtUXYXMjAqR).toString());
            }
            this.f45141b = method;
            this.f45143d = requestBody;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public Request(Builder builder) {
        m.f(builder, "builder");
        HttpUrl httpUrl = builder.f45140a;
        if (httpUrl == null) {
            throw new IllegalStateException("url == null");
        }
        this.f45134a = httpUrl;
        this.f45135b = builder.f45141b;
        this.f45136c = builder.f45142c.d();
        this.f45137d = builder.f45143d;
        this.f45138e = ry.x.h0(builder.f45144e);
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f45139f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.f44946n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.f45136c);
        this.f45139f = cacheControlA;
        return cacheControlA;
    }

    public final Builder b() {
        Builder builder = new Builder();
        Object objK0 = s.f50855a;
        builder.f45144e = objK0;
        builder.f45140a = this.f45134a;
        builder.f45141b = this.f45135b;
        builder.f45143d = this.f45137d;
        Map map = this.f45138e;
        if (!map.isEmpty()) {
            objK0 = ry.x.k0(map);
        }
        builder.f45144e = objK0;
        builder.f45142c = this.f45136c.e();
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f45135b);
        sb2.append(", url=");
        sb2.append(this.f45134a);
        Headers headers = this.f45136c;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i11 = 0;
            for (l lVar : headers) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    o.V();
                    throw null;
                }
                l lVar2 = lVar;
                String str = (String) lVar2.f48495a;
                String str2 = (String) lVar2.f48496b;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (_UtilCommonKt.j(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i11 = i12;
            }
            sb2.append(']');
        }
        Map map = this.f45138e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
