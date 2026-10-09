package oo;

import hj.d5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f45687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f45688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f45686a = i11;
        this.f45688c = k0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f45686a) {
            case 0:
                j0 j0Var = new j0(this.f45688c, dVar, 0);
                j0Var.f45687b = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f45688c, dVar, 1);
                j0Var2.f45687b = obj;
                return j0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f45686a) {
            case 0:
                j0 j0Var = (j0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                j0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                return ((j0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f45686a;
        Object objL = qy.b0.f48488a;
        k0 k0Var = this.f45688c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    ta.a aVar2 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((d5) aVar2).f32499e.setOnScrollChangedListener(k0Var.f45692b0);
                    break;
                } catch (Throwable th2) {
                    com.bumptech.glide.e.l(th2);
                }
                return objL;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    ta.a aVar4 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((d5) aVar4).f32499e.setOnScrollChangedListener(k0Var.f45692b0);
                    break;
                } catch (Throwable th3) {
                    objL = com.bumptech.glide.e.l(th3);
                }
                return new qy.o(objL);
        }
    }
}
