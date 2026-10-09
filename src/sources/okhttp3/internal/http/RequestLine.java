package okhttp3.internal.http;

import kotlin.jvm.internal.m;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RequestLine f45357a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        m.f(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }
}
