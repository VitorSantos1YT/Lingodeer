package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wc.h f596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, wc.h hVar, float f5, boolean z11, vy.d dVar) {
        super(1, dVar);
        this.f595a = iVar;
        this.f596b = hVar;
        this.f597c = f5;
        this.f598d = z11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new h(this.f595a, this.f596b, this.f597c, this.f598d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        h hVar = (h) create((vy.d) obj);
        qy.b0 b0Var = qy.b0.f48488a;
        hVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        wc.h hVar = this.f596b;
        i iVar = this.f595a;
        iVar.K.setValue(hVar);
        iVar.j(this.f597c);
        iVar.h(1);
        iVar.f599a.setValue(Boolean.FALSE);
        if (this.f598d) {
            iVar.N.setValue(Long.MIN_VALUE);
        }
        return qy.b0.f48488a;
    }
}
