package ys;

import android.content.Context;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f58115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f58116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f58117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f58118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f58119f;

    public /* synthetic */ k3(fz.a aVar, rz.b0 b0Var, String str, Context context, String str2, int i11) {
        this.f58114a = i11;
        this.f58115b = aVar;
        this.f58116c = b0Var;
        this.f58117d = str;
        this.f58118e = context;
        this.f58119f = str2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var;
        String str;
        Context context;
        switch (this.f58114a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i9.a(j0.e2.c(j0.e2.e(j0.c.F(z1.o.f58481a), 0.92f), 0.9f), r0.f.d(20), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-442048195, new k3(this.f58115b, this.f58116c, this.f58117d, this.f58118e, this.f58119f, 1), sVar), sVar, 12582912, 120);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    z1.r rVarB = j0.c.B(j0.e2.e(oVar, 1.0f), 8, 6);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarB);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    k7.h(this.f58115b, null, false, null, a.f57903x, sVar2, 196608, 30);
                    double d5 = 1.0f;
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar2);
                    k2.b bVarY = se.k.y(R.drawable.lb_share_save, sVar2, 0);
                    float f5 = 36;
                    z1.r rVarN = j0.e2.n(oVar, f5);
                    rz.b0 b0Var2 = this.f58116c;
                    boolean zH = sVar2.h(b0Var2);
                    String str2 = this.f58117d;
                    boolean zF = zH | sVar2.f(str2);
                    Context context2 = this.f58118e;
                    boolean zH2 = zF | sVar2.h(context2);
                    String str3 = this.f58119f;
                    boolean zF2 = zH2 | sVar2.f(str3);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF2 || objQ == gVar) {
                        b0Var = b0Var2;
                        str = str2;
                        context = context2;
                        objQ = new b0.k0(b0Var, context, str, str3, 23);
                        sVar2.o0(objQ);
                    } else {
                        b0Var = b0Var2;
                        str = str2;
                        context = context2;
                    }
                    Context context3 = context;
                    rz.b0 b0Var3 = b0Var;
                    String str4 = str;
                    d0.n.c(bVarY, null, iu.k.q(6, 7, (fz.a) objQ, sVar2, rVarN, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                    float f11 = 12;
                    j0.c.g(sVar2, j0.e2.s(oVar, f11));
                    k2.b bVarY2 = se.k.y(R.drawable.lb_share_more, sVar2, 0);
                    z1.r rVarN2 = j0.e2.n(oVar, f5);
                    boolean zH3 = sVar2.h(b0Var3) | sVar2.f(str4) | sVar2.h(context3);
                    Object objQ2 = sVar2.Q();
                    if (zH3 || objQ2 == gVar) {
                        objQ2 = new xu.y1(b0Var3, context3, str4, 2);
                        sVar2.o0(objQ2);
                    }
                    d0.n.c(bVarY2, null, iu.k.q(6, 7, (fz.a) objQ2, sVar2, rVarN2, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                    sVar2.p(true);
                    if (d5 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    float f12 = 16;
                    z1.r rVarE = j0.c.E(d0.n.y(new j0.i1(1.0f, true), d0.n.u(sVar2), false, 14), f12, CropImageView.DEFAULT_ASPECT_RATIO, f12, f12, 2);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarE);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, q0VarD, sVar2);
                    l1.t.J(hVar2, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar2);
                    wb.k.c(str4, d2.h.b(j0.e2.e(oVar, 1.0f), r0.f.d(f11)), w2.i.f54517d, sVar2, 1572912, 4024);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
