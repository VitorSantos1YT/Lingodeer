package mt;

import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h3 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41517a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41520d;

    public /* synthetic */ h3(int i11, PTNewSyllableIntroductionActivity pTNewSyllableIntroductionActivity, String str) {
        this.f41518b = i11;
        this.f41519c = pTNewSyllableIntroductionActivity;
        this.f41520d = str;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f41517a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f41520d;
        Object obj5 = this.f41519c;
        int i12 = this.f41518b;
        switch (i11) {
            case 0:
                rt.n0 n0Var = (rt.n0) obj5;
                fz.c cVar = (fz.c) obj4;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                m3.b(n0Var, i12 != 0, i12 != 1, false, cVar, nVar, 0);
                break;
            default:
                PTNewSyllableIntroductionActivity pTNewSyllableIntroductionActivity = (PTNewSyllableIntroductionActivity) obj5;
                String str = (String) obj4;
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = PTNewSyllableIntroductionActivity.f21986t;
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar2;
                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.W();
                } else {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(j0.e2.d(oVar, 1.0f), se.p.P(sVar, R.dimen.dp_16));
                    j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    String str2 = ub.a.e0(sVar, R.string.loading) + " " + i12 + "%";
                    l1.d0 d0Var = ua.f31167a;
                    ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), se.i.k(sVar, R.color.primary_black), fr.j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                    pTNewSyllableIntroductionActivity.q(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, se.p.P(sVar, R.dimen.dp_8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 0);
                    j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                    ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 6, 0, 65534);
                    j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                    sVar.p(true);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h3(rt.n0 n0Var, int i11, fz.c cVar) {
        this.f41519c = n0Var;
        this.f41518b = i11;
        this.f41520d = cVar;
    }
}
