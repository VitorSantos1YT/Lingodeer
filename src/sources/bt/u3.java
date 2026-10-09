package bt;

import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f6063b;

    public /* synthetic */ u3(CourseWord courseWord, int i11) {
        this.f6062a = i11;
        this.f6063b = courseWord;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        z1.o oVar;
        switch (this.f6062a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.r rVarV = dt.a0.v(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), 56, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarV);
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
                    CourseWord courseWord = this.f6063b;
                    dt.g4.b(courseWord, dt.a0.y(courseWord.getSelectedState(), sVar), null, true, null, false, false, false, 0, null, sVar, 3072, 1012);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f5 = 26;
                    z1.o oVar2 = z1.o.f58481a;
                    j0.c.g(sVar2, j0.e2.g(oVar2, f5));
                    dt.a0.o(48, 0, this.f6063b.getTranslation(), sVar2, j0.e2.e(oVar2, 1.0f));
                    j0.c.g(sVar2, j0.e2.g(oVar2, f5));
                } else {
                    sVar2.W();
                }
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f11 = 26;
                    z1.o oVar3 = z1.o.f58481a;
                    j0.c.g(sVar3, j0.e2.g(oVar3, f11));
                    CourseWord courseWord2 = this.f6063b;
                    if (courseWord2.getWordType() == 3) {
                        sVar3.d0(616299044);
                        String zhuYin = courseWord2.getZhuYin();
                        float f12 = 32;
                        oVar = oVar3;
                        z1.r rVarA = d2.h.a(j0.c.E(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, 10), ct.c.d(sVar3));
                        j3.y0 y0Var = (j3.y0) sVar3.j(ua.f31167a);
                        long jE = ct.c.e(sVar3);
                        fr.j3.i(jE);
                        ua.b(zhuYin, rVarA, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, 0L, fr.j3.L(1095216660480L & jE, (float) (((double) v3.o.c(jE)) * 2.3d)), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar3, 0, 0, 65532);
                        sVar3.p(false);
                    } else {
                        oVar = oVar3;
                        sVar3.d0(616758588);
                        dt.a0.o(48, 0, courseWord2.getTranslation(), sVar3, j0.e2.e(oVar, 1.0f));
                        sVar3.p(false);
                    }
                    j0.c.g(sVar3, j0.e2.g(oVar, f11));
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u3(CourseWord courseWord, boolean z11) {
        this.f6062a = 0;
        this.f6063b = courseWord;
    }
}
