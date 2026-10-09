package xd;

import h7.t;
import vd.b0;
import vd.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f56008d;

    @Override // h7.t
    public final int b(Object obj) {
        b0 b0Var = (b0) obj;
        if (b0Var == null) {
            return 1;
        }
        return b0Var.c();
    }

    @Override // h7.t
    public final void c(Object obj, Object obj2) {
        b0 b0Var = (b0) obj2;
        o oVar = this.f56008d;
        if (oVar == null || b0Var == null) {
            return;
        }
        oVar.f53930e.o(b0Var, true);
    }
}
