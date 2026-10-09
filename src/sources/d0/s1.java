package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.d0 f22800a = new l1.d0(new com.lingo.lingoskill.object.a(29));

    public static final i a(l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.d0(282942128);
        j jVar = (j) sVar.j(f22800a);
        if (jVar == null) {
            sVar.p(false);
            return null;
        }
        boolean zF = sVar.f(jVar);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            i iVar = new i(jVar.f22732a, jVar.f22733b, jVar.f22734c, jVar.f22735d);
            sVar.o0(iVar);
            objQ = iVar;
        }
        i iVar2 = (i) objQ;
        sVar.p(false);
        return iVar2;
    }
}
