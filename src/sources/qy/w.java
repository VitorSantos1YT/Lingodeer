package qy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48512a;

    public /* synthetic */ w(long j11) {
        this.f48512a = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.i(this.f48512a ^ Long.MIN_VALUE, ((w) obj).f48512a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f48512a == ((w) obj).f48512a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48512a);
    }

    public final String toString() {
        return com.bumptech.glide.g.B(10, this.f48512a);
    }
}
