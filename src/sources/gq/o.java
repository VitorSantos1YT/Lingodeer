package gq;

import fr.i3;
import vt.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f29619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(u uVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f29617a = i12;
        this.f29619c = uVar;
        this.f29620d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29617a) {
            case 0:
                return new o(this.f29619c, this.f29620d, dVar, 0);
            case 1:
                return new o(this.f29619c, this.f29620d, dVar, 1);
            default:
                return new o(this.f29619c, this.f29620d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29617a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((o) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29617a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29618b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                u0 u0Var = this.f29619c.f29633a;
                this.f29618b = 1;
                Object objG = ((i3) u0Var).g(this.f29620d, this);
                return objG == aVar ? aVar : objG;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29618b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                u0 u0Var2 = this.f29619c.f29633a;
                this.f29618b = 1;
                Object objE = ((i3) u0Var2).e(this.f29620d, this);
                return objE == aVar2 ? aVar2 : objE;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29618b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                u0 u0Var3 = this.f29619c.f29633a;
                this.f29618b = 1;
                Object objI = ((i3) u0Var3).i(this.f29620d, this);
                return objI == aVar3 ? aVar3 : objI;
        }
    }
}
