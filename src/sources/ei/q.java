package ei;

import l1.b1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends xy.i implements fz.e {
    public final /* synthetic */ b1 H;
    public final /* synthetic */ b1 K;
    public final /* synthetic */ b1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0.b f25646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi.d f25647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f25648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f25649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f25650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f25651f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f25652t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o0.b bVar, gi.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, vy.d dVar2) {
        super(2, dVar2);
        this.f25646a = bVar;
        this.f25647b = dVar;
        this.f25648c = b1Var;
        this.f25649d = b1Var2;
        this.f25650e = b1Var3;
        this.f25651f = b1Var4;
        this.f25652t = b1Var5;
        this.H = b1Var6;
        this.K = b1Var7;
        this.L = b1Var8;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new q(this.f25646a, this.f25647b, this.f25648c, this.f25649d, this.f25650e, this.f25651f, this.f25652t, this.H, this.K, this.L, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        q qVar = (q) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        qVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (this.f25646a.k() != 0) {
            this.f25648c.setValue(Boolean.FALSE);
            this.f25649d.setValue(null);
            this.f25650e.setValue(null);
            this.f25651f.setValue(null);
            this.f25652t.setValue(null);
            this.H.setValue(null);
            this.K.setValue(null);
            this.L.setValue(null);
            this.f25647b.a();
        }
        return qy.b0.f48488a;
    }
}
