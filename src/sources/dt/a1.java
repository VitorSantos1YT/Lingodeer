package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.e f23631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.f f23633c;

    public a1(fz.e uiStateFor, long j11, fz.f onToggle) {
        kotlin.jvm.internal.m.f(uiStateFor, "uiStateFor");
        kotlin.jvm.internal.m.f(onToggle, "onToggle");
        this.f23631a = uiStateFor;
        this.f23632b = j11;
        this.f23633c = onToggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f23631a, a1Var.f23631a) && this.f23632b == a1Var.f23632b && kotlin.jvm.internal.m.a(this.f23633c, a1Var.f23633c);
    }

    public final int hashCode() {
        return this.f23633c.hashCode() + defpackage.e.f(this.f23632b, this.f23631a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CourseTestBookmarkActionProvider(uiStateFor=" + this.f23631a + ", unitId=" + this.f23632b + ", onToggle=" + this.f23633c + ")";
    }
}
