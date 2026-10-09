package n9;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xy.i f43652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz.i f43653c;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(fz.e eVar, uz.i iVar) {
        this.f43651a = 1;
        this.f43652b = (xy.i) eVar;
        this.f43653c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Type inference failed for: r1v0, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v15, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r2v12, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r2v15, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r4v6, types: [fz.e, xy.i] */
    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        uz.r rVar;
        Throwable th2;
        vz.o oVar;
        n1 n1Var;
        uz.j jVar2;
        uz.i iVar;
        uz.s sVar;
        n1 n1Var2;
        uz.y yVar;
        m1 m1Var;
        switch (this.f43651a) {
            case 0:
                Object objCollect = this.f43653c.collect(new m1(jVar, this.f43652b, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                if (dVar instanceof uz.r) {
                    rVar = (uz.r) dVar;
                    int i11 = rVar.f53386b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        rVar.f53386b = i11 - Integer.MIN_VALUE;
                    } else {
                        rVar = new uz.r(this, dVar);
                    }
                } else {
                    rVar = new uz.r(this, dVar);
                }
                Object obj = rVar.f53385a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = rVar.f53386b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vz.o oVar2 = new vz.o(jVar, rVar.getContext());
                    try {
                        ?? r9 = this.f43652b;
                        rVar.f53388d = this;
                        rVar.f53389e = jVar;
                        rVar.f53390f = oVar2;
                        rVar.f53386b = 1;
                        if (r9.invoke(oVar2, rVar) == aVar) {
                            return aVar;
                        }
                        n1Var = this;
                        jVar2 = jVar;
                        oVar = oVar2;
                        oVar.releaseIntercepted();
                        iVar = n1Var.f43653c;
                        rVar.f53388d = null;
                        rVar.f53389e = null;
                        rVar.f53390f = null;
                        rVar.f53386b = 2;
                        if (iVar.collect(jVar2, rVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        oVar = oVar2;
                        oVar.releaseIntercepted();
                        throw th2;
                    }
                } else if (i12 == 1) {
                    oVar = rVar.f53390f;
                    jVar2 = rVar.f53389e;
                    n1Var = rVar.f53388d;
                    try {
                        com.bumptech.glide.e.F(obj);
                        oVar.releaseIntercepted();
                        iVar = n1Var.f43653c;
                        rVar.f53388d = null;
                        rVar.f53389e = null;
                        rVar.f53390f = null;
                        rVar.f53386b = 2;
                        if (iVar.collect(jVar2, rVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        oVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                if (dVar instanceof uz.s) {
                    sVar = (uz.s) dVar;
                    int i13 = sVar.f53393b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        sVar.f53393b = i13 - Integer.MIN_VALUE;
                    } else {
                        sVar = new uz.s(this, dVar);
                    }
                } else {
                    sVar = new uz.s(this, dVar);
                }
                Object objH = sVar.f53392a;
                Object obj2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = sVar.f53393b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        jVar = sVar.f53396e;
                        n1Var2 = sVar.f53395d;
                        com.bumptech.glide.e.F(objH);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(objH);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(objH);
                sVar.f53395d = this;
                sVar.f53396e = jVar;
                sVar.f53393b = 1;
                objH = uz.x0.h(this.f43653c, jVar, sVar);
                if (objH == obj2) {
                    return obj2;
                }
                n1Var2 = this;
                Throwable th5 = (Throwable) objH;
                if (th5 != null) {
                    ?? r11 = n1Var2.f43652b;
                    sVar.f53395d = null;
                    sVar.f53396e = null;
                    sVar.f53393b = 2;
                    if (r11.invoke(jVar, th5, sVar) == obj2) {
                        return obj2;
                    }
                }
                return qy.b0.f48488a;
            case 3:
                Object objCollect2 = this.f43653c.collect(new a0.d0(new kotlin.jvm.internal.u(), jVar, (fz.e) this.f43652b), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            case 4:
                if (dVar instanceof uz.y) {
                    yVar = (uz.y) dVar;
                    int i15 = yVar.f53438b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yVar.f53438b = i15 - Integer.MIN_VALUE;
                    } else {
                        yVar = new uz.y(this, dVar);
                    }
                } else {
                    yVar = new uz.y(this, dVar);
                }
                Object obj3 = yVar.f53437a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = yVar.f53438b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m1Var = yVar.f53440d;
                    try {
                        com.bumptech.glide.e.F(obj3);
                    } catch (AbortFlowException e8) {
                        e = e8;
                        if (e.f38366a == m1Var) {
                            throw e;
                        }
                        rz.e0.n(yVar.getContext());
                    }
                    break;
                } else {
                    com.bumptech.glide.e.F(obj3);
                    uz.i iVar2 = this.f43653c;
                    m1 m1Var2 = new m1(this.f43652b, jVar);
                    try {
                        yVar.f53440d = m1Var2;
                        yVar.f53438b = 1;
                        if (iVar2.collect(m1Var2, yVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (AbortFlowException e10) {
                        e = e10;
                        m1Var = m1Var2;
                        if (e.f38366a == m1Var) {
                            throw e;
                        }
                        rz.e0.n(yVar.getContext());
                    }
                }
                return qy.b0.f48488a;
            default:
                Object objCollect3 = this.f43653c.collect(new m1(jVar, this.f43652b, 2), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1(uz.i iVar, fz.f fVar) {
        this.f43651a = 2;
        this.f43653c = iVar;
        this.f43652b = (xy.i) fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1(uz.i iVar, fz.e eVar, int i11) {
        this.f43651a = i11;
        switch (i11) {
            case 3:
                this.f43653c = iVar;
                this.f43652b = (xy.i) eVar;
                break;
            case 4:
                this.f43653c = iVar;
                this.f43652b = (xy.i) eVar;
                break;
            case 5:
                this.f43653c = iVar;
                this.f43652b = (xy.i) eVar;
                break;
            default:
                this.f43653c = iVar;
                this.f43652b = (xy.i) eVar;
                break;
        }
    }
}
