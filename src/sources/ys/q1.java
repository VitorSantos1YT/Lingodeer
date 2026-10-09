package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58222b;

    public q1(boolean z11) {
        super(z11);
        this.f58222b = z11;
    }

    @Override // ys.v1
    public final boolean a() {
        return this.f58222b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && this.f58222b == ((q1) obj).f58222b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58222b);
    }

    public final String toString() {
        return ep.a.i("IconComprehensive(finished=", ")", this.f58222b);
    }
}
