package ay;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends qx.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3399b;

    public /* synthetic */ w(Object obj, int i11) {
        this.f3398a = i11;
        this.f3399b = obj;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        switch (this.f3398a) {
            case 0:
                Object[] objArr = (Object[]) this.f3399b;
                v vVar = new v(kVar, objArr);
                kVar.c(vVar);
                if (vVar.f3396d) {
                    return;
                }
                int length = objArr.length;
                for (int i11 = 0; i11 < length && !vVar.f3397e; i11++) {
                    Object obj = objArr[i11];
                    if (obj == null) {
                        vVar.f3393a.onError(new NullPointerException(hh.p0.h(i11, "The element at index ", " is null")));
                        return;
                    }
                    vVar.f3393a.onNext(obj);
                }
                if (vVar.f3397e) {
                    return;
                }
                vVar.f3393a.onComplete();
                return;
            case 1:
                try {
                    Iterator it = ((Iterable) this.f3399b).iterator();
                    try {
                        if (!it.hasNext()) {
                            ux.c.c(kVar);
                            return;
                        }
                        y yVar = new y(kVar, it);
                        kVar.c(yVar);
                        if (yVar.f3404d) {
                            return;
                        }
                        while (!yVar.f3403c) {
                            try {
                                Object next = yVar.f3402b.next();
                                Objects.requireNonNull(next, "The iterator returned a null value");
                                yVar.f3401a.onNext(next);
                                if (yVar.f3403c) {
                                    return;
                                }
                                try {
                                    if (!yVar.f3402b.hasNext()) {
                                        if (yVar.f3403c) {
                                            return;
                                        }
                                        yVar.f3401a.onComplete();
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    ef.e.E(th2);
                                    yVar.f3401a.onError(th2);
                                    return;
                                }
                            } catch (Throwable th3) {
                                ef.e.E(th3);
                                yVar.f3401a.onError(th3);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        ef.e.E(th4);
                        ux.c.e(th4, kVar);
                        return;
                    }
                } catch (Throwable th5) {
                    ef.e.E(th5);
                    ux.c.e(th5, kVar);
                    return;
                }
            case 2:
                ((qx.h) ((qx.i) this.f3399b)).i(kVar);
                return;
            case 3:
                try {
                    ((l0) this.f3399b).I(new cy.b(kVar));
                    return;
                } catch (NullPointerException e8) {
                    throw e8;
                } catch (Throwable th6) {
                    ef.e.E(th6);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th6);
                    throw nullPointerException;
                }
            default:
                o20.e eVarMo231clone = ((o20.b0) this.f3399b).mo231clone();
                p20.b bVar = new p20.b(eVarMo231clone, kVar);
                kVar.c(bVar);
                if (bVar.f46289c) {
                    return;
                }
                ((o20.b0) eVarMo231clone).H0(bVar);
                return;
        }
    }
}
