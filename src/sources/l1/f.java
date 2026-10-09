package l1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39290c;

    public f(Choreographer choreographer, z2.p0 p0Var) {
        this.f39288a = 2;
        this.f39289b = choreographer;
        this.f39290c = p0Var;
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        switch (this.f39288a) {
            case 0:
                break;
            case 1:
                break;
        }
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        switch (this.f39288a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ew.a.m(this, hVar);
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        switch (this.f39288a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ew.a.s(this, hVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    @Override // l1.w0
    public final Object p(fz.c cVar, vy.d dVar) {
        l1 l1Var;
        boolean z11;
        Object objR;
        int i11 = 2;
        int i12 = 1;
        switch (this.f39288a) {
            case 0:
                rz.m mVar = new rz.m(1, ue.f.x(dVar));
                mVar.s();
                a9.i iVar = (a9.i) this.f39290c;
                e eVar = new e();
                eVar.f39282a = mVar;
                eVar.f39283b = cVar;
                mVar.u(new av.t(iVar.g(eVar, (fz.a) this.f39289b), 5));
                Object objR2 = mVar.r();
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                return objR2;
            case 1:
                if (dVar instanceof l1) {
                    l1Var = (l1) dVar;
                    int i13 = l1Var.f39339d;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        l1Var.f39339d = i13 - Integer.MIN_VALUE;
                    } else {
                        l1Var = new l1(this, dVar);
                    }
                } else {
                    l1Var = new l1(this, dVar);
                }
                Object obj = l1Var.f39337b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = l1Var.f39339d;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    bq.f fVar = (bq.f) this.f39290c;
                    l1Var.f39336a = cVar;
                    l1Var.f39339d = 1;
                    synchronized (fVar.f4944b) {
                        z11 = fVar.f4943a;
                    }
                    if (z11) {
                        objR = qy.b0.f48488a;
                    } else {
                        rz.m mVar2 = new rz.m(1, ue.f.x(l1Var));
                        mVar2.s();
                        synchronized (fVar.f4944b) {
                            ((ArrayList) fVar.f4946d).add(mVar2);
                        }
                        mVar2.u(new av.r(4, fVar, mVar2));
                        objR = mVar2.r();
                        if (objR != aVar2) {
                            objR = qy.b0.f48488a;
                        }
                    }
                    if (objR != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                cVar = l1Var.f39336a;
                com.bumptech.glide.e.F(obj);
                w0 w0Var = (w0) this.f39289b;
                l1Var.f39336a = null;
                l1Var.f39339d = 2;
                Object objP = w0Var.p(cVar, l1Var);
                if (objP != aVar2) {
                    return objP;
                }
                return aVar2;
            default:
                z2.p0 p0Var = (z2.p0) this.f39290c;
                rz.m mVar3 = new rz.m(1, ue.f.x(dVar));
                mVar3.s();
                z2.q0 q0Var = new z2.q0(mVar3, this, cVar);
                if (kotlin.jvm.internal.m.a(p0Var.f58637a, (Choreographer) this.f39289b)) {
                    synchronized (p0Var.f58639c) {
                        p0Var.f58641e.add(q0Var);
                        if (!p0Var.H) {
                            p0Var.H = true;
                            p0Var.f58637a.postFrameCallback(p0Var.K);
                        }
                        break;
                    }
                    mVar3.u(new z2.l0(i12, p0Var, q0Var));
                } else {
                    ((Choreographer) this.f39289b).postFrameCallback(q0Var);
                    mVar3.u(new z2.l0(i11, this, q0Var));
                }
                Object objR3 = mVar3.r();
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                return objR3;
        }
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        switch (this.f39288a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ew.a.w(this, iVar);
    }

    public f(w0 w0Var) {
        this.f39288a = 1;
        this.f39289b = w0Var;
        this.f39290c = new bq.f(7, false);
    }

    public f(fz.a aVar) {
        this.f39288a = 0;
        this.f39289b = aVar;
        this.f39290c = new a9.i(12);
    }
}
