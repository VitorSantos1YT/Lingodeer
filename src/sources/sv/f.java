package sv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f51803a;

    public f(e lesson) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        this.f51803a = lesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f51803a, ((f) obj).f51803a);
    }

    public final int hashCode() {
        return this.f51803a.hashCode();
    }

    public final String toString() {
        return "OnLessonClick(lesson=" + this.f51803a + ")";
    }
}
