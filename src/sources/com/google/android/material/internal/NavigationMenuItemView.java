package com.google.android.material.internal;

import a5.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import fb.g0;
import q.n;
import q.w;
import q4.j;
import r.k1;
import z4.b;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements w {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f14670l0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f14671a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f14672b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f14673c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f14674d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final CheckedTextView f14675e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public FrameLayout f14676f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public n f14677g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ColorStateList f14678h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f14679i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Drawable f14680j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f14681k0;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f14676f0 == null) {
                this.f14676f0 = (FrameLayout) ((ViewStub) findViewById(com.lingodeer.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f14676f0.removeAllViews();
            this.f14676f0.addView(view);
        }
    }

    @Override // q.w
    public final void c(n nVar) {
        StateListDrawable stateListDrawable;
        this.f14677g0 = nVar;
        int i11 = nVar.f47290a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.lingodeer.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f14670l0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f47298e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.S);
        g0.C(this, nVar.T);
        n nVar2 = this.f14677g0;
        CharSequence charSequence = nVar2.f47298e;
        CheckedTextView checkedTextView = this.f14675e0;
        if (charSequence == null && nVar2.getIcon() == null && this.f14677g0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f14676f0;
            if (frameLayout != null) {
                k1 k1Var = (k1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) k1Var).width = -1;
                this.f14676f0.setLayoutParams(k1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f14676f0;
        if (frameLayout2 != null) {
            k1 k1Var2 = (k1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) k1Var2).width = -2;
            this.f14676f0.setLayoutParams(k1Var2);
        }
    }

    @Override // q.w
    public n getItemData() {
        return this.f14677g0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        n nVar = this.f14677g0;
        if (nVar != null && nVar.isCheckable() && this.f14677g0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14670l0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.f14673c0 != z11) {
            this.f14673c0 = z11;
            this.f14681k0.h(this.f14675e0, 2048);
        }
    }

    public void setChecked(boolean z11) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f14675e0;
        checkedTextView.setChecked(z11);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z11 && this.f14674d0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, getPaddingTop(), i11, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f14679i0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f14678h0);
            }
            int i11 = this.f14671a0;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.f14672b0) {
            if (this.f14680j0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = j.f47447a;
                Drawable drawable2 = resources.getDrawable(com.lingodeer.R.drawable.navigation_empty_icon, theme);
                this.f14680j0 = drawable2;
                if (drawable2 != null) {
                    int i12 = this.f14671a0;
                    drawable2.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.f14680j0;
        }
        this.f14675e0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.f14675e0.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(int i11) {
        this.f14671a0 = i11;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f14678h0 = colorStateList;
        this.f14679i0 = colorStateList != null;
        n nVar = this.f14677g0;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.f14675e0.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.f14672b0 = z11;
    }

    public void setTextAppearance(int i11) {
        this.f14675e0.setTextAppearance(i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14675e0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f14675e0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f14674d0 = true;
        b bVar = new b() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // z4.b
            public final void d(View view, g gVar) {
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                this.f58810a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f14673c0);
            }
        };
        this.f14681k0 = bVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.lingodeer.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.lingodeer.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.lingodeer.R.id.design_menu_item_text);
        this.f14675e0 = checkedTextView;
        s0.q(checkedTextView, bVar);
    }
}
