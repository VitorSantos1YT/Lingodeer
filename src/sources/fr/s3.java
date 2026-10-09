package fr;

import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x4 f27837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(x4 x4Var, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f27835a = i12;
        this.f27837c = x4Var;
        this.f27838d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27835a) {
            case 0:
                return new s3(this.f27837c, this.f27838d, dVar, 0);
            default:
                return new s3(this.f27837c, this.f27838d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27835a) {
            case 0:
                break;
        }
        return ((s3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27835a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27836b;
                x4 x4Var = this.f27837c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                this.f27836b = 1;
                obj = x4.c(x4Var, this.f27838d, this);
                if (obj == aVar) {
                    return aVar;
                }
                r3 r3Var = new r3(((Number) obj).intValue(), 0);
                this.f27836b = 2;
                if (x4Var.u(r3Var, this) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27836b;
                x4 x4Var2 = this.f27837c;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException(nuRcCS.jhuxOHREzmqexbX);
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                this.f27836b = 1;
                obj = x4.d(x4Var2, this.f27838d, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                r3 r3Var2 = new r3(((Number) obj).intValue(), 1);
                this.f27836b = 2;
                if (x4Var2.u(r3Var2, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
        }
    }
}
