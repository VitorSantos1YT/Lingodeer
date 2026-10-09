package wo;

import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingodeer.R;
import j0.i;
import j0.t;
import j0.t1;
import j0.u;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import m0.l;
import oz.q;
import qy.b0;
import w2.q0;
import y2.h;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TURSyllableIntroductionActivity f55191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zo.b f55192c;

    public /* synthetic */ f(TURSyllableIntroductionActivity tURSyllableIntroductionActivity, zo.b bVar, int i11) {
        this.f55190a = i11;
        this.f55191b = tURSyllableIntroductionActivity;
        this.f55192c = bVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f55190a;
        b0 b0Var = b0.f48488a;
        o oVar = o.f58481a;
        final int i12 = 2;
        final int i13 = 4;
        final zo.b bVar = this.f55192c;
        final int i14 = 1;
        final int i15 = 0;
        switch (i11) {
            case 0:
                l item = (l) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = TURSyllableIntroductionActivity.H;
                m.f(item, "$this$item");
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    u uVarA = t.a(i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, oVar);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(j.f56917f, uVarA, sVar);
                    l1.t.J(j.f56916e, q1VarL, sVar);
                    h hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(j.f56915d, rVarC, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.tur_alp_section_content_3);
                    TURSyllableIntroductionActivity tURSyllableIntroductionActivity = this.f55191b;
                    tURSyllableIntroductionActivity.q(strE0, sVar, 0);
                    String strE1 = ub.a.e0(sVar, R.string.tur_alp_section_content_4);
                    String strE2 = ub.a.e0(sVar, R.string.tur_alp_section_content_5);
                    String strE3 = ub.a.e0(sVar, R.string.tur_alp_section_content_6);
                    boolean zH = sVar.h(bVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        objQ = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i17 = i15;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i17) {
                                    case 0:
                                        int i18 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i19 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ);
                    }
                    tURSyllableIntroductionActivity.t(strE1, strE2, strE3, (fz.c) objQ, sVar, 0);
                    String strE4 = ub.a.e0(sVar, R.string.tur_alp_section_content_7);
                    String strE5 = ub.a.e0(sVar, R.string.tur_alp_section_content_8);
                    String strE6 = ub.a.e0(sVar, R.string.tur_alp_section_content_9);
                    boolean zH2 = sVar.h(bVar);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i17 = i14;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i17) {
                                    case 0:
                                        int i18 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i19 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ2);
                    }
                    tURSyllableIntroductionActivity.t(strE4, strE5, strE6, (fz.c) objQ2, sVar, 0);
                    String strE7 = ub.a.e0(sVar, R.string.tur_alp_section_content_10);
                    String strE8 = ub.a.e0(sVar, R.string.tur_alp_section_content_11);
                    String strE9 = ub.a.e0(sVar, R.string.tur_alp_section_content_12);
                    boolean zH3 = sVar.h(bVar);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        objQ3 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i17 = i12;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i17) {
                                    case 0:
                                        int i18 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i19 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ3);
                    }
                    tURSyllableIntroductionActivity.t(strE7, strE8, strE9, (fz.c) objQ3, sVar, 0);
                    String strE10 = ub.a.e0(sVar, R.string.tur_alp_section_content_13);
                    String strE11 = ub.a.e0(sVar, R.string.tur_alp_section_content_14);
                    String strE12 = ub.a.e0(sVar, R.string.tur_alp_section_content_15);
                    boolean zH4 = sVar.h(bVar);
                    Object objQ4 = sVar.Q();
                    if (zH4 || objQ4 == gVar) {
                        final int i17 = 3;
                        objQ4 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i18 = i17;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i18) {
                                    case 0:
                                        int i19 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i110 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ4);
                    }
                    tURSyllableIntroductionActivity.t(strE10, strE11, strE12, (fz.c) objQ4, sVar, 0);
                    String strE13 = ub.a.e0(sVar, R.string.tur_alp_section_content_16);
                    String strE14 = ub.a.e0(sVar, R.string.tur_alp_section_content_17);
                    String strE15 = ub.a.e0(sVar, R.string.tur_alp_section_content_18);
                    boolean zH5 = sVar.h(bVar);
                    Object objQ5 = sVar.Q();
                    if (zH5 || objQ5 == gVar) {
                        objQ5 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i18 = i13;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i18) {
                                    case 0:
                                        int i19 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i110 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ5);
                    }
                    tURSyllableIntroductionActivity.t(strE13, strE14, strE15, (fz.c) objQ5, sVar, 0);
                    String strE16 = ub.a.e0(sVar, R.string.tur_alp_section_content_19);
                    String strE17 = ub.a.e0(sVar, R.string.tur_alp_section_content_20);
                    String strE18 = ub.a.e0(sVar, R.string.tur_alp_section_content_21);
                    boolean zH6 = sVar.h(bVar);
                    Object objQ6 = sVar.Q();
                    if (zH6 || objQ6 == gVar) {
                        final int i18 = 5;
                        objQ6 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i19 = i18;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i19) {
                                    case 0:
                                        int i110 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i111 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ6);
                    }
                    tURSyllableIntroductionActivity.t(strE16, strE17, strE18, (fz.c) objQ6, sVar, 0);
                    String strE19 = ub.a.e0(sVar, R.string.tur_alp_section_content_22);
                    String strE20 = ub.a.e0(sVar, R.string.tur_alp_section_content_23);
                    String strE21 = ub.a.e0(sVar, R.string.tur_alp_section_content_24);
                    boolean zH7 = sVar.h(bVar);
                    Object objQ7 = sVar.Q();
                    if (zH7 || objQ7 == gVar) {
                        final int i19 = 6;
                        objQ7 = new fz.c() { // from class: wo.g
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                int i110 = i19;
                                b0 b0Var2 = b0.f48488a;
                                zo.b bVar2 = bVar;
                                String letter = (String) obj4;
                                switch (i110) {
                                    case 0:
                                        int i111 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 1:
                                        int i112 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 2:
                                        int i21 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 3:
                                        int i22 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 4:
                                        int i23 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    case 5:
                                        int i24 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                    default:
                                        int i25 = TURSyllableIntroductionActivity.H;
                                        m.f(letter, "letter");
                                        bVar2.a(new a5.f(1).l((String) q.W0(letter, new String[]{" "}, 0, 6).get(0)));
                                        break;
                                }
                                return b0Var2;
                            }
                        };
                        sVar.o0(objQ7);
                    }
                    tURSyllableIntroductionActivity.t(strE19, strE20, strE21, (fz.c) objQ7, sVar, 0);
                    sVar.p(true);
                }
                break;
            default:
                t1 contentPadding = (t1) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i21 = TURSyllableIntroductionActivity.H;
                m.f(contentPadding, "contentPadding");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar2).f(contentPadding) ? 4 : 2;
                }
                s sVar2 = (s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    sVar2.W();
                } else {
                    r rVarZ = j0.c.z(oVar, contentPadding);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    r rVarC2 = z1.a.c(sVar2, rVarZ);
                    k.J.getClass();
                    y2.i iVar2 = j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(j.f56917f, q0VarD, sVar2);
                    l1.t.J(j.f56916e, q1VarL2, sVar2);
                    h hVar2 = j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(j.f56915d, rVarC2, sVar2);
                    this.f55191b.p(bVar, sVar2, 0);
                    sVar2.p(true);
                }
                break;
        }
        return b0Var;
    }
}
