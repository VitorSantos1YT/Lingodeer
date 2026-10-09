package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36917a;

    public e2(boolean z11) {
        this.f36917a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && this.f36917a == ((e2) obj).f36917a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36917a);
    }

    public final String toString() {
        return ep.a.i("SwitchToNext(isCorrect=", ")", this.f36917a);
    }
}
