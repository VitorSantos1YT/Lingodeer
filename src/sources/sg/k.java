package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51648b;

    public k(String str, String destination) {
        kotlin.jvm.internal.m.f(destination, "destination");
        this.f51647a = str;
        this.f51648b = destination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f51647a, kVar.f51647a) && kotlin.jvm.internal.m.a(this.f51648b, kVar.f51648b);
    }

    public final int hashCode() {
        return this.f51648b.hashCode() + (this.f51647a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("AstImage(title=", this.f51647a, ", destination=", this.f51648b, ")");
    }
}
