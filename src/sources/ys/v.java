package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f58285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58286b;

    public v(long j11, long j12) {
        this.f58285a = j11;
        this.f58286b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f58285a == vVar.f58285a && this.f58286b == vVar.f58286b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58286b) + (Long.hashCode(this.f58285a) * 31);
    }

    public final String toString() {
        return defpackage.e.i(this.f58286b, ")", w4.c.j(this.f58285a, "CourseTestAnalyticsContext(lessonId=", ", unitId="));
    }
}
