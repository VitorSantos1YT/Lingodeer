package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.c0 f184c;

    public s1(float f5, long j11, b0.c0 c0Var) {
        this.f182a = f5;
        this.f183b = j11;
        this.f184c = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Float.compare(this.f182a, s1Var.f182a) == 0 && g2.z0.a(this.f183b, s1Var.f183b) && kotlin.jvm.internal.m.a(this.f184c, s1Var.f184c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f182a) * 31;
        int i11 = g2.z0.f28632c;
        return this.f184c.hashCode() + defpackage.e.f(this.f183b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f182a + ", transformOrigin=" + ((Object) g2.z0.d(this.f183b)) + ", animationSpec=" + this.f184c + ')';
    }
}
