package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f5934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(boolean z11, fz.e eVar, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f5933a = z11;
        this.f5934b = eVar;
        this.f5935c = i11;
        this.f5936d = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new r4(this.f5933a, this.f5934b, this.f5935c, this.f5936d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        r4 r4Var = (r4) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        r4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (this.f5933a) {
            this.f5934b.invoke(new Integer(this.f5935c), new Integer(this.f5936d));
        }
        return qy.b0.f48488a;
    }
}
