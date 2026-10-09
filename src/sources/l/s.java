package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingodeer.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import r.a3;
import r.b3;
import z4.s0;
import z4.s1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements z4.u, com.android.billingclient.api.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39062b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f39061a = i11;
        this.f39062b = obj;
    }

    @Override // com.android.billingclient.api.e
    public void b(com.android.billingclient.api.j billingResult) {
        ArrayList arrayListT;
        switch (this.f39061a) {
            case 2:
                kotlin.jvm.internal.m.f(billingResult, "billingResult");
                if (billingResult.f7519a == 0) {
                    ((mu.m) this.f39062b).invoke();
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.m.f(billingResult, "billingResult");
                ni.m mVar = (ni.m) this.f39062b;
                mVar.V.set(false);
                int i11 = billingResult.f7519a;
                kotlin.jvm.internal.m.e(billingResult.f7521c, "getDebugMessage(...)");
                if (i11 == 0) {
                    List listK = ns.o.K(c.a.u().get(1));
                    List listK2 = ns.o.K(c.a.u().get(0));
                    List listK3 = ns.o.K(c.a.u().get(2));
                    vy.d dVar = null;
                    rz.e0.B(ViewModelKt.getViewModelScope(mVar), null, null, new ni.l(mVar, listK, dVar, 0), 3);
                    if (FirebaseRemoteConfig.d().e("first_open_annual_product_free_trail_day_type") == 7) {
                        arrayListT = c.a.i().equals("S_D_1") ? c.a.s() : c.a.q();
                    } else {
                        arrayListT = c.a.i().equals("S_D_1") ? c.a.t() : c.a.r();
                    }
                    rz.e0.B(ViewModelKt.getViewModelScope(mVar), null, null, new ni.l(mVar, ns.o.K(arrayListT.get(1)), dVar, 1), 3);
                    rz.e0.B(ViewModelKt.getViewModelScope(mVar), null, null, new ni.l(mVar, listK2, dVar, 2), 3);
                    rz.e0.B(ViewModelKt.getViewModelScope(mVar), null, null, new ni.l(mVar, listK3, dVar, 3), 3);
                    rz.e0.B(ViewModelKt.getViewModelScope(mVar), null, null, new ni.b(mVar, dVar, 1), 3);
                    mVar.f43836f.clear();
                    com.android.billingclient.api.d dVar2 = mVar.U;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.m.n("billingClient");
                        throw null;
                    }
                    com.android.billingclient.api.b bVar = new com.android.billingclient.api.b();
                    bVar.f7461a = "subs";
                    dVar2.e(bVar.b(), new ni.a(mVar));
                    return;
                }
                return;
        }
    }

    @Override // com.android.billingclient.api.e
    public void c() {
        int i11 = this.f39061a;
    }

    @Override // z4.u
    public v1 e(View view, v1 v1Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        v1 v1VarF = v1Var;
        int i11 = this.f39061a;
        Object obj = this.f39062b;
        switch (i11) {
            case 0:
                int iD = v1VarF.d();
                androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) obj;
                Context context = bVar.M;
                int iD2 = v1VarF.d();
                ActionBarContextView actionBarContextView = bVar.X;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z11 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bVar.X.getLayoutParams();
                    if (bVar.X.isShown()) {
                        if (bVar.E0 == null) {
                            bVar.E0 = new Rect();
                            bVar.F0 = new Rect();
                        }
                        Rect rect = bVar.E0;
                        Rect rect2 = bVar.F0;
                        rect.set(v1VarF.b(), v1VarF.d(), v1VarF.c(), v1VarF.a());
                        ViewGroup viewGroup = bVar.f803c0;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z14 = b3.f48531a;
                            a3.a(viewGroup, rect, rect2);
                        } else {
                            if (!b3.f48531a) {
                                b3.f48531a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    b3.f48532b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        b3.f48532b.setAccessible(true);
                                    }
                                    break;
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = b3.f48532b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                    break;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        int i12 = rect.top;
                        int i13 = rect.left;
                        int i14 = rect.right;
                        ViewGroup viewGroup2 = bVar.f803c0;
                        WeakHashMap weakHashMap = s0.f58893a;
                        v1 v1VarA = z4.k0.a(viewGroup2);
                        int iB = v1VarA == null ? 0 : v1VarA.b();
                        int iC = v1VarA == null ? 0 : v1VarA.c();
                        if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                            z13 = false;
                        } else {
                            marginLayoutParams.topMargin = i12;
                            marginLayoutParams.leftMargin = i13;
                            marginLayoutParams.rightMargin = i14;
                            z13 = true;
                        }
                        if (i12 <= 0 || bVar.f805e0 != null) {
                            View view2 = bVar.f805e0;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i15 = marginLayoutParams2.height;
                                int i16 = marginLayoutParams.topMargin;
                                if (i15 != i16 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i16;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    bVar.f805e0.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            bVar.f805e0 = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            bVar.f803c0.addView(bVar.f805e0, -1, layoutParams);
                        }
                        View view4 = bVar.f805e0;
                        z11 = view4 != null;
                        if (z11 && view4.getVisibility() != 0) {
                            View view5 = bVar.f805e0;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                        }
                        if (!bVar.f810j0 && z11) {
                            iD2 = 0;
                        }
                        z12 = z13;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z11 = false;
                        z12 = true;
                    } else {
                        z12 = false;
                        z11 = false;
                    }
                    if (z12) {
                        bVar.X.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = bVar.f805e0;
                if (view6 != null) {
                    view6.setVisibility(z11 ? 0 : 8);
                }
                if (iD != iD2) {
                    v1VarF = v1VarF.f(v1VarF.b(), iD2, v1VarF.c(), v1VarF.a());
                }
                return s0.k(view, v1VarF);
            default:
                s1 s1Var = v1VarF.f58905a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.P, v1VarF)) {
                    coordinatorLayout.P = v1VarF;
                    boolean z15 = v1VarF.d() > 0;
                    coordinatorLayout.Q = z15;
                    coordinatorLayout.setWillNotDraw(!z15 && coordinatorLayout.getBackground() == null);
                    if (!s1Var.o()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt = coordinatorLayout.getChildAt(i17);
                            WeakHashMap weakHashMap2 = s0.f58893a;
                            if (!childAt.getFitsSystemWindows() || ((l4.e) childAt.getLayoutParams()).f39716a == null || !s1Var.o()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return v1VarF;
        }
    }

    private final void a() {
    }

    private final void d() {
    }
}
