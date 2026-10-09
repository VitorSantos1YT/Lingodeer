package n3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43143a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return kotlin.jvm.internal.m.a(this.f43143a, ((d) obj).f43143a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f43143a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f43143a + ')';
    }
}
