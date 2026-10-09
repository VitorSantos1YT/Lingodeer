package dt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt.l6;
import rt.ae;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n2 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24032d;

    public /* synthetic */ n2(Object obj, Object obj2, boolean z11, int i11) {
        this.f24029a = i11;
        this.f24031c = obj;
        this.f24032d = obj2;
        this.f24030b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:203:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:205:0x090e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0910  */
    /* JADX WARN: Code duplicated, block: B:211:0x092b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0937  */
    /* JADX WARN: Code duplicated, block: B:217:0x0977  */
    /* JADX WARN: Code duplicated, block: B:218:0x097b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0996  */
    /* JADX WARN: Code duplicated, block: B:227:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:234:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:239:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:244:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:249:0x0ace  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.s sVar;
        z1.i iVar;
        boolean z11;
        boolean z12;
        int i11;
        boolean zF;
        Object objQ;
        String string;
        boolean z13;
        boolean zBooleanValue;
        int iHashCode;
        boolean zG;
        Object objQ2;
        int iHashCode2;
        String translation;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n2 n2Var = this;
        switch (n2Var.f24029a) {
            case 0:
                List list = (List) n2Var.f24031c;
                j3.y0 y0Var = (j3.y0) n2Var.f24032d;
                j0.u0 FlowRow = (j0.u0) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1.i iVar2 = z1.c.N;
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(FlowRow) ? 4 : 2;
                }
                boolean z14 = false;
                boolean z15 = true;
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        CourseWord courseWord = (CourseWord) it.next();
                        z1.o oVar = z1.o.f58481a;
                        if (!n2Var.f24030b || courseWord.getSelectedState() != OptionItemSelectedState.WRONG || courseWord.getWordType() == z15 || kotlin.jvm.internal.m.a(courseWord.getWord(), " ")) {
                            sVar = sVar2;
                            iVar = iVar2;
                            z11 = z15;
                            sVar.d0(1717937361);
                            j3.y0 y0Var2 = y0Var;
                            g4.b(courseWord, y0Var2, FlowRow.b(oVar, iVar), false, null, false, false, false, 0, null, sVar, 0, 1016);
                            y0Var = y0Var2;
                            z12 = false;
                            sVar.p(false);
                        } else {
                            sVar2.d0(1717125812);
                            z1.r rVarB = FlowRow.b(oVar, iVar2);
                            boolean zF2 = sVar2.f(y0Var);
                            Object objQ3 = sVar2.Q();
                            if (zF2 || objQ3 == l1.m.f39353a) {
                                objQ3 = new g2(y0Var, 5);
                                sVar2.o0(objQ3);
                            }
                            z1.r rVarD = d2.h.d(rVarB, (fz.c) objQ3);
                            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, z14);
                            int iHashCode3 = Long.hashCode(sVar2.T);
                            l1.q1 q1VarL = sVar2.l();
                            z1.r rVarC = z1.a.c(sVar2, rVarD);
                            y2.k.J.getClass();
                            y2.i iVar3 = y2.j.f56913b;
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar3);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                            y2.h hVar = y2.j.f56918g;
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar);
                            }
                            l1.t.J(y2.j.f56915d, rVarC, sVar2);
                            l1.s sVar3 = sVar2;
                            iVar = iVar2;
                            z11 = z15;
                            g4.b(courseWord, j3.y0.a(y0Var, 0L, 0L, n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), null, false, null, false, false, false, 0, null, sVar3, 0, 1020);
                            sVar = sVar3;
                            sVar.p(z11);
                            z12 = false;
                            sVar.p(false);
                        }
                        iVar2 = iVar;
                        z15 = z11;
                        z14 = z12;
                        sVar2 = sVar;
                        n2Var = this;
                    }
                } else {
                    sVar2.W();
                }
                break;
            case 1:
                fz.c cVar = (fz.c) n2Var.f24031c;
                CourseWord courseWord2 = (CourseWord) n2Var.f24032d;
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                    boolean zF3 = sVar4.f(cVar) | sVar4.h(courseWord2);
                    Object objQ4 = sVar4.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF3 || objQ4 == gVar) {
                        objQ4 = new bt.s0(cVar, courseWord2, 14);
                        sVar4.o0(objQ4);
                    }
                    z1.r rVarO = d0.n.o(rVarE, false, null, (fz.a) objQ4, 15);
                    z1.i iVar4 = z1.c.M;
                    j0.b bVar = j0.i.f35303a;
                    j0.a2 a2VarA = j0.z1.a(bVar, iVar4, sVar4, 48);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL2 = sVar4.l();
                    z1.r rVarC2 = z1.a.c(sVar4, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar5);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, a2VarA, sVar4);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL2, sVar4);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar4.S) {
                        i11 = 16;
                    } else {
                        i11 = 16;
                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                        }
                        y2.h hVar5 = y2.j.f56915d;
                        l1.t.J(hVar5, rVarC2, sVar4);
                        zF = sVar4.f(courseWord2.getAudioUri());
                        objQ = sVar4.Q();
                        if (zF || objQ == gVar) {
                            string = courseWord2.getAudioUri().toString();
                            kotlin.jvm.internal.m.e(string, "toString(...)");
                            if (string.length() > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objQ = Boolean.valueOf(z13);
                            sVar4.o0(objQ);
                        }
                        zBooleanValue = ((Boolean) objQ).booleanValue();
                        if (0.65f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var = new j0.i1(0.65f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.65f, true);
                        l1.c3 c3Var = h1.v1.f31180a;
                        z1.r rVarH = d0.n.h(i1Var, ((h1.s1) sVar4.j(c3Var)).f31021c, g2.f0.f28556b);
                        float f5 = 12;
                        float f11 = 6;
                        z1.r rVarB2 = j0.c.B(rVarH, f5, f11);
                        j0.a2 a2VarA2 = j0.z1.a(bVar, iVar4, sVar4, 54);
                        iHashCode = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL3 = sVar4.l();
                        z1.r rVarC3 = z1.a.c(sVar4, rVarB2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar5);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar2, a2VarA2, sVar4);
                        l1.t.J(hVar3, q1VarL3, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                        }
                        l1.t.J(hVar5, rVarC3, sVar4);
                        long j11 = ((h1.s1) sVar4.j(c3Var)).f31017a;
                        z1.r rVarN = j0.e2.n(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, 11), 24);
                        zG = sVar4.g(zBooleanValue) | sVar4.f(cVar) | sVar4.h(courseWord2);
                        objQ2 = sVar4.Q();
                        if (zG || objQ2 == gVar) {
                            objQ2 = new l4(zBooleanValue, cVar, courseWord2, 0);
                            sVar4.o0(objQ2);
                        }
                        a0.a(this.f24030b, rVarN, j11, (fz.a) objQ2, sVar4, 48, 0);
                        l1.d0 d0Var = ua.f31167a;
                        g4.b(courseWord2, j3.y0.a((j3.y0) sVar4.j(d0Var), ((h1.s1) sVar4.j(c3Var)).f31034q, fr.j3.A(i11), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), null, false, null, false, false, false, 0, z1.c.O, sVar4, 805306368, 508);
                        sVar4.p(true);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarB3 = j0.c.B(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f5, f11);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58466d, false);
                        iHashCode2 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL4 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, rVarB3);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar5);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar2, q0VarD2, sVar4);
                        l1.t.J(hVar3, q1VarL4, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
                        }
                        l1.t.J(hVar5, rVarC4, sVar4);
                        translation = courseWord2.getTranslation();
                        if (oz.q.K0(translation)) {
                            translation = "-";
                        }
                        iu.k.c(translation, null, j3.y0.a((j3.y0) sVar4.j(d0Var), ((h1.s1) sVar4.j(c3Var)).f31034q, fr.j3.A(14), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(8), fr.j3.A(14), fr.j3.z(0.25d)), sVar4, 1572864, 186);
                        sVar4.p(true);
                        sVar4.p(true);
                    }
                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar4);
                    y2.h hVar6 = y2.j.f56915d;
                    l1.t.J(hVar6, rVarC2, sVar4);
                    zF = sVar4.f(courseWord2.getAudioUri());
                    objQ = sVar4.Q();
                    if (zF) {
                        string = courseWord2.getAudioUri().toString();
                        kotlin.jvm.internal.m.e(string, "toString(...)");
                        if (string.length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = Boolean.valueOf(z13);
                        sVar4.o0(objQ);
                    } else {
                        string = courseWord2.getAudioUri().toString();
                        kotlin.jvm.internal.m.e(string, "toString(...)");
                        if (string.length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = Boolean.valueOf(z13);
                        sVar4.o0(objQ);
                    }
                    zBooleanValue = ((Boolean) objQ).booleanValue();
                    if (0.65f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var2 = new j0.i1(0.65f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.65f, true);
                    l1.c3 c3Var2 = h1.v1.f31180a;
                    z1.r rVarH2 = d0.n.h(i1Var2, ((h1.s1) sVar4.j(c3Var2)).f31021c, g2.f0.f28556b);
                    float f12 = 12;
                    float f13 = 6;
                    z1.r rVarB4 = j0.c.B(rVarH2, f12, f13);
                    j0.a2 a2VarA3 = j0.z1.a(bVar, iVar4, sVar4, 54);
                    iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL5 = sVar4.l();
                    z1.r rVarC5 = z1.a.c(sVar4, rVarB4);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar5);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar2, a2VarA3, sVar4);
                    l1.t.J(hVar3, q1VarL5, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                    } else {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                    }
                    l1.t.J(hVar6, rVarC5, sVar4);
                    long j12 = ((h1.s1) sVar4.j(c3Var2)).f31017a;
                    z1.r rVarN2 = j0.e2.n(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, 11), 24);
                    zG = sVar4.g(zBooleanValue) | sVar4.f(cVar) | sVar4.h(courseWord2);
                    objQ2 = sVar4.Q();
                    if (zG) {
                        objQ2 = new l4(zBooleanValue, cVar, courseWord2, 0);
                        sVar4.o0(objQ2);
                    } else {
                        objQ2 = new l4(zBooleanValue, cVar, courseWord2, 0);
                        sVar4.o0(objQ2);
                    }
                    a0.a(this.f24030b, rVarN2, j12, (fz.a) objQ2, sVar4, 48, 0);
                    l1.d0 d0Var2 = ua.f31167a;
                    g4.b(courseWord2, j3.y0.a((j3.y0) sVar4.j(d0Var2), ((h1.s1) sVar4.j(c3Var2)).f31034q, fr.j3.A(i11), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), null, false, null, false, false, false, 0, z1.c.O, sVar4, 805306368, 508);
                    sVar4.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarB5 = j0.c.B(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f12, f13);
                    w2.q0 q0VarD3 = j0.o.d(z1.c.f58466d, false);
                    iHashCode2 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL6 = sVar4.l();
                    z1.r rVarC6 = z1.a.c(sVar4, rVarB5);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar5);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar2, q0VarD3, sVar4);
                    l1.t.J(hVar3, q1VarL6, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
                    } else {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
                    }
                    l1.t.J(hVar6, rVarC6, sVar4);
                    translation = courseWord2.getTranslation();
                    if (oz.q.K0(translation)) {
                        translation = "-";
                    }
                    iu.k.c(translation, null, j3.y0.a((j3.y0) sVar4.j(d0Var2), ((h1.s1) sVar4.j(c3Var2)).f31034q, fr.j3.A(14), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), 0, false, 2, 0, new s0.g(fr.j3.A(8), fr.j3.A(14), fr.j3.z(0.25d)), sVar4, 1572864, 186);
                    sVar4.p(true);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
            case 2:
                CourseCharacter courseCharacter = (CourseCharacter) n2Var.f24031c;
                fz.c cVar2 = (fz.c) n2Var.f24032d;
                j0.v Card = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar5 = (l1.s) nVar3;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar5, 48);
                    int iHashCode5 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL7 = sVar5.l();
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarC7 = z1.a.c(sVar5, oVar3);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar6);
                    } else {
                        sVar5.r0();
                    }
                    y2.h hVar7 = y2.j.f56917f;
                    l1.t.J(hVar7, uVarA, sVar5);
                    y2.h hVar8 = y2.j.f56916e;
                    l1.t.J(hVar8, q1VarL7, sVar5);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar9);
                    }
                    y2.h hVar10 = y2.j.f56915d;
                    l1.t.J(hVar10, rVarC7, sVar5);
                    String zhuYin = courseCharacter.getZhuYin();
                    if (oz.q.K0(zhuYin)) {
                        zhuYin = courseCharacter.getCharacter();
                    }
                    ua.b(zhuYin, j0.c.A(oVar3, 16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar5.j(fc.f30256a)).f30175h, 0L, 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), sVar5, 48, 0, 65532);
                    k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 0, 7);
                    z1.r rVarN3 = j0.e2.n(j0.c.C(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 32, 1), 142);
                    w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode6 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL8 = sVar5.l();
                    z1.r rVarC8 = z1.a.c(sVar5, rVarN3);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar6);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar7, q0VarD4, sVar5);
                    l1.t.J(hVar8, q1VarL8, sVar5);
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar5, iHashCode6, hVar9);
                    }
                    l1.t.J(hVar10, rVarC8, sVar5);
                    boolean zF4 = sVar5.f(cVar2);
                    Object objQ5 = sVar5.Q();
                    if (zF4 || objQ5 == l1.m.f39353a) {
                        objQ5 = new bt.g(cVar2, 24);
                        sVar5.o0(objQ5);
                    }
                    iv.a.i(courseCharacter, n2Var.f24030b, (fz.a) objQ5, sVar5, 0);
                    sVar5.p(true);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                break;
            case 3:
                String str = (String) n2Var.f24031c;
                String str2 = (String) n2Var.f24032d;
                j0.q PressableCard = (j0.q) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(PressableCard, "$this$PressableCard");
                l1.s sVar6 = (l1.s) nVar4;
                if (sVar6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    z1.r rVarB6 = j0.c.B(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), 48, CropImageView.DEFAULT_ASPECT_RATIO, 2), 10, 8);
                    j0.a2 a2VarA4 = j0.z1.a(j0.i.f35307e, z1.c.M, sVar6, 54);
                    int iHashCode7 = Long.hashCode(sVar6.T);
                    l1.q1 q1VarL9 = sVar6.l();
                    z1.r rVarC9 = z1.a.c(sVar6, rVarB6);
                    y2.k.J.getClass();
                    y2.i iVar7 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar7);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA4, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL9, sVar6);
                    y2.h hVar11 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar6, iHashCode7, hVar11);
                    }
                    l1.t.J(y2.j.f56915d, rVarC9, sVar6);
                    if (oz.q.K0(str)) {
                        i12 = 8;
                        sVar6.d0(34329135);
                    } else {
                        sVar6.d0(48688180);
                        j3.y0 y0VarA = j3.y0.a((j3.y0) sVar6.j(ua.f31167a), ((h1.s1) sVar6.j(h1.v1.f31180a)).f31034q, fr.j3.A(24), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
                        s0.g gVar2 = new s0.g(fr.j3.A(12), fr.j3.A(24), fr.j3.A(1));
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        i12 = 8;
                        iu.k.c(str, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), y0VarA, 0, false, 1, 0, gVar2, sVar6, 1572864, 184);
                    }
                    sVar6.p(false);
                    j3.y0 y0Var3 = (j3.y0) sVar6.j(ua.f31167a);
                    boolean z16 = n2Var.f24030b;
                    j3.y0 y0VarA2 = j3.y0.a(y0Var3, ((h1.s1) sVar6.j(h1.v1.f31180a)).f31036s, z16 ? fr.j3.A(18) : fr.j3.A(15), z16 ? n3.s.K : n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
                    s0.g gVar3 = new s0.g(fr.j3.A(i12), z16 ? fr.j3.A(18) : fr.j3.A(15), fr.j3.A(1));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.c(str2, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), y0VarA2, 0, false, 1, 0, gVar3, sVar6, 1572864, 184);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                break;
            case 4:
                ae aeVar = (ae) n2Var.f24031c;
                fz.a aVar = (fz.a) n2Var.f24032d;
                l0.c item = (l0.c) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar7 = (l1.s) nVar5;
                if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z1.r rVarE2 = j0.e2.e(z1.o.f58481a, 1.0f);
                    j0.a2 a2VarA5 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar7, 48);
                    int iHashCode8 = Long.hashCode(sVar7.T);
                    l1.q1 q1VarL10 = sVar7.l();
                    z1.r rVarC10 = z1.a.c(sVar7, rVarE2);
                    y2.k.J.getClass();
                    y2.i iVar8 = y2.j.f56913b;
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar8);
                    } else {
                        sVar7.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA5, sVar7);
                    l1.t.J(y2.j.f56916e, q1VarL10, sVar7);
                    y2.h hVar12 = y2.j.f56918g;
                    if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode8))) {
                        defpackage.e.A(iHashCode8, sVar7, iHashCode8, hVar12);
                    }
                    l1.t.J(y2.j.f56915d, rVarC10, sVar7);
                    String strD0 = ub.a.d0(R.string.srs_future_reviews_selected_count, new Object[]{Integer.valueOf(aeVar.c())}, sVar7);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(strD0, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar7.j(fc.f30256a)).f30178k, sVar7, 0, 0, 65532);
                    k7.m(aVar, null, !n2Var.f24030b, null, null, null, t1.e.d(-1174922607, new l6(aeVar, 1), sVar7), sVar7, 805306368, 506);
                    sVar7.p(true);
                } else {
                    sVar7.W();
                }
                break;
            case 5:
                fz.c cVar3 = (fz.c) n2Var.f24031c;
                ArrayList arrayList = (ArrayList) n2Var.f24032d;
                m0.l item2 = (m0.l) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar8 = (l1.s) nVar6;
                if (sVar8.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    float f14 = 16;
                    z1.o oVar4 = z1.o.f58481a;
                    z1.r rVarD2 = j0.c.D(oVar4, f14, 22, f14, 14);
                    j0.a2 a2VarA6 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar8, 48);
                    int iHashCode9 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL11 = sVar8.l();
                    z1.r rVarC11 = z1.a.c(sVar8, rVarD2);
                    y2.k.J.getClass();
                    y2.i iVar9 = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar9);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA6, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL11, sVar8);
                    y2.h hVar13 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar8, iHashCode9, hVar13);
                    }
                    l1.t.J(y2.j.f56915d, rVarC11, sVar8);
                    String strE0 = ub.a.e0(sVar8, R.string.languages);
                    l1.d0 d0Var3 = ua.f31167a;
                    ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar8.j(d0Var3), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar8, 0, 0, 65534);
                    l1.s sVar9 = sVar8;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar9);
                    if (n2Var.f24030b) {
                        sVar9.d0(628959488);
                    } else {
                        sVar9.d0(635348371);
                        String strE1 = ub.a.e0(sVar9, R.string.view_all);
                        j3.y0 y0Var4 = (j3.y0) sVar9.j(d0Var3);
                        long jA = fr.j3.A(12);
                        l1.c3 c3Var3 = h1.v1.f31180a;
                        j3.y0 y0VarA3 = j3.y0.a(y0Var4, ((h1.s1) sVar9.j(c3Var3)).f31036s, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                        boolean zF5 = sVar9.f(cVar3) | sVar9.h(arrayList);
                        Object objQ6 = sVar9.Q();
                        if (zF5 || objQ6 == l1.m.f39353a) {
                            objQ6 = new l1.z1(27, cVar3, arrayList);
                            sVar9.o0(objQ6);
                        }
                        ua.b(strE1, iu.k.q(6, 7, (fz.a) objQ6, sVar9, oVar4, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA3, sVar9, 0, 0, 65532);
                        h1.r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar9, 0), null, j0.e2.n(oVar4, 18), ((h1.s1) sVar9.j(c3Var3)).f31036s, sVar9, 432, 0);
                        sVar9 = sVar9;
                    }
                    sVar9.p(false);
                    sVar9.p(true);
                } else {
                    sVar8.W();
                }
                break;
            default:
                fz.a aVar2 = (fz.a) n2Var.f24031c;
                fz.a aVar3 = (fz.a) n2Var.f24032d;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar10 = (l1.s) nVar7;
                if (sVar10.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    z1.h hVar14 = z1.c.P;
                    z1.o oVar5 = z1.o.f58481a;
                    float f15 = 16;
                    z1.r rVarC12 = j0.c.C(j0.e2.e(oVar5, 1.0f), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar14, sVar10, 48);
                    int iHashCode10 = Long.hashCode(sVar10.T);
                    l1.q1 q1VarL12 = sVar10.l();
                    z1.r rVarC13 = z1.a.c(sVar10, rVarC12);
                    y2.k.J.getClass();
                    y2.i iVar10 = y2.j.f56913b;
                    sVar10.h0();
                    if (sVar10.S) {
                        sVar10.k(iVar10);
                    } else {
                        sVar10.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar10);
                    l1.t.J(y2.j.f56916e, q1VarL12, sVar10);
                    y2.h hVar15 = y2.j.f56918g;
                    if (sVar10.S || !kotlin.jvm.internal.m.a(sVar10.Q(), Integer.valueOf(iHashCode10))) {
                        defpackage.e.A(iHashCode10, sVar10, iHashCode10, hVar15);
                    }
                    l1.t.J(y2.j.f56915d, rVarC13, sVar10);
                    d0.n.c(se.k.y(R.drawable.ic_deer_quit_cry, sVar10, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 48, 124);
                    boolean z17 = n2Var.f24030b;
                    if (z17) {
                        i13 = -712975045;
                        i14 = R.string.review_quit_title;
                    } else {
                        i13 = -712887749;
                        i14 = R.string.lesson_quit_title;
                    }
                    String strM = ep.a.m(sVar10, i13, i14, sVar10, false);
                    l1.d0 d0Var4 = ua.f31167a;
                    ua.b(strM, j0.c.A(oVar5, f15), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar10.j(d0Var4), 0L, fr.j3.A(20), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar10, 48, 0, 65532);
                    if (z17) {
                        i15 = -712548423;
                        i16 = R.string.review_quit_message;
                    } else {
                        i15 = -712459143;
                        i16 = R.string.lesson_quit_message;
                    }
                    ua.b(ep.a.m(sVar10, i15, i16, sVar10, false), j0.c.E(oVar5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 26, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar10.j(d0Var4), ((h1.s1) sVar10.j(h1.v1.f31180a)).f31036s, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar10, 48, 0, 65532);
                    iu.k.e(aVar2, j0.e2.e(j0.c.E(j0.c.C(oVar5, f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, 7), 1.0f), false, 0L, null, t1.e.d(1333123434, new h(z17, 4), sVar10), sVar10, 196656, 28);
                    k7.m(aVar3, j0.e2.e(j0.c.E(j0.c.C(oVar5, f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, 7), 1.0f), false, null, null, null, t1.e.d(-1918202824, new h(z17, 5), sVar10), sVar10, 805306416, 508);
                    sVar10.p(true);
                } else {
                    sVar10.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n2(Object obj, boolean z11, Object obj2, int i11) {
        this.f24029a = i11;
        this.f24031c = obj;
        this.f24030b = z11;
        this.f24032d = obj2;
    }

    public /* synthetic */ n2(boolean z11, qy.e eVar, Object obj, int i11) {
        this.f24029a = i11;
        this.f24030b = z11;
        this.f24031c = eVar;
        this.f24032d = obj;
    }
}
