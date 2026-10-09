package dv;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import com.google.gson.JsonObject;
import l1.k1;
import n9.e1;
import n9.e2;
import n9.j1;
import rt.g7;
import rt.r8;
import rt.t7;
import rt.u8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, Object obj, Object obj2, vy.d dVar) {
        super(1, dVar);
        this.f24428a = i11;
        this.f24430c = obj;
        this.f24431d = obj2;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f24428a) {
            case 0:
                return new b(0, (d) this.f24430c, (qy.l) this.f24431d, dVar);
            case 1:
                return new b(1, (ob.s) this.f24430c, (fz.f) this.f24431d, dVar);
            case 2:
                return new b((n5.v) this.f24431d, dVar);
            case 3:
                return new b(3, (o9.a) this.f24430c, (e1) this.f24431d, dVar);
            case 4:
                return new b(4, (rt.j) this.f24430c, (t7) this.f24431d, dVar);
            case 5:
                return new b(5, (rt.j) this.f24430c, (u8) this.f24431d, dVar);
            case 6:
                return new b(6, (uz.j) this.f24430c, (kotlin.jvm.internal.y) this.f24431d, dVar);
            case 7:
                return new b(7, (x0.f) this.f24430c, (z0.d) this.f24431d, dVar);
            default:
                return new b(8, (z0.c) this.f24430c, (z0.b) this.f24431d, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f24428a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((b) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        n5.x0 q0Var;
        x0.d dVar;
        switch (this.f24428a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f24429b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar2 = ((d) this.f24430c).f24439b;
                JsonObject jsonObject = (JsonObject) ((qy.l) this.f24431d).f48495a;
                this.f24429b = 1;
                Object objA = aVar2.a(jsonObject, this);
                return objA == aVar ? aVar : objA;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f24429b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ob.s sVar = (ob.s) this.f24430c;
                    i1.r rVar = new i1.r(sVar, 0);
                    fr.c cVar = new fr.c(18, (fz.f) this.f24431d, sVar, (vy.d) null);
                    this.f24429b = 1;
                    if (i1.p.b(rVar, cVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                n5.v vVar = (n5.v) this.f24431d;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24429b;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        this.f24429b = 1;
                        obj = n5.v.f(vVar, true, this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th2 = (Throwable) this.f24430c;
                            com.bumptech.glide.e.F(obj);
                            q0Var = new n5.q0(((Number) obj).intValue(), th2);
                            return new qy.l(q0Var, Boolean.TRUE);
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    q0Var = (n5.x0) obj;
                    break;
                } catch (Throwable th3) {
                    n5.g0 g0VarG = vVar.g();
                    this.f24430c = th3;
                    this.f24429b = 2;
                    Object objE = g0VarG.e(this);
                    if (objE == aVar4) {
                        return aVar4;
                    }
                    th2 = th3;
                    obj = objE;
                }
                return new qy.l(q0Var, Boolean.TRUE);
            case 3:
                e1 e1Var = (e1) this.f24431d;
                o9.a aVar5 = (o9.a) this.f24430c;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f24429b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    e2 e2Var = e1Var.f43549b;
                    e2 e2Var2 = aVar5.f44737c;
                    aVar5.f44737c = e2Var;
                    if (e2Var2 instanceof j1) {
                        j1 j1Var = (j1) e2Var2;
                        if (j1Var.f43608a) {
                            e2Var.c();
                        }
                        if (j1Var.f43609b) {
                            e2Var.f();
                        }
                    }
                    uz.i iVar = e1Var.f43548a;
                    bh.q qVar = new bh.q(18, aVar5, e1Var);
                    this.f24429b = 1;
                    if (iVar.collect(qVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 4:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f24429b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rt.j jVar = (rt.j) this.f24430c;
                    r8 r8Var = ((g7) ((t7) this.f24431d)).f49785a;
                    this.f24429b = 1;
                    if (rt.j.c(jVar, r8Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 5:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f24429b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rt.j jVar2 = (rt.j) this.f24430c;
                    u8 u8Var = (u8) this.f24431d;
                    this.f24429b = 1;
                    Object objC = com.bumptech.glide.g.C(u8Var.f50487a.values(), jVar2.f49892a, jVar2.f49898d, jVar2.f49899e, this);
                    if (objC != aVar8) {
                        objC = b0Var;
                    }
                    if (objC == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 6:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f24431d;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f24429b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar3 = (uz.j) this.f24430c;
                    com.android.billingclient.api.a aVar10 = vz.b.f54329b;
                    Object obj2 = yVar.f38361a;
                    if (obj2 == aVar10) {
                        obj2 = null;
                    }
                    this.f24429b = 1;
                    if (jVar3.emit(obj2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                yVar.f38361a = null;
                return qy.b0.f48488a;
            case 7:
                x0.f fVar = (x0.f) this.f24430c;
                x1.u uVar = fVar.f55585e;
                View view = fVar.f55581a;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f24429b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                try {
                    if (i18 == 0) {
                        com.bumptech.glide.e.F(obj);
                        x0.e eVar = new x0.e();
                        z0.d dVar2 = (z0.d) this.f24431d;
                        x0.d dVar3 = new x0.d(eVar, new x0.b(fVar, dVar2, 0), new x0.b(fVar, dVar2, 1), view);
                        fz.c cVar2 = fVar.f55582b;
                        if (cVar2 != null && (dVar = (x0.d) cVar2.invoke(dVar3)) != null) {
                            dVar3 = dVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new x0.m(dVar3), 1);
                            if (actionModeStartActionMode != null) {
                                fVar.f55588h = actionModeStartActionMode;
                            }
                            return b0Var2;
                        }
                        androidx.fragment.app.d dVar4 = fVar.f55589i;
                        if (dVar4 == null) {
                            dVar4 = new androidx.fragment.app.d(fVar, dVar3, eVar, 20);
                            fVar.f55589i = dVar4;
                        }
                        view.post(dVar4);
                        this.f24429b = 1;
                        Object objG = eVar.f55580a.g(this);
                        if (objG != aVar11) {
                            objG = b0Var2;
                        }
                        if (objG == aVar11) {
                            return aVar11;
                        }
                    } else {
                        if (i18 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    uVar.a();
                    ActionMode actionMode = fVar.f55588h;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    androidx.fragment.app.d dVar5 = fVar.f55589i;
                    if (dVar5 != null) {
                        view.removeCallbacks(dVar5);
                    }
                    fVar.f55588h = null;
                    return b0Var2;
                } catch (Throwable th4) {
                    uVar.a();
                    ActionMode actionMode2 = fVar.f55588h;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                    androidx.fragment.app.d dVar6 = fVar.f55589i;
                    if (dVar6 != null) {
                        view.removeCallbacks(dVar6);
                    }
                    fVar.f55588h = null;
                    throw th4;
                }
            default:
                z0.b bVar = (z0.b) this.f24431d;
                k1 k1Var = ((z0.c) this.f24430c).f58417c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f24429b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                try {
                    if (i19 == 0) {
                        com.bumptech.glide.e.F(obj);
                        k1Var.setValue(bVar);
                        this.f24429b = 1;
                        Object objG2 = bVar.f58414b.g(this);
                        if (objG2 != aVar12) {
                            objG2 = b0Var3;
                        }
                        if (objG2 == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (i19 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    k1Var.setValue(null);
                    return b0Var3;
                } catch (Throwable th5) {
                    k1Var.setValue(null);
                    throw th5;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n5.v vVar, vy.d dVar) {
        super(1, dVar);
        this.f24428a = 2;
        this.f24431d = vVar;
    }
}
