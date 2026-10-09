package vr;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f54135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f54136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu.e f54137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z11, boolean z12, nu.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f54135a = z11;
        this.f54136b = z12;
        this.f54137c = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new e(this.f54135a, this.f54136b, this.f54137c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        eVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        boolean z11 = this.f54135a;
        nu.e eVar = this.f54137c;
        if (z11 && this.f54136b) {
            eVar.d(ou.f.Anim);
        } else {
            eVar.d(ou.f.Normal);
        }
        return qy.b0.f48488a;
    }
}
