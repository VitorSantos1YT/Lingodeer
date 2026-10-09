package jr;

import com.google.accompanist.permissions.PermissionState;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.s1;
import h1.v1;
import j0.e2;
import java.util.List;
import kr.a1;
import kr.c1;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements fz.g {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ b1 K;
    public final /* synthetic */ b1 L;
    public final /* synthetic */ b1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f36675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f36676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PermissionState f36677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f36678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f36679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f36680f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f36681t;

    public l0(List list, c1 c1Var, PermissionState permissionState, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        this.f36675a = list;
        this.f36676b = c1Var;
        this.f36677c = permissionState;
        this.f36678d = cVar;
        this.f36679e = cVar2;
        this.f36680f = cVar3;
        this.f36681t = cVar4;
        this.H = cVar5;
        this.K = b1Var;
        this.L = b1Var2;
        this.M = b1Var3;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        long j11;
        l0.c cVar = (l0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
            a1 a1Var = (a1) this.f36675a.get(iIntValue);
            sVar.d0(-1651752703);
            c1 c1Var = this.f36676b;
            boolean z11 = c1Var.f38438e;
            boolean zBooleanValue = ((Boolean) this.K.getValue()).booleanValue();
            boolean zH = sVar.h(a1Var);
            PermissionState permissionState = this.f36677c;
            boolean zF = zH | sVar.f(permissionState);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new j0(a1Var, permissionState, this.L, 0);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
            if (a1Var.f38416g) {
                sVar.d0(-746002757);
                j11 = ((s1) sVar.j(v1.f31180a)).f31033p;
            } else {
                sVar.d0(-746001506);
                j11 = ((s1) sVar.j(v1.f31180a)).f31031n;
            }
            sVar.p(false);
            z1.r rVarH = d0.n.h(rVarE, j11, g2.f0.f28556b);
            fz.c cVar2 = this.f36678d;
            boolean zF2 = ((((i11 & 112) ^ 48) > 32 && sVar.d(iIntValue)) || (i11 & 48) == 32) | sVar.f(cVar2);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = new k0(cVar2, iIntValue, this.M, 0);
                sVar.o0(objQ2);
            }
            a.s(a1Var, z11, zBooleanValue, aVar, j0.c.A(iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarH, false), 16), this.f36679e, this.f36680f, this.f36681t, this.H, sVar, 0);
            l1.s sVar2 = sVar;
            if (iIntValue < c1Var.f38434a.size() - 1) {
                sVar2.d0(-1650695604);
                k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, ((s1) sVar2.j(v1.f31180a)).A, sVar2, 0, 3);
                sVar2 = sVar2;
            } else {
                sVar2.d0(-1663563890);
            }
            sVar2.p(false);
            sVar2.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
