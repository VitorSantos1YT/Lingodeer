package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(qx.h hVar, Object obj, int i11) {
        super(hVar);
        this.f3308b = i11;
        this.f3309c = obj;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        switch (this.f3308b) {
            case 0:
                ((qx.h) this.f3265a).i(new f0(kVar, (tx.d) this.f3309c));
                break;
            default:
                m0 m0Var = new m0(kVar);
                kVar.c(m0Var);
                ux.b.e(m0Var, ((qx.o) this.f3309c).b(new aw.t(1, this, m0Var)));
                break;
        }
    }
}
