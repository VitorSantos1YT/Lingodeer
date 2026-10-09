package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f35417a = new u(i.f35305c, z1.c.O);

    public static final u a(h hVar, z1.d dVar, l1.n nVar, int i11) {
        if (kotlin.jvm.internal.m.a(hVar, i.f35305c) && kotlin.jvm.internal.m.a(dVar, z1.c.O)) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(-1446569784);
            sVar.p(false);
            return f35417a;
        }
        l1.s sVar2 = (l1.s) nVar;
        sVar2.d0(-1446515937);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar2.f(hVar)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar2.f(dVar)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objQ = sVar2.Q();
        if (z13 || objQ == l1.m.f39353a) {
            objQ = new u(hVar, dVar);
            sVar2.o0(objQ);
        }
        u uVar = (u) objQ;
        sVar2.p(false);
        return uVar;
    }
}
