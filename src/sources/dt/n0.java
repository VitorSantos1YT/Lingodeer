package dt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.r4;
import h1.ua;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24026c;

    public /* synthetic */ n0(long j11, fz.c cVar) {
        this.f24024a = 0;
        this.f24025b = j11;
        this.f24026c = cVar;
    }

    public /* synthetic */ n0(Object obj, long j11, int i11) {
        this.f24024a = i11;
        this.f24026c = obj;
        this.f24025b = j11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        int i12;
        switch (this.f24024a) {
            case 0:
                fz.c cVar = (fz.c) this.f24026c;
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(j0.e2.e(oVar, 1.0f), 20);
                    j0.u uVarA = j0.t.a(j0.i.g(12), z1.c.P, sVar, 54);
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
                    j3.e0 e0Var = new j3.e0(fr.j3.A(16), 7, fr.j3.A(16));
                    long j11 = this.f24025b;
                    Map mapX = ry.x.X(new qy.l("icon", new s0.k0(e0Var, t1.e.d(-1010501851, new r0(j11, 0), sVar))));
                    sVar.d0(2074121203);
                    j3.e eVar = new j3.e();
                    s0.o0.o(eVar, "icon", "[icon]");
                    eVar.d(shrCcjmOhAmRC.ZPBYvgnpD);
                    eVar.d(ub.a.e0(sVar, R.string.tell_me_why_premium_stat));
                    j3.h hVarJ = eVar.j();
                    sVar.p(false);
                    l1.d0 d0Var = ua.f31167a;
                    ua.c(hVarJ, j0.e2.e(oVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapX, null, j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 48, 0, 98300);
                    ua.b(ub.a.e0(sVar, R.string.tell_me_why_premium_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, fr.j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 0, 0, 65534);
                    z1.r rVarE = j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f);
                    if (((Boolean) xt.b.f56284f.getValue()).booleanValue()) {
                        i11 = -125514687;
                        i12 = R.string.try_for_free;
                    } else {
                        i11 = -125415084;
                        i12 = R.string.gems_pay_wall_premium_btn;
                    }
                    String strM = ep.a.m(sVar, i11, i12, sVar, false);
                    boolean zF = sVar.f(cVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new bt.g(cVar, 7);
                        sVar.o0(objQ);
                    }
                    iu.k.k(6, (fz.a) objQ, strM, sVar, rVarE);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                fz.a aVar = (fz.a) this.f24026c;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                boolean zF2 = sVar2.f(aVar);
                Object objQ2 = sVar2.Q();
                if (zF2 || objQ2 == l1.m.f39353a) {
                    objQ2 = new et.p(6, aVar);
                    sVar2.o0(objQ2);
                }
                final long j12 = this.f24025b;
                k7.h((fz.a) objQ2, null, false, null, t1.e.d(1797896206, new fz.e() { // from class: fu.u
                    @Override // fz.e
                    public final Object invoke(Object obj4, Object obj5) {
                        l1.n nVar2 = (l1.n) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        l1.s sVar3 = (l1.s) nVar2;
                        if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            r4.b(se.k.y(R.drawable.close_24px, sVar3, 0), null, null, j12, sVar3, 48, 4);
                        } else {
                            sVar3.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar2), sVar2, 196608, 30);
                break;
            default:
                String str = (String) this.f24026c;
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ua.b(oz.q.i1(str).toString(), j0.c.B(z1.o.f58481a, 4, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(ua.f31167a), this.f24025b, fr.j3.L(4294967296L, 16.0f), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, 0, 0, 65532);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
