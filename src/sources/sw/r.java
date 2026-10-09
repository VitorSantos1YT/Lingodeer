package sw;

import java.util.concurrent.atomic.AtomicLong;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends lw.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f51892b;

    public r(s sVar) {
        this.f51892b = sVar;
    }

    @Override // lw.j
    public final void m(q1 q1Var) {
        n nVar = this.f51892b.f51893a;
        boolean zF = q1Var.f();
        p pVar = nVar.f51874a;
        if (pVar.f51887e == null && pVar.f51888f == null) {
            return;
        }
        if (zF) {
            ((AtomicLong) nVar.f51875b.f48095b).getAndIncrement();
        } else {
            ((AtomicLong) nVar.f51875b.f48096c).getAndIncrement();
        }
    }
}
