package y4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57089b;

    public b(Object obj, Object obj2) {
        this.f57088a = obj;
        this.f57089b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f57088a, this.f57088a) && Objects.equals(bVar.f57089b, this.f57089b);
    }

    public final int hashCode() {
        Object obj = this.f57088a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f57089b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f57088a + " " + this.f57089b + "}";
    }
}
