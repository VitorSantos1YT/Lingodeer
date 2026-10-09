package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f38499a;

    public j0(h0 courseSettings) {
        kotlin.jvm.internal.m.f(courseSettings, "courseSettings");
        this.f38499a = courseSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && kotlin.jvm.internal.m.a(this.f38499a, ((j0) obj).f38499a);
    }

    public final int hashCode() {
        return this.f38499a.hashCode();
    }

    public final String toString() {
        return "UpdateStorySettings(courseSettings=" + this.f38499a + ")";
    }
}
