package ge;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import java.util.ArrayList;
import pe.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd.d f29154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f29157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wd.a f29158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f29161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f29162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f29164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f29165l;
    public f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29168p;

    public i(com.bumptech.glide.c cVar, sd.d dVar, int i11, int i12, Bitmap bitmap) {
        wd.a aVar = cVar.f7607b;
        com.bumptech.glide.i iVar = cVar.f7609d;
        p pVarE = com.bumptech.glide.c.e(iVar.getBaseContext());
        p pVarE2 = com.bumptech.glide.c.e(iVar.getBaseContext());
        pVarE2.getClass();
        n nVarU = new n(pVarE2.f7693a, pVarE2, Bitmap.class, pVarE2.f7694b).a(p.M).a(((le.g) ((le.g) ((le.g) new le.g().f(vd.n.f53921b)).s()).p()).j(i11, i12));
        this.f29156c = new ArrayList();
        this.f29157d = pVarE;
        Handler handler = new Handler(Looper.getMainLooper(), new h(this, 0));
        this.f29158e = aVar;
        this.f29155b = handler;
        this.f29161h = nVarU;
        this.f29154a = dVar;
        c(be.c.f4135b, bitmap);
    }

    public final void a() {
        int i11;
        int i12;
        if (!this.f29159f || this.f29160g) {
            return;
        }
        f fVar = this.m;
        if (fVar != null) {
            this.m = null;
            b(fVar);
            return;
        }
        this.f29160g = true;
        sd.d dVar = this.f29154a;
        sd.b bVar = dVar.f51570l;
        int i13 = bVar.f51546c;
        if (i13 <= 0 || (i12 = dVar.f51569k) < 0) {
            i11 = 0;
        } else {
            i11 = (i12 < 0 || i12 >= i13) ? -1 : ((sd.a) bVar.f51548e.get(i12)).f51541i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i11);
        int i14 = (dVar.f51569k + 1) % dVar.f51570l.f51546c;
        dVar.f51569k = i14;
        this.f29164k = new f(this.f29155b, i14, jUptimeMillis);
        n nVarZ = this.f29161h.a((le.g) new le.g().o(new oe.b(Double.valueOf(Math.random())))).z(dVar);
        nVarZ.y(this.f29164k, nVarZ);
    }

    public final void b(f fVar) {
        this.f29160g = false;
        boolean z11 = this.f29163j;
        Handler handler = this.f29155b;
        if (z11) {
            handler.obtainMessage(2, fVar).sendToTarget();
            return;
        }
        if (!this.f29159f) {
            this.m = fVar;
            return;
        }
        if (fVar.f29151t != null) {
            Bitmap bitmap = this.f29165l;
            if (bitmap != null) {
                this.f29158e.d(bitmap);
                this.f29165l = null;
            }
            f fVar2 = this.f29162i;
            this.f29162i = fVar;
            ArrayList arrayList = this.f29156c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) ((g) arrayList.get(size));
                Object callback = dVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    dVar.stop();
                    dVar.invalidateSelf();
                } else {
                    dVar.invalidateSelf();
                    i iVar = (i) dVar.f29140a.f29139b;
                    f fVar3 = iVar.f29162i;
                    if ((fVar3 != null ? fVar3.f29149e : -1) == iVar.f29154a.f51570l.f51546c - 1) {
                        dVar.f29145f++;
                    }
                    int i11 = dVar.f29146t;
                    if (i11 != -1 && dVar.f29145f >= i11) {
                        dVar.stop();
                    }
                }
            }
            if (fVar2 != null) {
                handler.obtainMessage(2, fVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(td.n nVar, Bitmap bitmap) {
        pe.f.c(nVar, "Argument must not be null");
        pe.f.c(bitmap, "Argument must not be null");
        this.f29165l = bitmap;
        this.f29161h = this.f29161h.a(new le.g().r(nVar, true));
        this.f29166n = m.c(bitmap);
        this.f29167o = bitmap.getWidth();
        this.f29168p = bitmap.getHeight();
    }
}
