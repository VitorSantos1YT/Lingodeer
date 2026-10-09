package bt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends b0.h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.o f5819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ot.q f5820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, ht.o courseTestParams, ot.q qVar, int i11) {
        super(context, courseTestParams);
        this.f5818c = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                super(context, courseTestParams);
                this.f5819d = courseTestParams;
                this.f5820e = qVar;
                break;
            default:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                this.f5819d = courseTestParams;
                this.f5820e = qVar;
                break;
        }
    }

    @Override // b0.h2
    public final void S(l1.n nVar, int i11) {
        switch (this.f5818c) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                sVar.f0(1388318080);
                int i12 = (sVar.h(this) ? 4 : 2) | i11;
                if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
                    ys.d0 d0Var = (ys.d0) this.f3561b;
                    boolean zH = sVar.h(this);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new av.d(this, 14);
                        sVar.o0(objQ);
                    }
                    i0.c(this.f5820e, this.f5819d, d0Var, (fz.a) objQ, sVar, 0);
                } else {
                    sVar.W();
                }
                l1.x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 9);
                }
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                sVar2.d0(928448458);
                ys.d0 d0Var2 = (ys.d0) this.f3561b;
                boolean zH2 = sVar2.h(this);
                Object objQ2 = sVar2.Q();
                if (zH2 || objQ2 == l1.m.f39353a) {
                    objQ2 = new av.d(this, 17);
                    sVar2.o0(objQ2);
                }
                s5.b(this.f5820e, this.f5819d, d0Var2, (fz.a) objQ2, sVar2, 0);
                sVar2.p(false);
                break;
        }
    }

    @Override // b0.h2
    public final ht.o X() {
        switch (this.f5818c) {
            case 0:
                break;
        }
        return this.f5819d;
    }
}
