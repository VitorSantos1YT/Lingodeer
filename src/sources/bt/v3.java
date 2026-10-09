package bt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v3 extends b0.h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.o f6104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ot.n f6105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context, ht.o oVar, ot.n nVar, int i11) {
        super(context, oVar);
        this.f6103c = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(context, "context");
                super(context, oVar);
                this.f6104d = oVar;
                this.f6105e = nVar;
                break;
            default:
                kotlin.jvm.internal.m.f(context, "context");
                this.f6104d = oVar;
                this.f6105e = nVar;
                break;
        }
    }

    @Override // b0.h2
    public final void S(l1.n nVar, int i11) {
        switch (this.f6103c) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                sVar.d0(-45613654);
                b.w(this.f6105e, this.f6104d, (ys.d0) this.f3561b, sVar, 0);
                sVar.p(false);
                break;
            default:
                l1.s sVar2 = (l1.s) nVar;
                sVar2.f0(1710729482);
                int i12 = (sVar2.h(this) ? 4 : 2) | i11;
                if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
                    b.z(this.f6105e, this.f6104d, (ys.d0) this.f3561b, sVar2, 0);
                } else {
                    sVar2.W();
                }
                l1.x1 x1VarT = sVar2.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 16);
                }
                break;
        }
    }

    @Override // b0.h2
    public final ht.o X() {
        switch (this.f6103c) {
            case 0:
                break;
        }
        return this.f6104d;
    }
}
