package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f629a;

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return kotlin.jvm.internal.m.a(this.f629a, ((q) obj).f629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f629a.hashCode();
    }

    public final String toString() {
        return ep.a.g("File(fileName=", this.f629a, ")");
    }
}
