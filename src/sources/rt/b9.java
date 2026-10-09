package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b9 implements e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8 f49528a;

    public b9(z8 courseSettings) {
        kotlin.jvm.internal.m.f(courseSettings, "courseSettings");
        this.f49528a = courseSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9) && kotlin.jvm.internal.m.a(this.f49528a, ((b9) obj).f49528a);
    }

    public final int hashCode() {
        return this.f49528a.hashCode();
    }

    public final String toString() {
        return "UpdateCourseSettings(courseSettings=" + this.f49528a + ")";
    }
}
