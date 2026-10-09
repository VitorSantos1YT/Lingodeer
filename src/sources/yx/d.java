package yx;

import qx.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends qx.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qx.b f58368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f58369f;

    public d(qx.b bVar, o oVar) {
        this.f58368e = bVar;
        this.f58369f = oVar;
    }

    @Override // qx.b
    public final void L(qx.c cVar) {
        c cVar2 = new c(cVar, this.f58368e);
        cVar.c(cVar2);
        rx.b bVarB = this.f58369f.b(cVar2);
        ux.d dVar = cVar2.f58366b;
        dVar.getClass();
        ux.b.c(dVar, bVarB);
    }
}
