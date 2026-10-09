package jr;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.z1;
import l1.b3;
import l1.q1;
import w2.q0;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36729a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f36732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36734f;

    public /* synthetic */ y(int i11, int i12, long j11, g2.x[] xVarArr, b3 b3Var) {
        this.f36730b = i11;
        this.f36731c = i12;
        this.f36732d = j11;
        this.f36733e = xVarArr;
        this.f36734f = b3Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        long j11;
        String[] strArr;
        int i11 = this.f36729a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f36734f;
        Object obj5 = this.f36733e;
        int i12 = this.f36731c;
        switch (i11) {
            case 0:
                fz.e eVar = (fz.e) obj5;
                fz.a aVar = (fz.a) obj4;
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    k2.b bVarY = se.k.y(R.drawable.ic_lesson_setting_btn, sVar, 0);
                    boolean zF = sVar.f(eVar);
                    int i13 = this.f36730b;
                    boolean zD = zF | sVar.d(i13);
                    long j12 = this.f36732d;
                    boolean zE = zD | sVar.e(j12);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zE || objQ == gVar) {
                        objQ = new s(i13, j12, 0, eVar);
                        sVar.o0(objQ);
                    }
                    z1.o oVar = z1.o.f58481a;
                    d0.n.c(bVarY, null, e2.n(iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
                    if (i12 != -1) {
                        sVar.d0(-149678310);
                        j0.c.g(sVar, e2.s(oVar, 8));
                        boolean zF2 = sVar.f(aVar);
                        Object objQ2 = sVar.Q();
                        if (zF2 || objQ2 == gVar) {
                            objQ2 = new m(7, aVar);
                            sVar.o0(objQ2);
                        }
                        z11 = false;
                        p2.a(i12, 0, (fz.a) objQ2, sVar);
                    } else {
                        z11 = false;
                        sVar.d0(-157192834);
                    }
                    sVar.p(z11);
                    j0.c.g(sVar, e2.s(oVar, 12));
                }
                break;
            default:
                g2.x[] xVarArr = (g2.x[]) obj5;
                b3 b3Var = (b3) obj4;
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    float f5 = 12;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarB = j0.c.B(oVar2, f5, 22);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
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
                    l1.t.J(hVar, uVarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, oVar2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    z1.r rVarN = e2.n(oVar2, 32);
                    if (g2.x.d(xVarArr[i12].f28624a, g2.x.f28621h)) {
                        z12 = false;
                        sVar2.d0(83471190);
                        j11 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                        sVar2.p(false);
                    } else {
                        sVar2.d0(83347593);
                        z12 = false;
                        sVar2.p(false);
                        j11 = xVarArr[i12].f28624a;
                    }
                    z1.r rVarH = d0.n.h(rVarN, j11, r0.f.f48733a);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, z12);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarH);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar2);
                    l1.t.J(hVar2, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar2);
                    int[] iArr = bq.r.f4959a;
                    int i14 = this.f36730b;
                    switch (i14) {
                        case 1:
                            strArr = bq.r.f4965g;
                            break;
                        case 2:
                            strArr = bq.r.f4966h;
                            break;
                        case 3:
                            strArr = bq.r.f4960b;
                            break;
                        case 4:
                            strArr = bq.r.f4961c;
                            break;
                        case 5:
                            strArr = bq.r.f4962d;
                            break;
                        case 6:
                            strArr = bq.r.f4963e;
                            break;
                        case 7:
                            strArr = bq.r.f4967i;
                            break;
                        case 8:
                            strArr = bq.r.f4964f;
                            break;
                        case 9:
                            strArr = bq.r.f4969k;
                            break;
                        case 10:
                            strArr = bq.r.f4968j;
                            break;
                        default:
                            strArr = bq.r.f4960b;
                            break;
                    }
                    String strG1 = oz.q.g1(1, strArr[i12]);
                    long jA = j3.A(16);
                    n3.s sVar3 = n3.s.L;
                    long j13 = this.f36732d;
                    ua.b(strG1, null, j13, jA, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199680, 0, 131026);
                    sVar2.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar2);
                    d0.n.c(se.k.y(R.drawable.ic_user_review_star, sVar2, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, ((MergedBillingThemeBillingPage) b3Var.getValue()).getColorUserReviewStar().length() > 0 ? new g2.p(j3.w(((MergedBillingThemeBillingPage) b3Var.getValue()).getColorUserReviewStar()), 5) : null, sVar2, 56, 60);
                    sVar2.p(true);
                    ua.b(bq.m.f(i14)[i12], d0.n.y(j0.c.C(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), d0.n.u(sVar2), true, 12), j13, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131064);
                    sVar2.p(true);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ y(fz.e eVar, int i11, long j11, int i12, fz.a aVar) {
        this.f36733e = eVar;
        this.f36730b = i11;
        this.f36732d = j11;
        this.f36731c = i12;
        this.f36734f = aVar;
    }
}
