package oh;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44918a;

    public f(long j11) {
        this.f44918a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f44918a == ((f) obj).f44918a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44918a);
    }

    public final String toString() {
        return p.m(this.f44918a, "ToggleBookmark(lessonId=", ")");
    }
}
