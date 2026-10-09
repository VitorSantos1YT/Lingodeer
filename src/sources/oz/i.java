package oz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lz.g f46164b;

    public i(String str, lz.g gVar) {
        this.f46163a = str;
        this.f46164b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f46163a, iVar.f46163a) && kotlin.jvm.internal.m.a(this.f46164b, iVar.f46164b);
    }

    public final int hashCode() {
        return this.f46164b.hashCode() + (this.f46163a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f46163a + ", range=" + this.f46164b + ')';
    }
}
