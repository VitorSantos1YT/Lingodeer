package m6;

import a0.c0;
import l1.w0;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f40878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.f f40879b = new l1.f(new c0(this, 19));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40880c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40881d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rz.m f40883f;

    public f(w wVar) {
        this.f40878a = wVar;
    }

    public final void a() {
        synchronized (this.f40880c) {
            rz.m mVar = this.f40883f;
            if (mVar != null) {
                mVar.k(null);
            }
        }
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // l1.w0
    public final Object p(fz.c cVar, vy.d dVar) {
        return this.f40879b.p(cVar, dVar);
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
