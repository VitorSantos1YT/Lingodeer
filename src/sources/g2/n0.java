package g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2.d f28587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f28588g;

    public n0(f2.d dVar) {
        k kVarA;
        this.f28587f = dVar;
        if (com.bumptech.glide.f.C(dVar)) {
            kVarA = null;
        } else {
            kVarA = o.a();
            p0.c(kVarA, dVar);
        }
        this.f28588g = kVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return kotlin.jvm.internal.m.a(this.f28587f, ((n0) obj).f28587f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28587f.hashCode();
    }

    @Override // g2.f0
    public final f2.c p() {
        f2.d dVar = this.f28587f;
        return new f2.c(dVar.f26576a, dVar.f26577b, dVar.f26578c, dVar.f26579d);
    }
}
