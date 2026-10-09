package com.google.android.material.timepicker;

import a5.f;
import a5.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hd.d;
import java.util.Arrays;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    public final ClockHandView V;
    public final Rect W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RectF f15755a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Rect f15756b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseArray f15757c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final z4.b f15758d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int[] f15759e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final float[] f15760f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f15761g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f15762h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f15763i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f15764j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String[] f15765k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f15766l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ColorStateList f15767m0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new Rect();
        this.f15755a0 = new RectF();
        this.f15756b0 = new Rect();
        this.f15757c0 = new SparseArray();
        this.f15760f0 = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13751l, com.lingodeer.R.attr.materialClockStyle, com.lingodeer.R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 1);
        this.f15767m0 = colorStateListA;
        LayoutInflater.from(context).inflate(com.lingodeer.R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(com.lingodeer.R.id.material_clock_hand);
        this.V = clockHandView;
        this.f15761g0 = resources.getDimensionPixelSize(com.lingodeer.R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f15759e0 = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.L.add(this);
        int defaultColor = o4.c.b(context, com.lingodeer.R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ClockFaceView clockFaceView = ClockFaceView.this;
                if (!clockFaceView.isShown()) {
                    return true;
                }
                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ((clockFaceView.getHeight() / 2) - clockFaceView.V.M) - clockFaceView.f15761g0;
                if (height != clockFaceView.T) {
                    clockFaceView.T = height;
                    clockFaceView.q();
                    ClockHandView clockHandView2 = clockFaceView.V;
                    clockHandView2.V = clockFaceView.T;
                    clockHandView2.invalidate();
                }
                return true;
            }
        });
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f15758d0 = new z4.b() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // z4.b
            public final void d(View view, g gVar) {
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                this.f58810a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int iIntValue = ((Integer) view.getTag(com.lingodeer.R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo.setTraversalAfter((View) ClockFaceView.this.f15757c0.get(iIntValue - 1));
                }
                gVar.o(f.o(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfo.setClickable(true);
                gVar.b(a5.c.f361g);
            }

            @Override // z4.b
            public final boolean g(View view, int i11, Bundle bundle) {
                if (i11 != 16) {
                    return super.g(view, i11, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                ClockFaceView clockFaceView = ClockFaceView.this;
                view.getHitRect(clockFaceView.W);
                float fCenterX = clockFaceView.W.centerX();
                float fCenterY = clockFaceView.W.centerY();
                clockFaceView.V.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockFaceView.V.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.VERSION_NAME);
        s(strArr, 0);
        this.f15762h0 = resources.getDimensionPixelSize(com.lingodeer.R.dimen.material_time_picker_minimum_screen_height);
        this.f15763i0 = resources.getDimensionPixelSize(com.lingodeer.R.dimen.material_time_picker_minimum_screen_width);
        this.f15764j0 = resources.getDimensionPixelSize(com.lingodeer.R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void b(float f5, boolean z11) {
        if (Math.abs(this.f15766l0 - f5) > 0.001f) {
            this.f15766l0 = f5;
            r();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.v(1, this.f15765k0.length, 1, false).f32187b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f15764j0 / Math.max(Math.max(this.f15762h0 / displayMetrics.heightPixels, this.f15763i0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void q() {
        super.q();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f15757c0;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void r() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.V.P;
        float f5 = Float.MAX_VALUE;
        TextView textView = null;
        int i11 = 0;
        while (true) {
            sparseArray = this.f15757c0;
            int size = sparseArray.size();
            rect = this.W;
            rectF = this.f15755a0;
            if (i11 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i11);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f5) {
                    textView = textView2;
                    f5 = fHeight;
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            TextView textView3 = (TextView) sparseArray.get(i12);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f15756b0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f15759e0, this.f15760f0, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    public final void s(String[] strArr, int i11) {
        this.f15765k0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.f15757c0;
        int size = sparseArray.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < Math.max(this.f15765k0.length, size); i12++) {
            TextView textView = (TextView) sparseArray.get(i12);
            if (i12 >= this.f15765k0.length) {
                removeView(textView);
                sparseArray.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(com.lingodeer.R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i12, textView);
                    addView(textView);
                }
                textView.setText(this.f15765k0[i12]);
                textView.setTag(com.lingodeer.R.id.material_value_index, Integer.valueOf(i12));
                int i13 = (i12 / 12) + 1;
                textView.setTag(com.lingodeer.R.id.material_clock_level, Integer.valueOf(i13));
                if (i13 > 1) {
                    z11 = true;
                }
                s0.q(textView, this.f15758d0);
                textView.setTextColor(this.f15767m0);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.f15765k0[i12]));
                }
            }
        }
        ClockHandView clockHandView = this.V;
        if (clockHandView.K && !z11) {
            clockHandView.W = 1;
        }
        clockHandView.K = z11;
        clockHandView.invalidate();
    }
}
