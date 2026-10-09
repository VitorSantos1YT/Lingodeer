package qy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48510a;

    public /* synthetic */ u(int i11) {
        this.f48510a = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.h(this.f48510a ^ Integer.MIN_VALUE, ((u) obj).f48510a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f48510a == ((u) obj).f48510a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48510a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f48510a) & 4294967295L);
    }
}
