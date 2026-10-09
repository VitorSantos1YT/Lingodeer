package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.s f30211b;

    public e8(boolean z11, v3.c cVar, f8 f8Var, fz.c cVar2) {
        this.f30210a = z11;
        if (z11 && f8Var == f8.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f30211b = new ob.s(f8Var, new d8(cVar, 0), new a0.c0(cVar, 8), b8.f30045b, cVar2);
    }

    public static Object a(e8 e8Var, f8 f8Var, xy.i iVar) {
        ob.s sVar = e8Var.f30211b;
        Object objC = i1.p.c(sVar, f8Var, ((l1.g1) sVar.f44885k).l(), iVar);
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }

    public final Object b(xy.i iVar) {
        Object objA = a(this, f8.Hidden, iVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    public final boolean c() {
        return ((l1.k1) this.f30211b.f44881g).getValue() != f8.Hidden;
    }

    public final Object d(xy.i iVar) {
        if (this.f30210a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, f8.PartiallyExpanded, iVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }
}
