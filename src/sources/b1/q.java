package b1;

import d1.z0;
import s0.s0;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class q extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f3803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f3804c;

    public q(e eVar, s0 s0Var, z0 z0Var) {
        this.f3802a = eVar;
        this.f3803b = s0Var;
        this.f3804c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f3802a, qVar.f3802a) && kotlin.jvm.internal.m.a(this.f3803b, qVar.f3803b) && kotlin.jvm.internal.m.a(this.f3804c, qVar.f3804c);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new r(this.f3802a, this.f3803b, this.f3804c);
    }

    public final int hashCode() {
        return this.f3804c.hashCode() + ((this.f3803b.hashCode() + (this.f3802a.hashCode() * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) throws Throwable {
        r rVar = (r) qVar;
        if (rVar.P) {
            rVar.Q.d();
            rVar.Q.k(rVar);
        }
        e eVar = this.f3802a;
        rVar.Q = eVar;
        if (rVar.P) {
            if (eVar.f3773a != null) {
                i0.a.c("Expected textInputModifierNode to be null");
            }
            eVar.f3773a = rVar;
        }
        rVar.R = this.f3803b;
        rVar.S = this.f3804c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f3802a + ", legacyTextFieldState=" + this.f3803b + ", textFieldSelectionManager=" + this.f3804c + ')';
    }
}
