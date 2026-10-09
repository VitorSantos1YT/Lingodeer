package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f53352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr.w f53353b;

    public l1(j jVar, kr.w wVar) {
        this.f53352a = jVar;
        this.f53353b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xy.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object a(xy.c cVar) {
        k1 k1Var;
        vz.o oVar;
        l1 l1Var;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i11 = k1Var.f53340e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k1Var.f53340e = i11 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object obj = k1Var.f53338c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ?? r9 = k1Var.f53340e;
        qy.b0 b0Var = qy.b0.f48488a;
        try {
            if (r9 == 0) {
                com.bumptech.glide.e.F(obj);
                oVar = new vz.o(this.f53352a, k1Var.getContext());
                kr.w wVar = this.f53353b;
                k1Var.f53336a = this;
                k1Var.f53337b = oVar;
                k1Var.f53340e = 1;
                if (wVar.invoke(oVar, k1Var) != aVar) {
                    l1Var = this;
                }
                return aVar;
            }
            if (r9 != 1) {
                if (r9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            oVar = k1Var.f53337b;
            l1Var = k1Var.f53336a;
            com.bumptech.glide.e.F(obj);
            oVar.releaseIntercepted();
            j jVar = l1Var.f53352a;
            r9 = jVar instanceof l1;
            if (r9 != 0) {
                k1Var.f53336a = null;
                k1Var.f53337b = null;
                k1Var.f53340e = 2;
                if (((l1) jVar).a(k1Var) == aVar) {
                    return aVar;
                }
            }
            return b0Var;
        } catch (Throwable th2) {
            r9.releaseIntercepted();
            throw th2;
        }
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        return this.f53352a.emit(obj, dVar);
    }
}
