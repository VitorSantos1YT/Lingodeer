package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.c2 f124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.p f128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1.d f129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0.c2 c2Var, Object obj, fz.c cVar, y yVar, x1.p pVar, t1.d dVar) {
        super(2);
        this.f124a = c2Var;
        this.f125b = obj;
        this.f126c = cVar;
        this.f127d = yVar;
        this.f128e = pVar;
        this.f129f = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objQ = sVar.Q();
            fz.c cVar = this.f126c;
            y yVar = this.f127d;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = (p0) cVar.invoke(yVar);
                sVar.o0(objQ);
            }
            p0 p0Var = (p0) objQ;
            b0.c2 c2Var = this.f124a;
            b0.w1 w1VarF = c2Var.f();
            l1.k1 k1Var = c2Var.f3461d;
            Object objC = w1VarF.c();
            Object obj3 = this.f125b;
            boolean zG = sVar.g(kotlin.jvm.internal.m.a(objC, obj3));
            Object objQ2 = sVar.Q();
            if (zG || objQ2 == gVar) {
                objQ2 = kotlin.jvm.internal.m.a(c2Var.f().c(), obj3) ? m1.f141b : ((p0) cVar.invoke(yVar)).f163b;
                sVar.o0(objQ2);
            }
            m1 m1Var = (m1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new s(kotlin.jvm.internal.m.a(obj3, k1Var.getValue()));
                sVar.o0(objQ3);
            }
            s sVar2 = (s) objQ3;
            l1 l1Var = p0Var.f162a;
            boolean zH = sVar.h(p0Var);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new f(p0Var, 0);
                sVar.o0(objQ4);
            }
            z1.r rVarK = w2.a0.k(z1.o.f58481a, (fz.f) objQ4);
            sVar2.f179a.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a(obj3, k1Var.getValue())));
            z1.r rVarI = rVarK.i(sVar2);
            boolean zH2 = sVar.h(obj3);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                objQ5 = new g(obj3, 0);
                sVar.o0(objQ5);
            }
            fz.c cVar2 = (fz.c) objQ5;
            boolean zF = sVar.f(m1Var);
            Object objQ6 = sVar.Q();
            if (zF || objQ6 == gVar) {
                objQ6 = new h(m1Var, 0);
                sVar.o0(objQ6);
            }
            j0.a(this.f124a, cVar2, rVarI, l1Var, m1Var, (fz.e) objQ6, t1.e.d(-143346359, new k(this.f128e, obj3, yVar, this.f129f, 0), sVar), sVar, 12582912);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
