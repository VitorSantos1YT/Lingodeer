package fu;

import l1.a1;
import l1.b1;
import l1.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad.i f28179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f28180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f28181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(ad.i iVar, a1 a1Var, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28178a = i11;
        this.f28179b = iVar;
        this.f28180c = a1Var;
        this.f28181d = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28178a) {
            case 0:
                return new z(this.f28179b, this.f28180c, this.f28181d, dVar, 0);
            default:
                return new z(this.f28179b, this.f28180c, this.f28181d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28178a) {
            case 0:
                z zVar = (z) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                zVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                z zVar2 = (z) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                zVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f28178a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f28181d;
        ad.i iVar = this.f28179b;
        a1 a1Var = this.f28180c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Number) iVar.getValue()).floatValue() >= 1.0f) {
                    h1 h1Var = (h1) a1Var;
                    if (h1Var.l() != 1) {
                        h1Var.m(1);
                        b1Var.setValue(Boolean.TRUE);
                    }
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Number) iVar.getValue()).floatValue() >= 1.0f) {
                    h1 h1Var2 = (h1) a1Var;
                    if (h1Var2.l() != 1) {
                        h1Var2.m(1);
                        b1Var.setValue(Boolean.TRUE);
                    }
                }
                break;
        }
        return b0Var;
    }
}
