package gb;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;
import rz.e0;
import rz.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f28971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(a0 a0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28969a = i11;
        this.f28971c = a0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28969a) {
            case 0:
                return new x(this.f28971c, dVar, 0);
            default:
                return new x(this.f28971c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28969a) {
            case 0:
                break;
        }
        return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object tVar;
        int i11 = this.f28969a;
        a0 a0Var = this.f28971c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f28970b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f28970b = 1;
                Object objA = a0.a(a0Var, this);
                return objA == aVar ? aVar : objA;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f28970b;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        h1 h1Var = a0Var.m;
                        x xVar = new x(a0Var, null, 0);
                        this.f28970b = 1;
                        obj = e0.M(h1Var, xVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    tVar = (w) obj;
                    break;
                } catch (WorkerStoppedException e8) {
                    tVar = new v(e8.f2800a);
                } catch (CancellationException unused) {
                    tVar = new t();
                } catch (Throwable unused2) {
                    int i14 = b0.f28906a;
                    fb.l.b().getClass();
                    tVar = new t();
                }
                Object objW = a0Var.f28901h.w(new s0.u(new com.google.common.cache.a(3, tVar, a0Var), 22));
                kotlin.jvm.internal.m.e(objW, "workDatabase.runInTransa…          }\n            )");
                return objW;
        }
    }
}
