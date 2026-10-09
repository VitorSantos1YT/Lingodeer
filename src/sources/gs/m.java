package gs;

import bh.j0;
import bt.p2;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.b2;
import j0.e2;
import j0.u;
import j3.y0;
import java.text.Normalizer;
import java.util.List;
import kotlin.jvm.internal.w;
import l1.b1;
import l1.c3;
import l1.d0;
import l1.q1;
import l1.t;
import qy.b0;
import rt.oe;
import rt.se;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29811c;

    public /* synthetic */ m(Object obj, boolean z11, int i11) {
        this.f29809a = i11;
        this.f29811c = obj;
        this.f29810b = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        b0 b0Var;
        switch (this.f29809a) {
            case 0:
                bs.e eVar = (bs.e) this.f29811c;
                j0.q PressableCard = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard, "$this$PressableCard");
                l1.s sVar = (l1.s) nVar;
                boolean zT = sVar.T(iIntValue & 1, (iIntValue & 17) != 16);
                b0 b0Var2 = b0.f48488a;
                if (!zT) {
                    sVar.W();
                    return b0Var2;
                }
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.o oVar = z1.o.f58481a;
                z1.r rVarC = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                y2.h hVar = y2.j.f56917f;
                t.J(hVar, q0VarD, sVar);
                y2.h hVar2 = y2.j.f56916e;
                t.J(hVar2, q1VarL, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                y2.h hVar4 = y2.j.f56915d;
                t.J(hVar4, rVarC, sVar);
                z1.r rVarD = e2.d(oVar, 1.0f);
                u uVarA = j0.t.a(j0.i.i(-4), z1.c.P, sVar, 54);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarD);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar, uVarA, sVar);
                t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                t.J(hVar4, rVarC2, sVar);
                String str = eVar.f5121a;
                int i11 = eVar.f5122b;
                String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
                kotlin.jvm.internal.m.e(strNormalize, "normalize(...)");
                d0 d0Var = ua.f31167a;
                y0 y0Var = (y0) sVar.j(d0Var);
                c3 c3Var = v1.f31180a;
                ua.b(strNormalize, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, ((s1) sVar.j(c3Var)).f31034q, j3.A(28), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
                l1.s sVar2 = sVar;
                if (i11 != 0) {
                    sVar2.d0(431329366);
                    ua.b(ub.a.e0(sVar2, i11), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(d0Var), ((s1) sVar2.j(c3Var)).f31036s, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar2, 0, 0, 65534);
                    sVar2 = sVar2;
                    z11 = false;
                } else {
                    z11 = false;
                    sVar2.d0(426969898);
                }
                sVar2.p(z11);
                sVar2.p(true);
                z1.r rVarA = j0.r.f35391a.a(j0.c.A(oVar, 4), z1.c.f58465c);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, z11);
                int iHashCode3 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarA);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(hVar, q0VarD2, sVar2);
                t.J(hVar2, q1VarL3, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                }
                t.J(hVar4, rVarC3, sVar2);
                List listL = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar2, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar2, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar2, 0));
                w wVar = new w();
                Object objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = t.B(listL.get(wVar.f38359a));
                    sVar2.o0(objQ);
                }
                b1 b1Var = (b1) objQ;
                if (this.f29810b) {
                    sVar2.d0(858548125);
                    b0Var = b0Var2;
                    t.f(new dt.w(b1Var, listL, wVar, null, 7), b0Var, sVar2);
                    sVar2.p(false);
                } else {
                    b0Var = b0Var2;
                    sVar2.d0(859045396);
                    sVar2.p(false);
                    b1Var.setValue(listL.get(0));
                }
                d0.n.c((k2.b) b1Var.getValue(), null, d2.h.i(oVar, iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar2.j(c3Var)).f31017a, 5), sVar2, 48, 56);
                sVar2.p(true);
                sVar2.p(true);
                return b0Var;
            case 1:
                bs.c cVar = (bs.c) this.f29811c;
                j0.q PressableCard2 = (j0.q) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard2, "$this$PressableCard");
                l1.s sVar3 = (l1.s) nVar2;
                boolean zT2 = sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16);
                b0 b0Var3 = b0.f48488a;
                if (zT2) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC4 = j0.c.C(e2.d(oVar2, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL4 = sVar3.l();
                    z1.r rVarC5 = z1.a.c(sVar3, rVarC4);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD3, sVar3);
                    t.J(y2.j.f56916e, q1VarL4, sVar3);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar5);
                    }
                    t.J(y2.j.f56915d, rVarC5, sVar3);
                    List listL2 = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar3, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar3, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar3, 0));
                    w wVar2 = new w();
                    Object objQ2 = sVar3.Q();
                    if (objQ2 == l1.m.f39353a) {
                        objQ2 = t.B(listL2.get(wVar2.f38359a));
                        sVar3.o0(objQ2);
                    }
                    b1 b1Var2 = (b1) objQ2;
                    if (!this.f29810b || cVar.f5117f.length() <= 0) {
                        sVar3.d0(502664841);
                        sVar3.p(false);
                        b1Var2.setValue(listL2.get(0));
                    } else {
                        sVar3.d0(502167570);
                        t.f(new dt.w(b1Var2, listL2, wVar2, null, 6), b0Var3, sVar3);
                        sVar3.p(false);
                    }
                    d0.n.c((k2.b) b1Var2.getValue(), null, d2.h.i(e2.n(oVar2, 42), iu.k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar3.j(v1.f31180a)).f31017a, 5), sVar3, 48, 56);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return b0Var3;
            case 2:
                oe oeVar = (oe) this.f29811c;
                b2 TextButton = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mt.b1.g(oeVar, this.f29810b, sVar4, 0);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 3:
                se seVar = (se) this.f29811c;
                b2 OutlinedButton = (b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(OutlinedButton) ? 4 : 2;
                }
                l1.s sVar5 = (l1.s) nVar4;
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    k2.b bVarY = se.k.y(R.drawable.calendar_month_24px, sVar5, 0);
                    z1.o oVar3 = z1.o.f58481a;
                    r4.b(bVarY, null, e2.n(oVar3, 20), 0L, sVar5, 432, 8);
                    j0.c.g(sVar5, e2.s(oVar3, 4));
                    mt.v1.c(seVar, OutlinedButton.a(oVar3, 1.0f), sVar5, 0);
                    r4.b(se.k.y(this.f29810b ? R.drawable.keyboard_arrow_up_24px : R.drawable.keyboard_arrow_down_24px, sVar5, 0), null, e2.n(oVar3, 18), 0L, sVar5, 432, 8);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 4:
                fz.a aVar = (fz.a) this.f29811c;
                z1.r composed = (z1.r) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(composed, "$this$composed");
                l1.s sVar6 = (l1.s) ((l1.n) obj2);
                sVar6.d0(1783426328);
                Object objQ3 = sVar6.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ3 == gVar) {
                    objQ3 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                    sVar6.o0(objQ3);
                }
                b0.d dVar = (b0.d) objQ3;
                boolean z12 = this.f29810b;
                Boolean boolValueOf = Boolean.valueOf(z12);
                boolean zG = sVar6.g(z12) | sVar6.h(dVar) | sVar6.f(aVar);
                Object objQ4 = sVar6.Q();
                if (zG || objQ4 == gVar) {
                    j0 j0Var = new j0(z12, dVar, aVar, (vy.d) null, 11);
                    sVar6.o0(j0Var);
                    objQ4 = j0Var;
                }
                t.f((fz.e) objQ4, boolValueOf, sVar6);
                boolean zH = sVar6.h(dVar);
                Object objQ5 = sVar6.Q();
                if (zH || objQ5 == gVar) {
                    objQ5 = new p2(dVar, 1);
                    sVar6.o0(objQ5);
                }
                z1.r rVarQ = f0.q(composed, (fz.c) objQ5);
                sVar6.p(false);
                return rVarQ;
            default:
                MergedBillingThemeBillingPage mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) this.f29811c;
                j0.q BillingSellAnnuallyCard = (j0.q) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BillingSellAnnuallyCard, "$this$BillingSellAnnuallyCard");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar5).f(BillingSellAnnuallyCard) ? 4 : 2;
                }
                l1.s sVar7 = (l1.s) nVar5;
                if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (this.f29810b) {
                        sVar7.d0(605285432);
                        yg.o.d(j3.w(mergedBillingThemeBillingPage.getColorOthersCheckedIcon()), j3.w(mergedBillingThemeBillingPage.getColorOthersCheckedIconBg()), e2.n(j0.c.E(BillingSellAnnuallyCard.a(z1.o.f58481a, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 5, 12, CropImageView.DEFAULT_ASPECT_RATIO, 9), 21), sVar7, 0);
                    } else {
                        sVar7.d0(555462480);
                    }
                    sVar7.p(false);
                } else {
                    sVar7.W();
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ m(boolean z11, Object obj, int i11) {
        this.f29809a = i11;
        this.f29810b = z11;
        this.f29811c = obj;
    }
}
