package s0;

import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f51129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f51130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2.l f51131c;

    public p0(i2 i2Var) {
        this.f51129a = i2Var;
    }

    public final q0 a() {
        q0 q0Var = this.f51130b;
        if (q0Var != null) {
            return q0Var;
        }
        kotlin.jvm.internal.m.n("keyboardActions");
        throw null;
    }

    public final boolean b(int i11) {
        fz.c cVar;
        i2 i2Var;
        if (i11 == 7) {
            cVar = a().f51141a;
        } else {
            if (i11 == 2 || i11 == 6 || i11 == 5) {
                a();
            } else if (i11 == 3) {
                cVar = a().f51142b;
            } else if (i11 == 4) {
                a();
            } else if (i11 != 1 && i11 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            cVar = null;
        }
        if (cVar != null) {
            cVar.invoke(this);
            return true;
        }
        if (i11 == 6) {
            e2.l lVar = this.f51131c;
            if (lVar != null) {
                ((e2.p) lVar).h(1, true);
                return true;
            }
            kotlin.jvm.internal.m.n("focusManager");
            throw null;
        }
        if (i11 != 5) {
            if (i11 != 7 || (i2Var = this.f51129a) == null) {
                return false;
            }
            ((z2.h1) i2Var).a();
            return true;
        }
        e2.l lVar2 = this.f51131c;
        if (lVar2 != null) {
            ((e2.p) lVar2).h(2, true);
            return true;
        }
        kotlin.jvm.internal.m.n("focusManager");
        throw null;
    }
}
