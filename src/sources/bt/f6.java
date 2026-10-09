package bt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f6 extends b0.h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.o f5405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ot.u1 f5406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, ht.o courseTestParams, ot.u1 u1Var, int i11) {
        super(context, courseTestParams);
        this.f5404c = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(context, "context");
                super(context, courseTestParams);
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
            case 2:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                super(context, courseTestParams);
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
            case 3:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                super(context, courseTestParams);
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
            case 4:
                kotlin.jvm.internal.m.f(context, "context");
                super(context, courseTestParams);
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
            case 5:
                kotlin.jvm.internal.m.f(context, "context");
                super(context, courseTestParams);
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
            default:
                kotlin.jvm.internal.m.f(context, "context");
                this.f5405d = courseTestParams;
                this.f5406e = u1Var;
                break;
        }
    }

    @Override // b0.h2
    public final void S(l1.n nVar, int i11) {
        switch (this.f5404c) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                sVar.f0(-128281086);
                int i12 = (sVar.h(this) ? 4 : 2) | i11;
                if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
                    b.N(this.f5406e, this.f5405d, (ys.d0) this.f3561b, sVar, 0);
                } else {
                    sVar.W();
                }
                l1.x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 23);
                }
                break;
            case 1:
                l1.s sVar2 = (l1.s) nVar;
                sVar2.f0(1009362346);
                int i13 = (sVar2.h(this) ? 4 : 2) | i11;
                if (sVar2.T(i13 & 1, (i13 & 3) != 2)) {
                    b.Q(this.f5406e, this.f5405d, (ys.d0) this.f3561b, sVar2, 0);
                } else {
                    sVar2.W();
                }
                l1.x1 x1VarT2 = sVar2.t();
                if (x1VarT2 != null) {
                    x1VarT2.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 24);
                }
                break;
            case 2:
                l1.s sVar3 = (l1.s) nVar;
                sVar3.d0(1796651402);
                ht.o oVar = this.f5405d;
                b.T(this.f5406e, ht.o.a(oVar, 0, 0L, false, false, false, false, false, false, !oVar.f33759g, false, false, false, null, 507903), (ys.d0) this.f3561b, sVar3, 0);
                sVar3.p(false);
                break;
            case 3:
                l1.s sVar4 = (l1.s) nVar;
                sVar4.d0(-1711026838);
                b.V(this.f5406e, ht.o.a(this.f5405d, 0, 0L, false, false, false, false, false, false, true, false, false, false, null, 507903), (ys.d0) this.f3561b, sVar4, 0);
                sVar4.p(false);
                break;
            case 4:
                l1.s sVar5 = (l1.s) nVar;
                sVar5.f0(886693674);
                int i14 = (sVar5.h(this) ? 4 : 2) | i11;
                if (sVar5.T(i14 & 1, (i14 & 3) != 2)) {
                    b.Y(this.f5406e, ht.o.a(this.f5405d, 0, 0L, false, false, false, false, false, false, true, false, false, false, null, 507903), (ys.d0) this.f3561b, sVar5, 0);
                } else {
                    sVar5.W();
                }
                l1.x1 x1VarT3 = sVar5.t();
                if (x1VarT3 != null) {
                    x1VarT3.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 25);
                }
                break;
            default:
                l1.s sVar6 = (l1.s) nVar;
                sVar6.f0(-2069548854);
                int i15 = (sVar6.h(this) ? 4 : 2) | i11;
                if (sVar6.T(i15 & 1, (i15 & 3) != 2)) {
                    e8.c(this.f5406e, ht.o.a(this.f5405d, 0, 0L, false, false, false, false, false, false, true, false, false, false, null, 507903), (ys.d0) this.f3561b, sVar6, 0);
                } else {
                    sVar6.W();
                }
                l1.x1 x1VarT4 = sVar6.t();
                if (x1VarT4 != null) {
                    x1VarT4.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 27);
                }
                break;
        }
    }

    @Override // b0.h2
    public final ht.o X() {
        switch (this.f5404c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f5405d;
    }
}
