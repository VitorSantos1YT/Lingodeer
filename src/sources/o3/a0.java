package o3;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j3.u0;
import j3.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.m f44630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7.u f44631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.c f44633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fz.c f44634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f44635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f44636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f44637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f44638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f44639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f44640l;
    public final n1.e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i0 f44641n;

    public a0(View view, AndroidComposeView androidComposeView) {
        ob.m mVar = new ob.m(view);
        h7.u uVar = new h7.u(Choreographer.getInstance(), 1);
        this.f44629a = view;
        this.f44630b = mVar;
        this.f44631c = uVar;
        this.f44633e = b.f44644d;
        this.f44634f = b.f44645e;
        this.f44635g = new w(BuildConfig.VERSION_NAME, x0.f35821b, 4);
        this.f44636h = j.f44678g;
        this.f44637i = new ArrayList();
        this.f44638j = com.bumptech.glide.d.u(qy.j.NONE, new a0.c0(this, 25));
        this.f44640l = new c(androidComposeView, mVar);
        this.m = new n1.e(new y[16]);
    }

    @Override // o3.r
    public final void a() {
        i(y.StartInput);
    }

    @Override // o3.r
    public final void b(f2.c cVar) {
        Rect rect;
        this.f44639k = new Rect(hz.b.Q(cVar.f26572a), hz.b.Q(cVar.f26573b), hz.b.Q(cVar.f26574c), hz.b.Q(cVar.f26575d));
        if (!this.f44637i.isEmpty() || (rect = this.f44639k) == null) {
            return;
        }
        this.f44629a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // o3.r
    public final void c() {
        i(y.ShowKeyboard);
    }

    @Override // o3.r
    public final void d() {
        this.f44632d = false;
        this.f44633e = b.f44646f;
        this.f44634f = b.f44647t;
        this.f44639k = null;
        i(y.StopInput);
    }

    @Override // o3.r
    public final void e(w wVar, j jVar, pr.a0 a0Var, s0.w wVar2) {
        this.f44632d = true;
        this.f44635g = wVar;
        this.f44636h = jVar;
        this.f44633e = a0Var;
        this.f44634f = wVar2;
        i(y.StartInput);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, qy.h] */
    @Override // o3.r
    public final void f(w wVar, w wVar2) {
        boolean z11 = (x0.b(this.f44635g.f44705b, wVar2.f44705b) && kotlin.jvm.internal.m.a(this.f44635g.f44706c, wVar2.f44706c)) ? false : true;
        this.f44635g = wVar2;
        int size = this.f44637i.size();
        for (int i11 = 0; i11 < size; i11++) {
            s sVar = (s) ((WeakReference) this.f44637i.get(i11)).get();
            if (sVar != null) {
                sVar.f44692d = wVar2;
            }
        }
        c cVar = this.f44640l;
        synchronized (cVar.f44653c) {
            cVar.f44660j = null;
            cVar.f44662l = null;
            cVar.f44661k = null;
            cVar.m = b.f44642b;
            cVar.f44663n = null;
            cVar.f44664o = null;
        }
        if (kotlin.jvm.internal.m.a(wVar, wVar2)) {
            if (z11) {
                ob.m mVar = this.f44630b;
                int iF = x0.f(wVar2.f44705b);
                int iE = x0.e(wVar2.f44705b);
                x0 x0Var = this.f44635g.f44706c;
                int iF2 = x0Var != null ? x0.f(x0Var.f35823a) : -1;
                x0 x0Var2 = this.f44635g.f44706c;
                ((InputMethodManager) mVar.f44827c.getValue()).updateSelection((View) mVar.f44826b, iF, iE, iF2, x0Var2 != null ? x0.e(x0Var2.f35823a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!kotlin.jvm.internal.m.a(wVar.f44704a.f35700b, wVar2.f44704a.f35700b) || (x0.b(wVar.f44705b, wVar2.f44705b) && !kotlin.jvm.internal.m.a(wVar.f44706c, wVar2.f44706c)))) {
            ob.m mVar2 = this.f44630b;
            ((InputMethodManager) mVar2.f44827c.getValue()).restartInput((View) mVar2.f44826b);
            return;
        }
        int size2 = this.f44637i.size();
        for (int i12 = 0; i12 < size2; i12++) {
            s sVar2 = (s) ((WeakReference) this.f44637i.get(i12)).get();
            if (sVar2 != null) {
                w wVar3 = this.f44635g;
                ob.m mVar3 = this.f44630b;
                if (sVar2.f44696h) {
                    sVar2.f44692d = wVar3;
                    if (sVar2.f44694f) {
                        ((InputMethodManager) mVar3.f44827c.getValue()).updateExtractedText((View) mVar3.f44826b, sVar2.f44693e, com.bumptech.glide.g.x(wVar3));
                    }
                    x0 x0Var3 = wVar3.f44706c;
                    long j11 = wVar3.f44705b;
                    int iF3 = x0Var3 != null ? x0.f(x0Var3.f35823a) : -1;
                    x0 x0Var4 = wVar3.f44706c;
                    ((InputMethodManager) mVar3.f44827c.getValue()).updateSelection((View) mVar3.f44826b, x0.f(j11), x0.e(j11), iF3, x0Var4 != null ? x0.e(x0Var4.f35823a) : -1);
                }
            }
        }
    }

    @Override // o3.r
    public final void g() {
        i(y.HideKeyboard);
    }

    @Override // o3.r
    public final void h(w wVar, p pVar, u0 u0Var, av.t tVar, f2.c cVar, f2.c cVar2) {
        c cVar3 = this.f44640l;
        synchronized (cVar3.f44653c) {
            try {
                cVar3.f44660j = wVar;
                cVar3.f44662l = pVar;
                cVar3.f44661k = u0Var;
                cVar3.m = tVar;
                cVar3.f44663n = cVar;
                cVar3.f44664o = cVar2;
                if (cVar3.f44655e || cVar3.f44654d) {
                    cVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(y yVar) {
        this.m.c(yVar);
        if (this.f44641n == null) {
            i0 i0Var = new i0(this, 6);
            this.f44631c.execute(i0Var);
            this.f44641n = i0Var;
        }
    }
}
