package d7;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import b7.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {
    public r H;
    public d K;
    public o L;
    public f M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f23234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f23235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f23236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f23237f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f23238t;

    public i(Context context, f fVar) {
        this.f23232a = context.getApplicationContext();
        fVar.getClass();
        this.f23234c = fVar;
        this.f23233b = new ArrayList();
    }

    public static void e(f fVar, q qVar) {
        if (fVar != null) {
            fVar.c(qVar);
        }
    }

    public final void b(f fVar) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f23233b;
            if (i11 >= arrayList.size()) {
                return;
            }
            fVar.c((q) arrayList.get(i11));
            i11++;
        }
    }

    @Override // d7.f
    public final void c(q qVar) {
        qVar.getClass();
        this.f23234c.c(qVar);
        this.f23233b.add(qVar);
        e(this.f23235d, qVar);
        e(this.f23236e, qVar);
        e(this.f23237f, qVar);
        e(this.f23238t, qVar);
        e(this.H, qVar);
        e(this.K, qVar);
        e(this.L, qVar);
    }

    @Override // d7.f
    public final void close() {
        f fVar = this.M;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.M = null;
            }
        }
    }

    @Override // d7.f
    public final Map p() {
        f fVar = this.M;
        return fVar == null ? Collections.EMPTY_MAP : fVar.p();
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) {
        f fVar = this.M;
        fVar.getClass();
        return fVar.read(bArr, i11, i12);
    }

    @Override // d7.f
    public final Uri x() {
        f fVar = this.M;
        if (fVar == null) {
            return null;
        }
        return fVar.x();
    }

    @Override // d7.f
    public final long u(h hVar) {
        b7.a.j(this.M == null);
        Uri uri = hVar.f23224a;
        String scheme = uri.getScheme();
        String str = f0.f3975a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f23232a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f23235d == null) {
                    m mVar = new m(false);
                    this.f23235d = mVar;
                    b(mVar);
                }
                this.M = this.f23235d;
            } else {
                if (this.f23236e == null) {
                    a aVar = new a(context);
                    this.f23236e = aVar;
                    b(aVar);
                }
                this.M = this.f23236e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f23236e == null) {
                a aVar2 = new a(context);
                this.f23236e = aVar2;
                b(aVar2);
            }
            this.M = this.f23236e;
        } else if ("content".equals(scheme)) {
            if (this.f23237f == null) {
                c cVar = new c(context);
                this.f23237f = cVar;
                b(cVar);
            }
            this.M = this.f23237f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            f fVar = this.f23234c;
            if (zEquals) {
                if (this.f23238t == null) {
                    try {
                        f fVar2 = (f) Class.forName(IMCc.vtfRtOo).getConstructor(null).newInstance(null);
                        this.f23238t = fVar2;
                        b(fVar2);
                    } catch (ClassNotFoundException unused) {
                        b7.a.B("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e8) {
                        throw new RuntimeException("Error instantiating RTMP extension", e8);
                    }
                    if (this.f23238t == null) {
                        this.f23238t = fVar;
                    }
                }
                this.M = this.f23238t;
            } else if ("udp".equals(scheme)) {
                if (this.H == null) {
                    r rVar = new r();
                    this.H = rVar;
                    b(rVar);
                }
                this.M = this.H;
            } else if ("data".equals(scheme)) {
                if (this.K == null) {
                    d dVar = new d(false);
                    this.K = dVar;
                    b(dVar);
                }
                this.M = this.K;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.L == null) {
                    o oVar = new o(context);
                    this.L = oVar;
                    b(oVar);
                }
                this.M = this.L;
            } else {
                this.M = fVar;
            }
        }
        return this.M.u(hVar);
    }
}
