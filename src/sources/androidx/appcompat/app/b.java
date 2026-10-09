package androidx.appcompat.app;

import a0.b2;
import ae.d;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.b0;
import l.d0;
import l.e0;
import l.h0;
import l.m;
import l.m0;
import l.n;
import l.r;
import l.t;
import l.v;
import l.w;
import l.x;
import l.y;
import l.z;
import lf.i0;
import ob.u;
import p.c;
import q.h;
import q.j;
import q.l;
import qp.m4;
import r.b3;
import r.s;
import r.t2;
import r.y0;
import r.y2;
import v4.e;
import v4.f;
import y.t0;
import z4.f0;
import z4.j0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements j, LayoutInflater.Factory2 {
    public static final t0 J0 = new t0(0);
    public static final int[] K0 = {R.attr.windowBackground};
    public static final boolean L0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public int B0;
    public boolean D0;
    public Rect E0;
    public Rect F0;
    public e0 G0;
    public OnBackInvokedDispatcher H0;
    public OnBackInvokedCallback I0;
    public final Object L;
    public final Context M;
    public Window N;
    public x O;
    public final Object P;
    public l.a Q;
    public p.j R;
    public CharSequence S;
    public y0 T;
    public dm.a U;
    public b2 V;
    public c W;
    public ActionBarContextView X;
    public PopupWindow Y;
    public r Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f802b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ViewGroup f803c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f804d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f805e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f806f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f807g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f808h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f809i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f810j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f811k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f812l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f813m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public z[] f814n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public z f815o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f818r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f819s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Configuration f820t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f821u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f822v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f823w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f824x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public y f825y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public y f826z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public w0 f801a0 = null;
    public final r C0 = new r(this, 0);

    public b(Context context, Window window, n nVar, Object obj) {
        m mVar = null;
        this.f821u0 = -100;
        this.M = context;
        this.P = nVar;
        this.L = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof m)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    mVar = (m) context;
                    break;
                }
            }
            if (mVar != null) {
                this.f821u0 = ((b) mVar.getDelegate()).f821u0;
            }
        }
        if (this.f821u0 == -100) {
            String name = this.L.getClass().getName();
            t0 t0Var = J0;
            Integer num = (Integer) t0Var.get(name);
            if (num != null) {
                this.f821u0 = num.intValue();
                t0Var.remove(this.L.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        s.d();
    }

    public static e q(Context context) {
        e eVar;
        e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = a.f796c) == null) {
            return null;
        }
        f fVar = eVar.f53512a;
        e eVarB = v.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f53513a.isEmpty()) {
            eVar2 = e.f53511b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < eVarB.f53512a.f53513a.size() + fVar.f53513a.size()) {
                Locale locale = i11 < fVar.f53513a.size() ? fVar.f53513a.get(i11) : eVarB.f53512a.f53513a.get(i11 - fVar.f53513a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            eVar2 = new e(new f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f53512a.f53513a.isEmpty() ? eVarB : eVar2;
    }

    public static Configuration u(Context context, int i11, e eVar, Configuration configuration, boolean z11) {
        int i12;
        if (i11 == 1) {
            i12 = 16;
        } else if (i11 != 2) {
            i12 = z11 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i12 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            v.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final z A(int i11) {
        z[] zVarArr = this.f814n0;
        if (zVarArr == null || zVarArr.length <= i11) {
            z[] zVarArr2 = new z[i11 + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f814n0 = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i11];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f39074a = i11;
        zVar2.f39086n = false;
        zVarArr[i11] = zVar2;
        return zVar2;
    }

    public final void B() {
        x();
        if (this.f808h0 && this.Q == null) {
            Object obj = this.L;
            if (obj instanceof Activity) {
                this.Q = new m0((Activity) obj, this.f809i0);
            } else if (obj instanceof Dialog) {
                this.Q = new m0((Dialog) obj);
            }
            l.a aVar = this.Q;
            if (aVar != null) {
                aVar.l(this.D0);
            }
        }
    }

    public final void C(int i11) {
        this.B0 = (1 << i11) | this.B0;
        if (this.A0) {
            return;
        }
        View decorView = this.N.getDecorView();
        WeakHashMap weakHashMap = s0.f58893a;
        decorView.postOnAnimation(this.C0);
        this.A0 = true;
    }

    public final int D(Context context, int i11) {
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f826z0 == null) {
                            this.f826z0 = new y(this, context);
                        }
                        return this.f826z0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).g();
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean E() {
        boolean z11 = this.f816p0;
        this.f816p0 = false;
        z zVarA = A(0);
        if (!zVarA.m) {
            c cVar = this.W;
            if (cVar != null) {
                cVar.a();
                return true;
            }
            B();
            l.a aVar = this.Q;
            if (aVar == null || !aVar.b()) {
                return false;
            }
        } else if (!z11) {
            t(zVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r2.f47272f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(l.z r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.F(l.z, android.view.KeyEvent):void");
    }

    public final boolean G(z zVar, int i11, KeyEvent keyEvent) {
        l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f39084k || H(zVar, keyEvent)) && (lVar = zVar.f39081h) != null) {
            return lVar.performShortcut(i11, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    public final boolean H(z zVar, KeyEvent keyEvent) {
        l lVar;
        y0 y0Var;
        y0 y0Var2;
        Resources.Theme themeNewTheme;
        y0 y0Var3;
        y0 y0Var4;
        if (!this.f819s0) {
            boolean z11 = zVar.f39084k;
            int i11 = zVar.f39074a;
            if (z11) {
                return true;
            }
            z zVar2 = this.f815o0;
            if (zVar2 != null && zVar2 != zVar) {
                t(zVar2, false);
            }
            Window.Callback callback = this.N.getCallback();
            if (callback != null) {
                zVar.f39080g = callback.onCreatePanelView(i11);
            }
            boolean z12 = i11 == 0 || i11 == 108;
            if (z12 && (y0Var4 = this.T) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var4;
                actionBarOverlayLayout.k();
                ((t2) actionBarOverlayLayout.f871e).f48665l = true;
            }
            if (zVar.f39080g == null && (!z12 || !(this.Q instanceof h0))) {
                l lVar2 = zVar.f39081h;
                if (lVar2 == null || zVar.f39087o) {
                    if (lVar2 == null) {
                        Context context = this.M;
                        if ((i11 == 0 || i11 == 108) && this.T != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.lingodeer.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.lingodeer.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.lingodeer.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                p.e eVar = new p.e(context, 0);
                                eVar.getTheme().setTo(themeNewTheme);
                                context = eVar;
                            }
                        }
                        l lVar3 = new l(context);
                        lVar3.f47284e = this;
                        l lVar4 = zVar.f39081h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(zVar.f39082i);
                            }
                            zVar.f39081h = lVar3;
                            h hVar = zVar.f39082i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f47280a);
                            }
                        }
                        if (zVar.f39081h != null) {
                            if (z12 && (y0Var2 = this.T) != null) {
                                if (this.U == null) {
                                    this.U = new dm.a(this, 21);
                                }
                                ((ActionBarOverlayLayout) y0Var2).l(zVar.f39081h, this.U);
                            }
                            zVar.f39081h.y();
                            if (callback.onCreatePanelMenu(i11, zVar.f39081h)) {
                                zVar.f39087o = false;
                            } else {
                                lVar = zVar.f39081h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(zVar.f39082i);
                                    }
                                    zVar.f39081h = null;
                                }
                                if (z12 && (y0Var = this.T) != null) {
                                    ((ActionBarOverlayLayout) y0Var).l(null, this.U);
                                }
                            }
                        }
                    } else {
                        if (z12) {
                            if (this.U == null) {
                                this.U = new dm.a(this, 21);
                            }
                            ((ActionBarOverlayLayout) y0Var2).l(zVar.f39081h, this.U);
                        }
                        zVar.f39081h.y();
                        if (callback.onCreatePanelMenu(i11, zVar.f39081h)) {
                            lVar = zVar.f39081h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(zVar.f39082i);
                                }
                                zVar.f39081h = null;
                            }
                            if (z12) {
                                ((ActionBarOverlayLayout) y0Var).l(null, this.U);
                            }
                        } else {
                            zVar.f39087o = false;
                        }
                    }
                }
                zVar.f39081h.y();
                Bundle bundle = zVar.f39088p;
                if (bundle != null) {
                    zVar.f39081h.s(bundle);
                    zVar.f39088p = null;
                }
                if (!callback.onPreparePanel(0, zVar.f39080g, zVar.f39081h)) {
                    if (z12 && (y0Var3 = this.T) != null) {
                        ((ActionBarOverlayLayout) y0Var3).l(null, this.U);
                    }
                    zVar.f39081h.x();
                    return false;
                }
                zVar.f39081h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                zVar.f39081h.x();
            }
            zVar.f39084k = true;
            zVar.f39085l = false;
            this.f815o0 = zVar;
            return true;
        }
        return false;
    }

    public final void I() {
        if (this.f802b0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z11 = false;
            if (this.H0 != null && (A(0).m || this.W != null)) {
                z11 = true;
            }
            if (z11 && this.I0 == null) {
                this.I0 = w.b(this.H0, this);
            } else {
                if (z11 || (onBackInvokedCallback = this.I0) == null) {
                    return;
                }
                w.c(this.H0, onBackInvokedCallback);
                this.I0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void a() {
        if (this.Q != null) {
            B();
            if (this.Q.f()) {
                return;
            }
            C(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // q.j
    public final boolean c(l lVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.N.getCallback();
        if (callback != null && !this.f819s0) {
            l lVarK = lVar.k();
            z[] zVarArr = this.f814n0;
            int length = zVarArr != null ? zVarArr.length : 0;
            for (int i11 = 0; i11 < length; i11++) {
                zVar = zVarArr[i11];
                if (zVar != null && zVar.f39081h == lVarK) {
                    if (zVar != null) {
                        return callback.onMenuItemSelected(zVar.f39074a, menuItem);
                    }
                }
            }
            zVar = null;
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f39074a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final void d() {
        String strC;
        this.f817q0 = true;
        o(false, true);
        y();
        Object obj = this.L;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = n4.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new IllegalArgumentException(e8);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                l.a aVar = this.Q;
                if (aVar == null) {
                    this.D0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (a.H) {
                a.f(this);
                a.f800t.add(new WeakReference(this));
            }
        }
        this.f820t0 = new Configuration(this.M.getResources().getConfiguration());
        this.f818r0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.a
    public final void e() {
        if (this.L instanceof Activity) {
            synchronized (a.H) {
                a.f(this);
            }
        }
        if (this.A0) {
            this.N.getDecorView().removeCallbacks(this.C0);
        }
        this.f819s0 = true;
        if (this.f821u0 != -100) {
            Object obj = this.L;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                J0.put(this.L.getClass().getName(), Integer.valueOf(this.f821u0));
            } else {
                J0.remove(this.L.getClass().getName());
            }
        } else {
            J0.remove(this.L.getClass().getName());
        }
        l.a aVar = this.Q;
        if (aVar != null) {
            aVar.h();
        }
        y yVar = this.f825y0;
        if (yVar != null) {
            yVar.d();
        }
        y yVar2 = this.f826z0;
        if (yVar2 != null) {
            yVar2.d();
        }
    }

    @Override // androidx.appcompat.app.a
    public final boolean g(int i11) {
        if (i11 == 8) {
            i11 = 108;
        } else if (i11 == 9) {
            i11 = 109;
        }
        if (this.f812l0 && i11 == 108) {
            return false;
        }
        if (this.f808h0 && i11 == 1) {
            this.f808h0 = false;
        }
        if (i11 == 1) {
            I();
            this.f812l0 = true;
            return true;
        }
        if (i11 == 2) {
            I();
            this.f806f0 = true;
            return true;
        }
        if (i11 == 5) {
            I();
            this.f807g0 = true;
            return true;
        }
        if (i11 == 10) {
            I();
            this.f810j0 = true;
            return true;
        }
        if (i11 == 108) {
            I();
            this.f808h0 = true;
            return true;
        }
        if (i11 != 109) {
            return this.N.requestFeature(i11);
        }
        I();
        this.f809i0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void h(int i11) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f803c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.M).inflate(i11, viewGroup);
        this.O.a(this.N.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // q.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(q.l r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.i(q.l):void");
    }

    @Override // androidx.appcompat.app.a
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f803c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.O.a(this.N.getCallback());
    }

    @Override // androidx.appcompat.app.a
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f803c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.O.a(this.N.getCallback());
    }

    @Override // androidx.appcompat.app.a
    public final void m(CharSequence charSequence) {
        this.S = charSequence;
        y0 y0Var = this.T;
        if (y0Var != null) {
            y0Var.setWindowTitle(charSequence);
            return;
        }
        l.a aVar = this.Q;
        if (aVar != null) {
            aVar.t(charSequence);
            return;
        }
        TextView textView = this.f804d0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l.n] */
    @Override // androidx.appcompat.app.a
    public final c n(p.b bVar) {
        c cVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (bVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        c cVar = this.W;
        if (cVar != null) {
            cVar.a();
        }
        u uVar = new u(this, bVar, false, 18);
        B();
        l.a aVar = this.Q;
        ?? r9 = this.P;
        if (aVar != null) {
            c cVarU = aVar.u(uVar);
            this.W = cVarU;
            if (cVarU != null) {
                r9.onSupportActionModeStarted(cVarU);
            }
        }
        if (this.W == null) {
            w0 w0Var = this.f801a0;
            if (w0Var != null) {
                w0Var.b();
            }
            c cVar2 = this.W;
            if (cVar2 != null) {
                cVar2.a();
            }
            if (this.f819s0) {
                cVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    cVarOnWindowStartingSupportActionMode = r9.onWindowStartingSupportActionMode(uVar);
                } catch (AbstractMethodError unused) {
                    cVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (cVarOnWindowStartingSupportActionMode != null) {
                this.W = cVarOnWindowStartingSupportActionMode;
            } else {
                int i11 = 1;
                if (this.X == null) {
                    boolean z11 = this.f811k0;
                    Context context = this.M;
                    if (z11) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.lingodeer.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p.e eVar = new p.e(context, 0);
                            eVar.getTheme().setTo(themeNewTheme);
                            context = eVar;
                        }
                        this.X = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.lingodeer.R.attr.actionModePopupWindowStyle);
                        this.Y = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.Y.setContentView(this.X);
                        this.Y.setWidth(-1);
                        context.getTheme().resolveAttribute(com.lingodeer.R.attr.actionBarSize, typedValue, true);
                        this.X.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.Y.setHeight(-2);
                        this.Z = new r(this, i11);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f803c0.findViewById(com.lingodeer.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            B();
                            l.a aVar2 = this.Q;
                            Context contextE = aVar2 != null ? aVar2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.X = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.X != null) {
                    w0 w0Var2 = this.f801a0;
                    if (w0Var2 != null) {
                        w0Var2.b();
                    }
                    this.X.g();
                    Context context2 = this.X.getContext();
                    ActionBarContextView actionBarContextView = this.X;
                    p.f fVar = new p.f();
                    fVar.f46187c = context2;
                    fVar.f46188d = actionBarContextView;
                    fVar.f46189e = uVar;
                    l lVar = new l(actionBarContextView.getContext());
                    lVar.N = 1;
                    fVar.H = lVar;
                    lVar.f47284e = fVar;
                    if (((p.b) uVar.f44891b).a(fVar, lVar)) {
                        fVar.h();
                        this.X.e(fVar);
                        this.W = fVar;
                        if (this.f802b0 && (viewGroup = this.f803c0) != null && viewGroup.isLaidOut()) {
                            this.X.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                            w0 w0VarB = s0.b(this.X);
                            w0VarB.a(1.0f);
                            this.f801a0 = w0VarB;
                            w0VarB.g(new t(this, i11));
                        } else {
                            this.X.setAlpha(1.0f);
                            this.X.setVisibility(0);
                            if (this.X.getParent() instanceof View) {
                                View view = (View) this.X.getParent();
                                WeakHashMap weakHashMap = s0.f58893a;
                                z4.h0.c(view);
                            }
                        }
                        if (this.Y != null) {
                            this.N.getDecorView().post(this.Z);
                        }
                    } else {
                        this.W = null;
                    }
                }
            }
            c cVar3 = this.W;
            if (cVar3 != null) {
                r9.onSupportActionModeStarted(cVar3);
            }
            J();
            this.W = this.W;
        }
        J();
        return this.W;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z11, boolean z12) {
        int i11;
        boolean z13;
        boolean z14;
        boolean z15;
        Object obj;
        boolean z16;
        Object obj2;
        boolean z17;
        if (this.f819s0) {
            return false;
        }
        int i12 = this.f821u0;
        if (i12 == -100) {
            i12 = a.f795b;
        }
        Context context = this.M;
        int iD = D(context, i12);
        int i13 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        e eVarQ = i13 < 33 ? q(context) : null;
        if (!z12 && eVarQ != null) {
            eVarQ = v.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, eVarQ, null, false);
        boolean z18 = this.f824x0;
        Object obj3 = this.L;
        if (z18 || !(obj3 instanceof Activity)) {
            this.f824x0 = true;
            i11 = this.f823w0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i11 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i13 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f823w0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f823w0 = 0;
                }
                this.f824x0 = true;
                i11 = this.f823w0;
            }
        }
        Configuration configuration = this.f820t0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i14 = configuration.uiMode & 48;
        int i15 = configurationU.uiMode & 48;
        e eVarB = v.b(configuration);
        e eVarB2 = eVarQ == null ? null : v.b(configurationU);
        int i16 = i14 != i15 ? 512 : 0;
        if (eVarB2 != null && !eVarB.equals(eVarB2)) {
            i16 |= 8196;
        }
        if (((~i11) & i16) != 0 && z11 && this.f817q0 && ((L0 || this.f818r0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z13 = false;
            } else {
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && (i16 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i17 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new i0(activity, 5));
                }
                z13 = true;
            }
        } else {
            z13 = false;
        }
        if (z13 || i16 == 0) {
            z14 = z13;
        } else {
            boolean z19 = (i16 & i11) == i16;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i15;
            if (eVarB2 != null) {
                v.d(configuration2, eVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 26 && i18 < 28) {
                if (!ub.a.f52911j) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        ub.a.f52910i = declaredField;
                        z15 = true;
                        try {
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException unused2) {
                        }
                    } catch (NoSuchFieldException unused3) {
                        z15 = true;
                    }
                    ub.a.f52911j = z15;
                }
                Field field = ub.a.f52910i;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException unused4) {
                        obj = null;
                    }
                    if (obj != null) {
                        if (!ub.a.f52905d) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                ub.a.f52904c = declaredField2;
                                z16 = true;
                                try {
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException unused5) {
                                }
                            } catch (NoSuchFieldException unused6) {
                                z16 = true;
                            }
                            ub.a.f52905d = z16;
                        }
                        Field field2 = ub.a.f52904c;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException unused7) {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!ub.a.f52907f) {
                                try {
                                    ub.a.f52906e = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException unused8) {
                                }
                                ub.a.f52907f = true;
                            }
                            Class cls = ub.a.f52906e;
                            if (cls != null) {
                                if (!ub.a.f52909h) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        ub.a.f52908g = declaredField3;
                                        z17 = true;
                                        try {
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException unused9) {
                                        }
                                    } catch (NoSuchFieldException unused10) {
                                        z17 = true;
                                    }
                                    ub.a.f52909h = z17;
                                }
                                Field field3 = ub.a.f52908g;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException unused11) {
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i19 = this.f822v0;
            if (i19 != 0) {
                context.setTheme(i19);
                z14 = true;
                context.getTheme().applyStyle(this.f822v0, true);
            } else {
                z14 = true;
            }
            if (z19 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f818r0 && !this.f819s0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z14 && (obj3 instanceof m)) {
            if ((i16 & 512) != 0) {
                ((m) obj3).onNightModeChanged(iD);
            }
            if ((i16 & 4) != 0) {
                ((m) obj3).onLocalesChanged(eVarQ);
            }
        }
        if (eVarB2 != null) {
            v.c(v.b(context.getResources().getConfiguration()));
        }
        if (i12 == 0) {
            z(context).n();
        } else {
            y yVar = this.f825y0;
            if (yVar != null) {
                yVar.d();
            }
        }
        if (i12 == 3) {
            if (this.f826z0 == null) {
                this.f826z0 = new y(this, context);
            }
            this.f826z0.n();
        } else {
            y yVar2 = this.f826z0;
            if (yVar2 != null) {
                yVar2.d();
            }
        }
        return z14;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        View view2 = null;
        if (this.G0 == null) {
            int[] iArr = k.a.f37409k;
            Context context2 = this.M;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.G0 = new e0();
            } else {
                try {
                    this.G0 = (e0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.G0 = new e0();
                }
            }
        }
        e0 e0Var = this.G0;
        int i11 = y2.f48718a;
        e0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k.a.B, 0, 0);
        byte b3 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context eVar = (resourceId == 0 || ((context instanceof p.e) && ((p.e) context).f46182a == resourceId)) ? context : new p.e(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b3 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b3 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b3 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b3 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b3 = -1;
                }
                break;
            case -658531749:
                b3 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b3 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b3 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b3 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b3 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b3 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b3 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b3 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b3 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(eVar, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(eVar, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(eVar, attributeSet);
                break;
            case 3:
                appCompatRatingBar = e0Var.e(eVar, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(eVar, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(eVar, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(eVar, attributeSet);
                break;
            case 7:
                appCompatRatingBar = e0Var.d(eVar, attributeSet);
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(eVar, attributeSet);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(eVar, attributeSet);
                break;
            case 10:
                appCompatRatingBar = e0Var.a(eVar, attributeSet);
                break;
            case 11:
                appCompatRatingBar = e0Var.c(eVar, attributeSet);
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(eVar, attributeSet);
                break;
            case 13:
                appCompatRatingBar = e0Var.b(eVar, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar != null || context == eVar) {
            view2 = appCompatRatingBar;
        } else {
            Object[] objArr = e0Var.f38959a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = eVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr = e0.f38957g;
                        if (i12 < 3) {
                            View viewF = e0Var.f(eVar, str, strArr[i12]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i12++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = e0Var.f(eVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, e0.f38953c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new d0(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = eVar.obtainStyledAttributes(attributeSet, e0.f38954d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = s0.f58893a;
                    new f0(com.lingodeer.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(view2, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = eVar.obtainStyledAttributes(attributeSet, e0.f38955e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    s0.r(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = eVar.obtainStyledAttributes(attributeSet, e0.f38956f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z12 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = s0.f58893a;
                    new f0(com.lingodeer.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z12));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.N != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.O = xVar;
        window.setCallback(xVar);
        m4 m4VarJ = m4.j(this.M, null, K0);
        Drawable drawableH = m4VarJ.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        m4VarJ.l();
        this.N = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.H0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.I0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.I0 = null;
        }
        Object obj = this.L;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.H0 = w.a(activity);
            } else {
                this.H0 = null;
            }
        } else {
            this.H0 = null;
        }
        J();
    }

    public final void r(int i11, z zVar, l lVar) {
        if (lVar == null) {
            if (zVar == null && i11 >= 0) {
                z[] zVarArr = this.f814n0;
                if (i11 < zVarArr.length) {
                    zVar = zVarArr[i11];
                }
            }
            if (zVar != null) {
                lVar = zVar.f39081h;
            }
        }
        if ((zVar == null || zVar.m) && !this.f819s0) {
            x xVar = this.O;
            Window.Callback callback = this.N.getCallback();
            xVar.getClass();
            try {
                xVar.f39069e = true;
                callback.onPanelClosed(i11, lVar);
            } finally {
                xVar.f39069e = false;
            }
        }
    }

    public final void s(l lVar) {
        androidx.appcompat.widget.c cVar;
        if (this.f813m0) {
            return;
        }
        this.f813m0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.T;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((t2) actionBarOverlayLayout.f871e).f48654a.f1028a;
        if (actionMenuView != null && (cVar = actionMenuView.V) != null) {
            cVar.b();
            r.e eVar = cVar.W;
            if (eVar != null && eVar.b()) {
                eVar.f47318i.dismiss();
            }
        }
        Window.Callback callback = this.N.getCallback();
        if (callback != null && !this.f819s0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f813m0 = false;
    }

    public final void t(z zVar, boolean z11) {
        ViewGroup viewGroup;
        y0 y0Var;
        if (z11 && zVar.f39074a == 0 && (y0Var = this.T) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var;
            actionBarOverlayLayout.k();
            if (((t2) actionBarOverlayLayout.f871e).f48654a.p()) {
                s(zVar.f39081h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.M.getSystemService("window");
        if (windowManager != null && zVar.m && (viewGroup = zVar.f39078e) != null) {
            windowManager.removeView(viewGroup);
            if (z11) {
                r(zVar.f39074a, zVar, null);
            }
        }
        zVar.f39084k = false;
        zVar.f39085l = false;
        zVar.m = false;
        zVar.f39079f = null;
        zVar.f39086n = true;
        if (this.f815o0 == zVar) {
            this.f815o0 = null;
        }
        if (zVar.f39074a == 0) {
            J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134 A[RETURN] */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        z zVarA;
        y0 y0Var;
        boolean z11;
        boolean zV;
        boolean zH;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        androidx.appcompat.widget.c cVar;
        z zVarA2;
        Object obj = this.L;
        if ((!(obj instanceof z4.l) && !(obj instanceof b0)) || (decorView = this.N.getDecorView()) == null || !v10.c.g(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.O;
                Window.Callback callback = this.N.getCallback();
                xVar.getClass();
                try {
                    xVar.f39068d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    xVar.f39068d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f816p0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    zVarA2 = A(0);
                                    if (!zVarA2.m) {
                                        H(zVarA2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.W == null) {
                                    zVarA = A(0);
                                    y0Var = this.T;
                                    Context context = this.M;
                                    if (y0Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((t2) actionBarOverlayLayout.f871e).f48654a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f1028a) == null || !actionMenuView.U || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z11 = zVarA.m;
                                            if (!z11 || zVarA.f39085l) {
                                                t(zVarA, true);
                                                zV = z11;
                                            } else {
                                                if (zVarA.f39084k) {
                                                    if (zVarA.f39087o) {
                                                        zVarA.f39084k = false;
                                                        zH = H(zVarA, keyEvent);
                                                    } else {
                                                        zH = true;
                                                    }
                                                    if (zH) {
                                                        F(zVarA, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.T;
                                            actionBarOverlayLayout2.k();
                                            if (((t2) actionBarOverlayLayout2.f871e).f48654a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.T;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((t2) actionBarOverlayLayout3.f871e).f48654a.f1028a;
                                                if (actionMenuView2 != null && (cVar = actionMenuView2.V) != null && cVar.b()) {
                                                    zV = true;
                                                }
                                            } else if (!this.f819s0 && H(zVarA, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.T;
                                                actionBarOverlayLayout4.k();
                                                zV = ((t2) actionBarOverlayLayout4.f871e).f48654a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z11 = zVarA.m;
                                        if (z11) {
                                        }
                                        t(zVarA, true);
                                        zV = z11;
                                    }
                                    if (zV && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (E()) {
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    xVar.f39068d = false;
                    throw th2;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f816p0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            zVarA2 = A(0);
                            if (!zVarA2.m) {
                                H(zVarA2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.W == null) {
                            zVarA = A(0);
                            y0Var = this.T;
                            Context context2 = this.M;
                            if (y0Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) y0Var;
                                actionBarOverlayLayout5.k();
                                toolbar = ((t2) actionBarOverlayLayout5.f871e).f48654a;
                                if (toolbar.getVisibility() == 0) {
                                    z11 = zVarA.m;
                                    if (z11) {
                                    }
                                    t(zVarA, true);
                                    zV = z11;
                                } else {
                                    z11 = zVarA.m;
                                    if (z11) {
                                    }
                                    t(zVarA, true);
                                    zV = z11;
                                }
                            } else {
                                z11 = zVarA.m;
                                if (z11) {
                                }
                                t(zVarA, true);
                                zV = z11;
                            }
                            if (zV) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (E()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void w(int i11) {
        z zVarA = A(i11);
        if (zVarA.f39081h != null) {
            Bundle bundle = new Bundle();
            zVarA.f39081h.u(bundle);
            if (bundle.size() > 0) {
                zVarA.f39088p = bundle;
            }
            zVarA.f39081h.y();
            zVarA.f39081h.clear();
        }
        zVarA.f39087o = true;
        zVarA.f39086n = true;
        if ((i11 == 108 || i11 == 0) && this.T != null) {
            z zVarA2 = A(0);
            zVarA2.f39084k = false;
            H(zVarA2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f802b0) {
            return;
        }
        Context context = this.M;
        int[] iArr = k.a.f37409k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i11 = 0;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f811k0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.N.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f812l0) {
            viewGroup = this.f810j0 ? (ViewGroup) layoutInflaterFrom.inflate(com.lingodeer.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.lingodeer.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f811k0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.lingodeer.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f809i0 = false;
            this.f808h0 = false;
        } else if (this.f808h0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.lingodeer.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p.e(context, typedValue.resourceId) : context).inflate(com.lingodeer.R.layout.abc_screen_toolbar, (ViewGroup) null);
            y0 y0Var = (y0) viewGroup.findViewById(com.lingodeer.R.id.decor_content_parent);
            this.T = y0Var;
            y0Var.setWindowCallback(this.N.getCallback());
            if (this.f809i0) {
                ((ActionBarOverlayLayout) this.T).j(109);
            }
            if (this.f806f0) {
                ((ActionBarOverlayLayout) this.T).j(2);
            }
            if (this.f807g0) {
                ((ActionBarOverlayLayout) this.T).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f808h0);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f809i0);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f811k0);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f810j0);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(p0.p(sb2, this.f812l0, " }"));
        }
        l.s sVar = new l.s(this, i11);
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(viewGroup, sVar);
        if (this.T == null) {
            this.f804d0 = (TextView) viewGroup.findViewById(com.lingodeer.R.id.title);
        }
        boolean z11 = b3.f48531a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.lingodeer.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.N.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.N.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new a5.j(this, 27));
        this.f803c0 = viewGroup;
        Object obj = this.L;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.S;
        if (!TextUtils.isEmpty(title)) {
            y0 y0Var2 = this.T;
            if (y0Var2 != null) {
                y0Var2.setWindowTitle(title);
            } else {
                l.a aVar = this.Q;
                if (aVar != null) {
                    aVar.t(title);
                } else {
                    TextView textView = this.f804d0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f803c0.findViewById(R.id.content);
        View decorView = this.N.getDecorView();
        contentFrameLayout2.f945t.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(AchievementLevelType.DAY_STREAK_LV_7, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f802b0 = true;
        z zVarA = A(0);
        if (this.f819s0 || zVarA.f39081h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.N == null) {
            Object obj = this.L;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.N == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final d z(Context context) {
        if (this.f825y0 == null) {
            if (ob.m.f44824e == null) {
                Context applicationContext = context.getApplicationContext();
                ob.m.f44824e = new ob.m(applicationContext, (LocationManager) applicationContext.getSystemService(RequestParameters.SUBRESOURCE_LOCATION));
            }
            this.f825y0 = new y(this, ob.m.f44824e);
        }
        return this.f825y0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
