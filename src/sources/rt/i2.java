package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f49862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f49863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(j2 j2Var, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f49860a = i12;
        this.f49862c = j2Var;
        this.f49863d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49860a) {
            case 0:
                return new i2(this.f49862c, this.f49863d, dVar, 0);
            default:
                return new i2(this.f49862c, this.f49863d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49860a) {
            case 0:
                break;
        }
        return ((i2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f49860a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f49863d;
        j2 j2Var = this.f49862c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f49861b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0Var = j2Var.f49907d;
                    this.f49861b = 1;
                    fr.o0 o0Var = (fr.o0) n0Var;
                    o0Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new fr.f0(i12, 10, o0Var, null), this);
                    if (objM != aVar) {
                        objM = b0Var;
                    }
                    if (objM != aVar) {
                    }
                    return aVar;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVar = j2Var.f49908e;
                this.f49861b = 2;
                ((vt.d) cVar).j(this);
                if (b0Var != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f49861b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                wt.m mVar = j2Var.f49905b;
                this.f49861b = 1;
                return mVar.j(i12, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
