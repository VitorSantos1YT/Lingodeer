package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uz.j f4157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4161f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f4162t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i11, int i12, long j11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4156a = i12;
        this.f4160e = i11;
        this.f4161f = j11;
        this.f4162t = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4156a) {
            case 0:
                a1 a1Var = this.f4162t;
                b0 b0Var = new b0(this.f4160e, 0, this.f4161f, a1Var, dVar);
                b0Var.f4159d = obj;
                return b0Var;
            default:
                a1 a1Var2 = this.f4162t;
                b0 b0Var2 = new b0(this.f4160e, 1, this.f4161f, a1Var2, dVar);
                b0Var2.f4159d = obj;
                return b0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4156a) {
            case 0:
                break;
        }
        return ((b0) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4156a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                uz.j jVar = (uz.j) this.f4159d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4158c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    int i13 = this.f4160e;
                    y yVar = new y(i13, 1, this.f4161f, this.f4162t, null);
                    this.f4159d = null;
                    this.f4157b = jVar;
                    this.f4158c = 1;
                    obj = rz.e0.M(eVar, yVar, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                jVar = this.f4157b;
                com.bumptech.glide.e.F(obj);
                this.f4159d = null;
                this.f4157b = null;
                this.f4158c = 2;
                if (jVar.emit(obj, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                uz.j jVar2 = (uz.j) this.f4159d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f4158c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    int i15 = this.f4160e;
                    y yVar2 = new y(i15, 2, this.f4161f, this.f4162t, null);
                    this.f4159d = null;
                    this.f4157b = jVar2;
                    this.f4158c = 1;
                    obj = rz.e0.M(eVar2, yVar2, this);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                jVar2 = this.f4157b;
                com.bumptech.glide.e.F(obj);
                this.f4159d = null;
                this.f4157b = null;
                this.f4158c = 2;
                if (jVar2.emit(obj, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
