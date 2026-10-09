package d2;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.work.impl.WorkDatabase;
import com.yalantis.ucrop.view.CropImageView;
import dt.p4;
import e2.e0;
import g2.t0;
import g2.w0;
import g3.t;
import gb.p;
import h1.e4;
import h1.e8;
import h1.f8;
import h1.o5;
import h1.r8;
import h1.u8;
import i1.k0;
import i1.l0;
import i1.m0;
import i1.n0;
import i1.u;
import j9.r;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.jvm.internal.y;
import l1.g1;
import l1.x1;
import l1.z;
import ob.s;
import qy.b0;
import rt.mc;
import w2.e1;
import y2.b2;
import y2.d2;
import y2.i0;
import y2.k1;
import z1.q;
import z2.g2;
import z2.l2;
import z2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        super(0);
        this.f23066a = i11;
        this.f23067b = obj;
        this.f23068c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // fz.a
    public final Object invoke() {
        f2.c cVar;
        z zVar;
        l0 l0Var;
        t tVar;
        i0 i0Var;
        switch (this.f23066a) {
            case 0:
                ((d) this.f23067b).S.invoke((e) this.f23068c);
                return b0.f48488a;
            case 1:
                fz.a aVar = (fz.a) this.f23067b;
                if (aVar != null && (cVar = (f2.c) aVar.invoke()) != null) {
                    return cVar;
                }
                k1 k1Var = (k1) this.f23068c;
                if (!k1Var.c1().P) {
                    k1Var = null;
                }
                if (k1Var != null) {
                    return com.bumptech.glide.e.e(0L, ff.h.P(k1Var.f54503c));
                }
                return null;
            case 2:
                ((y) this.f23067b).f38361a = ((e0) this.f23068c).V0();
                return b0.f48488a;
            case 3:
                e8 e8Var = (e8) this.f23067b;
                if (((Boolean) ((fz.c) e8Var.f30211b.f44878d).invoke(f8.PartiallyExpanded)).booleanValue()) {
                    rz.e0.B((rz.b0) this.f23068c, null, null, new o5(e8Var, null, 5), 3);
                }
                return Boolean.TRUE;
            case 4:
                u8 u8Var = (u8) this.f23067b;
                e4 e4Var = (e4) this.f23068c;
                if (!kotlin.jvm.internal.m.a(u8Var, e4Var.f30194a)) {
                    ry.m.K0(e4Var.f30195b, new r8(u8Var, 1));
                    x1 x1Var = e4Var.f30196c;
                    if (x1Var != null && (zVar = x1Var.f39499a) != null) {
                        zVar.r(x1Var, null);
                    }
                }
                return b0.f48488a;
            case 5:
                n0 n0Var = (n0) this.f23067b;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f23068c;
                n0Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(n0Var);
                m0 m0Var = n0Var.f34048b;
                if (m0Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(m0Var);
                }
                if (Build.VERSION.SDK_INT >= 33 && (l0Var = n0Var.f34049c) != null) {
                    k0.b(accessibilityManager, l0Var);
                }
                return b0.f48488a;
            case 6:
                s sVar = (s) this.f23067b;
                u uVar = (u) sVar.f44887n;
                Object obj = this.f23068c;
                float fD = sVar.h().d(obj);
                if (!Float.isNaN(fD)) {
                    s sVar2 = uVar.f34079a;
                    ((g1) sVar2.f44884j).m(fD);
                    ((g1) sVar2.f44885k).m(CropImageView.DEFAULT_ASPECT_RATIO);
                    sVar.u(null);
                }
                sVar.t(obj);
                return b0.f48488a;
            case 7:
                r rVar = ((lb.b) this.f23067b).f39870a;
                lb.a aVar2 = (lb.a) this.f23068c;
                rVar.getClass();
                synchronized (rVar.f36247c) {
                    if (((LinkedHashSet) rVar.f36248d).remove(aVar2) && ((LinkedHashSet) rVar.f36248d).isEmpty()) {
                        rVar.f();
                    }
                    break;
                }
                return b0.f48488a;
            case 8:
                rz.e0.B((rz.b0) this.f23067b, null, null, new gp.a((b0.c) this.f23068c, null, 29), 3);
                return b0.f48488a;
            case 9:
                p pVar = (p) this.f23067b;
                WorkDatabase workDatabase = pVar.f28955c;
                kotlin.jvm.internal.m.e(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.w(new s0.u(new pb.b(0, pVar, (UUID) this.f23068c), 21));
                gb.h.b(pVar.f28954b, pVar.f28955c, pVar.f28957e);
                return b0.f48488a;
            case 10:
                return ((c6.o) this.f23067b).invoke((WorkDatabase) this.f23068c);
            case 11:
                Context applicationContext = (Context) this.f23067b;
                kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
                return ef.e.v(applicationContext, ((q5.b) this.f23068c).f47462a);
            case 12:
                ((s2.d) this.f23067b).d((q) this.f23068c);
                return b0.f48488a;
            case 13:
                mc mcVar = ((i0) this.f23067b).f56892i0;
                y yVar = (y) this.f23068c;
                if ((((q) mcVar.f50089g).f58485d & 8) != 0) {
                    for (q qVar = (d2) mcVar.f50088f; qVar != null; qVar = qVar.f58486e) {
                        if ((qVar.f58484c & 8) != 0) {
                            ?? F = qVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof b2) {
                                    b2 b2Var = (b2) F;
                                    if (b2Var.H()) {
                                        g3.o oVar = new g3.o();
                                        yVar.f38361a = oVar;
                                        oVar.f28694d = true;
                                    }
                                    if (b2Var.C0()) {
                                        ((g3.o) yVar.f38361a).f28693c = true;
                                    }
                                    b2Var.i0((g3.b0) yVar.f38361a);
                                } else if ((F.f58484c & 8) != 0 && (F instanceof y2.n)) {
                                    q qVar2 = ((y2.n) F).R;
                                    int i11 = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.f58484c & 8) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = qVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new n1.e(new q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.c(F);
                                                    F = 0;
                                                }
                                                eVar.c(qVar2);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        qVar2 = qVar2.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = y2.f.f(eVar);
                            }
                        }
                    }
                }
                return b0.f48488a;
            case 14:
                fz.c cVar2 = (fz.c) this.f23067b;
                t0 t0Var = k1.f56939o0;
                cVar2.invoke(t0Var);
                k1 k1Var2 = (k1) this.f23068c;
                w0 w0Var = k1Var2.f56949f0;
                w0 w0Var2 = t0Var.O;
                boolean z11 = w0Var != w0Var2;
                boolean z12 = k1Var2.f56950g0;
                boolean z13 = t0Var.P;
                boolean z14 = z12 != z13;
                if (z11 || z14) {
                    k1Var2.f56949f0 = w0Var2;
                    k1Var2.f56950g0 = z13;
                    if (k1Var2.f56951h0 && (z14 || (z13 && z11))) {
                        k1Var2.Q.G();
                    }
                }
                k1Var2.f56951h0 = true;
                t0Var.V = t0Var.O.a(t0Var.Q, t0Var.S, t0Var.R);
                return b0.f48488a;
            case 15:
                ((y) this.f23067b).f38361a = y2.f.i((y3.q) this.f23068c, e1.f54482a);
                return b0.f48488a;
            case 16:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f23068c));
            case 17:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) this.f23068c));
            case 18:
                x xVar = (x) this.f23068c;
                g2 g2Var = (g2) this.f23067b;
                g3.l lVar = g2Var.f58566e;
                g3.l lVar2 = g2Var.f58567f;
                Float f5 = g2Var.f58564c;
                Float f11 = g2Var.f58565d;
                float fFloatValue = (lVar == null || f5 == null) ? 0.0f : ((Number) lVar.f28657a.invoke()).floatValue() - f5.floatValue();
                float fFloatValue2 = (lVar2 == null || f11 == null) ? 0.0f : ((Number) lVar2.f28657a.invoke()).floatValue() - f11.floatValue();
                if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO || fFloatValue2 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    int iA = xVar.A(g2Var.f58562a);
                    g3.u uVar2 = (g3.u) xVar.s().b(xVar.N);
                    if (uVar2 != null) {
                        try {
                            a5.g gVar = xVar.P;
                            if (gVar != null) {
                                gVar.l(xVar.k(uVar2));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    g3.u uVar3 = (g3.u) xVar.s().b(xVar.O);
                    if (uVar3 != null) {
                        try {
                            a5.g gVar2 = xVar.Q;
                            if (gVar2 != null) {
                                gVar2.l(xVar.k(uVar3));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    xVar.f58708d.invalidate();
                    g3.u uVar4 = (g3.u) xVar.s().b(iA);
                    if (uVar4 != null && (tVar = uVar4.f28703a) != null && (i0Var = tVar.f28698c) != null) {
                        if (lVar != null) {
                            xVar.S.h(iA, lVar);
                        }
                        if (lVar2 != null) {
                            xVar.T.h(iA, lVar2);
                        }
                        xVar.w(i0Var);
                    }
                }
                if (lVar != null) {
                    g2Var.f58564c = (Float) lVar.f28657a.invoke();
                }
                if (lVar2 != null) {
                    g2Var.f58565d = (Float) lVar2.f28657a.invoke();
                }
                return b0.f48488a;
            case 19:
                ((AbstractComposeView) this.f23067b).removeOnAttachStateChangeListener((l2) this.f23068c);
                return b0.f48488a;
            case 20:
                ((AbstractComposeView) this.f23067b).removeOnAttachStateChangeListener((cb.j) this.f23068c);
                return b0.f48488a;
            default:
                ((Lifecycle) this.f23067b).removeObserver((p4) this.f23068c);
                return b0.f48488a;
        }
    }
}
