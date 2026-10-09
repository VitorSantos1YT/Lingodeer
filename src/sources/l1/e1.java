package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39285a;

    public e1(String str) {
        this.f39285a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && kotlin.jvm.internal.m.a(this.f39285a, ((e1) obj).f39285a);
    }

    public final int hashCode() {
        return this.f39285a.hashCode();
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("OpaqueKey(key="), this.f39285a, ')');
    }
}
