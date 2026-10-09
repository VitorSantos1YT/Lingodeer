package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f35245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.c f35246c;

    public a1(n2 n2Var, v3.c cVar) {
        this.f35245b = n2Var;
        this.f35246c = cVar;
    }

    @Override // j0.t1
    public final float a() {
        n2 n2Var = this.f35245b;
        v3.c cVar = this.f35246c;
        return cVar.Q(n2Var.d(cVar));
    }

    @Override // j0.t1
    public final float b(v3.m mVar) {
        n2 n2Var = this.f35245b;
        v3.c cVar = this.f35246c;
        return cVar.Q(n2Var.c(cVar, mVar));
    }

    @Override // j0.t1
    public final float c() {
        n2 n2Var = this.f35245b;
        v3.c cVar = this.f35246c;
        return cVar.Q(n2Var.a(cVar));
    }

    @Override // j0.t1
    public final float d(v3.m mVar) {
        n2 n2Var = this.f35245b;
        v3.c cVar = this.f35246c;
        return cVar.Q(n2Var.b(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f35245b, a1Var.f35245b) && kotlin.jvm.internal.m.a(this.f35246c, a1Var.f35246c);
    }

    public final int hashCode() {
        return this.f35246c.hashCode() + (this.f35245b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f35245b + ", density=" + this.f35246c + ')';
    }
}
