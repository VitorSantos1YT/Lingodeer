package bt;

import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p3 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f5833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5834c;

    public /* synthetic */ p3(int i11, fz.c cVar, List list) {
        this.f5832a = i11;
        this.f5833b = cVar;
        this.f5834c = list;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0573  */
    /* JADX WARN: Code duplicated, block: B:132:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:135:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:144:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:147:0x062f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        l1.s sVar;
        j0.u0 u0Var;
        y2.h hVar;
        int i11;
        boolean zH;
        Object objQ;
        int i12;
        boolean z11;
        b0.i1 i1Var;
        boolean z12;
        int iHashCode;
        boolean z13;
        Throwable th2;
        long j11;
        int i13 = this.f5832a;
        z1.o oVar = z1.o.f58481a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i14 = 2;
        l1.g gVar = l1.m.f39353a;
        Throwable th3 = null;
        List list = this.f5834c;
        fz.c cVar = this.f5833b;
        boolean z14 = false;
        Object[] objArr = 0;
        switch (i13) {
            case 0:
                b0.i1 i1Var2 = null;
                j0.u0 FlowRow = (j0.u0) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(FlowRow) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CourseWord courseWord = (CourseWord) it.next();
                        if (kotlin.jvm.internal.m.a(courseWord.getWord(), " ")) {
                            u0Var = FlowRow;
                            sVar = sVar2;
                            i11 = iIntValue;
                            z12 = z14;
                            i1Var = i1Var2;
                        } else {
                            boolean z15 = courseWord.getWordType() != 1 ? true : z14;
                            boolean zF = sVar2.f(cVar) | sVar2.h(courseWord);
                            Object objQ2 = sVar2.Q();
                            if (zF || objQ2 == gVar) {
                                objQ2 = new s0(cVar, courseWord, 4);
                                sVar2.o0(objQ2);
                            }
                            z1.o oVar2 = z1.o.f58481a;
                            l1.s sVar3 = sVar2;
                            z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ2, sVar3, oVar2, z15);
                            sVar = sVar3;
                            z1.j jVar = z1.c.f58463a;
                            w2.q0 q0VarD = j0.o.d(jVar, z14);
                            int iHashCode2 = Long.hashCode(sVar.T);
                            l1.q1 q1VarL = sVar.l();
                            z1.r rVarC = z1.a.c(sVar, rVarQ);
                            y2.k.J.getClass();
                            y2.i iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            y2.h hVar2 = y2.j.f56917f;
                            l1.t.J(hVar2, q0VarD, sVar);
                            y2.h hVar3 = y2.j.f56916e;
                            l1.t.J(hVar3, q1VarL, sVar);
                            y2.h hVar4 = y2.j.f56918g;
                            if (sVar.S) {
                                u0Var = FlowRow;
                            } else {
                                u0Var = FlowRow;
                                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                                }
                                hVar = y2.j.f56915d;
                                l1.t.J(hVar, rVarC, sVar);
                                r0.e eVarD = r0.f.d(10);
                                l1.c3 c3Var = h1.v1.f31180a;
                                i11 = iIntValue;
                                h1.t0 t0VarP = h1.k7.p(((h1.s1) sVar.j(c3Var)).f31033p, sVar, 0);
                                d0.v vVarA = d0.n.a(((h1.s1) sVar.j(c3Var)).A, 2);
                                z1.r rVarE = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 8, 4, CropImageView.DEFAULT_ASPECT_RATIO, 9);
                                zH = sVar.h(courseWord);
                                objQ = sVar.Q();
                                if (!zH || objQ == gVar) {
                                    i12 = 0;
                                    objQ = new r3(courseWord, i12);
                                    sVar.o0(objQ);
                                } else {
                                    i12 = 0;
                                }
                                h1.k7.d(d2.h.e(rVarE, (fz.c) objQ), eVarD, t0VarP, null, vVarA, t1.e.d(-1187136521, new s3(courseWord, i12), sVar), sVar, 196608, 8);
                                if (courseWord.getWordType() != 1) {
                                    sVar.d0(-1537134808);
                                    z1.r rVarA = j0.r.f35391a.a(oVar2, z1.c.f58465c);
                                    w2.q0 q0VarD2 = j0.o.d(jVar, false);
                                    iHashCode = Long.hashCode(sVar.T);
                                    l1.q1 q1VarL2 = sVar.l();
                                    z1.r rVarC2 = z1.a.c(sVar, rVarA);
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar);
                                    } else {
                                        sVar.r0();
                                    }
                                    l1.t.J(hVar2, q0VarD2, sVar);
                                    l1.t.J(hVar3, q1VarL2, sVar);
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                                    }
                                    l1.t.J(hVar, rVarC2, sVar);
                                    if (courseWord.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    i1Var = i1Var2;
                                    a0.j0.b(u0Var, z13, null, a0.f1.g(i1Var, CropImageView.DEFAULT_ASPECT_RATIO, 7), a0.f1.h(i1Var, CropImageView.DEFAULT_ASPECT_RATIO, 7), null, t1.e.d(-580972674, new at.a(21), sVar), sVar, (i11 & 14) | 1600512, 18);
                                    z11 = true;
                                    sVar.p(true);
                                    z12 = false;
                                } else {
                                    z11 = true;
                                    i1Var = i1Var2;
                                    z12 = false;
                                    sVar.d0(-1549559267);
                                }
                                sVar.p(z12);
                                sVar.p(z11);
                            }
                            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                            hVar = y2.j.f56915d;
                            l1.t.J(hVar, rVarC, sVar);
                            r0.e eVarD2 = r0.f.d(10);
                            l1.c3 c3Var2 = h1.v1.f31180a;
                            i11 = iIntValue;
                            h1.t0 t0VarP2 = h1.k7.p(((h1.s1) sVar.j(c3Var2)).f31033p, sVar, 0);
                            d0.v vVarA2 = d0.n.a(((h1.s1) sVar.j(c3Var2)).A, 2);
                            z1.r rVarE2 = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 8, 4, CropImageView.DEFAULT_ASPECT_RATIO, 9);
                            zH = sVar.h(courseWord);
                            objQ = sVar.Q();
                            if (zH) {
                                i12 = 0;
                                objQ = new r3(courseWord, i12);
                                sVar.o0(objQ);
                            } else {
                                i12 = 0;
                                objQ = new r3(courseWord, i12);
                                sVar.o0(objQ);
                            }
                            h1.k7.d(d2.h.e(rVarE2, (fz.c) objQ), eVarD2, t0VarP2, null, vVarA2, t1.e.d(-1187136521, new s3(courseWord, i12), sVar), sVar, 196608, 8);
                            if (courseWord.getWordType() != 1) {
                                sVar.d0(-1537134808);
                                z1.r rVarA2 = j0.r.f35391a.a(oVar2, z1.c.f58465c);
                                w2.q0 q0VarD3 = j0.o.d(jVar, false);
                                iHashCode = Long.hashCode(sVar.T);
                                l1.q1 q1VarL3 = sVar.l();
                                z1.r rVarC3 = z1.a.c(sVar, rVarA2);
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(hVar2, q0VarD3, sVar);
                                l1.t.J(hVar3, q1VarL3, sVar);
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                                }
                                l1.t.J(hVar, rVarC3, sVar);
                                if (courseWord.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                i1Var = i1Var2;
                                a0.j0.b(u0Var, z13, null, a0.f1.g(i1Var, CropImageView.DEFAULT_ASPECT_RATIO, 7), a0.f1.h(i1Var, CropImageView.DEFAULT_ASPECT_RATIO, 7), null, t1.e.d(-580972674, new at.a(21), sVar), sVar, (i11 & 14) | 1600512, 18);
                                z11 = true;
                                sVar.p(true);
                                z12 = false;
                            } else {
                                z11 = true;
                                i1Var = i1Var2;
                                z12 = false;
                                sVar.d0(-1549559267);
                            }
                            sVar.p(z12);
                            sVar.p(z11);
                        }
                        it = it;
                        i1Var2 = i1Var;
                        z14 = z12;
                        sVar2 = sVar;
                        cVar = cVar;
                        FlowRow = u0Var;
                        iIntValue = i11;
                    }
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 1:
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i15 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    boolean zF2 = sVar4.f(cVar) | sVar4.h(list);
                    Object objQ3 = sVar4.Q();
                    if (zF2 || objQ3 == gVar) {
                        objQ3 = new dl.m(objArr == true ? 1 : 0, cVar, list);
                        sVar4.o0(objQ3);
                    }
                    z1.r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ3, 15);
                    j0.u uVarA = j0.t.a(j0.i.f35310h, z1.c.P, sVar4, 54);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar4);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                    }
                    Iterator itO = com.google.android.material.datepicker.d.o(sVar4, rVarC4, y2.j.f56915d, -1254005580, list);
                    int i16 = 0;
                    while (itO.hasNext()) {
                        Object next = itO.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            Throwable th4 = th3;
                            ns.o.V();
                            throw th4;
                        }
                        String str = (String) next;
                        if (i16 < i14) {
                            sVar4.d0(-1094679444);
                            sVar4.d0(-1974973248);
                            StringBuilder sb2 = new StringBuilder(16);
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            new ArrayList();
                            sb2.append(str);
                            int iI0 = oz.q.I0(str, "/", 0, false, 6);
                            if (iI0 != -1) {
                                sVar4.d0(1179544714);
                                arrayList.add(new j3.d(iI0, str.length(), 8, new j3.p0(se.i.k(sVar4, R.color.second_black), fr.j3.A(12), (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65532), null));
                            } else {
                                sVar4.d0(1162381905);
                            }
                            sVar4.p(false);
                            String string = sb2.toString();
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            int size = arrayList.size();
                            int i18 = 0;
                            while (i18 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i18)).a(sb2.length()));
                                i18++;
                                th3 = th3;
                            }
                            th2 = th3;
                            j3.h hVar6 = new j3.h(string, arrayList2);
                            sVar4.p(false);
                            j3.y0 y0Var = (j3.y0) sVar4.j(ua.f31167a);
                            if (i16 == 1) {
                                sVar4.d0(-1974948192);
                                long jK = se.i.k(sVar4, R.color.second_black);
                                sVar4.p(false);
                                j11 = jK;
                            } else {
                                sVar4.d0(-1974946649);
                                long jK2 = se.i.k(sVar4, R.color.primary_black);
                                sVar4.p(false);
                                j11 = jK2;
                            }
                            ua.c(hVar6, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, j3.y0.a(y0Var, j11, i16 == 0 ? fr.j3.A(18) : fr.j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar4, 0, 0, 131070);
                        } else {
                            th2 = th3;
                            sVar4.d0(-1111604886);
                        }
                        sVar4.p(false);
                        i16 = i17;
                        th3 = th2;
                        i14 = 2;
                    }
                    sVar4.p(false);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0Var;
            default:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar5 = (l1.s) nVar3;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
                    boolean zF3 = sVar5.f(cVar) | sVar5.h(list);
                    Object objQ4 = sVar5.Q();
                    if (zF3 || objQ4 == gVar) {
                        objQ4 = new dl.m(i14, cVar, list);
                        sVar5.o0(objQ4);
                    }
                    z1.r rVarO2 = d0.n.o(rVarD2, false, null, (fz.a) objQ4, 15);
                    j0.u uVarA2 = j0.t.a(j0.i.f35310h, z1.c.P, sVar5, 54);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL5 = sVar5.l();
                    z1.r rVarC5 = z1.a.c(sVar5, rVarO2);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar3);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL5, sVar5);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar7);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar5);
                    sVar5.d0(1375520562);
                    StringBuilder sb3 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    String str2 = (String) list.get(0);
                    sb3.append(str2);
                    int iI1 = oz.q.I0(str2, "/", 0, false, 6);
                    if (iI1 != -1) {
                        sVar5.d0(-417703466);
                        arrayList3.add(new j3.d(iI1, str2.length(), 8, new j3.p0(se.i.k(sVar5, R.color.second_black), fr.j3.A(12), (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65532), null));
                    } else {
                        sVar5.d0(-443006627);
                    }
                    sVar5.p(false);
                    String string2 = sb3.toString();
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size2 = arrayList3.size();
                    for (int i21 = 0; i21 < size2; i21++) {
                        arrayList4.add(((j3.d) arrayList3.get(i21)).a(sb3.length()));
                    }
                    j3.h hVar8 = new j3.h(string2, arrayList4);
                    sVar5.p(false);
                    l1.d0 d0Var = ua.f31167a;
                    ua.c(hVar8, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, j3.y0.a((j3.y0) sVar5.j(d0Var), se.i.k(sVar5, R.color.primary_black), fr.j3.A(16), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar5, 0, 0, 131070);
                    ua.b((String) list.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar5.j(d0Var), se.i.k(sVar5, R.color.second_black), fr.j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar5, 0, 0, 65534);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ p3(List list, fz.c cVar) {
        this.f5832a = 0;
        this.f5834c = list;
        this.f5833b = cVar;
    }
}
