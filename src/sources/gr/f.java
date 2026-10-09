package gr;

import b0.h0;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.ua;
import j0.b2;
import j0.e2;
import j3.y0;
import l1.b3;
import l1.q1;
import qy.b0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f29681d;

    public /* synthetic */ f(String str, long j11, h0 h0Var, int i11) {
        this.f29678a = i11;
        this.f29679b = str;
        this.f29680c = j11;
        this.f29681d = h0Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29678a) {
            case 0:
                b2 AppGradientButton = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = e2.e(oVar, 1.0f);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(22), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
                    z1.r rVarC2 = j0.c.C(e2.e(oVar, 1.0f), 26, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    z1.j jVar = z1.c.f58467e;
                    j0.r rVar = j0.r.f35391a;
                    iu.k.h(this.f29679b, rVar.a(rVarC2, jVar), 0L, null, null, 0L, j3.A(12), j3.A(22), null, 0L, jVar, 0, false, 2, 0, null, y0VarA, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 14155776, 1575936, 1498940);
                    d0.n.c(se.k.y(R.drawable.ep_special_lifetime_arrow, sVar, 0), null, d2.h.i(j0.c.y(rVar.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), z1.c.f58468f), ((Number) this.f29681d.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 2), iu.k.p(sVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(this.f29680c, 5), sVar, 56, 56);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                b2 AppGradientButton2 = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE2 = e2.e(oVar2, 1.0f);
                    q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarE2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                    y0 y0VarA2 = y0.a((y0) sVar2.j(ua.f31167a), 0L, j3.A(16), n3.s.M, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
                    z1.j jVar2 = z1.c.f58467e;
                    j0.r rVar2 = j0.r.f35391a;
                    ua.b(this.f29679b, j0.c.C(rVar2.a(oVar2, jVar2), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar2, 0, 0, 65532);
                    d0.n.c(se.k.y(R.drawable.ep_special_lifetime_arrow, sVar2, 0), null, d2.h.i(j0.c.y(rVar2.a(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), z1.c.f58468f), ((Number) this.f29681d.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 2), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(this.f29680c, 5), sVar2, 56, 56);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
