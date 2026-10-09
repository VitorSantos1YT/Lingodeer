package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58239b;

    public r1(boolean z11) {
        super(z11);
        this.f58239b = z11;
    }

    @Override // ys.v1
    public final boolean a() {
        return this.f58239b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.f58239b == ((r1) obj).f58239b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58239b);
    }

    public final String toString() {
        return ep.a.i("IconListening(finished=", ")", this.f58239b);
    }
}
