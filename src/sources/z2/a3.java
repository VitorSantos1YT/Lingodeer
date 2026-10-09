package z2;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f58502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f58503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var, fz.e eVar) {
        super(1);
        this.f58502a = b3Var;
        this.f58503b = eVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        k kVar = (k) obj;
        b3 b3Var = this.f58502a;
        if (!b3Var.f58512c) {
            Lifecycle lifecycle = kVar.f58595a.getLifecycle();
            fz.e eVar = this.f58503b;
            b3Var.f58514e = eVar;
            if (b3Var.f58513d == null) {
                b3Var.f58513d = lifecycle;
                lifecycle.addObserver(b3Var);
            } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                b3Var.f58511b.A(new t1.d(new z2(b3Var, eVar, 1), true, 1330788943));
            }
        }
        return qy.b0.f48488a;
    }
}
