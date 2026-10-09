package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f157c;

    public o1(long j11, float f5, float f11) {
        this.f155a = f5;
        this.f156b = f11;
        this.f157c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Float.compare(this.f155a, o1Var.f155a) == 0 && Float.compare(this.f156b, o1Var.f156b) == 0 && this.f157c == o1Var.f157c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f157c) + defpackage.e.a(Float.hashCode(this.f155a) * 31, this.f156b, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f155a + ", distance=" + this.f156b + ", duration=" + this.f157c + ')';
    }
}
