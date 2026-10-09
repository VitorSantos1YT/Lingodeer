package bt;

import h1.ua;
import java.util.List;
import rt.m8;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r1 implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f5922f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5923t;

    public /* synthetic */ r1(l1.b1 b1Var, boolean z11, boolean z12, l1.b1 b1Var2, fz.e eVar, rz.b0 b0Var, Object obj, int i11) {
        this.f5917a = i11;
        this.f5918b = b1Var;
        this.f5919c = z11;
        this.f5920d = z12;
        this.f5921e = b1Var2;
        this.f5922f = eVar;
        this.f5923t = b0Var;
        this.H = obj;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5917a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5918b;
                l1.b1 b1Var2 = (l1.b1) this.f5921e;
                fz.e eVar = (fz.e) this.f5922f;
                rz.b0 b0Var = (rz.b0) this.f5923t;
                jt.h0 h0Var = (jt.h0) this.H;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long jC = ct.c.c(sVar);
                    j3.y0 y0VarB = ct.c.b(sVar);
                    boolean zE = sVar.e(jC);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zE || objQ == gVar) {
                        objQ = l1.t.B(j3.y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                        sVar.o0(objQ);
                    }
                    l1.b1 b1Var3 = (l1.b1) objQ;
                    List list = (List) b1Var.getValue();
                    boolean z11 = this.f5920d;
                    boolean zG = sVar.g(z11) | sVar.f(b1Var2) | sVar.f(eVar) | sVar.h(b0Var) | sVar.h(h0Var);
                    Object objQ2 = sVar.Q();
                    if (zG || objQ2 == gVar) {
                        o1 o1Var = new o1(z11, b1Var2, eVar, b0Var, h0Var, 0);
                        sVar.o0(o1Var);
                        objQ2 = o1Var;
                    }
                    b.y(list, b1Var3, this.f5919c, null, null, false, null, 0, false, null, (fz.c) objQ2, sVar, 0, 0, 1016);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.b1 b1Var4 = (l1.b1) this.f5918b;
                l1.b1 b1Var5 = (l1.b1) this.f5921e;
                fz.e eVar2 = (fz.e) this.f5922f;
                rz.b0 b0Var2 = (rz.b0) this.f5923t;
                jt.q1 q1Var = (jt.q1) this.H;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j3.y0 y0Var = (j3.y0) sVar2.j(ua.f31167a);
                    long jC2 = ct.c.c(sVar2);
                    boolean zE2 = sVar2.e(jC2);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zE2 || objQ3 == gVar2) {
                        objQ3 = l1.t.B(j3.y0.a(y0Var, 0L, jC2, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                        sVar2.o0(objQ3);
                    }
                    l1.b1 b1Var6 = (l1.b1) objQ3;
                    List list2 = (List) b1Var4.getValue();
                    boolean z12 = this.f5920d;
                    boolean zG2 = sVar2.g(z12) | sVar2.f(b1Var5) | sVar2.f(eVar2) | sVar2.h(b0Var2) | sVar2.h(q1Var);
                    Object objQ4 = sVar2.Q();
                    if (zG2 || objQ4 == gVar2) {
                        o1 o1Var2 = new o1(z12, b1Var5, eVar2, b0Var2, q1Var, 1);
                        sVar2.o0(o1Var2);
                        objQ4 = o1Var2;
                    }
                    b.y(list2, b1Var6, this.f5919c, null, null, false, null, 0, false, null, (fz.c) objQ4, sVar2, 0, 0, 1016);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                mt.f6.e((x8) this.f5918b, this.f5919c, this.f5920d, (m8) this.f5921e, (fz.a) this.f5923t, (fz.e) this.f5922f, (fz.a) this.H, (l1.n) obj, l1.t.M(4097));
                break;
            default:
                ((Integer) obj2).getClass();
                mt.f6.h((rt.k6) this.f5918b, (fz.f) this.f5921e, (fz.c) this.f5922f, (fz.c) this.f5923t, this.f5919c, (fz.c) this.H, this.f5920d, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ r1(rt.k6 k6Var, fz.f fVar, fz.c cVar, fz.c cVar2, boolean z11, fz.c cVar3, boolean z12, int i11) {
        this.f5917a = 3;
        this.f5918b = k6Var;
        this.f5921e = fVar;
        this.f5922f = cVar;
        this.f5923t = cVar2;
        this.f5919c = z11;
        this.H = cVar3;
        this.f5920d = z12;
    }

    public /* synthetic */ r1(x8 x8Var, boolean z11, boolean z12, m8 m8Var, fz.a aVar, fz.e eVar, fz.a aVar2, int i11) {
        this.f5917a = 2;
        this.f5918b = x8Var;
        this.f5919c = z11;
        this.f5920d = z12;
        this.f5921e = m8Var;
        this.f5923t = aVar;
        this.f5922f = eVar;
        this.H = aVar2;
    }
}
