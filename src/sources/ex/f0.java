package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p20.c f26004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26006e;

    public f0(n0 n0Var, int i11) {
        super(n0Var);
        this.f26004c = ax.d.f3260a;
        this.f26005d = 3;
        this.f26006e = i11;
    }

    @Override // uw.d
    public final void e(n20.b bVar) {
        uw.d dVar = this.f25954b;
        p20.c cVar = this.f26004c;
        if (ob.f.P(dVar, bVar, cVar)) {
            return;
        }
        dVar.d(new e0(bVar, cVar, this.f26005d, this.f26006e));
    }
}
