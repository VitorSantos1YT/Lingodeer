package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f851f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f852t;

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f846a = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f847b = context;
        } else {
            this.f847b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, i11 - view.getMeasuredWidth());
    }

    public static int d(int i11, int i12, int i13, View view, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = ((i13 - measuredHeight) / 2) + i12;
        if (z11) {
            view.layout(i11 - measuredWidth, i14, i11, measuredHeight + i14);
        } else {
            view.layout(i11, i14, i11 + measuredWidth, measuredHeight + i14);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, k.a.f37399a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f849d;
        if (cVar != null) {
            cVar.S = p.a.a(cVar.f1069b).b();
            q.l lVar = cVar.f1070c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f852t = false;
        }
        if (!this.f852t) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f852t = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f852t = false;
        return true;
    }

    public abstract void setContentHeight(int i11);

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            w0 w0Var = this.f851f;
            if (w0Var != null) {
                w0Var.b();
            }
            super.setVisibility(i11);
        }
    }
}
