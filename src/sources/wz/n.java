package wz;

import rz.g0;
import rz.j0;
import rz.q0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends y implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f55537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f55538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55539c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(y yVar, String str) {
        j0 j0Var = yVar instanceof j0 ? (j0) yVar : null;
        this.f55537a = j0Var == null ? g0.f50907a : j0Var;
        this.f55538b = yVar;
        this.f55539c = str;
    }

    @Override // rz.j0
    public final void a(long j11, rz.m mVar) {
        this.f55537a.a(j11, mVar);
    }

    @Override // rz.j0
    public final q0 b(long j11, Runnable runnable, vy.i iVar) {
        return this.f55537a.b(j11, runnable, iVar);
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        this.f55538b.dispatch(iVar, runnable);
    }

    @Override // rz.y
    public final void dispatchYield(vy.i iVar, Runnable runnable) {
        this.f55538b.dispatchYield(iVar, runnable);
    }

    @Override // rz.y
    public final boolean isDispatchNeeded(vy.i iVar) {
        return this.f55538b.isDispatchNeeded(iVar);
    }

    @Override // rz.y
    public final String toString() {
        return this.f55539c;
    }
}
