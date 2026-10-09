package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class qc implements rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot.j1 f50301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f50303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50307g;

    public qc(ot.j1 j1Var, boolean z11, long j11, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        j11 = (i11 & 4) != 0 ? -1L : j11;
        z13 = (i11 & 16) != 0 ? false : z13;
        z14 = (i11 & 64) != 0 ? false : z14;
        z15 = (i11 & 128) != 0 ? false : z15;
        this.f50301a = j1Var;
        this.f50302b = z11;
        this.f50303c = j11;
        this.f50304d = z12;
        this.f50305e = z13;
        this.f50306f = z14;
        this.f50307g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return kotlin.jvm.internal.m.a(this.f50301a, qcVar.f50301a) && this.f50302b == qcVar.f50302b && this.f50303c == qcVar.f50303c && this.f50304d == qcVar.f50304d && this.f50305e == qcVar.f50305e && this.f50306f == qcVar.f50306f && this.f50307g == qcVar.f50307g;
    }

    public final int hashCode() {
        ot.j1 j1Var = this.f50301a;
        return Boolean.hashCode(this.f50307g) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.f(this.f50303c, defpackage.e.e((j1Var == null ? 0 : j1Var.hashCode()) * 31, 31, this.f50302b), 31), 31, this.f50304d), 31, this.f50305e), 31, false), 31, this.f50306f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(courseTestModelData=");
        sb2.append(this.f50301a);
        sb2.append(", showTips=");
        sb2.append(this.f50302b);
        sb2.append(", tipsUnitId=");
        sb2.append(this.f50303c);
        sb2.append(", showSetting=");
        sb2.append(this.f50304d);
        b7.e0.z(", showLife=", ", showNotPassed=false, needSkip=", sb2, this.f50305e, this.f50306f);
        sb2.append(", isTestOut=");
        sb2.append(this.f50307g);
        sb2.append(")");
        return sb2.toString();
    }
}
