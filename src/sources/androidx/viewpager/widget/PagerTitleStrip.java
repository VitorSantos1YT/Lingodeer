package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ua.a;
import ua.c;
import ua.d;
import ua.f;
import ua.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@f
public class PagerTitleStrip extends ViewGroup {
    public static final int[] Q = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] R = {R.attr.textAllCaps};
    public int H;
    public boolean K;
    public boolean L;
    public final c M;
    public WeakReference N;
    public int O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f2735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f2736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f2737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f2738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2740f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2741t;

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        d dVar = new d();
        dVar.f52886a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(dVar);
    }

    public final void a(a aVar, a aVar2) {
        c cVar = this.M;
        if (aVar != null) {
            aVar.f52881a.unregisterObserver(cVar);
            this.N = null;
        }
        if (aVar2 != null) {
            aVar2.f52881a.registerObserver(cVar);
            this.N = new WeakReference(aVar2);
        }
        ViewPager viewPager = this.f2735a;
        if (viewPager != null) {
            this.f2739e = -1;
            this.f2740f = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public final void b(int i11, a aVar) {
        if (aVar != null) {
            aVar.c();
        }
        this.K = true;
        TextView textView = this.f2736b;
        textView.setText((CharSequence) null);
        TextView textView2 = this.f2737c;
        textView2.setText((CharSequence) null);
        int i12 = i11 + 1;
        TextView textView3 = this.f2738d;
        textView3.setText((CharSequence) null);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f2739e = i11;
        if (!this.L) {
            c(this.f2740f, i11, false);
        }
        this.K = false;
    }

    public void c(float f5, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != this.f2739e) {
            b(i11, this.f2735a.getAdapter());
        } else if (!z11 && f5 == this.f2740f) {
            return;
        }
        this.L = true;
        TextView textView = this.f2736b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f2737c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f2738d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f11 = f5 + 0.5f;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (i18 * f11))) - i16;
        int i21 = measuredWidth2 + i19;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i22 = iMax - baseline;
        int i23 = iMax - baseline2;
        int i24 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i22, textView2.getMeasuredHeight() + i23), textView3.getMeasuredHeight() + i24);
        int i25 = this.H & 112;
        if (i25 != 16) {
            if (i25 != 80) {
                i13 = i22 + paddingTop;
                i14 = paddingTop + i23;
                i15 = paddingTop + i24;
            } else {
                i12 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i19, i14, i21, textView2.getMeasuredHeight() + i14);
            int iMin = Math.min(paddingLeft, (i19 - this.f2741t) - measuredWidth);
            textView.layout(iMin, i13, iMin + measuredWidth, textView.getMeasuredHeight() + i13);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f2741t);
            textView3.layout(iMax3, i15, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i15);
            this.f2740f = f5;
            this.L = false;
        }
        i12 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i13 = i22 + i12;
        i14 = i12 + i23;
        i15 = i12 + i24;
        textView2.layout(i19, i14, i21, textView2.getMeasuredHeight() + i14);
        int iMin2 = Math.min(paddingLeft, (i19 - this.f2741t) - measuredWidth);
        textView.layout(iMin2, i13, iMin2 + measuredWidth, textView.getMeasuredHeight() + i13);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f2741t);
        textView3.layout(iMax4, i15, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i15);
        this.f2740f = f5;
        this.L = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f2741t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        a adapter = viewPager.getAdapter();
        c cVar = this.M;
        viewPager.f2773y0 = cVar;
        if (viewPager.f2774z0 == null) {
            viewPager.f2774z0 = new ArrayList();
        }
        viewPager.f2774z0.add(cVar);
        this.f2735a = viewPager;
        WeakReference weakReference = this.N;
        a(weakReference != null ? (a) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f2735a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f2735a;
            j jVar = viewPager2.f2773y0;
            viewPager2.f2773y0 = null;
            ArrayList arrayList = viewPager2.f2774z0;
            if (arrayList != null) {
                arrayList.remove(this.M);
            }
            this.f2735a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f2735a != null) {
            float f5 = this.f2740f;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 = 0.0f;
            }
            c(f5, this.f2739e, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMax;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i11);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, (int) (size * 0.2f), -2);
        this.f2736b.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f2737c;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f2738d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i12) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i12);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i12, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i11) {
        this.H = i11;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f5) {
        int i11 = ((int) (f5 * 255.0f)) & 255;
        this.O = i11;
        int i12 = (i11 << 24) | (this.P & 16777215);
        this.f2736b.setTextColor(i12);
        this.f2738d.setTextColor(i12);
    }

    public void setTextColor(int i11) {
        this.P = i11;
        this.f2737c.setTextColor(i11);
        int i12 = (this.O << 24) | (this.P & 16777215);
        this.f2736b.setTextColor(i12);
        this.f2738d.setTextColor(i12);
    }

    public void setTextSpacing(int i11) {
        this.f2741t = i11;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2739e = -1;
        this.f2740f = -1.0f;
        this.M = new c(this);
        TextView textView = new TextView(context);
        this.f2736b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f2737c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f2738d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        boolean z11 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f5 = dimensionPixelSize;
            textView.setTextSize(0, f5);
            textView2.setTextSize(0, f5);
            textView3.setTextSize(0, f5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.H = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.P = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R);
            z11 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z11) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f2741t = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
