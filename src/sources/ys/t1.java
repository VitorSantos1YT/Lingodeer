package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58267b;

    public t1(boolean z11) {
        super(z11);
        this.f58267b = z11;
    }

    @Override // ys.v1
    public final boolean a() {
        return this.f58267b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && this.f58267b == ((t1) obj).f58267b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58267b);
    }

    public final String toString() {
        return ep.a.i("IconSpeaking(finished=", ")", this.f58267b);
    }
}
