package a2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f308a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f308a == ((f) obj).f308a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f308a);
    }

    public final String toString() {
        return nv.p.o("AndroidContentDataType(androidAutofillType=", this.f308a, ')');
    }
}
