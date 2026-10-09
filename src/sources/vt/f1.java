package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f54221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54223c;

    public f1(e1 e1Var, boolean z11, boolean z12) {
        this.f54221a = e1Var;
        this.f54222b = z11;
        this.f54223c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f54221a == f1Var.f54221a && this.f54222b == f1Var.f54222b && this.f54223c == f1Var.f54223c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54223c) + defpackage.e.e(this.f54221a.hashCode() * 31, 31, this.f54222b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SyncStepOutcome(step=");
        sb2.append(this.f54221a);
        sb2.append(", success=");
        sb2.append(this.f54222b);
        sb2.append(", isBestEffort=");
        return hh.p0.p(sb2, this.f54223c, ")");
    }
}
