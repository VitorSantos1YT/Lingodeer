package h1;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f30716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30718c;

    public n1(n nVar, boolean z11, int i11) {
        this.f30716a = nVar;
        this.f30717b = z11;
        this.f30718c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.m.a(this.f30716a, n1Var.f30716a) && this.f30717b == n1Var.f30717b && this.f30718c == n1Var.f30718c;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new r1(this.f30716a, this.f30717b, this.f30718c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30718c) + defpackage.e.e(this.f30716a.hashCode() * 31, 31, this.f30717b);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        r1 r1Var = (r1) qVar;
        n nVar = this.f30716a;
        r1Var.S = nVar;
        r1Var.T = this.f30717b;
        int i11 = r1Var.U;
        int i12 = this.f30718c;
        if (i11 == i12) {
            return;
        }
        r1Var.U = i12;
        rz.e0.B(r1Var.H0(), null, null, new gp.a(nVar, null, 4), 3);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ClockDialModifier(state=");
        sb2.append(this.f30716a);
        sb2.append(", autoSwitchToMinute=");
        sb2.append(this.f30717b);
        sb2.append(", selection=");
        int i11 = this.f30718c;
        if (i11 == 0) {
            str = "Hour";
        } else {
            str = i11 == 1 ? "Minute" : BuildConfig.VERSION_NAME;
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
