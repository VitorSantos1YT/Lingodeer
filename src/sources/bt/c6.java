package bt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c6 extends b0.h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.o f5278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(Context context, ht.o oVar) {
        super(context, oVar);
        kotlin.jvm.internal.m.f(context, "context");
        this.f5278c = oVar;
    }

    @Override // b0.h2
    public final void S(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1687031338);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            b.i(this.f5278c, (ys.d0) this.f3561b, sVar, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 21);
        }
    }

    @Override // b0.h2
    public final ht.o X() {
        return this.f5278c;
    }
}
