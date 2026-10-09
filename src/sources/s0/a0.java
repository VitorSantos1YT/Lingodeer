package s0;

import com.yalantis.ucrop.view.CropImageView;
import j0.e2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements fz.e {
    public final /* synthetic */ z1.r H;
    public final /* synthetic */ z1.r K;
    public final /* synthetic */ z1.r L;
    public final /* synthetic */ z1.r M;
    public final /* synthetic */ p0.c N;
    public final /* synthetic */ d1.z0 O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ fz.c R;
    public final /* synthetic */ o3.p S;
    public final /* synthetic */ v3.c T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f50989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f50990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f50992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1 f50993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o3.w f50994f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o3.f0 f50995t;

    public a0(s0 s0Var, j3.y0 y0Var, int i11, int i12, m1 m1Var, o3.w wVar, o3.f0 f0Var, z1.r rVar, z1.r rVar2, z1.r rVar3, z1.r rVar4, p0.c cVar, d1.z0 z0Var, boolean z11, boolean z12, fz.c cVar2, o3.p pVar, v3.c cVar3) {
        this.f50989a = s0Var;
        this.f50990b = y0Var;
        this.f50991c = i11;
        this.f50992d = i12;
        this.f50993e = m1Var;
        this.f50994f = wVar;
        this.f50995t = f0Var;
        this.H = rVar;
        this.K = rVar2;
        this.L = rVar3;
        this.M = rVar4;
        this.N = cVar;
        this.O = z0Var;
        this.P = z11;
        this.Q = z12;
        this.R = cVar2;
        this.S = pVar;
        this.T = cVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        z1.r v1Var;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            s0 s0Var = this.f50989a;
            z1.r rVarI = e2.i(z1.o.f58481a, ((v3.f) s0Var.f51172g.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            int i11 = this.f50991c;
            int i12 = this.f50992d;
            j3.y0 y0Var = this.f50990b;
            z1.r rVarA = z1.a.a(rVarI, new i0(i11, i12, y0Var));
            boolean zH = sVar.h(s0Var);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new u(s0Var, 1);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            m1 m1Var = this.f50993e;
            f0.h1 h1Var = (f0.h1) m1Var.f51104f.getValue();
            o3.w wVar = this.f50994f;
            long j11 = wVar.f44705b;
            int i13 = j3.x0.f35822c;
            int iF = (int) (j11 >> 32);
            long j12 = m1Var.f51103e;
            if (iF == ((int) (j12 >> 32)) && (iF = (int) (j11 & 4294967295L)) == ((int) (j12 & 4294967295L))) {
                iF = j3.x0.f(j11);
            }
            m1Var.f51103e = wVar.f44705b;
            o3.d0 d0VarA = u1.a(this.f50995t, wVar.f44704a);
            int i14 = i1.f51060a[h1Var.ordinal()];
            if (i14 == 1) {
                v1Var = new v1(m1Var, iF, d0VarA, aVar);
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                v1Var = new j0(m1Var, iF, d0VarA, aVar);
            }
            vc.a.e(p0.d.a(z1.a.a(d2.h.c(rVarA).i(v1Var).i(this.H).i(this.K), new d1.e1(y0Var, 5)).i(this.L).i(this.M), this.N), t1.e.d(1412697320, new z(this.O, s0Var, this.P, this.Q, this.R, this.f50994f, this.S, this.T, this.f50992d), sVar), sVar, 48);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
