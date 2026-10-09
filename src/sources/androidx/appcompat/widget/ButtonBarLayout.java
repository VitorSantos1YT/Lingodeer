package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.lingodeer.R;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f938c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f938c = -1;
        int[] iArr = k.a.f37410l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        s0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f936a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f936a);
        }
    }

    private void setStacked(boolean z11) {
        if (this.f937b != z11) {
            if (!z11 || this.f936a) {
                this.f937b = z11;
                setOrientation(z11 ? 1 : 0);
                setGravity(z11 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z11 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec;
        boolean z11;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int paddingBottom = 0;
        if (this.f936a) {
            if (size > this.f938c && this.f937b) {
                setStacked(false);
            }
            this.f938c = size;
        }
        if (this.f937b || View.MeasureSpec.getMode(i11) != 1073741824) {
            iMakeMeasureSpec = i11;
            z11 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i12);
        if (this.f936a && !this.f937b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z11 = true;
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i13 = -1;
            if (i14 >= childCount) {
                i14 = -1;
                break;
            } else if (getChildAt(i14).getVisibility() == 0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f937b) {
                int childCount2 = getChildCount();
                for (int i15 = i14 + 1; i15 < childCount2; i15++) {
                    if (getChildAt(i15).getVisibility() == 0) {
                        i13 = i15;
                        break;
                    }
                }
                paddingBottom = i13 >= 0 ? getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = s0.f58893a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i12 == 0) {
                super.onMeasure(i11, i12);
            }
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.f936a != z11) {
            this.f936a = z11;
            if (!z11 && this.f937b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
