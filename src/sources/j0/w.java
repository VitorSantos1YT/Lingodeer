package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements x2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f35430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2 f35431b;

    public w(fz.c cVar) {
        this.f35430a = cVar;
    }

    @Override // x2.c
    public final void e(x2.g gVar) {
        n2 n2Var = (n2) gVar.a(c.f35256c);
        if (kotlin.jvm.internal.m.a(n2Var, this.f35431b)) {
            return;
        }
        this.f35431b = n2Var;
        this.f35430a.invoke(n2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && ((w) obj).f35430a == this.f35430a;
    }

    public final int hashCode() {
        return this.f35430a.hashCode();
    }
}
