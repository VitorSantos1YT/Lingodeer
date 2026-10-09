package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35660a;

    public a1(String str) {
        this.f35660a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return kotlin.jvm.internal.m.a(this.f35660a, ((a1) obj).f35660a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35660a.hashCode();
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("UrlAnnotation(url="), this.f35660a, ')');
    }
}
