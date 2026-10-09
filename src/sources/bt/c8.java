package bt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c8 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5286a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f5289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5290e;

    public /* synthetic */ c8(CourseWord courseWord, ht.o oVar, fz.e eVar, l1.b1 b1Var) {
        this.f5287b = courseWord;
        this.f5288c = oVar;
        this.f5289d = eVar;
        this.f5290e = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5286a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.word_m4_hint);
                    ht.o oVar = this.f5288c;
                    dt.a0.q(strE0, oVar.f33764l, sVar, 0, 0);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar);
                    if (oVar.f33757e) {
                        sVar.d0(-1799840460);
                    } else {
                        sVar.d0(-1792584755);
                        l1.b1 b1Var = this.f5290e;
                        boolean z11 = ((ht.l) b1Var.getValue()) instanceof ht.c;
                        long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                        fz.e eVar = this.f5289d;
                        boolean zF = sVar.f(eVar);
                        CourseWord courseWord = this.f5287b;
                        boolean zH = zF | sVar.h(courseWord) | sVar.f(b1Var);
                        Object objQ = sVar.Q();
                        if (zH || objQ == l1.m.f39353a) {
                            objQ = new o6(eVar, courseWord, b1Var, 6);
                            sVar.o0(objQ);
                        }
                        dt.a0.a(z11, null, j11, (fz.a) objQ, sVar, 0, 2);
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f5 = 26;
                    z1.o oVar2 = z1.o.f58481a;
                    j0.c.g(sVar2, j0.e2.g(oVar2, f5));
                    List listK = ns.o.K(this.f5287b);
                    boolean z12 = !this.f5288c.f33757e;
                    fz.e eVar2 = this.f5289d;
                    boolean zF2 = sVar2.f(eVar2);
                    l1.b1 b1Var2 = this.f5290e;
                    boolean zF3 = zF2 | sVar2.f(b1Var2);
                    Object objQ2 = sVar2.Q();
                    if (zF3 || objQ2 == l1.m.f39353a) {
                        objQ2 = new au.d1(25, eVar2, b1Var2);
                        sVar2.o0(objQ2);
                    }
                    dt.d4.a(listK, oVar2, null, z12, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, (fz.c) objQ2, sVar2, 48, 0, 0, 2097140);
                    j0.c.g(sVar2, j0.e2.g(oVar2, f5));
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c8(ht.o oVar, fz.e eVar, CourseWord courseWord, l1.b1 b1Var) {
        this.f5288c = oVar;
        this.f5289d = eVar;
        this.f5287b = courseWord;
        this.f5290e = b1Var;
    }
}
