package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.b1;
import com.android.billingclient.api.k0;
import com.lingodeer.R;
import fb.g0;
import h9.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import qp.m4;
import r.b3;
import r.m2;
import r.n2;
import r.o2;
import r.p2;
import r.q2;
import r.r2;
import r.t2;
import r.v1;
import r.z0;
import z4.o;
import z4.p;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements z4.m {
    public AppCompatImageButton H;
    public View K;
    public Context L;
    public int M;
    public int N;
    public int O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public v1 V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f1028a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1029a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f1030b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f1031b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatTextView f1032c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f1033c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f1034d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f1035d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f1036e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorStateList f1037e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f1038f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f1039f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1040g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f1041h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ArrayList f1042i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ArrayList f1043j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int[] f1044k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final o f1045l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ArrayList f1046m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public q2 f1047n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final o20.i f1048o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public t2 f1049p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c f1050q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public o2 f1051r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public k0 f1052s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f1053t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public hd.d f1054t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1055u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public OnBackInvokedCallback f1056v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1057w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1058x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final py.b f1059y0;

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i11 = 0; i11 < menu.size(); i11++) {
            arrayList.add(menu.getItem(i11));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p.j(getContext());
    }

    public static p2 h() {
        p2 p2Var = new p2(-2, -2);
        p2Var.f48623b = 0;
        p2Var.f48622a = 8388627;
        return p2Var;
    }

    public static p2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z11 = layoutParams instanceof p2;
        if (z11) {
            p2 p2Var = (p2) layoutParams;
            p2 p2Var2 = new p2(p2Var);
            p2Var2.f48623b = 0;
            p2Var2.f48623b = p2Var.f48623b;
            return p2Var2;
        }
        if (z11) {
            p2 p2Var3 = new p2((p2) layoutParams);
            p2Var3.f48623b = 0;
            return p2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            p2 p2Var4 = new p2(layoutParams);
            p2Var4.f48623b = 0;
            return p2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        p2 p2Var5 = new p2(marginLayoutParams);
        p2Var5.f48623b = 0;
        ((ViewGroup.MarginLayoutParams) p2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return p2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i11, ArrayList arrayList) {
        boolean z11 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        arrayList.clear();
        if (!z11) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                p2 p2Var = (p2) childAt.getLayoutParams();
                if (p2Var.f48623b == 0 && u(childAt)) {
                    int i13 = p2Var.f48622a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            p2 p2Var2 = (p2) childAt2.getLayoutParams();
            if (p2Var2.f48623b == 0 && u(childAt2)) {
                int i15 = p2Var2.f48622a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i15, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // z4.m
    public final void addMenuProvider(p pVar) {
        o oVar = this.f1045l0;
        oVar.f58877b.add(pVar);
        oVar.f58876a.run();
    }

    public final void b(View view, boolean z11) {
        p2 p2VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p2VarI = h();
        } else {
            p2VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (p2) layoutParams;
        }
        p2VarI.f48623b = 1;
        if (!z11 || this.K == null) {
            addView(view, p2VarI);
        } else {
            view.setLayoutParams(p2VarI);
            this.f1043j0.add(view);
        }
    }

    public final void c() {
        if (this.H == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.H = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1038f);
            this.H.setContentDescription(this.f1053t);
            p2 p2VarH = h();
            p2VarH.f48622a = (this.P & 112) | 8388611;
            p2VarH.f48623b = 2;
            this.H.setLayoutParams(p2VarH);
            this.H.setOnClickListener(new l0(this, 4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p2);
    }

    public final void d() {
        if (this.V == null) {
            v1 v1Var = new v1();
            v1Var.f48673a = 0;
            v1Var.f48674b = 0;
            v1Var.f48675c = Integer.MIN_VALUE;
            v1Var.f48676d = Integer.MIN_VALUE;
            v1Var.f48677e = 0;
            v1Var.f48678f = 0;
            v1Var.f48679g = false;
            v1Var.f48680h = false;
            this.V = v1Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1028a;
        if (actionMenuView.R == null) {
            q.l lVar = (q.l) actionMenuView.getMenu();
            if (this.f1051r0 == null) {
                this.f1051r0 = new o2(this);
            }
            this.f1028a.setExpandedActionViewsExclusive(true);
            lVar.b(this.f1051r0, this.L);
            w();
        }
    }

    public final void f() {
        if (this.f1028a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1028a = actionMenuView;
            actionMenuView.setPopupTheme(this.M);
            this.f1028a.setOnMenuItemClickListener(this.f1048o0);
            ActionMenuView actionMenuView2 = this.f1028a;
            k0 k0Var = this.f1052s0;
            lp.j jVar = new lp.j(this, 22);
            actionMenuView2.W = k0Var;
            actionMenuView2.f878a0 = jVar;
            p2 p2VarH = h();
            p2VarH.f48622a = (this.P & 112) | 8388613;
            this.f1028a.setLayoutParams(p2VarH);
            b(this.f1028a, false);
        }
    }

    public final void g() {
        if (this.f1034d == null) {
            this.f1034d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            p2 p2VarH = h();
            p2VarH.f48622a = (this.P & 112) | 8388611;
            this.f1034d.setLayoutParams(p2VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.H;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.H;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v1 v1Var = this.V;
        if (v1Var != null) {
            return v1Var.f48679g ? v1Var.f48673a : v1Var.f48674b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.f1029a0;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v1 v1Var = this.V;
        if (v1Var != null) {
            return v1Var.f48673a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v1 v1Var = this.V;
        if (v1Var != null) {
            return v1Var.f48674b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v1 v1Var = this.V;
        if (v1Var != null) {
            return v1Var.f48679g ? v1Var.f48674b : v1Var.f48673a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.W;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        q.l lVar;
        ActionMenuView actionMenuView = this.f1028a;
        return (actionMenuView == null || (lVar = actionMenuView.R) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1029a0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.W, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1036e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1036e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1028a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1034d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1034d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1034d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.f1050q0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1028a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.L;
    }

    public int getPopupTheme() {
        return this.M;
    }

    public CharSequence getSubtitle() {
        return this.f1035d0;
    }

    public final TextView getSubtitleTextView() {
        return this.f1032c;
    }

    public CharSequence getTitle() {
        return this.f1033c0;
    }

    public int getTitleMarginBottom() {
        return this.U;
    }

    public int getTitleMarginEnd() {
        return this.S;
    }

    public int getTitleMarginStart() {
        return this.R;
    }

    public int getTitleMarginTop() {
        return this.T;
    }

    public final TextView getTitleTextView() {
        return this.f1030b;
    }

    public z0 getWrapper() {
        if (this.f1049p0 == null) {
            this.f1049p0 = new t2(this, true);
        }
        return this.f1049p0;
    }

    public final int j(View view, int i11) {
        p2 p2Var = (p2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i11 > 0 ? (measuredHeight - i11) / 2 : 0;
        int i13 = p2Var.f48622a & 112;
        if (i13 != 16 && i13 != 48 && i13 != 80) {
            i13 = this.f1031b0 & 112;
        }
        if (i13 == 48) {
            return getPaddingTop() - i12;
        }
        if (i13 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p2Var).bottomMargin) - i12;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) p2Var).topMargin;
        if (iMax < i14) {
            iMax = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) p2Var).bottomMargin;
            if (i15 < i16) {
                iMax = Math.max(0, iMax - (i16 - i15));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.f1046m0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = this.f1045l0.f58877b.iterator();
        while (it.hasNext()) {
            ((b1) ((p) it.next())).f1625a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1046m0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1043j0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1059y0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1041h0 = false;
        }
        if (!this.f1041h0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1041h0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1041h0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        p2 p2Var;
        p2 p2Var2;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int paddingTop;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int iMax2;
        int i25;
        int i26;
        int i27;
        int i28;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i29;
        int size2;
        int i30;
        int i31;
        int size3;
        int i32;
        int i33;
        int measuredWidth;
        int i34;
        int i35;
        int i36;
        int size4;
        boolean z13 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i37 = width - paddingRight;
        int[] iArr = this.f1044k0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = s0.f58893a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i14 - i12) : 0;
        if (u(this.f1034d)) {
            if (z13) {
                iR = r(this.f1034d, i37, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.f1034d, paddingLeft, iMin2, iArr);
            }
            if (u(this.H)) {
                if (z13) {
                    iR = r(this.H, iR, iMin2, iArr);
                } else {
                    iQ = q(this.H, iQ, iMin2, iArr);
                }
            }
            if (u(this.f1028a)) {
                if (z13) {
                    iQ = q(this.f1028a, iQ, iMin2, iArr);
                } else {
                    iR = r(this.f1028a, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i37 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i37 - currentContentInsetRight);
            if (u(this.K)) {
                if (z13) {
                    iMin = r(this.K, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.K, iMax, iMin2, iArr);
                }
            }
            if (u(this.f1036e)) {
                if (z13) {
                    iMin = r(this.f1036e, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f1036e, iMax, iMin2, iArr);
                }
            }
            zU = u(this.f1030b);
            zU2 = u(this.f1032c);
            if (zU) {
                p2 p2Var3 = (p2) this.f1030b.getLayoutParams();
                measuredHeight = this.f1030b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p2Var3).topMargin + ((ViewGroup.MarginLayoutParams) p2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                p2 p2Var4 = (p2) this.f1032c.getLayoutParams();
                measuredHeight = this.f1032c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p2Var4).topMargin + ((ViewGroup.MarginLayoutParams) p2Var4).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    appCompatTextView = this.f1030b;
                } else {
                    appCompatTextView = this.f1032c;
                }
                if (zU2) {
                    appCompatTextView2 = this.f1032c;
                } else {
                    appCompatTextView2 = this.f1030b;
                }
                p2Var = (p2) appCompatTextView.getLayoutParams();
                p2Var2 = (p2) appCompatTextView2.getLayoutParams();
                i15 = measuredHeight;
                z12 = (!zU && this.f1030b.getMeasuredWidth() > 0) || (zU2 && this.f1032c.getMeasuredWidth() > 0);
                i16 = this.f1031b0 & 112;
                i17 = iMax;
                if (i16 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
                } else if (i16 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i15) / 2;
                    i25 = ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
                    if (iMax2 < i25) {
                        iMax2 = i25;
                    } else {
                        i26 = (((height - paddingBottom) - i15) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) p2Var).bottomMargin;
                        i28 = this.U;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin) - this.U) - i15;
                }
                if (z13) {
                    if (z12) {
                        i22 = this.R;
                    } else {
                        i22 = 0;
                    }
                    int i38 = i22 - iArr[1];
                    iMin -= Math.max(0, i38);
                    iArr[1] = Math.max(0, -i38);
                    if (zU) {
                        p2 p2Var5 = (p2) this.f1030b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1030b.getMeasuredWidth();
                        int measuredHeight2 = this.f1030b.getMeasuredHeight() + paddingTop;
                        this.f1030b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i23 = measuredWidth2 - this.S;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) p2Var5).bottomMargin;
                    } else {
                        i23 = iMin;
                    }
                    if (zU2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                        this.f1032c.layout(iMin - this.f1032c.getMeasuredWidth(), i39, iMin, this.f1032c.getMeasuredHeight() + i39);
                        i24 = iMin - this.S;
                    } else {
                        i24 = iMin;
                    }
                    if (z12) {
                        iMin = Math.min(i23, i24);
                    }
                    iMax = i17;
                } else {
                    if (z12) {
                        i18 = this.R;
                    } else {
                        i18 = 0;
                    }
                    int i40 = i18 - iArr[0];
                    iMax = Math.max(0, i40) + i17;
                    iArr[0] = Math.max(0, -i40);
                    if (zU) {
                        p2 p2Var6 = (p2) this.f1030b.getLayoutParams();
                        int measuredWidth3 = this.f1030b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1030b.getMeasuredHeight() + paddingTop;
                        this.f1030b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i19 = measuredWidth3 + this.S;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) p2Var6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zU2) {
                        int i41 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1032c.getMeasuredWidth() + iMax;
                        this.f1032c.layout(iMax, i41, measuredWidth4, this.f1032c.getMeasuredHeight() + i41);
                        i21 = measuredWidth4 + this.S;
                    } else {
                        i21 = iMax;
                    }
                    if (z12) {
                        iMax = Math.max(i19, i21);
                    }
                }
            }
            arrayList = this.f1042i0;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i29 = 0; i29 < size; i29++) {
                iQ2 = q((View) arrayList.get(i29), iQ2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i30 = 0; i30 < size2; i30++) {
                iMin = r((View) arrayList.get(i30), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i42 = iArr[0];
            i31 = iArr[1];
            size3 = arrayList.size();
            i32 = i42;
            i33 = 0;
            measuredWidth = 0;
            while (i33 < size3) {
                View view = (View) arrayList.get(i33);
                p2 p2Var7 = (p2) view.getLayoutParams();
                int i43 = i31;
                int i44 = ((ViewGroup.MarginLayoutParams) p2Var7).leftMargin - i32;
                int i45 = ((ViewGroup.MarginLayoutParams) p2Var7).rightMargin - i43;
                int iMax3 = Math.max(0, i44);
                int iMax4 = Math.max(0, i45);
                int iMax5 = Math.max(0, -i44);
                int iMax6 = Math.max(0, -i45);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i33++;
                i32 = iMax5;
                i31 = iMax6;
            }
            i35 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i36 = measuredWidth + i35;
            if (i35 >= iQ2) {
                if (i36 > iMin) {
                    iQ2 = i35 - (i36 - iMin);
                } else {
                    iQ2 = i35;
                }
            }
            size4 = arrayList.size();
            for (i34 = 0; i34 < size4; i34++) {
                iQ2 = q((View) arrayList.get(i34), iQ2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i37;
        if (u(this.H)) {
            if (z13) {
                iR = r(this.H, iR, iMin2, iArr);
            } else {
                iQ = q(this.H, iQ, iMin2, iArr);
            }
        }
        if (u(this.f1028a)) {
            if (z13) {
                iQ = q(this.f1028a, iQ, iMin2, iArr);
            } else {
                iR = r(this.f1028a, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i37 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i37 - currentContentInsetRight2);
        if (u(this.K)) {
            if (z13) {
                iMin = r(this.K, iMin, iMin2, iArr);
            } else {
                iMax = q(this.K, iMax, iMin2, iArr);
            }
        }
        if (u(this.f1036e)) {
            if (z13) {
                iMin = r(this.f1036e, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f1036e, iMax, iMin2, iArr);
            }
        }
        zU = u(this.f1030b);
        zU2 = u(this.f1032c);
        if (zU) {
            p2 p2Var8 = (p2) this.f1030b.getLayoutParams();
            measuredHeight = this.f1030b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p2Var8).topMargin + ((ViewGroup.MarginLayoutParams) p2Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            p2 p2Var9 = (p2) this.f1032c.getLayoutParams();
            measuredHeight = this.f1032c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p2Var9).topMargin + ((ViewGroup.MarginLayoutParams) p2Var9).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                appCompatTextView = this.f1030b;
            } else {
                appCompatTextView = this.f1032c;
            }
            if (zU2) {
                appCompatTextView2 = this.f1032c;
            } else {
                appCompatTextView2 = this.f1030b;
            }
            p2Var = (p2) appCompatTextView.getLayoutParams();
            p2Var2 = (p2) appCompatTextView2.getLayoutParams();
            i15 = measuredHeight;
            if (zU) {
            }
            i16 = this.f1031b0 & 112;
            i17 = iMax;
            if (i16 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
            } else if (i16 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i15) / 2;
                i25 = ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
                if (iMax2 < i25) {
                    iMax2 = i25;
                } else {
                    i26 = (((height - paddingBottom) - i15) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) p2Var).bottomMargin;
                    i28 = this.U;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin) - this.U) - i15;
            }
            if (z13) {
                if (z12) {
                    i22 = this.R;
                } else {
                    i22 = 0;
                }
                int i310 = i22 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zU) {
                    p2 p2Var10 = (p2) this.f1030b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1030b.getMeasuredWidth();
                    int measuredHeight4 = this.f1030b.getMeasuredHeight() + paddingTop;
                    this.f1030b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i23 = measuredWidth5 - this.S;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) p2Var10).bottomMargin;
                } else {
                    i23 = iMin;
                }
                if (zU2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                    this.f1032c.layout(iMin - this.f1032c.getMeasuredWidth(), i311, iMin, this.f1032c.getMeasuredHeight() + i311);
                    i24 = iMin - this.S;
                } else {
                    i24 = iMin;
                }
                if (z12) {
                    iMin = Math.min(i23, i24);
                }
                iMax = i17;
            } else {
                if (z12) {
                    i18 = this.R;
                } else {
                    i18 = 0;
                }
                int i46 = i18 - iArr[0];
                iMax = Math.max(0, i46) + i17;
                iArr[0] = Math.max(0, -i46);
                if (zU) {
                    p2 p2Var11 = (p2) this.f1030b.getLayoutParams();
                    int measuredWidth6 = this.f1030b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1030b.getMeasuredHeight() + paddingTop;
                    this.f1030b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i19 = measuredWidth6 + this.S;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) p2Var11).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zU2) {
                    int i47 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1032c.getMeasuredWidth() + iMax;
                    this.f1032c.layout(iMax, i47, measuredWidth7, this.f1032c.getMeasuredHeight() + i47);
                    i21 = measuredWidth7 + this.S;
                } else {
                    i21 = iMax;
                }
                if (z12) {
                    iMax = Math.max(i19, i21);
                }
            }
        } else {
            if (zU) {
                appCompatTextView = this.f1030b;
            } else {
                appCompatTextView = this.f1032c;
            }
            if (zU2) {
                appCompatTextView2 = this.f1032c;
            } else {
                appCompatTextView2 = this.f1030b;
            }
            p2Var = (p2) appCompatTextView.getLayoutParams();
            p2Var2 = (p2) appCompatTextView2.getLayoutParams();
            i15 = measuredHeight;
            if (zU) {
            }
            i16 = this.f1031b0 & 112;
            i17 = iMax;
            if (i16 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
            } else if (i16 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i15) / 2;
                i25 = ((ViewGroup.MarginLayoutParams) p2Var).topMargin + this.T;
                if (iMax2 < i25) {
                    iMax2 = i25;
                } else {
                    i26 = (((height - paddingBottom) - i15) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) p2Var).bottomMargin;
                    i28 = this.U;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p2Var2).bottomMargin) - this.U) - i15;
            }
            if (z13) {
                if (z12) {
                    i22 = this.R;
                } else {
                    i22 = 0;
                }
                int i312 = i22 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zU) {
                    p2 p2Var12 = (p2) this.f1030b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1030b.getMeasuredWidth();
                    int measuredHeight6 = this.f1030b.getMeasuredHeight() + paddingTop;
                    this.f1030b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i23 = measuredWidth8 - this.S;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) p2Var12).bottomMargin;
                } else {
                    i23 = iMin;
                }
                if (zU2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                    this.f1032c.layout(iMin - this.f1032c.getMeasuredWidth(), i313, iMin, this.f1032c.getMeasuredHeight() + i313);
                    i24 = iMin - this.S;
                } else {
                    i24 = iMin;
                }
                if (z12) {
                    iMin = Math.min(i23, i24);
                }
                iMax = i17;
            } else {
                if (z12) {
                    i18 = this.R;
                } else {
                    i18 = 0;
                }
                int i48 = i18 - iArr[0];
                iMax = Math.max(0, i48) + i17;
                iArr[0] = Math.max(0, -i48);
                if (zU) {
                    p2 p2Var13 = (p2) this.f1030b.getLayoutParams();
                    int measuredWidth9 = this.f1030b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1030b.getMeasuredHeight() + paddingTop;
                    this.f1030b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i19 = measuredWidth9 + this.S;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) p2Var13).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zU2) {
                    int i49 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p2) this.f1032c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1032c.getMeasuredWidth() + iMax;
                    this.f1032c.layout(iMax, i49, measuredWidth10, this.f1032c.getMeasuredHeight() + i49);
                    i21 = measuredWidth10 + this.S;
                } else {
                    i21 = iMax;
                }
                if (z12) {
                    iMax = Math.max(i19, i21);
                }
            }
        }
        arrayList = this.f1042i0;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i29 < size) {
            iQ2 = q((View) arrayList.get(i29), iQ2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i30 < size2) {
            iMin = r((View) arrayList.get(i30), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i410 = iArr[0];
        i31 = iArr[1];
        size3 = arrayList.size();
        i32 = i410;
        i33 = 0;
        measuredWidth = 0;
        while (i33 < size3) {
            View view2 = (View) arrayList.get(i33);
            p2 p2Var14 = (p2) view2.getLayoutParams();
            int i411 = i31;
            int i412 = ((ViewGroup.MarginLayoutParams) p2Var14).leftMargin - i32;
            int i413 = ((ViewGroup.MarginLayoutParams) p2Var14).rightMargin - i411;
            int iMax7 = Math.max(0, i412);
            int iMax8 = Math.max(0, i413);
            int iMax9 = Math.max(0, -i412);
            int iMax10 = Math.max(0, -i413);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i33++;
            i32 = iMax9;
            i31 = iMax10;
        }
        i35 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i36 = measuredWidth + i35;
        if (i35 >= iQ2) {
            if (i36 > iMin) {
                iQ2 = i35 - (i36 - iMin);
            } else {
                iQ2 = i35;
            }
        }
        size4 = arrayList.size();
        while (i34 < size4) {
            iQ2 = q((View) arrayList.get(i34), iQ2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        char c11;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z11 = b3.f48531a;
        int i13 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c11 = 0;
        } else {
            c11 = 1;
            objArr = false;
        }
        if (u(this.f1034d)) {
            t(this.f1034d, i11, 0, i12, this.Q);
            iK = k(this.f1034d) + this.f1034d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f1034d) + this.f1034d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1034d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.H)) {
            t(this.H, i11, 0, i12, this.Q);
            iK = k(this.H) + this.H.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.H) + this.H.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f1044k0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.f1028a)) {
            t(this.f1028a, i11, iMax3, i12, this.Q);
            iK2 = k(this.f1028a) + this.f1028a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1028a) + this.f1028a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1028a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c11] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.K)) {
            iMax5 += s(this.K, i11, iMax5, i12, 0, iArr);
            iMax = Math.max(iMax, l(this.K) + this.K.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.K.getMeasuredState());
        }
        if (u(this.f1036e)) {
            iMax5 += s(this.f1036e, i11, iMax5, i12, 0, iArr);
            iMax = Math.max(iMax, l(this.f1036e) + this.f1036e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1036e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((p2) childAt.getLayoutParams()).f48623b == 0 && u(childAt)) {
                iMax5 += s(childAt, i11, iMax5, i12, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i15 = iMax5;
        int i16 = this.T + this.U;
        int i17 = this.R + this.S;
        if (u(this.f1030b)) {
            s(this.f1030b, i11, i15 + i17, i12, i16, iArr);
            int iK3 = k(this.f1030b) + this.f1030b.getMeasuredWidth();
            iL = l(this.f1030b) + this.f1030b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1030b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f1032c)) {
            iMax2 = Math.max(iMax2, s(this.f1032c, i11, i15 + i17, i12, i16 + iL, iArr));
            iL += l(this.f1032c) + this.f1032c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1032c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i11, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, iCombineMeasuredStates2 << 16);
        if (!this.f1055u0) {
            i13 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i13 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i13);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof r2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r2 r2Var = (r2) parcelable;
        super.onRestoreInstanceState(r2Var.f37910a);
        ActionMenuView actionMenuView = this.f1028a;
        q.l lVar = actionMenuView != null ? actionMenuView.R : null;
        int i11 = r2Var.f48638c;
        if (i11 != 0 && this.f1051r0 != null && lVar != null && (menuItemFindItem = lVar.findItem(i11)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (r2Var.f48639d) {
            py.b bVar = this.f1059y0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        d();
        v1 v1Var = this.V;
        boolean z11 = i11 == 1;
        if (z11 == v1Var.f48679g) {
            return;
        }
        v1Var.f48679g = z11;
        if (!v1Var.f48680h) {
            v1Var.f48673a = v1Var.f48677e;
            v1Var.f48674b = v1Var.f48678f;
            return;
        }
        if (z11) {
            int i12 = v1Var.f48676d;
            if (i12 == Integer.MIN_VALUE) {
                i12 = v1Var.f48677e;
            }
            v1Var.f48673a = i12;
            int i13 = v1Var.f48675c;
            if (i13 == Integer.MIN_VALUE) {
                i13 = v1Var.f48678f;
            }
            v1Var.f48674b = i13;
            return;
        }
        int i14 = v1Var.f48675c;
        if (i14 == Integer.MIN_VALUE) {
            i14 = v1Var.f48677e;
        }
        v1Var.f48673a = i14;
        int i15 = v1Var.f48676d;
        if (i15 == Integer.MIN_VALUE) {
            i15 = v1Var.f48678f;
        }
        v1Var.f48674b = i15;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        q.n nVar;
        r2 r2Var = new r2(super.onSaveInstanceState());
        o2 o2Var = this.f1051r0;
        if (o2Var != null && (nVar = o2Var.f48619b) != null) {
            r2Var.f48638c = nVar.f47290a;
        }
        r2Var.f48639d = p();
        return r2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1040g0 = false;
        }
        if (!this.f1040g0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1040g0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1040g0 = false;
        return true;
    }

    public final boolean p() {
        c cVar;
        ActionMenuView actionMenuView = this.f1028a;
        return (actionMenuView == null || (cVar = actionMenuView.V) == null || !cVar.h()) ? false : true;
    }

    public final int q(View view, int i11, int i12, int[] iArr) {
        p2 p2Var = (p2) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) p2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i13) + i11;
        iArr[0] = Math.max(0, -i13);
        int iJ = j(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p2Var).rightMargin + iMax;
    }

    public final int r(View view, int i11, int i12, int[] iArr) {
        p2 p2Var = (p2) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) p2Var).rightMargin - iArr[1];
        int iMax = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int iJ = j(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) p2Var).leftMargin);
    }

    @Override // z4.m
    public final void removeMenuProvider(p pVar) {
        this.f1045l0.b(pVar);
    }

    public final int s(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i16) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + iMax + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z11) {
        if (this.f1058x0 != z11) {
            this.f1058x0 = z11;
            w();
        }
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(jh.h.k(getContext(), i11));
    }

    public void setCollapsible(boolean z11) {
        this.f1055u0 = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f1029a0) {
            this.f1029a0 = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.W) {
            this.W = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i11) {
        setLogo(jh.h.k(getContext(), i11));
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(jh.h.k(getContext(), i11));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1034d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(q2 q2Var) {
        this.f1047n0 = q2Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1028a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.M != i11) {
            this.M = i11;
            if (i11 == 0) {
                this.L = getContext();
            } else {
                this.L = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public void setTitleMarginBottom(int i11) {
        this.U = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.S = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.R = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.T = i11;
        requestLayout();
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    public final void t(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        c cVar;
        ActionMenuView actionMenuView = this.f1028a;
        return (actionMenuView == null || (cVar = actionMenuView.V) == null || !cVar.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = n2.a(this);
            o2 o2Var = this.f1051r0;
            boolean z11 = (o2Var == null || o2Var.f48619b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f1058x0) ? false : true;
            if (z11 && this.f1057w0 == null) {
                if (this.f1056v0 == null) {
                    this.f1056v0 = n2.b(new m2(this, 0));
                }
                n2.c(onBackInvokedDispatcherA, this.f1056v0);
                this.f1057w0 = onBackInvokedDispatcherA;
                return;
            }
            if (z11 || (onBackInvokedDispatcher = this.f1057w0) == null) {
                return;
            }
            n2.d(onBackInvokedDispatcher, this.f1056v0);
            this.f1057w0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p2 p2Var = new p2(context, attributeSet);
        p2Var.f48622a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37400b);
        p2Var.f48622a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        p2Var.f48623b = 0;
        return p2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.H;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.H.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.H;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f1038f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1036e == null) {
                this.f1036e = new AppCompatImageView(getContext());
            }
            if (!o(this.f1036e)) {
                b(this.f1036e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1036e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f1036e);
                this.f1043j0.remove(this.f1036e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1036e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1036e == null) {
            this.f1036e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f1036e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f1034d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            g0.C(this.f1034d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1034d)) {
                b(this.f1034d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1034d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f1034d);
                this.f1043j0.remove(this.f1034d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1034d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f1032c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f1032c);
                this.f1043j0.remove(this.f1032c);
            }
        } else {
            if (this.f1032c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f1032c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1032c.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.O;
                if (i11 != 0) {
                    this.f1032c.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f1039f0;
                if (colorStateList != null) {
                    this.f1032c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1032c)) {
                b(this.f1032c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1032c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1035d0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1039f0 = colorStateList;
        AppCompatTextView appCompatTextView = this.f1032c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f1030b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f1030b);
                this.f1043j0.remove(this.f1030b);
            }
        } else {
            if (this.f1030b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f1030b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f1030b.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.N;
                if (i11 != 0) {
                    this.f1030b.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f1037e0;
                if (colorStateList != null) {
                    this.f1030b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1030b)) {
                b(this.f1030b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1030b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1033c0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1037e0 = colorStateList;
        AppCompatTextView appCompatTextView = this.f1030b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1031b0 = 8388627;
        this.f1042i0 = new ArrayList();
        this.f1043j0 = new ArrayList();
        this.f1044k0 = new int[2];
        this.f1045l0 = new o(new m2(this, 1));
        this.f1046m0 = new ArrayList();
        this.f1048o0 = new o20.i(this, 18);
        this.f1059y0 = new py.b(this, 2);
        Context context2 = getContext();
        int[] iArr = k.a.A;
        m4 m4VarK = m4.k(context2, attributeSet, iArr, i11);
        s0.p(this, context, iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        this.N = typedArray.getResourceId(28, 0);
        this.O = typedArray.getResourceId(19, 0);
        this.f1031b0 = typedArray.getInteger(0, 8388627);
        this.P = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.T = dimensionPixelOffset;
        this.S = dimensionPixelOffset;
        this.R = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.R = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.S = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.T = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.U = dimensionPixelOffset5;
        }
        this.Q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        v1 v1Var = this.V;
        v1Var.f48680h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            v1Var.f48677e = dimensionPixelSize;
            v1Var.f48673a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            v1Var.f48678f = dimensionPixelSize2;
            v1Var.f48674b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            v1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.W = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1029a0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1038f = m4VarK.g(4);
        this.f1053t = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.L = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableG = m4VarK.g(16);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableG2 = m4VarK.g(11);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(m4VarK.f(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(m4VarK.f(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        m4VarK.l();
    }
}
