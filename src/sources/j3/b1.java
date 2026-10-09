package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35667a;

    public b1(String str) {
        this.f35667a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return kotlin.jvm.internal.m.a(this.f35667a, ((b1) obj).f35667a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35667a.hashCode();
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f35667a, ')');
    }
}
