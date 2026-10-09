package rz;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends i1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f50870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f50871f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f50872t;

    public c(e eVar, m mVar) {
        this.f50872t = eVar;
        this.f50870e = mVar;
    }

    @Override // rz.i1
    public final boolean i() {
        return false;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        m mVar = this.f50870e;
        if (th2 != null) {
            mVar.getClass();
            com.android.billingclient.api.a aVarF = mVar.F(new v(th2, false), null);
            if (aVarF != null) {
                mVar.l(aVarF);
                d dVar = (d) H.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f50880b;
        e eVar = this.f50872t;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            h0[] h0VarArr = eVar.f50881a;
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
