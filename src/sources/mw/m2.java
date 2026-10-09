package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends lw.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.m0 f42535a;

    public m2(Throwable th2) {
        lw.q1 q1VarG = lw.q1.f40441l.h("Panic! This is a bug!").g(th2);
        lw.m0 m0Var = lw.m0.f40417e;
        Preconditions.e("drop status shouldn't be OK", !q1VarG.f());
        this.f42535a = new lw.m0(null, null, q1VarG, true);
    }

    @Override // lw.o0
    public final lw.m0 a(b4 b4Var) {
        return this.f42535a;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(m2.class.getSimpleName());
        toStringHelper.c(this.f42535a, "panicPickResult");
        return toStringHelper.toString();
    }
}
