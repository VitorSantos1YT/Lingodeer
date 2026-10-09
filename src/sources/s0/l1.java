package s0;

import com.yalantis.ucrop.view.CropImageView;
import f0.c2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f51087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f51088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0.i f51089c;

    public l1(m1 m1Var, boolean z11, h0.i iVar) {
        this.f51087a = m1Var;
        this.f51088b = z11;
        this.f51089c = iVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m1 m1Var = this.f51087a;
        l1.k1 k1Var = m1Var.f51104f;
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(805428266);
        boolean z11 = ((f0.h1) k1Var.getValue()) == f0.h1.Vertical || !(sVar.j(z2.g1.f58552n) == v3.m.Rtl);
        boolean zF = sVar.f(m1Var);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = new a(m1Var, 1);
            sVar.o0(objQ);
        }
        l1.b1 b1VarH = l1.t.H((fz.c) objQ, sVar);
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            f0.n nVar = new f0.n(new bp.h0(21, b1VarH));
            sVar.o0(nVar);
            objQ2 = nVar;
        }
        c2 c2Var = (c2) objQ2;
        boolean zF2 = sVar.f(c2Var) | sVar.f(m1Var);
        Object objQ3 = sVar.Q();
        if (zF2 || objQ3 == gVar) {
            objQ3 = new k1(c2Var, m1Var);
            sVar.o0(objQ3);
        }
        z1.r rVarB = f0.u1.b((k1) objQ3, (f0.h1) k1Var.getValue(), this.f51088b && m1Var.f51100b.l() != CropImageView.DEFAULT_ASPECT_RATIO, z11, this.f51089c);
        sVar.p(false);
        return rVarB;
    }
}
