package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f42773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.c f42774b;

    public w1(f0 f0Var, dm.c cVar) {
        this.f42773a = f0Var;
        this.f42774b = cVar;
    }

    @Override // mw.z
    public final w b(lw.e1 e1Var, lw.c1 c1Var, lw.c cVar, lw.j[] jVarArr) {
        return new v1(this, this.f42773a.b(e1Var, c1Var, cVar, jVarArr));
    }

    @Override // mw.d1
    public final f0 e() {
        return this.f42773a;
    }
}
