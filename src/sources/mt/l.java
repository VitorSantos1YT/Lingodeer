package mt;

import com.lingodeer.data.model.CourseWord;
import h1.ua;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41602a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41607f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41608t;

    public /* synthetic */ l(int i11, String str, boolean z11, boolean z12, z1.r rVar, fz.a aVar, int i12) {
        this.f41604c = i11;
        this.f41605d = str;
        this.f41606e = z11;
        this.f41607f = z12;
        this.f41603b = rVar;
        this.f41608t = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        boolean z12;
        boolean z13;
        j3.y0 y0Var;
        String strSubstring;
        int i11;
        switch (this.f41602a) {
            case 0:
                String str = (String) this.f41605d;
                z1.r rVar = (z1.r) this.f41603b;
                ((Integer) obj2).getClass();
                g.k(this.f41604c, l1.t.M(196609), (fz.a) this.f41608t, str, (l1.n) obj, rVar, this.f41606e, this.f41607f);
                break;
            case 1:
                z1.r rVar2 = (z1.r) this.f41603b;
                String str2 = (String) this.f41605d;
                ((Integer) obj2).getClass();
                j6.b(this.f41604c, l1.t.M(1), (fz.a) this.f41608t, str2, (l1.n) obj, rVar2, this.f41606e, this.f41607f);
                break;
            default:
                dt.i5 i5Var = (dt.i5) this.f41605d;
                List list = (List) this.f41603b;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f41608t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                z1.j jVar = z1.c.f58463a;
                boolean z14 = true;
                boolean z15 = false;
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j3.y0 y0Var2 = (j3.y0) sVar.j(ua.f31167a);
                    if (i5Var.f23893a) {
                        sVar.d0(398640770);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            dt.v2.h((CourseWord) it.next(), y0Var2, i5Var.f23894b, sVar, 0);
                        }
                        sVar.p(false);
                    } else if (this.f41606e) {
                        sVar.d0(398961589);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            dt.g4.b((CourseWord) it2.next(), y0Var2, null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                        }
                        sVar.p(false);
                    } else if (((CharSequence) yVar.f38361a).length() == 0) {
                        sVar.d0(399226453);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            dt.g4.b((CourseWord) it3.next(), y0Var2, null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                        }
                        sVar.p(false);
                    } else {
                        sVar.d0(399619254);
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            CourseWord courseWord = (CourseWord) it4.next();
                            String word = courseWord.getWord();
                            int i12 = this.f41604c;
                            boolean z16 = this.f41607f;
                            String strG = dt.v2.g(i12, word, z16);
                            String strG2 = dt.v2.g(i12, courseWord.getZhuYin(), z16);
                            String strG3 = dt.v2.g(i12, courseWord.getLuoMa(), z16);
                            if (courseWord.getWordType() == z14 || kotlin.jvm.internal.m.a(courseWord.getWord(), " ")) {
                                it4 = it4;
                                z11 = z14;
                                j3.y0 y0Var3 = y0Var2;
                                sVar.d0(-759424218);
                                y0Var2 = y0Var3;
                                dt.g4.b(courseWord, y0Var2, null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                                z12 = false;
                                sVar.p(false);
                            } else {
                                int length = ((CharSequence) yVar.f38361a).length();
                                z1.o oVar = z1.o.f58481a;
                                l1.g gVar = l1.m.f39353a;
                                if (length > 0) {
                                    sVar.d0(-759086101);
                                    Objects.toString(yVar.f38361a);
                                    jt.o2 o2VarC = z16 ? o00.a.C((String) yVar.f38361a, courseWord, i12, z14) : null;
                                    if (o2VarC != null) {
                                        z13 = o2VarC.f37094a;
                                    } else {
                                        z13 = (dt.v2.e(yVar, strG) || dt.v2.e(yVar, strG2) || dt.v2.e(yVar, strG3)) ? z14 : false;
                                    }
                                    if (o2VarC != null && (i11 = o2VarC.f37095b) > 0) {
                                        yVar.f38361a = oz.q.y0(i11, (String) yVar.f38361a);
                                    }
                                    if (z13) {
                                        sVar.d0(-757732238);
                                        dt.g4.b(courseWord, y0Var2, null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                                        z12 = false;
                                        sVar.p(false);
                                        y0Var = y0Var2;
                                    } else {
                                        sVar.d0(-757469296);
                                        boolean zF = sVar.f(y0Var2);
                                        Object objQ = sVar.Q();
                                        if (zF || objQ == gVar) {
                                            objQ = new dt.g2(y0Var2, 0);
                                            sVar.o0(objQ);
                                        }
                                        z1.r rVarD = d2.h.d(oVar, (fz.c) objQ);
                                        w2.q0 q0VarD = j0.o.d(jVar, false);
                                        int iHashCode = Long.hashCode(sVar.T);
                                        l1.q1 q1VarL = sVar.l();
                                        z1.r rVarC = z1.a.c(sVar, rVarD);
                                        y2.k.J.getClass();
                                        y2.i iVar = y2.j.f56913b;
                                        sVar.h0();
                                        if (sVar.S) {
                                            sVar.k(iVar);
                                        } else {
                                            sVar.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, q0VarD, sVar);
                                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                                        y2.h hVar = y2.j.f56918g;
                                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                                        j3.y0 y0Var4 = y0Var2;
                                        y0Var = y0Var4;
                                        dt.g4.b(courseWord, j3.y0.a(y0Var4, 0L, 0L, n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                                        sVar.p(true);
                                        if (!z16) {
                                            if (strG.length() > 0 && strG.length() <= ((String) yVar.f38361a).length()) {
                                                strSubstring = ((String) yVar.f38361a).substring(strG.length());
                                                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                            } else if (strG2.length() > 0 && strG2.length() <= ((String) yVar.f38361a).length()) {
                                                strSubstring = ((String) yVar.f38361a).substring(strG2.length());
                                                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                            } else if (strG3.length() <= 0 || strG3.length() > ((String) yVar.f38361a).length()) {
                                                strSubstring = (String) yVar.f38361a;
                                            } else {
                                                strSubstring = ((String) yVar.f38361a).substring(strG3.length());
                                                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                            }
                                            yVar.f38361a = strSubstring;
                                        }
                                        z12 = false;
                                        sVar.p(false);
                                    }
                                    sVar.p(z12);
                                    y0Var2 = y0Var;
                                    z11 = true;
                                } else {
                                    it4 = it4;
                                    j3.y0 y0Var5 = y0Var2;
                                    sVar.d0(-755443601);
                                    boolean zF2 = sVar.f(y0Var5);
                                    Object objQ2 = sVar.Q();
                                    if (zF2 || objQ2 == gVar) {
                                        objQ2 = new dt.g2(y0Var5, 1);
                                        sVar.o0(objQ2);
                                    }
                                    z1.r rVarD2 = d2.h.d(oVar, (fz.c) objQ2);
                                    w2.q0 q0VarD2 = j0.o.d(jVar, false);
                                    int iHashCode2 = Long.hashCode(sVar.T);
                                    l1.q1 q1VarL2 = sVar.l();
                                    z1.r rVarC2 = z1.a.c(sVar, rVarD2);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar2);
                                    } else {
                                        sVar.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar);
                                    dt.g4.b(courseWord, j3.y0.a(y0Var5, 0L, 0L, n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777211), null, false, null, false, false, false, 0, null, sVar, 0, 1020);
                                    z11 = true;
                                    sVar.p(true);
                                    z12 = false;
                                    sVar.p(false);
                                    y0Var2 = y0Var5;
                                }
                            }
                            z15 = z12;
                            z14 = z11;
                            it4 = it4;
                        }
                        sVar.p(z15);
                    }
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l(dt.i5 i5Var, List list, boolean z11, kotlin.jvm.internal.y yVar, boolean z12, int i11) {
        this.f41605d = i5Var;
        this.f41603b = list;
        this.f41606e = z11;
        this.f41608t = yVar;
        this.f41607f = z12;
        this.f41604c = i11;
    }

    public /* synthetic */ l(z1.r rVar, int i11, String str, boolean z11, boolean z12, fz.a aVar, int i12) {
        this.f41603b = rVar;
        this.f41604c = i11;
        this.f41605d = str;
        this.f41606e = z11;
        this.f41607f = z12;
        this.f41608t = aVar;
    }
}
