package b1;

import android.graphics.Rect;
import android.view.View;
import j3.u0;
import j3.x0;
import java.lang.ref.WeakReference;
import pr.a0;
import rz.d0;
import rz.e0;
import rz.z1;
import uz.o0;
import uz.w0;
import z2.g1;
import z2.h1;
import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements o3.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f3773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f3774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f3775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f3776d;

    @Override // o3.r
    public final void a() {
        j(null);
    }

    @Override // o3.r
    public final void b(f2.c cVar) {
        Rect rect;
        w wVar = this.f3775c;
        if (wVar != null) {
            wVar.f3834l = new Rect(hz.b.Q(cVar.f26572a), hz.b.Q(cVar.f26573b), hz.b.Q(cVar.f26574c), hz.b.Q(cVar.f26575d));
            if (!wVar.f3832j.isEmpty() || (rect = wVar.f3834l) == null) {
                return;
            }
            wVar.f3823a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // o3.r
    public final void c() {
        i2 i2Var;
        r rVar = this.f3773a;
        if (rVar == null || (i2Var = (i2) y2.f.i(rVar, g1.f58554p)) == null) {
            return;
        }
        ((h1) i2Var).b();
    }

    @Override // o3.r
    public final void d() throws Throwable {
        z1 z1Var = this.f3774b;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f3774b = null;
        o0 o0VarI = i();
        if (o0VarI != null) {
            ((w0) o0VarI).c();
        }
    }

    @Override // o3.r
    public final void e(o3.w wVar, o3.j jVar, a0 a0Var, s0.w wVar2) {
        j(new a(wVar, this, jVar, a0Var, wVar2, 0));
    }

    @Override // o3.r
    public final void f(o3.w wVar, o3.w wVar2) {
        w wVar3 = this.f3775c;
        if (wVar3 != null) {
            boolean z11 = (x0.b(wVar3.f3830h.f44705b, wVar2.f44705b) && kotlin.jvm.internal.m.a(wVar3.f3830h.f44706c, wVar2.f44706c)) ? false : true;
            wVar3.f3830h = wVar2;
            int size = wVar3.f3832j.size();
            for (int i11 = 0; i11 < size; i11++) {
                x xVar = (x) ((WeakReference) wVar3.f3832j.get(i11)).get();
                if (xVar != null) {
                    xVar.f3841g = wVar2;
                }
            }
            t tVar = wVar3.m;
            synchronized (tVar.f3807c) {
                tVar.f3814j = null;
                tVar.f3816l = null;
                tVar.f3815k = null;
                tVar.m = null;
                tVar.f3817n = null;
            }
            if (kotlin.jvm.internal.m.a(wVar, wVar2)) {
                if (z11) {
                    p pVar = wVar3.f3824b;
                    int iF = x0.f(wVar2.f44705b);
                    int iE = x0.e(wVar2.f44705b);
                    x0 x0Var = wVar3.f3830h.f44706c;
                    int iF2 = x0Var != null ? x0.f(x0Var.f35823a) : -1;
                    x0 x0Var2 = wVar3.f3830h.f44706c;
                    pVar.z().updateSelection((View) pVar.f3800b, iF, iE, iF2, x0Var2 != null ? x0.e(x0Var2.f35823a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!kotlin.jvm.internal.m.a(wVar.f44704a.f35700b, wVar2.f44704a.f35700b) || (x0.b(wVar.f44705b, wVar2.f44705b) && !kotlin.jvm.internal.m.a(wVar.f44706c, wVar2.f44706c)))) {
                p pVar2 = wVar3.f3824b;
                pVar2.z().restartInput((View) pVar2.f3800b);
                return;
            }
            int size2 = wVar3.f3832j.size();
            for (int i12 = 0; i12 < size2; i12++) {
                x xVar2 = (x) ((WeakReference) wVar3.f3832j.get(i12)).get();
                if (xVar2 != null) {
                    o3.w wVar4 = wVar3.f3830h;
                    p pVar3 = wVar3.f3824b;
                    if (xVar2.f3845k) {
                        xVar2.f3841g = wVar4;
                        if (xVar2.f3843i) {
                            pVar3.z().updateExtractedText((View) pVar3.f3800b, xVar2.f3842h, s.d(wVar4));
                        }
                        x0 x0Var3 = wVar4.f44706c;
                        long j11 = wVar4.f44705b;
                        int iF3 = x0Var3 != null ? x0.f(x0Var3.f35823a) : -1;
                        x0 x0Var4 = wVar4.f44706c;
                        pVar3.z().updateSelection((View) pVar3.f3800b, x0.f(j11), x0.e(j11), iF3, x0Var4 != null ? x0.e(x0Var4.f35823a) : -1);
                    }
                }
            }
        }
    }

    @Override // o3.r
    public final void g() {
        i2 i2Var;
        r rVar = this.f3773a;
        if (rVar == null || (i2Var = (i2) y2.f.i(rVar, g1.f58554p)) == null) {
            return;
        }
        ((h1) i2Var).a();
    }

    @Override // o3.r
    public final void h(o3.w wVar, o3.p pVar, u0 u0Var, av.t tVar, f2.c cVar, f2.c cVar2) {
        w wVar2 = this.f3775c;
        if (wVar2 != null) {
            t tVar2 = wVar2.m;
            synchronized (tVar2.f3807c) {
                try {
                    tVar2.f3814j = wVar;
                    tVar2.f3816l = pVar;
                    tVar2.f3815k = u0Var;
                    tVar2.m = cVar;
                    tVar2.f3817n = cVar2;
                    if (tVar2.f3809e || tVar2.f3808d) {
                        tVar2.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o0 i() {
        w0 w0Var = this.f3776d;
        if (w0Var != null) {
            return w0Var;
        }
        if (!a1.f.f279a) {
            return null;
        }
        w0 w0VarB = uz.x0.b(0, 2, tz.a.DROP_LATEST);
        this.f3776d = w0VarB;
        return w0VarB;
    }

    public final void j(a aVar) {
        r rVar = this.f3773a;
        if (rVar == null) {
            return;
        }
        z1 z1Var = null;
        this.f3774b = rVar.P ? e0.B(rVar.H0(), null, d0.UNDISPATCHED, new c(2, rVar, new b0.f(aVar, this, rVar, z1Var, 2), z1Var), 1) : null;
    }

    public final void k(r rVar) {
        if (this.f3773a != rVar) {
            i0.a.c("Expected textInputModifierNode to be " + rVar + " but was " + this.f3773a);
        }
        this.f3773a = null;
    }
}
