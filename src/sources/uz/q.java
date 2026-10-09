package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xy.i f53383b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(i iVar, fz.f fVar) {
        this.f53382a = iVar;
        this.f53383b = (xy.i) fVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [fz.f, xy.i] */
    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) throws Throwable {
        p pVar;
        q qVar;
        o1 o1Var;
        ?? r9;
        vz.o oVar;
        Throwable th2;
        vz.o oVar2;
        ?? r11;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i11 = pVar.f53378b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f53378b = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, dVar);
            }
        } else {
            pVar = new p(this, dVar);
        }
        Object obj = pVar.f53377a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = pVar.f53378b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            try {
                i iVar = this.f53382a;
                pVar.f53380d = this;
                pVar.f53381e = jVar;
                pVar.f53378b = 1;
                if (iVar.collect(jVar, pVar) != aVar) {
                    qVar = this;
                    oVar = new vz.o(jVar, pVar.getContext());
                    r11 = qVar.f53383b;
                    pVar.f53380d = oVar;
                    pVar.f53381e = null;
                    pVar.f53378b = 3;
                    if (r11.invoke(oVar, null, pVar) != aVar) {
                        oVar2 = oVar;
                        oVar2.releaseIntercepted();
                        return qy.b0.f48488a;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                qVar = this;
                o1Var = new o1(th);
                r9 = qVar.f53383b;
                pVar.f53380d = th;
                pVar.f53381e = null;
                pVar.f53378b = 2;
                if (x0.d(o1Var, r9, th, pVar) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                Throwable th4 = (Throwable) pVar.f53380d;
                com.bumptech.glide.e.F(obj);
                throw th4;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar2 = (vz.o) pVar.f53380d;
            try {
                com.bumptech.glide.e.F(obj);
                oVar2.releaseIntercepted();
                return qy.b0.f48488a;
            } catch (Throwable th5) {
                th2 = th5;
                oVar2.releaseIntercepted();
                throw th2;
            }
        }
        jVar = pVar.f53381e;
        qVar = (q) pVar.f53380d;
        try {
            com.bumptech.glide.e.F(obj);
            oVar = new vz.o(jVar, pVar.getContext());
            try {
                r11 = qVar.f53383b;
                pVar.f53380d = oVar;
                pVar.f53381e = null;
                pVar.f53378b = 3;
                if (r11.invoke(oVar, null, pVar) != aVar) {
                    oVar2 = oVar;
                    oVar2.releaseIntercepted();
                    return qy.b0.f48488a;
                }
            } catch (Throwable th6) {
                th2 = th6;
                oVar2 = oVar;
                oVar2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            o1Var = new o1(th);
            r9 = qVar.f53383b;
            pVar.f53380d = th;
            pVar.f53381e = null;
            pVar.f53378b = 2;
            if (x0.d(o1Var, r9, th, pVar) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
