package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public final boolean H;
    public boolean K;
    public final int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScrollingTabContainerView f854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f858f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f859t;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f857e;
        if (drawable != null && drawable.isStateful()) {
            this.f857e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f858f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f858f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f859t;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f859t.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f854b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f857e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f858f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f859t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f855c = findViewById(R.id.action_bar);
        this.f856d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f853a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        ScrollingTabContainerView scrollingTabContainerView = this.f854b;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i15 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i11, measuredHeight2 - i15, i13, measuredHeight - i15);
        }
        if (this.H) {
            Drawable drawable2 = this.f859t;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = z13;
            }
        } else {
            if (this.f857e != null) {
                if (this.f855c.getVisibility() == 0) {
                    this.f857e.setBounds(this.f855c.getLeft(), this.f855c.getTop(), this.f855c.getRight(), this.f855c.getBottom());
                } else {
                    View view = this.f856d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f857e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f857e.setBounds(this.f856d.getLeft(), this.f856d.getTop(), this.f856d.getRight(), this.f856d.getBottom());
                    }
                }
                z13 = true;
            }
            this.K = z14;
            if (!z14 || (drawable = this.f858f) == null) {
                z12 = z13;
            } else {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iA;
        int i13;
        if (this.f855c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.L) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f855c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        ScrollingTabContainerView scrollingTabContainerView = this.f854b;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f855c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f856d;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f856d);
        } else {
            iA = a(this.f855c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f854b) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f857e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f857e);
        }
        this.f857e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f855c;
            if (view != null) {
                this.f857e.setBounds(view.getLeft(), this.f855c.getTop(), this.f855c.getRight(), this.f855c.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.H ? !(this.f857e != null || this.f858f != null) : this.f859t == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f859t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f859t);
        }
        this.f859t = drawable;
        boolean z11 = this.H;
        boolean z12 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z11 && (drawable2 = this.f859t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z11 ? !(this.f857e != null || this.f858f != null) : this.f859t == null) {
            z12 = true;
        }
        setWillNotDraw(z12);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f858f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f858f);
        }
        this.f858f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.K && (drawable2 = this.f858f) != null) {
                drawable2.setBounds(this.f854b.getLeft(), this.f854b.getTop(), this.f854b.getRight(), this.f854b.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.H ? !(this.f857e != null || this.f858f != null) : this.f859t == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f854b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f854b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f853a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f857e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f858f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f859t;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f857e;
        boolean z11 = this.H;
        if (drawable == drawable2 && !z11) {
            return true;
        }
        if (drawable == this.f858f && this.K) {
            return true;
        }
        return (drawable == this.f859t && z11) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new r.a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37399a);
        boolean z11 = false;
        this.f857e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f858f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.H = true;
            this.f859t = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.H ? !(this.f857e != null || this.f858f != null) : this.f859t == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }
}
