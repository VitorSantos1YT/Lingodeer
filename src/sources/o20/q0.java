package o20;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f44543l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f44545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f44547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f44548e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers.Builder f44549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaType f44550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f44551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MultipartBody.Builder f44552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FormBody.Builder f44553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RequestBody f44554k;

    public q0(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z11, boolean z12, boolean z13) {
        this.f44544a = str;
        this.f44545b = httpUrl;
        this.f44546c = str2;
        this.f44550g = mediaType;
        this.f44551h = z11;
        if (headers != null) {
            this.f44549f = headers.e();
        } else {
            this.f44549f = new Headers.Builder();
        }
        if (z12) {
            this.f44553j = new FormBody.Builder();
            return;
        }
        if (z13) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f44552i = builder;
            MediaType type = MultipartBody.f45070f;
            kotlin.jvm.internal.m.f(type, "type");
            if (type.f45066b.equals("multipart")) {
                builder.f45079b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String str, boolean z11) {
        FormBody.Builder builder = this.f44553j;
        if (z11) {
            builder.getClass();
            kotlin.jvm.internal.m.f(name, "name");
            builder.f45033a.add(_UrlKt.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            builder.f45034b.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        builder.getClass();
        kotlin.jvm.internal.m.f(name, "name");
        builder.f45033a.add(_UrlKt.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        builder.f45034b.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z11) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                MediaType.f45062e.getClass();
                this.f44550g = MediaType.Companion.a(str2);
                return;
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException(ep.a.e("Malformed content type: ", str2), e8);
            }
        }
        Headers.Builder builder = this.f44549f;
        if (z11) {
            builder.c(str, str2);
        } else {
            builder.a(str, str2);
        }
    }

    public final void c(Headers headers, RequestBody body) {
        MultipartBody.Builder builder = this.f44552i;
        builder.getClass();
        kotlin.jvm.internal.m.f(body, "body");
        MultipartBody.Part.f45081c.getClass();
        if (headers.b(HttpHeaders.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers.b(HttpHeaders.CONTENT_LENGTH) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        builder.f45080c.add(new MultipartBody.Part(headers, body));
    }

    public final void d(String name, String str, boolean z11) {
        String str2 = this.f44546c;
        if (str2 != null) {
            HttpUrl httpUrl = this.f44545b;
            HttpUrl.Builder builderG = httpUrl.g(str2);
            this.f44547d = builderG;
            if (builderG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f44546c);
            }
            this.f44546c = null;
        }
        if (z11) {
            HttpUrl.Builder builder = this.f44547d;
            builder.getClass();
            kotlin.jvm.internal.m.f(name, "encodedName");
            if (builder.f45060g == null) {
                builder.f45060g = new ArrayList();
            }
            ArrayList arrayList = builder.f45060g;
            kotlin.jvm.internal.m.c(arrayList);
            arrayList.add(_UrlKt.a(name, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = builder.f45060g;
            kotlin.jvm.internal.m.c(arrayList2);
            arrayList2.add(str != null ? _UrlKt.a(str, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        HttpUrl.Builder builder2 = this.f44547d;
        builder2.getClass();
        kotlin.jvm.internal.m.f(name, "name");
        if (builder2.f45060g == null) {
            builder2.f45060g = new ArrayList();
        }
        ArrayList arrayList3 = builder2.f45060g;
        kotlin.jvm.internal.m.c(arrayList3);
        arrayList3.add(_UrlKt.a(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = builder2.f45060g;
        kotlin.jvm.internal.m.c(arrayList4);
        arrayList4.add(str != null ? _UrlKt.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }
}
