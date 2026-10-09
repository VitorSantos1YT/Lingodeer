package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.a f27571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f27572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f27576f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x4 f27577t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(x4 x4Var, vy.d dVar) {
        super(2, dVar);
        this.f27577t = x4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        h4 h4Var = new h4(this.f27577t, dVar);
        h4Var.f27576f = obj;
        return h4Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a00.a aVar;
        x4 x4Var;
        int i11;
        int i12;
        int i13;
        a00.a aVar2;
        uz.j jVar = (uz.j) this.f27576f;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i14 = this.f27575e;
        try {
            if (i14 == 0) {
                com.bumptech.glide.e.F(obj);
                x4 x4Var2 = this.f27577t;
                aVar = x4Var2.f27977j;
                this.f27576f = jVar;
                this.f27571a = aVar;
                this.f27572b = x4Var2;
                this.f27573c = 0;
                this.f27575e = 1;
                if (aVar.b(this) != aVar3) {
                    x4Var = x4Var2;
                    i11 = 0;
                }
                return aVar3;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    int i15 = this.f27574d;
                    int i16 = this.f27573c;
                    uz.j jVar2 = (uz.j) this.f27572b;
                    a00.a aVar4 = this.f27571a;
                    try {
                        com.bumptech.glide.e.F(obj);
                        i12 = i15;
                        i13 = i16;
                        jVar = jVar2;
                        aVar = aVar4;
                        int i17 = i12;
                        this.f27576f = null;
                        this.f27571a = aVar;
                        this.f27572b = null;
                        this.f27573c = i13;
                        this.f27574d = i17;
                        this.f27575e = 3;
                        if (jVar.emit(obj, this) != aVar3) {
                            aVar2 = aVar;
                        }
                        return aVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar4;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = this.f27571a;
                    try {
                        com.bumptech.glide.e.F(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                aVar2.a(null);
                throw th;
            }
            int i18 = this.f27573c;
            x4Var = (x4) this.f27572b;
            a00.a aVar5 = this.f27571a;
            com.bumptech.glide.e.F(obj);
            i11 = i18;
            aVar = aVar5;
            aVar2.a(null);
            return qy.b0.f48488a;
            this.f27576f = null;
            this.f27571a = aVar;
            this.f27572b = jVar;
            this.f27573c = i11;
            this.f27574d = 0;
            this.f27575e = 2;
            Object objO = x4Var.o(this);
            if (objO != aVar3) {
                i12 = 0;
                i13 = i11;
                obj = objO;
                int i19 = i12;
                this.f27576f = null;
                this.f27571a = aVar;
                this.f27572b = null;
                this.f27573c = i13;
                this.f27574d = i19;
                this.f27575e = 3;
                if (jVar.emit(obj, this) != aVar3) {
                    aVar2 = aVar;
                    aVar2.a(null);
                    return qy.b0.f48488a;
                }
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
        }
    }
}
