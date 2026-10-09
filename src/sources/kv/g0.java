package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f38743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38744b;

    public g0(i0 i0Var, boolean z11) {
        this.f38743a = i0Var;
        this.f38744b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f38743a.equals(g0Var.f38743a) && this.f38744b == g0Var.f38744b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38744b) + defpackage.e.e(this.f38743a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "JPSyllableIndexClickLesson(lesson=" + this.f38743a + ", showLife=false, showIntro=" + this.f38744b + ")";
    }
}
