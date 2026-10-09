package s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51284a;

    public /* synthetic */ b0(int i11) {
        this.f51284a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f51284a == ((b0) obj).f51284a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51284a);
    }

    public final String toString() {
        return nv.p.o("PointerKeyboardModifiers(packedValue=", this.f51284a, ')');
    }
}
