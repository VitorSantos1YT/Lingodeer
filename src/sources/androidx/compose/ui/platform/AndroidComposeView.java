package androidx.compose.ui.platform;

import a2.a;
import a2.e;
import a2.o;
import a2.s;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.b;
import cf.c;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import e2.j;
import e2.k0;
import e2.p;
import e5.l;
import fr.p3;
import g1.k;
import g2.c0;
import g2.w;
import g3.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import l0.Eeqr.HOBXIlHxIkMBEA;
import l1.g0;
import l1.k1;
import mt.j5;
import o3.a0;
import o3.x;
import qh.z;
import qp.m3;
import qp.o2;
import rt.mc;
import rt.qf;
import s2.b0;
import s2.g;
import uz.h0;
import v3.m;
import w2.f1;
import w2.i1;
import w2.j1;
import w2.l1;
import w2.r;
import x1.u;
import x2.d;
import y.e0;
import y.n;
import y.o0;
import y.p0;
import y2.a2;
import y2.b1;
import y2.d2;
import y2.i0;
import y2.r1;
import y2.s1;
import y2.t;
import y2.t1;
import y2.y0;
import y2.y1;
import z2.a1;
import z2.d0;
import z2.d3;
import z2.f;
import z2.f0;
import z2.h;
import z2.h1;
import z2.i;
import z2.i2;
import z2.j2;
import z2.k2;
import z2.m0;
import z2.n0;
import z2.p1;
import z2.p2;
import z2.q;
import z2.q1;
import z2.q2;
import z2.r2;
import z2.s0;
import z2.u1;
import z2.v1;
import z2.w0;
import z2.w1;
import z2.x0;
import z2.x1;
import z2.z0;
import z2.z1;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements t1, k0, a2, g, DefaultLifecycleObserver, r1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, j {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static Class f1151l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static Method f1152m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static Method f1153n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final e0 f1154o1 = new e0();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static c f1155p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static Method f1156q1;
    public final int[] A0;
    public final float[] B0;
    public final float[] C0;
    public final float[] D0;
    public long E0;
    public boolean F0;
    public long G0;
    public final i H;
    public final k1 H0;
    public final g0 I0;
    public fz.c J0;
    public final k1 K;
    public final a0 K0;
    public final View L;
    public final x L0;
    public final boolean M;
    public final AtomicReference M0;
    public final p N;
    public final h1 N0;
    public vy.i O;
    public final p1 O0;
    public final b P;
    public final k1 P0;
    public final u1 Q;
    public final k1 Q0;
    public final w R;
    public final n2.b R0;
    public final s0 S;
    public final o2.c S0;
    public final r T;
    public final d T0;
    public final i0 U;
    public final n0 U0;
    public final y.x V;
    public MotionEvent V0;
    public final h3.b W;
    public long W0;
    public final qp.r X0;
    public final e0 Y0;
    public float Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1157a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final AndroidComposeView f1158a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public float f1159a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1160b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final v f1161b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final py.b f1162b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2.k0 f1163c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final z2.x f1164c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final i f1165c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v1 f1166d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public b2.i f1167d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f1168d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w1 f1169e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f1170e0;
    public final l e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u1.d f1171f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final g2.g f1172f0;
    public final z2.p f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final o f1173g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final z0 f1174g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e0 f1175h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f1176h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public e0 f1177i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final f3.i f1178i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f1179j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public View f1180j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1181k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final q f1182k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final p8.b f1183l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final k f1184m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final k1 f1185n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final a f1186o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final e f1187p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h f1189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final z2.g f1190s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ry.k f1191t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final y2.v1 f1192t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1193u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public AndroidViewsHandler f1194v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public v3.a f1195w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1196x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final y0 f1197y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f1198z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context, vy.i iVar) {
        e eVar;
        m mVar;
        super(context);
        AndroidComposeView androidComposeView = this;
        androidComposeView.f1157a = 9205357640488583168L;
        int i11 = 1;
        androidComposeView.f1160b = true;
        androidComposeView.f1163c = new y2.k0();
        androidComposeView.f1171f = u1.a.f52720a;
        androidComposeView.f1191t = new ry.k();
        int i12 = 0;
        androidComposeView.H = new i(androidComposeView, i12);
        v3.e eVarA = com.bumptech.glide.e.a(context);
        l1.g gVar = l1.g.f39301e;
        androidComposeView.K = new k1(eVarA, gVar);
        int i13 = Build.VERSION.SDK_INT;
        boolean z11 = i13 >= 35;
        androidComposeView.M = z11;
        g3.g gVar2 = new g3.g();
        androidComposeView.N = new p(androidComposeView, androidComposeView);
        androidComposeView.O = iVar;
        androidComposeView.P = new b();
        androidComposeView.Q = new u1();
        androidComposeView.R = new w();
        androidComposeView.S = new s0(ViewConfiguration.get(context));
        androidComposeView.T = new r();
        i0 i0Var = new i0(3);
        i0Var.f0(j1.f54530b);
        i0Var.c0(androidComposeView.getDensity());
        i0Var.h0(androidComposeView.getViewConfiguration());
        i0Var.g0(new z2.r(androidComposeView).i(((p) androidComposeView.getFocusOwner()).f24740e).i(androidComposeView.getDragAndDropManager().f6502c));
        androidComposeView.U = i0Var;
        y.x xVar = n.f56742a;
        androidComposeView.V = new y.x();
        androidComposeView.getLayoutNodes();
        androidComposeView.W = new h3.b();
        androidComposeView.f1158a0 = androidComposeView;
        androidComposeView.f1161b0 = new v(androidComposeView.getRoot(), gVar2, androidComposeView.getLayoutNodes());
        z2.x xVar2 = new z2.x(androidComposeView);
        androidComposeView.f1164c0 = xVar2;
        androidComposeView.f1167d0 = new b2.i(androidComposeView, new j5(0, androidComposeView, z2.g0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 14));
        androidComposeView.f1170e0 = new f(context);
        androidComposeView.f1172f0 = new g2.g(androidComposeView);
        androidComposeView.f1173g0 = new o();
        androidComposeView.f1175h0 = new e0();
        androidComposeView.f1183l0 = new p8.b(1);
        i0 root = androidComposeView.getRoot();
        k kVar = new k();
        kVar.f28529b = root;
        kVar.f28530c = new s2.d((y2.v) root.f56892i0.f50086d);
        kVar.f28531d = new o20.w(22);
        kVar.f28532e = new t();
        androidComposeView.f1184m0 = kVar;
        androidComposeView.f1185n0 = l1.t.B(new Configuration(context.getResources().getConfiguration()));
        androidComposeView.f1186o0 = f() ? new a(androidComposeView, androidComposeView.getAutofillTree()) : null;
        if (f()) {
            AutofillManager autofillManagerE = se.n.e(context.getSystemService(se.n.j()));
            if (autofillManagerE == null) {
                throw defpackage.e.t("Autofill service could not be located.");
            }
            androidComposeView = this;
            eVar = new e(new s(autofillManagerE), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            eVar = null;
        }
        androidComposeView.f1187p0 = eVar;
        androidComposeView.f1189r0 = new h(context);
        androidComposeView.f1190s0 = new z2.g(androidComposeView.getClipboardManager());
        androidComposeView.f1192t0 = new y2.v1(new z2.o(androidComposeView, i11));
        androidComposeView.f1197y0 = new y0(androidComposeView.getRoot());
        long j11 = Integer.MAX_VALUE;
        androidComposeView.f1198z0 = (j11 & 4294967295L) | (j11 << 32);
        androidComposeView.A0 = new int[]{0, 0};
        float[] fArrA = g2.k0.a();
        androidComposeView.B0 = fArrA;
        androidComposeView.C0 = g2.k0.a();
        androidComposeView.D0 = g2.k0.a();
        androidComposeView.E0 = -1L;
        androidComposeView.G0 = 9187343241974906880L;
        androidComposeView.H0 = l1.t.B(null);
        androidComposeView.I0 = l1.t.s(new z2.p(androidComposeView, 2));
        a0 a0Var = new a0(androidComposeView.getView(), androidComposeView);
        androidComposeView.K0 = a0Var;
        androidComposeView.L0 = new x(a0Var);
        androidComposeView.M0 = new AtomicReference(null);
        androidComposeView.N0 = new h1(androidComposeView.getTextInputService());
        androidComposeView.O0 = new p1(4);
        androidComposeView.P0 = new k1(fb.g0.i(context), gVar);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = e2.h.f24715a;
        if (layoutDirection != 0) {
            mVar = layoutDirection != 1 ? null : m.Rtl;
        } else {
            mVar = m.Ltr;
        }
        androidComposeView.Q0 = l1.t.B(mVar == null ? m.Ltr : mVar);
        androidComposeView.R0 = new n2.b(androidComposeView, i12);
        androidComposeView.S0 = new o2.c(androidComposeView.isInTouchMode() ? 1 : 2);
        androidComposeView.T0 = new d(androidComposeView);
        n0 n0Var = new n0();
        new p3(new l1(n0Var, 7));
        k2 k2Var = k2.Shown;
        androidComposeView.U0 = n0Var;
        androidComposeView.X0 = new qp.r(11);
        androidComposeView.Y0 = new e0();
        androidComposeView.f1162b1 = new py.b(androidComposeView, 15);
        androidComposeView.f1165c1 = new i(androidComposeView, i11);
        androidComposeView.e1 = new l(context, new z2.o(androidComposeView, i12));
        androidComposeView.f1 = new z2.p(androidComposeView, i11);
        androidComposeView.f1174g1 = i13 < 29 ? new z(fArrA) : new a1();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.f1167d0);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i13 >= 26) {
            f0.f58535a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        z4.s0.q(androidComposeView, xVar2);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().d(androidComposeView);
        if (i13 >= 29) {
            z2.a0.f58496a.a(androidComposeView);
        }
        if (z11) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            androidComposeView.L = view;
            androidComposeView.addView(view, -1);
        }
        androidComposeView.f1178i1 = i13 >= 31 ? new f3.i(0) : null;
        androidComposeView.f1182k1 = new q(androidComposeView);
    }

    public static final void b(AndroidComposeView androidComposeView, int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        z2.x xVar = androidComposeView.f1164c0;
        if (kotlin.jvm.internal.m.a(str, xVar.f58714g0)) {
            int iD2 = xVar.f58711e0.d(i11);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.m.a(str, xVar.f58715h0) || (iD = xVar.f58713f0.d(i11)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    @qy.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @qy.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z2.k get_viewTreeOwners() {
        return (z2.k) this.H0.getValue();
    }

    public static long h(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j11 = size;
        return j11 | (j11 << 32);
    }

    public static View i(View view, int i11) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.m.a(declaredMethod.invoke(view, null), Integer.valueOf(i11))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View viewI = i(viewGroup.getChildAt(i12), i11);
                    if (viewI != null) {
                        return viewI;
                    }
                }
            }
        }
        return null;
    }

    public static void l(i0 i0Var) {
        i0Var.E();
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            l((i0) objArr[i12]);
        }
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z11 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z11) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 1; i11 < pointerCount; i11++) {
                z11 = (Float.floatToRawIntBits(motionEvent.getX(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !z1.f58734a.a(motionEvent, i11));
                if (z11) {
                    break;
                }
            }
        }
        return z11;
    }

    private void setDensity(v3.c cVar) {
        this.K.setValue(cVar);
    }

    private void setFontFamilyResolver(n3.h hVar) {
        this.P0.setValue(hVar);
    }

    private void setLayoutDirection(m mVar) {
        this.Q0.setValue(mVar);
    }

    private final void set_viewTreeOwners(z2.k kVar) {
        this.H0.setValue(kVar);
    }

    public final void A() {
        z2.x xVar = this.f1164c0;
        xVar.f58705a0 = true;
        if (xVar.v() && !xVar.f58719l0) {
            xVar.f58719l0 = true;
            xVar.L.post(xVar.f58721n0);
        }
        b2.i iVar = this.f1167d0;
        iVar.f3871t = true;
        if (!iVar.e() || iVar.P) {
            return;
        }
        iVar.P = true;
        iVar.K.post(iVar.Q);
    }

    public final void B() {
        if (this.F0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.E0) {
            this.E0 = jCurrentAnimationTimeMillis;
            z0 z0Var = this.f1174g1;
            float[] fArr = this.C0;
            z0Var.c(this, fArr);
            z2.g0.y(fArr, this.D0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.A0;
            view.getLocationOnScreen(iArr);
            float f5 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.G0 = (((long) Float.floatToRawIntBits(f5 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f11 - iArr[1])) & 4294967295L);
        }
    }

    public final void C(MotionEvent motionEvent) {
        this.E0 = AnimationUtils.currentAnimationTimeMillis();
        z0 z0Var = this.f1174g1;
        float[] fArr = this.C0;
        z0Var.c(this, fArr);
        z2.g0.y(fArr, this.D0);
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jB = g2.k0.b((((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.G0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(i0 i0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (i0Var != null) {
            while (i0Var != null && i0Var.t() == y2.g0.InMeasureBlock) {
                if (!this.f1196x0) {
                    i0 i0VarW = i0Var.w();
                    if (i0VarW == null) {
                        break;
                    }
                    long j11 = ((y2.v) i0VarW.f56892i0.f50086d).f54504d;
                    if (v3.a.f(j11) && v3.a.e(j11)) {
                        break;
                    }
                }
                i0Var = i0Var.w();
            }
            if (i0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long F(long j11) {
        B();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (this.G0 >> 32));
        return g2.k0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (this.G0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.D0);
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.f1176h1) {
            this.f1176h1 = false;
            int metaState = motionEvent.getMetaState();
            this.Q.getClass();
            r2.f58660a.setValue(new b0(metaState));
        }
        p8.b bVar = this.f1183l0;
        o2 o2VarC = bVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        k kVar = this.f1184m0;
        if (o2VarC == null) {
            if (!kVar.f28528a) {
                ((y.r) ((o20.w) kVar.f28531d).f44617b).a();
                ((s2.d) kVar.f28530c).c();
            }
            return 0;
        }
        List list = (List) o2VarC.f48095b;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i11 = size - 1;
            obj = list.get(size);
            if (((s2.v) obj).f51364e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i11 < 0) {
                obj = null;
                break;
            }
            size = i11;
        }
        s2.v vVar = (s2.v) obj;
        if (vVar != null) {
            this.f1157a = vVar.f51363d;
        }
        int i12 = kVar.i(o2VarC, this, o(motionEvent));
        o2VarC.f48096c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (i12 & 1) != 0) {
            return i12;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ((SparseBooleanArray) bVar.f46569e).delete(pointerId);
        ((SparseLongArray) bVar.f46568d).delete(pointerId);
        return i12;
    }

    public final void H(MotionEvent motionEvent, int i11, long j11, boolean z11) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i11 != 9 && i11 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerCoordsArr[i13] = new MotionEvent.PointerCoords();
        }
        int i14 = 0;
        while (i14 < pointerCount) {
            int i15 = ((actionIndex < 0 || i14 < actionIndex) ? 0 : 1) + i14;
            motionEvent.getPointerProperties(i15, pointerPropertiesArr[i14]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i14];
            motionEvent.getPointerCoords(i15, pointerCoords);
            float f5 = pointerCoords.x;
            long jR = r((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jR >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jR & 4294967295L));
            i14++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j11 : motionEvent.getDownTime(), j11, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z11 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        o2 o2VarC = this.f1183l0.c(motionEventObtain, this);
        kotlin.jvm.internal.m.c(o2VarC);
        this.f1184m0.i(o2VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final wy.a I(fz.e eVar, xy.c cVar) {
        z2.s sVar;
        if (cVar instanceof z2.s) {
            sVar = (z2.s) cVar;
            int i11 = sVar.f58663c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f58663c = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new z2.s(this, cVar);
            }
        } else {
            sVar = new z2.s(this, cVar);
        }
        Object obj = sVar.f58661a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = sVar.f58663c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            z2.o oVar = new z2.o(this, 2);
            sVar.f58663c = 1;
            if (rz.e0.l(new h0(oVar, this.M0, eVar, (vy.d) null), sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void J(Configuration configuration) {
        k1 k1Var;
        Configuration configuration2 = getConfiguration();
        if (kotlin.jvm.internal.m.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(com.bumptech.glide.e.a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (k1Var = this.Q.f58680b) != null) {
            k1Var.setValue(z2.g0.o(this));
        }
        int i11 = Build.VERSION.SDK_INT;
        if ((i11 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i11 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(fb.g0.i(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void K() {
        boolean z11;
        int i11;
        boolean z12;
        int[] iArr = this.A0;
        getLocationOnScreen(iArr);
        long j11 = this.f1198z0;
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        int i14 = iArr[0];
        if (i12 == i14 && i13 == iArr[1] && this.E0 >= 0) {
            z11 = false;
        } else {
            this.f1198z0 = (((long) i14) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i12 == Integer.MAX_VALUE || i13 == Integer.MAX_VALUE) {
                z11 = false;
            } else {
                getRoot().f56893j0.f56974p.F0();
                z11 = true;
            }
        }
        B();
        View rootView = this.f1180j1;
        if (rootView == null) {
            rootView = getRootView();
            this.f1180j1 = rootView;
        }
        h3.b rectManager = getRectManager();
        long j12 = this.f1198z0;
        long jB = ew.a.B(this.G0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.C0;
        if (fArr.length < 16) {
            i11 = 0;
        } else {
            i11 = (((fArr[0] == 1.0f && fArr[1] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[2] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[4] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[5] == 1.0f && fArr[6] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[8] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[9] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[13] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[14] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[15] == 1.0f) ? 1 : 0);
        }
        h3.c cVar = rectManager.f31537b;
        if ((i11 & 2) != 0) {
            fArr = null;
        }
        if (v3.j.c(jB, cVar.f31548c)) {
            z12 = false;
        } else {
            cVar.f31548c = jB;
            z12 = true;
        }
        if (!v3.j.c(j12, cVar.f31549d)) {
            cVar.f31549d = j12;
            z12 = true;
        }
        if (fArr != null) {
            z12 = true;
        }
        long j13 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j13 != cVar.f31550e) {
            cVar.f31550e = j13;
            z12 = true;
        }
        rectManager.f31540e = z12 || rectManager.f31540e;
        this.f1197y0.a(z11);
        getRectManager().a();
    }

    public final void L(float f5) {
        if (this.M) {
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                if (Float.isNaN(this.Z0) || f5 > this.Z0) {
                    this.Z0 = f5;
                    return;
                }
                return;
            }
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                if (Float.isNaN(this.f1159a1) || f5 < this.f1159a1) {
                    this.f1159a1 = f5;
                }
            }
        }
    }

    @Override // e2.j
    public final void a(e2.e0 e0Var, e2.e0 e0Var2) {
        mc mcVar;
        if (e0Var != null) {
            e2.e0 e0Var3 = e0Var;
            if (!e0Var3.f58482a.P) {
                v2.a.b("visitAncestors called on an unattached node");
            }
            z1.q qVar = e0Var3.f58482a;
            i0 i0VarX = y2.f.x(e0Var);
            while (i0VarX != null) {
                if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 2097152) != 0) {
                    while (qVar != null) {
                        if ((qVar.f58484c & 2097152) != 0) {
                            z1.q qVarF = qVar;
                            n1.e eVar = null;
                            while (qVarF != null) {
                                if ((qVarF.f58484c & 2097152) != 0 && (qVarF instanceof y2.n)) {
                                    int i11 = 0;
                                    for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                        if ((qVar2.f58484c & 2097152) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.c(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.c(qVar2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarF = y2.f.f(eVar);
                            }
                        }
                        qVar = qVar.f58486e;
                    }
                }
                i0VarX = i0VarX.w();
                qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        e2.e0 e0Var = ((p) getFocusOwner()).f24738c;
        if (!e0Var.P) {
            return;
        }
        if (!e0Var.f58482a.P) {
            v2.a.b("visitSubtreeIf called on an unattached node");
        }
        n1.e eVar = new n1.e(new z1.q[16]);
        z1.q qVar = e0Var.f58482a;
        z1.q qVar2 = qVar.f58487f;
        if (qVar2 == null) {
            y2.f.b(eVar, qVar);
        } else {
            eVar.c(qVar2);
        }
        while (true) {
            int i13 = eVar.f43114c;
            if (i13 == 0) {
                return;
            }
            z1.q qVar3 = (z1.q) eVar.l(i13 - 1);
            if ((qVar3.f58485d & 1024) != 0) {
                for (z1.q qVar4 = qVar3; qVar4 != null && qVar4.P; qVar4 = qVar4.f58487f) {
                    if ((qVar4.f58484c & 1024) != 0) {
                        z1.q qVarF = qVar4;
                        n1.e eVar2 = null;
                        while (qVarF != null) {
                            int i14 = 0;
                            if (qVarF instanceof e2.e0) {
                                e2.e0 e0Var2 = (e2.e0) qVarF;
                                if (e0Var2.P && e0Var2.V0().f24748a) {
                                    super.addFocusables(arrayList, i11, i12);
                                    e2.e0 e0Var3 = ((p) getFocusOwner()).f24738c;
                                    if (e0Var3.P) {
                                        if (!e0Var3.f58482a.P) {
                                            v2.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        n1.e eVar3 = new n1.e(new z1.q[16]);
                                        z1.q qVar5 = e0Var3.f58482a;
                                        z1.q qVar6 = qVar5.f58487f;
                                        if (qVar6 == null) {
                                            y2.f.b(eVar3, qVar5);
                                        } else {
                                            eVar3.c(qVar6);
                                        }
                                        while (true) {
                                            int i15 = eVar3.f43114c;
                                            if (i15 == 0) {
                                                break;
                                            }
                                            z1.q qVar7 = (z1.q) eVar3.l(i15 - 1);
                                            if ((qVar7.f58485d & 1024) != 0) {
                                                for (z1.q qVar8 = qVar7; qVar8 != null && qVar8.P; qVar8 = qVar8.f58487f) {
                                                    if ((qVar8.f58484c & 1024) != 0) {
                                                        z1.q qVarF2 = qVar8;
                                                        n1.e eVar4 = null;
                                                        while (qVarF2 != null) {
                                                            if (qVarF2 instanceof e2.e0) {
                                                                e2.e0 e0Var4 = (e2.e0) qVarF2;
                                                                if (e0Var4.P) {
                                                                    e2.t tVarV0 = e0Var4.V0();
                                                                    if (e0Var4.P && !e0Var4.Q && tVarV0.f24748a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((qVarF2.f58484c & 1024) != 0 && (qVarF2 instanceof y2.n)) {
                                                                int i16 = 0;
                                                                for (z1.q qVar9 = ((y2.n) qVarF2).R; qVar9 != null; qVar9 = qVar9.f58487f) {
                                                                    if ((qVar9.f58484c & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            qVarF2 = qVar9;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new n1.e(new z1.q[16]);
                                                                            }
                                                                            if (qVarF2 != null) {
                                                                                eVar4.c(qVarF2);
                                                                                qVarF2 = null;
                                                                            }
                                                                            eVar4.c(qVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i16 == 1) {
                                                                }
                                                            }
                                                            qVarF2 = y2.f.f(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            y2.f.b(eVar3, qVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                for (z1.q qVar10 = ((y2.n) qVarF).R; qVar10 != null; qVar10 = qVar10.f58487f) {
                                    if ((qVar10.f58484c & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVarF = qVar10;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF != null) {
                                                eVar2.c(qVarF);
                                                qVarF = null;
                                            }
                                            eVar2.c(qVar10);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            qVarF = y2.f.f(eVar2);
                        }
                    }
                }
            }
            y2.f.b(eVar, qVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (f()) {
            e eVar = this.f1187p0;
            if (eVar != null) {
                eVar.b(sparseArray);
            }
            a aVar = this.f1186o0;
            if (aVar != null) {
                z6.c.m(aVar, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return this.f1164c0.m(i11, this.f1157a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i11) {
        return this.f1164c0.m(i11, this.f1157a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        s(true);
        x1.l.j().m();
        this.f1179j0 = true;
        w wVar = this.R;
        g2.c cVar = wVar.f28614a;
        Canvas canvas2 = cVar.f28539a;
        cVar.f28539a = canvas;
        getRoot().i(cVar, null);
        wVar.f28614a.f28539a = canvas2;
        e0 e0Var = this.f1175h0;
        if (e0Var.i()) {
            int i11 = e0Var.f56687b;
            for (int i12 = 0; i12 < i11; i12++) {
                ((s1) e0Var.f(i12)).k();
            }
        }
        if (ViewLayer.K) {
            int iSave = canvas.save();
            canvas.clipRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        e0Var.d();
        this.f1179j0 = false;
        e0 e0Var2 = this.f1177i0;
        if (e0Var2 != null) {
            e0Var.c(e0Var2);
            e0Var2.d();
        }
        if (this.M) {
            x0.a(this, this.Z0);
            View view = this.L;
            if (view == null) {
                kotlin.jvm.internal.m.n("frameRateCategoryView");
                throw null;
            }
            x0.a(view, this.f1159a1);
            if (!Float.isNaN(this.f1159a1)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.Z0 = Float.NaN;
            this.f1159a1 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Code duplicated, block: B:226:0x0381  */
    /* JADX WARN: Code duplicated, block: B:228:0x038a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0391  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:236:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:239:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:248:0x0409  */
    /* JADX WARN: Code duplicated, block: B:320:0x04dd A[PHI: r6
      0x04dd: PHI (r6v16 n1.e) = (r6v15 n1.e), (r6v15 n1.e), (r6v18 n1.e) binds: [B:301:0x049f, B:303:0x04a3, B:318:0x04d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i11;
        ij.d dVar;
        long jValueAt;
        long eventTime;
        long jFloatToRawIntBits;
        boolean z11;
        int i12;
        mc mcVar;
        mc mcVar2;
        z2.j jVar;
        int size;
        mc mcVar3;
        z1.q qVarF;
        mc mcVar4;
        if (this.f1168d1) {
            i iVar = this.f1165c1;
            removeCallbacks(iVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f1168d1 = false;
            } else {
                iVar.run();
            }
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int actionIndex = -1;
        int i13 = 16;
        int i14 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (k(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            Context context = getContext();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                Method method = t0.f58901a;
                z6.c.j(viewConfiguration);
            } else {
                t0.a(viewConfiguration, context);
            }
            Context context2 = getContext();
            if (i15 >= 26) {
                z6.c.i(viewConfiguration);
            } else {
                t0.a(viewConfiguration, context2);
            }
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            e2.l focusOwner = getFocusOwner();
            d2.c cVar = new d2.c(17, this, motionEvent);
            p pVar = (p) focusOwner;
            if (pVar.f24739d.f24722e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            e2.e0 e0VarF = e2.d.f(pVar.f24738c);
            if (e0VarF != null) {
                if (!e0VarF.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar = e0VarF.f58482a;
                i0 i0VarX = y2.f.x(e0VarF);
                loop0: while (true) {
                    if (i0VarX == null) {
                        qVarF = null;
                        break;
                    }
                    if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 16384) != 0) {
                        while (qVar != null) {
                            if ((qVar.f58484c & 16384) != 0) {
                                qVarF = qVar;
                                n1.e eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof z2.j) {
                                        break loop0;
                                    }
                                    if ((qVarF.f58484c & 16384) != 0 && (qVarF instanceof y2.n)) {
                                        int i16 = 0;
                                        for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                            if ((qVar2.f58484c & 16384) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    qVarF = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.c(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.c(qVar2);
                                                }
                                            }
                                        }
                                        if (i16 == 1) {
                                        }
                                    }
                                    qVarF = y2.f.f(eVar);
                                }
                            }
                            qVar = qVar.f58486e;
                        }
                    }
                    i0VarX = i0VarX.w();
                    qVar = (i0VarX == null || (mcVar4 = i0VarX.f56892i0) == null) ? null : (d2) mcVar4.f50088f;
                }
                jVar = (z2.j) qVarF;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                z2.j jVar2 = jVar;
                if (!jVar2.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar3 = jVar2.f58482a.f58486e;
                i0 i0VarX2 = y2.f.x(jVar);
                ArrayList arrayList = null;
                while (i0VarX2 != null) {
                    if ((((z1.q) i0VarX2.f56892i0.f50089g).f58485d & 16384) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.f58484c & 16384) != 0) {
                                z1.q qVarF2 = qVar3;
                                n1.e eVar2 = null;
                                while (qVarF2 != null) {
                                    if (qVarF2 instanceof z2.j) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(qVarF2);
                                    } else if ((qVarF2.f58484c & 16384) != 0 && (qVarF2 instanceof y2.n)) {
                                        int i17 = 0;
                                        for (z1.q qVar4 = ((y2.n) qVarF2).R; qVar4 != null; qVar4 = qVar4.f58487f) {
                                            if ((qVar4.f58484c & 16384) != 0) {
                                                i17++;
                                                if (i17 == 1) {
                                                    qVarF2 = qVar4;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF2 != null) {
                                                        eVar2.c(qVarF2);
                                                        qVarF2 = null;
                                                    }
                                                    eVar2.c(qVar4);
                                                }
                                            }
                                        }
                                        if (i17 == 1) {
                                        }
                                    }
                                    qVarF2 = y2.f.f(eVar2);
                                }
                            }
                            qVar3 = qVar3.f58486e;
                        }
                    }
                    i0VarX2 = i0VarX2.w();
                    qVar3 = (i0VarX2 == null || (mcVar3 = i0VarX2.f56892i0) == null) ? null : (d2) mcVar3.f50088f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i18 = size - 1;
                        ((z2.j) arrayList.get(size)).getClass();
                        if (i18 < 0) {
                            break;
                        }
                        size = i18;
                    }
                }
                z1.q qVarF3 = jVar2.f58482a;
                n1.e eVar3 = null;
                while (qVarF3 != null) {
                    if (qVarF3 instanceof z2.j) {
                    } else if ((qVarF3.f58484c & 16384) != 0 && (qVarF3 instanceof y2.n)) {
                        int i19 = 0;
                        for (z1.q qVar5 = ((y2.n) qVarF3).R; qVar5 != null; qVar5 = qVar5.f58487f) {
                            if ((qVar5.f58484c & 16384) != 0) {
                                i19++;
                                if (i19 == 1) {
                                    qVarF3 = qVar5;
                                } else {
                                    if (eVar3 == null) {
                                        eVar3 = new n1.e(new z1.q[16]);
                                    }
                                    if (qVarF3 != null) {
                                        eVar3.c(qVarF3);
                                        qVarF3 = null;
                                    }
                                    eVar3.c(qVar5);
                                }
                            }
                        }
                        if (i19 == 1) {
                        }
                    }
                    qVarF3 = y2.f.f(eVar3);
                }
                if (!((Boolean) cVar.invoke()).booleanValue()) {
                    z1.q qVarF4 = jVar2.f58482a;
                    n1.e eVar4 = null;
                    while (qVarF4 != null) {
                        if (qVarF4 instanceof z2.j) {
                        } else if ((qVarF4.f58484c & 16384) != 0 && (qVarF4 instanceof y2.n)) {
                            int i21 = 0;
                            for (z1.q qVar6 = ((y2.n) qVarF4).R; qVar6 != null; qVar6 = qVar6.f58487f) {
                                if ((qVar6.f58484c & 16384) != 0) {
                                    i21++;
                                    if (i21 == 1) {
                                        qVarF4 = qVar6;
                                    } else {
                                        if (eVar4 == null) {
                                            eVar4 = new n1.e(new z1.q[16]);
                                        }
                                        if (qVarF4 != null) {
                                            eVar4.c(qVarF4);
                                            qVarF4 = null;
                                        }
                                        eVar4.c(qVar6);
                                    }
                                }
                            }
                            if (i21 == 1) {
                            }
                        }
                        qVarF4 = y2.f.f(eVar4);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            ((z2.j) arrayList.get(i22)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        p8.b bVar = this.f1183l0;
        y.r rVar = (y.r) bVar.f46571g;
        SparseLongArray sparseLongArray = (SparseLongArray) bVar.f46568d;
        int actionMasked = motionEvent.getActionMasked();
        bVar.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            ((SparseBooleanArray) bVar.f46569e).clear();
            dVar = null;
        } else {
            bVar.a(motionEvent);
            if (actionMasked == 1) {
                actionIndex = 0;
            } else if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
            boolean z12 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i23 = 0;
            while (i23 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i23);
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                } else {
                    jValueAt = bVar.f46565a;
                    bVar.f46565a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                int i24 = i14;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i23))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i23))) & 4294967295L);
                actionIndex = actionIndex;
                boolean z13 = i23 != actionIndex ? i24 : 0;
                y.r rVar2 = rVar;
                s2.h hVar = (s2.h) rVar2.c(jValueAt);
                if (i23 == actionIndex) {
                    rVar2.i(jValueAt);
                } else {
                    if (z12) {
                        rVar2.h(jValueAt, new s2.h(1 | ((motionEvent.getEventTime() & 2147483647L) << i24) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
                    }
                    long eventTime2 = motionEvent.getEventTime();
                    float pressure = motionEvent.getPressure(i23);
                    if (hVar != null) {
                        eventTime = (hVar.f51303a >> i24) & 2147483647L;
                    } else {
                        eventTime = motionEvent.getEventTime();
                    }
                    long j11 = eventTime;
                    if (hVar != null) {
                        int i25 = (int) (hVar.f51303a >>> 32);
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i25 >>> 16))) << 32) | (((long) Float.floatToRawIntBits((short) (i25 & 65535))) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = jFloatToRawIntBits2;
                    }
                    if (hVar != null) {
                        if ((hVar.f51303a & 1) != 0) {
                            i12 = i24;
                        } else {
                            i12 = 0;
                        }
                        z11 = i12;
                    } else {
                        z11 = 0;
                    }
                    arrayList2.add(new p2.b(jValueAt, eventTime2, jFloatToRawIntBits2, z13, pressure, j11, jFloatToRawIntBits, z11));
                    i23++;
                    rVar = rVar2;
                    bVar = bVar;
                    i14 = i24;
                }
                long eventTime3 = motionEvent.getEventTime();
                float pressure2 = motionEvent.getPressure(i23);
                if (hVar != null) {
                    eventTime = (hVar.f51303a >> i24) & 2147483647L;
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                long j12 = eventTime;
                if (hVar != null) {
                    int i26 = (int) (hVar.f51303a >>> 32);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i26 >>> 16))) << 32) | (((long) Float.floatToRawIntBits((short) (i26 & 65535))) & 4294967295L);
                } else {
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                if (hVar != null) {
                    if ((hVar.f51303a & 1) != 0) {
                        i12 = i24;
                    } else {
                        i12 = 0;
                    }
                    z11 = i12;
                } else {
                    z11 = 0;
                }
                arrayList2.add(new p2.b(jValueAt, eventTime3, jFloatToRawIntBits2, z13, pressure2, j12, jFloatToRawIntBits, z11));
                i23++;
                rVar = rVar2;
                bVar = bVar;
                i14 = i24;
            }
            int i27 = i14;
            bVar.e(motionEvent);
            if (!motionEvent.isFromSource(2097152)) {
                throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
            }
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                InputDevice.MotionRange motionRange2 = device.getMotionRange(i27);
                if (motionRange == null || motionRange2 != null) {
                    if (motionRange2 == null || motionRange != null) {
                        if (motionRange != null && motionRange2 != null) {
                            float range = motionRange.getRange();
                            float range2 = motionRange2.getRange();
                            if (range > range2 && (range2 == CropImageView.DEFAULT_ASPECT_RATIO || range / range2 >= 5.0f)) {
                                i11 = 1;
                            } else if (range2 <= range || (range != CropImageView.DEFAULT_ASPECT_RATIO && range2 / range < 5.0f)) {
                            }
                        }
                        i11 = 0;
                    }
                    i11 = 2;
                } else {
                    i11 = 1;
                }
            } else {
                i11 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            dVar = new ij.d(arrayList2, i11, motionEvent);
        }
        l lVar = this.e1;
        if (dVar == null) {
            e2.e0 e0VarG = ((p) getFocusOwner()).g();
            if (e0VarG != null) {
                if (!e0VarG.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar7 = e0VarG.f58482a;
                i0 i0VarX3 = y2.f.x(e0VarG);
                while (i0VarX3 != null) {
                    if ((((z1.q) i0VarX3.f56892i0.f50089g).f58485d & 2097152) != 0) {
                        while (qVar7 != null) {
                            if ((qVar7.f58484c & 2097152) != 0) {
                                z1.q qVarF5 = qVar7;
                                n1.e eVar5 = null;
                                while (qVarF5 != null) {
                                    if ((qVarF5.f58484c & 2097152) == 0 || !(qVarF5 instanceof y2.n)) {
                                        qVarF5 = y2.f.f(eVar5);
                                    } else {
                                        n1.e eVar6 = eVar5;
                                        z1.q qVar8 = qVarF5;
                                        int i28 = 0;
                                        for (z1.q qVar9 = ((y2.n) qVarF5).R; qVar9 != null; qVar9 = qVar9.f58487f) {
                                            if ((qVar9.f58484c & 2097152) != 0) {
                                                i28++;
                                                if (i28 == 1) {
                                                    qVar8 = qVar9;
                                                } else {
                                                    if (eVar6 == null) {
                                                        eVar6 = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVar8 != null) {
                                                        eVar6.c(qVar8);
                                                        qVar8 = null;
                                                    }
                                                    eVar6.c(qVar9);
                                                }
                                            }
                                        }
                                        if (i28 == 1) {
                                            qVarF5 = qVar8;
                                            eVar5 = eVar6;
                                        } else {
                                            eVar5 = eVar6;
                                            qVarF5 = y2.f.f(eVar5);
                                        }
                                    }
                                }
                            }
                            qVar7 = qVar7.f58486e;
                        }
                    }
                    i0VarX3 = i0VarX3.w();
                    qVar7 = (i0VarX3 == null || (mcVar = i0VarX3.f56892i0) == null) ? null : (d2) mcVar.f50088f;
                }
            }
            lVar.f24856a = 0;
            lVar.f24857b = true;
            return true;
        }
        p pVar2 = (p) getFocusOwner();
        if (pVar2.f24739d.f24722e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            e2.e0 e0VarG2 = pVar2.g();
            if (e0VarG2 != null) {
                if (!e0VarG2.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar10 = e0VarG2.f58482a;
                i0 i0VarX4 = y2.f.x(e0VarG2);
                while (i0VarX4 != null) {
                    int i29 = 2097152;
                    if ((((z1.q) i0VarX4.f56892i0.f50089g).f58485d & 2097152) != 0) {
                        while (qVar10 != null) {
                            if ((qVar10.f58484c & i29) != 0) {
                                z1.q qVarF6 = qVar10;
                                n1.e eVar7 = null;
                                while (qVarF6 != null) {
                                    if ((qVarF6.f58484c & i29) == 0 || !(qVarF6 instanceof y2.n)) {
                                        qVarF6 = y2.f.f(eVar7);
                                    } else {
                                        z1.q qVar11 = ((y2.n) qVarF6).R;
                                        int i30 = 0;
                                        while (qVar11 != null) {
                                            if ((qVar11.f58484c & i29) != 0) {
                                                i30++;
                                                if (i30 == 1) {
                                                    qVarF6 = qVar11;
                                                } else {
                                                    if (eVar7 == null) {
                                                        eVar7 = new n1.e(new z1.q[i13]);
                                                    }
                                                    if (qVarF6 != null) {
                                                        eVar7.c(qVarF6);
                                                        qVarF6 = null;
                                                    }
                                                    eVar7.c(qVar11);
                                                }
                                            }
                                            qVar11 = qVar11.f58487f;
                                            i13 = 16;
                                            i29 = 2097152;
                                        }
                                        if (i30 != 1) {
                                            qVarF6 = y2.f.f(eVar7);
                                        }
                                    }
                                    i13 = 16;
                                    i29 = 2097152;
                                }
                            }
                            qVar10 = qVar10.f58486e;
                            i13 = 16;
                            i29 = 2097152;
                        }
                    }
                    i0VarX4 = i0VarX4.w();
                    qVar10 = (i0VarX4 == null || (mcVar2 = i0VarX4.f56892i0) == null) ? null : (d2) mcVar2.f50088f;
                    i13 = 16;
                }
            }
            ArrayList arrayList3 = (ArrayList) dVar.f34422c;
            int size3 = arrayList3.size();
            for (int i31 = 0; i31 < size3; i31++) {
                ((p2.b) arrayList3.get(i31)).getClass();
            }
        }
        lVar.getClass();
        MotionEvent motionEvent2 = (MotionEvent) dVar.f34423d;
        int action = motionEvent2.getAction();
        if (action == 0) {
            lVar.f24856a = dVar.f34421b;
            lVar.f24857b = false;
        } else if (action != 1) {
        }
        ((GestureDetector) lVar.f24859d).onTouchEvent(motionEvent2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i11;
        boolean z11 = this.f1168d1;
        i iVar = this.f1165c1;
        if (z11) {
            removeCallbacks(iVar);
            iVar.run();
        }
        if (!n(motionEvent) && isAttachedToWindow()) {
            z2.x xVar = this.f1164c0;
            AndroidComposeView androidComposeView = xVar.f58708d;
            AccessibilityManager accessibilityManager = xVar.f58724t;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    androidComposeView.s(true);
                    t tVar = new t();
                    i0 root = androidComposeView.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
                    mc mcVar = root.f56892i0;
                    y2.k1 k1Var = (y2.k1) mcVar.f50087e;
                    g2.t0 t0Var = y2.k1.f56939o0;
                    ((y2.k1) mcVar.f50087e).h1(y2.k1.f56943s0, k1Var.Z0(jFloatToRawIntBits), tVar, 1, true);
                    int iA = ns.o.A(tVar);
                    while (true) {
                        if (-1 < iA) {
                            Object objF = tVar.f57003a.f(iA);
                            kotlin.jvm.internal.m.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            i0 i0VarX = y2.f.x((z1.q) objF);
                            if (androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(i0VarX) == null) {
                                if (i0VarX.f56892i0.g(8)) {
                                    int iA2 = xVar.A(i0VarX.f56880b);
                                    g3.t tVarA = g3.w.a(i0VarX, false);
                                    if (g3.w.f(tVarA)) {
                                        if (!tVarA.k().f28691a.c(g3.x.A)) {
                                            i11 = iA2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iA--;
                            }
                        }
                        i11 = Integer.MIN_VALUE;
                        break;
                    }
                    androidComposeView.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i12 = xVar.f58710e;
                    if (i12 != i11) {
                        xVar.f58710e = i11;
                        z2.x.E(xVar, i11, 128, null, 12);
                        z2.x.E(xVar, i12, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i13 = xVar.f58710e;
                    if (i13 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i13 != Integer.MIN_VALUE) {
                        xVar.f58710e = Integer.MIN_VALUE;
                        z2.x.E(xVar, Integer.MIN_VALUE, 128, null, 12);
                        z2.x.E(xVar, i13, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && o(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.V0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.V0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f1168d1 = true;
                        postDelayed(iVar, 8L);
                        return false;
                    }
                } else if ((k(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (p(motionEvent)) {
                if ((k(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((p) getFocusOwner()).e(keyEvent, new d2.c(16, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.Q.getClass();
        r2.f58660a.setValue(new b0(metaState));
        return ((p) getFocusOwner()).e(keyEvent, e2.k.f24730a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        mc mcVar;
        if (isFocused()) {
            p pVar = (p) getFocusOwner();
            if (pVar.f24739d.f24722e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                e2.e0 e0VarF = e2.d.f(pVar.f24738c);
                if (e0VarF != null) {
                    if (!e0VarF.f58482a.P) {
                        v2.a.b("visitAncestors called on an unattached node");
                    }
                    z1.q qVar = e0VarF.f58482a;
                    i0 i0VarX = y2.f.x(e0VarF);
                    while (i0VarX != null) {
                        if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                            while (qVar != null) {
                                if ((qVar.f58484c & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                    z1.q qVarF = qVar;
                                    n1.e eVar = null;
                                    while (qVarF != null) {
                                        if ((qVarF.f58484c & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (qVarF instanceof y2.n)) {
                                            int i11 = 0;
                                            for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                                if ((qVar2.f58484c & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        qVarF = qVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new n1.e(new z1.q[16]);
                                                        }
                                                        if (qVarF != null) {
                                                            eVar.c(qVarF);
                                                            qVarF = null;
                                                        }
                                                        eVar.c(qVar2);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        qVarF = y2.f.f(eVar);
                                    }
                                }
                                qVar = qVar.f58486e;
                            }
                        }
                        i0VarX = i0VarX.w();
                        qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            z2.z.f58733a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object y0Var;
        e2.e0 e0VarG;
        if (this.f1168d1) {
            i iVar = this.f1165c1;
            removeCallbacks(iVar);
            MotionEvent motionEvent2 = this.V0;
            kotlin.jvm.internal.m.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f1168d1 = false;
            } else {
                iVar.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int iK = k(motionEvent);
            int i11 = 1;
            if ((iK & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z11 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z12 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z11 && z12) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (y0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    y0Var = new z2.y0(i11);
                }
                if (y0Var.equals(new z2.y0(i11)) && (e0VarG = ((p) getFocusOwner()).g()) != null) {
                    y2.k1 k1VarW = y2.f.w(e0VarG);
                    if (!w2.a0.h(k1VarW).E(k1VarW, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        e2.l.a(getFocusOwner());
                    }
                }
            }
            if ((iK & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i11) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return i(this, i11);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i11));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i11) {
        f2.c cVarA;
        if (view == null || this.f1197y0.f57042c) {
            return super.focusSearch(view, i11);
        }
        View rootView = getRootView();
        kotlin.jvm.internal.m.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i11);
        if (viewFindNextFocus == null || !z2.g0.f(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            e2.e0 e0VarF = e2.d.f(((p) getFocusOwner()).f24738c);
            cVarA = e0VarF != null ? e2.d.i(e0VarF) : null;
            if (cVarA == null) {
                cVarA = e2.h.a(view, this);
            }
        } else {
            cVarA = e2.h.a(view, this);
        }
        e2.f fVarD = e2.h.d(i11);
        int i12 = fVarD != null ? fVarD.f24711a : 6;
        y yVar = new y();
        if (((p) getFocusOwner()).f(i12, cVarA, new r2.j(yVar, 2)) == null) {
            return view;
        }
        Object obj = yVar.f38361a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i11);
            }
        } else if (viewFindNextFocus == null || i12 == 1 || i12 == 2 || e2.d.p(e2.d.i((e2.e0) obj), e2.h.a(viewFindNextFocus, this), cVarA, i12)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this.f1194v0 == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.f1194v0 = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.f1194v0;
        kotlin.jvm.internal.m.c(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // y2.t1
    public a2.i getAutofill() {
        return this.f1186o0;
    }

    @Override // y2.t1
    public a2.n getAutofillManager() {
        return this.f1187p0;
    }

    @Override // y2.t1
    public o getAutofillTree() {
        return this.f1173g0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f1185n0.getValue();
    }

    public final b2.i getContentCaptureManager$ui() {
        return this.f1167d0;
    }

    @Override // y2.t1
    public vy.i getCoroutineContext() {
        return this.O;
    }

    @Override // y2.t1
    public v3.c getDensity() {
        return (v3.c) this.K.getValue();
    }

    @Override // e2.k0
    public f2.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            e2.e0 e0VarF = e2.d.f(((p) getFocusOwner()).f24738c);
            if (e0VarF != null) {
                return e2.d.i(e0VarF);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return e2.h.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // y2.t1
    public e2.l getFocusOwner() {
        return this.N;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        f2.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f26572a);
            rect.top = Math.round(embeddedViewFocusRect.f26573b);
            rect.right = Math.round(embeddedViewFocusRect.f26574c);
            rect.bottom = Math.round(embeddedViewFocusRect.f26575d);
            return;
        }
        if (kotlin.jvm.internal.m.a(((p) getFocusOwner()).f(6, null, z2.n.f58626b), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // y2.t1
    public n3.h getFontFamilyResolver() {
        return (n3.h) this.P0.getValue();
    }

    @Override // y2.t1
    public n3.g getFontLoader() {
        return this.O0;
    }

    public final v1 getFrameEndScheduler$ui() {
        return this.f1166d;
    }

    @Override // y2.t1
    public c0 getGraphicsContext() {
        return this.f1172f0;
    }

    @Override // y2.t1
    public n2.a getHapticFeedBack() {
        return this.R0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f1197y0.f57041b.f() || !this.f1191t.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // y2.t1
    public o2.b getInputModeManager() {
        return this.S0;
    }

    public final r getInsetsListener() {
        return this.T;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.E0;
    }

    @Override // android.view.View, android.view.ViewParent, y2.t1
    public m getLayoutDirection() {
        return (m) this.Q0.getValue();
    }

    public long getMeasureIteration() {
        y0 y0Var = this.f1197y0;
        if (!y0Var.f57042c) {
            v2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return y0Var.f57046g;
    }

    @Override // y2.t1
    public d getModifierLocalManager() {
        return this.T0;
    }

    @Override // y2.t1
    public f1 getPlacementScope() {
        int i11 = i1.f54527b;
        return new w2.n0(this, 1);
    }

    @Override // y2.t1
    public s2.r getPointerIconService() {
        return this.f1182k1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final p2.a m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return null;
    }

    @Override // y2.t1
    public h3.b getRectManager() {
        return this.W;
    }

    @Override // y2.t1
    public u1.d getRetainedValuesStore() {
        return this.f1171f;
    }

    @Override // y2.t1
    public i0 getRoot() {
        return this.U;
    }

    public a2 getRootForTest() {
        return this.f1158a0;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        f3.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.f1178i1) == null) {
            return false;
        }
        return ((Boolean) ((k1) iVar.f26615b).getValue()).booleanValue();
    }

    @Override // y2.t1
    public v getSemanticsOwner() {
        return this.f1161b0;
    }

    @Override // y2.t1
    public y2.k0 getSharedDrawScope() {
        return this.f1163c;
    }

    @Override // y2.t1
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? w0.f58694a.a(this) : this.f1193u0;
    }

    @Override // y2.t1
    public y2.v1 getSnapshotObserver() {
        return this.f1192t0;
    }

    @Override // y2.t1
    public i2 getSoftwareKeyboardController() {
        return this.N0;
    }

    @Override // y2.t1
    public x getTextInputService() {
        return this.L0;
    }

    @Override // y2.t1
    public j2 getTextToolbar() {
        return this.U0;
    }

    public final y2.z1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // y2.t1
    public p2 getViewConfiguration() {
        return this.S;
    }

    public final z2.k getViewTreeOwners() {
        return (z2.k) this.I0.getValue();
    }

    @Override // y2.t1
    public q2 getWindowInfo() {
        return this.Q;
    }

    public final e get_autofillManager$ui() {
        return this.f1187p0;
    }

    public final void j(i0 i0Var, boolean z11) {
        this.f1197y0.f(i0Var, z11);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int k(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        removeCallbacks(this.f1162b1);
        try {
            C(motionEvent);
            this.F0 = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.V0;
                boolean z11 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                k kVar = this.f1184m0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!kVar.f28528a) {
                                ((y.r) ((o20.w) kVar.f28531d).f44617b).a();
                                ((s2.d) kVar.f28530c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z11) {
                            motionEvent2 = motionEvent3;
                        } else {
                            H(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z12 = motionEvent.getToolType(0) == 3;
                if (z11 || !z12 || actionMasked2 == 3 || actionMasked2 == 9 || !o(motionEvent)) {
                    androidComposeView = this;
                } else {
                    androidComposeView = this;
                    androidComposeView.H(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.V0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.V0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    p8.b bVar = androidComposeView.f1183l0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ((SparseBooleanArray) bVar.f46569e).delete(pointerId);
                            ((SparseLongArray) bVar.f46568d).delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.V0;
                        float x11 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.V0;
                        boolean z13 = (x11 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = androidComposeView.V0;
                        boolean z14 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z13 || z14) {
                            if (pointerId >= 0) {
                                ((SparseBooleanArray) bVar.f46569e).delete(pointerId);
                                ((SparseLongArray) bVar.f46568d).delete(pointerId);
                            }
                            s2.d dVar = (s2.d) kVar.f28530c;
                            if (dVar.f51292d) {
                                dVar.f51292d = true;
                            } else {
                                dVar.f51295g.f51320a.h();
                            }
                        }
                    }
                }
                androidComposeView.V0 = MotionEvent.obtainNoHistory(motionEvent);
                int iG = G(motionEvent);
                Trace.endSection();
                androidComposeView.F0 = false;
                return iG;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.F0 = false;
            throw th4;
        }
    }

    public final void m(i0 i0Var) {
        this.f1197y0.p(i0Var, false);
        n1.e eVarA = i0Var.A();
        Object[] objArr = eVarA.f43112a;
        int i11 = eVarA.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            m((i0) objArr[i12]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return CropImageView.DEFAULT_ASPECT_RATIO <= x11 && x11 <= ((float) getWidth()) && CropImageView.DEFAULT_ASPECT_RATIO <= y10 && y10 <= ((float) getHeight());
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        z1.t tVar = (z1.t) this.M0.get();
        m0 m0Var = (m0) (tVar != null ? tVar.f58490b : null);
        if (m0Var == null) {
            return this.K0.f44632d;
        }
        z1.t tVar2 = (z1.t) m0Var.f58617d.get();
        q1 q1Var = (q1) (tVar2 != null ? tVar2.f58490b : null);
        return q1Var != null && (q1Var.f58657e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection mVar;
        int i11;
        z1.t tVar = (z1.t) this.M0.get();
        m0 m0Var = (m0) (tVar != null ? tVar.f58490b : null);
        if (m0Var == null) {
            a0 a0Var = this.K0;
            if (a0Var.f44632d) {
                o3.j jVar = a0Var.f44636h;
                o3.w wVar = a0Var.f44635g;
                int i12 = jVar.f44683e;
                boolean z11 = jVar.f44679a;
                if (i12 == 1) {
                    i11 = z11 ? 6 : 0;
                } else if (i12 == 0) {
                    i11 = 1;
                } else if (i12 == 2) {
                    i11 = 2;
                } else if (i12 == 6) {
                    i11 = 5;
                } else if (i12 == 5) {
                    i11 = 7;
                } else if (i12 == 3) {
                    i11 = 3;
                } else if (i12 == 4) {
                    i11 = 4;
                } else {
                    if (i12 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i11;
                int i13 = jVar.f44682d;
                int i14 = 8;
                if (i13 == 1) {
                    editorInfo.inputType = 1;
                } else if (i13 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i11;
                } else if (i13 == 3) {
                    editorInfo.inputType = 2;
                } else if (i13 == 4) {
                    editorInfo.inputType = 3;
                } else if (i13 == 5) {
                    editorInfo.inputType = 17;
                } else if (i13 == 6) {
                    editorInfo.inputType = 33;
                } else if (i13 == 7) {
                    editorInfo.inputType = 129;
                } else if (i13 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i13 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z11) {
                    int i15 = editorInfo.inputType;
                    if ((i15 & 1) == 1) {
                        editorInfo.inputType = i15 | OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        if (i12 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i16 = editorInfo.inputType;
                if ((i16 & 1) == 1) {
                    int i17 = jVar.f44680b;
                    if (i17 == 1) {
                        editorInfo.inputType = i16 | 4096;
                    } else if (i17 == 2) {
                        editorInfo.inputType = i16 | OSSConstants.DEFAULT_BUFFER_SIZE;
                    } else if (i17 == 3) {
                        editorInfo.inputType = i16 | 16384;
                    }
                    if (jVar.f44681c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j11 = wVar.f44705b;
                int i18 = j3.x0.f35822c;
                editorInfo.initialSelStart = (int) (j11 >> 32);
                editorInfo.initialSelEnd = (int) (j11 & 4294967295L);
                b5.c.c(editorInfo, wVar.f44704a.f35700b);
                editorInfo.imeOptions |= 33554432;
                if (v5.j.d()) {
                    v5.j.a().i(editorInfo);
                }
                o3.s sVar = new o3.s(a0Var.f44635g, new lf.x0(a0Var, i14), a0Var.f44636h.f44681c);
                a0Var.f44637i.add(new WeakReference(sVar));
                return sVar;
            }
        } else {
            z1.t tVar2 = (z1.t) m0Var.f58617d.get();
            q1 q1Var = (q1) (tVar2 != null ? tVar2.f58490b : null);
            if (q1Var != null) {
                synchronized (q1Var.f58655c) {
                    if (q1Var.f58657e) {
                        return null;
                    }
                    b1.x xVarA = q1Var.f58653a.a(editorInfo);
                    p0 p0Var = new p0(q1Var, 13);
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 34) {
                        mVar = new o3.n(xVarA, p0Var);
                    } else {
                        mVar = i19 >= 25 ? new o3.m(xVarA, p0Var) : new o3.l(xVarA, p0Var);
                    }
                    q1Var.f58656d.c(new y2.i2(mVar));
                    return mVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        b2.i iVar = this.f1167d0;
        iVar.getClass();
        b2.d.d(iVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar;
        super.onDetachedFromWindow();
        this.T.onViewDetachedFromWindow(this);
        if (this.M) {
            View view = this.L;
            if (view == null) {
                kotlin.jvm.internal.m.n("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28) {
            e0 e0Var = f1154o1;
            synchronized (e0Var) {
                e0Var.j(this);
            }
        }
        u uVar = getSnapshotObserver().f57019a;
        ui.k kVar = uVar.f55731h;
        if (kVar != null) {
            kVar.b();
        }
        uVar.a();
        u1 u1Var = this.Q;
        if (u1Var.f58680b == null) {
            u1Var.f58679a = null;
        }
        z2.k viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = viewTreeOwners != null ? viewTreeOwners.f58595a.getLifecycle() : null;
        if (lifecycle == null) {
            throw defpackage.e.t("No lifecycle owner exists");
        }
        lifecycle.removeObserver(this.f1167d0);
        lifecycle.removeObserver(this);
        if (f() && (aVar = this.f1186o0) != null) {
            a2.m.f311a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        w1 w1Var = this.f1169e;
        if (w1Var != null) {
            w1Var.f58697c = false;
        }
        this.f1169e = null;
        if (i11 >= 31) {
            d0.f58525a.a(this);
        }
        e eVar = this.f1187p0;
        if (eVar != null) {
            getSemanticsOwner().f28708d.j(eVar);
            ((p) getFocusOwner()).f24742g.j(eVar);
        }
        h3.b rectManager = getRectManager();
        qf qfVar = rectManager.f31542g;
        if (qfVar != null) {
            z1.b.f58462a.removeCallbacks(qfVar);
            rectManager.f31542g = null;
        }
        ((p) getFocusOwner()).f24742g.j(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (z11 || hasFocus()) {
            return;
        }
        p pVar = (p) getFocusOwner();
        e2.d.d(pVar.f24738c, true);
        if (pVar.g() != null) {
            e2.e0 e0VarG = pVar.g();
            pVar.j(null);
            if (e0VarG != null) {
                e0VarG.U0(e2.b0.Active, e2.b0.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.E0 = 0L;
        K();
        int i11 = Build.VERSION.SDK_INT;
        if (32 > i11 || i11 >= 34) {
            return;
        }
        J(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.E0 = 0L;
        this.f1197y0.j(this.f1);
        this.f1195w0 = null;
        K();
        if (this.f1194v0 != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        y0 y0Var = this.f1197y0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long jH = h(i11);
            long jH2 = h(i12);
            long jP = com.bumptech.glide.f.p((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            v3.a aVar = this.f1195w0;
            if (aVar == null) {
                this.f1195w0 = new v3.a(jP);
                this.f1196x0 = false;
            } else if (!v3.a.b(aVar.f53483a, jP)) {
                this.f1196x0 = true;
            }
            y0Var.q(jP);
            y0Var.l();
            setMeasuredDimension(getRoot().f56893j0.f56974p.f54501a, getRoot().f56893j0.f56974p.f54502b);
            if (this.f1194v0 != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f56893j0.f56974p.f54501a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f56893j0.f56974p.f54502b, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i11) {
        if (!f() || viewStructure == null) {
            return;
        }
        e eVar = this.f1187p0;
        if (eVar != null) {
            i0 i0Var = eVar.f302b.f28705a;
            AutofillId autofillId = eVar.f307t;
            String str = eVar.f305e;
            h3.b bVar = eVar.f304d;
            cf.x.D(viewStructure, i0Var, autofillId, str, bVar);
            Object[] objArr = o0.f56745a;
            e0 e0Var = new e0(2);
            e0Var.a(i0Var);
            e0Var.a(viewStructure);
            while (e0Var.i()) {
                Object objK = e0Var.k(e0Var.f56687b - 1);
                kotlin.jvm.internal.m.d(objK, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = e0Var.k(e0Var.f56687b - 1);
                kotlin.jvm.internal.m.d(objK2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                n1.b bVar2 = (n1.b) ((i0) objK2).o();
                int i12 = ((n1.e) bVar2.f43104b).f43114c;
                for (int i13 = 0; i13 < i12; i13++) {
                    i0 i0Var2 = (i0) bVar2.get(i13);
                    if (!i0Var2.f56904t0 && i0Var2.I() && i0Var2.J()) {
                        g3.o oVarY = i0Var2.y();
                        if (oVarY != null) {
                            y.i0 i0Var3 = oVarY.f28691a;
                            if (i0Var3.b(g3.n.f28672g) || i0Var3.b(g3.n.f28673h) || i0Var3.b(g3.x.f28725q) || i0Var3.b(g3.x.f28726r)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                cf.x.D(viewStructureNewChild, i0Var2, eVar.f307t, str, bVar);
                                e0Var.a(i0Var2);
                                e0Var.a(viewStructureNewChild);
                            } else {
                                e0Var.a(i0Var2);
                                e0Var.a(viewStructure2);
                            }
                        } else {
                            e0Var.a(i0Var2);
                            e0Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        a aVar = this.f1186o0;
        if (aVar != null) {
            o oVar = aVar.f293b;
            LinkedHashMap linkedHashMap = oVar.f312a;
            LinkedHashMap linkedHashMap2 = oVar.f312a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                a2.j.d(viewStructureNewChild2, aVar.f295d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, aVar.f292a.getContext().getPackageName(), null, null);
                a2.j.e(viewStructureNewChild2, 1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        s2.q qVar;
        int toolType = motionEvent.getToolType(i11);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (qVar = ((q) getPointerIconService()).f58649a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i11);
        }
        Context context = getContext();
        return qVar instanceof s2.a ? PointerIcon.getSystemIcon(context, ((s2.a) qVar).f51281b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        l1.h hVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(z2.g0.v());
        }
        w1 w1Var = this.f1169e;
        if (w1Var != null) {
            v1 v1Var = this.f1166d;
            kotlin.jvm.internal.m.c(v1Var);
            tp.e eVar = w1Var.f58695a;
            u1.c cVar = (u1.c) eVar.f52454b;
            if (!cVar.f52722a || cVar.f52724c) {
                return;
            }
            try {
                hVarS = ((d3) v1Var).f58528a.s(new l1(w1Var, 8));
            } catch (CancellationException unused) {
                u1.c cVar2 = (u1.c) eVar.f52454b;
                if (!cVar2.f52723b) {
                    if (cVar2.f52724c) {
                        v1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar2.a();
                    cVar2.f52724c = true;
                }
                hVarS = null;
            }
            l1.h hVar = w1Var.f58698d;
            if (hVar != null) {
                hVar.cancel();
            }
            w1Var.f58698d = hVarS;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        m mVar;
        if (this.f1160b) {
            int[] iArr = e2.h.f24715a;
            if (i11 != 0) {
                mVar = i11 != 1 ? null : m.Rtl;
            } else {
                mVar = m.Ltr;
            }
            if (mVar == null) {
                mVar = m.Ltr;
            }
            setLayoutDirection(mVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        f3.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.f1178i1) == null) {
            return;
        }
        iVar.g(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        K();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        w1 w1Var = this.f1169e;
        if (w1Var != null) {
            u1.c cVar = (u1.c) w1Var.f58695a.f52454b;
            if (cVar.f52722a && !cVar.f52724c) {
                l1.h hVar = w1Var.f58698d;
                if (hVar != null) {
                    hVar.cancel();
                }
                w1Var.f58698d = null;
                return;
            }
            if (cVar.f52723b) {
                return;
            }
            if (!cVar.f52724c) {
                v1.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.f52725d.i()) {
                v1.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.f52724c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z11) {
        this.S0.f44473a.setValue(new o2.a(z11 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        b2.i iVar = this.f1167d0;
        iVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b2.d.a(iVar, longSparseArray);
        } else {
            iVar.f3865a.post(new b2.c(0, iVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        boolean zV;
        this.Q.f58681c.setValue(Boolean.valueOf(z11));
        this.f1176h1 = true;
        super.onWindowFocusChanged(z11);
        if (!z11 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zV = z2.g0.v())) {
            return;
        }
        setShowLayoutBounds(zV);
        l(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.V0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void q(float[] fArr) {
        B();
        g2.k0.e(fArr, this.C0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.G0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.G0 & 4294967295L));
        float[] fArr2 = this.B0;
        g2.k0.d(fArr2);
        g2.k0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        z2.g0.B(fArr, fArr2);
    }

    public final long r(long j11) {
        B();
        long jB = g2.k0.b(j11, this.C0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.G0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.G0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (!isFocused()) {
            e2.f fVarD = e2.h.d(i11);
            int i12 = fVarD != null ? fVarD.f24711a : 7;
            Boolean boolF = ((p) getFocusOwner()).f(i12, rect != null ? g2.f0.F(rect) : null, new e2.o(i12, 5));
            Boolean bool = Boolean.TRUE;
            if (!kotlin.jvm.internal.m.a(boolF, bool)) {
                if (!kotlin.jvm.internal.m.a(((p) getFocusOwner()).f(i12, null, new e2.o(i12, 6)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i12 == 1 || i12 == 2) {
                        return ((p) getFocusOwner()).i(i12);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(boolean z11) {
        z2.p pVar;
        y0 y0Var = this.f1197y0;
        if (y0Var.f57041b.f() || ((n1.e) y0Var.f57044e.f48145b).f43114c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z11) {
                try {
                    pVar = this.f1;
                } finally {
                    Trace.endSection();
                }
            } else {
                pVar = null;
            }
            if (y0Var.j(pVar)) {
                requestLayout();
            }
            y0Var.a(false);
            if (this.f1181k0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f1181k0 = false;
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j11) {
        this.f1164c0.H = j11;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f1185n0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(b2.i iVar) {
        this.f1167d0 = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(vy.i iVar) {
        this.O = iVar;
        z1.q qVar = (z1.q) getRoot().f56892i0.f50089g;
        if (qVar instanceof s2.m0) {
            ((s2.m0) qVar).V0();
        }
        if (!qVar.f58482a.P) {
            v2.a.b("visitSubtreeIf called on an unattached node");
        }
        n1.e eVar = new n1.e(new z1.q[16]);
        z1.q qVar2 = qVar.f58482a;
        z1.q qVar3 = qVar2.f58487f;
        if (qVar3 == null) {
            y2.f.b(eVar, qVar2);
        } else {
            eVar.c(qVar3);
        }
        while (true) {
            int i11 = eVar.f43114c;
            if (i11 == 0) {
                return;
            }
            z1.q qVar4 = (z1.q) eVar.l(i11 - 1);
            if ((qVar4.f58485d & 16) != 0) {
                for (z1.q qVar5 = qVar4; qVar5 != null && qVar5.P; qVar5 = qVar5.f58487f) {
                    if ((qVar5.f58484c & 16) != 0) {
                        ?? F = qVar5;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof y1) {
                                y1 y1Var = (y1) F;
                                if (y1Var instanceof s2.m0) {
                                    ((s2.m0) y1Var).V0();
                                }
                            } else if ((F.f58484c & 16) != 0 && (F instanceof y2.n)) {
                                z1.q qVar6 = ((y2.n) F).R;
                                int i12 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (qVar6 != null) {
                                    if ((qVar6.f58484c & 16) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            eVar2 = eVar2;
                                            F = qVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new n1.e(new z1.q[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.c(F);
                                                F = 0;
                                            }
                                            eVar2.c(qVar6);
                                        }
                                    }
                                    qVar6 = qVar6.f58487f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            F = y2.f.f(eVar2);
                        }
                    }
                }
            }
            y2.f.b(eVar, qVar4);
        }
    }

    public final void setFrameEndScheduler$ui(v1 v1Var) {
        this.f1166d = v1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j11) {
        this.E0 = j11;
    }

    public final void setOnViewTreeOwnersAvailable(fz.c cVar) {
        z2.k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.J0 = cVar;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(p2.a aVar) {
    }

    @Override // y2.t1
    public void setShowLayoutBounds(boolean z11) {
        this.f1193u0 = z11;
    }

    public void setUncaughtExceptionHandler(y2.z1 z1Var) {
        this.f1197y0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(y2.z1 z1Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(i0 i0Var, long j11) {
        y0 y0Var = this.f1197y0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            y0Var.k(i0Var, j11);
            if (!y0Var.f57041b.f()) {
                y0Var.a(false);
                if (this.f1181k0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f1181k0 = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    public final boolean u(int i11) {
        if (i11 == 7 || i11 == 8) {
            return false;
        }
        Integer numC = e2.h.c(i11);
        if (numC == null) {
            throw defpackage.e.t("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        e2.e0 e0VarG = ((p) getFocusOwner()).g();
        if (e0VarG == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = e2.h.c(i11);
        if (numC2 == null) {
            throw defpackage.e.t("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        ViewFactoryHolder viewFactoryHolder = y2.f.x(e0VarG).R;
        View interopView = viewFactoryHolder != null ? viewFactoryHolder.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        kotlin.jvm.internal.m.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !z2.g0.f(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return e2.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void v(s1 s1Var, boolean z11) {
        e0 e0Var = this.f1175h0;
        if (!z11) {
            if (this.f1179j0) {
                return;
            }
            e0Var.j(s1Var);
            e0 e0Var2 = this.f1177i0;
            if (e0Var2 != null) {
                e0Var2.j(s1Var);
                return;
            }
            return;
        }
        if (!this.f1179j0) {
            e0Var.a(s1Var);
            return;
        }
        e0 e0Var3 = this.f1177i0;
        if (e0Var3 == null) {
            e0Var3 = new e0();
            this.f1177i0 = e0Var3;
        }
        e0Var3.a(s1Var);
    }

    public final void w() {
        e eVar;
        if (this.f1188q0) {
            u uVar = getSnapshotObserver().f57019a;
            synchronized (uVar.f55730g) {
                try {
                    n1.e eVar2 = uVar.f55729f;
                    int i11 = eVar2.f43114c;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        x1.t tVar = (x1.t) eVar2.f43112a[i13];
                        tVar.d();
                        if (!tVar.f55717f.j()) {
                            i12++;
                        } else if (i12 > 0) {
                            Object[] objArr = eVar2.f43112a;
                            objArr[i13 - i12] = objArr[i13];
                        }
                    }
                    int i14 = i11 - i12;
                    Arrays.fill(eVar2.f43112a, i14, i11, (Object) null);
                    eVar2.f43114c = i14;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f1188q0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f1194v0;
        if (androidViewsHandler != null) {
            g(androidViewsHandler);
        }
        if (f() && (eVar = this.f1187p0) != null) {
            y.y yVar = eVar.H;
            if (yVar.f56788d == 0 && eVar.K) {
                eVar.f301a.a();
                eVar.K = false;
            }
            if (yVar.f56788d != 0) {
                eVar.K = true;
            }
        }
        while (this.Y0.i() && this.Y0.f(0) != null) {
            int i15 = this.Y0.f56687b;
            for (int i16 = 0; i16 < i15; i16++) {
                fz.a aVar = (fz.a) this.Y0.f(i16);
                e0 e0Var = this.Y0;
                if (i16 < 0 || i16 >= e0Var.f56687b) {
                    e0Var.n(i16);
                    throw null;
                }
                Object[] objArr2 = e0Var.f56686a;
                Object obj = objArr2[i16];
                objArr2[i16] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.Y0.l(0, i15);
        }
    }

    public final void x(i0 i0Var) {
        z2.x xVar = this.f1164c0;
        xVar.f58705a0 = true;
        if (xVar.v()) {
            xVar.w(i0Var);
        }
        b2.i iVar = this.f1167d0;
        iVar.f3871t = true;
        if (iVar.e()) {
            iVar.H.i(qy.b0.f48488a);
        }
    }

    public final void y(i0 i0Var, boolean z11, boolean z12, boolean z13) {
        i0 i0VarW;
        i0 i0VarW2;
        y0 y0Var = this.f1197y0;
        if (!z11) {
            if (y0Var.p(i0Var, z12) && z13) {
                E(i0Var);
                return;
            }
            return;
        }
        m3 m3Var = y0Var.f57041b;
        i0 i0Var2 = i0Var.K;
        y2.m0 m0Var = i0Var.f56893j0;
        if (i0Var2 == null) {
            v2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i11 = y2.x0.f57037a[m0Var.f56963d.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                y0Var.f57047h.c(new y2.w0(i0Var, true, z12));
                return;
            }
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!m0Var.f56964e || z12) {
                m0Var.f56964e = true;
                m0Var.f56974p.W = true;
                if (i0Var.f56904t0) {
                    return;
                }
                if ((kotlin.jvm.internal.m.a(i0Var.K(), Boolean.TRUE) || y0.h(i0Var)) && ((i0VarW = i0Var.w()) == null || !i0VarW.f56893j0.f56964e)) {
                    m3Var.a(i0Var, y2.w.LookaheadMeasurement);
                } else if ((i0Var.J() || y0.i(i0Var)) && ((i0VarW2 = i0Var.w()) == null || !i0VarW2.s())) {
                    m3Var.a(i0Var, y2.w.Measurement);
                }
                if (y0Var.f57043d || !z13) {
                    return;
                }
                E(i0Var);
            }
        }
    }

    public final void z(i0 i0Var, boolean z11, boolean z12) {
        y2.m0 m0Var = i0Var.f56893j0;
        y0 y0Var = this.f1197y0;
        if (!z11) {
            y0Var.getClass();
            int i11 = y2.x0.f57037a[m0Var.f56963d.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                return;
            }
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i0 i0VarW = i0Var.w();
            boolean z13 = i0VarW == null || i0VarW.J();
            if (!z12) {
                if (i0Var.s()) {
                    return;
                }
                if (i0Var.q() && i0Var.J() == z13 && i0Var.J() == m0Var.f56974p.V) {
                    return;
                }
            }
            b1 b1Var = m0Var.f56974p;
            b1Var.X = true;
            b1Var.Y = true;
            if (!i0Var.f56904t0 && b1Var.V && z13) {
                if ((i0VarW == null || !i0VarW.q()) && (i0VarW == null || !i0VarW.s())) {
                    y0Var.f57041b.a(i0Var, y2.w.Placement);
                }
                if (y0Var.f57043d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        m3 m3Var = y0Var.f57041b;
        int i12 = y2.x0.f57037a[m0Var.f56963d.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return;
                }
                if (i12 != 4 && i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if ((m0Var.f56964e || m0Var.f56965f) && !z12) {
                return;
            }
            m0Var.f56965f = true;
            m0Var.f56966g = true;
            b1 b1Var2 = m0Var.f56974p;
            b1Var2.X = true;
            b1Var2.Y = true;
            if (i0Var.f56904t0) {
                return;
            }
            i0 i0VarW2 = i0Var.w();
            if (kotlin.jvm.internal.m.a(i0Var.K(), Boolean.TRUE) && ((i0VarW2 == null || !i0VarW2.f56893j0.f56964e) && (i0VarW2 == null || !i0VarW2.f56893j0.f56965f))) {
                m3Var.a(i0Var, y2.w.LookaheadPlacement);
            } else if (i0Var.J() && ((i0VarW2 == null || !i0VarW2.q()) && (i0VarW2 == null || !i0VarW2.s()))) {
                m3Var.a(i0Var, y2.w.Placement);
            }
            if (y0Var.f57043d) {
                return;
            }
            E(null);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        kotlin.jvm.internal.m.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // y2.t1
    public f getAccessibilityManager() {
        return this.f1170e0;
    }

    @Override // y2.t1
    public z2.g getClipboard() {
        return this.f1190s0;
    }

    @Override // y2.t1
    public h getClipboardManager() {
        return this.f1189r0;
    }

    @Override // y2.t1
    public b getDragAndDropManager() {
        return this.P;
    }

    public y.x getLayoutNodes() {
        return this.V;
    }

    @Override // y2.t1
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u1.d dVar;
        Lifecycle lifecycle;
        Object obj;
        a aVar;
        Method declaredMethod;
        super.onAttachedToWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            setShowLayoutBounds(z2.g0.v());
        }
        this.T.onViewAttachedToWindow(this);
        Lifecycle lifecycle2 = null;
        if (i11 > 28) {
            if (f1155p1 == null) {
                c cVar = new c(17);
                f1155p1 = cVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f1151l1 == null) {
                        f1151l1 = Class.forName("android.os.SystemProperties");
                    }
                    if (f1153n1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f1151l1;
                        if (cls != null) {
                            declaredMethod = cls.getDeclaredMethod(HOBXIlHxIkMBEA.IAllqH, Runnable.class);
                        } else {
                            declaredMethod = null;
                        }
                        f1153n1 = declaredMethod;
                    }
                    Method method = f1153n1;
                    if (method != null) {
                        method.invoke(null, cVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            e0 e0Var = f1154o1;
            synchronized (e0Var) {
                e0Var.a(this);
            }
        }
        this.Q.f58681c.setValue(Boolean.valueOf(hasWindowFocus()));
        u1 u1Var = this.Q;
        int i12 = 0;
        z2.p pVar = new z2.p(this, i12);
        k1 k1Var = u1Var.f58680b;
        if (k1Var == null) {
            u1Var.f58679a = pVar;
        }
        if (k1Var != null) {
            k1Var.setValue(z2.g0.o(this));
        }
        m(getRoot());
        l(getRoot());
        getSnapshotObserver().f57019a.e();
        if (f() && (aVar = this.f1186o0) != null) {
            a2.m.f311a.a(aVar);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        da.g gVarP = fb.g0.p(this);
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(this);
        v1 v1Var = this.f1166d;
        int i13 = 1;
        if (lifecycleOwner != null && viewModelStoreOwner != null && v1Var != null) {
            x1 x1Var = (x1) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner.getViewModelStore(), new ViewModelProvider.NewInstanceFactory(), (CreationExtras) null, 4, (Object) null).get(kotlin.jvm.internal.z.a(x1.class));
            Object parent = getParent();
            kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.view.View");
            int id2 = ((View) parent).getId();
            y.x xVar = x1Var.f58725a;
            Object objB = xVar.b(id2);
            if (objB == null) {
                objB = new e0(1);
                xVar.h(id2, objB);
            }
            e0 e0Var2 = (e0) objB;
            Object[] objArr = e0Var2.f56686a;
            int i14 = e0Var2.f56687b;
            while (true) {
                if (i12 < i14) {
                    obj = objArr[i12];
                    if (!((w1) obj).f58697c) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            w1 w1Var = (w1) obj;
            if (w1Var == null) {
                w1Var = new w1();
                e0Var2.a(w1Var);
            }
            w1Var.f58697c = true;
            this.f1169e = w1Var;
            dVar = w1Var.f58696b;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = u1.a.f52720a;
        }
        this.f1171f = dVar;
        z2.k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner != null && gVarP != null && (lifecycleOwner != viewTreeOwners.f58595a || gVarP != viewTreeOwners.f58596b || viewModelStoreOwner != viewTreeOwners.f58597c))) {
            if (lifecycleOwner != null) {
                if (gVarP != null) {
                    if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f58595a.getLifecycle()) != null) {
                        lifecycle.removeObserver(this);
                    }
                    lifecycleOwner.getLifecycle().addObserver(this);
                    z2.k kVar = new z2.k(lifecycleOwner, gVarP, viewModelStoreOwner);
                    set_viewTreeOwners(kVar);
                    fz.c cVar2 = this.J0;
                    if (cVar2 != null) {
                        cVar2.invoke(kVar);
                    }
                    this.J0 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        o2.c cVar3 = this.S0;
        if (!isInTouchMode()) {
            i13 = 2;
        }
        cVar3.f44473a.setValue(new o2.a(i13));
        z2.k viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null) {
            lifecycle2 = viewTreeOwners2.f58595a.getLifecycle();
        }
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
            lifecycle2.addObserver(this.f1167d0);
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            getViewTreeObserver().addOnScrollChangedListener(this);
            getViewTreeObserver().addOnTouchModeChangeListener(this);
            if (Build.VERSION.SDK_INT >= 31) {
                d0.f58525a.b(this);
            }
            e eVar = this.f1187p0;
            if (eVar != null) {
                ((p) getFocusOwner()).f24742g.a(eVar);
                getSemanticsOwner().f28708d.a(eVar);
            }
            ((p) getFocusOwner()).f24742g.a(this);
            return;
        }
        throw defpackage.e.t("No lifecycle owner exists");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, int i12) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i11;
        layoutParamsGenerateDefaultLayoutParams.height = i12;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
