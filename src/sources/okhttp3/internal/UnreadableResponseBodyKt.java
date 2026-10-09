package okhttp3.internal;

import kotlin.jvm.internal.m;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        m.f(response, "<this>");
        Response.Builder builderA = response.a();
        ResponseBody responseBody = response.f45164t;
        builderA.f45171g = new UnreadableResponseBody(responseBody.contentType(), responseBody.contentLength());
        return builderA.a();
    }
}
