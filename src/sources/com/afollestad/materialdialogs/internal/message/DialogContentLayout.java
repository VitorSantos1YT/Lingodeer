package com.afollestad.materialdialogs.internal.message;

import a0.c0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.bumptech.glide.d;
import com.lingodeer.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import mz.j;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogContentLayout extends FrameLayout {
    public static final /* synthetic */ j[] H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f7425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f7426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f7428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogScrollView f7429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogRecyclerView f7430f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f7431t;

    static {
        r rVar = new r(c.NO_RECEIVER, z.a(DialogContentLayout.class).e(), "frameHorizontalMargin", "getFrameHorizontalMargin()I", 0);
        z.f38362a.getClass();
        H = new j[]{rVar};
    }

    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7428d = d.v(new c0(this, 28));
    }

    private final int getFrameHorizontalMargin() {
        j jVar = H[0];
        return ((Number) this.f7428d.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final void a(boolean z11) {
        if (this.f7429e == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) LayoutInflater.from(getContext()).inflate(R.layout.md_dialog_stub_scrollview, (ViewGroup) this, false);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            this.f7425a = (ViewGroup) childAt;
            if (!z11) {
                vc.c.f(dialogScrollView, 0, 0, 0, vc.c.a(dialogScrollView, R.dimen.md_dialog_frame_margin_vertical), 7);
            }
            this.f7429e = dialogScrollView;
            addView(dialogScrollView);
        }
    }

    public final View b(Integer num, View view, boolean z11, boolean z12, boolean z13) {
        if (this.f7431t != null) {
            throw new IllegalStateException("Custom view already set.");
        }
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (z11) {
            this.f7427c = false;
            a(z12);
            if (view == null) {
                if (num == null) {
                    m.l();
                    throw null;
                }
                view = LayoutInflater.from(getContext()).inflate(num.intValue(), this.f7425a, false);
            }
            View view2 = view;
            this.f7431t = view2;
            ViewGroup viewGroup2 = this.f7425a;
            if (viewGroup2 == null) {
                m.l();
                throw null;
            }
            if (view2 == null) {
                view2 = null;
            } else if (z13) {
                vc.c.f(view2, getFrameHorizontalMargin(), 0, getFrameHorizontalMargin(), 0, 10);
            }
            viewGroup2.addView(view2);
        } else {
            this.f7427c = z13;
            if (view == null) {
                if (num == null) {
                    m.l();
                    throw null;
                }
                view = LayoutInflater.from(getContext()).inflate(num.intValue(), (ViewGroup) this, false);
            }
            this.f7431t = view;
            addView(view);
        }
        View view3 = this.f7431t;
        if (view3 != null) {
            return view3;
        }
        m.l();
        throw null;
    }

    public final void c(int i11, int i12) {
        if (i11 != -1) {
            vc.c.f(getChildAt(0), 0, i11, 0, 0, 13);
        }
        if (i12 != -1) {
            vc.c.f(getChildAt(getChildCount() - 1), 0, 0, 0, i12, 7);
        }
    }

    public final View getCustomView() {
        return this.f7431t;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.f7430f;
    }

    public final DialogScrollView getScrollView() {
        return this.f7429e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth;
        int frameHorizontalMargin;
        int childCount = getChildCount();
        int i15 = 0;
        int i16 = 0;
        while (i15 < childCount) {
            View currentChild = getChildAt(i15);
            m.b(currentChild, "currentChild");
            int measuredHeight = currentChild.getMeasuredHeight() + i16;
            if (currentChild.equals(this.f7431t) && this.f7427c) {
                frameHorizontalMargin = getFrameHorizontalMargin();
                measuredWidth = getMeasuredWidth() - getFrameHorizontalMargin();
            } else {
                measuredWidth = getMeasuredWidth();
                frameHorizontalMargin = 0;
            }
            currentChild.layout(frameHorizontalMargin, i16, measuredWidth, measuredHeight);
            i15++;
            i16 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        DialogScrollView dialogScrollView = this.f7429e;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.f7429e;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i13 = size2 - measuredHeight;
        int childCount = this.f7429e != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i14 = i13 / childCount;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View currentChild = getChildAt(i15);
            m.b(currentChild, "currentChild");
            int id2 = currentChild.getId();
            DialogScrollView dialogScrollView3 = this.f7429e;
            if (dialogScrollView3 == null || id2 != dialogScrollView3.getId()) {
                currentChild.measure((currentChild.equals(this.f7431t) && this.f7427c) ? View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824) : View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                measuredHeight = currentChild.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(View view) {
        this.f7431t = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.f7430f = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.f7429e = dialogScrollView;
    }
}
