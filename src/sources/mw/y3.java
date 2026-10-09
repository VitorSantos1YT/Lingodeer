package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y3 extends lw.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.m0 f42841a;

    public y3(lw.m0 m0Var) {
        Preconditions.k(m0Var, "result");
        this.f42841a = m0Var;
    }

    @Override // lw.o0
    public final lw.m0 a(b4 b4Var) {
        return this.f42841a;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(y3.class.getSimpleName());
        toStringHelper.c(this.f42841a, "result");
        return toStringHelper.toString();
    }
}
