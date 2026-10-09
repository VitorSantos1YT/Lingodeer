package h00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00.g f29943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29944c;

    public t(Object body, boolean z11, e00.g gVar) {
        kotlin.jvm.internal.m.f(body, "body");
        this.f29942a = z11;
        this.f29943b = gVar;
        this.f29944c = body.toString();
        if (gVar != null && !gVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // h00.d0
    public final String b() {
        return this.f29944c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f29942a == tVar.f29942a && kotlin.jvm.internal.m.a(this.f29944c, tVar.f29944c);
    }

    public final int hashCode() {
        return this.f29944c.hashCode() + (Boolean.hashCode(this.f29942a) * 31);
    }

    @Override // h00.d0
    public final String toString() {
        boolean z11 = this.f29942a;
        String str = this.f29944c;
        if (!z11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        i00.z.a(sb2, str);
        return sb2.toString();
    }
}
