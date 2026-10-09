package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27760c;

    public o3(String mergedProgress, long j11, boolean z11) {
        kotlin.jvm.internal.m.f(mergedProgress, "mergedProgress");
        this.f27758a = mergedProgress;
        this.f27759b = j11;
        this.f27760c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return kotlin.jvm.internal.m.a(this.f27758a, o3Var.f27758a) && this.f27759b == o3Var.f27759b && this.f27760c == o3Var.f27760c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27760c) + defpackage.e.f(this.f27759b, this.f27758a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(this.f27759b, "SubLearnProgressSyncDecision(mergedProgress=", this.f27758a, ", finalTime=");
        sbM.append(", shouldUpload=");
        sbM.append(this.f27760c);
        sbM.append(")");
        return sbM.toString();
    }
}
