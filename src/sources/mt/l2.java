package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f41617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f41618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(boolean z11, q2 q2Var, fz.c cVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f41615a = i11;
        this.f41616b = z11;
        this.f41617c = q2Var;
        this.f41618d = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41615a) {
            case 0:
                return new l2(this.f41616b, this.f41617c, this.f41618d, dVar, 0);
            default:
                return new l2(this.f41616b, this.f41617c, this.f41618d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f41615a) {
            case 0:
                l2 l2Var = (l2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                l2Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                l2 l2Var2 = (l2) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                l2Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        q2 q2Var;
        q2 q2Var2;
        int i11 = this.f41615a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.c cVar = this.f41618d;
        q2 q2Var3 = this.f41617c;
        boolean z11 = this.f41616b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!z11 && q2Var3 != (q2Var = q2.FLASHCARD)) {
                    cVar.invoke(q2Var);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!z11 && q2Var3 != (q2Var2 = q2.FLASHCARD)) {
                    cVar.invoke(q2Var2);
                }
                break;
        }
        return b0Var;
    }
}
