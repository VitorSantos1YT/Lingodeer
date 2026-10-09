package fu;

import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.v0;
import h1.ua;
import j0.a2;
import j0.e2;
import j0.z1;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import l1.q1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28115d;

    public /* synthetic */ i0(Object obj, int i11, int i12, int i13) {
        this.f28112a = i13;
        this.f28115d = obj;
        this.f28113b = i11;
        this.f28114c = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        y2.h hVar;
        int i11 = this.f28112a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f28114c;
        int i13 = this.f28113b;
        Object obj3 = this.f28115d;
        switch (i11) {
            case 0:
                g2.t tVar = (g2.t) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarG = d0.n.g(e2.d(oVar, 1.0f), tVar, null, 6);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarG);
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
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, sVar);
                    k2.b bVarY = se.k.y(R.drawable.day_streak_share_streaked, sVar, 0);
                    z1.j jVar = z1.c.K;
                    j0.r rVar = j0.r.f35391a;
                    d0.n.c(bVarY, null, rVar.a(oVar, jVar), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarD);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, uVarA, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        hVar = hVar4;
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                    } else {
                        hVar = hVar4;
                    }
                    l1.t.J(hVar5, rVarC2, sVar);
                    float f5 = 18;
                    y2.h hVar6 = hVar;
                    z1.r rVarE = j0.c.E(oVar, f5, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, a2VarA, sVar);
                    l1.t.J(hVar3, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar6);
                    }
                    l1.t.J(hVar5, rVarC3, sVar);
                    d0.n.c(se.k.y(R.drawable.day_streak_share_fire, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                    sVar.d0(-1071983600);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    String strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.s_day_streak), "%s", String.valueOf(i12));
                    sb2.append(strQ0);
                    int iI0 = oz.q.I0(strQ0, String.valueOf(i12), 0, false, 6);
                    arrayList.add(new j3.d(iI0, String.valueOf(i12).length() + iI0, 8, new p0(0L, j3.A(46), n3.s.N, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65529), null));
                    String string = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList2.add(((j3.d) arrayList.get(i14)).a(sb2.length()));
                    }
                    j3.h hVar7 = new j3.h(string, arrayList2);
                    sVar.p(false);
                    l1.d0 d0Var = ua.f31167a;
                    y0 y0Var = (y0) sVar.j(d0Var);
                    long jA = j3.A(30);
                    n3.s sVar2 = n3.s.K;
                    long j11 = g2.x.f28618e;
                    ua.c(hVar7, j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a(y0Var, j11, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 131068);
                    sVar.p(true);
                    float f11 = 20;
                    ua.b(ub.a.e0(sVar, i13), j0.c.E(oVar, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), j11, j3.A(20), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
                    sVar.p(true);
                    d0.n.c(se.k.y(R.drawable.share_logo, sVar, 0), null, e2.p(j0.c.E(rVar.a(oVar, z1.c.f58469t), f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14, 6), 72, f11), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 24624, 104);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                int i15 = PTNewSyllableIntroductionActivity.f21986t;
                ((PTNewSyllableIntroductionActivity) obj3).r(i13, (l1.n) obj, l1.t.M(1 | i12));
                break;
        }
        return b0Var;
    }
}
