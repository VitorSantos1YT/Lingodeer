package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends xy.i implements fz.g {
    public final /* synthetic */ vt.k0 H;
    public final /* synthetic */ x8 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f50776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f50777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f50778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uz.i1 f50779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v8 f50780f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f50781t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(boolean z11, uz.i1 i1Var, v8 v8Var, vt.n0 n0Var, vt.k0 k0Var, x8 x8Var, vy.d dVar) {
        super(4, dVar);
        this.f50778d = z11;
        this.f50779e = i1Var;
        this.f50780f = v8Var;
        this.f50781t = n0Var;
        this.H = k0Var;
        this.K = x8Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        vt.k0 k0Var = this.H;
        x8 x8Var = this.K;
        z7 z7Var = new z7(this.f50778d, this.f50779e, this.f50780f, this.f50781t, k0Var, x8Var, (vy.d) obj4);
        z7Var.f50776b = (List) obj;
        z7Var.f50777c = zBooleanValue;
        return z7Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f50776b;
        boolean z11 = this.f50777c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f50775a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        this.f50776b = null;
        this.f50777c = z11;
        this.f50775a = 1;
        Object objA = d8.a(this.f50778d, this.f50779e, this.f50780f, this.f50781t, this.H, this.K, list, z11, this);
        return objA == aVar ? aVar : objA;
    }
}
