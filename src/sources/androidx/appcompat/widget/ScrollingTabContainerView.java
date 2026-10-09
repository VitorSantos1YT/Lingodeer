package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.x;
import com.lingodeer.R;
import qp.m4;
import r.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r.g f960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatSpinner f962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f965f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f966t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class TabView extends LinearLayout {
        public TabView(Context context) {
            super(context, null, R.attr.actionBarTabStyle);
            m4 m4VarK = m4.k(context, null, new int[]{android.R.attr.background}, R.attr.actionBarTabStyle);
            if (((TypedArray) m4VarK.f48061c).hasValue(0)) {
                setBackgroundDrawable(m4VarK.g(0));
            }
            m4VarK.l();
            setGravity(8388627);
            throw null;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.f964e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = scrollingTabContainerView.f964e;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z11) {
            boolean z12 = isSelected() != z11;
            super.setSelected(z11);
            if (z12 && z11) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new x(this, 1);
        setHorizontalScrollBarEnabled(false);
        p.a aVarA = p.a.a(context);
        setContentHeight(aVarA.c());
        this.f965f = aVarA.f46178b.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new k1(-2, -1));
        this.f961b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f962c;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f962c);
        addView(this.f961b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f962c.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r.g gVar = this.f960a;
        if (gVar != null) {
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p.a aVarA = p.a.a(getContext());
        setContentHeight(aVarA.c());
        this.f965f = aVarA.f46178b.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r.g gVar = this.f960a;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
        ((TabView) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        LinearLayoutCompat linearLayoutCompat = this.f961b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f964e = -1;
        } else {
            if (childCount > 2) {
                this.f964e = (int) (View.MeasureSpec.getSize(i11) * 0.4f);
            } else {
                this.f964e = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f964e = Math.min(this.f964e, this.f965f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f966t, 1073741824);
        if (z11 || !this.f963d) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                AppCompatSpinner appCompatSpinner = this.f962c;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f962c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new k1(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f962c = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f962c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f962c.getAdapter() == null) {
                        this.f962c.setAdapter((SpinnerAdapter) new j(this));
                    }
                    Runnable runnable = this.f960a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f960a = null;
                    }
                    this.f962c.setSelection(this.H);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z11 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.H);
    }

    public void setAllowCollapse(boolean z11) {
        this.f963d = z11;
    }

    public void setContentHeight(int i11) {
        this.f966t = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        this.H = i11;
        LinearLayoutCompat linearLayoutCompat = this.f961b;
        int childCount = linearLayoutCompat.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i12);
            boolean z11 = i12 == i11;
            childAt.setSelected(z11);
            if (z11) {
                View childAt2 = linearLayoutCompat.getChildAt(i11);
                Runnable runnable = this.f960a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                r.g gVar = new r.g(1, this, childAt2);
                this.f960a = gVar;
                post(gVar);
            }
            i12++;
        }
        AppCompatSpinner appCompatSpinner = this.f962c;
        if (appCompatSpinner == null || i11 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i11);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
