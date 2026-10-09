package fb;

import androidx.work.CoroutineWorker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f27090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CoroutineWorker coroutineWorker, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27088a = i11;
        this.f27090c = coroutineWorker;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27088a) {
            case 0:
                return new h(this.f27090c, dVar, 0);
            default:
                return new h(this.f27090c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27088a) {
            case 0:
                h hVar = (h) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                hVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                return ((h) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27088a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27089b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f27089b = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return obj;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27089b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f27089b = 1;
                Object objC = this.f27090c.c(this);
                return objC == aVar2 ? aVar2 : objC;
        }
    }
}
