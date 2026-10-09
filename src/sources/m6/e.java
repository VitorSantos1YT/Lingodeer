package m6;

import a0.o0;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f40877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f40875a = i11;
        this.f40877c = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f40875a) {
            case 0:
                return new e(this.f40877c, dVar, 0);
            default:
                return new e(this.f40877c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f40875a) {
            case 0:
                break;
        }
        return ((e) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40875a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f40876b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f40877c.a();
                    f fVar = this.f40877c;
                    this.f40876b = 1;
                    rz.m mVar = new rz.m(1, ue.f.x(this));
                    mVar.s();
                    synchronized (fVar.f40880c) {
                        fVar.f40881d = 20;
                        fVar.f40883f = mVar;
                    }
                    mVar.u(new o0(fVar, 21));
                    if (mVar.r() == aVar) {
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
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f40876b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f fVar2 = this.f40877c;
                    this.f40876b = 1;
                    fVar2.getClass();
                    if (e0.O(5000L, new e(fVar2, null, 0), this) == aVar2) {
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
