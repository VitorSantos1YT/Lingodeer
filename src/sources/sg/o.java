package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51654c;

    public o(String str, String str2, String str3) {
        this.f51652a = str;
        this.f51653b = str2;
        this.f51654c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f51652a, oVar.f51652a) && kotlin.jvm.internal.m.a(this.f51653b, oVar.f51653b) && kotlin.jvm.internal.m.a(this.f51654c, oVar.f51654c);
    }

    public final int hashCode() {
        return this.f51654c.hashCode() + defpackage.e.d(this.f51652a.hashCode() * 31, 31, this.f51653b);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.s("AstLinkReferenceDefinition(label=", this.f51652a, ", destination=", this.f51653b, ", title="), this.f51654c, ")");
    }
}
