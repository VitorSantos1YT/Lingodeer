package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58279b;

    public u1(boolean z11) {
        super(z11);
        this.f58279b = z11;
    }

    @Override // ys.v1
    public final boolean a() {
        return this.f58279b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && this.f58279b == ((u1) obj).f58279b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58279b);
    }

    public final String toString() {
        return ep.a.i("IconSpelling(finished=", ")", this.f58279b);
    }
}
