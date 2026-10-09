package tu;

import rz.o0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f52565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(m0 m0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f52563a = i11;
        this.f52565c = m0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52563a) {
            case 0:
                return new f0(this.f52565c, dVar, 0);
            case 1:
                return new f0(this.f52565c, dVar, 1);
            default:
                return new f0(this.f52565c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52563a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f52563a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        m0 m0Var = this.f52565c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f52564b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var = ((vt.d) m0Var.f52603a).f54208s;
                nu.b bVar = new nu.b(m0Var, dVar, 18);
                this.f52564b = 1;
                return x0.i(i1Var, bVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f52564b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var2 = ((vt.d) m0Var.f52603a).f54207r;
                rt.h hVar = new rt.h(m0Var, dVar, 19);
                this.f52564b = 1;
                return x0.i(i1Var2, hVar, this) == aVar2 ? aVar2 : b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f52564b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar = o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                h0 h0Var = new h0(m0Var, null);
                this.f52564b = 1;
                return rz.e0.M(eVar, h0Var, this) == aVar3 ? aVar3 : b0Var;
        }
    }
}
