package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f38746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38747b;

    public h0(j0 lesson, boolean z11) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        this.f38746a = lesson;
        this.f38747b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.m.a(this.f38746a, h0Var.f38746a) && this.f38747b == h0Var.f38747b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38747b) + defpackage.e.e(this.f38746a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "JPSyllableIndexClickLessonContent(lesson=" + this.f38746a + ", showLife=false, showIntro=" + this.f38747b + ")";
    }
}
