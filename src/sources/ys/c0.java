package ys;

import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f57939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(fz.c cVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f57938a = i12;
        this.f57939b = cVar;
        this.f57940c = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f57938a) {
            case 0:
                return new c0(this.f57939b, dVar);
            case 1:
                return new c0(this.f57939b, this.f57940c, dVar, 1);
            default:
                return new c0(this.f57939b, this.f57940c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f57938a) {
            case 0:
                return ((c0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                c0 c0Var = (c0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                c0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                c0 c0Var2 = (c0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                c0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f57938a = 0;
        this.f57939b = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f57938a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.c cVar = this.f57939b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f57940c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f57940c = 1;
                    return cVar.invoke(this) == aVar ? aVar : b0Var;
                }
                if (i12 != 1) {
                    throw new IllegalStateException(EHjhWcesDUIsIw.VUWxAgsmbSAGYN);
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                cVar.invoke(new Integer(this.f57940c));
                return b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                cVar.invoke(new Integer(this.f57940c));
                return b0Var;
        }
    }
}
