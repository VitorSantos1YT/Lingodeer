package mt;

import android.view.ViewTreeObserver;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;
import com.yalantis.ucrop.view.CropImageView;
import h1.i7;
import h1.k7;
import h1.ua;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41284a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f41287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41288e;

    public /* synthetic */ b5(CourseCharacter courseCharacter, boolean z11, boolean z12, fz.a aVar) {
        this.f41288e = courseCharacter;
        this.f41285b = z11;
        this.f41286c = z12;
        this.f41287d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0139  */
    /* JADX WARN: Code duplicated, block: B:24:0x013d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0158  */
    /* JADX WARN: Code duplicated, block: B:32:0x016a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0180  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0207  */
    /* JADX WARN: Code duplicated, block: B:49:0x0241  */
    /* JADX WARN: Code duplicated, block: B:52:0x0265  */
    /* JADX WARN: Code duplicated, block: B:55:0x028e  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qy.b0 b0Var;
        float f5;
        int iHashCode;
        boolean zK0;
        final boolean z11;
        final CourseCharacter courseCharacter;
        boolean zH;
        Object objQ;
        boolean zF;
        Object objQ2;
        ou.c cVar;
        Object objQ3;
        pu.b bVar;
        Object objQ4;
        rz.b0 b0Var2;
        ou.e eVar;
        boolean zF2;
        Object objQ5;
        nu.e eVar2;
        boolean zG;
        Object objQ6;
        int i11 = this.f41284a;
        l1.g gVar = l1.m.f39353a;
        final fz.a aVar = this.f41287d;
        final boolean z12 = this.f41285b;
        int i12 = 2;
        qy.b0 b0Var3 = qy.b0.f48488a;
        Object obj4 = this.f41288e;
        switch (i11) {
            case 0:
                fz.a aVar2 = (fz.a) obj4;
                j0.b2 AppTopAppBar = (j0.b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zG2 = sVar.g(z12) | sVar.f(aVar) | sVar.f(aVar2);
                    Object objQ7 = sVar.Q();
                    if (zG2 || objQ7 == gVar) {
                        objQ7 = new gr.w(z12, aVar, aVar2, 2);
                        sVar.o0(objQ7);
                    }
                    k7.m((fz.a) objQ7, null, this.f41286c, null, null, null, t1.e.d(-578710148, new dt.h(z12, i12), sVar), sVar, 805306368, 506);
                } else {
                    sVar.W();
                }
                return b0Var3;
            case 1:
                String str = (String) obj4;
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.r rVarB = d2.h.b(j0.e2.g(z1.o.f58481a, 42), r0.f.d(12));
                    g3.k kVar = new g3.k(3);
                    boolean z13 = this.f41285b;
                    boolean z14 = this.f41286c;
                    z1.r rVarC = j0.c.C(q0.c.b(rVarB, z13, z14, kVar, this.f41287d, 8), 14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar2);
                    i7.a(z13, null, null, z14, null, sVar2, 48, 52);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return b0Var3;
            default:
                CourseCharacter courseCharacter2 = (CourseCharacter) obj4;
                j0.v Card = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.W();
                    return b0Var3;
                }
                z1.o oVar = z1.o.f58481a;
                float f11 = 8;
                z1.r rVarA = j0.c.A(j0.e2.e(oVar, 1.0f), f11);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar3, 48);
                int iHashCode3 = Long.hashCode(sVar3.T);
                l1.q1 q1VarL2 = sVar3.l();
                z1.r rVarC3 = z1.a.c(sVar3, rVarA);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, uVarA, sVar3);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL2, sVar3);
                y2.h hVar4 = y2.j.f56918g;
                if (!sVar3.S) {
                    b0Var = b0Var3;
                    if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC3, sVar3);
                    ua.b(courseCharacter2.getTranslation(), j0.c.A(oVar, f11), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, k7.w(sVar3).f30177j, sVar3, 48, 0, 65020);
                    k7.g(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(k7.t(sVar3).A, 0.3f), sVar3, 6, 2);
                    float f12 = 32;
                    j0.c.g(sVar3, j0.e2.g(oVar, f12));
                    f5 = 142;
                    z1.r rVarN = j0.e2.n(oVar, f5);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL3 = sVar3.l();
                    z1.r rVarC4 = z1.a.c(sVar3, rVarN);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar3);
                    l1.t.J(hVar3, q1VarL3, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                    }
                    l1.t.J(hVar5, rVarC4, sVar3);
                    zK0 = oz.q.K0(courseCharacter2.getDrillJson());
                    z11 = this.f41286c;
                    if (zK0) {
                        sVar3.d0(1443116351);
                        z1.r rVarN2 = j0.e2.n(oVar, f5);
                        courseCharacter = courseCharacter2;
                        zH = sVar3.h(courseCharacter) | sVar3.g(z12) | sVar3.g(z11) | sVar3.f(aVar);
                        objQ = sVar3.Q();
                        if (zH || objQ == gVar) {
                            objQ = new fz.c() { // from class: vr.d
                                @Override // fz.c
                                public final Object invoke(Object obj5) {
                                    HwView view = (HwView) obj5;
                                    m.f(view, "view");
                                    int width = view.getWidth();
                                    CourseCharacter courseCharacter3 = courseCharacter;
                                    boolean z15 = z12;
                                    boolean z16 = z11;
                                    fz.a aVar3 = aVar;
                                    if (width <= 0 || view.getHeight() <= 0) {
                                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                        viewTreeObserver.addOnGlobalLayoutListener(new f(view, viewTreeObserver, courseCharacter3, z15, z16, aVar3));
                                    } else {
                                        g.b(view, courseCharacter3, z15, z16, aVar3);
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ);
                        }
                        ef.e.c(6, (fz.c) objQ, sVar3, rVarN2);
                        sVar3.p(false);
                    } else {
                        sVar3.d0(1441074567);
                        zF = sVar3.f(courseCharacter2.getDrillJson());
                        objQ2 = sVar3.Q();
                        if (zF || objQ2 == gVar) {
                            h00.s sVar4 = xt.c.f56291a;
                            String drillJson = courseCharacter2.getDrillJson();
                            sVar4.getClass();
                            objQ2 = (ou.c) sVar4.b(ou.c.Companion.serializer(), drillJson);
                            sVar3.o0(objQ2);
                        }
                        cVar = (ou.c) objQ2;
                        objQ3 = sVar3.Q();
                        if (objQ3 == gVar) {
                            objQ3 = new pu.b();
                            sVar3.o0(objQ3);
                        }
                        bVar = (pu.b) objQ3;
                        objQ4 = sVar3.Q();
                        if (objQ4 == gVar) {
                            objQ4 = l1.t.q(sVar3);
                            sVar3.o0(objQ4);
                        }
                        b0Var2 = (rz.b0) objQ4;
                        eVar = new ou.e(ob.f.p(k7.t(sVar3), sVar3), ob.f.l(k7.t(sVar3), sVar3), ob.f.o(k7.t(sVar3), sVar3), ob.f.m(k7.t(sVar3), sVar3), ob.f.n(k7.t(sVar3), sVar3), false, false, false, 1888);
                        zF2 = sVar3.f(cVar) | sVar3.f(b0Var2);
                        objQ5 = sVar3.Q();
                        if (zF2 || objQ5 == gVar) {
                            nu.e eVar3 = new nu.e(bVar, cVar, b0Var2, eVar, new ju.d(25), new okhttp3.b(27, aVar));
                            sVar3.o0(eVar3);
                            objQ5 = eVar3;
                        }
                        eVar2 = (nu.e) objQ5;
                        Boolean boolValueOf = Boolean.valueOf(z12);
                        Boolean boolValueOf2 = Boolean.valueOf(z11);
                        zG = sVar3.g(z12) | sVar3.g(z11) | sVar3.h(eVar2);
                        objQ6 = sVar3.Q();
                        if (zG || objQ6 == gVar) {
                            objQ6 = new vr.e(z12, z11, eVar2, null);
                            sVar3.o0(objQ6);
                        }
                        l1.t.g(boolValueOf, boolValueOf2, (fz.e) objQ6, sVar3);
                        ou.b bVar2 = ou.c.Companion;
                        ub.a.J(cVar, eVar2, null, eVar, sVar3, 72);
                        sVar3.p(false);
                        courseCharacter = courseCharacter2;
                    }
                    sVar3.p(true);
                    j0.c.g(sVar3, j0.e2.g(oVar, f11));
                    ua.b(courseCharacter.getZhuYin(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f12, 7), k7.t(sVar3).f31036s, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, k7.w(sVar3).f30178k, sVar3, 48, 0, 65016);
                    sVar3.p(true);
                    return b0Var;
                }
                b0Var = b0Var3;
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                y2.h hVar6 = y2.j.f56915d;
                l1.t.J(hVar6, rVarC3, sVar3);
                ua.b(courseCharacter2.getTranslation(), j0.c.A(oVar, f11), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, k7.w(sVar3).f30177j, sVar3, 48, 0, 65020);
                k7.g(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(k7.t(sVar3).A, 0.3f), sVar3, 6, 2);
                float f13 = 32;
                j0.c.g(sVar3, j0.e2.g(oVar, f13));
                f5 = 142;
                z1.r rVarN3 = j0.e2.n(oVar, f5);
                w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar3.T);
                l1.q1 q1VarL4 = sVar3.l();
                z1.r rVarC5 = z1.a.c(sVar3, rVarN3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, q0VarD2, sVar3);
                l1.t.J(hVar3, q1VarL4, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                }
                l1.t.J(hVar6, rVarC5, sVar3);
                zK0 = oz.q.K0(courseCharacter2.getDrillJson());
                z11 = this.f41286c;
                if (zK0) {
                    sVar3.d0(1441074567);
                    zF = sVar3.f(courseCharacter2.getDrillJson());
                    objQ2 = sVar3.Q();
                    if (zF) {
                        h00.s sVar5 = xt.c.f56291a;
                        String drillJson2 = courseCharacter2.getDrillJson();
                        sVar5.getClass();
                        objQ2 = (ou.c) sVar5.b(ou.c.Companion.serializer(), drillJson2);
                        sVar3.o0(objQ2);
                    } else {
                        h00.s sVar6 = xt.c.f56291a;
                        String drillJson3 = courseCharacter2.getDrillJson();
                        sVar6.getClass();
                        objQ2 = (ou.c) sVar6.b(ou.c.Companion.serializer(), drillJson3);
                        sVar3.o0(objQ2);
                    }
                    cVar = (ou.c) objQ2;
                    objQ3 = sVar3.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new pu.b();
                        sVar3.o0(objQ3);
                    }
                    bVar = (pu.b) objQ3;
                    objQ4 = sVar3.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.q(sVar3);
                        sVar3.o0(objQ4);
                    }
                    b0Var2 = (rz.b0) objQ4;
                    eVar = new ou.e(ob.f.p(k7.t(sVar3), sVar3), ob.f.l(k7.t(sVar3), sVar3), ob.f.o(k7.t(sVar3), sVar3), ob.f.m(k7.t(sVar3), sVar3), ob.f.n(k7.t(sVar3), sVar3), false, false, false, 1888);
                    zF2 = sVar3.f(cVar) | sVar3.f(b0Var2);
                    objQ5 = sVar3.Q();
                    if (zF2) {
                        nu.e eVar4 = new nu.e(bVar, cVar, b0Var2, eVar, new ju.d(25), new okhttp3.b(27, aVar));
                        sVar3.o0(eVar4);
                        objQ5 = eVar4;
                    } else {
                        nu.e eVar5 = new nu.e(bVar, cVar, b0Var2, eVar, new ju.d(25), new okhttp3.b(27, aVar));
                        sVar3.o0(eVar5);
                        objQ5 = eVar5;
                    }
                    eVar2 = (nu.e) objQ5;
                    Boolean boolValueOf3 = Boolean.valueOf(z12);
                    Boolean boolValueOf4 = Boolean.valueOf(z11);
                    zG = sVar3.g(z12) | sVar3.g(z11) | sVar3.h(eVar2);
                    objQ6 = sVar3.Q();
                    if (zG) {
                        objQ6 = new vr.e(z12, z11, eVar2, null);
                        sVar3.o0(objQ6);
                    } else {
                        objQ6 = new vr.e(z12, z11, eVar2, null);
                        sVar3.o0(objQ6);
                    }
                    l1.t.g(boolValueOf3, boolValueOf4, (fz.e) objQ6, sVar3);
                    ou.b bVar3 = ou.c.Companion;
                    ub.a.J(cVar, eVar2, null, eVar, sVar3, 72);
                    sVar3.p(false);
                    courseCharacter = courseCharacter2;
                } else {
                    sVar3.d0(1443116351);
                    z1.r rVarN4 = j0.e2.n(oVar, f5);
                    courseCharacter = courseCharacter2;
                    zH = sVar3.h(courseCharacter) | sVar3.g(z12) | sVar3.g(z11) | sVar3.f(aVar);
                    objQ = sVar3.Q();
                    if (zH) {
                        objQ = new fz.c() { // from class: vr.d
                            @Override // fz.c
                            public final Object invoke(Object obj5) {
                                HwView view = (HwView) obj5;
                                m.f(view, "view");
                                int width = view.getWidth();
                                CourseCharacter courseCharacter3 = courseCharacter;
                                boolean z15 = z12;
                                boolean z16 = z11;
                                fz.a aVar3 = aVar;
                                if (width <= 0 || view.getHeight() <= 0) {
                                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                    viewTreeObserver.addOnGlobalLayoutListener(new f(view, viewTreeObserver, courseCharacter3, z15, z16, aVar3));
                                } else {
                                    g.b(view, courseCharacter3, z15, z16, aVar3);
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(objQ);
                    } else {
                        objQ = new fz.c() { // from class: vr.d
                            @Override // fz.c
                            public final Object invoke(Object obj5) {
                                HwView view = (HwView) obj5;
                                m.f(view, "view");
                                int width = view.getWidth();
                                CourseCharacter courseCharacter3 = courseCharacter;
                                boolean z15 = z12;
                                boolean z16 = z11;
                                fz.a aVar3 = aVar;
                                if (width <= 0 || view.getHeight() <= 0) {
                                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                    viewTreeObserver.addOnGlobalLayoutListener(new f(view, viewTreeObserver, courseCharacter3, z15, z16, aVar3));
                                } else {
                                    g.b(view, courseCharacter3, z15, z16, aVar3);
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(objQ);
                    }
                    ef.e.c(6, (fz.c) objQ, sVar3, rVarN4);
                    sVar3.p(false);
                }
                sVar3.p(true);
                j0.c.g(sVar3, j0.e2.g(oVar, f11));
                ua.b(courseCharacter.getZhuYin(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, 7), k7.t(sVar3).f31036s, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, k7.w(sVar3).f30178k, sVar3, 48, 0, 65016);
                sVar3.p(true);
                return b0Var;
        }
    }

    public /* synthetic */ b5(boolean z11, fz.a aVar, fz.a aVar2, boolean z12) {
        this.f41285b = z11;
        this.f41287d = aVar;
        this.f41288e = aVar2;
        this.f41286c = z12;
    }

    public /* synthetic */ b5(boolean z11, boolean z12, fz.a aVar, String str) {
        this.f41285b = z11;
        this.f41286c = z12;
        this.f41287d = aVar;
        this.f41288e = str;
    }
}
