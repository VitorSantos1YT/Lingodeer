package g1;

import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import cr.n;
import d0.a1;
import dt.h2;
import g2.v;
import g2.x;
import java.util.LinkedHashMap;
import l1.b1;
import l1.f2;
import l1.k1;
import l1.t;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f2, g, a1 {
    public RippleContainer H;
    public final k1 K = t.B(null);
    public final k1 L = t.B(Boolean.TRUE);
    public long M = 0;
    public int N = -1;
    public final n O = new n(this, 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f28510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f28511f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewGroup f28512t;

    public a(boolean z11, float f5, b1 b1Var, b1 b1Var2, ViewGroup viewGroup) {
        this.f28506a = z11;
        this.f28507b = new k(new h2(12, b1Var2), z11);
        this.f28508c = z11;
        this.f28509d = f5;
        this.f28510e = b1Var;
        this.f28511f = b1Var2;
        this.f28512t = viewGroup;
    }

    @Override // g1.g
    public final void J() {
        this.K.setValue(null);
    }

    @Override // l1.f2
    public final void a() {
        RippleContainer rippleContainer = this.H;
        if (rippleContainer != null) {
            J();
            ob.e eVar = rippleContainer.f1119d;
            RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) eVar.f44804b).get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f44804b;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f1118c.add(rippleHostView);
            }
        }
    }

    @Override // d0.a1
    public final void b(k0 k0Var) {
        i2.b bVar = k0Var.f56937a;
        this.M = bVar.d();
        float f5 = this.f28509d;
        this.N = Float.isNaN(f5) ? hz.b.Q(f.a(k0Var, this.f28508c, bVar.d())) : bVar.n0(f5);
        long j11 = ((x) this.f28510e.getValue()).f28624a;
        float f11 = ((e) this.f28511f.getValue()).f28522d;
        k0Var.a();
        this.f28507b.f(k0Var, Float.isNaN(f5) ? f.a(k0Var, this.f28506a, bVar.d()) : k0Var.e0(f5), j11);
        v vVarX = bVar.f34121b.x();
        ((Boolean) this.L.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.K.getValue();
        if (rippleHostView != null) {
            rippleHostView.e(f11, bVar.d(), j11, this.N);
            rippleHostView.draw(g2.d.a(vVarX));
        }
    }

    @Override // l1.f2
    public final void d() {
        RippleContainer rippleContainer = this.H;
        if (rippleContainer != null) {
            J();
            ob.e eVar = rippleContainer.f1119d;
            RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) eVar.f44804b).get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f44804b;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f1118c.add(rippleHostView);
            }
        }
    }

    @Override // l1.f2
    public final void f() {
    }
}
