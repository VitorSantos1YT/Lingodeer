package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.android.billingclient.api.k0;
import com.yalantis.ucrop.view.CropImageView;
import o20.w;
import q.u;
import q.x;
import r.b3;
import r.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements q.k, x {
    public q.l R;
    public Context S;
    public int T;
    public boolean U;
    public c V;
    public k0 W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public q.j f878a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f879b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f880c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f881d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f882e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public r.k f883f0;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static r.j j() {
        r.j jVar = new r.j(-2, -2);
        jVar.f48580a = false;
        ((LinearLayout.LayoutParams) jVar).gravity = 16;
        return jVar;
    }

    public static r.j k(ViewGroup.LayoutParams layoutParams) {
        r.j jVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof r.j) {
            r.j jVar2 = (r.j) layoutParams;
            jVar = new r.j(jVar2);
            jVar.f48580a = jVar2.f48580a;
        } else {
            jVar = new r.j(layoutParams);
        }
        if (((LinearLayout.LayoutParams) jVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) jVar).gravity = 16;
        }
        return jVar;
    }

    @Override // q.x
    public final void a(q.l lVar) {
        this.R = lVar;
    }

    @Override // q.k
    public final boolean b(q.n nVar) {
        return this.R.q(nVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r.j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ k1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final k1 generateLayoutParams(AttributeSet attributeSet) {
        return new r.j(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.R == null) {
            Context context = getContext();
            q.l lVar = new q.l(context);
            this.R = lVar;
            lVar.f47284e = new w(this, 17);
            c cVar = new c(context);
            this.V = cVar;
            cVar.O = true;
            cVar.P = true;
            u k0Var = this.W;
            if (k0Var == null) {
                k0Var = new ay.k0(28);
            }
            cVar.f1072e = k0Var;
            this.R.b(cVar, this.S);
            c cVar2 = this.V;
            cVar2.H = this;
            this.R = cVar2.f1070c;
        }
        return this.R;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.V;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = cVar.L;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            return actionMenuPresenter$OverflowMenuButton.getDrawable();
        }
        if (cVar.N) {
            return cVar.M;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.T;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ k1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i11) {
        boolean zA = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof r.i)) {
            zA = ((r.i) childAt).a();
        }
        return (i11 <= 0 || !(childAt2 instanceof r.i)) ? zA : ((r.i) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.V;
        if (cVar != null) {
            cVar.c(false);
            if (this.V.h()) {
                this.V.b();
                this.V.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.V;
        if (cVar != null) {
            cVar.b();
            r.e eVar = cVar.W;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.f47318i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int paddingLeft;
        if (!this.f879b0) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i13 - i11;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z12 = b3.f48531a;
        boolean z13 = getLayoutDirection() == 1;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                r.j jVar = (r.j) childAt.getLayoutParams();
                if (jVar.f48580a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z13) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) jVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) jVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i21 = i15 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) jVar).leftMargin) + ((LinearLayout.LayoutParams) jVar).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i16 / 2) - (measuredWidth2 / 2);
            int i23 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i18 - (i17 ^ 1);
        int iMax = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (z13) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                r.j jVar2 = (r.j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !jVar2.f48580a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) jVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) jVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            r.j jVar3 = (r.j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !jVar3.f48580a) {
                int i29 = paddingLeft2 + ((LinearLayout.LayoutParams) jVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) jVar3).rightMargin + iMax + i29;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        ?? r11;
        int i15;
        int i16;
        q.l lVar;
        boolean z11 = this.f879b0;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.f879b0 = z12;
        if (z11 != z12) {
            this.f880c0 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.f879b0 && (lVar = this.R) != null && size != this.f880c0) {
            this.f880c0 = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f879b0 || childCount <= 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                r.j jVar = (r.j) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) jVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) jVar).leftMargin = 0;
            }
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i11);
        int size3 = View.MeasureSpec.getSize(i12);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.f881d0;
        int i21 = i18 / i19;
        int i22 = i18 % i19;
        if (i21 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i23 = (i22 / i21) + i19;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i24 = 0;
        int iMax2 = 0;
        int i25 = 0;
        boolean z13 = false;
        int i26 = 0;
        long j11 = 0;
        while (true) {
            i13 = this.f882e0;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i15 = i23;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i24++;
                if (z14) {
                    childAt.setPadding(i13, 0, i13, 0);
                }
                r.j jVar2 = (r.j) childAt.getLayoutParams();
                jVar2.f48585f = false;
                jVar2.f48582c = 0;
                jVar2.f48581b = 0;
                jVar2.f48583d = false;
                ((LinearLayout.LayoutParams) jVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) jVar2).rightMargin = 0;
                jVar2.f48584e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i29 = jVar2.f48580a ? 1 : i21;
                r.j jVar3 = (r.j) childAt.getLayoutParams();
                int i30 = i21;
                i15 = i23;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z16 = z15;
                if (i29 <= 0 || (z15 && i29 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i29, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i16++;
                    }
                    if (z16 && i16 < 2) {
                        i16 = 2;
                    }
                }
                jVar3.f48583d = !jVar3.f48580a && z16;
                jVar3.f48581b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i16);
                if (jVar2.f48583d) {
                    i26++;
                }
                if (jVar2.f48580a) {
                    z13 = true;
                }
                i21 = i30 - i16;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j11 |= (long) (1 << i25);
                }
            }
            i25++;
            size3 = i27;
            paddingBottom = i28;
            i23 = i15;
        }
        int i31 = size3;
        int i32 = i21;
        int i33 = i23;
        boolean z17 = z13 && i24 == 2;
        int i34 = i32;
        boolean z18 = false;
        while (true) {
            if (i26 <= 0 || i34 <= 0) {
                i14 = iMax;
                break;
            }
            int i35 = Integer.MAX_VALUE;
            long j12 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i37 < childCount2) {
                int i38 = iMax;
                r.j jVar4 = (r.j) getChildAt(i37).getLayoutParams();
                boolean z19 = z17;
                if (jVar4.f48583d) {
                    int i39 = jVar4.f48581b;
                    if (i39 < i35) {
                        j12 = 1 << i37;
                        i35 = i39;
                        i36 = 1;
                    } else if (i39 == i35) {
                        j12 |= 1 << i37;
                        i36++;
                    }
                }
                i37++;
                z17 = z19;
                iMax = i38;
            }
            i14 = iMax;
            boolean z20 = z17;
            j11 |= j12;
            if (i36 > i34) {
                break;
            }
            int i40 = i35 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                r.j jVar5 = (r.j) childAt2.getLayoutParams();
                boolean z21 = z13;
                long j13 = 1 << i41;
                if ((j12 & j13) != 0) {
                    if (z20 && jVar5.f48584e) {
                        r11 = 1;
                        r11 = 1;
                        if (i34 == 1) {
                            childAt2.setPadding(i13 + i33, 0, i13, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    jVar5.f48581b += r11;
                    jVar5.f48585f = r11;
                    i34--;
                } else if (jVar5.f48581b == i40) {
                    j11 |= j13;
                }
                i41++;
                z13 = z21;
            }
            z17 = z20;
            iMax = i14;
            z18 = true;
        }
        boolean z22 = !z13 && i24 == 1;
        if (i34 > 0 && j11 != 0 && (i34 < i24 - 1 || z22 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j11);
            if (!z22) {
                if ((j11 & 1) != 0 && !((r.j) getChildAt(0).getLayoutParams()).f48584e) {
                    fBitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j11 & ((long) (1 << i42))) != 0 && !((r.j) getChildAt(i42).getLayoutParams()).f48584e) {
                    fBitCount -= 0.5f;
                }
            }
            int i43 = fBitCount > CropImageView.DEFAULT_ASPECT_RATIO ? (int) ((i34 * i33) / fBitCount) : 0;
            boolean z23 = z18;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j11 & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    r.j jVar6 = (r.j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        jVar6.f48582c = i43;
                        jVar6.f48585f = true;
                        if (i44 == 0 && !jVar6.f48584e) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = (-i43) / 2;
                        }
                        z23 = true;
                    } else if (jVar6.f48580a) {
                        jVar6.f48582c = i43;
                        jVar6.f48585f = true;
                        ((LinearLayout.LayoutParams) jVar6).rightMargin = (-i43) / 2;
                        z23 = true;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) jVar6).rightMargin = i43 / 2;
                        }
                    }
                }
            }
            z18 = z23;
        }
        if (z18) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                r.j jVar7 = (r.j) childAt4.getLayoutParams();
                if (jVar7.f48585f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((jVar7.f48581b * i33) + jVar7.f48582c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i18, mode != 1073741824 ? i14 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.V.T = z11;
    }

    public void setOnMenuItemClickListener(r.k kVar) {
        this.f883f0 = kVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.V;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = cVar.L;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            actionMenuPresenter$OverflowMenuButton.setImageDrawable(drawable);
        } else {
            cVar.N = true;
            cVar.M = drawable;
        }
    }

    public void setOverflowReserved(boolean z11) {
        this.U = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.T != i11) {
            this.T = i11;
            if (i11 == 0) {
                this.S = getContext();
            } else {
                this.S = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.V = cVar;
        cVar.H = this;
        this.R = cVar.f1070c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f881d0 = (int) (56.0f * f5);
        this.f882e0 = (int) (f5 * 4.0f);
        this.S = context;
        this.T = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r.j(getContext(), attributeSet);
    }
}
