package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f3712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f3713b = l1.t.B(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f3714c;

    public v1(c2 c2Var, j2 j2Var, String str) {
        this.f3714c = c2Var;
        this.f3712a = j2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u1 a(fz.c cVar, fz.c cVar2) {
        l1.k1 k1Var = this.f3713b;
        u1 u1Var = (u1) k1Var.getValue();
        c2 c2Var = this.f3714c;
        if (u1Var == null) {
            Object objInvoke = cVar2.invoke(c2Var.f3458a.Y());
            Object objInvoke2 = cVar2.invoke(c2Var.f3458a.Y());
            j2 j2Var = this.f3712a;
            s sVar = (s) j2Var.f3575a.invoke(objInvoke2);
            sVar.d();
            y1 y1Var = new y1(c2Var, objInvoke, sVar, j2Var);
            u1Var = new u1(this, y1Var, cVar, cVar2);
            k1Var.setValue(u1Var);
            c2Var.f3466i.add(y1Var);
        }
        u1Var.f3702c = (kotlin.jvm.internal.n) cVar2;
        u1Var.f3701b = cVar;
        u1Var.b(c2Var.f());
        return u1Var;
    }
}
