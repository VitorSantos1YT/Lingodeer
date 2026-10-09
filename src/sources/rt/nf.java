package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f50159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of f50160b;

    public nf(n0 content, of origin) {
        kotlin.jvm.internal.m.f(content, "content");
        kotlin.jvm.internal.m.f(origin, "origin");
        this.f50159a = content;
        this.f50160b = origin;
    }

    public static nf a(nf nfVar, of origin) {
        n0 content = nfVar.f50159a;
        kotlin.jvm.internal.m.f(content, "content");
        kotlin.jvm.internal.m.f(origin, "origin");
        return new nf(content, origin);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf)) {
            return false;
        }
        nf nfVar = (nf) obj;
        return kotlin.jvm.internal.m.a(this.f50159a, nfVar.f50159a) && this.f50160b == nfVar.f50160b;
    }

    public final int hashCode() {
        return this.f50160b.hashCode() + (this.f50159a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewSessionCard(content=" + this.f50159a + ", origin=" + this.f50160b + ")";
    }
}
