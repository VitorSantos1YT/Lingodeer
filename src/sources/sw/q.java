package sw;

import java.util.concurrent.atomic.AtomicLong;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lw.j f51890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f51891c;

    public q(s sVar, lw.j jVar) {
        this.f51891c = sVar;
        this.f51890b = jVar;
    }

    @Override // lw.j
    public final void m(q1 q1Var) {
        n nVar = this.f51891c.f51893a;
        boolean zF = q1Var.f();
        p pVar = nVar.f51874a;
        if (pVar.f51887e != null || pVar.f51888f != null) {
            if (zF) {
                ((AtomicLong) nVar.f51875b.f48095b).getAndIncrement();
            } else {
                ((AtomicLong) nVar.f51875b.f48096c).getAndIncrement();
            }
        }
        this.f51890b.m(q1Var);
    }
}
