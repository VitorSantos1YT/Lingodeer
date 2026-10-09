package hc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jh.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32177a;

    public a(int i11) {
        this.f32177a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f32177a == ((a) obj).f32177a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32177a;
    }

    public final String toString() {
        return String.valueOf(this.f32177a);
    }
}
