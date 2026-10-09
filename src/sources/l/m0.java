package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.o2;
import r.t2;
import r.z0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a implements r.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f39033y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f39034z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f39035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f39037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f39038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f39039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f39040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f39041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f39043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f39044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ob.u f39045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39046l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p.l f39052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f39054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k0 f39055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k0 f39056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a5.j f39057x;

    public m0(Activity activity, boolean z11) {
        new ArrayList();
        this.m = new ArrayList();
        this.f39047n = 0;
        this.f39048o = true;
        this.f39051r = true;
        this.f39055v = new k0(this, 0);
        this.f39056w = new k0(this, 1);
        this.f39057x = new a5.j(this, 28);
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z11) {
            return;
        }
        this.f39041g = decorView.findViewById(R.id.content);
    }

    @Override // l.a
    public final boolean b() {
        o2 o2Var;
        z0 z0Var = this.f39039e;
        if (z0Var == null || (o2Var = ((t2) z0Var).f48654a.f1051r0) == null || o2Var.f48619b == null) {
            return false;
        }
        o2 o2Var2 = ((t2) z0Var).f48654a.f1051r0;
        q.n nVar = o2Var2 == null ? null : o2Var2.f48619b;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // l.a
    public final void c(boolean z11) {
        if (z11 == this.f39046l) {
            return;
        }
        this.f39046l = z11;
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
    }

    @Override // l.a
    public final int d() {
        return ((t2) this.f39039e).f48655b;
    }

    @Override // l.a
    public final Context e() {
        if (this.f39036b == null) {
            TypedValue typedValue = new TypedValue();
            this.f39035a.getTheme().resolveAttribute(com.lingodeer.R.attr.actionBarWidgetTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f39036b = new ContextThemeWrapper(this.f39035a, i11);
            } else {
                this.f39036b = this.f39035a;
            }
        }
        return this.f39036b;
    }

    @Override // l.a
    public final void g() {
        y(p.a.a(this.f39035a).f46178b.getResources().getBoolean(com.lingodeer.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // l.a
    public final boolean i(int i11, KeyEvent keyEvent) {
        q.l lVar;
        l0 l0Var = this.f39043i;
        if (l0Var == null || (lVar = l0Var.f39029d) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i11, keyEvent, 0);
    }

    @Override // l.a
    public final void l(boolean z11) {
        if (this.f39042h) {
            return;
        }
        m(z11);
    }

    @Override // l.a
    public final void m(boolean z11) {
        x(z11 ? 4 : 0, 4);
    }

    @Override // l.a
    public final void n() {
        x(2, 2);
    }

    @Override // l.a
    public final void o() {
        x(0, 8);
    }

    @Override // l.a
    public final void p(int i11) {
        t2 t2Var = (t2) this.f39039e;
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
    public final void q() {
        this.f39039e.getClass();
    }

    @Override // l.a
    public final void r(boolean z11) {
        p.l lVar;
        this.f39053t = z11;
        if (z11 || (lVar = this.f39052s) == null) {
            return;
        }
        lVar.a();
    }

    @Override // l.a
    public final void s(String str) {
        t2 t2Var = (t2) this.f39039e;
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
        t2 t2Var = (t2) this.f39039e;
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

    @Override // l.a
    public final p.c u(ob.u uVar) {
        l0 l0Var = this.f39043i;
        if (l0Var != null) {
            l0Var.a();
        }
        this.f39037c.setHideOnContentScrollEnabled(false);
        this.f39040f.g();
        l0 l0Var2 = new l0(this, this.f39040f.getContext(), uVar);
        q.l lVar = l0Var2.f39029d;
        lVar.y();
        try {
            boolean zA = ((p.b) l0Var2.f39030e.f44891b).a(l0Var2, lVar);
            lVar.x();
            if (!zA) {
                return null;
            }
            this.f39043i = l0Var2;
            l0Var2.h();
            this.f39040f.e(l0Var2);
            v(true);
            return l0Var2;
        } catch (Throwable th2) {
            lVar.x();
            throw th2;
        }
    }

    public final void v(boolean z11) {
        w0 w0VarH;
        w0 w0VarH2;
        if (z11) {
            if (!this.f39050q) {
                this.f39050q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f39037c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (this.f39050q) {
            this.f39050q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f39037c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        if (!this.f39038d.isLaidOut()) {
            if (z11) {
                ((t2) this.f39039e).f48654a.setVisibility(4);
                this.f39040f.setVisibility(0);
                return;
            } else {
                ((t2) this.f39039e).f48654a.setVisibility(0);
                this.f39040f.setVisibility(8);
                return;
            }
        }
        if (z11) {
            t2 t2Var = (t2) this.f39039e;
            w0VarH = s0.b(t2Var.f48654a);
            w0VarH.a(CropImageView.DEFAULT_ASPECT_RATIO);
            w0VarH.e(100L);
            w0VarH.g(new p.k(t2Var, 4));
            w0VarH2 = this.f39040f.h(0, 200L);
        } else {
            t2 t2Var2 = (t2) this.f39039e;
            w0 w0VarB = s0.b(t2Var2.f48654a);
            w0VarB.a(1.0f);
            w0VarB.e(200L);
            w0VarB.g(new p.k(t2Var2, 0));
            w0VarH = this.f39040f.h(8, 100L);
            w0VarH2 = w0VarB;
        }
        p.l lVar = new p.l();
        ArrayList arrayList = lVar.f46232a;
        arrayList.add(w0VarH);
        View view = (View) w0VarH.f58909a.get();
        w0VarH2.h(view != null ? view.animate().getDuration() : 0L);
        arrayList.add(w0VarH2);
        lVar.b();
    }

    public final void w(View view) {
        z0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.lingodeer.R.id.decor_content_parent);
        this.f39037c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.lingodeer.R.id.action_bar);
        if (callbackFindViewById instanceof z0) {
            wrapper = (z0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f39039e = wrapper;
        this.f39040f = (ActionBarContextView) view.findViewById(com.lingodeer.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.lingodeer.R.id.action_bar_container);
        this.f39038d = actionBarContainer;
        z0 z0Var = this.f39039e;
        if (z0Var == null || this.f39040f == null || actionBarContainer == null) {
            throw new IllegalStateException(m0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((t2) z0Var).f48654a.getContext();
        this.f39035a = context;
        if ((((t2) this.f39039e).f48655b & 4) != 0) {
            this.f39042h = true;
        }
        Context context2 = p.a.a(context).f46178b;
        int i11 = context2.getApplicationInfo().targetSdkVersion;
        q();
        y(context2.getResources().getBoolean(com.lingodeer.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f39035a.obtainStyledAttributes(null, k.a.f37399a, com.lingodeer.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f39037c;
            if (!actionBarOverlayLayout2.f876t) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f39054u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f39038d;
            WeakHashMap weakHashMap = s0.f58893a;
            z4.j0.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void x(int i11, int i12) {
        t2 t2Var = (t2) this.f39039e;
        int i13 = t2Var.f48655b;
        if ((i12 & 4) != 0) {
            this.f39042h = true;
        }
        t2Var.a((i11 & i12) | ((~i12) & i13));
    }

    public final void y(boolean z11) {
        if (z11) {
            this.f39038d.setTabContainer(null);
            ((t2) this.f39039e).getClass();
        } else {
            ((t2) this.f39039e).getClass();
            this.f39038d.setTabContainer(null);
        }
        this.f39039e.getClass();
        ((t2) this.f39039e).f48654a.setCollapsible(false);
        this.f39037c.setHasNonEmbeddedTabs(false);
    }

    public final void z(boolean z11) {
        boolean z12 = this.f39049p;
        boolean z13 = this.f39050q;
        int i11 = 2;
        a5.j jVar = this.f39057x;
        View view = this.f39041g;
        if (!z13 && z12) {
            if (this.f39051r) {
                this.f39051r = false;
                p.l lVar = this.f39052s;
                if (lVar != null) {
                    lVar.a();
                }
                int i12 = this.f39047n;
                k0 k0Var = this.f39055v;
                if (i12 != 0 || (!this.f39053t && !z11)) {
                    k0Var.b(null);
                    return;
                }
                this.f39038d.setAlpha(1.0f);
                this.f39038d.setTransitioning(true);
                p.l lVar2 = new p.l();
                float f5 = -this.f39038d.getHeight();
                if (z11) {
                    int[] iArr = {0, 0};
                    this.f39038d.getLocationInWindow(iArr);
                    f5 -= iArr[1];
                }
                w0 w0VarB = s0.b(this.f39038d);
                w0VarB.l(f5);
                View view2 = (View) w0VarB.f58909a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(jVar != null ? new com.google.android.material.appbar.b(i11, jVar, view2) : null);
                }
                boolean z14 = lVar2.f46236e;
                ArrayList arrayList = lVar2.f46232a;
                if (!z14) {
                    arrayList.add(w0VarB);
                }
                if (this.f39048o && view != null) {
                    w0 w0VarB2 = s0.b(view);
                    w0VarB2.l(f5);
                    if (!lVar2.f46236e) {
                        arrayList.add(w0VarB2);
                    }
                }
                boolean z15 = lVar2.f46236e;
                if (!z15) {
                    lVar2.f46234c = f39033y;
                }
                if (!z15) {
                    lVar2.f46233b = 250L;
                }
                if (!z15) {
                    lVar2.f46235d = k0Var;
                }
                this.f39052s = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.f39051r) {
            return;
        }
        this.f39051r = true;
        p.l lVar3 = this.f39052s;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f39038d.setVisibility(0);
        int i13 = this.f39047n;
        k0 k0Var2 = this.f39056w;
        if (i13 == 0 && (this.f39053t || z11)) {
            this.f39038d.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            float f11 = -this.f39038d.getHeight();
            if (z11) {
                int[] iArr2 = {0, 0};
                this.f39038d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f39038d.setTranslationY(f11);
            p.l lVar4 = new p.l();
            w0 w0VarB3 = s0.b(this.f39038d);
            w0VarB3.l(CropImageView.DEFAULT_ASPECT_RATIO);
            View view3 = (View) w0VarB3.f58909a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(jVar != null ? new com.google.android.material.appbar.b(i11, jVar, view3) : null);
            }
            boolean z16 = lVar4.f46236e;
            ArrayList arrayList2 = lVar4.f46232a;
            if (!z16) {
                arrayList2.add(w0VarB3);
            }
            if (this.f39048o && view != null) {
                view.setTranslationY(f11);
                w0 w0VarB4 = s0.b(view);
                w0VarB4.l(CropImageView.DEFAULT_ASPECT_RATIO);
                if (!lVar4.f46236e) {
                    arrayList2.add(w0VarB4);
                }
            }
            boolean z17 = lVar4.f46236e;
            if (!z17) {
                lVar4.f46234c = f39034z;
            }
            if (!z17) {
                lVar4.f46233b = 250L;
            }
            if (!z17) {
                lVar4.f46235d = k0Var2;
            }
            this.f39052s = lVar4;
            lVar4.b();
        } else {
            this.f39038d.setAlpha(1.0f);
            this.f39038d.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            if (this.f39048o && view != null) {
                view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            k0Var2.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f39037c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = s0.f58893a;
            z4.h0.c(actionBarOverlayLayout);
        }
    }

    public m0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.f39047n = 0;
        this.f39048o = true;
        this.f39051r = true;
        this.f39055v = new k0(this, 0);
        this.f39056w = new k0(this, 1);
        this.f39057x = new a5.j(this, 28);
        w(dialog.getWindow().getDecorView());
    }
}
