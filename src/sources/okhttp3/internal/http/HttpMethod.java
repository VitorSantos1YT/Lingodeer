package okhttp3.internal.http;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HttpMethod f45344a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean a(String method) {
        m.f(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
