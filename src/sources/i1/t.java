package i1;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import rz.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34069a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SessionWorker sessionWorker, m6.w wVar, vy.d dVar) {
        super(1, dVar);
        this.f34072d = sessionWorker;
        this.f34073e = wVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f34069a) {
            case 0:
                return new t((ob.s) this.f34072d, this.f34070b, (fz.g) this.f34073e, dVar);
            default:
                return new t((SessionWorker) this.f34072d, (m6.w) this.f34073e, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f34069a) {
            case 0:
                break;
        }
        return ((t) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t tVar;
        Throwable th2;
        e6.l lVar;
        v1 v1Var;
        kb.e eVar;
        v1 v1Var2;
        kb.e eVar2;
        switch (this.f34069a) {
            case 0:
                ob.s sVar = (ob.s) this.f34072d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f34071c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    sVar.u(this.f34070b);
                    r rVar = new r(sVar, 1);
                    fr.c cVar = new fr.c(19, (fz.g) this.f34073e, sVar, (vy.d) null);
                    this.f34071c = 1;
                    if (p.b(rVar, cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                SessionWorker sessionWorker = (SessionWorker) this.f34072d;
                Object objA = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f34071c;
                vy.d dVar = null;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    m6.h hVar = sessionWorker.f2018h;
                    iv.h0 h0Var = new iv.h0(sessionWorker, dVar, 17);
                    this.f34071c = 1;
                    obj = ((m6.m) hVar).a(h0Var, this);
                    if (obj != objA) {
                    }
                    return objA;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        lVar = (e6.l) this.f34070b;
                        try {
                            com.bumptech.glide.e.F(obj);
                            tVar = this;
                            v1Var2 = v1.f50964a;
                            eVar2 = new kb.e(11, sessionWorker, lVar, dVar);
                            tVar.f34070b = null;
                            tVar.f34071c = 3;
                            if (rz.e0.M(v1Var2, eVar2, this) == objA) {
                                return objA;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            tVar = this;
                            v1Var = v1.f50964a;
                            eVar = new kb.e(11, sessionWorker, lVar, dVar);
                            tVar.f34070b = th2;
                            tVar.f34071c = 4;
                            if (rz.e0.M(v1Var, eVar, this) == objA) {
                                return objA;
                            }
                            throw th2;
                        }
                    } else {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th4 = (Throwable) this.f34070b;
                            com.bumptech.glide.e.F(obj);
                            throw th4;
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return fb.u.a();
                }
                com.bumptech.glide.e.F(obj);
                e6.l lVar2 = (e6.l) obj;
                if (lVar2 == null) {
                    if (sessionWorker.f2017g.f2789c != 0) {
                        objA = fb.u.a();
                        return objA;
                    }
                    throw new IllegalStateException(("No session available for key " + sessionWorker.f2021k).toString());
                }
                try {
                    m6.w wVar = (m6.w) this.f34073e;
                    try {
                        Context context = sessionWorker.f27110a;
                        m6.u uVar = sessionWorker.f2019i;
                        m6.p pVar = new m6.p(0);
                        this.f34070b = lVar2;
                        this.f34071c = 2;
                        tVar = this;
                        try {
                            if (v10.c.e(wVar, context, lVar2, uVar, pVar, tVar) == objA) {
                                return objA;
                            }
                            lVar = lVar2;
                            v1Var2 = v1.f50964a;
                            eVar2 = new kb.e(11, sessionWorker, lVar, dVar);
                            tVar.f34070b = null;
                            tVar.f34071c = 3;
                            if (rz.e0.M(v1Var2, eVar2, this) == objA) {
                                return objA;
                            }
                            return fb.u.a();
                        } catch (Throwable th5) {
                            th2 = th5;
                            lVar = lVar2;
                            v1Var = v1.f50964a;
                            eVar = new kb.e(11, sessionWorker, lVar, dVar);
                            tVar.f34070b = th2;
                            tVar.f34071c = 4;
                            if (rz.e0.M(v1Var, eVar, this) == objA) {
                                return objA;
                            }
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        tVar = this;
                    }
                } catch (Throwable th7) {
                    tVar = this;
                    th2 = th7;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ob.s sVar, Object obj, fz.g gVar, vy.d dVar) {
        super(1, dVar);
        this.f34072d = sVar;
        this.f34070b = obj;
        this.f34073e = gVar;
    }
}
