package bt;

import com.lingodeer.data.model.CourseSentence;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5345a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5346b;

    public /* synthetic */ e3(CourseSentence courseSentence) {
        this.f5346b = courseSentence;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5345a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f5 = 26;
                    z1.o oVar = z1.o.f58481a;
                    j0.c.g(sVar, j0.e2.g(oVar, f5));
                    dt.a0.o(0, 2, this.f5346b.getTranslation(), sVar, null);
                    j0.c.g(sVar, j0.e2.g(oVar, f5));
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.r rVarV = dt.a0.v(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), 56, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarV);
                    y2.k.J.getClass();
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
                    CourseSentence courseSentence = this.f5346b;
                    dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, dt.a0.y(courseSentence.getSelectedState(), sVar2), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, 4, 2, 0L, false, null, false, false, false, null, null, null, sVar2, 3072, 432, 0, 4188118);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e3(CourseSentence courseSentence, boolean z11) {
        this.f5346b = courseSentence;
    }
}
