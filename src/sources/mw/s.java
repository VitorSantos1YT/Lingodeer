package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lw.q1 f42669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw.c1 f42670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq.c f42671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xq.c cVar, lw.q1 q1Var, lw.c1 c1Var) {
        super(((v) cVar.f56176d).f42735h, 0);
        this.f42671e = cVar;
        this.f42669c = q1Var;
        this.f42670d = c1Var;
    }

    @Override // mw.h0
    public final void b() {
        tw.b.c();
        try {
            tw.b.a();
            tw.a aVar = tw.b.f52660a;
            aVar.getClass();
            c();
            aVar.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c() {
        lw.q1 q1Var = this.f42669c;
        lw.c1 c1Var = this.f42670d;
        lw.q1 q1Var2 = (lw.q1) this.f42671e.f56175c;
        if (q1Var2 != null) {
            c1Var = new lw.c1();
            q1Var = q1Var2;
        }
        ((v) this.f42671e.f56176d).m = true;
        try {
            ((lw.y) this.f42671e.f56174b).h(q1Var, c1Var);
            ((v) this.f42671e.f56176d).s();
            dm.c cVar = ((v) this.f42671e.f56176d).f42734g;
            if (q1Var.f()) {
                ((k2) cVar.f23492d).a();
            } else {
                ((k2) cVar.f23493e).a();
            }
        } catch (Throwable th2) {
            ((v) this.f42671e.f56176d).s();
            dm.c cVar2 = ((v) this.f42671e.f56176d).f42734g;
            if (q1Var.f()) {
                ((k2) cVar2.f23492d).a();
            } else {
                ((k2) cVar2.f23493e).a();
            }
            throw th2;
        }
    }
}
