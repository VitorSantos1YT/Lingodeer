package kr;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f38583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(z0 z0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38581a = i11;
        this.f38583c = z0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38581a) {
            case 0:
                return new t0(this.f38583c, dVar, 0);
            case 1:
                return new t0(this.f38583c, dVar, 1);
            case 2:
                return new t0(this.f38583c, dVar, 2);
            default:
                return new t0(this.f38583c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38581a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((t0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object value;
        int i11 = this.f38581a;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        z0 z0Var = this.f38583c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f38582b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var = z0Var.f38630d;
                long j11 = z0Var.f38631e;
                this.f38582b = 1;
                bh.a1 a1Var = (bh.a1) k0Var;
                a1Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new bh.n0(8, j11, a1Var, null), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f38582b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f38582b = 1;
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new u0(z0Var, dVar, i12), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
            case 2:
                vt.n0 n0Var = z0Var.f38627a;
                int i15 = z0Var.f38632f;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f38582b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                qy.q qVar = fv.b.f28186a;
                String strM = fv.b.M(i15);
                String strN = fv.b.N(i15, ((fr.o0) n0Var).w());
                String str = ((fr.o0) n0Var).v() + strN;
                gb.r.Z(strM, str);
                this.f38582b = 1;
                Object objA = pl.d.f46951b.o().a("story/", strN, str, new xq.c(z0Var, strN, str, 18), this);
                if (objA != aVar3) {
                    objA = b0Var;
                }
                return objA == aVar3 ? aVar3 : b0Var;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f38582b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var = z0Var.M;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, p1.f38558a));
                yz.f fVar3 = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                t0 t0Var = new t0(z0Var, dVar, 2);
                this.f38582b = 1;
                return rz.e0.M(eVar, t0Var, this) == aVar4 ? aVar4 : b0Var;
        }
    }
}
