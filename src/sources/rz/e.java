package rz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50880b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0[] f50881a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f50881a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }

    public final Object a(vy.d dVar) {
        m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        h0[] h0VarArr = this.f50881a;
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i11 = 0; i11 < length; i11++) {
            h0 h0Var = h0VarArr[i11];
            h0Var.start();
            c cVar = new c(this, mVar);
            cVar.f50871f = e0.v(h0Var, true, cVar);
            cVarArr[i11] = cVar;
        }
        d dVar2 = new d(cVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            c cVar2 = cVarArr[i12];
            cVar2.getClass();
            c.H.set(cVar2, dVar2);
        }
        if (mVar.x()) {
            dVar2.b();
        } else {
            mVar.v(dVar2);
        }
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }
}
