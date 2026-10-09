package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34111f;

    public z(int i11, int i12, int i13, int i14, long j11) {
        this.f34106a = i11;
        this.f34107b = i12;
        this.f34108c = i13;
        this.f34109d = i14;
        this.f34110e = j11;
        this.f34111f = ((((long) i13) * 86400000) + j11) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f34106a == zVar.f34106a && this.f34107b == zVar.f34107b && this.f34108c == zVar.f34108c && this.f34109d == zVar.f34109d && this.f34110e == zVar.f34110e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34110e) + defpackage.e.b(this.f34109d, defpackage.e.b(this.f34108c, defpackage.e.b(this.f34107b, Integer.hashCode(this.f34106a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f34106a + ", month=" + this.f34107b + ", numberOfDays=" + this.f34108c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f34109d + ", startUtcTimeMillis=" + this.f34110e + ')';
    }
}
