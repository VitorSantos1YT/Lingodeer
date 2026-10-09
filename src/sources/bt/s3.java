package bt;

import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s3 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5969b;

    public /* synthetic */ s3(CourseWord courseWord, int i11) {
        this.f5968a = i11;
        this.f5969b = courseWord;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        switch (this.f5968a) {
            case 0:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dt.g4.b(this.f5969b, j3.y0.a(ct.c.b(sVar), 0L, ct.c.c(sVar), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), j0.c.B(z1.o.f58481a, 8, 6), false, null, false, false, false, 0, null, sVar, 384, 1016);
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, a2VarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    float f5 = 12;
                    z1.r rVarC2 = j0.c.C(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    z1.j jVar = z1.c.f58467e;
                    w2.q0 q0VarD = j0.o.d(jVar, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar2);
                    j3.y0 y0VarB = ct.c.b(sVar2);
                    long jC = ct.c.c(sVar2);
                    n3.s sVar3 = n3.s.H;
                    l1.c3 c3Var = h1.v1.f31180a;
                    j3.y0 y0VarA = j3.y0.a(y0VarB, ob.f.t((h1.s1) sVar2.j(c3Var), sVar2), jC, sVar3, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
                    CourseWord courseWord = this.f5969b;
                    dt.g4.b(courseWord, y0VarA, null, false, null, false, false, false, 0, null, sVar2, 0, 1020);
                    l1.s sVar4 = sVar2;
                    sVar4.p(true);
                    if (courseWord.getTranslation().length() > 0) {
                        sVar4.d0(1341567896);
                        h1.k7.n(j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1), CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(ob.f.t((h1.s1) sVar4.j(c3Var), sVar4), 0.3f), sVar4, 6, 2);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarC4 = j0.c.C(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        w2.q0 q0VarD2 = j0.o.d(jVar, false);
                        int iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL3 = sVar4.l();
                        z1.r rVarC5 = z1.a.c(sVar4, rVarC4);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar, q0VarD2, sVar4);
                        l1.t.J(hVar2, q1VarL3, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC5, sVar4);
                        ua.b(courseWord.getTranslation(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar4.j(ua.f31167a), ob.f.t((h1.s1) sVar4.j(c3Var), sVar4), ((ct.b) sVar4.j(ct.c.f22476a)).f22468c, n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar4, 0, 0, 65534);
                        sVar4 = sVar4;
                        sVar4.p(true);
                        z11 = false;
                    } else {
                        z11 = false;
                        sVar4.d0(1322701699);
                    }
                    sVar4.p(z11);
                    sVar4.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
