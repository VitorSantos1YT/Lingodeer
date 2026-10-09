package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j0.a2;
import j0.e2;
import j0.t;
import j0.u;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import m0.l;
import oz.x;
import qy.b0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f36425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml.a f36427d;

    public /* synthetic */ f(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, List list, ml.a aVar, int i11) {
        this.f36424a = i11;
        this.f36426c = hINDISyllableIntroductionActivity;
        this.f36425b = list;
        this.f36427d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f36424a;
        b0 b0Var = b0.f48488a;
        Object obj4 = m.f39353a;
        o oVar = o.f58481a;
        final ml.a aVar = this.f36427d;
        List<List> list = this.f36425b;
        final int i12 = 0;
        switch (i11) {
            case 0:
                l item = (l) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item, "$this$item");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.hindi_alp_section_content_15);
                    HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = this.f36426c;
                    hINDISyllableIntroductionActivity.v(strE0, sVar, 0);
                    hINDISyllableIntroductionActivity.q(ub.a.e0(sVar, R.string.hindi_alp_section_content_16), sVar, 0);
                    j0.c.g(sVar, e2.g(oVar, 8));
                    hINDISyllableIntroductionActivity.t(ns.o.L(ub.a.e0(sVar, R.string.hindi_alp_section_content_17), ub.a.e0(sVar, R.string.hindi_alp_section_content_10)), 1.0f, sVar, 48);
                    sVar.d0(1370640994);
                    for (List list2 : list) {
                        boolean zH = sVar.h(aVar);
                        Object objQ = sVar.Q();
                        if (zH || objQ == obj4) {
                            final int i14 = 2;
                            objQ = new fz.c() { // from class: jl.h
                                @Override // fz.c
                                public final Object invoke(Object obj5) {
                                    int i15 = i14;
                                    b0 b0Var2 = b0.f48488a;
                                    ml.a aVar2 = aVar;
                                    String audioFileName = (String) obj5;
                                    switch (i15) {
                                        case 0:
                                            int i16 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar2.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        case 1:
                                            int i17 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar2.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        default:
                                            int i18 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar2.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                    }
                                    return b0Var2;
                                }
                            };
                            sVar.o0(objQ);
                        }
                        hINDISyllableIntroductionActivity.u(list2, 2, 1.0f, (fz.c) objQ, sVar, 432);
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l item2 = (l) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i15 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item2, "$this$item");
                s sVar2 = (s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    r rVarC2 = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    fz.a aVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(aVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    sVar2.d0(273542723);
                    ArrayList arrayListH0 = ry.m.h0(list, 2);
                    int size = arrayListH0.size();
                    int i16 = 0;
                    while (true) {
                        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity2 = this.f36426c;
                        if (i16 >= size) {
                            boolean z11 = i12;
                            sVar2.p(z11);
                            hINDISyllableIntroductionActivity2.q(ub.a.e0(sVar2, R.string.hindi_alp_section_content_40), sVar2, z11 ? 1 : 0);
                            sVar2.p(true);
                        } else {
                            Object obj5 = arrayListH0.get(i16);
                            i16++;
                            List<List> list3 = (List) obj5;
                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, i12);
                            int iHashCode3 = Long.hashCode(sVar2.T);
                            q1 q1VarL3 = sVar2.l();
                            r rVarC3 = z1.a.c(sVar2, oVar);
                            y2.k.J.getClass();
                            fz.a aVar3 = y2.j.f56913b;
                            sVar2.h0();
                            ArrayList arrayList = arrayListH0;
                            if (sVar2.S) {
                                sVar2.k(aVar3);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                            l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                            y2.h hVar3 = y2.j.f56918g;
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                            }
                            l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                            sVar2.d0(-1226289762);
                            for (List list4 : list3) {
                                String str = (String) list4.get(0);
                                String str2 = (String) list4.get(1);
                                Object obj6 = (String) list4.get(2);
                                boolean zH2 = sVar2.h(aVar) | sVar2.f(obj6);
                                Object objQ2 = sVar2.Q();
                                if (zH2 || objQ2 == obj4) {
                                    objQ2 = new fp.f(19, aVar, obj6);
                                    sVar2.o0(objQ2);
                                }
                                hINDISyllableIntroductionActivity2.s(str, str2, (fz.a) objQ2, sVar2, 6);
                            }
                            sVar2.p(false);
                            sVar2.p(true);
                            arrayListH0 = arrayList;
                            i12 = 0;
                        }
                    }
                }
                break;
            case 2:
                l item3 = (l) obj;
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    u uVarA3 = t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL4 = sVar3.l();
                    r rVarC4 = z1.a.c(sVar3, oVar);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar3);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, sVar3);
                    String strE1 = ub.a.e0(sVar3, R.string.hindi_alp_section_content_5);
                    HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity3 = this.f36426c;
                    hINDISyllableIntroductionActivity3.q(strE1, sVar3, 0);
                    hINDISyllableIntroductionActivity3.v(ub.a.e0(sVar3, R.string.hindi_alp_section_content_6), sVar3, 0);
                    hINDISyllableIntroductionActivity3.q(ub.a.e0(sVar3, R.string.hindi_alp_section_content_7), sVar3, 0);
                    j0.c.g(sVar3, e2.g(oVar, 8));
                    hINDISyllableIntroductionActivity3.t(ns.o.L(ub.a.e0(sVar3, R.string.hindi_alp_section_content_8), ub.a.e0(sVar3, R.string.hindi_alp_section_content_9), ub.a.e0(sVar3, R.string.hindi_alp_section_content_10)), 2.8f, sVar3, 48);
                    sVar3.d0(822106184);
                    for (List list5 : list) {
                        boolean zH3 = sVar3.h(aVar);
                        Object objQ3 = sVar3.Q();
                        if (zH3 || objQ3 == obj4) {
                            objQ3 = new fz.c() { // from class: jl.h
                                @Override // fz.c
                                public final Object invoke(Object obj7) {
                                    int i18 = i12;
                                    b0 b0Var2 = b0.f48488a;
                                    ml.a aVar4 = aVar;
                                    String audioFileName = (String) obj7;
                                    switch (i18) {
                                        case 0:
                                            int i19 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        case 1:
                                            int i110 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        default:
                                            int i111 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                    }
                                    return b0Var2;
                                }
                            };
                            sVar3.o0(objQ3);
                        }
                        hINDISyllableIntroductionActivity3.u(list5, 3, 2.8f, (fz.c) objQ3, sVar3, 432);
                    }
                    sVar3.p(false);
                    hINDISyllableIntroductionActivity3.q(ub.a.e0(sVar3, R.string.hindi_alp_section_content_11), sVar3, 0);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            default:
                l item4 = (l) obj;
                n nVar4 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item4, "$this$item");
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    u uVarA4 = t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode5 = Long.hashCode(sVar4.T);
                    q1 q1VarL5 = sVar4.l();
                    r rVarC5 = z1.a.c(sVar4, oVar);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA4, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL5, sVar4);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar5);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar4);
                    String strE2 = ub.a.e0(sVar4, R.string.hindi_alp_section_content_12);
                    HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity4 = this.f36426c;
                    hINDISyllableIntroductionActivity4.v(strE2, sVar4, 0);
                    j0.c.g(sVar4, e2.g(oVar, 8));
                    hINDISyllableIntroductionActivity4.t(ns.o.L(ub.a.e0(sVar4, R.string.hindi_alp_section_content_13), ub.a.e0(sVar4, R.string.hindi_alp_section_content_10)), 1.0f, sVar4, 48);
                    sVar4.d0(-1051116859);
                    for (List list6 : list) {
                        boolean zH4 = sVar4.h(aVar);
                        Object objQ4 = sVar4.Q();
                        if (zH4 || objQ4 == obj4) {
                            final int i19 = 1;
                            objQ4 = new fz.c() { // from class: jl.h
                                @Override // fz.c
                                public final Object invoke(Object obj7) {
                                    int i110 = i19;
                                    b0 b0Var2 = b0.f48488a;
                                    ml.a aVar4 = aVar;
                                    String audioFileName = (String) obj7;
                                    switch (i110) {
                                        case 0:
                                            int i111 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        case 1:
                                            int i112 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                        default:
                                            int i113 = HINDISyllableIntroductionActivity.K;
                                            kotlin.jvm.internal.m.f(audioFileName, "audioFileName");
                                            aVar4.a(x.q0(x.q0(audioFileName, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                                            break;
                                    }
                                    return b0Var2;
                                }
                            };
                            sVar4.o0(objQ4);
                        }
                        hINDISyllableIntroductionActivity4.u(list6, 2, 1.0f, (fz.c) objQ4, sVar4, 432);
                    }
                    sVar4.p(false);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ f(List list, HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, ml.a aVar) {
        this.f36424a = 1;
        this.f36425b = list;
        this.f36426c = hINDISyllableIntroductionActivity;
        this.f36427d = aVar;
    }
}
