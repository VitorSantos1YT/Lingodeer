package k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements c6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f37941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f37942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f37943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f37944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f37945f;

    public o(n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6) {
        this.f37940a = nVar;
        this.f37941b = nVar2;
        this.f37942c = nVar3;
        this.f37943d = nVar4;
        this.f37944e = nVar5;
        this.f37945f = nVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f37940a, oVar.f37940a) && kotlin.jvm.internal.m.a(this.f37941b, oVar.f37941b) && kotlin.jvm.internal.m.a(this.f37942c, oVar.f37942c) && kotlin.jvm.internal.m.a(this.f37943d, oVar.f37943d) && kotlin.jvm.internal.m.a(this.f37944e, oVar.f37944e) && kotlin.jvm.internal.m.a(this.f37945f, oVar.f37945f);
    }

    public final int hashCode() {
        return this.f37945f.hashCode() + ((this.f37944e.hashCode() + ((this.f37943d.hashCode() + ((this.f37942c.hashCode() + ((this.f37941b.hashCode() + (this.f37940a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f37940a + ", start=" + this.f37941b + ", top=" + this.f37942c + ", right=" + this.f37943d + ", end=" + this.f37944e + ", bottom=" + this.f37945f + ')';
    }
}
