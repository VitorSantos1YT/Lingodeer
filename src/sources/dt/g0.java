package dt;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lingodeer.R;
import h1.k7;
import rt.oe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23828c;

    public /* synthetic */ g0(Object obj, boolean z11, int i11, int i12) {
        this.f23826a = i12;
        this.f23828c = obj;
        this.f23827b = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        k2.b bVarY;
        switch (this.f23826a) {
            case 0:
                qy.l lVar = (qy.l) this.f23828c;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f5 = ((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).screenWidthDp;
                    l1.c3 c3Var = h1.v1.f31180a;
                    long j11 = ((h1.s1) sVar.j(c3Var)).f31035r;
                    long j12 = ((h1.s1) sVar.j(c3Var)).A;
                    float f11 = 10;
                    z1.r rVarS = j0.e2.s(z1.o.f58481a, f5 - 50);
                    boolean z11 = this.f23827b;
                    boolean zG = sVar.g(z11) | sVar.h(lVar) | sVar.e(j11) | sVar.e(j12);
                    Object objQ = sVar.Q();
                    if (zG || objQ == l1.m.f39353a) {
                        c0 c0Var = new c0(f11, z11, lVar, j11, j12, 1);
                        sVar.o0(c0Var);
                        objQ = c0Var;
                    }
                    z1.r rVarG = j0.e2.g(d2.h.e(rVarS, (fz.c) objQ), 280);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarG);
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
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(1944777631, new i0(j12, lVar, j11), sVar), sVar, 56);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                com.bumptech.glide.e.d(this.f23827b, (fz.e) this.f23828c, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mt.b1.g((oe) this.f23828c, this.f23827b, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                s0.o0.j((d1.z0) this.f23828c, this.f23827b, (l1.n) obj, l1.t.M(1));
                break;
            default:
                l1.b1 b1Var = (l1.b1) this.f23828c;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else if (this.f23827b) {
                    sVar2.d0(-309554169);
                    h1.r4.b(se.k.y(R.drawable.baseline_error_24, sVar2, 0), "error", null, ((h1.s1) sVar2.j(h1.v1.f31180a)).f31040w, sVar2, 48, 4);
                    sVar2.p(false);
                } else {
                    sVar2.d0(-309240232);
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar2.d0(1514047546);
                        bVarY = se.k.y(R.drawable.baseline_visibility_24, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(1514051070);
                        bVarY = se.k.y(R.drawable.baseline_visibility_off_24, sVar2, 0);
                        sVar2.p(false);
                    }
                    String str = ((Boolean) b1Var.getValue()).booleanValue() ? "Hide password" : "Show password";
                    boolean zF = sVar2.f(b1Var);
                    Object objQ2 = sVar2.Q();
                    if (zF || objQ2 == l1.m.f39353a) {
                        objQ2 = new pr.z(19, b1Var);
                        sVar2.o0(objQ2);
                    }
                    k7.h((fz.a) objQ2, null, false, null, t1.e.d(909870513, new uu.j(bVarY, str, 0), sVar2), sVar2, 196608, 30);
                    sVar2.p(false);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g0(boolean z11, fz.e eVar, int i11) {
        this.f23826a = 1;
        this.f23827b = z11;
        this.f23828c = eVar;
    }

    public /* synthetic */ g0(boolean z11, Object obj, int i11) {
        this.f23826a = i11;
        this.f23827b = z11;
        this.f23828c = obj;
    }
}
