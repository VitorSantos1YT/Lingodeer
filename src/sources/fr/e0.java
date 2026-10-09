package fr;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements vt.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.l0 f27474a;

    public e0(au.l0 l0Var) {
        this.f27474a = l0Var;
    }

    public final Object a(ArrayList arrayList, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new e6.q0(13, this, arrayList, (vy.d) null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final bh.i0 b() {
        return new bh.i0(qx.p.l(this.f27474a.f3042a, new String[]{"daily_streak_history"}, new au.a(10)), 6);
    }
}
