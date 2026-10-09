package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f43712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.e f43713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f43714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f43716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43711a = i11;
        this.f43716f = w0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43711a) {
            case 0:
                return new v0(this.f43716f, dVar, 0);
            default:
                return new v0(this.f43716f, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43711a) {
            case 0:
                break;
        }
        return ((v0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        x0 x0Var;
        a00.e eVar;
        vy.d dVar;
        w0 w0Var2;
        x0 x0Var2;
        a00.e eVar2;
        vy.d dVar2;
        switch (this.f43711a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43715e;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            w0Var = this.f43714d;
                            eVar = this.f43713c;
                            x0Var = this.f43712b;
                            com.bumptech.glide.e.F(obj);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        return qy.b0.f48488a;
                    }
                    com.bumptech.glide.e.F(obj);
                    w0Var = this.f43716f;
                    x0Var = w0Var.f43725h;
                    a00.e eVar3 = x0Var.f43736a;
                    this.f43712b = x0Var;
                    this.f43713c = eVar3;
                    this.f43714d = w0Var;
                    this.f43715e = 1;
                    if (eVar3.b(this) == aVar) {
                        return aVar;
                    }
                    eVar = eVar3;
                    a1 a1Var = x0Var.f43737b;
                    n1 n1Var = new n1(new z0(a1Var, dVar, 1), uz.x0.m(a1Var.f43485e));
                    eVar.a(null);
                    y yVar = y.PREPEND;
                    this.f43712b = null;
                    this.f43713c = null;
                    this.f43714d = null;
                    this.f43715e = 2;
                    if (w0.a(w0Var, n1Var, yVar, this) == aVar) {
                        return aVar;
                    }
                    return qy.b0.f48488a;
                } catch (Throwable th2) {
                    eVar.a(null);
                    throw th2;
                }
                dVar = null;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43715e;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            w0Var2 = this.f43714d;
                            eVar2 = this.f43713c;
                            x0Var2 = this.f43712b;
                            com.bumptech.glide.e.F(obj);
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        return qy.b0.f48488a;
                    }
                    com.bumptech.glide.e.F(obj);
                    w0Var2 = this.f43716f;
                    x0Var2 = w0Var2.f43725h;
                    a00.e eVar4 = x0Var2.f43736a;
                    this.f43712b = x0Var2;
                    this.f43713c = eVar4;
                    this.f43714d = w0Var2;
                    this.f43715e = 1;
                    if (eVar4.b(this) == aVar2) {
                        return aVar2;
                    }
                    eVar2 = eVar4;
                    a1 a1Var2 = x0Var2.f43737b;
                    n1 n1Var2 = new n1(new z0(a1Var2, dVar2, 0), uz.x0.m(a1Var2.f43486f));
                    eVar2.a(null);
                    y yVar2 = y.APPEND;
                    this.f43712b = null;
                    this.f43713c = null;
                    this.f43714d = null;
                    this.f43715e = 2;
                    if (w0.a(w0Var2, n1Var2, yVar2, this) == aVar2) {
                        return aVar2;
                    }
                    return qy.b0.f48488a;
                } catch (Throwable th3) {
                    eVar2.a(null);
                    throw th3;
                }
                dVar2 = null;
        }
    }
}
