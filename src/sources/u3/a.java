package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52733a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f52733a, ((a) obj).f52733a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52733a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f52733a + ')';
    }
}
