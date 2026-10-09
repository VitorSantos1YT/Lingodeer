package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import com.lingodeer.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CardLayoutLandscape extends BaseModalLayout {
    public View H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f19928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f19929f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f19930t;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iE = BaseModalLayout.e(this.f19928e);
        this.f19928e.layout(0, 0, iE, BaseModalLayout.d(this.f19928e));
        int iD = BaseModalLayout.d(this.f19929f);
        this.f19929f.layout(iE, 0, measuredWidth, iD);
        this.f19930t.layout(iE, iD, measuredWidth, BaseModalLayout.d(this.f19930t) + iD);
        this.H.layout(iE, measuredHeight - BaseModalLayout.d(this.H), measuredWidth, measuredHeight);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f19928e = c(R.id.image_view);
        this.f19929f = c(R.id.message_title);
        this.f19930t = c(R.id.body_scroll);
        View viewC = c(R.id.action_bar);
        this.H = viewC;
        List listAsList = Arrays.asList(this.f19929f, this.f19930t, viewC);
        int iB = b(i11);
        int iA = a(i12);
        int iRound = Math.round(((int) (0.6d * ((double) iB))) / 4) * 4;
        MeasureUtils.a(this.f19928e, iB, iA, Integer.MIN_VALUE, 1073741824);
        if (BaseModalLayout.e(this.f19928e) > iRound) {
            MeasureUtils.a(this.f19928e, iRound, iA, 1073741824, Integer.MIN_VALUE);
        }
        int iD = BaseModalLayout.d(this.f19928e);
        int iE = BaseModalLayout.e(this.f19928e);
        int i13 = iB - iE;
        MeasureUtils.b(this.f19929f, i13, iD);
        MeasureUtils.b(this.H, i13, iD);
        MeasureUtils.a(this.f19930t, i13, (iD - BaseModalLayout.d(this.f19929f)) - BaseModalLayout.d(this.H), Integer.MIN_VALUE, 1073741824);
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(BaseModalLayout.e((View) it.next()), iMax);
        }
        setMeasuredDimension(iE + iMax, iD);
    }
}
