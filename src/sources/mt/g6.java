package mt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.i7;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41497a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f41498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41502f;

    public /* synthetic */ g6(fz.a aVar, int i11, String str, boolean z11, boolean z12) {
        this.f41498b = aVar;
        this.f41499c = i11;
        this.f41500d = str;
        this.f41501e = z11;
        this.f41502f = z12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f41497a) {
            case 0:
                j0.v OutlinedCard = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    float f5 = 12;
                    z1.r rVarB = d2.h.b(j0.e2.g(oVar, 68), r0.f.d(f5));
                    g3.k kVar = new g3.k(3);
                    boolean z11 = this.f41501e;
                    boolean z12 = this.f41502f;
                    z1.r rVarB2 = q0.c.b(rVarB, z11, z12, kVar, this.f41498b, 8);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarB2);
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
                    d0.n.c(se.k.y(this.f41499c, sVar, 0), null, j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                    ua.b(this.f41500d, j0.c.E(oVar, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar);
                    i7.a(z11, null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), z12, null, sVar, 432, 48);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.v OutlinedCard2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard2, "$this$OutlinedCard");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    float f11 = 12;
                    z1.r rVarB3 = d2.h.b(j0.e2.i(oVar2, 68, CropImageView.DEFAULT_ASPECT_RATIO, 2), r0.f.d(f11));
                    fz.a aVar = this.f41498b;
                    boolean zF = sVar2.f(aVar);
                    Object objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new xu.r1(11, aVar);
                        sVar2.o0(objQ);
                    }
                    z1.r rVarC2 = j0.c.C(d0.n.o(rVarB3, false, null, (fz.a) objQ, 15), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                    d0.n.c(se.k.y(this.f41499c, sVar2, 0), null, j0.e2.n(j0.c.E(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 30), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    z1.r rVarE = j0.c.E(oVar2, 14, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(this.f41500d, w4.c.p(1.0f, true, rVarE), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 0, 0, 65532);
                    if (this.f41501e) {
                        sVar2.d0(335228279);
                        d0.n.c(se.k.y(this.f41502f ? R.drawable.ic_lesson_index_lesson_redo : R.drawable.ic_lesson_index_lesson_start, sVar2, 0), null, d2.h.i(j0.e2.n(oVar2, 20), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a, 5), sVar2, 48, 56);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(334975412);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar2, 0), null, j0.e2.n(oVar2, 26), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
                        sVar2.p(false);
                    }
                    j0.c.g(sVar2, j0.e2.s(oVar2, f11));
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g6(boolean z11, boolean z12, fz.a aVar, int i11, String str) {
        this.f41501e = z11;
        this.f41502f = z12;
        this.f41498b = aVar;
        this.f41499c = i11;
        this.f41500d = str;
    }
}
