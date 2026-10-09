package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class x extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.i f22824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f22825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g3.k f22829f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fz.a f22830t;

    public x(h0.i iVar, g1 g1Var, boolean z11, boolean z12, String str, g3.k kVar, fz.a aVar) {
        this.f22824a = iVar;
        this.f22825b = g1Var;
        this.f22826c = z11;
        this.f22827d = z12;
        this.f22828e = str;
        this.f22829f = kVar;
        this.f22830t = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.f22824a, xVar.f22824a) && kotlin.jvm.internal.m.a(this.f22825b, xVar.f22825b) && this.f22826c == xVar.f22826c && this.f22827d == xVar.f22827d && kotlin.jvm.internal.m.a(this.f22828e, xVar.f22828e) && kotlin.jvm.internal.m.a(this.f22829f, xVar.f22829f) && this.f22830t == xVar.f22830t;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new z(this.f22824a, this.f22825b, this.f22826c, this.f22827d, this.f22828e, this.f22829f, this.f22830t);
    }

    public final int hashCode() {
        h0.i iVar = this.f22824a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        g1 g1Var = this.f22825b;
        int iE = defpackage.e.e(defpackage.e.e((iHashCode + (g1Var != null ? g1Var.hashCode() : 0)) * 31, 31, this.f22826c), 31, this.f22827d);
        String str = this.f22828e;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        g3.k kVar = this.f22829f;
        return this.f22830t.hashCode() + ((iHashCode2 + (kVar != null ? Integer.hashCode(kVar.f28656a) : 0)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((z) qVar).f1(this.f22824a, this.f22825b, this.f22826c, this.f22827d, this.f22828e, this.f22829f, this.f22830t);
    }
}
