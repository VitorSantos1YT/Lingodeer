package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CardLayoutPortrait extends BaseModalLayout {
    public View H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f19931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f19932f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f19933t;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i15 = 0; i15 < size; i15++) {
            View view = getVisibleChildren().get(i15);
            view.layout(0, measuredHeight, view.getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight);
            view.getMeasuredWidth();
            view.getMeasuredHeight();
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f19931e = c(R.id.image_view);
        this.f19932f = c(R.id.message_title);
        this.f19933t = c(R.id.body_scroll);
        this.H = c(R.id.action_bar);
        int iB = b(i11);
        int iA = a(i12);
        int iRound = Math.round(((int) (0.8d * ((double) iA))) / 4) * 4;
        MeasureUtils.a(this.f19931e, iB, iA, 1073741824, Integer.MIN_VALUE);
        if (BaseModalLayout.d(this.f19931e) > iRound) {
            MeasureUtils.a(this.f19931e, iB, iRound, Integer.MIN_VALUE, 1073741824);
        }
        int iE = BaseModalLayout.e(this.f19931e);
        MeasureUtils.a(this.f19932f, iE, iA, 1073741824, Integer.MIN_VALUE);
        MeasureUtils.a(this.H, iE, iA, 1073741824, Integer.MIN_VALUE);
        MeasureUtils.a(this.f19933t, iE, ((iA - BaseModalLayout.d(this.f19931e)) - BaseModalLayout.d(this.f19932f)) - BaseModalLayout.d(this.H), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int iD = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iD += BaseModalLayout.d(getVisibleChildren().get(i13));
        }
        setMeasuredDimension(iE, iD);
    }
}
