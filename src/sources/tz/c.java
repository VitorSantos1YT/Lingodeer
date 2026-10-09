package tz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rz.e0;
import rz.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f52666a = j.f52699p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rz.m f52667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f52668c;

    public c(h hVar) {
        this.f52668c = hVar;
    }

    public final Object a(xy.c cVar) throws Throwable {
        p pVarP;
        Object obj = this.f52666a;
        boolean z11 = true;
        if (obj == j.f52699p || obj == j.f52696l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f52682t;
            h hVar = this.f52668c;
            p pVar = (p) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.w()) {
                long andIncrement = h.f52678c.getAndIncrement(hVar);
                long j11 = j.f52686b;
                long j12 = andIncrement / j11;
                int i11 = (int) (andIncrement % j11);
                if (pVar.f55543c != j12) {
                    pVarP = hVar.p(j12, pVar);
                    if (pVarP == null) {
                        continue;
                    }
                } else {
                    pVarP = pVar;
                }
                Object objH = hVar.H(pVarP, i11, andIncrement, null);
                com.android.billingclient.api.a aVar = j.m;
                if (objH == aVar) {
                    throw new IllegalStateException("unreachable");
                }
                com.android.billingclient.api.a aVar2 = j.f52698o;
                if (objH == aVar2) {
                    if (andIncrement < hVar.t()) {
                        pVarP.b();
                    }
                    pVar = pVarP;
                } else {
                    if (objH == j.f52697n) {
                        h hVar2 = this.f52668c;
                        rz.m mVarT = e0.t(ue.f.x(cVar));
                        try {
                            this.f52667b = mVarT;
                            Object objH2 = hVar2.H(pVarP, i11, andIncrement, this);
                            if (objH2 != aVar) {
                                if (objH2 == aVar2) {
                                    if (andIncrement < hVar2.t()) {
                                        pVarP.b();
                                    }
                                    p pVar2 = (p) h.f52682t.get(hVar2);
                                    while (true) {
                                        if (hVar2.w()) {
                                            rz.m mVar = this.f52667b;
                                            kotlin.jvm.internal.m.c(mVar);
                                            this.f52667b = null;
                                            this.f52666a = j.f52696l;
                                            Throwable thQ = hVar.q();
                                            if (thQ != null) {
                                                mVar.resumeWith(com.bumptech.glide.e.l(thQ));
                                                break;
                                            }
                                            mVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = h.f52678c.getAndIncrement(hVar2);
                                        long j13 = j.f52686b;
                                        long j14 = andIncrement2 / j13;
                                        int i12 = (int) (andIncrement2 % j13);
                                        if (pVar2.f55543c != j14) {
                                            p pVarP2 = hVar2.p(j14, pVar2);
                                            if (pVarP2 != null) {
                                                pVar2 = pVarP2;
                                            }
                                        }
                                        Object objH3 = hVar2.H(pVar2, i12, andIncrement2, this);
                                        if (objH3 == j.m) {
                                            b(pVar2, i12);
                                            break;
                                        }
                                        if (objH3 == j.f52698o) {
                                            if (andIncrement2 < hVar2.t()) {
                                                pVar2.b();
                                            }
                                        } else {
                                            if (objH3 == j.f52697n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            pVar2.b();
                                            this.f52666a = objH3;
                                            this.f52667b = null;
                                        }
                                    }
                                } else {
                                    pVarP.b();
                                    this.f52666a = objH2;
                                    this.f52667b = null;
                                }
                                mVarT.a(Boolean.TRUE, null);
                                break;
                            }
                            b(pVarP, i11);
                            Object objR = mVarT.r();
                            wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                            return objR;
                        } catch (Throwable th2) {
                            mVarT.B();
                            throw th2;
                        }
                    }
                    pVarP.b();
                    this.f52666a = objH;
                }
            }
            this.f52666a = j.f52696l;
            Throwable thQ2 = hVar.q();
            if (thQ2 != null) {
                int i13 = wz.s.f55544a;
                throw thQ2;
            }
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // rz.j2
    public final void b(wz.r rVar, int i11) {
        rz.m mVar = this.f52667b;
        if (mVar != null) {
            mVar.b(rVar, i11);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f52666a;
        com.android.billingclient.api.a aVar = j.f52699p;
        if (obj == aVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f52666a = aVar;
        if (obj != j.f52696l) {
            return obj;
        }
        Throwable thR = this.f52668c.r();
        int i11 = wz.s.f55544a;
        throw thR;
    }
}
