package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31458c;

    public c(String str, long j11, int i11) {
        this.f31456a = str;
        this.f31457b = j11;
        this.f31458c = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i11);

    public abstract float b(int i11);

    public boolean c() {
        return false;
    }

    public abstract long d(float f5, float f11, float f12);

    public abstract float e(float f5, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f31458c == cVar.f31458c && kotlin.jvm.internal.m.a(this.f31456a, cVar.f31456a)) {
            return b.a(this.f31457b, cVar.f31457b);
        }
        return false;
    }

    public abstract long f(float f5, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f31456a.hashCode() * 31;
        int i11 = b.f31455e;
        return defpackage.e.f(this.f31457b, iHashCode, 31) + this.f31458c;
    }

    public final String toString() {
        return this.f31456a + " (id=" + this.f31458c + ", model=" + ((Object) b.b(this.f31457b)) + ')';
    }
}
