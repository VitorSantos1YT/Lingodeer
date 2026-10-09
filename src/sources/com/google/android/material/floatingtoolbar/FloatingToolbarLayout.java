package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import java.util.WeakHashMap;
import qp.m4;
import r4.d;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FloatingToolbarLayout extends FrameLayout {
    public int H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f14576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14577f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14578t;

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.f14576e;
        if (rect == null) {
            return;
        }
        int i11 = rect.left + (this.f14572a ? this.H : 0);
        int i12 = rect.right + (this.f14574c ? this.K : 0);
        int i13 = rect.top + (this.f14573b ? this.f14578t : 0);
        int i14 = rect.bottom + (this.f14575d ? this.f14577f : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i14 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) {
            return;
        }
        marginLayoutParams.bottomMargin = i14;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i12;
        marginLayoutParams.topMargin = i13;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.f14576e = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f14576e = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        a();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_FloatingToolbar), attributeSet, i11);
        Context context2 = getContext();
        m4 m4VarE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.f13762u, i11, R.style.Widget_Material3_FloatingToolbar, new int[0]);
        TypedArray typedArray = (TypedArray) m4VarE.f48061c;
        if (typedArray.hasValue(0)) {
            int color = typedArray.getColor(0, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.d(context2, attributeSet, i11, R.style.Widget_Material3_FloatingToolbar).a());
            materialShapeDrawable.r(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.f14572a = typedArray.getBoolean(2, true);
        this.f14573b = typedArray.getBoolean(4, false);
        this.f14574c = typedArray.getBoolean(3, true);
        this.f14575d = typedArray.getBoolean(1, true);
        u uVar = new u() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // z4.u
            public final v1 e(View view, v1 v1Var) {
                FloatingToolbarLayout floatingToolbarLayout = FloatingToolbarLayout.this;
                if (!floatingToolbarLayout.f14572a && !floatingToolbarLayout.f14574c && !floatingToolbarLayout.f14573b && !floatingToolbarLayout.f14575d) {
                    return v1Var;
                }
                d dVarG = v1Var.f58905a.g(655);
                floatingToolbarLayout.f14577f = dVarG.f48796d;
                floatingToolbarLayout.f14578t = dVarG.f48794b;
                floatingToolbarLayout.K = dVarG.f48795c;
                floatingToolbarLayout.H = dVarG.f48793a;
                floatingToolbarLayout.a();
                return v1Var;
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(this, uVar);
        m4VarE.l();
    }
}
