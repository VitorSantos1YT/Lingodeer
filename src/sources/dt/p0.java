package dt;

import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 implements fz.f {
    public final /* synthetic */ j3.w0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.c f24072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns.v f24074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f24076f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f24077t;

    public /* synthetic */ p0(v3.c cVar, float f5, ns.v vVar, int i11, j3.y0 y0Var, j3.y0 y0Var2, j3.w0 w0Var, int i12) {
        this.f24071a = i12;
        this.f24072b = cVar;
        this.f24073c = f5;
        this.f24074d = vVar;
        this.f24075e = i11;
        this.f24076f = y0Var;
        this.f24077t = y0Var2;
        this.H = w0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f5;
        Object lVar;
        qy.l lVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f24071a) {
            case 0:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j0.c.a(j0.e2.e(z1.o.f58481a, 1.0f), null, t1.e.d(1063997805, new p0(this.f24072b, this.f24073c, this.f24074d, this.f24075e, this.f24076f, this.f24077t, this.H, 1), sVar), sVar, 3078, 6);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            default:
                j0.s BoxWithConstraints = (j0.s) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(BoxWithConstraints) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float fC = BoxWithConstraints.c();
                    v3.c cVar = this.f24072b;
                    float fE0 = cVar.e0(fC);
                    float f11 = this.f24073c;
                    float f12 = (fE0 * 0.7f) - f11;
                    float f13 = f12 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f12;
                    ns.v vVar = this.f24074d;
                    boolean zF = sVar2.f(vVar);
                    int i11 = this.f24075e;
                    boolean zC = sVar2.c(fE0) | zF | sVar2.d(i11);
                    j3.y0 y0Var = this.f24076f;
                    boolean zF2 = zC | sVar2.f(y0Var);
                    j3.y0 y0Var2 = this.f24077t;
                    boolean zF3 = zF2 | sVar2.f(y0Var2) | sVar2.c(f11) | sVar2.f(cVar);
                    Object objQ = sVar2.Q();
                    float f14 = 1.0f;
                    if (zF3 || objQ == l1.m.f39353a) {
                        if (i11 < 2) {
                            lVar = new qy.l(Float.valueOf(0.4f), Float.valueOf(0.6f));
                            f5 = 1.0f;
                        } else {
                            float[] fArr = new float[2];
                            for (int i12 = 0; i12 < 2; i12++) {
                                fArr[i12] = 0.0f;
                            }
                            Iterator it = ry.m.U0(vVar.f44027a, 2).iterator();
                            int i13 = 0;
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                float f15 = f14;
                                j3.w0 w0Var = this.H;
                                if (zHasNext) {
                                    Object next = it.next();
                                    int i14 = i13 + 1;
                                    if (i13 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    float[] fArr2 = fArr;
                                    e.e(f13, w0Var, f11, fArr2, i13, (String) next, y0Var);
                                    f14 = f15;
                                    fArr = fArr2;
                                    i13 = i14;
                                } else {
                                    float[] fArr3 = fArr;
                                    f5 = f15;
                                    Iterator it2 = vVar.f44028b.iterator();
                                    while (it2.hasNext()) {
                                        int i15 = 0;
                                        for (Object obj4 : ry.m.U0((List) it2.next(), 2)) {
                                            int i16 = i15 + 1;
                                            if (i15 < 0) {
                                                ns.o.V();
                                                throw null;
                                            }
                                            e.e(f13, w0Var, f11, fArr3, i15, (String) obj4, y0Var2);
                                            i15 = i16;
                                        }
                                    }
                                    float f16 = fArr3[0];
                                    float f17 = fArr3[1] + f16;
                                    float fK = f17 <= CropImageView.DEFAULT_ASPECT_RATIO ? 0.4f : hz.b.k(f16 / f17, 0.3f, 0.7f);
                                    lVar = new qy.l(Float.valueOf(fK), Float.valueOf(f5 - fK));
                                }
                            }
                        }
                        sVar2.o0(lVar);
                    } else {
                        lVar = objQ;
                        y0Var2 = y0Var2;
                        f5 = 1.0f;
                    }
                    qy.l lVar3 = (qy.l) lVar;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarB = d2.h.b(j0.c.q(j0.e2.e(oVar, f5), j0.e1.Min), r0.f.d(12));
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    z1.r rVarE = j0.e2.e(oVar, f5);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarE);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, uVarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    List list = vVar.f44027a;
                    List list2 = vVar.f44028b;
                    if (list.isEmpty()) {
                        lVar2 = lVar3;
                        z11 = false;
                        sVar2.d0(1289712881);
                    } else {
                        sVar2.d0(1322791431);
                        e.m(vVar.f44027a, i11, lVar3, y0Var, null, sVar2, 0);
                        lVar2 = lVar3;
                        if (list2.isEmpty()) {
                            sVar2 = sVar2;
                            z11 = false;
                            sVar2.d0(1289712881);
                        } else {
                            sVar2 = sVar2;
                            sVar2.d0(1323153046);
                            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, ((h1.s1) sVar2.j(h1.v1.f31180a)).B, sVar2, 0, 3);
                            z11 = false;
                        }
                        sVar2.p(z11);
                    }
                    sVar2.p(z11);
                    sVar2.d0(-234406012);
                    int i17 = 0;
                    for (Object obj5 : list2) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        l1.s sVar3 = sVar2;
                        e.n((List) obj5, i11, lVar2, y0Var2, null, sVar3, 0);
                        sVar2 = sVar3;
                        if (i17 != ns.o.A(list2)) {
                            sVar2.d0(2007515503);
                            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, ((h1.s1) sVar2.j(h1.v1.f31180a)).B, sVar2, 0, 3);
                            z13 = false;
                        } else {
                            z13 = false;
                            sVar2.d0(1973509898);
                        }
                        sVar2.p(z13);
                        i17 = i18;
                    }
                    sVar2.p(false);
                    boolean z14 = true;
                    sVar2.p(true);
                    if (i11 > 1) {
                        sVar2.d0(1456840067);
                        z1.r rVarD = j0.e2.d(oVar, 1.0f);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL3 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar5);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                        float fFloatValue = ((Number) lVar2.f48495a).floatValue();
                        if (fFloatValue <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (fFloatValue > Float.MAX_VALUE) {
                            fFloatValue = Float.MAX_VALUE;
                        }
                        j0.c.g(sVar2, new j0.i1(fFloatValue, true));
                        k7.n(j0.e2.c(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, ((h1.s1) sVar2.j(h1.v1.f31180a)).B, sVar2, 6, 2);
                        float fFloatValue2 = ((Number) lVar2.f48496b).floatValue();
                        if (fFloatValue2 <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z14 = true;
                        j0.c.g(sVar2, new j0.i1(fFloatValue2 <= Float.MAX_VALUE ? fFloatValue2 : Float.MAX_VALUE, true));
                        sVar2.p(true);
                        z12 = false;
                    } else {
                        z12 = false;
                        sVar2.d0(1422624251);
                    }
                    sVar2.p(z12);
                    sVar2.p(z14);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
        }
    }
}
