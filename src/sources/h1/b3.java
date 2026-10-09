package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(String str, String str2, int i11) {
        super(2);
        this.f30025a = i11;
        this.f30026b = str;
        this.f30027c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        String str;
        boolean zF;
        Object objQ;
        l1.s sVar2;
        String str2;
        boolean zF2;
        Object objQ2;
        switch (this.f30025a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        sVar = (l1.s) nVar;
                        String str3 = this.f30026b;
                        boolean zF3 = sVar.f(str3);
                        str = this.f30027c;
                        zF = zF3 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new a3(this.f30026b, str, 0);
                            sVar.o0(objQ);
                        }
                        ua.b(str3, g3.r.b(z1.o.f58481a, false, (fz.c) objQ), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131068);
                    }
                } else {
                    sVar = (l1.s) nVar;
                    String str4 = this.f30026b;
                    boolean zF4 = sVar.f(str4);
                    str = this.f30027c;
                    zF = zF4 | sVar.f(str);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new a3(this.f30026b, str, 0);
                        sVar.o0(objQ);
                    } else {
                        objQ = new a3(this.f30026b, str, 0);
                        sVar.o0(objQ);
                    }
                    ua.b(str4, g3.r.b(z1.o.f58481a, false, (fz.c) objQ), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131068);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar4 = (l1.s) nVar2;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        sVar2 = (l1.s) nVar2;
                        String str5 = this.f30026b;
                        boolean zF5 = sVar2.f(str5);
                        str2 = this.f30027c;
                        zF2 = zF5 | sVar2.f(str2);
                        objQ2 = sVar2.Q();
                        if (zF2 || objQ2 == l1.m.f39353a) {
                            objQ2 = new a3(this.f30026b, str2, 1);
                            sVar2.o0(objQ2);
                        }
                        ua.b(str5, g3.r.b(z1.o.f58481a, false, (fz.c) objQ2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131068);
                    }
                } else {
                    sVar2 = (l1.s) nVar2;
                    String str6 = this.f30026b;
                    boolean zF6 = sVar2.f(str6);
                    str2 = this.f30027c;
                    zF2 = zF6 | sVar2.f(str2);
                    objQ2 = sVar2.Q();
                    if (zF2) {
                        objQ2 = new a3(this.f30026b, str2, 1);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new a3(this.f30026b, str2, 1);
                        sVar2.o0(objQ2);
                    }
                    ua.b(str6, g3.r.b(z1.o.f58481a, false, (fz.c) objQ2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131068);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
