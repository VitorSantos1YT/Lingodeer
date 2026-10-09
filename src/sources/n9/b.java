package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43495a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f43496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f43497c;

    public b(kotlin.jvm.internal.w wVar, uz.j jVar) {
        this.f43497c = wVar;
        this.f43496b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ry.v vVar, vy.d dVar) {
        a aVar;
        b bVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f43479e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f43479e = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f43477c;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = aVar.f43479e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.m.c(vVar);
            if (vVar.f50857a > this.f43497c.f38359a) {
                Object obj2 = vVar.f50858b;
                aVar.f43475a = this;
                aVar.f43476b = vVar;
                aVar.f43479e = 1;
                if (this.f43496b.emit(obj2, aVar) == aVar2) {
                    return aVar2;
                }
                bVar = this;
            }
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vVar = aVar.f43476b;
        bVar = aVar.f43475a;
        com.bumptech.glide.e.F(obj);
        bVar.f43497c.f38359a = vVar.f50857a;
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        uz.k0 k0Var;
        switch (this.f43495a) {
            case 0:
                return a((ry.v) obj, dVar);
            default:
                if (dVar instanceof uz.k0) {
                    k0Var = (uz.k0) dVar;
                    int i11 = k0Var.f53335c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        k0Var.f53335c = i11 - Integer.MIN_VALUE;
                    } else {
                        k0Var = new uz.k0(this, dVar);
                    }
                } else {
                    k0Var = new uz.k0(this, dVar);
                }
                Object obj2 = k0Var.f53333a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = k0Var.f53335c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    kotlin.jvm.internal.w wVar = this.f43497c;
                    int i13 = wVar.f38359a;
                    wVar.f38359a = i13 + 1;
                    if (i13 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    ry.v vVar = new ry.v(i13, obj);
                    k0Var.f53335c = 1;
                    if (this.f43496b.emit(vVar, k0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return qy.b0.f48488a;
        }
    }

    public b(uz.j jVar, kotlin.jvm.internal.w wVar) {
        this.f43496b = jVar;
        this.f43497c = wVar;
    }
}
