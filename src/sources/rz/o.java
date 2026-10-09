package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f50939f;

    public /* synthetic */ o(m mVar, int i11) {
        this.f50938e = i11;
        this.f50939f = mVar;
    }

    @Override // rz.i1
    public final boolean i() {
        switch (this.f50938e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        switch (this.f50938e) {
            case 0:
                q1 q1VarH = h();
                m mVar = this.f50939f;
                Throwable thQ = mVar.q(q1VarH);
                if (mVar.y()) {
                    wz.f fVar = (wz.f) mVar.f50930d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.f.H;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        com.android.billingclient.api.a aVar = wz.b.f55503c;
                        if (kotlin.jvm.internal.m.a(obj, aVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, aVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != aVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                mVar.k(thQ);
                if (!mVar.y()) {
                    mVar.o();
                }
                break;
            default:
                this.f50939f.resumeWith(qy.b0.f48488a);
                break;
        }
    }
}
