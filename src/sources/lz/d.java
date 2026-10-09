package lz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40531b;

    public d(float f5, float f11) {
        this.f40530a = f5;
        this.f40531b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable a() {
        return Float.valueOf(this.f40531b);
    }

    public final Comparable b() {
        return Float.valueOf(this.f40530a);
    }

    public final boolean c() {
        return this.f40530a > this.f40531b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (c() && ((d) obj).c()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f40530a == dVar.f40530a && this.f40531b == dVar.f40531b;
    }

    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return Float.hashCode(this.f40531b) + (Float.hashCode(this.f40530a) * 31);
    }

    public final String toString() {
        return this.f40530a + ".." + this.f40531b;
    }
}
