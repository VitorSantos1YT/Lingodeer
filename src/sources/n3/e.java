package n3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f43149a;

    public e(a0 a0Var) {
        this.f43149a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.f43149a, ((e) obj).f43149a);
    }

    public final int hashCode() {
        return this.f43149a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f43149a + ", loaderKey=null)";
    }
}
