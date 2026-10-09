package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 implements d0.g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30688c;

    public m7(float f5, long j11, boolean z11) {
        this.f30686a = z11;
        this.f30687b = f5;
        this.f30688c = j11;
    }

    @Override // d0.g1
    public final y2.m b(h0.i iVar) {
        return new w3(iVar, this.f30686a, this.f30687b, new u3(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        if (this.f30686a == m7Var.f30686a && v3.f.b(this.f30687b, m7Var.f30687b)) {
            return g2.x.d(this.f30688c, m7Var.f30688c);
        }
        return false;
    }

    @Override // d0.g1
    public final int hashCode() {
        int iA = defpackage.e.a(Boolean.hashCode(this.f30686a) * 31, this.f30687b, 961);
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30688c) + iA;
    }
}
