package b1;

import qy.b0;
import s0.s0;
import z2.h1;
import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3788b;

    public /* synthetic */ i(k kVar, int i11) {
        this.f3787a = i11;
        this.f3788b = kVar;
    }

    @Override // fz.a
    public final Object invoke() {
        i2 i2Var;
        switch (this.f3787a) {
            case 0:
                y2.f.u(this.f3788b);
                return b0.f48488a;
            case 1:
                this.f3788b.Z.h(true);
                return Boolean.TRUE;
            case 2:
                this.f3788b.Z.d(true);
                return Boolean.TRUE;
            case 3:
                this.f3788b.Z.f();
                return Boolean.TRUE;
            case 4:
                y2.f.u(this.f3788b);
                return b0.f48488a;
            case 5:
                this.f3788b.Z.o();
                return Boolean.TRUE;
            case 6:
                k kVar = this.f3788b;
                kVar.U.f51187w.f51243b.f51182r.b(kVar.f3791a0.f44683e);
                return Boolean.TRUE;
            default:
                k kVar2 = this.f3788b;
                s0 s0Var = kVar2.U;
                e2.v vVar = kVar2.f3792b0;
                boolean z11 = kVar2.V;
                if (!s0Var.b()) {
                    e2.v.b(vVar);
                } else if (!z11 && (i2Var = s0Var.f51168c) != null) {
                    ((h1) i2Var).b();
                }
                return Boolean.TRUE;
        }
    }
}
