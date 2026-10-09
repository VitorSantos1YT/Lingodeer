package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.firebase.inappmessaging.display.internal.layout.util.MeasureUtils;
import com.lingodeer.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ModalLayoutLandscape extends BaseModalLayout {
    public View H;
    public int K;
    public int L;
    public int M;
    public int N;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f19936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f19937f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f19938t;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i17 = this.M;
        int i18 = this.N;
        if (i17 < i18) {
            i16 = (i18 - i17) / 2;
            i15 = 0;
        } else {
            i15 = (i17 - i18) / 2;
            i16 = 0;
        }
        int i19 = i16 + paddingTop;
        int iE = BaseModalLayout.e(this.f19936e) + paddingLeft;
        this.f19936e.layout(paddingLeft, i19, iE, BaseModalLayout.d(this.f19936e) + i19);
        int i21 = iE + this.K;
        int i22 = paddingTop + i15;
        int iD = BaseModalLayout.d(this.f19937f) + i22;
        this.f19937f.layout(i21, i22, measuredWidth, iD);
        int i23 = iD + (this.f19937f.getVisibility() == 8 ? 0 : this.L);
        int iD2 = BaseModalLayout.d(this.f19938t) + i23;
        this.f19938t.layout(i21, i23, measuredWidth, iD2);
        int i24 = iD2 + (this.f19938t.getVisibility() != 8 ? this.L : 0);
        View view = this.H;
        view.layout(i21, i24, BaseModalLayout.e(view) + i21, BaseModalLayout.d(view) + i24);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.BaseModalLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f19936e = c(R.id.image_view);
        this.f19937f = c(R.id.message_title);
        this.f19938t = c(R.id.body_scroll);
        this.H = c(R.id.button);
        int visibility = this.f19936e.getVisibility();
        DisplayMetrics displayMetrics = this.f19926c;
        int iMax = 0;
        this.K = visibility == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        this.L = (int) Math.floor(TypedValue.applyDimension(1, 24, displayMetrics));
        List listAsList = Arrays.asList(this.f19937f, this.f19938t, this.H);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i11);
        int iA = a(i12) - paddingTop;
        int i13 = iB - paddingRight;
        MeasureUtils.b(this.f19936e, (int) (i13 * 0.4f), iA);
        int iE = BaseModalLayout.e(this.f19936e);
        int i14 = i13 - (this.K + iE);
        Iterator it = listAsList.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i15++;
            }
        }
        int iMax2 = Math.max(0, (i15 - 1) * this.L);
        int i16 = iA - iMax2;
        MeasureUtils.b(this.f19937f, i14, i16);
        MeasureUtils.b(this.H, i14, i16);
        MeasureUtils.b(this.f19938t, i14, (i16 - BaseModalLayout.d(this.f19937f)) - BaseModalLayout.d(this.H));
        this.M = BaseModalLayout.d(this.f19936e);
        this.N = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.N = BaseModalLayout.d((View) it2.next()) + this.N;
        }
        int iMax3 = Math.max(this.M + paddingTop, this.N + paddingTop);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(BaseModalLayout.e((View) it3.next()), iMax);
        }
        setMeasuredDimension(iE + iMax + this.K + paddingRight, iMax3);
    }
}
