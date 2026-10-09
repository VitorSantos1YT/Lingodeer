package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ns.r0 f24407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24409c;

    public z0(ns.r0 response, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(response, "response");
        this.f24407a = response;
        this.f24408b = z11;
        this.f24409c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.m.a(this.f24407a, z0Var.f24407a) && this.f24408b == z0Var.f24408b && this.f24409c == z0Var.f24409c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24409c) + defpackage.e.e(this.f24407a.hashCode() * 31, 31, this.f24408b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseMistakeExplainContentConfig(response=");
        sb2.append(this.f24407a);
        sb2.append(", showFooter=");
        sb2.append(this.f24408b);
        sb2.append(", showStreamingIndicator=");
        return hh.p0.p(sb2, this.f24409c, ")");
    }
}
