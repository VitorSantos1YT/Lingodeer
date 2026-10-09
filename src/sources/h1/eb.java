package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class eb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f30216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(n nVar, boolean z11) {
        super(2);
        this.f30216a = nVar;
        this.f30217b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11;
        int i12;
        l1.s sVar;
        boolean zD;
        Object objQ;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                i11 = wb.f31270j.f56783b;
                for (i12 = 0; i12 < i11; i12++) {
                    int iC = wb.f31270j.c(i12);
                    sVar = (l1.s) nVar;
                    zD = sVar.d(i12);
                    objQ = sVar.Q();
                    if (zD || objQ == l1.m.f39353a) {
                        objQ = new e2.o(i12, 4);
                        sVar.o0(objQ);
                    }
                    wb.m(g3.r.b(z1.o.f58481a, false, (fz.c) objQ), this.f30216a, iC, this.f30217b, sVar, 0);
                }
            }
        } else {
            i11 = wb.f31270j.f56783b;
            while (i12 < i11) {
                int iC2 = wb.f31270j.c(i12);
                sVar = (l1.s) nVar;
                zD = sVar.d(i12);
                objQ = sVar.Q();
                if (zD) {
                    objQ = new e2.o(i12, 4);
                    sVar.o0(objQ);
                } else {
                    objQ = new e2.o(i12, 4);
                    sVar.o0(objQ);
                }
                wb.m(g3.r.b(z1.o.f58481a, false, (fz.c) objQ), this.f30216a, iC2, this.f30217b, sVar, 0);
            }
        }
        return qy.b0.f48488a;
    }
}
