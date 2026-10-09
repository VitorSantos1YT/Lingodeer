package sw;

import lw.c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends lw.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f51893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.h f51894b;

    public s(n nVar, lw.h hVar) {
        this.f51893a = nVar;
        this.f51894b = hVar;
    }

    @Override // lw.h
    public final lw.j a(lw.i iVar, c1 c1Var) {
        lw.h hVar = this.f51894b;
        return hVar != null ? new q(this, hVar.a(iVar, c1Var)) : new r(this);
    }
}
