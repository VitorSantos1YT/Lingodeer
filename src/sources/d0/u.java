package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.t f22806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.w0 f22807c;

    public u(float f5, g2.t tVar, g2.w0 w0Var) {
        this.f22805a = f5;
        this.f22806b = tVar;
        this.f22807c = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return v3.f.b(this.f22805a, uVar.f22805a) && this.f22806b.equals(uVar.f22806b) && kotlin.jvm.internal.m.a(this.f22807c, uVar.f22807c);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new t(this.f22805a, this.f22806b, this.f22807c);
    }

    public final int hashCode() {
        return this.f22807c.hashCode() + ((this.f22806b.hashCode() + (Float.hashCode(this.f22805a) * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        t tVar = (t) qVar;
        float f5 = tVar.T;
        d2.d dVar = tVar.W;
        float f11 = this.f22805a;
        if (!v3.f.b(f5, f11)) {
            tVar.T = f11;
            dVar.T0();
        }
        g2.t tVar2 = tVar.U;
        g2.t tVar3 = this.f22806b;
        if (!kotlin.jvm.internal.m.a(tVar2, tVar3)) {
            tVar.U = tVar3;
            dVar.T0();
        }
        g2.w0 w0Var = tVar.V;
        g2.w0 w0Var2 = this.f22807c;
        if (kotlin.jvm.internal.m.a(w0Var, w0Var2)) {
            return;
        }
        tVar.V = w0Var2;
        dVar.T0();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderModifierNodeElement(width=");
        com.google.android.material.datepicker.d.s(this.f22805a, ", brush=", sb2);
        sb2.append(this.f22806b);
        sb2.append(", shape=");
        sb2.append(this.f22807c);
        sb2.append(')');
        return sb2.toString();
    }
}
