package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import hh.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.o2;
import r.t2;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f38983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f38984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5.f f38985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f38989g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aj.i f38990h = new aj.i(this, 5);

    public h0(Toolbar toolbar, CharSequence charSequence, x xVar) {
        hd.b bVar = new hd.b(this, 28);
        t2 t2Var = new t2(toolbar, false);
        this.f38983a = t2Var;
        xVar.getClass();
        this.f38984b = xVar;
        t2Var.f48664k = xVar;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!t2Var.f48660g) {
            t2Var.f48661h = charSequence;
            if ((t2Var.f48655b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (t2Var.f48660g) {
                    s0.r(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f38985c = new a5.f(this, 23);
    }

    @Override // l.a
    public final boolean a() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.f38983a.f48654a.f1028a;
        return (actionMenuView == null || (cVar = actionMenuView.V) == null || !cVar.b()) ? false : true;
    }

    @Override // l.a
    public final boolean b() {
        q.n nVar;
        o2 o2Var = this.f38983a.f48654a.f1051r0;
        if (o2Var == null || (nVar = o2Var.f48619b) == null) {
            return false;
        }
        if (o2Var == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // l.a
    public final void c(boolean z11) {
        if (z11 == this.f38988f) {
            return;
        }
        this.f38988f = z11;
        ArrayList arrayList = this.f38989g;
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
    }

    @Override // l.a
    public final int d() {
        return this.f38983a.f48655b;
    }

    @Override // l.a
    public final Context e() {
        return this.f38983a.f48654a.getContext();
    }

    @Override // l.a
    public final boolean f() {
        t2 t2Var = this.f38983a;
        Toolbar toolbar = t2Var.f48654a;
        aj.i iVar = this.f38990h;
        toolbar.removeCallbacks(iVar);
        Toolbar toolbar2 = t2Var.f48654a;
        WeakHashMap weakHashMap = s0.f58893a;
        toolbar2.postOnAnimation(iVar);
        return true;
    }

    @Override // l.a
    public final void h() {
        this.f38983a.f48654a.removeCallbacks(this.f38990h);
    }

    @Override // l.a
    public final boolean i(int i11, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuV.performShortcut(i11, keyEvent, 0);
    }

    @Override // l.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // l.a
    public final boolean k() {
        return this.f38983a.f48654a.v();
    }

    @Override // l.a
    public final void m(boolean z11) {
        w(4, 4);
    }

    @Override // l.a
    public final void n() {
        w(2, 2);
    }

    @Override // l.a
    public final void o() {
        w(0, 8);
    }

    @Override // l.a
    public final void p(int i11) {
        t2 t2Var = this.f38983a;
        Toolbar toolbar = t2Var.f48654a;
        Drawable drawableK = i11 != 0 ? jh.h.k(toolbar.getContext(), i11) : null;
        t2Var.f48659f = drawableK;
        if ((t2Var.f48655b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableK == null) {
            drawableK = t2Var.f48667o;
        }
        toolbar.setNavigationIcon(drawableK);
    }

    @Override // l.a
    public final void s(String str) {
        t2 t2Var = this.f38983a;
        t2Var.f48660g = true;
        Toolbar toolbar = t2Var.f48654a;
        t2Var.f48661h = str;
        if ((t2Var.f48655b & 8) != 0) {
            toolbar.setTitle(str);
            if (t2Var.f48660g) {
                s0.r(toolbar.getRootView(), str);
            }
        }
    }

    @Override // l.a
    public final void t(CharSequence charSequence) {
        t2 t2Var = this.f38983a;
        if (t2Var.f48660g) {
            return;
        }
        Toolbar toolbar = t2Var.f48654a;
        t2Var.f48661h = charSequence;
        if ((t2Var.f48655b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (t2Var.f48660g) {
                s0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu v() {
        boolean z11 = this.f38987e;
        t2 t2Var = this.f38983a;
        if (!z11) {
            com.android.billingclient.api.k0 k0Var = new com.android.billingclient.api.k0(this);
            hd.d dVar = new hd.d(this, 27);
            Toolbar toolbar = t2Var.f48654a;
            toolbar.f1052s0 = k0Var;
            toolbar.f1054t0 = dVar;
            ActionMenuView actionMenuView = toolbar.f1028a;
            if (actionMenuView != null) {
                actionMenuView.W = k0Var;
                actionMenuView.f878a0 = dVar;
            }
            this.f38987e = true;
        }
        return t2Var.f48654a.getMenu();
    }

    public final void w(int i11, int i12) {
        t2 t2Var = this.f38983a;
        t2Var.a((i11 & i12) | ((~i12) & t2Var.f48655b));
    }

    @Override // l.a
    public final void g() {
    }

    @Override // l.a
    public final void q() {
    }

    @Override // l.a
    public final void l(boolean z11) {
    }

    @Override // l.a
    public final void r(boolean z11) {
    }
}
