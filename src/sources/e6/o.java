package e6;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24995a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f24998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f24999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xq.c f25000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, c cVar, xq.c cVar2, vy.d dVar) {
        super(2, dVar);
        this.f24998d = context;
        this.f24999e = cVar;
        this.f25000f = cVar2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f24995a) {
            case 0:
                o oVar = new o(this.f25000f, this.f24998d, this.f24999e, dVar);
                oVar.f24997c = obj;
                return oVar;
            default:
                o oVar2 = new o(this.f24998d, this.f24999e, this.f25000f, dVar);
                oVar2.f24997c = obj;
                return oVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24995a) {
            case 0:
                return ((o) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((o) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m6.l lVar;
        switch (this.f24995a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f24996b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n nVar = new n(new AtomicReference(null), (tz.t) this.f24997c);
                    c cVar = this.f24999e;
                    a0.e0 e0Var = new a0.e0(this.f25000f, this.f24998d, cVar, (vy.d) null, 17);
                    this.f24996b = 1;
                    if (rz.e0.M(nVar, e0Var, this) == aVar) {
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
                c cVar2 = this.f24999e;
                int i12 = cVar2.f24881a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24996b;
                Context context = this.f24998d;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i13 != 0) {
                    if (i13 == 1) {
                        lVar = (m6.l) this.f24997c;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2 && i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                lVar = (m6.l) this.f24997c;
                String strF = vc.a.f(i12);
                this.f24997c = lVar;
                this.f24996b = 1;
                obj = lVar.a(context, strF, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (((Boolean) obj).booleanValue()) {
                    l lVar2 = (l) lVar.f40907a.get(vc.a.f(i12));
                    kotlin.jvm.internal.m.d(lVar2, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                    this.f24997c = null;
                    this.f24996b = 3;
                    Object objE = lVar2.e(f.f24899a, this);
                    if (objE != aVar2) {
                        objE = b0Var;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    l lVar3 = new l(this.f25000f, cVar2, null, 248);
                    this.f24997c = null;
                    this.f24996b = 2;
                    if (lVar.b(context, lVar3, this) == aVar2) {
                        return aVar2;
                    }
                }
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xq.c cVar, Context context, c cVar2, vy.d dVar) {
        super(2, dVar);
        this.f25000f = cVar;
        this.f24998d = context;
        this.f24999e = cVar2;
    }
}
