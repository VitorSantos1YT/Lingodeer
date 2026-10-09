package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f35448a = new a2(i.f35303a, z1.c.L);

    public static final a2 a(f fVar, z1.i iVar, l1.n nVar, int i11) {
        if (kotlin.jvm.internal.m.a(fVar, i.f35303a) && kotlin.jvm.internal.m.a(iVar, z1.c.L)) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(-1073795767);
            sVar.p(false);
            return f35448a;
        }
        l1.s sVar2 = (l1.s) nVar;
        sVar2.d0(-1073744896);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar2.f(fVar)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar2.f(iVar)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objQ = sVar2.Q();
        if (z13 || objQ == l1.m.f39353a) {
            objQ = new a2(fVar, iVar);
            sVar2.o0(objQ);
        }
        a2 a2Var = (a2) objQ;
        sVar2.p(false);
        return a2Var;
    }
}
