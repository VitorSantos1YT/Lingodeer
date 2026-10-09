package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uz.j f4192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(t tVar, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4191a = i11;
        this.f4195e = tVar;
        this.f4196f = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4191a) {
            case 0:
                e eVar = new e(this.f4195e, this.f4196f, dVar, 0);
                eVar.f4194d = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f4195e, this.f4196f, dVar, 1);
                eVar2.f4194d = obj;
                return eVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4191a) {
            case 0:
                break;
        }
        return ((e) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4191a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                uz.j jVar = (uz.j) this.f4194d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4193c;
                vy.d dVar = null;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    d dVar2 = new d(this.f4195e, this.f4196f, dVar, 0);
                    this.f4194d = null;
                    this.f4192b = jVar;
                    this.f4193c = 1;
                    obj = rz.e0.M(eVar, dVar2, this);
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
                jVar = this.f4192b;
                com.bumptech.glide.e.F(obj);
                this.f4194d = null;
                this.f4192b = null;
                this.f4193c = 2;
                if (jVar.emit(obj, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                uz.j jVar2 = (uz.j) this.f4194d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4193c;
                vy.d dVar3 = null;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (ry.l.D(new Integer[]{new Integer(53), new Integer(54)}, new Integer(((fr.o0) this.f4195e.f4372h).f27733a.keyLanguage))) {
                        yz.f fVar2 = rz.o0.f50940a;
                        s sVar = new s(this.f4196f, dVar3, 0);
                        this.f4194d = null;
                        this.f4192b = jVar2;
                        this.f4193c = 1;
                        obj = rz.e0.M(fVar2, sVar, this);
                        if (obj != aVar2) {
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        this.f4194d = null;
                        this.f4193c = 3;
                        if (jVar2.emit(bool, this) != aVar2) {
                            return b0Var;
                        }
                    }
                    return aVar2;
                }
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                jVar2 = this.f4192b;
                com.bumptech.glide.e.F(obj);
                this.f4194d = null;
                this.f4192b = null;
                this.f4193c = 2;
                if (jVar2.emit(obj, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
