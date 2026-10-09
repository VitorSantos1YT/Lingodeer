package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f43741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.i f43742b;

    public z(rz.b0 scope, e1 parent) {
        kotlin.jvm.internal.m.f(scope, "scope");
        kotlin.jvm.internal.m.f(parent, "parent");
        this.f43741a = parent;
        uz.i src = parent.f43548a;
        kotlin.jvm.internal.m.f(src, "src");
        kotlin.jvm.internal.m.f(scope, "scope");
        a9.i iVar = new a9.i();
        iVar.f517a = new ij.d(14);
        uz.w0 w0VarA = uz.x0.a(1, Integer.MAX_VALUE, tz.a.SUSPEND);
        iVar.f518b = w0VarA;
        vy.d dVar = null;
        iVar.f519c = new uz.n1(w0VarA, new kr.w(iVar, dVar, 16));
        rz.z1 z1VarB = rz.e0.B(scope, null, rz.d0.LAZY, new kb.e(24, src, iVar, dVar), 1);
        z1VarB.invokeOnCompletion(new a0.o0(iVar, 25));
        iVar.f520d = z1VarB;
        iVar.f521e = new gp.r(new kb.e(iVar, dVar, 23));
        this.f43742b = iVar;
    }
}
