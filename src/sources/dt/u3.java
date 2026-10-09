package dt;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24242a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24247f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24248t;

    public /* synthetic */ u3(int i11, int i12, float f5, fz.c cVar, fz.a aVar, z1.r rVar, int i13) {
        this.f24244c = i11;
        this.f24245d = i12;
        this.f24243b = f5;
        this.f24246e = cVar;
        this.f24248t = aVar;
        this.f24247f = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        switch (this.f24242a) {
            case 0:
                qy.l lVar = (qy.l) this.f24246e;
                c1 c1Var = (c1) this.f24247f;
                fz.a aVar = (fz.a) this.f24248t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewParent parent = ((View) sVar.j(AndroidCompositionLocals_androidKt.f1204f)).getParent();
                    z3.s sVar2 = parent instanceof z3.s ? (z3.s) parent : null;
                    if (sVar2 != null && (window = sVar2.getWindow()) != null) {
                        window.setDimAmount(CropImageView.DEFAULT_ASPECT_RATIO);
                        window.clearFlags(2);
                    }
                    z1.r rVarH = d0.n.h(j0.e2.d(z1.o.f58481a, 1.0f), g2.x.f28621h, g2.f0.f28556b);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarH);
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
                    long j11 = ((v3.j) lVar.f48496b).f53492a;
                    int i11 = this.f24244c;
                    e.G(new qy.l(lVar.f48495a, new v3.j(v3.j.d(j11, (((long) 0) << 32) | (((long) i11) & 4294967295L)))), this.f24243b, i11, this.f24245d, !(c1Var != null && c1Var.f23695a), aVar, sVar, 0);
                    if (c1Var == null || !c1Var.f23695a) {
                        sVar.d0(-174720614);
                    } else {
                        sVar.d0(-164113406);
                        mt.g.a(6, c1Var.f23696b, sVar, null);
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                km.b1.m((km.p) this.f24246e, (z1.r) this.f24247f, (fz.c) this.f24248t, this.f24243b, (l1.n) obj, l1.t.M(this.f24244c | 1), this.f24245d);
                break;
            case 2:
                ((Integer) obj2).intValue();
                tg.v.f(this.f24244c, (List) this.f24246e, (fz.c) this.f24247f, this.f24243b, (z1.r) this.f24248t, (l1.n) obj, l1.t.M(this.f24245d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a.k(this.f24244c, this.f24245d, this.f24243b, (fz.c) this.f24246e, (fz.a) this.f24248t, (z1.r) this.f24247f, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u3(int i11, List list, fz.c cVar, float f5, z1.r rVar, int i12) {
        this.f24244c = i11;
        this.f24246e = list;
        this.f24247f = cVar;
        this.f24243b = f5;
        this.f24248t = rVar;
        this.f24245d = i12;
    }

    public /* synthetic */ u3(km.p pVar, z1.r rVar, fz.c cVar, float f5, int i11, int i12) {
        this.f24246e = pVar;
        this.f24247f = rVar;
        this.f24248t = cVar;
        this.f24243b = f5;
        this.f24244c = i11;
        this.f24245d = i12;
    }

    public /* synthetic */ u3(qy.l lVar, int i11, float f5, int i12, c1 c1Var, fz.a aVar) {
        this.f24246e = lVar;
        this.f24244c = i11;
        this.f24243b = f5;
        this.f24245d = i12;
        this.f24247f = c1Var;
        this.f24248t = aVar;
    }
}
