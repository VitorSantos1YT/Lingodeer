package z3;

import androidx.compose.ui.window.PopupLayout;
import com.yalantis.ucrop.view.CropImageView;
import l1.b1;
import l1.d0;
import l1.q1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f58772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f58773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PopupLayout popupLayout, b1 b1Var, int i11) {
        super(2);
        this.f58771a = i11;
        this.f58772b = popupLayout;
        this.f58773c = b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f58771a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f58773c;
        PopupLayout popupLayout = this.f58772b;
        int i12 = 0;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = c.f58745e;
                        sVar.o0(objQ);
                    }
                    z1.r rVarB = g3.r.b(z1.o.f58481a, false, (fz.c) objQ);
                    boolean zH = sVar.h(popupLayout);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new i(popupLayout, 1);
                        sVar.o0(objQ2);
                    }
                    z1.r rVarA = d2.h.a(w2.a0.o(rVarB, (fz.c) objQ2), popupLayout.getCanCalculatePosition() ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                    d0 d0Var = k.f58774a;
                    fz.e eVar = (fz.e) b1Var.getValue();
                    Object objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = e.f58755c;
                        sVar.o0(objQ3);
                    }
                    q0 q0Var = (q0) objQ3;
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0Var, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    l1.t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
                    l1.t.F(sVar, y2.j.f56919h);
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    ep.a.w(0, eVar, sVar, true);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    l1.t.a(k.f58775b.a(Boolean.TRUE), t1.e.d(1022273628, new j(popupLayout, b1Var, i12), sVar2), sVar2, 56);
                }
                break;
        }
        return b0Var;
    }
}
