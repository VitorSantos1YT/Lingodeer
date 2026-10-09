package fc;

import android.graphics.Bitmap;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import kc.h;
import kotlin.jvm.internal.m;
import m00.c0;
import m00.d0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import oz.q;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f27126f;

    public b(d0 d0Var) throws EOFException {
        j jVar = j.NONE;
        final int i11 = 0;
        this.f27121a = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: fc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27120b;

            {
                this.f27120b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        CacheControl.Companion companion = CacheControl.f44946n;
                        Headers headers = this.f27120b.f27126f;
                        companion.getClass();
                        return CacheControl.Companion.a(headers);
                    default:
                        String strB = this.f27120b.f27126f.b(HttpHeaders.CONTENT_TYPE);
                        if (strB == null) {
                            return null;
                        }
                        MediaType.f45062e.getClass();
                        return MediaType.Companion.b(strB);
                }
            }
        });
        final char c11 = 1 == true ? 1 : 0;
        this.f27122b = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: fc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27120b;

            {
                this.f27120b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (c11) {
                    case 0:
                        CacheControl.Companion companion = CacheControl.f44946n;
                        Headers headers = this.f27120b.f27126f;
                        companion.getClass();
                        return CacheControl.Companion.a(headers);
                    default:
                        String strB = this.f27120b.f27126f.b(HttpHeaders.CONTENT_TYPE);
                        if (strB == null) {
                            return null;
                        }
                        MediaType.f45062e.getClass();
                        return MediaType.Companion.b(strB);
                }
            }
        });
        this.f27123c = Long.parseLong(d0Var.c0(Long.MAX_VALUE));
        this.f27124d = Long.parseLong(d0Var.c0(Long.MAX_VALUE));
        this.f27125e = Integer.parseInt(d0Var.c0(Long.MAX_VALUE)) > 0;
        int i12 = Integer.parseInt(d0Var.c0(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i13 = 0; i13 < i12; i13++) {
            String strC0 = d0Var.c0(Long.MAX_VALUE);
            Bitmap.Config[] configArr = h.f38057a;
            int iH0 = q.H0(strC0, ':', 0, 6);
            if (iH0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strC0).toString());
            }
            String strSubstring = strC0.substring(0, iH0);
            m.e(strSubstring, "substring(...)");
            String string = q.i1(strSubstring).toString();
            String strSubstring2 = strC0.substring(iH0 + 1);
            m.e(strSubstring2, "substring(...)");
            builder.c(string, strSubstring2);
        }
        this.f27126f = builder.d();
    }

    public final void a(c0 c0Var) {
        c0Var.b(this.f27123c);
        c0Var.writeByte(10);
        c0Var.b(this.f27124d);
        c0Var.writeByte(10);
        c0Var.b(this.f27125e ? 1L : 0L);
        c0Var.writeByte(10);
        Headers headers = this.f27126f;
        c0Var.b(headers.size());
        c0Var.writeByte(10);
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0Var.l0(headers.d(i11));
            c0Var.l0(": ");
            c0Var.l0(headers.g(i11));
            c0Var.writeByte(10);
        }
    }

    public b(Response response) {
        j jVar = j.NONE;
        final int i11 = 0;
        this.f27121a = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: fc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27120b;

            {
                this.f27120b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        CacheControl.Companion companion = CacheControl.f44946n;
                        Headers headers = this.f27120b.f27126f;
                        companion.getClass();
                        return CacheControl.Companion.a(headers);
                    default:
                        String strB = this.f27120b.f27126f.b(HttpHeaders.CONTENT_TYPE);
                        if (strB == null) {
                            return null;
                        }
                        MediaType.f45062e.getClass();
                        return MediaType.Companion.b(strB);
                }
            }
        });
        final int i12 = 1;
        this.f27122b = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: fc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27120b;

            {
                this.f27120b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        CacheControl.Companion companion = CacheControl.f44946n;
                        Headers headers = this.f27120b.f27126f;
                        companion.getClass();
                        return CacheControl.Companion.a(headers);
                    default:
                        String strB = this.f27120b.f27126f.b(HttpHeaders.CONTENT_TYPE);
                        if (strB == null) {
                            return null;
                        }
                        MediaType.f45062e.getClass();
                        return MediaType.Companion.b(strB);
                }
            }
        });
        this.f27123c = response.M;
        this.f27124d = response.N;
        this.f27125e = response.f45162e != null;
        this.f27126f = response.f45163f;
    }
}
