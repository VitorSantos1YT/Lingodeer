package fc;

import android.graphics.Bitmap;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kc.h;
import kc.o;
import kotlin.jvm.internal.m;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.http.DateFormattingKt;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f27127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f27128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f27129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f27131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f27133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f27134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27137k;

    public d(Request request, b bVar) {
        int i11;
        this.f27127a = request;
        this.f27128b = bVar;
        this.f27137k = -1;
        if (bVar != null) {
            this.f27134h = bVar.f27123c;
            this.f27135i = bVar.f27124d;
            Headers headers = bVar.f27126f;
            int size = headers.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strD = headers.d(i12);
                if (strD.equalsIgnoreCase(HttpHeaders.DATE)) {
                    String strB = headers.b(HttpHeaders.DATE);
                    this.f27129c = strB != null ? DateFormattingKt.a(strB) : null;
                    this.f27130d = headers.g(i12);
                } else if (strD.equalsIgnoreCase(HttpHeaders.EXPIRES)) {
                    String strB2 = headers.b(HttpHeaders.EXPIRES);
                    this.f27133g = strB2 != null ? DateFormattingKt.a(strB2) : null;
                } else if (strD.equalsIgnoreCase(HttpHeaders.LAST_MODIFIED)) {
                    String strB3 = headers.b(HttpHeaders.LAST_MODIFIED);
                    this.f27131e = strB3 != null ? DateFormattingKt.a(strB3) : null;
                    this.f27132f = headers.g(i12);
                } else if (strD.equalsIgnoreCase(HttpHeaders.ETAG)) {
                    this.f27136j = headers.g(i12);
                } else if (strD.equalsIgnoreCase("Age")) {
                    String strG = headers.g(i12);
                    Bitmap.Config[] configArr = h.f38057a;
                    Long lU0 = x.u0(strG);
                    if (lU0 != null) {
                        long jLongValue = lU0.longValue();
                        i11 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i11 = -1;
                    }
                    this.f27137k = i11;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, qy.h] */
    public final e a() {
        String string;
        long time;
        String str;
        int i11;
        Request request = this.f27127a;
        Headers headers = request.f45136c;
        HttpUrl httpUrl = request.f45134a;
        b bVar = this.f27128b;
        if (bVar == null) {
            return new e(request, null);
        }
        ?? r9 = bVar.f27121a;
        if (httpUrl.f() && !bVar.f27125e) {
            return new e(request, null);
        }
        CacheControl cacheControl = (CacheControl) r9.getValue();
        if (request.a().f44950b || ((CacheControl) r9.getValue()).f44950b || m.a(bVar.f27126f.b("Vary"), "*")) {
            return new e(request, null);
        }
        CacheControl cacheControlA = request.a();
        if (cacheControlA.f44949a || headers.b("If-Modified-Since") != null || headers.b("If-None-Match") != null) {
            return new e(request, null);
        }
        long time2 = this.f27135i;
        Date date = this.f27129c;
        long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
        long millis = 0;
        int i12 = this.f27137k;
        if (i12 != -1) {
            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i12));
        }
        long time3 = this.f27134h;
        long jLongValue = jMax + (time2 - time3) + (((Number) o.f38078a.invoke()).longValue() - time2);
        int i13 = ((CacheControl) r9.getValue()).f44951c;
        Date date2 = this.f27131e;
        if (i13 != -1) {
            time = TimeUnit.SECONDS.toMillis(i13);
        } else {
            Date date3 = this.f27133g;
            if (date3 != null) {
                if (date != null) {
                    time2 = date.getTime();
                }
                time = date3.getTime() - time2;
                if (time <= 0) {
                    time = 0;
                }
            } else if (date2 == null) {
                time = 0;
            } else {
                List list = httpUrl.f45051g;
                if (list == null) {
                    string = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    HttpUrl.Companion.a(HttpUrl.f45044j, list, sb2);
                    string = sb2.toString();
                }
                if (string != null) {
                    time = 0;
                } else {
                    if (date != null) {
                        time3 = date.getTime();
                    }
                    long time4 = time3 - date2.getTime();
                    if (time4 > 0) {
                        time = time4 / ((long) 10);
                    } else {
                        time = 0;
                    }
                }
            }
        }
        int i14 = cacheControlA.f44951c;
        if (i14 != -1) {
            time = Math.min(time, TimeUnit.SECONDS.toMillis(i14));
        }
        int i15 = cacheControlA.f44957i;
        long millis2 = i15 != -1 ? TimeUnit.SECONDS.toMillis(i15) : 0L;
        if (!cacheControl.f44955g && (i11 = cacheControlA.f44956h) != -1) {
            millis = TimeUnit.SECONDS.toMillis(i11);
        }
        if (!cacheControl.f44949a && jLongValue + millis2 < time + millis) {
            return new e(null, bVar);
        }
        String str2 = this.f27136j;
        if (str2 != null) {
            str = "If-None-Match";
        } else {
            if (date2 != null) {
                str2 = this.f27132f;
                m.c(str2);
            } else {
                if (date == null) {
                    return new e(request, null);
                }
                str2 = this.f27130d;
                m.c(str2);
            }
            str = "If-Modified-Since";
        }
        Request.Builder builderB = request.b();
        builderB.f45142c.a(str, str2);
        return new e(new Request(builderB), bVar);
    }
}
