package a00;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qu.s;
import qy.b0;
import rz.j2;
import wz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements rz.l, j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz.m f250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f251b;

    public d(e eVar, rz.m mVar) {
        this.f251b = eVar;
        this.f250a = mVar;
    }

    @Override // rz.l
    public final void a(Object obj, fz.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.H;
        e eVar = this.f251b;
        atomicReferenceFieldUpdater.set(eVar, null);
        c cVar = new c(eVar, this);
        rz.m mVar = this.f250a;
        mVar.C(b0.f48488a, mVar.f50932c, new s(cVar, 1));
    }

    @Override // rz.j2
    public final void b(r rVar, int i11) {
        this.f250a.b(rVar, i11);
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f250a.f50931e;
    }

    @Override // rz.l
    public final com.android.billingclient.api.a h(Object obj, fz.f fVar) {
        e eVar = this.f251b;
        b bVar = new b(eVar, this);
        com.android.billingclient.api.a aVarF = this.f250a.F((b0) obj, bVar);
        if (aVarF != null) {
            e.H.set(eVar, null);
        }
        return aVarF;
    }

    @Override // rz.l
    public final boolean k(Throwable th2) {
        return this.f250a.k(th2);
    }

    @Override // rz.l
    public final void l(Object obj) {
        this.f250a.l(obj);
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        this.f250a.resumeWith(obj);
    }
}
