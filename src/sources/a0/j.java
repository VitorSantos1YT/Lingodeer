package a0;

import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.LifecycleOwner;
import com.yalantis.ucrop.view.CropImageView;
import h1.cc;
import h1.e8;
import h1.n9;
import h1.o9;
import h1.s3;
import h1.s5;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;
import y2.f2;
import y2.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e2.e0 e0Var, e2.p pVar, fz.c cVar) {
        super(1);
        this.f110a = 4;
        this.f111b = e0Var;
        this.f112c = pVar;
        this.f113d = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [fz.c, kotlin.jvm.internal.n] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        g2.z0 z0Var;
        long j11;
        g2.z0 z0Var2;
        g2.z0 z0Var3;
        g2.z0 z0Var4;
        g2.z0 z0Var5;
        int i11 = this.f110a;
        int i12 = 2;
        boolean zBooleanValue = false;
        boolean z11 = false;
        int i13 = 3;
        g2.z0 z0Var6 = 0;
        z0Var6 = 0;
        int i14 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f113d;
        Object obj3 = this.f112c;
        Object obj4 = this.f111b;
        switch (i11) {
            case 0:
                return new i((x1.p) obj4, obj3, (y) obj2, z11 ? 1 : 0);
            case 1:
                g2.t0 t0Var = (g2.t0) obj;
                b3 b3Var = (b3) obj3;
                b3 b3Var2 = (b3) obj4;
                t0Var.b(b3Var2 != null ? ((Number) b3Var2.getValue()).floatValue() : 1.0f);
                t0Var.h(b3Var != null ? ((Number) b3Var.getValue()).floatValue() : 1.0f);
                t0Var.i(b3Var != null ? ((Number) b3Var.getValue()).floatValue() : 1.0f);
                b3 b3Var3 = (b3) obj2;
                t0Var.p(b3Var3 != null ? ((g2.z0) b3Var3.getValue()).f28633a : g2.z0.f28631b);
                return b0Var;
            case 2:
                l1 l1Var = (l1) obj3;
                m1 m1Var = (m1) obj2;
                int i15 = b1.f25a[((v0) obj).ordinal()];
                if (i15 == 1) {
                    z0Var = (g2.z0) obj4;
                } else if (i15 == 2) {
                    s1 s1Var = l1Var.f132a.f56d;
                    if (s1Var != null) {
                        z0Var3 = new g2.z0(s1Var.f183b);
                    } else {
                        s1 s1Var2 = m1Var.f143a.f56d;
                        if (s1Var2 != null) {
                            z0Var2 = new g2.z0(s1Var2.f183b);
                        }
                    }
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s1 s1Var3 = m1Var.f143a.f56d;
                    if (s1Var3 != null) {
                        z0Var5 = new g2.z0(s1Var3.f183b);
                    } else {
                        s1 s1Var4 = l1Var.f132a.f56d;
                        if (s1Var4 != null) {
                            z0Var4 = new g2.z0(s1Var4.f183b);
                        }
                    }
                }
                if (z0Var6 != 0) {
                    z0Var6 = z0Var;
                    z0Var6 = z0Var2;
                    z0Var6 = z0Var3;
                    z0Var6 = z0Var4;
                    z0Var6 = z0Var5;
                    j11 = z0Var6.f28633a;
                } else {
                    z0Var6 = z0Var;
                    z0Var6 = z0Var2;
                    z0Var6 = z0Var3;
                    z0Var6 = z0Var4;
                    z0Var6 = z0Var5;
                    j11 = g2.z0.f28631b;
                }
                return new g2.z0(j11);
            case 3:
                g2 g2Var = (g2) obj;
                c2.g gVar = (c2.g) g2Var;
                if (!((c2.b) y2.f.y((c2.g) obj3).getDragAndDropManager()).f6501b.contains(gVar) || !se.p.K(gVar, ub.a.V((b2) obj2))) {
                    return f2.ContinueTraversal;
                }
                ((kotlin.jvm.internal.y) obj4).f38361a = g2Var;
                return f2.CancelTraversal;
            case 4:
                e2.e0 e0Var = (e2.e0) obj;
                if (!kotlin.jvm.internal.m.a(e0Var, (e2.e0) obj4)) {
                    if (kotlin.jvm.internal.m.a(e0Var, ((e2.p) obj3).f24738c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.n) obj2).invoke(e0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                g.f fVar = (g.f) obj2;
                ((f.d0) obj4).a((LifecycleOwner) obj3, fVar);
                return new bt.j1(fVar, i12);
            case 6:
                g.l lVar = (g.l) obj2;
                ((f.d0) obj4).a((LifecycleOwner) obj3, lVar);
                return new bt.j1(lVar, i13);
            case 7:
                b0.l lVar2 = (b0.l) obj;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                float fFloatValue = ((Number) lVar2.f3591e.getValue()).floatValue() - vVar.f38358a;
                cc ccVar = (cc) obj3;
                float fL = ccVar.f30112c.l();
                ccVar.b(fL + fFloatValue);
                float fAbs = Math.abs(fL - ccVar.f30112c.l());
                vVar.f38358a = ((Number) lVar2.f3591e.getValue()).floatValue();
                ((kotlin.jvm.internal.v) obj2).f38358a = ((Number) lVar2.f3587a.f3576b.invoke(lVar2.f3592f)).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    lVar2.a();
                }
                return b0Var;
            case 8:
                long jLongValue = ((Number) obj).longValue();
                Long l9 = (Long) obj4;
                Long l11 = (Long) obj3;
                fz.e eVar = (fz.e) obj2;
                j0.v1 v1Var = s3.f31051a;
                if (!(l9 == null && l11 == null) && ((l9 == null || l11 == null) && l9 != null && jLongValue >= l9.longValue())) {
                    eVar.invoke(l9, Long.valueOf(jLongValue));
                } else {
                    eVar.invoke(Long.valueOf(jLongValue), null);
                }
                return b0Var;
            case 9:
                e8 e8Var = (e8) obj3;
                rz.e0.B((rz.b0) obj4, null, null, new f3.c(((Number) obj).floatValue(), i14, e8Var, z0Var6), 3).invokeOnCompletion(new s5(e8Var, (fz.a) obj2, 1));
                return b0Var;
            case 10:
                return new n9((o9) obj, (v3.c) obj4, (fz.c) obj3, (fz.c) obj2);
            case 11:
                w2.f1 f1Var = (w2.f1) obj;
                i1.d0 d0Var = (i1.d0) obj3;
                float fD = ((w2.s0) obj4).c0() ? d0Var.Q.h().d(((l1.g0) d0Var.Q.f44882h).getValue()) : d0Var.Q.r();
                f0.h1 h1Var = d0Var.S;
                float f5 = h1Var == f0.h1.Horizontal ? fD : 0.0f;
                if (h1Var != f0.h1.Vertical) {
                    fD = 0.0f;
                }
                f1Var.f((w2.g1) obj2, hz.b.Q(f5), hz.b.Q(fD), CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 12:
                m6.w wVar = (m6.w) obj4;
                m6.u uVar = (m6.u) obj3;
                if (pz.a.c(wVar.a(), uVar.f40928b) < 0) {
                    long j12 = uVar.f40928b;
                    AtomicReference atomicReference = wVar.f40933b;
                    m6.v vVar2 = new m6.v(j12);
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Object objInvoke = vVar2.invoke(obj5);
                        do {
                            if (atomicReference.compareAndSet(obj5, objInvoke)) {
                            }
                        } while (atomicReference.get() == obj5);
                    }
                }
                rz.e0.B(wVar, null, null, new m6.e((m6.f) obj2, z0Var6, i14), 3);
                return b0Var;
            case 13:
                return ob.m.E((ob.m) obj4, (n9.e) obj, (n9.x) obj3, (n9.x) obj2);
            case 14:
                i2.d dVar = (i2.d) obj;
                y2.k0 k0Var = (y2.k0) obj4;
                y2.q qVar = k0Var.f56938b;
                k0Var.f56938b = (y2.q) obj3;
                try {
                    v3.c cVarA = dVar.j0().A();
                    v3.m mVarE = dVar.j0().E();
                    g2.v vVarX = dVar.j0().x();
                    long jH = dVar.j0().H();
                    j2.c cVar = (j2.c) dVar.j0().f56175c;
                    fz.c cVar2 = (fz.c) obj2;
                    v3.c cVarA2 = k0Var.j0().A();
                    v3.m mVarE2 = k0Var.j0().E();
                    g2.v vVarX2 = k0Var.j0().x();
                    long jH2 = k0Var.j0().H();
                    j2.c cVar3 = (j2.c) k0Var.j0().f56175c;
                    xq.c cVarJ0 = k0Var.j0();
                    cVarJ0.R(cVarA);
                    cVarJ0.S(mVarE);
                    cVarJ0.Q(vVarX);
                    cVarJ0.T(jH);
                    cVarJ0.f56175c = cVar;
                    vVarX.e();
                    try {
                        cVar2.invoke(k0Var);
                        vVarX.p();
                        xq.c cVarJ1 = k0Var.j0();
                        cVarJ1.R(cVarA2);
                        cVarJ1.S(mVarE2);
                        cVarJ1.Q(vVarX2);
                        cVarJ1.T(jH2);
                        cVarJ1.f56175c = cVar3;
                        k0Var.f56938b = qVar;
                        return b0Var;
                    } catch (Throwable th2) {
                        vVarX.p();
                        xq.c cVarJ2 = k0Var.j0();
                        cVarJ2.R(cVarA2);
                        cVarJ2.S(mVarE2);
                        cVarJ2.Q(vVarX2);
                        cVarJ2.T(jH2);
                        cVarJ2.f56175c = cVar3;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    k0Var.f56938b = qVar;
                    throw th3;
                }
            default:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) obj4;
                y2.i0 i0Var = (y2.i0) obj3;
                ViewFactoryHolder viewFactoryHolder2 = (ViewFactoryHolder) obj2;
                g2.v vVarX3 = ((i2.d) obj).j0().x();
                if (viewFactoryHolder.getView().getVisibility() != 8) {
                    viewFactoryHolder.f1223d0 = true;
                    y2.t1 t1Var = i0Var.Q;
                    AndroidComposeView androidComposeView = t1Var instanceof AndroidComposeView ? (AndroidComposeView) t1Var : null;
                    if (androidComposeView != null) {
                        Canvas canvasA = g2.d.a(vVarX3);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        viewFactoryHolder2.draw(canvasA);
                    }
                    viewFactoryHolder.f1223d0 = false;
                }
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i11) {
        super(1);
        this.f110a = i11;
        this.f111b = obj;
        this.f112c = obj2;
        this.f113d = obj3;
    }
}
