package l0;

import l1.b3;
import l1.h1;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class z extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f39225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3 f39226b;

    public z(h1 h1Var, h1 h1Var2, int i11) {
        h1Var = (i11 & 2) != 0 ? null : h1Var;
        h1Var2 = (i11 & 4) != 0 ? null : h1Var2;
        this.f39225a = h1Var;
        this.f39226b = h1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f39225a, zVar.f39225a) && kotlin.jvm.internal.m.a(this.f39226b, zVar.f39226b);
    }

    @Override // y2.d1
    public final z1.q f() {
        a0 a0Var = new a0();
        a0Var.Q = 1.0f;
        a0Var.R = this.f39225a;
        a0Var.S = this.f39226b;
        return a0Var;
    }

    public final int hashCode() {
        b3 b3Var = this.f39225a;
        int iHashCode = (b3Var != null ? b3Var.hashCode() : 0) * 31;
        b3 b3Var2 = this.f39226b;
        return Float.hashCode(1.0f) + ((iHashCode + (b3Var2 != null ? b3Var2.hashCode() : 0)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        a0 a0Var = (a0) qVar;
        a0Var.Q = 1.0f;
        a0Var.R = this.f39225a;
        a0Var.S = this.f39226b;
    }
}
