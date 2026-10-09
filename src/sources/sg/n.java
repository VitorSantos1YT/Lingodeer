package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51651b;

    public n(String destination, String str) {
        kotlin.jvm.internal.m.f(destination, "destination");
        this.f51650a = destination;
        this.f51651b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f51650a, nVar.f51650a) && kotlin.jvm.internal.m.a(this.f51651b, nVar.f51651b);
    }

    public final int hashCode() {
        return this.f51651b.hashCode() + (this.f51650a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("AstLink(destination=", this.f51650a, ", title=", this.f51651b, ")");
    }
}
