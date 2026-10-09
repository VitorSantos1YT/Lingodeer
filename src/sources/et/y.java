package et;

import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f25928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(fz.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25926a = i11;
        this.f25928c = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25926a) {
            case 0:
                return new y(this.f25928c, dVar, 0);
            default:
                return new y(this.f25928c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25926a) {
            case 0:
                break;
        }
        return ((y) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25926a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f25927b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25927b = 1;
                    if (rz.e0.m(150L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException(txBUGYhC.aujMkcWHmTqT);
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f25928c.invoke();
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f25927b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25927b = 1;
                    if (rz.e0.m(1000L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f25928c.invoke();
                return qy.b0.f48488a;
        }
    }
}
