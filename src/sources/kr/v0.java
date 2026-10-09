package kr;

import a0.w1;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f38598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f38599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(z0 z0Var, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38596a = i11;
        this.f38598c = z0Var;
        this.f38599d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38596a) {
            case 0:
                return new v0(this.f38598c, this.f38599d, dVar, 0);
            default:
                return new v0(this.f38598c, this.f38599d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38596a) {
            case 0:
                break;
        }
        return ((v0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f38596a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f38597b;
                vy.d dVar = null;
                z0 z0Var = this.f38598c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    z1 z1Var = z0Var.H;
                    if (z1Var != null) {
                        z1Var.cancel(null);
                    }
                    this.f38597b = 1;
                    if (rz.e0.m(50L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                z0Var.H = rz.e0.B(ViewModelKt.getViewModelScope(z0Var), null, null, new w1(5, z0Var, this.f38599d, dVar), 3);
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f38597b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    v0 v0Var = new v0(this.f38598c, this.f38599d, null, 0);
                    this.f38597b = 1;
                    if (rz.e0.M(fVar, v0Var, this) == aVar2) {
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
