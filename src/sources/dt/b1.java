package dt;

import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka f23656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f23657b;

    public b1(ka uiState, fz.a onToggle) {
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onToggle, "onToggle");
        this.f23656a = uiState;
        this.f23657b = onToggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return kotlin.jvm.internal.m.a(this.f23656a, b1Var.f23656a) && kotlin.jvm.internal.m.a(this.f23657b, b1Var.f23657b);
    }

    public final int hashCode() {
        return this.f23657b.hashCode() + (this.f23656a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseTestBookmarkActions(uiState=" + this.f23656a + ", onToggle=" + this.f23657b + ")";
    }
}
