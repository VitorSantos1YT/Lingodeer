package e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f24725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f24726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.j f24728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(e0 e0Var, e0 e0Var2, Object obj, int i11, a0.j jVar, int i12) {
        super(1);
        this.f24724a = i12;
        this.f24725b = e0Var;
        this.f24726c = e0Var2;
        this.f24729f = obj;
        this.f24727d = i11;
        this.f24728e = jVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f24724a) {
            case 0:
                w2.d dVar = (w2.d) obj;
                e0 e0Var = this.f24726c;
                if (this.f24725b != ((p) y2.f.y(e0Var).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zC = d.C(e0Var, (e0) this.f24729f, this.f24727d, this.f24728e);
                Boolean boolValueOf = Boolean.valueOf(zC);
                if (zC || !dVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                w2.d dVar2 = (w2.d) obj;
                e0 e0Var2 = this.f24726c;
                if (this.f24725b != ((p) y2.f.y(e0Var2).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zB = d.B(this.f24727d, this.f24728e, e0Var2, (f2.c) this.f24729f);
                Boolean boolValueOf2 = Boolean.valueOf(zB);
                if (zB || !dVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
