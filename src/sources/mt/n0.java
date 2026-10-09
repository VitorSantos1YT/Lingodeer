package mt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41679e;

    public /* synthetic */ n0(WordSentenceCharacterType wordSentenceCharacterType, boolean z11, boolean z12, z1.r rVar, int i11, int i12) {
        this.f41675a = i12;
        this.f41676b = wordSentenceCharacterType;
        this.f41677c = z11;
        this.f41678d = z12;
        this.f41679e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.g1 g1Var;
        boolean z11;
        OptionItemSelectedState optionItemSelectedState;
        boolean z12;
        long jC;
        l1.b3 b3VarA;
        l1.s sVar;
        boolean z13;
        long jC2;
        l1.s sVar2;
        l1.b3 b3VarA2;
        boolean z14;
        boolean z15;
        switch (this.f41675a) {
            case 0:
                ((Integer) obj2).getClass();
                b1.d((WordSentenceCharacterType) this.f41676b, this.f41677c, this.f41678d, (z1.r) this.f41679e, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b1.d((WordSentenceCharacterType) this.f41676b, this.f41677c, this.f41678d, (z1.r) this.f41679e, (l1.n) obj, l1.t.M(1));
                break;
            default:
                List list = (List) this.f41676b;
                fz.c cVar = (fz.c) this.f41679e;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z16 = true;
                int i11 = 2;
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j3.y0 y0Var = (j3.y0) sVar3.j(ua.f31167a);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CourseWord courseWord = (CourseWord) it.next();
                        Object objQ = sVar3.Q();
                        l1.g gVar = l1.m.f39353a;
                        if (objQ == gVar) {
                            objQ = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
                        }
                        l1.g1 g1Var2 = (l1.g1) objQ;
                        Object objQ2 = sVar3.Q();
                        if (objQ2 == gVar) {
                            objQ2 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar3);
                        }
                        l1.g1 g1Var3 = (l1.g1) objQ2;
                        boolean z17 = this.f41677c;
                        boolean z18 = this.f41678d;
                        boolean z19 = (z17 && courseWord.getSelectedState() == OptionItemSelectedState.DEFAULT && !z18) ? z16 : false;
                        OptionItemSelectedState selectedState = courseWord.getSelectedState();
                        OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                        if (selectedState != optionItemSelectedState2) {
                            sVar3.d0(2006285933);
                            int i12 = bt.y0.f6204a[courseWord.getSelectedState().ordinal()];
                            if (i12 == z16) {
                                l1.s sVar4 = sVar3;
                                g1Var = g1Var3;
                                z11 = z18;
                                optionItemSelectedState = optionItemSelectedState2;
                                sVar4.d0(2006372950);
                                b3VarA = a0.t1.a(ob.f.x((h1.s1) sVar4.j(h1.v1.f31180a), sVar4), null, BuildConfig.VERSION_NAME, sVar4, 384, 10);
                                sVar = sVar4;
                                z15 = false;
                                sVar.p(false);
                            } else if (i12 != i11) {
                                sVar3.d0(2006943939);
                                long j11 = ((h1.s1) sVar3.j(h1.v1.f31180a)).A;
                                l1.s sVar5 = sVar3;
                                g1Var = g1Var3;
                                z11 = z18;
                                optionItemSelectedState = optionItemSelectedState2;
                                b3VarA = a0.t1.a(j11, null, BuildConfig.VERSION_NAME, sVar5, 384, 10);
                                sVar = sVar5;
                                z15 = false;
                                sVar.p(false);
                            } else {
                                l1.s sVar6 = sVar3;
                                g1Var = g1Var3;
                                z11 = z18;
                                optionItemSelectedState = optionItemSelectedState2;
                                sVar6.d0(2006672472);
                                b3VarA = a0.t1.a(ob.f.z((h1.s1) sVar6.j(h1.v1.f31180a), sVar6), null, BuildConfig.VERSION_NAME, sVar6, 384, 10);
                                sVar = sVar6;
                                z15 = false;
                                sVar.p(false);
                            }
                            sVar.p(z15);
                        } else {
                            l1.s sVar7 = sVar3;
                            g1Var = g1Var3;
                            z11 = z18;
                            optionItemSelectedState = optionItemSelectedState2;
                            sVar7.d0(2007191846);
                            if (z11) {
                                sVar7.d0(64754219);
                                jC = g2.x.c(((h1.s1) sVar7.j(h1.v1.f31180a)).f31033p, 0.5f);
                                z12 = false;
                                sVar7.p(false);
                            } else {
                                z12 = false;
                                sVar7.d0(64757472);
                                jC = ((h1.s1) sVar7.j(h1.v1.f31180a)).f31033p;
                                sVar7.p(false);
                            }
                            boolean z20 = z12;
                            b3VarA = a0.t1.a(jC, null, BuildConfig.VERSION_NAME, sVar7, 384, 10);
                            sVar = sVar7;
                            sVar.p(z20);
                        }
                        l1.b3 b3Var = b3VarA;
                        if (courseWord.getSelectedState() != optionItemSelectedState) {
                            sVar.d0(2007685769);
                            int i13 = bt.y0.f6204a[courseWord.getSelectedState().ordinal()];
                            if (i13 == z16) {
                                sVar.d0(2007772724);
                                l1.s sVar8 = sVar;
                                b3VarA2 = a0.t1.a(ob.f.t((h1.s1) sVar.j(h1.v1.f31180a), sVar), null, BuildConfig.VERSION_NAME, sVar8, 384, 10);
                                sVar2 = sVar8;
                                z14 = false;
                                sVar2.p(false);
                            } else if (i13 != 2) {
                                sVar.d0(2008347619);
                                l1.s sVar9 = sVar;
                                b3VarA2 = a0.t1.a(((h1.s1) sVar.j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, sVar9, 384, 10);
                                sVar2 = sVar9;
                                z14 = false;
                                sVar2.p(false);
                            } else {
                                sVar.d0(2008074230);
                                l1.s sVar10 = sVar;
                                b3VarA2 = a0.t1.a(ob.f.u((h1.s1) sVar.j(h1.v1.f31180a), sVar), null, BuildConfig.VERSION_NAME, sVar10, 384, 10);
                                sVar2 = sVar10;
                                z14 = false;
                                sVar2.p(false);
                            }
                            sVar2.p(z14);
                        } else {
                            sVar.d0(2008595681);
                            if (z11) {
                                sVar.d0(64799595);
                                jC2 = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, 0.5f);
                                z13 = false;
                                sVar.p(false);
                            } else {
                                z13 = false;
                                sVar.d0(64802850);
                                jC2 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                                sVar.p(false);
                            }
                            l1.s sVar11 = sVar;
                            l1.b3 b3VarA3 = a0.t1.a(jC2, null, BuildConfig.VERSION_NAME, sVar11, 384, 10);
                            sVar2 = sVar11;
                            sVar2.p(z13);
                            b3VarA2 = b3VarA3;
                        }
                        l1.c3 c3Var = h1.v1.f31180a;
                        long j12 = ((h1.s1) sVar2.j(c3Var)).A;
                        float f5 = 10;
                        Iterator it2 = it;
                        r0.e eVarD = r0.f.d(f5);
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarH = d0.n.h(oVar, j12, eVarD);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        boolean z21 = z19;
                        fz.c cVar2 = cVar;
                        int iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarH);
                        y2.k.J.getClass();
                        j3.y0 y0Var2 = y0Var;
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar2);
                        boolean zC = sVar2.c(g1Var2.l()) | sVar2.d(courseWord.getSelectedState().ordinal());
                        Object objQ3 = sVar2.Q();
                        if (zC || objQ3 == gVar) {
                            objQ3 = Float.valueOf(courseWord.getSelectedState() == OptionItemSelectedState.SELECTED ? 0.0f : 1.0f);
                            sVar2.o0(objQ3);
                        }
                        float fFloatValue = ((Number) objQ3).floatValue();
                        r0.e eVarD2 = r0.f.d(f5);
                        h1.t0 t0VarP = k7.p(((g2.x) b3Var.getValue()).f28624a, sVar2, 0);
                        l1.b3 b3Var2 = b3VarA2;
                        d0.v vVarA = d0.n.a(((h1.s1) sVar2.j(c3Var)).A, 2);
                        Object objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new bt.v0(g1Var2, g1Var, 0);
                            sVar2.o0(objQ4);
                        }
                        z1.r rVarA = d2.h.a(g2.f0.q(oVar, (fz.c) objQ4), fFloatValue);
                        cVar = cVar2;
                        y0Var = y0Var2;
                        l1.s sVar12 = sVar2;
                        k7.d(rVarA, eVarD2, t0VarP, null, vVarA, t1.e.d(-1798446445, new bt.w0(courseWord, z21, cVar, y0Var, b3Var2), sVar2), sVar12, 196608, 8);
                        sVar12.p(true);
                        i11 = 2;
                        z16 = true;
                        sVar3 = sVar12;
                        it = it2;
                    }
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n0(List list, boolean z11, boolean z12, fz.c cVar) {
        this.f41675a = 2;
        this.f41676b = list;
        this.f41677c = z11;
        this.f41678d = z12;
        this.f41679e = cVar;
    }
}
