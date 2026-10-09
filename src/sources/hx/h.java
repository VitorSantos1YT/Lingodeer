package hx;

import fb.g0;
import java.util.Iterator;
import java.util.List;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f33854a;

    public h(List list) {
        this.f33854a = list;
    }

    @Override // com.bumptech.glide.d
    public final void K(k kVar) {
        try {
            Iterator it = this.f33854a.iterator();
            try {
                if (!it.hasNext()) {
                    kVar.b(zw.b.INSTANCE);
                    kVar.onComplete();
                    return;
                }
                g gVar = new g(kVar, it);
                kVar.b(gVar);
                while (!gVar.f33851c) {
                    try {
                        Object next = gVar.f33850b.next();
                        ax.d.a(next, "The iterator returned a null value");
                        gVar.f33849a.onNext(next);
                        if (gVar.f33851c) {
                            return;
                        }
                        try {
                            if (!gVar.f33850b.hasNext()) {
                                if (gVar.f33851c) {
                                    return;
                                }
                                gVar.f33849a.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            g0.D(th2);
                            gVar.f33849a.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        g0.D(th3);
                        gVar.f33849a.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                g0.D(th4);
                kVar.b(zw.b.INSTANCE);
                kVar.onError(th4);
            }
        } catch (Throwable th5) {
            g0.D(th5);
            kVar.b(zw.b.INSTANCE);
            kVar.onError(th5);
        }
    }
}
