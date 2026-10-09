package br;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.main.ui.MainComposeActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.p7;
import java.util.List;
import l1.b1;
import l1.b3;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.e {
    public final /* synthetic */ b3 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f5079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j9.v f5080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f5082f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b3 f5083t;

    public /* synthetic */ r(boolean z11, b1 b1Var, j9.v vVar, MainComposeActivity mainComposeActivity, b1 b1Var2, b3 b3Var, b3 b3Var2, int i11) {
        this.f5077a = i11;
        this.f5078b = z11;
        this.f5079c = b1Var;
        this.f5080d = vVar;
        this.f5081e = mainComposeActivity;
        this.f5082f = b1Var2;
        this.f5083t = b3Var;
        this.H = b3Var2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5077a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = MainComposeActivity.U;
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
                    b1 b1Var = this.f5082f;
                    a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, null, null, null, e.f5028b, sVar, 1572870, 30);
                    List list = (List) this.f5083t.getValue();
                    b1 b1Var2 = this.f5079c;
                    String str = (String) b1Var2.getValue();
                    MergedBillingThemeBillingPage mergedBillingThemeBillingPage = (MergedBillingThemeBillingPage) this.H.getValue();
                    boolean zF = sVar.f(b1Var2);
                    j9.v vVar = this.f5080d;
                    boolean zH = zF | sVar.h(vVar);
                    MainComposeActivity mainComposeActivity = this.f5081e;
                    boolean zH2 = zH | sVar.h(mainComposeActivity);
                    Object objQ = sVar.Q();
                    if (zH2 || objQ == l1.m.f39353a) {
                        objQ = new s(vVar, mainComposeActivity, b1Var2, b1Var);
                        sVar.o0(objQ);
                    }
                    e.e(list, str, mergedBillingThemeBillingPage, this.f5078b, (fz.c) objQ, sVar, 0);
                    sVar.p(true);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = MainComposeActivity.U;
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    j0.f0 f0VarH = j0.c.h(0, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    boolean z11 = this.f5078b;
                    b1 b1Var3 = this.f5079c;
                    j9.v vVar2 = this.f5080d;
                    MainComposeActivity mainComposeActivity2 = this.f5081e;
                    b1 b1Var4 = this.f5082f;
                    p7.a(null, null, t1.e.d(-749748132, new r(z11, b1Var3, vVar2, mainComposeActivity2, b1Var4, this.f5083t, this.H, 0), sVar2), null, null, 0, 0L, 0L, f0VarH, t1.e.d(-774562138, new j(vVar2, mainComposeActivity2, b1Var3, b1Var4), sVar2), sVar2, 805306752, 251);
                }
                break;
        }
        return b0Var;
    }
}
