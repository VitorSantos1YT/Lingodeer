package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53297a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f53298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f53299c;

    public g(h hVar, kotlin.jvm.internal.y yVar, j jVar) {
        this.f53299c = yVar;
        this.f53298b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) throws Throwable {
        f fVar;
        u uVar;
        g gVar;
        switch (this.f53297a) {
            case 0:
                if (dVar instanceof f) {
                    fVar = (f) dVar;
                    int i11 = fVar.f53291c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        fVar.f53291c = i11 - Integer.MIN_VALUE;
                    } else {
                        fVar = new f(this, dVar);
                    }
                } else {
                    fVar = new f(this, dVar);
                }
                Object obj2 = fVar.f53289a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = fVar.f53291c;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    kotlin.jvm.internal.y yVar = this.f53299c;
                    Object obj3 = yVar.f38361a;
                    if (obj3 == vz.b.f54329b || !kotlin.jvm.internal.m.a(obj3, obj)) {
                        yVar.f38361a = obj;
                        fVar.f53291c = 1;
                        if (this.f53298b.emit(obj, fVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return b0Var;
            default:
                if (dVar instanceof u) {
                    uVar = (u) dVar;
                    int i13 = uVar.f53407d;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uVar.f53407d = i13 - Integer.MIN_VALUE;
                    } else {
                        uVar = new u(this, dVar);
                    }
                } else {
                    uVar = new u(this, dVar);
                }
                Object obj4 = uVar.f53405b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = uVar.f53407d;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = uVar.f53404a;
                    try {
                        com.bumptech.glide.e.F(obj4);
                        return qy.b0.f48488a;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar.f53299c.f38361a = th;
                        throw th;
                    }
                }
                com.bumptech.glide.e.F(obj4);
                try {
                    j jVar = this.f53298b;
                    uVar.f53404a = this;
                    uVar.f53407d = 1;
                    if (jVar.emit(obj, uVar) == aVar2) {
                        return aVar2;
                    }
                    return qy.b0.f48488a;
                } catch (Throwable th3) {
                    th = th3;
                    gVar = this;
                    gVar.f53299c.f38361a = th;
                    throw th;
                }
        }
    }

    public g(j jVar, kotlin.jvm.internal.y yVar) {
        this.f53298b = jVar;
        this.f53299c = yVar;
    }
}
