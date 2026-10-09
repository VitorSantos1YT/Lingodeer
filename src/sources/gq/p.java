package gq;

import fr.i3;
import vt.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f29623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29621a = i11;
        this.f29623c = uVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29621a) {
            case 0:
                return new p(this.f29623c, dVar, 0);
            default:
                return new p(this.f29623c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29621a) {
            case 0:
                break;
        }
        return ((p) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29621a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29622b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                u0 u0Var = this.f29623c.f29633a;
                this.f29622b = 1;
                Object objH = ((i3) u0Var).h(this);
                return objH == aVar ? aVar : objH;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29622b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f29622b = 1;
                Object objB = u.b(this.f29623c, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
