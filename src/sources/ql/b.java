package ql;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.internal.m;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements vv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f47807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request.Builder f47808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Request f47809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Response f47810d;

    public b(String str, OkHttpClient okHttpClient) {
        Request.Builder builder = new Request.Builder();
        builder.e(str);
        this.f47808b = builder;
        this.f47807a = okHttpClient;
    }

    @Override // vv.a
    public final void b() {
        if (this.f47809c == null) {
            Request.Builder builder = this.f47808b;
            builder.getClass();
            this.f47809c = new Request(builder);
        }
        this.f47810d = this.f47807a.a(this.f47809c).c();
    }

    @Override // vv.a
    public final boolean c() {
        this.f47808b.c("HEAD", null);
        return true;
    }

    @Override // vv.a
    public final InputStream e() throws IOException {
        Response response = this.f47810d;
        if (response == null) {
            throw new IOException("Please invoke #execute first!");
        }
        ResponseBody responseBody = response.f45164t;
        if (responseBody != null) {
            return responseBody.byteStream();
        }
        throw new IOException("No body found on response!");
    }

    @Override // vv.a
    public final Map f() {
        Response response = this.f47810d;
        if (response == null) {
            return null;
        }
        return response.f45163f.f();
    }

    @Override // vv.a
    public final int i() {
        Response response = this.f47810d;
        if (response != null) {
            return response.f45161d;
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // vv.a
    public final void j(String name, String value) {
        Request.Builder builder = this.f47808b;
        builder.getClass();
        m.f(name, "name");
        m.f(value, "value");
        builder.f45142c.a(name, value);
    }

    @Override // vv.a
    public final String k(String str) {
        String strB;
        Response response = this.f47810d;
        if (response == null || (strB = response.f45163f.b(str)) == null) {
            return null;
        }
        return strB;
    }

    @Override // vv.a
    public final void l() {
        try {
            Response response = this.f47810d;
            if (response != null) {
                response.close();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f47809c = null;
        this.f47810d = null;
    }

    @Override // vv.a
    public final Map m() {
        if (this.f47809c == null) {
            Request.Builder builder = this.f47808b;
            builder.getClass();
            this.f47809c = new Request(builder);
        }
        return this.f47809c.f45136c.f();
    }
}
