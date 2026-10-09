package h1;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.d f30413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BackEvent f30414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(b0.d dVar, BackEvent backEvent, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f30411a = i11;
        this.f30413c = dVar;
        this.f30414d = backEvent;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30411a) {
            case 0:
                return new i5(this.f30413c, this.f30414d, dVar, 0);
            default:
                return new i5(this.f30413c, this.f30414d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30411a) {
            case 0:
                break;
        }
        return ((i5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30411a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30412b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f5 = new Float(i1.s0.f34068a.a(this.f30414d.getProgress()));
                    this.f30412b = 1;
                    if (this.f30413c.e(f5, this) == aVar) {
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
                int i12 = this.f30412b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f11 = new Float(i1.s0.f34068a.a(this.f30414d.getProgress()));
                    this.f30412b = 1;
                    if (this.f30413c.e(f11, this) == aVar2) {
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
