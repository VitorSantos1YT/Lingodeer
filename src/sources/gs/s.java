package gs;

import a0.k0;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.r4;
import h1.ua;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.z1;
import l1.b3;
import l1.q1;
import l1.t;
import oz.x;
import qy.b0;
import rt.jf;
import rt.qc;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29836c;

    public /* synthetic */ s(int i11, Object obj, int i12) {
        this.f29834a = i12;
        this.f29835b = i11;
        this.f29836c = obj;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strQ0;
        switch (this.f29834a) {
            case 0:
                fz.a aVar = (fz.a) this.f29836c;
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a.g(384, aVar, ub.a.e0(sVar, this.f29835b), sVar, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, 1));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                rc rcVar = (rc) this.f29836c;
                b2 CourseTestProgressBar = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestProgressBar, "$this$CourseTestProgressBar");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z11 = ((qc) rcVar).f50305e;
                    z1.o oVar = z1.o.f58481a;
                    if (z11) {
                        sVar2.d0(-1923145675);
                        z1.i iVar = z1.c.M;
                        z1.r rVarC = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        a2 a2VarA = z1.a(j0.i.f35303a, iVar, sVar2, 48);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        t.J(y2.j.f56917f, a2VarA, sVar2);
                        t.J(y2.j.f56916e, q1VarL, sVar2);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        t.J(y2.j.f56915d, rVarC2, sVar2);
                        d0.n.c(se.k.y(R.drawable.ic_game_life, sVar2, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
                        ua.b(String.valueOf(3 - this.f29835b), j0.c.E(oVar, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131068);
                        sVar2 = sVar2;
                        sVar2.p(true);
                    } else {
                        sVar2.d0(-1931356180);
                    }
                    sVar2.p(false);
                    j0.c.g(sVar2, e2.n(oVar, 24));
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                jf jfVar = (jf) this.f29836c;
                b2 Button = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    k2.b bVarY = se.k.y(R.drawable.ic_lesson_index_download, sVar3, 0);
                    z1.o oVar2 = z1.o.f58481a;
                    r4.b(bVarY, null, e2.n(oVar2, 18), 0L, sVar3, 432, 8);
                    j0.c.g(sVar3, e2.s(oVar2, 6));
                    if (jfVar.f49952e) {
                        strQ0 = ep.a.m(sVar3, -295184636, R.string.offline_downloading, sVar3, false);
                    } else {
                        sVar3.d0(-295076477);
                        strQ0 = x.q0(ub.a.e0(sVar3, R.string.offline_batch_download), "%s", String.valueOf(this.f29835b));
                        sVar3.p(false);
                    }
                    ua.b(strQ0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                break;
            default:
                b3 b3Var = (b3) this.f29836c;
                k0 AnimatedVisibility = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                ys.a.o(this.f29835b, ((g2.x) b3Var.getValue()).f28624a, j0.c.E(z1.o.f58481a, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), (l1.n) obj2, 384);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ s(Object obj, int i11, int i12) {
        this.f29834a = i12;
        this.f29836c = obj;
        this.f29835b = i11;
    }
}
