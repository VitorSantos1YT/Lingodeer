package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import nv.p;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public Drawable H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int[] O;
    public SparseIntArray P;
    public final FlexboxHelper Q;
    public List R;
    public final FlexboxHelper.FlexLinesResult S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8269f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f8270t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.f8271a = 1;
                layoutParams.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
                layoutParams.f8273c = 1.0f;
                layoutParams.f8274d = -1;
                layoutParams.f8275e = -1.0f;
                layoutParams.f8276f = -1;
                layoutParams.f8277t = -1;
                layoutParams.H = 16777215;
                layoutParams.K = 16777215;
                layoutParams.f8271a = parcel.readInt();
                layoutParams.f8272b = parcel.readFloat();
                layoutParams.f8273c = parcel.readFloat();
                layoutParams.f8274d = parcel.readInt();
                layoutParams.f8275e = parcel.readFloat();
                layoutParams.f8276f = parcel.readInt();
                layoutParams.f8277t = parcel.readInt();
                layoutParams.H = parcel.readInt();
                layoutParams.K = parcel.readInt();
                layoutParams.L = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i11) {
                return new LayoutParams[i11];
            }
        };
        public int H;
        public int K;
        public boolean L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8276f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8277t;

        public LayoutParams(int i11, int i12) {
            super(new ViewGroup.LayoutParams(i11, i12));
            this.f8271a = 1;
            this.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f8273c = 1.0f;
            this.f8274d = -1;
            this.f8275e = -1.0f;
            this.f8276f = -1;
            this.f8277t = -1;
            this.H = 16777215;
            this.K = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int A1() {
            return this.H;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float F0() {
            return this.f8272b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float M0() {
            return this.f8275e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int N() {
            return this.f8274d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float T() {
            return this.f8273c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Y0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Z() {
            return this.f8276f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b1() {
            return this.f8277t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean f1() {
            return this.L;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void g0(int i11) {
            this.f8276f = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f8271a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i1() {
            return this.K;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int w0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f8271a);
            parcel.writeFloat(this.f8272b);
            parcel.writeFloat(this.f8273c);
            parcel.writeInt(this.f8274d);
            parcel.writeFloat(this.f8275e);
            parcel.writeInt(this.f8276f);
            parcel.writeInt(this.f8277t);
            parcel.writeInt(this.H);
            parcel.writeInt(this.K);
            parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void z0(int i11) {
            this.f8277t = i11;
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void a(View view, int i11, int i12, FlexLine flexLine) {
        if (p(i11, i12)) {
            if (i()) {
                int i13 = flexLine.f8242e;
                int i14 = this.N;
                flexLine.f8242e = i13 + i14;
                flexLine.f8243f += i14;
                return;
            }
            int i15 = flexLine.f8242e;
            int i16 = this.M;
            flexLine.f8242e = i15 + i16;
            flexLine.f8243f += i16;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.P == null) {
            this.P = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.P;
        FlexboxHelper flexboxHelper = this.Q;
        FlexContainer flexContainer = flexboxHelper.f8255a;
        int flexItemCount = flexContainer.getFlexItemCount();
        ArrayList arrayListF = flexboxHelper.f(flexItemCount);
        FlexboxHelper.Order order = new FlexboxHelper.Order(0);
        if (view == null || !(layoutParams instanceof FlexItem)) {
            order.f8263b = 1;
        } else {
            order.f8263b = ((FlexItem) layoutParams).getOrder();
        }
        if (i11 == -1 || i11 == flexItemCount || i11 >= flexContainer.getFlexItemCount()) {
            order.f8262a = flexItemCount;
        } else {
            order.f8262a = i11;
            for (int i12 = i11; i12 < flexItemCount; i12++) {
                ((FlexboxHelper.Order) arrayListF.get(i12)).f8262a++;
            }
        }
        arrayListF.add(order);
        this.O = FlexboxHelper.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i11, layoutParams);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void b(FlexLine flexLine) {
        if (i()) {
            if ((this.L & 4) > 0) {
                int i11 = flexLine.f8242e;
                int i12 = this.N;
                flexLine.f8242e = i11 + i12;
                flexLine.f8243f += i12;
                return;
            }
            return;
        }
        if ((this.K & 4) > 0) {
            int i13 = flexLine.f8242e;
            int i14 = this.M;
            flexLine.f8242e = i13 + i14;
            flexLine.f8243f += i14;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final View c(int i11) {
        return o(i11);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int d(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final View e(int i11) {
        return getChildAt(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int f(View view, int i11, int i12) {
        int i13;
        int i14;
        if (i()) {
            i13 = p(i11, i12) ? this.N : 0;
            if ((this.L & 4) <= 0) {
                return i13;
            }
            i14 = this.N;
        } else {
            i13 = p(i11, i12) ? this.M : 0;
            if ((this.K & 4) <= 0) {
                return i13;
            }
            i14 = this.M;
        }
        return i13 + i14;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int g(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f8271a = 1;
        layoutParams.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
        layoutParams.f8273c = 1.0f;
        layoutParams.f8274d = -1;
        layoutParams.f8275e = -1.0f;
        layoutParams.f8276f = -1;
        layoutParams.f8277t = -1;
        layoutParams.H = 16777215;
        layoutParams.K = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f8310b);
        layoutParams.f8271a = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f8272b = typedArrayObtainStyledAttributes.getFloat(2, CropImageView.DEFAULT_ASPECT_RATIO);
        layoutParams.f8273c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f8274d = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f8275e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f8276f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f8277t = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.L = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.f8268e;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.f8267d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f8270t;
    }

    public Drawable getDividerDrawableVertical() {
        return this.H;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.f8264a;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.R.size());
        for (FlexLine flexLine : this.R) {
            if (flexLine.a() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.R;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.f8265b;
    }

    public int getJustifyContent() {
        return this.f8266c;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        Iterator it = this.R.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((FlexLine) it.next()).f8242e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.f8269f;
    }

    public int getShowDividerHorizontal() {
        return this.K;
    }

    public int getShowDividerVertical() {
        return this.L;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.R.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            FlexLine flexLine = (FlexLine) this.R.get(i12);
            if (q(i12)) {
                i11 += i() ? this.M : this.N;
            }
            if (r(i12)) {
                i11 += i() ? this.M : this.N;
            }
            i11 += flexLine.f8244g;
        }
        return i11;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final boolean i() {
        int i11 = this.f8264a;
        return i11 == 0 || i11 == 1;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final int j(View view) {
        return 0;
    }

    public final void k(Canvas canvas, boolean z11, boolean z12) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.R.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine = (FlexLine) this.R.get(i11);
            for (int i12 = 0; i12 < flexLine.f8245h; i12++) {
                int i13 = flexLine.f8251o + i12;
                View viewO = o(i13);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i13, i12)) {
                        n(canvas, z11 ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.N, flexLine.f8239b, flexLine.f8244g);
                    }
                    if (i12 == flexLine.f8245h - 1 && (this.L & 4) > 0) {
                        n(canvas, z11 ? (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.N : viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.f8239b, flexLine.f8244g);
                    }
                }
            }
            if (q(i11)) {
                m(canvas, paddingLeft, z12 ? flexLine.f8241d : flexLine.f8239b - this.M, iMax);
            }
            if (r(i11) && (this.K & 4) > 0) {
                m(canvas, paddingLeft, z12 ? flexLine.f8239b - this.M : flexLine.f8241d, iMax);
            }
        }
    }

    public final void l(Canvas canvas, boolean z11, boolean z12) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.R.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine = (FlexLine) this.R.get(i11);
            for (int i12 = 0; i12 < flexLine.f8245h; i12++) {
                int i13 = flexLine.f8251o + i12;
                View viewO = o(i13);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i13, i12)) {
                        m(canvas, flexLine.f8238a, z12 ? viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.M, flexLine.f8244g);
                    }
                    if (i12 == flexLine.f8245h - 1 && (this.K & 4) > 0) {
                        m(canvas, flexLine.f8238a, z12 ? (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.M : viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.f8244g);
                    }
                }
            }
            if (q(i11)) {
                n(canvas, z11 ? flexLine.f8240c : flexLine.f8238a - this.N, paddingTop, iMax);
            }
            if (r(i11) && (this.L & 4) > 0) {
                n(canvas, z11 ? flexLine.f8238a - this.N : flexLine.f8240c, paddingTop, iMax);
            }
        }
    }

    public final void m(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.f8270t;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, i13 + i11, this.M + i12);
        this.f8270t.draw(canvas);
    }

    public final void n(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.H;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, this.N + i11, i13 + i12);
        this.H.draw(canvas);
    }

    public final View o(int i11) {
        if (i11 < 0) {
            return null;
        }
        int[] iArr = this.O;
        if (i11 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i11]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.H == null && this.f8270t == null) {
            return;
        }
        if (this.K == 0 && this.L == 0) {
            return;
        }
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        int i11 = this.f8264a;
        if (i11 == 0) {
            k(canvas, layoutDirection == 1, this.f8265b == 2);
            return;
        }
        if (i11 == 1) {
            k(canvas, layoutDirection != 1, this.f8265b == 2);
            return;
        }
        if (i11 == 2) {
            boolean z11 = layoutDirection == 1;
            if (this.f8265b == 2) {
                z11 = !z11;
            }
            l(canvas, z11, false);
            return;
        }
        if (i11 != 3) {
            return;
        }
        boolean z12 = layoutDirection == 1;
        if (this.f8265b == 2) {
            z12 = !z12;
        }
        l(canvas, z12, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        int i15 = this.f8264a;
        if (i15 == 0) {
            s(i11, i12, i13, i14, layoutDirection == 1);
            return;
        }
        if (i15 == 1) {
            s(i11, i12, i13, i14, layoutDirection != 1);
            return;
        }
        if (i15 == 2) {
            boolean z12 = false;
            if (layoutDirection == 1) {
                z12 = true;
            }
            if (this.f8265b == 2) {
                z12 = !z12;
            }
            t(i11, i12, i13, i14, z12, false);
            return;
        }
        if (i15 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f8264a);
        }
        boolean z13 = layoutDirection == 1;
        if (this.f8265b == 2) {
            z13 = !z13;
        }
        t(i11, i12, i13, i14, z13, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        if (this.P == null) {
            this.P = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.P;
        FlexboxHelper flexboxHelper = this.Q;
        FlexContainer flexContainer = flexboxHelper.f8255a;
        int flexItemCount = flexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.P;
            int flexItemCount2 = flexboxHelper.f8255a.getFlexItemCount();
            this.O = FlexboxHelper.r(flexItemCount2, flexboxHelper.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i13 = 0; i13 < flexItemCount; i13++) {
            View viewE = flexContainer.e(i13);
            if (viewE != null && ((FlexItem) viewE.getLayoutParams()).getOrder() != sparseIntArray.get(i13)) {
                SparseIntArray sparseIntArray3 = this.P;
                int flexItemCount3 = flexboxHelper.f8255a.getFlexItemCount();
                this.O = FlexboxHelper.r(flexItemCount3, flexboxHelper.f(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i14 = this.f8264a;
        FlexboxHelper.FlexLinesResult flexLinesResult = this.S;
        if (i14 != 0 && i14 != 1) {
            if (i14 != 2 && i14 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f8264a);
            }
            this.R.clear();
            flexLinesResult.f8260a = null;
            flexLinesResult.f8261b = 0;
            this.Q.b(this.S, i12, i11, Integer.MAX_VALUE, 0, -1, null);
            this.R = flexLinesResult.f8260a;
            flexboxHelper.h(i11, i12, 0);
            flexboxHelper.g(i11, i12, getPaddingRight() + getPaddingLeft());
            flexboxHelper.u(0);
            u(this.f8264a, i11, i12, flexLinesResult.f8261b);
            return;
        }
        this.R.clear();
        flexLinesResult.f8260a = null;
        flexLinesResult.f8261b = 0;
        this.Q.b(this.S, i11, i12, Integer.MAX_VALUE, 0, -1, null);
        this.R = flexLinesResult.f8260a;
        flexboxHelper.h(i11, i12, 0);
        if (this.f8267d == 3) {
            for (FlexLine flexLine : this.R) {
                int iMax = Integer.MIN_VALUE;
                for (int i15 = 0; i15 < flexLine.f8245h; i15++) {
                    View viewO = o(flexLine.f8251o + i15);
                    if (viewO != null && viewO.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                        iMax = this.f8265b != 2 ? Math.max(iMax, viewO.getMeasuredHeight() + Math.max(flexLine.f8249l - viewO.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewO.getBaseline() + (flexLine.f8249l - viewO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.f8244g = iMax;
            }
        }
        flexboxHelper.g(i11, i12, getPaddingBottom() + getPaddingTop());
        flexboxHelper.u(0);
        u(this.f8264a, i11, i12, flexLinesResult.f8261b);
    }

    public final boolean p(int i11, int i12) {
        for (int i13 = 1; i13 <= i12; i13++) {
            View viewO = o(i11 - i13);
            if (viewO != null && viewO.getVisibility() != 8) {
                if (i()) {
                    return (this.L & 2) != 0;
                }
                return (this.K & 2) != 0;
            }
        }
        if (i()) {
            return (this.L & 1) != 0;
        }
        return (this.K & 1) != 0;
    }

    public final boolean q(int i11) {
        if (i11 >= 0 && i11 < this.R.size()) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (((FlexLine) this.R.get(i12)).a() > 0) {
                    if (i()) {
                        return (this.K & 2) != 0;
                    }
                    return (this.L & 2) != 0;
                }
            }
            if (i()) {
                return (this.K & 1) != 0;
            }
            if ((this.L & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i11) {
        if (i11 >= 0 && i11 < this.R.size()) {
            for (int i12 = i11 + 1; i12 < this.R.size(); i12++) {
                if (((FlexLine) this.R.get(i12)).a() > 0) {
                    return false;
                }
            }
            if (i()) {
                return (this.K & 4) != 0;
            }
            if ((this.L & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    public final void s(int i11, int i12, int i13, int i14, boolean z11) {
        float measuredWidth;
        float f5;
        float f11;
        float fMax;
        int i15;
        int i16;
        View viewO;
        boolean z12;
        int i17;
        float f12;
        float f13;
        int i18;
        float f14;
        int i19;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = i13 - i11;
        int paddingBottom = (i14 - i12) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.R.size();
        for (int i22 = 0; i22 < size; i22++) {
            FlexLine flexLine2 = (FlexLine) this.R.get(i22);
            if (q(i22)) {
                int i23 = this.M;
                paddingBottom -= i23;
                paddingTop += i23;
            }
            int i24 = paddingBottom;
            int i25 = this.f8266c;
            char c11 = 4;
            int i26 = 2;
            boolean z13 = true;
            if (i25 == 0) {
                measuredWidth = paddingLeft;
                f5 = i21 - paddingRight;
            } else if (i25 != 1) {
                if (i25 == 2) {
                    int i27 = flexLine2.f8242e;
                    measuredWidth = paddingLeft + ((i21 - i27) / 2.0f);
                    f5 = (i21 - paddingRight) - ((i21 - i27) / 2.0f);
                } else if (i25 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = flexLine2.a();
                    f11 = (i21 - flexLine2.f8242e) / (iA != 1 ? iA - 1 : 1.0f);
                    f5 = i21 - paddingRight;
                } else if (i25 == 4) {
                    int iA2 = flexLine2.a();
                    float f15 = iA2 != 0 ? (i21 - flexLine2.f8242e) / iA2 : 0.0f;
                    float f16 = f15 / 2.0f;
                    measuredWidth = paddingLeft + f16;
                    float f17 = (i21 - paddingRight) - f16;
                    f11 = f15;
                    f5 = f17;
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f8266c);
                    }
                    int iA3 = flexLine2.a();
                    f11 = iA3 != 0 ? (i21 - flexLine2.f8242e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f5 = (i21 - paddingRight) - f11;
                }
                fMax = Math.max(f11, CropImageView.DEFAULT_ASPECT_RATIO);
                i15 = 0;
                while (i15 < flexLine2.f8245h) {
                    i16 = flexLine2.f8251o + i15;
                    viewO = o(i16);
                    char c12 = c11;
                    if (viewO != null) {
                        z12 = z13;
                        if (viewO.getVisibility() == 8) {
                            z12 = z12;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f13 = f5 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (p(i16, i15)) {
                                int i28 = this.N;
                                float f18 = i28;
                                f12 += f18;
                                f13 -= f18;
                                i18 = i28;
                            } else {
                                i18 = 0;
                            }
                            f14 = f13;
                            if (i15 == flexLine2.f8245h - 1 || (this.L & 4) <= 0) {
                                i19 = 0;
                            } else {
                                i19 = this.N;
                            }
                            if (this.f8265b == i26) {
                                if (z11) {
                                    view = viewO;
                                    this.Q.o(view, flexLine2, Math.round(f14) - viewO.getMeasuredWidth(), i24 - viewO.getMeasuredHeight(), Math.round(f14), i24);
                                } else {
                                    view = viewO;
                                    this.Q.o(view, flexLine2, Math.round(f12), i24 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f12), i24);
                                }
                                i17 = i24;
                            } else {
                                i15 = i15;
                                view = viewO;
                                z12 = z12;
                                i26 = i26;
                                i17 = i24;
                                if (z11) {
                                    this.Q.o(view, flexLine2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i29 = paddingTop;
                                    this.Q.o(view, flexLine2, Math.round(f12), i29, view.getMeasuredWidth() + Math.round(f12), view.getMeasuredHeight() + i29);
                                    paddingTop = i29;
                                }
                            }
                            measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z11) {
                                flexLine = flexLine2;
                                flexLine.b(view, i19, 0, i18, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.b(view, i18, 0, i19, 0);
                            }
                            flexLine2 = flexLine;
                            f5 = measuredWidth2;
                        }
                        i15++;
                        c11 = c12;
                        i26 = i26;
                        z13 = z12;
                        i24 = i17;
                    } else {
                        z12 = z13;
                    }
                    i26 = i26;
                    i15 = i15;
                    i17 = i24;
                    i15++;
                    c11 = c12;
                    i26 = i26;
                    z13 = z12;
                    i24 = i17;
                }
                int i30 = flexLine2.f8244g;
                paddingTop += i30;
                paddingBottom = i24 - i30;
            } else {
                int i31 = flexLine2.f8242e;
                f5 = i31 - paddingLeft;
                measuredWidth = (i21 - i31) + paddingRight;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, CropImageView.DEFAULT_ASPECT_RATIO);
            i15 = 0;
            while (i15 < flexLine2.f8245h) {
                i16 = flexLine2.f8251o + i15;
                viewO = o(i16);
                char c13 = c11;
                if (viewO != null) {
                    z12 = z13;
                    if (viewO.getVisibility() == 8) {
                        z12 = z12;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f13 = f5 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (p(i16, i15)) {
                            int i210 = this.N;
                            float f19 = i210;
                            f12 += f19;
                            f13 -= f19;
                            i18 = i210;
                        } else {
                            i18 = 0;
                        }
                        f14 = f13;
                        if (i15 == flexLine2.f8245h - 1) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        if (this.f8265b == i26) {
                            if (z11) {
                                view = viewO;
                                this.Q.o(view, flexLine2, Math.round(f14) - viewO.getMeasuredWidth(), i24 - viewO.getMeasuredHeight(), Math.round(f14), i24);
                            } else {
                                view = viewO;
                                this.Q.o(view, flexLine2, Math.round(f12), i24 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f12), i24);
                            }
                            i17 = i24;
                        } else {
                            i15 = i15;
                            view = viewO;
                            z12 = z12;
                            i26 = i26;
                            i17 = i24;
                            if (z11) {
                                this.Q.o(view, flexLine2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i211 = paddingTop;
                                this.Q.o(view, flexLine2, Math.round(f12), i211, view.getMeasuredWidth() + Math.round(f12), view.getMeasuredHeight() + i211);
                                paddingTop = i211;
                            }
                        }
                        measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z11) {
                            flexLine = flexLine2;
                            flexLine.b(view, i19, 0, i18, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.b(view, i18, 0, i19, 0);
                        }
                        flexLine2 = flexLine;
                        f5 = measuredWidth3;
                    }
                    i15++;
                    c11 = c13;
                    i26 = i26;
                    z13 = z12;
                    i24 = i17;
                } else {
                    z12 = z13;
                }
                i26 = i26;
                i15 = i15;
                i17 = i24;
                i15++;
                c11 = c13;
                i26 = i26;
                z13 = z12;
                i24 = i17;
            }
            int i32 = flexLine2.f8244g;
            paddingTop += i32;
            paddingBottom = i24 - i32;
        }
    }

    public void setAlignContent(int i11) {
        if (this.f8268e != i11) {
            this.f8268e = i11;
            requestLayout();
        }
    }

    public void setAlignItems(int i11) {
        if (this.f8267d != i11) {
            this.f8267d = i11;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f8270t) {
            return;
        }
        this.f8270t = drawable;
        if (drawable != null) {
            this.M = drawable.getIntrinsicHeight();
        } else {
            this.M = 0;
        }
        if (this.f8270t == null && this.H == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.H) {
            return;
        }
        this.H = drawable;
        if (drawable != null) {
            this.N = drawable.getIntrinsicWidth();
        } else {
            this.N = 0;
        }
        if (this.f8270t == null && this.H == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i11) {
        if (this.f8264a != i11) {
            this.f8264a = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.R = list;
    }

    public void setFlexWrap(int i11) {
        if (this.f8265b != i11) {
            this.f8265b = i11;
            requestLayout();
        }
    }

    public void setJustifyContent(int i11) {
        if (this.f8266c != i11) {
            this.f8266c = i11;
            requestLayout();
        }
    }

    public void setMaxLine(int i11) {
        if (this.f8269f != i11) {
            this.f8269f = i11;
            requestLayout();
        }
    }

    public void setShowDivider(int i11) {
        setShowDividerVertical(i11);
        setShowDividerHorizontal(i11);
    }

    public void setShowDividerHorizontal(int i11) {
        if (i11 != this.K) {
            this.K = i11;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i11) {
        if (i11 != this.L) {
            this.L = i11;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d4  */
    public final void t(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float measuredHeight;
        float f5;
        float f11;
        float fMax;
        int i15;
        int i16;
        int i17;
        View viewO;
        char c11;
        int i18;
        float f12;
        float f13;
        int i19;
        float f14;
        int i21;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i22 = i14 - i12;
        int i23 = (i13 - i11) - paddingRight;
        int size = this.R.size();
        for (int i24 = 0; i24 < size; i24++) {
            FlexLine flexLine2 = (FlexLine) this.R.get(i24);
            if (q(i24)) {
                int i25 = this.N;
                paddingLeft += i25;
                i23 -= i25;
            }
            int i26 = i23;
            int i27 = this.f8266c;
            char c12 = 4;
            int i28 = 1;
            if (i27 == 0) {
                measuredHeight = paddingTop;
                f5 = i22 - paddingBottom;
            } else if (i27 != 1) {
                if (i27 == 2) {
                    float f15 = (i22 - flexLine2.f8242e) / 2.0f;
                    measuredHeight = paddingTop + f15;
                    f5 = (i22 - paddingBottom) - f15;
                } else if (i27 == 3) {
                    measuredHeight = paddingTop;
                    int iA = flexLine2.a();
                    f11 = (i22 - flexLine2.f8242e) / (iA != 1 ? iA - 1 : 1.0f);
                    f5 = i22 - paddingBottom;
                } else if (i27 == 4) {
                    int iA2 = flexLine2.a();
                    f11 = iA2 != 0 ? (i22 - flexLine2.f8242e) / iA2 : 0.0f;
                    float f16 = f11 / 2.0f;
                    measuredHeight = paddingTop + f16;
                    f5 = (i22 - paddingBottom) - f16;
                } else {
                    if (i27 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f8266c);
                    }
                    int iA3 = flexLine2.a();
                    f11 = iA3 != 0 ? (i22 - flexLine2.f8242e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f11;
                    f5 = (i22 - paddingBottom) - f11;
                }
                fMax = Math.max(f11, CropImageView.DEFAULT_ASPECT_RATIO);
                i15 = 0;
                while (i15 < flexLine2.f8245h) {
                    i16 = flexLine2.f8251o + i15;
                    i17 = i28;
                    viewO = o(i16);
                    if (viewO != null) {
                        c11 = c12;
                        if (viewO.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f13 = f5 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (p(i16, i15)) {
                                i19 = this.M;
                                float f17 = i19;
                                f12 += f17;
                                f13 -= f17;
                            } else {
                                i19 = 0;
                            }
                            f14 = f13;
                            if (i15 == flexLine2.f8245h - i17 || (this.K & 4) <= 0) {
                                i21 = 0;
                            } else {
                                i21 = this.M;
                            }
                            if (z11) {
                                if (z12) {
                                    this.Q.p(viewO, flexLine2, true, i26 - viewO.getMeasuredWidth(), Math.round(f14) - viewO.getMeasuredHeight(), i26, Math.round(f14));
                                } else {
                                    this.Q.p(viewO, flexLine2, true, i26 - viewO.getMeasuredWidth(), Math.round(f12), i26, viewO.getMeasuredHeight() + Math.round(f12));
                                }
                                i18 = i26;
                            } else {
                                i15 = i15;
                                i17 = i17;
                                i18 = i26;
                                if (z12) {
                                    this.Q.p(viewO, flexLine2, false, paddingLeft, Math.round(f14) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f14));
                                } else {
                                    int i29 = paddingLeft;
                                    this.Q.p(viewO, flexLine2, false, i29, Math.round(f12), viewO.getMeasuredWidth() + i29, viewO.getMeasuredHeight() + Math.round(f12));
                                    paddingLeft = i29;
                                }
                            }
                            measuredHeight = f12 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f14 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z12) {
                                flexLine = flexLine2;
                                flexLine.b(viewO, 0, i21, 0, i19);
                            } else {
                                flexLine = flexLine2;
                                flexLine.b(viewO, 0, i19, 0, i21);
                            }
                            flexLine2 = flexLine;
                            f5 = measuredHeight2;
                        }
                        i15++;
                        c12 = c11;
                        i28 = i17;
                        i26 = i18;
                    } else {
                        c11 = c12;
                    }
                    i15 = i15;
                    i17 = i17;
                    i18 = i26;
                    i15++;
                    c12 = c11;
                    i28 = i17;
                    i26 = i18;
                }
                int i30 = flexLine2.f8244g;
                paddingLeft += i30;
                i23 = i26 - i30;
            } else {
                int i31 = flexLine2.f8242e;
                f5 = i31 - paddingTop;
                measuredHeight = (i22 - i31) + paddingBottom;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, CropImageView.DEFAULT_ASPECT_RATIO);
            i15 = 0;
            while (i15 < flexLine2.f8245h) {
                i16 = flexLine2.f8251o + i15;
                i17 = i28;
                viewO = o(i16);
                if (viewO != null) {
                    c11 = c12;
                    if (viewO.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f13 = f5 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (p(i16, i15)) {
                            i19 = this.M;
                            float f18 = i19;
                            f12 += f18;
                            f13 -= f18;
                        } else {
                            i19 = 0;
                        }
                        f14 = f13;
                        if (i15 == flexLine2.f8245h - i17) {
                            i21 = 0;
                        } else {
                            i21 = 0;
                        }
                        if (z11) {
                            if (z12) {
                                this.Q.p(viewO, flexLine2, true, i26 - viewO.getMeasuredWidth(), Math.round(f14) - viewO.getMeasuredHeight(), i26, Math.round(f14));
                            } else {
                                this.Q.p(viewO, flexLine2, true, i26 - viewO.getMeasuredWidth(), Math.round(f12), i26, viewO.getMeasuredHeight() + Math.round(f12));
                            }
                            i18 = i26;
                        } else {
                            i15 = i15;
                            i17 = i17;
                            i18 = i26;
                            if (z12) {
                                this.Q.p(viewO, flexLine2, false, paddingLeft, Math.round(f14) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f14));
                            } else {
                                int i210 = paddingLeft;
                                this.Q.p(viewO, flexLine2, false, i210, Math.round(f12), viewO.getMeasuredWidth() + i210, viewO.getMeasuredHeight() + Math.round(f12));
                                paddingLeft = i210;
                            }
                        }
                        measuredHeight = f12 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f14 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z12) {
                            flexLine = flexLine2;
                            flexLine.b(viewO, 0, i21, 0, i19);
                        } else {
                            flexLine = flexLine2;
                            flexLine.b(viewO, 0, i19, 0, i21);
                        }
                        flexLine2 = flexLine;
                        f5 = measuredHeight3;
                    }
                    i15++;
                    c12 = c11;
                    i28 = i17;
                    i26 = i18;
                } else {
                    c11 = c12;
                }
                i15 = i15;
                i17 = i17;
                i18 = i26;
                i15++;
                c12 = c11;
                i28 = i17;
                i26 = i18;
            }
            int i32 = flexLine2.f8244g;
            paddingLeft += i32;
            i23 = i26 - i32;
        }
    }

    public final void u(int i11, int i12, int i13, int i14) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (i11 == 0 || i11 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(p.j(i11, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i12, i14);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(p.j(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i14 = View.combineMeasuredStates(i14, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i13, i14);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(p.j(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i14 = View.combineMeasuredStates(i14, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f8269f = -1;
        this.Q = new FlexboxHelper(this);
        this.R = new ArrayList();
        this.S = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f8309a, i11, 0);
        this.f8264a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f8265b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f8266c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.f8267d = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f8268e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f8269f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i12 != 0) {
            this.L = i12;
            this.K = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i13 != 0) {
            this.L = i13;
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i14 != 0) {
            this.K = i14;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f8271a = 1;
            layoutParams3.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
            layoutParams3.f8273c = 1.0f;
            layoutParams3.f8274d = -1;
            layoutParams3.f8275e = -1.0f;
            layoutParams3.f8276f = -1;
            layoutParams3.f8277t = -1;
            layoutParams3.H = 16777215;
            layoutParams3.K = 16777215;
            layoutParams3.f8271a = layoutParams2.f8271a;
            layoutParams3.f8272b = layoutParams2.f8272b;
            layoutParams3.f8273c = layoutParams2.f8273c;
            layoutParams3.f8274d = layoutParams2.f8274d;
            layoutParams3.f8275e = layoutParams2.f8275e;
            layoutParams3.f8276f = layoutParams2.f8276f;
            layoutParams3.f8277t = layoutParams2.f8277t;
            layoutParams3.H = layoutParams2.H;
            layoutParams3.K = layoutParams2.K;
            layoutParams3.L = layoutParams2.L;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f8271a = 1;
            layoutParams4.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
            layoutParams4.f8273c = 1.0f;
            layoutParams4.f8274d = -1;
            layoutParams4.f8275e = -1.0f;
            layoutParams4.f8276f = -1;
            layoutParams4.f8277t = -1;
            layoutParams4.H = 16777215;
            layoutParams4.K = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f8271a = 1;
        layoutParams5.f8272b = CropImageView.DEFAULT_ASPECT_RATIO;
        layoutParams5.f8273c = 1.0f;
        layoutParams5.f8274d = -1;
        layoutParams5.f8275e = -1.0f;
        layoutParams5.f8276f = -1;
        layoutParams5.f8277t = -1;
        layoutParams5.H = 16777215;
        layoutParams5.K = 16777215;
        return layoutParams5;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public final void h(View view, int i11) {
    }
}
