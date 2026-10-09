package o20;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements e {
    public Throwable H;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f44488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f44490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Call.Factory f44491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f44492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f44493f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Call f44494t;

    public b0(s0 s0Var, Object obj, Object[] objArr, Call.Factory factory, m mVar) {
        this.f44488a = s0Var;
        this.f44489b = obj;
        this.f44490c = objArr;
        this.f44491d = factory;
        this.f44492e = mVar;
    }

    @Override // o20.e
    public final void H0(h hVar) {
        Call call;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.K) {
                    throw new IllegalStateException("Already executed.");
                }
                this.K = true;
                call = this.f44494t;
                th2 = this.H;
                if (call == null && th2 == null) {
                    try {
                        Call callA = a();
                        this.f44494t = callA;
                        call = callA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c1.q(th2);
                        this.H = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            hVar.y(this, th2);
            return;
        }
        if (this.f44493f) {
            call.cancel();
        }
        call.H(new b1.p(this, hVar));
    }

    public final Call a() {
        HttpUrl httpUrlA;
        s0 s0Var = this.f44488a;
        c1[] c1VarArr = s0Var.f44593k;
        Object[] objArr = this.f44490c;
        int length = objArr.length;
        if (length != c1VarArr.length) {
            throw new IllegalArgumentException(hh.p0.i(c1VarArr.length, ")", w4.c.i(length, "Argument count (", ") doesn't match expected count (")));
        }
        q0 q0Var = new q0(s0Var.f44586d, s0Var.f44585c, s0Var.f44587e, s0Var.f44588f, s0Var.f44589g, s0Var.f44590h, s0Var.f44591i, s0Var.f44592j);
        if (s0Var.f44594l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
            c1VarArr[i11].a(q0Var, objArr[i11]);
        }
        HttpUrl.Builder builder = q0Var.f44547d;
        if (builder != null) {
            httpUrlA = builder.a();
        } else {
            String link = q0Var.f44546c;
            HttpUrl httpUrl = q0Var.f44545b;
            httpUrl.getClass();
            kotlin.jvm.internal.m.f(link, "link");
            HttpUrl.Builder builderG = httpUrl.g(link);
            httpUrlA = builderG != null ? builderG.a() : null;
            if (httpUrlA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + q0Var.f44546c);
            }
        }
        RequestBody p0Var = q0Var.f44554k;
        if (p0Var == null) {
            FormBody.Builder builder2 = q0Var.f44553j;
            if (builder2 != null) {
                p0Var = new FormBody(builder2.f45033a, builder2.f45034b);
            } else {
                MultipartBody.Builder builder3 = q0Var.f44552i;
                if (builder3 != null) {
                    ArrayList arrayList2 = builder3.f45080c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    p0Var = new MultipartBody(builder3.f45078a, builder3.f45079b, _UtilJvmKt.j(arrayList2));
                } else if (q0Var.f44551h) {
                    p0Var = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = q0Var.f44550g;
        Headers.Builder builder4 = q0Var.f44549f;
        if (mediaType != null) {
            if (p0Var != null) {
                p0Var = new p0(p0Var, mediaType);
            } else {
                builder4.a(HttpHeaders.CONTENT_TYPE, mediaType.f45065a);
            }
        }
        Request.Builder builder5 = q0Var.f44548e;
        builder5.getClass();
        builder5.f45140a = httpUrlA;
        builder5.f45142c = builder4.d().e();
        builder5.c(q0Var.f44544a, p0Var);
        builder5.d(u.class, new u(s0Var.f44583a, this.f44489b, s0Var.f44584b, arrayList));
        return this.f44491d.a(new Request(builder5));
    }

    @Override // o20.e
    public final boolean b() {
        boolean z11 = true;
        if (this.f44493f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f44494t;
                if (call == null || !call.b()) {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public final Call c() throws IOException {
        Call call = this.f44494t;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.H;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            Call callA = a();
            this.f44494t = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e8) {
            c1.q(e8);
            this.H = e8;
            throw e8;
        }
    }

    @Override // o20.e
    public final void cancel() {
        Call call;
        this.f44493f = true;
        synchronized (this) {
            call = this.f44494t;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new b0(this.f44488a, this.f44489b, this.f44490c, this.f44491d, this.f44492e);
    }

    public final t0 d(Response response) throws IOException {
        ResponseBody responseBody = response.f45164t;
        Response.Builder builderA = response.a();
        builderA.f45171g = new a0(responseBody.contentType(), responseBody.contentLength());
        Response responseA = builderA.a();
        boolean z11 = responseA.R;
        int i11 = responseA.f45161d;
        if (i11 < 200 || i11 >= 300) {
            try {
                m00.i iVar = new m00.i();
                responseBody.source().O(iVar);
                Objects.requireNonNull(ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), iVar), "body == null");
                if (z11) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                t0 t0Var = new t0(responseA, null);
                responseBody.close();
                return t0Var;
            } catch (Throwable th2) {
                responseBody.close();
                throw th2;
            }
        }
        if (i11 == 204 || i11 == 205) {
            responseBody.close();
            if (z11) {
                return new t0(responseA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        z zVar = new z(responseBody);
        try {
            Object objJ = this.f44492e.j(zVar);
            if (z11) {
                return new t0(responseA, objJ);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e8) {
            IOException iOException = zVar.f44625c;
            if (iOException == null) {
                throw e8;
            }
            throw iOException;
        }
    }

    @Override // o20.e
    public final synchronized Request e() {
        try {
        } catch (IOException e8) {
            throw new RuntimeException("Unable to create request.", e8);
        }
        return c().e();
    }

    @Override // o20.e
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final e mo231clone() {
        return new b0(this.f44488a, this.f44489b, this.f44490c, this.f44491d, this.f44492e);
    }
}
