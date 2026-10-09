package fr;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements vt.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.f0 f27428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au.k0 f27429b;

    public c0(au.f0 f0Var, au.k0 k0Var) {
        this.f27428a = f0Var;
        this.f27429b = k0Var;
    }

    public final Object a(ArrayList arrayList, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new z(this, arrayList, null, 1), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final bh.i0 b() {
        return new bh.i0(qx.p.l(this.f27429b.f3036a, new String[]{"daily_learn_time_history"}, new au.a(9)), 5);
    }
}
