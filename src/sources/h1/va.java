package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class va extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f31206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31207b;

    public va(h0.i iVar, boolean z11) {
        this.f31206a = iVar;
        this.f31207b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return kotlin.jvm.internal.m.a(this.f31206a, vaVar.f31206a) && this.f31207b == vaVar.f31207b;
    }

    @Override // y2.d1
    public final z1.q f() {
        ya yaVar = new ya();
        yaVar.Q = this.f31206a;
        yaVar.R = this.f31207b;
        yaVar.V = Float.NaN;
        yaVar.W = Float.NaN;
        return yaVar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31207b) + (this.f31206a.hashCode() * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ya yaVar = (ya) qVar;
        yaVar.Q = this.f31206a;
        boolean z11 = yaVar.R;
        boolean z12 = this.f31207b;
        if (z11 != z12) {
            y2.f.n(yaVar);
        }
        yaVar.R = z12;
        if (yaVar.U == null && !Float.isNaN(yaVar.W)) {
            yaVar.U = b0.e.a(yaVar.W);
        }
        if (yaVar.T != null || Float.isNaN(yaVar.V)) {
            return;
        }
        yaVar.T = b0.e.a(yaVar.V);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThumbElement(interactionSource=");
        sb2.append(this.f31206a);
        sb2.append(", checked=");
        return ep.a.l(sb2, this.f31207b, ')');
    }
}
