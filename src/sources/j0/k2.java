package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f35333b;

    public k2(b1 b1Var, String str) {
        this.f35332a = str;
        this.f35333b = l1.t.B(b1Var);
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        return e().f35251b;
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        return e().f35252c;
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        return e().f35250a;
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        return e().f35253d;
    }

    public final b1 e() {
        return (b1) this.f35333b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return kotlin.jvm.internal.m.a(e(), ((k2) obj).e());
        }
        return false;
    }

    public final void f(b1 b1Var) {
        this.f35333b.setValue(b1Var);
    }

    public final int hashCode() {
        return this.f35332a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35332a);
        sb2.append("(left=");
        sb2.append(e().f35250a);
        sb2.append(", top=");
        sb2.append(e().f35251b);
        sb2.append(", right=");
        sb2.append(e().f35252c);
        sb2.append(", bottom=");
        return ep.a.j(sb2, e().f35253d, ')');
    }
}
