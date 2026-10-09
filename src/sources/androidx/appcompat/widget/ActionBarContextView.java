package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h9.l0;
import q.x;
import r.b3;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {
    public CharSequence K;
    public CharSequence L;
    public View M;
    public View N;
    public View O;
    public LinearLayout P;
    public TextView Q;
    public TextView R;
    public final int S;
    public final int T;
    public boolean U;
    public final int V;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public final void e(p.c cVar) {
        View view = this.M;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.V, (ViewGroup) this, false);
            this.M = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.M);
        }
        View viewFindViewById = this.M.findViewById(R.id.action_mode_close_button);
        this.N = viewFindViewById;
        viewFindViewById.setOnClickListener(new l0(cVar, 3));
        q.l lVarD = cVar.d();
        c cVar2 = this.f849d;
        if (cVar2 != null) {
            cVar2.b();
            r.e eVar = cVar2.W;
            if (eVar != null && eVar.b()) {
                eVar.f47318i.dismiss();
            }
        }
        c cVar3 = new c(getContext());
        this.f849d = cVar3;
        cVar3.O = true;
        cVar3.P = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarD.b(this.f849d, this.f847b);
        c cVar4 = this.f849d;
        x xVar = cVar4.H;
        if (xVar == null) {
            x xVar2 = (x) cVar4.f1071d.inflate(cVar4.f1073f, (ViewGroup) this, false);
            cVar4.H = xVar2;
            xVar2.a(cVar4.f1070c);
            cVar4.c(true);
        }
        x xVar3 = cVar4.H;
        if (xVar != xVar3) {
            ((ActionMenuView) xVar3).setPresenter(cVar4);
        }
        ActionMenuView actionMenuView = (ActionMenuView) xVar3;
        this.f848c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f848c, layoutParams);
    }

    public final void f() {
        if (this.P == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.P = linearLayout;
            this.Q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.R = (TextView) this.P.findViewById(R.id.action_bar_subtitle);
            int i11 = this.S;
            if (i11 != 0) {
                this.Q.setTextAppearance(getContext(), i11);
            }
            int i12 = this.T;
            if (i12 != 0) {
                this.R.setTextAppearance(getContext(), i12);
            }
        }
        this.Q.setText(this.K);
        this.R.setText(this.L);
        boolean zIsEmpty = TextUtils.isEmpty(this.K);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.L);
        this.R.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.P.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.P.getParent() == null) {
            addView(this.P);
        }
    }

    public final void g() {
        removeAllViews();
        this.O = null;
        this.f848c = null;
        this.f849d = null;
        View view = this.N;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f851f != null ? this.f846a.f1065b : getVisibility();
    }

    public int getContentHeight() {
        return this.f850e;
    }

    public CharSequence getSubtitle() {
        return this.L;
    }

    public CharSequence getTitle() {
        return this.K;
    }

    public final w0 h(int i11, long j11) {
        w0 w0Var = this.f851f;
        if (w0Var != null) {
            w0Var.b();
        }
        a aVar = this.f846a;
        if (i11 != 0) {
            w0 w0VarB = s0.b(this);
            w0VarB.a(CropImageView.DEFAULT_ASPECT_RATIO);
            w0VarB.e(j11);
            aVar.f1066c.f851f = w0VarB;
            aVar.f1065b = i11;
            w0VarB.g(aVar);
            return w0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        w0 w0VarB2 = s0.b(this);
        w0VarB2.a(1.0f);
        w0VarB2.e(j11);
        aVar.f1066c.f851f = w0VarB2;
        aVar.f1065b = i11;
        w0VarB2.g(aVar);
        return w0VarB2;
    }

    public final void i() {
        c cVar = this.f849d;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f849d;
        if (cVar != null) {
            cVar.b();
            r.e eVar = this.f849d.W;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.f47318i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12 = b3.f48531a;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.M;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            int i15 = z13 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i16 = z13 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i17 = z13 ? paddingRight - i15 : paddingRight + i15;
            int iD = i17 + AbsActionBarView.d(i17, paddingTop, paddingTop2, this.M, z13);
            paddingRight = z13 ? iD - i16 : iD + i16;
        }
        LinearLayout linearLayout = this.P;
        if (linearLayout != null && this.O == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, this.P, z13);
        }
        View view2 = this.O;
        if (view2 != null) {
            AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, view2, z13);
        }
        int paddingLeft = z13 ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f848c;
        if (actionMenuView != null) {
            AbsActionBarView.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i12) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = this.f850e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i12);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.M;
        if (view != null) {
            int iC = AbsActionBarView.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f848c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbsActionBarView.c(this.f848c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.P;
        if (linearLayout != null && this.O == null) {
            if (this.U) {
                this.P.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.P.getMeasuredWidth();
                boolean z11 = measuredWidth <= paddingLeft;
                if (z11) {
                    paddingLeft -= measuredWidth;
                }
                this.P.setVisibility(z11 ? 0 : 8);
            } else {
                paddingLeft = AbsActionBarView.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.O;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                iMin = Math.min(i15, iMin);
            }
            this.O.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(iMin, i16));
        }
        if (this.f850e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i11) {
        this.f850e = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.O;
        if (view2 != null) {
            removeView(view2);
        }
        this.O = view;
        if (view != null && (linearLayout = this.P) != null) {
            removeView(linearLayout);
            this.P = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.L = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.K = charSequence;
        f();
        s0.r(this, charSequence);
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.U) {
            requestLayout();
        }
        this.U = z11;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i11) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37402d, i11, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = jh.h.k(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.S = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.T = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f850e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.V = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
