package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import com.google.firebase.inappmessaging.display.internal.layout.util.VerticalViewGroupMeasure;
import com.google.firebase.inappmessaging.display.internal.layout.util.ViewMeasure;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ModalLayoutPortrait extends BaseModalLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VerticalViewGroupMeasure f19939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19940f;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19939e = new VerticalViewGroupMeasure();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i17 = 0; i17 < size; i17++) {
            View view = getVisibleChildren().get(i17);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i18 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i19 = (i13 - i11) / 2;
                int i21 = measuredWidth / 2;
                i16 = i19 - i21;
                i15 = i19 + i21;
            } else {
                i15 = paddingLeft + measuredWidth;
                i16 = paddingLeft;
            }
            view.layout(i16, paddingTop, i15, i18);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i17 < size - 1) {
                measuredHeight2 += this.f19940f;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f19940f = (int) Math.floor(TypedValue.applyDimension(1, 24, this.f19926c));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i11);
        int iA = a(i12);
        int size = ((getVisibleChildren().size() - 1) * this.f19940f) + paddingTop;
        VerticalViewGroupMeasure verticalViewGroupMeasure = this.f19939e;
        verticalViewGroupMeasure.getClass();
        verticalViewGroupMeasure.f19944b = iA;
        verticalViewGroupMeasure.f19943a = new ArrayList();
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            boolean z11 = childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view;
            ViewMeasure viewMeasure = new ViewMeasure();
            viewMeasure.f19945a = childAt;
            viewMeasure.f19946b = z11;
            viewMeasure.f19947c = verticalViewGroupMeasure.f19944b;
            verticalViewGroupMeasure.f19943a.add(viewMeasure);
        }
        Objects.toString(getDisplayMetrics());
        getMaxWidthPct();
        getMaxHeightPct();
        ArrayList arrayList = verticalViewGroupMeasure.f19943a;
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj = arrayList.get(i15);
            i15++;
            MeasureUtils.b(((ViewMeasure) obj).f19945a, iB, iA);
        }
        ArrayList arrayList2 = verticalViewGroupMeasure.f19943a;
        int size3 = arrayList2.size();
        int iA2 = 0;
        int i16 = 0;
        while (i16 < size3) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            iA2 += ((ViewMeasure) obj2).a();
        }
        if (iA2 + size > iA) {
            int i17 = iA - size;
            ArrayList arrayList3 = verticalViewGroupMeasure.f19943a;
            int size4 = arrayList3.size();
            int iA3 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList3.get(i18);
                i18++;
                ViewMeasure viewMeasure2 = (ViewMeasure) obj3;
                if (!viewMeasure2.f19946b) {
                    iA3 += viewMeasure2.a();
                }
            }
            verticalViewGroupMeasure.a(i17 - iA3);
        }
        int i19 = iB - paddingLeft;
        ArrayList arrayList4 = verticalViewGroupMeasure.f19943a;
        int size5 = arrayList4.size();
        while (i13 < size5) {
            Object obj4 = arrayList4.get(i13);
            i13++;
            ViewMeasure viewMeasure3 = (ViewMeasure) obj4;
            MeasureUtils.b(viewMeasure3.f19945a, i19, viewMeasure3.f19947c);
            size += BaseModalLayout.d(viewMeasure3.f19945a);
        }
        setMeasuredDimension(iB, size);
    }
}
