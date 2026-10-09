package ei;

import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.SaleActivityConfig;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.fa;
import h1.s1;
import h1.v1;
import j0.e2;
import j0.t;
import j0.t1;
import j0.u;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.q1;
import rz.b0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements fz.f {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ b3 L;
    public final /* synthetic */ b3 M;
    public final /* synthetic */ b3 N;
    public final /* synthetic */ b3 O;
    public final /* synthetic */ b3 P;
    public final /* synthetic */ b3 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25632a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f25633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f25634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f25635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25637f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25638t;

    public /* synthetic */ n(b1 b1Var, ni.m mVar, b1 b1Var2, b3 b3Var, b3 b3Var2, b3 b3Var3, b3 b3Var4, b3 b3Var5, b3 b3Var6, b3 b3Var7, b3 b3Var8, b3 b3Var9, b3 b3Var10, b3 b3Var11) {
        this.f25633b = b1Var;
        this.f25636e = mVar;
        this.f25634c = b1Var2;
        this.f25635d = b3Var;
        this.f25637f = b3Var2;
        this.f25638t = b3Var3;
        this.H = b3Var4;
        this.K = b3Var5;
        this.L = b3Var6;
        this.M = b3Var7;
        this.N = b3Var8;
        this.O = b3Var9;
        this.P = b3Var10;
        this.Q = b3Var11;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x017e  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e4  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b1 b1Var;
        y2.h hVar;
        b3 b3Var;
        boolean z11;
        z1.o oVar;
        l1.s sVar;
        boolean z12;
        int iHashCode;
        switch (this.f25632a) {
            case 0:
                z1.r rVar = (z1.r) this.f25636e;
                o0.b bVar = (o0.b) this.f25637f;
                List list = (List) this.f25638t;
                b0 b0Var = (b0) this.H;
                gi.d dVar = (gi.d) this.K;
                b1 b1Var2 = (b1) this.L;
                b1 b1Var3 = (b1) this.M;
                b1 b1Var4 = (b1) this.N;
                b1 b1Var5 = (b1) this.O;
                b1 b1Var6 = (b1) this.P;
                b1 b1Var7 = (b1) this.Q;
                t1 paddingValues = (t1) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1.j jVar = z1.c.f58467e;
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(paddingValues) ? 4 : 2;
                }
                int i11 = iIntValue;
                boolean z13 = (iIntValue & 19) != 18;
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(i11 & 1, z13)) {
                    z1.r rVarZ = j0.c.z(rVar, paddingValues);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, uVarA, sVar2);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL, sVar2);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar2.S) {
                        b1Var = b1Var5;
                    } else {
                        b1Var = b1Var5;
                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        }
                        hVar = y2.j.f56915d;
                        l1.t.J(hVar, rVarC, sVar2);
                        b3Var = this.f25635d;
                        ((gi.a) b3Var.getValue()).getClass();
                        z11 = ((gi.a) b3Var.getValue()).f29246d;
                        oVar = z1.o.f58481a;
                        if (z11) {
                            sVar2.d0(210923521);
                            z1.r rVarD = e2.d(oVar, 1.0f);
                            q0 q0VarD = j0.o.d(jVar, false);
                            iHashCode = Long.hashCode(sVar2.T);
                            q1 q1VarL2 = sVar2.l();
                            z1.r rVarC2 = z1.a.c(sVar2, rVarD);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, q0VarD, sVar2);
                            l1.t.J(hVar3, q1VarL2, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                            }
                            l1.t.J(hVar, rVarC2, sVar2);
                            tv.a.g(((gi.a) b3Var.getValue()).f29247e, null, sVar2, 48, 4);
                            sVar2.p(true);
                            sVar2.p(false);
                            z12 = true;
                            sVar = sVar2;
                        } else {
                            sVar2.d0(211649944);
                            int iK = bVar.k();
                            c3 c3Var = v1.f31180a;
                            fa.a(iK, null, ((s1) sVar2.j(c3Var)).f31033p, ((s1) sVar2.j(c3Var)).f31034q, null, null, t1.e.d(650235932, new i(list, bVar, b0Var, 0), sVar2), sVar2, 1572864, 50);
                            z1.r rVarD2 = e2.d(oVar, 1.0f);
                            t1.d dVarD = t1.e.d(1691860179, new j(dVar, this.f25633b, this.f25634c, b1Var2, b1Var3, b1Var4, b1Var, b1Var6, b1Var7, 0), sVar2);
                            sVar = sVar2;
                            z12 = true;
                            ve.i.d(bVar, rVarD2, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, dVarD, sVar, 100663344, 16124);
                            sVar.p(false);
                        }
                        sVar.p(z12);
                    }
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                    hVar = y2.j.f56915d;
                    l1.t.J(hVar, rVarC, sVar2);
                    b3Var = this.f25635d;
                    ((gi.a) b3Var.getValue()).getClass();
                    z11 = ((gi.a) b3Var.getValue()).f29246d;
                    oVar = z1.o.f58481a;
                    if (z11) {
                        sVar2.d0(210923521);
                        z1.r rVarD3 = e2.d(oVar, 1.0f);
                        q0 q0VarD2 = j0.o.d(jVar, false);
                        iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL3 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, rVarD3);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar2, q0VarD2, sVar2);
                        l1.t.J(hVar3, q1VarL3, sVar2);
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                        }
                        l1.t.J(hVar, rVarC3, sVar2);
                        tv.a.g(((gi.a) b3Var.getValue()).f29247e, null, sVar2, 48, 4);
                        sVar2.p(true);
                        sVar2.p(false);
                        z12 = true;
                        sVar = sVar2;
                    } else {
                        sVar2.d0(211649944);
                        int iK2 = bVar.k();
                        c3 c3Var2 = v1.f31180a;
                        fa.a(iK2, null, ((s1) sVar2.j(c3Var2)).f31033p, ((s1) sVar2.j(c3Var2)).f31034q, null, null, t1.e.d(650235932, new i(list, bVar, b0Var, 0), sVar2), sVar2, 1572864, 50);
                        z1.r rVarD4 = e2.d(oVar, 1.0f);
                        t1.d dVarD2 = t1.e.d(1691860179, new j(dVar, this.f25633b, this.f25634c, b1Var2, b1Var3, b1Var4, b1Var, b1Var6, b1Var7, 0), sVar2);
                        sVar = sVar2;
                        z12 = true;
                        ve.i.d(bVar, rVarD4, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, dVarD2, sVar, 100663344, 16124);
                        sVar.p(false);
                    }
                    sVar.p(z12);
                } else {
                    sVar2.W();
                }
                break;
            default:
                final ni.m mVar = (ni.m) this.f25636e;
                final b3 b3Var2 = (b3) this.f25637f;
                final b3 b3Var3 = (b3) this.f25638t;
                final b3 b3Var4 = (b3) this.H;
                final b3 b3Var5 = (b3) this.K;
                l0.c item = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    List list2 = (List) this.f25633b.getValue();
                    final b1 b1Var8 = this.f25634c;
                    final b3 b3Var6 = this.f25635d;
                    final b3 b3Var7 = this.L;
                    final b3 b3Var8 = this.M;
                    final b3 b3Var9 = this.N;
                    final b3 b3Var10 = this.O;
                    final b3 b3Var11 = this.P;
                    final b3 b3Var12 = this.Q;
                    a0.o.b(list2, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(786410643, new fz.g() { // from class: yg.l
                        /* JADX WARN: Code duplicated, block: B:51:0x017b  */
                        /* JADX WARN: Code duplicated, block: B:95:0x031f  */
                        @Override // fz.g
                        public final Object f(Object obj4, Object obj5, Object obj6, Object obj7) {
                            b3 b3Var13;
                            String str;
                            ArrayList arrayList;
                            Object obj8;
                            String str2;
                            String str3;
                            String str4;
                            com.android.billingclient.api.k kVarA;
                            l lVar = this;
                            a0.r AnimatedContent = (a0.r) obj4;
                            List items = (List) obj5;
                            l1.n nVar3 = (l1.n) obj6;
                            ((Integer) obj7).getClass();
                            kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                            kotlin.jvm.internal.m.f(items, "items");
                            u uVarA2 = t.a(j0.i.g(16), z1.c.O, nVar3, 6);
                            l1.s sVar4 = (l1.s) nVar3;
                            int iHashCode3 = Long.hashCode(sVar4.T);
                            q1 q1VarL4 = sVar4.l();
                            z1.r rVarC4 = z1.a.c(nVar3, z1.o.f58481a);
                            y2.k.J.getClass();
                            y2.i iVar2 = y2.j.f56913b;
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(y2.j.f56917f, uVarA2, nVar3);
                            l1.t.J(y2.j.f56916e, q1VarL4, nVar3);
                            y2.h hVar5 = y2.j.f56918g;
                            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            }
                            l1.t.J(y2.j.f56915d, rVarC4, nVar3);
                            sVar4.d0(-317271673);
                            for (Iterator it = items.iterator(); it.hasNext(); it = it) {
                                p pVar = (p) it.next();
                                boolean z14 = ((p) b1Var8.getValue()) == pVar;
                                int i12 = n.f57836a[pVar.ordinal()];
                                ni.m mVar2 = mVar;
                                b3 b3Var14 = b3Var6;
                                b3 b3Var15 = b3Var4;
                                b3 b3Var16 = b3Var5;
                                b3 b3Var17 = b3Var7;
                                b3 b3Var18 = b3Var8;
                                String strD = BuildConfig.VERSION_NAME;
                                if (i12 == 1) {
                                    sVar4.d0(-317267080);
                                    String strE0 = ub.a.e0(nVar3, R.string.annual);
                                    String activitySubTitle = ((SaleActivityConfig) b3Var14.getValue()).getActivitySubTitle();
                                    String str5 = (String) b3Var2.getValue();
                                    b3 b3Var19 = b3Var3;
                                    String strK = gr.n.k((com.android.billingclient.api.o) b3Var19.getValue());
                                    com.android.billingclient.api.o oVar2 = (com.android.billingclient.api.o) b3Var19.getValue();
                                    if (oVar2 == null || (arrayList = oVar2.f7569h) == null || arrayList.isEmpty()) {
                                        b3Var13 = b3Var19;
                                    } else {
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (it2.hasNext()) {
                                                int size = ((com.android.billingclient.api.n) next).f7561b.f7554a.size();
                                                while (true) {
                                                    Object next2 = it2.next();
                                                    b3Var13 = b3Var19;
                                                    int size2 = ((com.android.billingclient.api.n) next2).f7561b.f7554a.size();
                                                    if (size < size2) {
                                                        size = size2;
                                                        next = next2;
                                                    }
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    b3Var19 = b3Var13;
                                                }
                                            } else {
                                                b3Var13 = b3Var19;
                                            }
                                            obj8 = next;
                                        } else {
                                            obj8 = null;
                                            b3Var13 = b3Var19;
                                        }
                                        com.android.billingclient.api.n nVar4 = (com.android.billingclient.api.n) obj8;
                                        if (nVar4 != null) {
                                            ArrayList arrayList2 = nVar4.f7561b.f7554a;
                                            kotlin.jvm.internal.m.e(arrayList2, "getPricingPhaseList(...)");
                                            com.android.billingclient.api.l lVar2 = (com.android.billingclient.api.l) ry.m.z0(arrayList2);
                                            NumberFormat currencyInstance = kotlin.jvm.internal.m.a(lVar2.f7550c, "USD") ? NumberFormat.getCurrencyInstance(Locale.US) : NumberFormat.getCurrencyInstance();
                                            Currency currency = Currency.getInstance(lVar2.f7550c);
                                            currencyInstance.setMaximumFractionDigits(currency.getDefaultFractionDigits());
                                            currencyInstance.setCurrency(currency);
                                            double d5 = ((double) (lVar2.f7549b * 2.0f)) / 1000000.0d;
                                            int i13 = (int) d5;
                                            if (d5 != i13) {
                                                i13++;
                                            }
                                            str = currencyInstance.format(Integer.valueOf(i13));
                                            kotlin.jvm.internal.m.e(str, "format(...)");
                                        }
                                        MergedBillingThemeBillingPage mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) b3Var15.getValue();
                                        com.android.billingclient.api.o oVar3 = (com.android.billingclient.api.o) b3Var13.getValue();
                                        if (((BillingPageRecomConfig) b3Var16.getValue()).getRecomType() == 0) {
                                            strD = ep.a.D((String) b3Var17.getValue(), " ", (String) b3Var18.getValue());
                                        }
                                        o.a(0, oVar3, mergedBillingThemeBillingPage, strE0, activitySubTitle, str5, strK, str, strD, nVar3, mVar2, z14);
                                        sVar4.p(false);
                                        lVar = this;
                                    }
                                    str = BuildConfig.VERSION_NAME;
                                    MergedBillingThemeBillingPage mergedBillingThemeBillingPage2 = (MergedBillingThemeBillingPage) b3Var15.getValue();
                                    com.android.billingclient.api.o oVar4 = (com.android.billingclient.api.o) b3Var13.getValue();
                                    if (((BillingPageRecomConfig) b3Var16.getValue()).getRecomType() == 0) {
                                        strD = ep.a.D((String) b3Var17.getValue(), " ", (String) b3Var18.getValue());
                                    }
                                    o.a(0, oVar4, mergedBillingThemeBillingPage2, strE0, activitySubTitle, str5, strK, str, strD, nVar3, mVar2, z14);
                                    sVar4.p(false);
                                    lVar = this;
                                } else if (i12 == 2) {
                                    sVar4.d0(-317232407);
                                    String strE1 = ub.a.e0(nVar3, R.string.monthly);
                                    b3 b3Var20 = b3Var9;
                                    o.n(strE1, gr.n.k((com.android.billingclient.api.o) b3Var20.getValue()), (MergedBillingThemeBillingPage) b3Var15.getValue(), z14, mVar2, (com.android.billingclient.api.o) b3Var20.getValue(), nVar3, 0);
                                    sVar4.p(false);
                                } else if (i12 == 3) {
                                    sVar4.d0(-317213969);
                                    String strE2 = ub.a.e0(nVar3, R.string._6_months);
                                    b3 b3Var21 = b3Var10;
                                    o.n(strE2, gr.n.k((com.android.billingclient.api.o) b3Var21.getValue()), (MergedBillingThemeBillingPage) b3Var15.getValue(), z14, mVar2, (com.android.billingclient.api.o) b3Var21.getValue(), nVar3, 0);
                                    sVar4.p(false);
                                } else {
                                    if (i12 != 4) {
                                        throw nv.p.x(sVar4, -317267421, false);
                                    }
                                    sVar4.d0(-317194880);
                                    String strE3 = ub.a.e0(nVar3, R.string.lifetime);
                                    String activityLifetimeSubTitle = ((SaleActivityConfig) b3Var14.getValue()).getActivityLifetimeSubTitle();
                                    String str6 = (String) b3Var11.getValue();
                                    MergedBillingThemeBillingPage mergedBillingThemeBillingPage3 = (MergedBillingThemeBillingPage) b3Var15.getValue();
                                    b3 b3Var22 = b3Var12;
                                    com.android.billingclient.api.o oVar5 = (com.android.billingclient.api.o) b3Var22.getValue();
                                    if (oVar5 == null || (kVarA = oVar5.a()) == null || (str2 = kVarA.f7539a) == null) {
                                        str2 = BuildConfig.VERSION_NAME;
                                    }
                                    com.android.billingclient.api.o oVar6 = (com.android.billingclient.api.o) b3Var22.getValue();
                                    String str7 = str2;
                                    if (oVar6 != null) {
                                        com.android.billingclient.api.k kVarA2 = oVar6.a();
                                        str3 = strE3;
                                        if (kVarA2 != null) {
                                            String str8 = kVarA2.f7541c;
                                            NumberFormat currencyInstance2 = kotlin.jvm.internal.m.a(str8, "USD") ? NumberFormat.getCurrencyInstance(Locale.US) : NumberFormat.getCurrencyInstance();
                                            Currency currency2 = Currency.getInstance(str8);
                                            currencyInstance2.setMaximumFractionDigits(currency2.getDefaultFractionDigits());
                                            currencyInstance2.setCurrency(currency2);
                                            double d11 = ((double) (kVarA2.f7540b * 4.0f)) / 1000000.0d;
                                            int i14 = (int) d11;
                                            if (d11 != i14) {
                                                i14++;
                                            }
                                            str4 = currencyInstance2.format(Integer.valueOf(i14));
                                            kotlin.jvm.internal.m.e(str4, "format(...)");
                                        }
                                        com.android.billingclient.api.o oVar7 = (com.android.billingclient.api.o) b3Var22.getValue();
                                        if (((BillingPageRecomConfig) b3Var16.getValue()).getRecomType() == 1) {
                                            strD = ep.a.D((String) b3Var17.getValue(), " ", (String) b3Var18.getValue());
                                        }
                                        o.m(0, oVar7, mergedBillingThemeBillingPage3, str3, activityLifetimeSubTitle, str6, str7, str4, strD, nVar3, mVar2, z14);
                                        sVar4.p(false);
                                    } else {
                                        str3 = strE3;
                                    }
                                    str4 = BuildConfig.VERSION_NAME;
                                    com.android.billingclient.api.o oVar8 = (com.android.billingclient.api.o) b3Var22.getValue();
                                    if (((BillingPageRecomConfig) b3Var16.getValue()).getRecomType() == 1) {
                                        strD = ep.a.D((String) b3Var17.getValue(), " ", (String) b3Var18.getValue());
                                    }
                                    o.m(0, oVar8, mergedBillingThemeBillingPage3, str3, activityLifetimeSubTitle, str6, str7, str4, strD, nVar3, mVar2, z14);
                                    sVar4.p(false);
                                }
                            }
                            sVar4.p(false);
                            sVar4.p(true);
                            return qy.b0.f48488a;
                        }
                    }, sVar3), sVar3, 1597440, 46);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n(z1.r rVar, o0.b bVar, b3 b3Var, List list, b0 b0Var, gi.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8) {
        this.f25636e = rVar;
        this.f25637f = bVar;
        this.f25635d = b3Var;
        this.f25638t = list;
        this.H = b0Var;
        this.K = dVar;
        this.f25633b = b1Var;
        this.f25634c = b1Var2;
        this.L = b1Var3;
        this.M = b1Var4;
        this.N = b1Var5;
        this.O = b1Var6;
        this.P = b1Var7;
        this.Q = b1Var8;
    }
}
