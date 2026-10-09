package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import ua.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f2724a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Paint f2725b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Rect f2726c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f2727d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f2728e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f2729f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f2730g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f2731h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f2732i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f2733j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f2734k0;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(float f5, int i11, boolean z11) {
        int height = getHeight();
        TextView textView = this.f2737c;
        int left = textView.getLeft();
        int i12 = this.f2724a0;
        int right = textView.getRight() + i12;
        int i13 = height - this.T;
        Rect rect = this.f2726c0;
        rect.set(left - i12, i13, right, height);
        super.c(f5, i11, z11);
        this.f2727d0 = (int) (Math.abs(f5 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i12, i13, textView.getRight() + i12, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f2728e0;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.W);
    }

    public int getTabIndicatorColor() {
        return this.S;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f2737c;
        int left = textView.getLeft();
        int i11 = this.f2724a0;
        int i12 = left - i11;
        int right = textView.getRight() + i11;
        int i13 = height - this.T;
        int i14 = (this.f2727d0 << 24) | (this.S & 16777215);
        Paint paint = this.f2725b0;
        paint.setColor(i14);
        float f5 = height;
        canvas.drawRect(i12, i13, right, f5, paint);
        if (this.f2728e0) {
            paint.setColor((this.S & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f2730g0, getWidth() - getPaddingRight(), f5, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f2731h0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.f2732i0 = x11;
            this.f2733j0 = y10;
            this.f2731h0 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f2737c;
            int left = textView.getLeft();
            int i11 = this.f2724a0;
            if (x11 < left - i11) {
                ViewPager viewPager = this.f2735a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x11 > textView.getRight() + i11) {
                ViewPager viewPager2 = this.f2735a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x11 - this.f2732i0);
            float f5 = this.f2734k0;
            if (fAbs > f5 || Math.abs(y10 - this.f2733j0) > f5) {
                this.f2731h0 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        super.setBackgroundColor(i11);
        if (this.f2729f0) {
            return;
        }
        this.f2728e0 = (i11 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2729f0) {
            return;
        }
        this.f2728e0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        if (this.f2729f0) {
            return;
        }
        this.f2728e0 = i11 == 0;
    }

    public void setDrawFullUnderline(boolean z11) {
        this.f2728e0 = z11;
        this.f2729f0 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
        int i15 = this.U;
        if (i14 < i15) {
            i14 = i15;
        }
        super.setPadding(i11, i12, i13, i14);
    }

    public void setTabIndicatorColor(int i11) {
        this.S = i11;
        this.f2725b0.setColor(i11);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i11) {
        setTabIndicatorColor(getContext().getColor(i11));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i11) {
        int i12 = this.V;
        if (i11 < i12) {
            i11 = i12;
        }
        super.setTextSpacing(i11);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f2725b0 = paint;
        this.f2726c0 = new Rect();
        this.f2727d0 = 255;
        this.f2728e0 = false;
        this.f2729f0 = false;
        int i11 = this.P;
        this.S = i11;
        paint.setColor(i11);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.T = (int) ((3.0f * f5) + 0.5f);
        this.U = (int) ((6.0f * f5) + 0.5f);
        this.V = (int) (64.0f * f5);
        this.f2724a0 = (int) ((16.0f * f5) + 0.5f);
        this.f2730g0 = (int) ((1.0f * f5) + 0.5f);
        this.W = (int) ((f5 * 32.0f) + 0.5f);
        this.f2734k0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f2736b.setFocusable(true);
        this.f2736b.setOnClickListener(new b(this, 0));
        this.f2738d.setFocusable(true);
        this.f2738d.setOnClickListener(new b(this, 1));
        if (getBackground() == null) {
            this.f2728e0 = true;
        }
    }
}
