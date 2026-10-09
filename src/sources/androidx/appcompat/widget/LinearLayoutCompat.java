package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.yalantis.ucrop.view.CropImageView;
import qp.m4;
import r.b3;
import r.k1;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean H;
    public int[] K;
    public int[] L;
    public Drawable M;
    public int N;
    public int O;
    public int P;
    public int Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f958f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f959t;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k1;
    }

    public final void d(Canvas canvas, int i11) {
        this.M.setBounds(getPaddingLeft() + this.Q, i11, (getWidth() - getPaddingRight()) - this.Q, this.O + i11);
        this.M.draw(canvas);
    }

    public final void e(Canvas canvas, int i11) {
        this.M.setBounds(i11, getPaddingTop() + this.Q, this.N + i11, (getHeight() - getPaddingBottom()) - this.Q);
        this.M.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k1 generateDefaultLayoutParams() {
        int i11 = this.f956d;
        if (i11 == 0) {
            return new k1(-2, -2);
        }
        if (i11 == 1) {
            return new k1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k1 generateLayoutParams(AttributeSet attributeSet) {
        return new k1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.f954b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.f954b;
        if (childCount <= i12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f954b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f955c;
        if (this.f956d == 1 && (i11 = this.f957e & 112) != 48) {
            if (i11 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f958f) / 2;
            } else if (i11 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f958f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((k1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f954b;
    }

    public Drawable getDividerDrawable() {
        return this.M;
    }

    public int getDividerPadding() {
        return this.Q;
    }

    public int getDividerWidth() {
        return this.N;
    }

    public int getGravity() {
        return this.f957e;
    }

    public int getOrientation() {
        return this.f956d;
    }

    public int getShowDividers() {
        return this.P;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f959t;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof k1) {
            return new k1((k1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k1((ViewGroup.MarginLayoutParams) layoutParams) : new k1(layoutParams);
    }

    public final boolean i(int i11) {
        if (i11 == 0) {
            return (this.P & 1) != 0;
        }
        if (i11 == getChildCount()) {
            return (this.P & 4) != 0;
        }
        if ((this.P & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i11;
        int bottom;
        if (this.M == null) {
            return;
        }
        int i12 = 0;
        if (this.f956d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i12 < virtualChildCount) {
                View childAt = getChildAt(i12);
                if (childAt != null && childAt.getVisibility() != 8 && i(i12)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((k1) childAt.getLayoutParams())).topMargin) - this.O);
                }
                i12++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.O;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((k1) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z11 = b3.f48531a;
        boolean z12 = getLayoutDirection() == 1;
        while (i12 < virtualChildCount2) {
            View childAt3 = getChildAt(i12);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i12)) {
                k1 k1Var = (k1) childAt3.getLayoutParams();
                e(canvas, z12 ? childAt3.getRight() + ((LinearLayout.LayoutParams) k1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) k1Var).leftMargin) - this.N);
            }
            i12++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                k1 k1Var2 = (k1) childAt4.getLayoutParams();
                if (z12) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) k1Var2).leftMargin;
                    i11 = this.N;
                    right = left - i11;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) k1Var2).rightMargin;
                }
            } else if (z12) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.N;
                right = left - i11;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int i15;
        int i16;
        int i17;
        int i18;
        int baseline;
        int i19;
        int i21;
        int i22;
        int measuredHeight;
        int i23;
        int paddingTop;
        int i24;
        int i25;
        int i26;
        int i27 = 8;
        char c11 = 2;
        if (this.f956d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i28 = i13 - i11;
            int paddingRight = i28 - getPaddingRight();
            int paddingRight2 = (i28 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i29 = this.f957e;
            int i30 = i29 & 112;
            int i31 = 8388615 & i29;
            if (i30 != 16) {
                paddingTop = i30 != 80 ? getPaddingTop() : ((getPaddingTop() + i14) - i12) - this.f958f;
            } else {
                paddingTop = getPaddingTop() + (((i14 - i12) - this.f958f) / 2);
            }
            int i32 = 0;
            while (i32 < virtualChildCount) {
                View childAt = getChildAt(i32);
                if (childAt != null && childAt.getVisibility() != i27) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    k1 k1Var = (k1) childAt.getLayoutParams();
                    int i33 = ((LinearLayout.LayoutParams) k1Var).gravity;
                    if (i33 < 0) {
                        i33 = i31;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i33, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i26 = ((LinearLayout.LayoutParams) k1Var).leftMargin + paddingLeft2;
                        } else {
                            i24 = paddingRight - measuredWidth;
                            i25 = ((LinearLayout.LayoutParams) k1Var).rightMargin;
                        }
                        if (i(i32)) {
                            paddingTop += this.O;
                        }
                        int i34 = paddingTop + ((LinearLayout.LayoutParams) k1Var).topMargin;
                        childAt.layout(i26, i34, measuredWidth + i26, i34 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) k1Var).bottomMargin + i34;
                    } else {
                        i24 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) k1Var).leftMargin;
                        i25 = ((LinearLayout.LayoutParams) k1Var).rightMargin;
                    }
                    i26 = i24 - i25;
                    if (i(i32)) {
                        paddingTop += this.O;
                    }
                    int i35 = paddingTop + ((LinearLayout.LayoutParams) k1Var).topMargin;
                    childAt.layout(i26, i35, measuredWidth + i26, i35 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) k1Var).bottomMargin + i35;
                }
                i32++;
                c11 = c11;
                i27 = 8;
            }
            return;
        }
        boolean z12 = b3.f48531a;
        boolean z13 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i36 = i14 - i12;
        int paddingBottom = i36 - getPaddingBottom();
        int paddingBottom2 = (i36 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i37 = this.f957e;
        int i38 = 8388615 & i37;
        int i39 = i37 & 112;
        boolean z14 = this.f953a;
        int[] iArr = this.K;
        int[] iArr2 = this.L;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i38, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i13) - i11) - this.f958f;
        } else {
            paddingLeft = getPaddingLeft() + (((i13 - i11) - this.f958f) / 2);
        }
        if (z13) {
            i16 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i15 = 1;
            i16 = 0;
        }
        int i40 = 0;
        while (i40 < virtualChildCount2) {
            int i41 = (i15 * i40) + i16;
            View childAt2 = getChildAt(i41);
            if (childAt2 == null) {
                i17 = i16;
            } else {
                i17 = i16;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    k1 k1Var2 = (k1) childAt2.getLayoutParams();
                    int i42 = paddingLeft;
                    if (z14) {
                        i18 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) k1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) k1Var2).gravity;
                        if (i19 < 0) {
                            i19 = i39;
                        }
                        i21 = i19 & 112;
                        if (i21 != 16) {
                            if (i21 != 48) {
                                i22 = i18 + ((LinearLayout.LayoutParams) k1Var2).topMargin;
                                if (baseline != -1) {
                                    i22 = (iArr[1] - baseline) + i22;
                                }
                            } else if (i21 != 80) {
                                i22 = i18;
                            } else {
                                i22 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) k1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i41)) {
                                i23 = i42 + this.N;
                            } else {
                                i23 = i42;
                            }
                            int i43 = i23 + ((LinearLayout.LayoutParams) k1Var2).leftMargin;
                            childAt2.layout(i43, i22, i43 + measuredWidth2, i22 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) k1Var2).rightMargin + i43;
                        } else {
                            i22 = ((paddingBottom2 - measuredHeight3) / 2) + i18 + ((LinearLayout.LayoutParams) k1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) k1Var2).bottomMargin;
                        }
                        i22 -= measuredHeight;
                        if (i(i41)) {
                            i23 = i42 + this.N;
                        } else {
                            i23 = i42;
                        }
                        int i44 = i23 + ((LinearLayout.LayoutParams) k1Var2).leftMargin;
                        childAt2.layout(i44, i22, i44 + measuredWidth2, i22 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) k1Var2).rightMargin + i44;
                    } else {
                        i18 = paddingTop2;
                    }
                    i19 = ((LinearLayout.LayoutParams) k1Var2).gravity;
                    if (i19 < 0) {
                        i19 = i39;
                    }
                    i21 = i19 & 112;
                    if (i21 != 16) {
                        if (i21 != 48) {
                            i22 = i18 + ((LinearLayout.LayoutParams) k1Var2).topMargin;
                            if (baseline != -1) {
                                i22 = (iArr[1] - baseline) + i22;
                            }
                        } else if (i21 != 80) {
                            i22 = i18;
                        } else {
                            i22 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) k1Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i41)) {
                            i23 = i42 + this.N;
                        } else {
                            i23 = i42;
                        }
                        int i45 = i23 + ((LinearLayout.LayoutParams) k1Var2).leftMargin;
                        childAt2.layout(i45, i22, i45 + measuredWidth2, i22 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) k1Var2).rightMargin + i45;
                    } else {
                        i22 = ((paddingBottom2 - measuredHeight3) / 2) + i18 + ((LinearLayout.LayoutParams) k1Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) k1Var2).bottomMargin;
                    }
                    i22 -= measuredHeight;
                    if (i(i41)) {
                        i23 = i42 + this.N;
                    } else {
                        i23 = i42;
                    }
                    int i46 = i23 + ((LinearLayout.LayoutParams) k1Var2).leftMargin;
                    childAt2.layout(i46, i22, i46 + measuredWidth2, i22 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) k1Var2).rightMargin + i46;
                }
                i40++;
                i16 = i17;
                paddingTop2 = i18;
            }
            i18 = paddingTop2;
            i40++;
            i16 = i17;
            paddingTop2 = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0501  */
    /* JADX WARN: Code duplicated, block: B:235:0x0505  */
    /* JADX WARN: Code duplicated, block: B:237:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x0536  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:250:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:366:0x079c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int iMax;
        int i16;
        int baseline;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i21;
        boolean z11;
        boolean z12;
        k1 k1Var;
        View view;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        boolean z13;
        int i25;
        int measuredHeight;
        boolean z14;
        boolean z15;
        int iMax2;
        int i26;
        int baseline2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z16;
        int i32;
        int i33;
        int i34;
        View view2;
        boolean z17;
        LinearLayoutCompat linearLayoutCompat = this;
        int i35 = -2;
        int iMax3 = 0;
        int i36 = 1073741824;
        int i37 = 8;
        if (linearLayoutCompat.f956d == 1) {
            linearLayoutCompat.f958f = 0;
            int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int i38 = linearLayoutCompat.f954b;
            boolean z18 = linearLayoutCompat.H;
            int i39 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z19 = false;
            int i40 = 0;
            boolean z20 = false;
            boolean z21 = true;
            float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            int iMax6 = 0;
            while (i39 < virtualChildCount) {
                int i41 = mode;
                View childAt = linearLayoutCompat.getChildAt(i39);
                if (childAt == null) {
                    linearLayoutCompat.f958f = linearLayoutCompat.f958f;
                } else {
                    if (childAt.getVisibility() != i37) {
                        if (linearLayoutCompat.i(i39)) {
                            linearLayoutCompat.f958f += linearLayoutCompat.O;
                        }
                        k1 k1Var2 = (k1) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) k1Var2).weight;
                        f5 += f11;
                        if (mode2 == i36 && ((LinearLayout.LayoutParams) k1Var2).height == 0 && f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i42 = linearLayoutCompat.f958f;
                            linearLayoutCompat.f958f = Math.max(i42, ((LinearLayout.LayoutParams) k1Var2).topMargin + i42 + ((LinearLayout.LayoutParams) k1Var2).bottomMargin);
                            view2 = childAt;
                            i31 = mode2;
                            i32 = i38;
                            z16 = z18;
                            i33 = i39;
                            z19 = true;
                            i34 = i41;
                        } else {
                            if (((LinearLayout.LayoutParams) k1Var2).height != 0 || f11 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                i30 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) k1Var2).height = i35;
                                i30 = 0;
                            }
                            i31 = mode2;
                            z16 = z18;
                            i32 = i38;
                            i33 = i39;
                            i34 = i41;
                            linearLayoutCompat.measureChildWithMargins(childAt, i11, 0, i12, f5 == CropImageView.DEFAULT_ASPECT_RATIO ? linearLayoutCompat.f958f : 0);
                            if (i30 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) k1Var2).height = i30;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i43 = linearLayoutCompat.f958f;
                            view2 = childAt;
                            linearLayoutCompat.f958f = Math.max(i43, i43 + measuredHeight2 + ((LinearLayout.LayoutParams) k1Var2).topMargin + ((LinearLayout.LayoutParams) k1Var2).bottomMargin);
                            if (z16) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i32 >= 0 && i32 == i33 + 1) {
                            linearLayoutCompat.f955c = linearLayoutCompat.f958f;
                        }
                        if (i33 < i32 && ((LinearLayout.LayoutParams) k1Var2).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i34 == 1073741824 || ((LinearLayout.LayoutParams) k1Var2).width != -1) {
                            z17 = false;
                        } else {
                            z17 = true;
                            z20 = true;
                        }
                        int i44 = ((LinearLayout.LayoutParams) k1Var2).leftMargin + ((LinearLayout.LayoutParams) k1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z22 = z17;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i40, measuredState);
                        if (z21) {
                            i40 = iCombineMeasuredStates;
                            boolean z23 = ((LinearLayout.LayoutParams) k1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) k1Var2).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                                if (!z22) {
                                    i44 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i44);
                            } else {
                                if (!z22) {
                                    i44 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i44);
                            }
                            z21 = z23;
                        } else {
                            i40 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) k1Var2).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            if (!z22) {
                                i44 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i44);
                        } else {
                            if (!z22) {
                                i44 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i44);
                        }
                        z21 = z23;
                    }
                    i39 = i33 + 1;
                    i38 = i32;
                    mode = i34;
                    z18 = z16;
                    mode2 = i31;
                    i35 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                }
                i31 = mode2;
                i32 = i38;
                z16 = z18;
                i33 = i39;
                i34 = i41;
                i39 = i33 + 1;
                i38 = i32;
                mode = i34;
                z18 = z16;
                mode2 = i31;
                i35 = -2;
                i36 = 1073741824;
                i37 = 8;
            }
            int i45 = mode;
            int i46 = mode2;
            boolean z24 = z18;
            int i47 = i40;
            int i48 = i12;
            if (linearLayoutCompat.f958f > 0 && linearLayoutCompat.i(virtualChildCount)) {
                linearLayoutCompat.f958f += linearLayoutCompat.O;
            }
            if (z24 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                linearLayoutCompat.f958f = 0;
                for (int i49 = 0; i49 < virtualChildCount; i49++) {
                    View childAt2 = linearLayoutCompat.getChildAt(i49);
                    if (childAt2 == null) {
                        linearLayoutCompat.f958f = linearLayoutCompat.f958f;
                    } else if (childAt2.getVisibility() != 8) {
                        k1 k1Var3 = (k1) childAt2.getLayoutParams();
                        int i50 = linearLayoutCompat.f958f;
                        linearLayoutCompat.f958f = Math.max(i50, i50 + iMax6 + ((LinearLayout.LayoutParams) k1Var3).topMargin + ((LinearLayout.LayoutParams) k1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f958f;
            linearLayoutCompat.f958f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i48, 0);
            int i51 = (iResolveSizeAndState & 16777215) - linearLayoutCompat.f958f;
            if (z19 || (i51 != 0 && f5 > CropImageView.DEFAULT_ASPECT_RATIO)) {
                float f12 = linearLayoutCompat.f959t;
                if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = f12;
                }
                linearLayoutCompat.f958f = 0;
                int iCombineMeasuredStates2 = i47;
                int i52 = 0;
                while (i52 < virtualChildCount) {
                    View childAt3 = linearLayoutCompat.getChildAt(i52);
                    if (childAt3.getVisibility() == 8) {
                        i52 = i52;
                    } else {
                        k1 k1Var4 = (k1) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) k1Var4).weight;
                        if (f13 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            int i53 = (int) ((i51 * f13) / f5);
                            f5 -= f13;
                            i51 -= i53;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) k1Var4).leftMargin + ((LinearLayout.LayoutParams) k1Var4).rightMargin, ((LinearLayout.LayoutParams) k1Var4).width);
                            if (((LinearLayout.LayoutParams) k1Var4).height == 0) {
                                i29 = 1073741824;
                                if (i46 == 1073741824) {
                                    if (i53 <= 0) {
                                        i53 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i29 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i53;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i29));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i54 = ((LinearLayout.LayoutParams) k1Var4).leftMargin + ((LinearLayout.LayoutParams) k1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i54;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i45 != 1073741824) {
                            i28 = -1;
                            if (((LinearLayout.LayoutParams) k1Var4).width == -1) {
                                measuredWidth2 = i54;
                            }
                        } else {
                            i28 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z25 = z21 && ((LinearLayout.LayoutParams) k1Var4).width == i28;
                        int i55 = linearLayoutCompat.f958f;
                        linearLayoutCompat.f958f = Math.max(i55, childAt3.getMeasuredHeight() + i55 + ((LinearLayout.LayoutParams) k1Var4).topMargin + ((LinearLayout.LayoutParams) k1Var4).bottomMargin);
                        z21 = z25;
                    }
                    i52++;
                }
                linearLayoutCompat.f958f = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f958f;
                i47 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z24 && i46 != 1073741824) {
                    for (int i56 = 0; i56 < virtualChildCount; i56++) {
                        View childAt4 = linearLayoutCompat.getChildAt(i56);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((k1) childAt4.getLayoutParams())).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z21 || i45 == 1073741824) {
                iMax4 = iMax3;
            }
            linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax4, linearLayoutCompat.getSuggestedMinimumWidth()), i11, i47), iResolveSizeAndState);
            if (z20) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt5 = linearLayoutCompat.getChildAt(i57);
                    if (childAt5.getVisibility() != 8) {
                        k1 k1Var5 = (k1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) k1Var5).width == -1) {
                            int i58 = ((LinearLayout.LayoutParams) k1Var5).height;
                            ((LinearLayout.LayoutParams) k1Var5).height = childAt5.getMeasuredHeight();
                            linearLayoutCompat.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i48, 0);
                            ((LinearLayout.LayoutParams) k1Var5).height = i58;
                        }
                    }
                    i57++;
                    i48 = i12;
                }
                return;
            }
            return;
        }
        int i59 = i11;
        linearLayoutCompat.f958f = 0;
        int virtualChildCount2 = linearLayoutCompat.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i59);
        int mode4 = View.MeasureSpec.getMode(i12);
        if (linearLayoutCompat.K == null || linearLayoutCompat.L == null) {
            linearLayoutCompat.K = new int[4];
            linearLayoutCompat.L = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.K;
        int[] iArr4 = linearLayoutCompat.L;
        iArr3[3] = -1;
        char c11 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z26 = linearLayoutCompat.f953a;
        boolean z27 = linearLayoutCompat.H;
        boolean z28 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z29 = true;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z30 = false;
        boolean z31 = false;
        while (i60 < virtualChildCount2) {
            char c12 = c11;
            View childAt6 = linearLayoutCompat.getChildAt(i60);
            if (childAt6 == null) {
                linearLayoutCompat.f958f = linearLayoutCompat.f958f;
                i21 = i60;
                i26 = i62;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z26;
                z12 = z27;
            } else {
                int i63 = i61;
                if (childAt6.getVisibility() == 8) {
                    i59 = i11;
                    i21 = i60;
                    i26 = i62;
                    iArr = iArr4;
                    z11 = z26;
                    z12 = z27;
                    i61 = i63;
                    iArr2 = iArr3;
                } else {
                    if (linearLayoutCompat.i(i60)) {
                        linearLayoutCompat.f958f += linearLayoutCompat.N;
                    }
                    k1 k1Var6 = (k1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) k1Var6).weight;
                    f14 += f15;
                    int i64 = i60;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) k1Var6).width == 0 && f15 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (z28) {
                            linearLayoutCompat.f958f = ((LinearLayout.LayoutParams) k1Var6).leftMargin + ((LinearLayout.LayoutParams) k1Var6).rightMargin + linearLayoutCompat.f958f;
                        } else {
                            int i65 = linearLayoutCompat.f958f;
                            linearLayoutCompat.f958f = Math.max(i65, ((LinearLayout.LayoutParams) k1Var6).leftMargin + i65 + ((LinearLayout.LayoutParams) k1Var6).rightMargin);
                        }
                        if (z26) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z11 = z26;
                            z12 = z27;
                            i22 = i63;
                            i21 = i64;
                            k1Var = k1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i11;
                            i23 = i62;
                            i19 = iMax7;
                        } else {
                            view = childAt6;
                            z11 = z26;
                            z12 = z27;
                            z31 = true;
                            i22 = i63;
                            i21 = i64;
                            i24 = 1073741824;
                            k1Var = k1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i11;
                            i23 = i62;
                            i19 = iMax7;
                        }
                        if (mode4 == i24 && ((LinearLayout.LayoutParams) k1Var).height == -1) {
                            z13 = true;
                            z30 = true;
                        } else {
                            z13 = false;
                        }
                        i25 = ((LinearLayout.LayoutParams) k1Var).topMargin + ((LinearLayout.LayoutParams) k1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i25;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z11) {
                            baseline2 = view.getBaseline();
                            z14 = z13;
                            if (baseline2 != -1) {
                                i27 = ((LinearLayout.LayoutParams) k1Var).gravity;
                                if (i27 < 0) {
                                    i27 = linearLayoutCompat.f957e;
                                }
                                int i66 = (((i27 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i66] = Math.max(iArr2[i66], baseline2);
                                iArr[i66] = Math.max(iArr[i66], measuredHeight - baseline2);
                            }
                        } else {
                            z14 = z13;
                        }
                        int iMax9 = Math.max(i22, measuredHeight);
                        if (z29 || ((LinearLayout.LayoutParams) k1Var).height != -1) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (((LinearLayout.LayoutParams) k1Var).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                            if (!z14) {
                                i25 = measuredHeight;
                            }
                            iMax7 = Math.max(i19, i25);
                            iMax2 = i23;
                        } else {
                            if (!z14) {
                                i25 = measuredHeight;
                            }
                            iMax2 = Math.max(i23, i25);
                            iMax7 = i19;
                        }
                        int i67 = iMax2;
                        i61 = iMax9;
                        i26 = i67;
                        z29 = z15;
                    } else {
                        if (((LinearLayout.LayoutParams) k1Var6).width != 0 || f15 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            i18 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) k1Var6).width = -2;
                            i18 = 0;
                        }
                        iArr = iArr4;
                        i19 = iMax7;
                        i21 = i64;
                        z11 = z26;
                        z12 = z27;
                        int i68 = i18;
                        k1Var = k1Var6;
                        view = childAt6;
                        i22 = i63;
                        i59 = i11;
                        iArr2 = iArr3;
                        i23 = i62;
                        linearLayoutCompat.measureChildWithMargins(view, i59, f14 == CropImageView.DEFAULT_ASPECT_RATIO ? linearLayoutCompat.f958f : 0, i12, 0);
                        if (i68 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) k1Var).width = i68;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z28) {
                            linearLayoutCompat.f958f = ((LinearLayout.LayoutParams) k1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) k1Var).rightMargin + linearLayoutCompat.f958f;
                        } else {
                            int i69 = linearLayoutCompat.f958f;
                            linearLayoutCompat.f958f = Math.max(i69, i69 + measuredWidth3 + ((LinearLayout.LayoutParams) k1Var).leftMargin + ((LinearLayout.LayoutParams) k1Var).rightMargin);
                        }
                        if (z12) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i24 = 1073741824;
                    if (mode4 == i24) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    i25 = ((LinearLayout.LayoutParams) k1Var).topMargin + ((LinearLayout.LayoutParams) k1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i25;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z11) {
                        baseline2 = view.getBaseline();
                        z14 = z13;
                        if (baseline2 != -1) {
                            i27 = ((LinearLayout.LayoutParams) k1Var).gravity;
                            if (i27 < 0) {
                                i27 = linearLayoutCompat.f957e;
                            }
                            int i610 = (((i27 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i610] = Math.max(iArr2[i610], baseline2);
                            iArr[i610] = Math.max(iArr[i610], measuredHeight - baseline2);
                        }
                    } else {
                        z14 = z13;
                    }
                    int iMax10 = Math.max(i22, measuredHeight);
                    if (z29) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (((LinearLayout.LayoutParams) k1Var).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (!z14) {
                            i25 = measuredHeight;
                        }
                        iMax7 = Math.max(i19, i25);
                        iMax2 = i23;
                    } else {
                        if (!z14) {
                            i25 = measuredHeight;
                        }
                        iMax2 = Math.max(i23, i25);
                        iMax7 = i19;
                    }
                    int i611 = iMax2;
                    i61 = iMax10;
                    i26 = i611;
                    z29 = z15;
                }
            }
            i62 = i26;
            i60 = i21 + 1;
            c11 = c12;
            iArr3 = iArr2;
            iArr4 = iArr;
            z26 = z11;
            z27 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c13 = c11;
        boolean z32 = z26;
        boolean z33 = z27;
        int i70 = i61;
        int i71 = i62;
        int i72 = iMax7;
        if (linearLayoutCompat.f958f > 0 && linearLayoutCompat.i(virtualChildCount2)) {
            linearLayoutCompat.f958f += linearLayoutCompat.N;
        }
        int i73 = iArr5[1];
        int iMax11 = (i73 == -1 && iArr5[0] == -1 && iArr5[c13] == -1 && iArr5[3] == -1) ? i70 : Math.max(i70, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c13]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c13]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            linearLayoutCompat.f958f = 0;
            for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                View childAt7 = linearLayoutCompat.getChildAt(i74);
                if (childAt7 == null) {
                    linearLayoutCompat.f958f = linearLayoutCompat.f958f;
                } else if (childAt7.getVisibility() != 8) {
                    k1 k1Var7 = (k1) childAt7.getLayoutParams();
                    if (z28) {
                        linearLayoutCompat.f958f = ((LinearLayout.LayoutParams) k1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) k1Var7).rightMargin + linearLayoutCompat.f958f;
                    } else {
                        int i75 = linearLayoutCompat.f958f;
                        linearLayoutCompat.f958f = Math.max(i75, i75 + iMax8 + ((LinearLayout.LayoutParams) k1Var7).leftMargin + ((LinearLayout.LayoutParams) k1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f958f;
        linearLayoutCompat.f958f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i59, 0);
        int i76 = (iResolveSizeAndState2 & 16777215) - linearLayoutCompat.f958f;
        if (z31 || (i76 != 0 && f14 > CropImageView.DEFAULT_ASPECT_RATIO)) {
            float f16 = linearLayoutCompat.f959t;
            if (f16 > CropImageView.DEFAULT_ASPECT_RATIO) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c13] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c13] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.f958f = 0;
            iMax11 = -1;
            int i77 = 0;
            while (i77 < virtualChildCount2) {
                View childAt8 = linearLayoutCompat.getChildAt(i77);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    k1 k1Var8 = (k1) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) k1Var8).weight;
                    if (f17 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        int i78 = (int) ((i76 * f17) / f14);
                        f14 -= f17;
                        i76 -= i78;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) k1Var8).topMargin + ((LinearLayout.LayoutParams) k1Var8).bottomMargin, ((LinearLayout.LayoutParams) k1Var8).height);
                        if (((LinearLayout.LayoutParams) k1Var8).width == 0) {
                            i17 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i78 <= 0) {
                                    i78 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i17 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i78;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z28) {
                        linearLayoutCompat.f958f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) k1Var8).leftMargin + ((LinearLayout.LayoutParams) k1Var8).rightMargin + linearLayoutCompat.f958f;
                    } else {
                        int i79 = linearLayoutCompat.f958f;
                        linearLayoutCompat.f958f = Math.max(i79, childAt8.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) k1Var8).leftMargin + ((LinearLayout.LayoutParams) k1Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) k1Var8).height == -1;
                    int i80 = ((LinearLayout.LayoutParams) k1Var8).topMargin + ((LinearLayout.LayoutParams) k1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i80;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z34) {
                        i80 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i71, i80);
                    if (z29) {
                        i16 = -1;
                        boolean z35 = ((LinearLayout.LayoutParams) k1Var8).height == -1;
                        if (!z32 && (baseline = childAt8.getBaseline()) != i16) {
                            int i81 = ((LinearLayout.LayoutParams) k1Var8).gravity;
                            if (i81 < 0) {
                                i81 = linearLayoutCompat.f957e;
                            }
                            int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i82] = Math.max(iArr5[i82], baseline);
                            iArr6[i82] = Math.max(iArr6[i82], measuredHeight4 - baseline);
                        }
                        z29 = z35;
                        i71 = iMax12;
                    } else {
                        i16 = -1;
                    }
                    if (!z32) {
                    }
                    z29 = z35;
                    i71 = iMax12;
                }
                i77++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i13 = iResolveSizeAndState2;
            i14 = -16777216;
            linearLayoutCompat.f958f = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f958f;
            int i83 = iArr5[1];
            if (i83 == -1 && iArr5[0] == -1 && iArr5[c13] == -1 && iArr5[3] == -1) {
                i15 = 0;
            } else {
                i15 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c13]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i83, iArr5[c13]))));
            }
            iMax = i71;
        } else {
            iMax = Math.max(i71, i72);
            if (z33 && mode3 != 1073741824) {
                for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                    View childAt9 = linearLayoutCompat.getChildAt(i84);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((k1) childAt9.getLayoutParams())).weight > CropImageView.DEFAULT_ASPECT_RATIO) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i13 = iResolveSizeAndState2;
            i14 = -16777216;
            i15 = 0;
        }
        if (!z29 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        linearLayoutCompat.setMeasuredDimension(i13 | (iCombineMeasuredStates3 & i14), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax11, linearLayoutCompat.getSuggestedMinimumHeight()), i12, iCombineMeasuredStates3 << 16));
        if (z30) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i85 = i15;
            while (i85 < virtualChildCount2) {
                View childAt10 = linearLayoutCompat.getChildAt(i85);
                if (childAt10.getVisibility() != 8) {
                    k1 k1Var9 = (k1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) k1Var9).height == -1) {
                        int i86 = ((LinearLayout.LayoutParams) k1Var9).width;
                        ((LinearLayout.LayoutParams) k1Var9).width = childAt10.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt10, i59, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) k1Var9).width = i86;
                    }
                }
                i85++;
                linearLayoutCompat = this;
                i59 = i11;
            }
        }
    }

    public void setBaselineAligned(boolean z11) {
        this.f953a = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.f954b = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.M) {
            return;
        }
        this.M = drawable;
        if (drawable != null) {
            this.N = drawable.getIntrinsicWidth();
            this.O = drawable.getIntrinsicHeight();
        } else {
            this.N = 0;
            this.O = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.Q = i11;
    }

    public void setGravity(int i11) {
        if (this.f957e != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f957e = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.f957e;
        if ((8388615 & i13) != i12) {
            this.f957e = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.H = z11;
    }

    public void setOrientation(int i11) {
        if (this.f956d != i11) {
            this.f956d = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.P) {
            requestLayout();
        }
        this.P = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.f957e;
        if ((i13 & 112) != i12) {
            this.f957e = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.f959t = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f953a = true;
        this.f954b = -1;
        this.f955c = 0;
        this.f957e = 8388659;
        int[] iArr = k.a.f37413p;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        s0.p(this, context, iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        int i12 = typedArray.getInt(1, -1);
        if (i12 >= 0) {
            setOrientation(i12);
        }
        int i13 = typedArray.getInt(0, -1);
        if (i13 >= 0) {
            setGravity(i13);
        }
        boolean z11 = typedArray.getBoolean(2, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.f959t = typedArray.getFloat(4, -1.0f);
        this.f954b = typedArray.getInt(3, -1);
        this.H = typedArray.getBoolean(7, false);
        setDividerDrawable(m4VarK.g(5));
        this.P = typedArray.getInt(8, 0);
        this.Q = typedArray.getDimensionPixelSize(6, 0);
        m4VarK.l();
    }
}
