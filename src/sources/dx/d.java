package dx;

import a0.b2;
import com.google.firebase.inappmessaging.internal.t;
import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends uw.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24541b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f24540a = i11;
        this.f24541b = obj;
    }

    @Override // uw.b
    public final void d(uw.c cVar) {
        switch (this.f24540a) {
            case 0:
                ww.d dVar = new ww.d(ax.d.f3261b);
                cVar.b(dVar);
                try {
                    ((yw.a) this.f24541b).run();
                    if (!dVar.a()) {
                        cVar.onComplete();
                    }
                    break;
                } catch (Throwable th2) {
                    g0.D(th2);
                    if (dVar.a()) {
                        qx.b.B(th2);
                        return;
                    } else {
                        cVar.onError(th2);
                        return;
                    }
                }
                break;
            case 1:
                ww.d dVar2 = new ww.d(ax.d.f3261b);
                cVar.b(dVar2);
                try {
                    ((t) this.f24541b).call();
                    if (!dVar2.a()) {
                        cVar.onComplete();
                    }
                    break;
                } catch (Throwable th3) {
                    g0.D(th3);
                    if (dVar2.a()) {
                        qx.b.B(th3);
                        return;
                    } else {
                        cVar.onError(th3);
                        return;
                    }
                }
                break;
            default:
                ((f) this.f24541b).c(new b2(9, this, cVar));
                break;
        }
    }
}
