package bp;

import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4548e;

    public e1(ArrayList arrayList, String str, fz.c cVar, ArrayList arrayList2) {
        this.f4544a = 0;
        this.f4546c = arrayList;
        this.f4548e = str;
        this.f4545b = cVar;
        this.f4547d = arrayList2;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f4544a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    LocateLanguageItem locateLanguageItem = (LocateLanguageItem) ((ArrayList) this.f4546c).get(iIntValue);
                    sVar.d0(1126424867);
                    l1.t.a(z2.g1.f58552n.a(kotlin.jvm.internal.m.a(locateLanguageItem.getLocate(), "ar") ? v3.m.Rtl : v3.m.Ltr), t1.e.d(1310533097, new c1((fz.c) this.f4545b, locateLanguageItem, (ArrayList) this.f4547d, kotlin.jvm.internal.m.a(locateLanguageItem.getLocate(), (String) this.f4548e)), sVar), sVar, 56);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l0.c cVar2 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                fz.c cVar3 = (fz.c) this.f4545b;
                l1.b1 b1Var = (l1.b1) this.f4548e;
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    CourseWord courseWord = (CourseWord) this.f4546c.get(iIntValue3);
                    sVar2.d0(1534689000);
                    boolean z11 = (((ht.l) this.f4547d) instanceof ht.e) && ((Number) b1Var.getValue()).longValue() == courseWord.getWordId();
                    boolean zF = sVar2.f(cVar3);
                    Object objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new dt.m4(cVar3, b1Var, 0);
                        sVar2.o0(objQ);
                    }
                    dt.e.a(courseWord, z11, (fz.c) objQ, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l0.c cVar4 = (l0.c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                fz.c cVar5 = (fz.c) this.f4547d;
                fz.c cVar6 = (fz.c) this.f4545b;
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(cVar4) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    kr.n nVar4 = (kr.n) this.f4546c.get(iIntValue5);
                    sVar3.d0(-1324474286);
                    boolean zF2 = sVar3.f(cVar6) | sVar3.f(nVar4);
                    Object objQ2 = sVar3.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new jr.n(cVar6, nVar4, 0);
                        sVar3.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zF3 = sVar3.f(cVar5) | sVar3.f(nVar4);
                    Object objQ3 = sVar3.Q();
                    if (zF3 || objQ3 == gVar) {
                        objQ3 = new jr.n(cVar5, nVar4, 1);
                        sVar3.o0(objQ3);
                    }
                    jr.a.h(nVar4, iIntValue5, aVar, (fz.a) objQ3, null, sVar3, i13 & 112, 16);
                    if (iIntValue5 != ((kr.l) this.f4548e).f38516b.size() - 1) {
                        sVar3.d0(-1324236920);
                        k7.g(j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1, 0L, sVar3, 54, 4);
                    } else {
                        sVar3.d0(-1335961678);
                    }
                    sVar3.p(false);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                l0.c cVar7 = (l0.c) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l1.n nVar5 = (l1.n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                l1.b1 b1Var2 = (l1.b1) this.f4545b;
                l1.b1 b1Var3 = (l1.b1) this.f4548e;
                rz.b0 b0Var = (rz.b0) this.f4547d;
                if ((iIntValue8 & 6) == 0) {
                    i14 = (((l1.s) nVar5).f(cVar7) ? 4 : 2) | iIntValue8;
                } else {
                    i14 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((l1.s) nVar5).d(iIntValue7) ? 32 : 16;
                }
                l1.s sVar4 = (l1.s) nVar5;
                if (sVar4.T(i14 & 1, (i14 & 147) != 146)) {
                    rt.m2 m2Var = (rt.m2) this.f4546c.get(iIntValue7);
                    sVar4.d0(-126249868);
                    z1.i iVar = z1.c.M;
                    z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar4, 48);
                    int iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    boolean z12 = m2Var.f50052c;
                    boolean zH = sVar4.h(b0Var) | sVar4.f(b1Var3) | sVar4.f(m2Var) | sVar4.f(b1Var2);
                    Object objQ4 = sVar4.Q();
                    if (zH || objQ4 == l1.m.f39353a) {
                        objQ4 = new mt.y(b0Var, m2Var, b1Var3, b1Var2);
                        sVar4.o0(objQ4);
                    }
                    h1.e1.a(z12, (fz.c) objQ4, null, false, null, sVar4, 0, 60);
                    ua.b(m2Var.f50051b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar4.j(fc.f30256a)).f30175h, sVar4, 0, 0, 65534);
                    sVar4.p(true);
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l0.c cVar8 = (l0.c) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l1.n nVar6 = (l1.n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                fz.c cVar9 = (fz.c) this.f4545b;
                if ((iIntValue10 & 6) == 0) {
                    i15 = (((l1.s) nVar6).f(cVar8) ? 4 : 2) | iIntValue10;
                } else {
                    i15 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((l1.s) nVar6).d(iIntValue9) ? 32 : 16;
                }
                l1.s sVar5 = (l1.s) nVar6;
                if (sVar5.T(i15 & 1, (i15 & 147) != 146)) {
                    rt.d5 d5Var = (rt.d5) this.f4546c.get(iIntValue9);
                    sVar5.d0(1643933085);
                    rt.w4 w4Var = ((rt.b5) this.f4547d).f49511d;
                    boolean zF4 = sVar5.f(d5Var) | sVar5.f(cVar9);
                    Object objQ5 = sVar5.Q();
                    if (zF4 || objQ5 == l1.m.f39353a) {
                        objQ5 = new jr.j0(d5Var, cVar9, (l1.b1) this.f4548e, 1);
                        sVar5.o0(objQ5);
                    }
                    mt.l5.r(d5Var, w4Var, (fz.a) objQ5, sVar5, 0);
                    sVar5.p(false);
                } else {
                    sVar5.W();
                }
                break;
            default:
                l0.c cVar10 = (l0.c) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                l1.n nVar7 = (l1.n) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                fz.a aVar2 = (fz.a) this.f4548e;
                fz.c cVar11 = (fz.c) this.f4545b;
                zr.h hVar2 = (zr.h) this.f4547d;
                if ((iIntValue12 & 6) == 0) {
                    i16 = (((l1.s) nVar7).f(cVar10) ? 4 : 2) | iIntValue12;
                } else {
                    i16 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i16 |= ((l1.s) nVar7).d(iIntValue11) ? 32 : 16;
                }
                l1.s sVar6 = (l1.s) nVar7;
                if (sVar6.T(i16 & 1, (i16 & 147) != 146)) {
                    CourseCharacter courseCharacter = (CourseCharacter) this.f4546c.get(iIntValue11);
                    sVar6.d0(-1059638860);
                    long characterId = courseCharacter.getCharacterId();
                    zr.g gVar2 = (zr.g) hVar2;
                    Long l9 = gVar2.f59300c;
                    boolean z13 = l9 != null && characterId == l9.longValue();
                    boolean z14 = gVar2.f59301d;
                    boolean zF5 = sVar6.f(cVar11) | sVar6.h(courseCharacter);
                    Object objQ6 = sVar6.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zF5 || objQ6 == gVar3) {
                        objQ6 = new b1(29, cVar11, courseCharacter);
                        sVar6.o0(objQ6);
                    }
                    fz.a aVar3 = (fz.a) objQ6;
                    boolean zF6 = sVar6.f(aVar2);
                    Object objQ7 = sVar6.Q();
                    if (zF6 || objQ7 == gVar3) {
                        objQ7 = new tp.h0(aVar2, 2);
                        sVar6.o0(objQ7);
                    }
                    vr.g.a(courseCharacter, z13, z14, aVar3, (fz.a) objQ7, j0.e2.e(j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1), 1.0f), sVar6, 196608);
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public e1(List list, fz.c cVar, fz.c cVar2, kr.l lVar) {
        this.f4544a = 2;
        this.f4546c = list;
        this.f4545b = cVar;
        this.f4547d = cVar2;
        this.f4548e = lVar;
    }

    public /* synthetic */ e1(List list, Object obj, fz.c cVar, Object obj2, int i11) {
        this.f4544a = i11;
        this.f4546c = list;
        this.f4547d = obj;
        this.f4545b = cVar;
        this.f4548e = obj2;
    }

    public e1(List list, rz.b0 b0Var, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4544a = 3;
        this.f4546c = list;
        this.f4547d = b0Var;
        this.f4548e = b1Var;
        this.f4545b = b1Var2;
    }
}
