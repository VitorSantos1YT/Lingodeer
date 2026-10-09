package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34087d;

    public w(int i11, int i12, int i13, long j11) {
        this.f34084a = i11;
        this.f34085b = i12;
        this.f34086c = i13;
        this.f34087d = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.i(this.f34087d, ((w) obj).f34087d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f34084a == wVar.f34084a && this.f34085b == wVar.f34085b && this.f34086c == wVar.f34086c && this.f34087d == wVar.f34087d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34087d) + defpackage.e.b(this.f34086c, defpackage.e.b(this.f34085b, Integer.hashCode(this.f34084a) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.f34084a + ", month=" + this.f34085b + ", dayOfMonth=" + this.f34086c + ", utcTimeMillis=" + this.f34087d + ')';
    }
}
