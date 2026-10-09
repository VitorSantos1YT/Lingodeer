package com.lingo.lingoskill.unity.stickyitemdecoration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import fq.a;
import fq.b;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class StickyHeadContainer extends ViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22067d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22070c;

    public StickyHeadContainer(Context context) {
        this(context, null, 6, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p4) {
        m.f(p4, "p");
        return p4 instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
        m.e(layoutParamsGenerateDefaultLayoutParams, "generateDefaultLayoutParams(...)");
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p4) {
        m.f(p4, "p");
        return new ViewGroup.MarginLayoutParams(p4);
    }

    public final int getChildHeight() {
        return getChildAt(0).getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f22068a = paddingLeft + marginLayoutParams.leftMargin;
        this.f22069b = childAt.getMeasuredWidth() + this.f22068a;
        this.f22070c = paddingTop + marginLayoutParams.topMargin;
        int measuredHeight = childAt.getMeasuredHeight();
        int i15 = this.f22070c;
        childAt.layout(this.f22068a, i15, this.f22069b, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        if (getChildCount() != 1) {
            throw new IllegalArgumentException("只允许容器添加1个子View！");
        }
        View childAt = getChildAt(0);
        measureChildWithMargins(childAt, i11, 0, i12, 0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        m.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSize(Math.max(paddingRight, getSuggestedMinimumWidth()), i11), View.resolveSize(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12));
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        m.f(attrs, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public /* synthetic */ StickyHeadContainer(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setOnClickListener(new a());
    }

    public final void setDataCallback(b bVar) {
    }
}
