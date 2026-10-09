package ex;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends uw.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26060d;

    public /* synthetic */ r(int i11, Object obj, Object obj2) {
        this.f26058b = i11;
        this.f26059c = obj;
        this.f26060d = obj2;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        k pVar;
        switch (this.f26058b) {
            case 0:
                int i11 = j.f26028a[((uw.a) this.f26060d).ordinal()];
                if (i11 == 1) {
                    pVar = new p(bVar);
                } else if (i11 == 2) {
                    pVar = new n(bVar);
                } else if (i11 != 3) {
                    pVar = i11 != 4 ? new l(bVar, uw.d.f53244a) : new o(bVar);
                } else {
                    pVar = new m(bVar);
                }
                bVar.c(pVar);
                try {
                    ((uw.f) this.f26059c).g(pVar);
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    pVar.c(th2);
                }
                break;
            default:
                try {
                    Object objApply = ((yw.c) this.f26060d).apply(this.f26059c);
                    ax.d.a(objApply, "The mapper returned a null Publisher");
                    n20.a aVar = (n20.a) objApply;
                    if (!(aVar instanceof Callable)) {
                        aVar.a(bVar);
                    } else {
                        try {
                            Object objCall = ((Callable) aVar).call();
                            if (objCall != null) {
                                bVar.c(new mx.e(objCall, bVar));
                            } else {
                                mx.d.b(bVar);
                            }
                        } catch (Throwable th3) {
                            fb.g0.D(th3);
                            mx.d.c(th3, bVar);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    mx.d.c(th4, bVar);
                    return;
                }
                break;
        }
    }
}
