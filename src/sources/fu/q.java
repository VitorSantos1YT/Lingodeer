package fu;

import bt.w6;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.s1;
import h1.v1;
import j0.e2;
import l1.b1;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28142a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f28145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28147f;

    public /* synthetic */ q(int i11, bs.f fVar, fz.a aVar, fz.c cVar, String str) {
        this.f28146e = fVar;
        this.f28143b = str;
        this.f28147f = cVar;
        this.f28144c = i11;
        this.f28145d = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ad.p pVarL;
        switch (this.f28142a) {
            case 0:
                b1 b1Var = (b1) this.f28146e;
                String str = (String) this.f28147f;
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 21, 7);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarE);
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
                    a.j(0, ((s1) sVar.j(v1.f31180a)).f31036s, this.f28145d, sVar, ((Boolean) b1Var.getValue()).booleanValue());
                    if (this.f28144c == 1) {
                        sVar.d0(506120856);
                        pVarL = gb.r.L(new ad.r(R.raw.day_streak_finished_shield_1), sVar);
                        sVar.p(false);
                    } else {
                        sVar.d0(506255768);
                        pVarL = gb.r.L(new ad.r(R.raw.day_streak_finished_shield_2), sVar);
                        sVar.p(false);
                    }
                    ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 1022);
                    wc.h hVar2 = (wc.h) pVarL.getValue();
                    boolean zF = sVar.f(iVarE);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new w6(iVarE, 3);
                        sVar.o0(objQ);
                    }
                    j3.a(hVar2, (fz.a) objQ, e2.p(oVar, 211, 179), null, null, null, sVar, 384, 0, 131064);
                    a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, t1.e.d(933725200, new bp.a0(this.f28143b, 5), sVar), sVar, 1572870, 30);
                    a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, t1.e.d(-1105421639, new bp.a0(str, 6), sVar), sVar, 1572870, 30);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                bs.f fVar = (bs.f) this.f28146e;
                fz.c cVar = (fz.c) this.f28147f;
                j0.v ToneIntroductionLayout = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout, "$this$ToneIntroductionLayout");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                    float f5 = 16;
                    j0.g gVarG = j0.i.g(f5);
                    j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
                    boolean zH = sVar2.h(fVar);
                    String str2 = this.f28143b;
                    boolean zF2 = zH | sVar2.f(str2) | sVar2.f(cVar);
                    int i11 = this.f28144c;
                    boolean zD = zF2 | sVar2.d(i11);
                    fz.a aVar = this.f28145d;
                    boolean zF3 = zD | sVar2.f(aVar);
                    Object objQ2 = sVar2.Q();
                    if (zF3 || objQ2 == l1.m.f39353a) {
                        gs.r rVar = new gs.r(i11, fVar, aVar, cVar, str2);
                        sVar2.o0(rVar);
                        objQ2 = rVar;
                    }
                    ue.f.a(rVarD, null, v1VarD, gVarG, null, null, false, null, (fz.c) objQ2, sVar2, 24966, 490);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q(fz.a aVar, int i11, b1 b1Var, String str, String str2) {
        this.f28145d = aVar;
        this.f28144c = i11;
        this.f28146e = b1Var;
        this.f28143b = str;
        this.f28147f = str2;
    }
}
