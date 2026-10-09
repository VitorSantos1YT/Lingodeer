package cu;

import bh.e0;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f22548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22546a = i11;
        this.f22548c = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22546a) {
            case 0:
                return new o(this.f22548c, dVar, 0);
            default:
                return new o(this.f22548c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22546a) {
            case 0:
                break;
        }
        return ((o) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f22546a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f22547b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    t tVar = this.f22548c;
                    g gVar = tVar.f22573c;
                    no.g gVarB = gVar.f22516a.b(tVar.f22572b.f22518b);
                    b1.b bVar = new b1.b(tVar, 1);
                    this.f22547b = 1;
                    Object objCollect = gVarB.collect(new e0(bVar, 2), this);
                    if (objCollect != aVar) {
                        objCollect = b0Var;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f22547b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f22547b = 1;
                    if (t.c(this.f22548c, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
