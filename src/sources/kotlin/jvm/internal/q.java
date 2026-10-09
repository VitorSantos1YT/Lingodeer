package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38355a;

    public q(Class jClass, String str) {
        m.f(jClass, "jClass");
        this.f38355a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class e() {
        return this.f38355a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return m.a(this.f38355a, ((q) obj).f38355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38355a.hashCode();
    }

    public final String toString() {
        return this.f38355a + " (Kotlin reflection is not available)";
    }
}
