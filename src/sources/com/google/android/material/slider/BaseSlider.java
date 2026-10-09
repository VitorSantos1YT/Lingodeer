package com.google.android.material.slider;

import a5.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import mf.sOm.txBUGYhC;
import nv.p;
import ue.f;
import z4.p0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f15377x1 = 0;
    public boolean A0;
    public Drawable B0;
    public boolean C0;
    public ColorStateList D0;
    public int E0;
    public final int F0;
    public final int G0;
    public final AccessibilityHelper H;
    public float H0;
    public float I0;
    public MotionEvent J0;
    public final AccessibilityManager K;
    public LabelFormatter K0;
    public AccessibilityEventSender L;
    public boolean L0;
    public final int M;
    public float M0;
    public final ArrayList N;
    public float N0;
    public final ArrayList O;
    public ArrayList O0;
    public final ArrayList P;
    public int P0;
    public boolean Q;
    public int Q0;
    public ValueAnimator R;
    public float R0;
    public ValueAnimator S;
    public float[] S0;
    public final int T;
    public int T0;
    public final int U;
    public int U0;
    public final int V;
    public int V0;
    public final int W;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public ColorStateList Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f15378a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f15379a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ColorStateList f15380a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15381b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f15382b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ColorStateList f15383b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f15384c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f15385c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ColorStateList f15386c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f15387d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f15388d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public ColorStateList f15389d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f15390e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f15391e0;
    public final Path e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f15392f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f15393f0;
    public final RectF f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f15394g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final RectF f15395g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f15396h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final RectF f15397h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15398i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final RectF f15399i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f15400j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final Rect f15401j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f15402k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final RectF f15403k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15404l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final Rect f15405l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15406m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final Matrix f15407m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f15408n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final MaterialShapeDrawable f15409n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f15410o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Drawable f15411o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15412p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public List f15413p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f15414q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public float f15415q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f15416r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f15417r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f15418s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final int f15419s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f15420t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f15421t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final b f15422t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f15423u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final c f15424u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f15425v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final d f15426v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Drawable f15427w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f15428w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f15429x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f15430y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Drawable f15431z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AccessibilityEventSender implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15433a = -1;

        public AccessibilityEventSender() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.H.x(this.f15433a, 4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AccessibilityHelper extends l5.b {
        public final BaseSlider S;
        public final Rect T;

        public AccessibilityHelper(BaseSlider baseSlider) {
            super(baseSlider);
            this.T = new Rect();
            this.S = baseSlider;
        }

        @Override // l5.b
        public final int n(float f5, float f11) {
            int i11 = 0;
            while (true) {
                BaseSlider baseSlider = this.S;
                if (i11 >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.T;
                baseSlider.D(i11, rect);
                if (rect.contains((int) f5, (int) f11)) {
                    return i11;
                }
                i11++;
            }
        }

        @Override // l5.b
        public final void o(ArrayList arrayList) {
            for (int i11 = 0; i11 < this.S.getValues().size(); i11++) {
                arrayList.add(Integer.valueOf(i11));
            }
        }

        @Override // l5.b
        public final boolean s(int i11, int i12, Bundle bundle) {
            BaseSlider baseSlider = this.S;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i12 != 4096 && i12 != 8192) {
                if (i12 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                float f5 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                int i13 = BaseSlider.f15377x1;
                if (!baseSlider.B(i11, f5)) {
                    return false;
                }
                baseSlider.E();
                baseSlider.postInvalidate();
                p(i11);
                return true;
            }
            int i14 = BaseSlider.f15377x1;
            float fRound = baseSlider.R0;
            if (fRound == CropImageView.DEFAULT_ASPECT_RATIO) {
                fRound = 1.0f;
            }
            float f11 = (baseSlider.N0 - baseSlider.M0) / fRound;
            float f12 = 20;
            if (f11 > f12) {
                fRound *= Math.round(f11 / f12);
            }
            if (i12 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.s()) {
                fRound = -fRound;
            }
            if (!baseSlider.B(i11, f.m(baseSlider.getValues().get(i11).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()))) {
                return false;
            }
            baseSlider.setActiveThumbIndex(i11);
            d dVar = baseSlider.f15426v1;
            baseSlider.removeCallbacks(dVar);
            baseSlider.postDelayed(dVar, baseSlider.f15419s1);
            baseSlider.E();
            baseSlider.postInvalidate();
            p(i11);
            return true;
        }

        @Override // l5.b
        public final void u(int i11, g gVar) {
            Object tag;
            String string;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
            gVar.b(a5.c.f372s);
            BaseSlider baseSlider = this.S;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i11).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    gVar.a(OSSConstants.DEFAULT_BUFFER_SIZE);
                }
                if (fFloatValue < valueTo) {
                    gVar.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                int i12 = BaseSlider.f15377x1;
            }
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
            gVar.m(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb2.append(baseSlider.getContentDescription());
                sb2.append(",");
            }
            String strL = baseSlider.l(fFloatValue);
            String string2 = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                if (i11 == baseSlider.getValues().size() - 1) {
                    string = baseSlider.getContext().getString(R.string.material_slider_range_end);
                } else {
                    string = i11 == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : BuildConfig.VERSION_NAME;
                }
                string2 = string;
            }
            WeakHashMap weakHashMap = s0.f58893a;
            if (Build.VERSION.SDK_INT >= 30) {
                tag = p0.b(baseSlider);
            } else {
                tag = baseSlider.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (TextUtils.isEmpty(charSequence)) {
                Locale.getDefault();
                sb2.append(string2 + ", " + strL);
            } else {
                gVar.w(charSequence);
            }
            gVar.p(sb2.toString());
            Rect rect = this.T;
            baseSlider.D(i11, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FullCornerDirection {
        private static final /* synthetic */ FullCornerDirection[] $VALUES;
        public static final FullCornerDirection BOTH;
        public static final FullCornerDirection LEFT;
        public static final FullCornerDirection NONE;
        public static final FullCornerDirection RIGHT;

        static {
            FullCornerDirection fullCornerDirection = new FullCornerDirection("BOTH", 0);
            BOTH = fullCornerDirection;
            FullCornerDirection fullCornerDirection2 = new FullCornerDirection("LEFT", 1);
            LEFT = fullCornerDirection2;
            FullCornerDirection fullCornerDirection3 = new FullCornerDirection("RIGHT", 2);
            RIGHT = fullCornerDirection3;
            FullCornerDirection fullCornerDirection4 = new FullCornerDirection("NONE", 3);
            NONE = fullCornerDirection4;
            $VALUES = new FullCornerDirection[]{fullCornerDirection, fullCornerDirection2, fullCornerDirection3, fullCornerDirection4};
        }

        public static FullCornerDirection valueOf(String str) {
            return (FullCornerDirection) Enum.valueOf(FullCornerDirection.class, str);
        }

        public static FullCornerDirection[] values() {
            return (FullCornerDirection[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.f15435a = parcel.readFloat();
                sliderState.f15436b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                sliderState.f15437c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.f15438d = parcel.readFloat();
                sliderState.f15439e = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i11) {
                return new SliderState[i11];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f15435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f15437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f15438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15439e;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.f15435a);
            parcel.writeFloat(this.f15436b);
            parcel.writeList(this.f15437c);
            parcel.writeFloat(this.f15438d);
            parcel.writeBooleanArray(new boolean[]{this.f15439e});
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.material.slider.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.material.slider.c] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.slider.d] */
    public BaseSlider(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_Slider), attributeSet, i11);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = false;
        this.f15410o0 = -1;
        this.f15412p0 = -1;
        this.f15421t0 = false;
        this.f15425v0 = false;
        this.f15429x0 = false;
        this.A0 = false;
        this.C0 = false;
        this.L0 = false;
        this.O0 = new ArrayList();
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.X0 = false;
        this.e1 = new Path();
        this.f1 = new RectF();
        this.f15395g1 = new RectF();
        this.f15397h1 = new RectF();
        this.f15399i1 = new RectF();
        this.f15401j1 = new Rect();
        this.f15403k1 = new RectF();
        this.f15405l1 = new Rect();
        this.f15407m1 = new Matrix();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f15409n1 = materialShapeDrawable;
        this.f15413p1 = Collections.EMPTY_LIST;
        this.f15417r1 = 0;
        this.f15422t1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i13 = BaseSlider.f15377x1;
                this.f15445a.F();
            }
        };
        this.f15424u1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i13 = BaseSlider.f15377x1;
                this.f15446a.F();
            }
        };
        this.f15426v1 = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = BaseSlider.f15377x1;
                BaseSlider baseSlider = this.f15447a;
                baseSlider.setActiveThumbIndex(-1);
                baseSlider.invalidate();
            }
        };
        Context context2 = getContext();
        this.f15428w1 = isShown();
        this.f15378a = new Paint();
        this.f15381b = new Paint();
        Paint paint = new Paint(1);
        this.f15384c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f15387d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f15390e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f15392f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f15420t = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f15393f0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.U = dimensionPixelOffset;
        this.f15400j0 = dimensionPixelOffset;
        this.V = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.W = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f15379a0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f15382b0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f15385c0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.G0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.F0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        ThemeEnforcement.a(context2, attributeSet, i11, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = com.google.android.material.R.styleable.f13738e0;
        ThemeEnforcement.b(context2, attributeSet, iArr, i11, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, R.style.Widget_MaterialComponents_Slider);
        setOrientation(typedArrayObtainStyledAttributes.getInt(2, 0));
        this.M = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_MaterialComponents_Tooltip);
        this.M0 = typedArrayObtainStyledAttributes.getFloat(4, CropImageView.DEFAULT_ASPECT_RATIO);
        this.N0 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.M0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.R0 = typedArrayObtainStyledAttributes.getFloat(3, CropImageView.DEFAULT_ASPECT_RATIO);
        this.f15388d0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(11, MaterialAttributes.c(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
        int i13 = zHasValue ? 27 : 29;
        int i14 = zHasValue ? 27 : 28;
        ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i13);
        setTrackInactiveTintList(colorStateListA == null ? o4.c.b(context2, R.color.material_slider_inactive_track_color) : colorStateListA);
        ColorStateList colorStateListA2 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i14);
        setTrackActiveTintList(colorStateListA2 == null ? o4.c.b(context2, R.color.material_slider_active_track_color) : colorStateListA2);
        materialShapeDrawable.r(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 12));
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 16));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(17, CropImageView.DEFAULT_ASPECT_RATIO));
        ColorStateList colorStateListA3 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 7);
        setHaloTintList(colorStateListA3 == null ? o4.c.b(context2, R.color.material_slider_halo_color) : colorStateListA3);
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            i12 = typedArrayObtainStyledAttributes.getInt(25, -1);
        } else {
            i12 = typedArrayObtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        }
        this.T0 = i12;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(20);
        int i15 = zHasValue2 ? 20 : 22;
        int i16 = zHasValue2 ? 20 : 21;
        ColorStateList colorStateListA4 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i15);
        setTickInactiveTintList(colorStateListA4 == null ? o4.c.b(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListA4);
        ColorStateList colorStateListA5 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i16);
        setTickActiveTintList(colorStateListA5 == null ? o4.c.b(context2, R.color.material_slider_active_tick_marks_color) : colorStateListA5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(MaterialResources.d(context2, typedArrayObtainStyledAttributes, 34));
        setTrackIconActiveEnd(MaterialResources.d(context2, typedArrayObtainStyledAttributes, 33));
        setTrackIconActiveColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 32));
        setTrackIconInactiveStart(MaterialResources.d(context2, typedArrayObtainStyledAttributes, 37));
        setTrackIconInactiveEnd(MaterialResources.d(context2, typedArrayObtainStyledAttributes, 36));
        setTrackIconInactiveColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 35));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(13, CropImageView.DEFAULT_ASPECT_RATIO));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.f15414q0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.f15414q0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(9, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.v(2);
        this.T = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.H = accessibilityHelper;
        s0.q(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.K = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15419s1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.f15419s1 = 120000;
        }
    }

    public final void A(ArrayList arrayList) {
        ViewGroup viewGroupE;
        int resourceId;
        ViewGroup viewGroupE2;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.O0.size() == arrayList.size() && this.O0.equals(arrayList)) {
            return;
        }
        this.O0 = arrayList;
        this.Y0 = true;
        this.Q0 = 0;
        E();
        ArrayList arrayList2 = this.N;
        if (arrayList2.size() > this.O0.size()) {
            List<TooltipDrawable> listSubList = arrayList2.subList(this.O0.size(), arrayList2.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (isAttachedToWindow() && (viewGroupE2 = ViewUtils.e(this)) != null) {
                    viewGroupE2.getOverlay().remove(tooltipDrawable);
                    viewGroupE2.removeOnLayoutChangeListener(tooltipDrawable.f15848n0);
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.O0.size()) {
            Context context = getContext();
            int i11 = this.M;
            TooltipDrawable tooltipDrawable2 = new TooltipDrawable(context, i11);
            TypedArray typedArrayD = ThemeEnforcement.d(tooltipDrawable2.f15845k0, null, com.google.android.material.R.styleable.f13755n0, 0, i11, new int[0]);
            Context context2 = tooltipDrawable2.f15845k0;
            tooltipDrawable2.f15855u0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z11 = typedArrayD.getBoolean(8, true);
            tooltipDrawable2.f15854t0 = z11;
            if (z11) {
                ShapeAppearanceModel.Builder builderH = tooltipDrawable2.f15200b.f15214a.h();
                builderH.f15267k = tooltipDrawable2.F();
                tooltipDrawable2.setShapeAppearanceModel(builderH.a());
            } else {
                tooltipDrawable2.f15855u0 = 0;
            }
            CharSequence text = typedArrayD.getText(6);
            boolean zEquals = TextUtils.equals(tooltipDrawable2.f15844j0, text);
            TextDrawableHelper textDrawableHelper = tooltipDrawable2.f15847m0;
            if (!zEquals) {
                tooltipDrawable2.f15844j0 = text;
                textDrawableHelper.f14734e = true;
                tooltipDrawable2.invalidateSelf();
            }
            TextAppearance textAppearance = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new TextAppearance(context2, resourceId);
            if (textAppearance != null && typedArrayD.hasValue(1)) {
                textAppearance.f15094k = MaterialResources.a(context2, typedArrayD, 1);
            }
            textDrawableHelper.c(textAppearance, context2);
            TypedValue typedValueD = MaterialAttributes.d(R.attr.colorOnBackground, context2, TooltipDrawable.class.getCanonicalName());
            int i12 = typedValueD.resourceId;
            int color = i12 != 0 ? context2.getColor(i12) : typedValueD.data;
            TypedValue typedValueD2 = MaterialAttributes.d(android.R.attr.colorBackground, context2, TooltipDrawable.class.getCanonicalName());
            int i13 = typedValueD2.resourceId;
            tooltipDrawable2.r(ColorStateList.valueOf(typedArrayD.getColor(7, r4.c.c(r4.c.e(color, 153), r4.c.e(i13 != 0 ? context2.getColor(i13) : typedValueD2.data, 229)))));
            TypedValue typedValueD3 = MaterialAttributes.d(R.attr.colorSurface, context2, TooltipDrawable.class.getCanonicalName());
            int i14 = typedValueD3.resourceId;
            tooltipDrawable2.y(ColorStateList.valueOf(i14 != 0 ? context2.getColor(i14) : typedValueD3.data));
            tooltipDrawable2.f15850p0 = typedArrayD.getDimensionPixelSize(2, 0);
            tooltipDrawable2.f15851q0 = typedArrayD.getDimensionPixelSize(4, 0);
            tooltipDrawable2.f15852r0 = typedArrayD.getDimensionPixelSize(5, 0);
            tooltipDrawable2.f15853s0 = typedArrayD.getDimensionPixelSize(3, 0);
            typedArrayD.recycle();
            arrayList2.add(tooltipDrawable2);
            if (isAttachedToWindow() && (viewGroupE = ViewUtils.e(this)) != null) {
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                tooltipDrawable2.f15856v0 = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(tooltipDrawable2.f15849o0);
                viewGroupE.addOnLayoutChangeListener(tooltipDrawable2.f15848n0);
            }
        }
        int i15 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList2.get(i16);
            i16++;
            ((TooltipDrawable) obj).z(i15);
        }
        ArrayList arrayList3 = this.O;
        int size2 = arrayList3.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj2 = arrayList3.get(i17);
            i17++;
            BaseOnChangeListener baseOnChangeListener = (BaseOnChangeListener) obj2;
            ArrayList arrayList4 = this.O0;
            int size3 = arrayList4.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList4.get(i18);
                i18++;
                baseOnChangeListener.a(this, ((Float) obj3).floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final boolean B(int i11, float f5) {
        this.Q0 = i11;
        int i12 = 0;
        if (Math.abs(f5 - ((Float) this.O0.get(i11)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f15417r1 == 0) {
            if (minSeparation == CropImageView.DEFAULT_ASPECT_RATIO) {
                minSeparation = 0.0f;
            } else {
                float f11 = (minSeparation - this.f15400j0) / this.W0;
                float f12 = this.M0;
                minSeparation = hh.p0.a(f12, this.N0, f11, f12);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i13 = i11 + 1;
        int i14 = i11 - 1;
        this.O0.set(i11, Float.valueOf(f.m(f5, i14 < 0 ? this.M0 : minSeparation + ((Float) this.O0.get(i14)).floatValue(), i13 >= this.O0.size() ? this.N0 : ((Float) this.O0.get(i13)).floatValue() - minSeparation)));
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((BaseOnChangeListener) obj).a(this, ((Float) this.O0.get(i11)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.K;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEventSender accessibilityEventSender = this.L;
            if (accessibilityEventSender == null) {
                this.L = new AccessibilityEventSender();
            } else {
                removeCallbacks(accessibilityEventSender);
            }
            AccessibilityEventSender accessibilityEventSender2 = this.L;
            accessibilityEventSender2.f15433a = i11;
            postDelayed(accessibilityEventSender2, 200L);
        }
        return true;
    }

    public final void C() {
        double dRound;
        float f5 = this.f15415q1;
        float f11 = this.R0;
        if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
            int i11 = (int) ((this.N0 - this.M0) / f11);
            dRound = ((double) Math.round(f5 * i11)) / ((double) i11);
        } else {
            dRound = f5;
        }
        if (s() || t()) {
            dRound = 1.0d - dRound;
        }
        float f12 = this.N0;
        float f13 = this.M0;
        B(this.P0, (float) ((dRound * ((double) (f12 - f13))) + ((double) f13)));
    }

    public final void D(int i11, Rect rect) {
        int iW = this.f15400j0 + ((int) (w(getValues().get(i11).floatValue()) * this.W0));
        int iC = c();
        int iMax = Math.max(this.f15402k0 / 2, this.f15388d0 / 2);
        int iMax2 = Math.max(this.f15404l0 / 2, this.f15388d0 / 2);
        RectF rectF = new RectF(iW - iMax, iC - iMax2, iW + iMax, iC + iMax2);
        if (t()) {
            this.f15407m1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void E() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fW = (w(((Float) this.O0.get(this.Q0)).floatValue()) * this.W0) + this.f15400j0;
            int iC = c();
            int i11 = this.f15406m0;
            float f5 = i11;
            float[] fArr = {fW - f5, iC - i11, fW + f5, iC + i11};
            if (t()) {
                this.f15407m1.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void F() {
        float f5;
        boolean zT = t();
        boolean zS = s();
        float f11 = 0.5f;
        if (zT && zS) {
            f5 = 0.5f;
            f11 = -0.2f;
        } else {
            f5 = 1.2f;
            if (zT) {
                f11 = 1.2f;
                f5 = 0.5f;
            }
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TooltipDrawable tooltipDrawable = (TooltipDrawable) obj;
            tooltipDrawable.f15859y0 = f11;
            tooltipDrawable.f15860z0 = f5;
            tooltipDrawable.invalidateSelf();
        }
        int i12 = this.f15396h0;
        if (i12 == 0 || i12 == 1) {
            if (this.P0 == -1 || !isEnabled()) {
                k();
                return;
            } else {
                j();
                return;
            }
        }
        if (i12 == 2) {
            k();
            return;
        }
        if (i12 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f15396h0);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            ViewUtils.e(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.f15428w1) {
                j();
                return;
            }
        }
        k();
    }

    public final void G() {
        int i11 = this.f15408n0;
        if (i11 > 0) {
            int i12 = this.f15402k0;
            this.f15410o0 = i12;
            this.f15412p0 = i11;
            int iRound = Math.round(i12 * 0.5f);
            int i13 = this.f15402k0 - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.f15408n0 - (i13 / 2));
        }
    }

    public final void H() {
        P();
        float f5 = this.R0;
        int iMin = 0;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            I(0);
            return;
        }
        int i11 = this.T0;
        if (i11 == 0) {
            iMin = Math.min((int) (((this.N0 - this.M0) / f5) + 1.0f), (this.W0 / this.f15385c0) + 1);
        } else if (i11 == 1) {
            int i12 = (int) (((this.N0 - this.M0) / f5) + 1.0f);
            if (i12 <= (this.W0 / this.f15385c0) + 1) {
                iMin = i12;
            }
        } else if (i11 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.T0);
        }
        I(iMin);
    }

    public final void I(int i11) {
        if (i11 == 0) {
            this.S0 = null;
            return;
        }
        float[] fArr = this.S0;
        if (fArr == null || fArr.length != i11 * 2) {
            this.S0 = new float[i11 * 2];
        }
        float f5 = this.W0 / (i11 - 1);
        float fC = c();
        for (int i12 = 0; i12 < i11 * 2; i12 += 2) {
            float[] fArr2 = this.S0;
            fArr2[i12] = ((i12 / 2.0f) * f5) + this.f15400j0;
            fArr2[i12 + 1] = fC;
        }
        if (t()) {
            this.f15407m1.mapPoints(this.S0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final void J(Canvas canvas, Paint paint, RectF rectF, float f5, FullCornerDirection fullCornerDirection) {
        float fMax;
        float fMax2;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.O0.isEmpty() || this.f15408n0 <= 0) {
            fMax = f5;
        } else {
            float fR = R(((Float) this.O0.get((s() || t()) ? this.O0.size() - 1 : 0)).floatValue()) - this.f15400j0;
            if (fR < f5) {
                fMax = Math.max(fR, this.f15418s0);
            } else {
                fMax = f5;
            }
        }
        if (this.O0.isEmpty() || this.f15408n0 <= 0) {
            fMax2 = f5;
        } else {
            float fR2 = R(((Float) this.O0.get((s() || t()) ? 0 : this.O0.size() - 1)).floatValue()) - this.f15400j0;
            float f11 = this.W0;
            if (fR2 > f11 - f5) {
                fMax2 = Math.max(f11 - fR2, this.f15418s0);
            } else {
                fMax2 = f5;
            }
        }
        int iOrdinal = fullCornerDirection.ordinal();
        if (iOrdinal == 1) {
            fMax2 = this.f15418s0;
        } else if (iOrdinal == 2) {
            fMax = this.f15418s0;
        } else if (iOrdinal == 3) {
            fMax = this.f15418s0;
            fMax2 = fMax;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (this.f15408n0 > 0) {
            paint.setAntiAlias(true);
        }
        RectF rectF2 = new RectF(rectF);
        boolean zT = t();
        Matrix matrix = this.f15407m1;
        if (zT) {
            matrix.mapRect(rectF2);
        }
        Path path = this.e1;
        path.reset();
        if (rectF.width() >= fMax + fMax2) {
            path.addRoundRect(rectF2, t() ? new float[]{fMax, fMax, fMax, fMax, fMax2, fMax2, fMax2, fMax2} : new float[]{fMax, fMax, fMax2, fMax2, fMax2, fMax2, fMax, fMax}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(fMax, fMax2);
        float fMax3 = Math.max(fMax, fMax2);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iOrdinal2 = fullCornerDirection.ordinal();
        RectF rectF3 = this.f15399i1;
        if (iOrdinal2 == 1) {
            float f12 = rectF.left;
            rectF3.set(f12, rectF.top, (2.0f * fMax3) + f12, rectF.bottom);
        } else if (iOrdinal2 != 2) {
            rectF3.set(rectF.centerX() - fMax3, rectF.top, rectF.centerX() + fMax3, rectF.bottom);
        } else {
            float f13 = rectF.right;
            rectF3.set(f13 - (2.0f * fMax3), rectF.top, f13, rectF.bottom);
        }
        if (t()) {
            matrix.mapRect(rectF3);
        }
        canvas.drawRoundRect(rectF3, fMax3, fMax3, paint);
        canvas.restore();
    }

    public final void K() {
        Drawable drawable = this.f15427w0;
        if (drawable != null) {
            if (!this.f15429x0 && this.f15430y0 != null) {
                this.f15427w0 = drawable.mutate();
                this.f15429x0 = true;
            }
            if (this.f15429x0) {
                this.f15427w0.setTintList(this.f15430y0);
            }
        }
    }

    public final void L() {
        Drawable drawable = this.f15423u0;
        if (drawable != null) {
            if (!this.f15425v0 && this.f15430y0 != null) {
                this.f15423u0 = drawable.mutate();
                this.f15425v0 = true;
            }
            if (this.f15425v0) {
                this.f15423u0.setTintList(this.f15430y0);
            }
        }
    }

    public final void M() {
        Drawable drawable = this.B0;
        if (drawable != null) {
            if (!this.C0 && this.D0 != null) {
                this.B0 = drawable.mutate();
                this.C0 = true;
            }
            if (this.C0) {
                this.B0.setTintList(this.D0);
            }
        }
    }

    public final void N() {
        Drawable drawable = this.f15431z0;
        if (drawable != null) {
            if (!this.A0 && this.D0 != null) {
                this.f15431z0 = drawable.mutate();
                this.A0 = true;
            }
            if (this.A0) {
                this.f15431z0.setTintList(this.D0);
            }
        }
    }

    public final void O(boolean z11) {
        int paddingTop;
        int paddingBottom;
        boolean z12;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i11 = paddingBottom + paddingTop;
        int iMax = Math.max(this.f15393f0, Math.max(this.f15398i0 + i11, this.f15404l0 + i11));
        boolean z13 = true;
        if (iMax == this.f15394g0) {
            z12 = false;
        } else {
            this.f15394g0 = iMax;
            z12 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f15402k0 / 2) - this.V, 0), Math.max((this.f15398i0 - this.W) / 2, 0)), Math.max(Math.max(this.U0 - this.f15379a0, 0), Math.max(this.V0 - this.f15382b0, 0))) + this.U;
        if (this.f15400j0 == iMax2) {
            z13 = false;
        } else {
            this.f15400j0 = iMax2;
            if (isLaidOut()) {
                this.W0 = Math.max((t() ? getHeight() : getWidth()) - (this.f15400j0 * 2), 0);
                H();
            }
        }
        if (t()) {
            float fC = c();
            Matrix matrix = this.f15407m1;
            matrix.reset();
            matrix.setRotate(90.0f, fC, fC);
        }
        if (z12 || z11) {
            requestLayout();
        } else if (z13) {
            postInvalidate();
        }
    }

    public final void P() {
        if (this.Y0) {
            if (this.M0 >= this.N0) {
                throw new IllegalStateException("valueFrom(" + this.M0 + ") must be smaller than valueTo(" + this.N0 + ")");
            }
            ArrayList arrayList = this.O0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Float f5 = (Float) obj;
                if (f5.floatValue() < this.M0 || f5.floatValue() > this.N0) {
                    float f11 = this.M0;
                    float f12 = this.N0;
                    StringBuilder sb2 = new StringBuilder("Slider value(");
                    sb2.append(f5);
                    sb2.append(") must be greater or equal to valueFrom(");
                    sb2.append(f11);
                    sb2.append("), and lower or equal to valueTo(");
                    throw new IllegalStateException(p.h(f12, ")", sb2));
                }
                if (this.R0 > CropImageView.DEFAULT_ASPECT_RATIO && !Q(f5.floatValue())) {
                    float f13 = this.M0;
                    float f14 = this.R0;
                    throw new IllegalStateException("Value(" + f5 + ") must be equal to valueFrom(" + f13 + ") plus a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                }
            }
            if (this.R0 > CropImageView.DEFAULT_ASPECT_RATIO && !Q(this.N0)) {
                float f15 = this.R0;
                float f16 = this.M0;
                float f17 = this.N0;
                StringBuilder sb3 = new StringBuilder("The stepSize(");
                sb3.append(f15);
                sb3.append(") must be 0, or a factor of the valueFrom(");
                sb3.append(f16);
                sb3.append(")-valueTo(");
                throw new IllegalStateException(p.h(f17, ") range", sb3));
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < CropImageView.DEFAULT_ASPECT_RATIO) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f18 = this.R0;
            if (f18 > CropImageView.DEFAULT_ASPECT_RATIO && minSeparation > CropImageView.DEFAULT_ASPECT_RATIO) {
                if (this.f15417r1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.R0 + ")");
                }
                if (minSeparation < f18 || !p(minSeparation)) {
                    float f19 = this.R0;
                    StringBuilder sb4 = new StringBuilder("minSeparation(");
                    sb4.append(minSeparation);
                    sb4.append(") must be greater or equal and a multiple of stepSize(");
                    sb4.append(f19);
                    sb4.append(") when using stepSize(");
                    throw new IllegalStateException(p.h(f19, ")", sb4));
                }
            }
            if (this.R0 != CropImageView.DEFAULT_ASPECT_RATIO) {
                float f21 = this.N0;
                int i12 = (((int) f21) > f21 ? 1 : (((int) f21) == f21 ? 0 : -1));
            }
            this.Y0 = false;
        }
    }

    public final boolean Q(float f5) {
        return p(new BigDecimal(Float.toString(f5)).subtract(new BigDecimal(Float.toString(this.M0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float R(float f5) {
        return (w(f5) * this.W0) + this.f15400j0;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f15402k0, this.f15404l0);
        } else {
            float fMax = Math.max(this.f15402k0, this.f15404l0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z11) {
        if (drawable != null) {
            int i11 = this.E0;
            float f5 = rectF.right - rectF.left;
            int i12 = this.F0;
            float f11 = (i12 * 2) + i11;
            RectF rectF2 = this.f15403k1;
            if (f5 >= f11) {
                float f12 = z11 ^ (s() || t()) ? rectF.left + i12 : (rectF.right - i12) - i11;
                float f13 = i11;
                float fC = c() - (f13 / 2.0f);
                rectF2.set(f12, fC, f12 + f13, f13 + fC);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.f15407m1.mapRect(rectF2);
            }
            Rect rect = this.f15405l1;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c() {
        int i11 = this.f15394g0 / 2;
        int i12 = this.f15396h0;
        return i11 + ((i12 == 1 || i12 == 3) ? ((TooltipDrawable) this.N.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z11) {
        int iC;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z11 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z11 ? this.S : this.R;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z11 ? 1.0f : 0.0f);
        if (z11) {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f13772e);
        } else {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AnimationUtils.f13770c);
        }
        valueAnimatorOfFloat.setDuration(iC);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i11 = BaseSlider.f15377x1;
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = this.f15444a;
                ArrayList arrayList = baseSlider.N;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    TooltipDrawable tooltipDrawable = (TooltipDrawable) obj;
                    tooltipDrawable.f15857w0 = fFloatValue2;
                    tooltipDrawable.f15858x0 = fFloatValue2;
                    tooltipDrawable.A0 = AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    tooltipDrawable.invalidateSelf();
                }
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.H.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f15378a.setColor(n(this.f15389d1));
        this.f15381b.setColor(n(this.f15386c1));
        this.f15390e.setColor(n(this.f15383b1));
        this.f15392f.setColor(n(this.f15380a1));
        this.f15420t.setColor(n(this.f15383b1));
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TooltipDrawable tooltipDrawable = (TooltipDrawable) obj;
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.f15409n1;
        if (materialShapeDrawable.isStateful()) {
            materialShapeDrawable.setState(getDrawableState());
        }
        int iN = n(this.Z0);
        Paint paint = this.f15387d;
        paint.setColor(iN);
        paint.setAlpha(63);
    }

    public final void e(float f5, float f11, float f12, float f13, Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f11 - f5 > getTrackCornerSize() - this.f15408n0) {
            rectF.set(f5, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        J(canvas, this.f15378a, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    public final void f(Canvas canvas, float f5, float f11) {
        ArrayList arrayList = this.O0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            float fR = R(((Float) obj).floatValue());
            float f12 = (this.f15402k0 / 2.0f) + this.f15408n0;
            if (f5 >= fR - f12 && f5 <= fR + f12) {
                return;
            }
        }
        boolean zT = t();
        Paint paint = this.f15420t;
        if (zT) {
            canvas.drawPoint(f11, f5, paint);
        } else {
            canvas.drawPoint(f5, f11, paint);
        }
    }

    public final void g(Canvas canvas, int i11, int i12, float f5, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.f15407m1);
        }
        canvas.translate((this.f15400j0 + ((int) (w(f5) * i11))) - (drawable.getBounds().width() / 2.0f), i12 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.H.M;
    }

    public float getMinSeparation() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public int getThumbRadius() {
        return this.f15402k0 / 2;
    }

    public int getTrackCornerSize() {
        int i11 = this.f15416r0;
        return i11 == -1 ? this.f15398i0 / 2 : i11;
    }

    public float getValueFrom() {
        return this.M0;
    }

    public float getValueTo() {
        return this.N0;
    }

    public List<Float> getValues() {
        return new ArrayList(this.O0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    public final void h(int i11, int i12, Canvas canvas, Paint paint) {
        float f5;
        float f11;
        while (i11 < i12) {
            float f12 = t() ? this.S0[i11 + 1] : this.S0[i11];
            float f13 = (this.f15402k0 / 2.0f) + this.f15408n0;
            Iterator it = this.O0.iterator();
            if (it.hasNext()) {
                float fR = R(((Float) it.next()).floatValue());
                if (f12 < fR - f13 || f12 > fR + f13) {
                    if (o()) {
                        f5 = (this.f15402k0 / 2.0f) + this.f15408n0;
                        f11 = ((this.f15400j0 * 2) + this.W0) / 2.0f;
                        if (f12 >= f11 - f5 || f12 > f11 + f5) {
                            float[] fArr = this.S0;
                            canvas.drawPoint(fArr[i11], fArr[i11 + 1], paint);
                        }
                    } else {
                        float[] fArr2 = this.S0;
                        canvas.drawPoint(fArr2[i11], fArr2[i11 + 1], paint);
                    }
                }
            } else if (o()) {
                f5 = (this.f15402k0 / 2.0f) + this.f15408n0;
                f11 = ((this.f15400j0 * 2) + this.W0) / 2.0f;
                if (f12 >= f11 - f5) {
                    float[] fArr3 = this.S0;
                    canvas.drawPoint(fArr3[i11], fArr3[i11 + 1], paint);
                } else {
                    float[] fArr4 = this.S0;
                    canvas.drawPoint(fArr4[i11], fArr4[i11 + 1], paint);
                }
            } else {
                float[] fArr5 = this.S0;
                canvas.drawPoint(fArr5[i11], fArr5[i11 + 1], paint);
            }
            i11 += 2;
        }
    }

    public final void i(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.f15423u0 == null && this.f15427w0 == null && this.f15431z0 == null && this.B0 == null) {
            return;
        }
        this.O0.size();
        b(canvas, rectF, this.f15423u0, true);
        b(canvas, rectF2, this.f15431z0, true);
        b(canvas, rectF, this.f15427w0, false);
        b(canvas, rectF2, this.B0, false);
    }

    public final void j() {
        if (!this.Q) {
            this.Q = true;
            ValueAnimator valueAnimatorD = d(true);
            this.R = valueAnimatorD;
            this.S = null;
            valueAnimatorD.start();
        }
        ArrayList arrayList = this.N;
        Iterator it = arrayList.iterator();
        for (int i11 = 0; i11 < this.O0.size() && it.hasNext(); i11++) {
            if (i11 != this.Q0) {
                z((TooltipDrawable) it.next(), ((Float) this.O0.get(i11)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.O0.size())));
        }
        z((TooltipDrawable) it.next(), ((Float) this.O0.get(this.Q0)).floatValue());
    }

    public final void k() {
        if (this.Q) {
            this.Q = false;
            ValueAnimator valueAnimatorD = d(false);
            this.S = valueAnimatorD;
            this.R = null;
            valueAnimatorD.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    int i11 = BaseSlider.f15377x1;
                    BaseSlider baseSlider = BaseSlider.this;
                    ViewGroup viewGroupE = ViewUtils.e(baseSlider);
                    ViewOverlay overlay = viewGroupE == null ? null : viewGroupE.getOverlay();
                    if (overlay == null) {
                        return;
                    }
                    ArrayList arrayList = baseSlider.N;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        overlay.remove((TooltipDrawable) obj);
                    }
                }
            });
            this.S.start();
        }
    }

    public final String l(float f5) {
        if (this.K0 != null) {
            return this.K0.a(f5);
        }
        return String.format(((float) ((int) f5)) == f5 ? "%.0f" : "%.2f", Float.valueOf(f5));
    }

    public final float[] m() {
        float fFloatValue = ((Float) this.O0.get(0)).floatValue();
        float fFloatValue2 = ((Float) p.f(1, this.O0)).floatValue();
        if (this.O0.size() == 1) {
            fFloatValue = this.M0;
        }
        float fW = w(fFloatValue);
        float fW2 = w(fFloatValue2);
        if (o()) {
            float fMin = Math.min(0.5f, fW2);
            fW2 = Math.max(0.5f, fW2);
            fW = fMin;
        }
        return (o() || !(s() || t())) ? new float[]{fW, fW2} : new float[]{fW2, fW};
    }

    public final int n(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean o() {
        return this.f15421t0;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15428w1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f15422t1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f15424u1);
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TooltipDrawable tooltipDrawable = (TooltipDrawable) obj;
            ViewGroup viewGroupE = ViewUtils.e(this);
            if (viewGroupE == null) {
                tooltipDrawable.getClass();
            } else {
                tooltipDrawable.getClass();
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                tooltipDrawable.f15856v0 = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(tooltipDrawable.f15849o0);
                viewGroupE.addOnLayoutChangeListener(tooltipDrawable.f15848n0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityEventSender accessibilityEventSender = this.L;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        int i11 = 0;
        this.Q = false;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TooltipDrawable tooltipDrawable = (TooltipDrawable) obj;
            ViewGroup viewGroupE = ViewUtils.e(this);
            if (viewGroupE != null) {
                viewGroupE.getOverlay().remove(tooltipDrawable);
                viewGroupE.removeOnLayoutChangeListener(tooltipDrawable.f15848n0);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f15422t1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f15424u1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:98:0x0224  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f5;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        FullCornerDirection fullCornerDirection;
        float f14;
        char c11;
        int i13;
        BaseSlider<S, L, T> baseSlider = this;
        if (baseSlider.Y0) {
            baseSlider.P();
            baseSlider.H();
        }
        super.onDraw(canvas);
        int iC = baseSlider.c();
        int i14 = baseSlider.W0;
        float[] fArrM = baseSlider.m();
        float f15 = iC;
        float f16 = baseSlider.f15398i0 / 2.0f;
        float f17 = f15 - f16;
        float f18 = f16 + f15;
        float trackCornerSize = baseSlider.f15400j0 - baseSlider.getTrackCornerSize();
        int i15 = 0;
        float f19 = i14;
        float f21 = ((fArrM[0] * f19) + baseSlider.f15400j0) - baseSlider.f15408n0;
        FullCornerDirection fullCornerDirection2 = FullCornerDirection.LEFT;
        RectF rectF = baseSlider.f15395g1;
        baseSlider.e(trackCornerSize, f21, f17, f18, canvas, rectF, fullCornerDirection2);
        int i16 = baseSlider.f15400j0;
        float f22 = (fArrM[1] * f19) + i16 + baseSlider.f15408n0;
        float trackCornerSize2 = i16 + i14 + baseSlider.getTrackCornerSize();
        FullCornerDirection fullCornerDirection3 = FullCornerDirection.RIGHT;
        RectF rectF2 = baseSlider.f15397h1;
        int i17 = 1;
        baseSlider.e(f22, trackCornerSize2, f17, f18, canvas, rectF2, fullCornerDirection3);
        int i18 = baseSlider.W0;
        float[] fArrM2 = baseSlider.m();
        float f23 = baseSlider.f15400j0;
        float f24 = i18;
        float f25 = (fArrM2[1] * f24) + f23;
        float fR = (fArrM2[0] * f24) + f23;
        int i19 = 2;
        float f26 = f25;
        RectF rectF3 = baseSlider.f1;
        if (fR >= f25) {
            rectF3.setEmpty();
            f5 = 2.0f;
        } else {
            FullCornerDirection fullCornerDirection4 = FullCornerDirection.NONE;
            f5 = 2.0f;
            if (baseSlider.O0.size() == 1 && !baseSlider.o()) {
                if (!baseSlider.s() && !baseSlider.t()) {
                    fullCornerDirection3 = fullCornerDirection2;
                }
                fullCornerDirection4 = fullCornerDirection3;
            }
            int i21 = 0;
            while (i21 < baseSlider.O0.size()) {
                if (baseSlider.O0.size() > i17) {
                    if (i21 > 0) {
                        fR = baseSlider.R(((Float) baseSlider.O0.get(i21 - 1)).floatValue());
                    }
                    f26 = fR;
                    fR = baseSlider.R(((Float) baseSlider.O0.get(i21)).floatValue());
                    if (!baseSlider.s() && !baseSlider.t()) {
                        f26 = fR;
                        fR = f26;
                    }
                }
                int trackCornerSize3 = baseSlider.getTrackCornerSize();
                int iOrdinal = fullCornerDirection4.ordinal();
                if (iOrdinal != i17) {
                    if (iOrdinal == i19) {
                        fR += baseSlider.f15408n0;
                        f26 += trackCornerSize3;
                    } else if (iOrdinal == 3) {
                        if (!baseSlider.o()) {
                            f14 = baseSlider.f15408n0;
                            fR += f14;
                            f26 -= f14;
                        } else if (fArrM2[i17] == 0.5f) {
                            fR += baseSlider.f15408n0;
                        } else if (fArrM2[0] == 0.5f) {
                            i11 = baseSlider.f15408n0;
                        }
                    }
                    f11 = fR;
                    f12 = f26;
                    if (f11 >= f12) {
                        rectF3.setEmpty();
                        fullCornerDirection = fullCornerDirection4;
                        f13 = f12;
                        i12 = 2;
                    } else {
                        float f27 = baseSlider.f15398i0 / 2.0f;
                        rectF3.set(f11, f15 - f27, f12, f27 + f15);
                        float f28 = trackCornerSize3;
                        f13 = f12;
                        i12 = 2;
                        fullCornerDirection = fullCornerDirection4;
                        baseSlider.J(canvas, baseSlider.f15381b, rectF3, f28, fullCornerDirection);
                    }
                    i21++;
                    fullCornerDirection4 = fullCornerDirection;
                    i19 = i12;
                    f26 = f13;
                    fR = f11;
                    i17 = i17;
                } else {
                    fR -= trackCornerSize3;
                    i11 = baseSlider.f15408n0;
                }
                f14 = i11;
                f26 -= f14;
                f11 = fR;
                f12 = f26;
                if (f11 >= f12) {
                    rectF3.setEmpty();
                    fullCornerDirection = fullCornerDirection4;
                    f13 = f12;
                    i12 = 2;
                } else {
                    float f29 = baseSlider.f15398i0 / 2.0f;
                    rectF3.set(f11, f15 - f29, f12, f29 + f15);
                    float f210 = trackCornerSize3;
                    f13 = f12;
                    i12 = 2;
                    fullCornerDirection = fullCornerDirection4;
                    baseSlider.J(canvas, baseSlider.f15381b, rectF3, f210, fullCornerDirection);
                }
                i21++;
                fullCornerDirection4 = fullCornerDirection;
                i19 = i12;
                f26 = f13;
                fR = f11;
                i17 = i17;
            }
        }
        Canvas canvas2 = canvas;
        int i22 = i17;
        int i23 = i19;
        if (baseSlider.s() || baseSlider.t()) {
            baseSlider.i(canvas2, rectF3, rectF);
        } else {
            baseSlider.i(canvas2, rectF3, rectF2);
        }
        float[] fArr = baseSlider.S0;
        if (fArr != null && fArr.length != 0) {
            float[] fArrM3 = baseSlider.m();
            int iCeil = (int) Math.ceil(((baseSlider.S0.length / f5) - 1.0f) * fArrM3[0]);
            int iFloor = (int) Math.floor(((baseSlider.S0.length / f5) - 1.0f) * fArrM3[i22]);
            Paint paint = baseSlider.f15390e;
            if (iCeil > 0) {
                baseSlider.h(0, iCeil * 2, canvas2, paint);
            }
            if (iCeil <= iFloor) {
                baseSlider.h(iCeil * i23, (iFloor + 1) * i23, canvas2, baseSlider.f15392f);
            }
            int i24 = (iFloor + 1) * i23;
            float[] fArr2 = baseSlider.S0;
            if (i24 < fArr2.length) {
                baseSlider.h(i24, fArr2.length, canvas2, paint);
            }
        }
        if (baseSlider.f15414q0 > 0 && !baseSlider.O0.isEmpty()) {
            float fFloatValue = ((Float) p.f(i22, baseSlider.O0)).floatValue();
            float f30 = baseSlider.N0;
            if (fFloatValue < f30) {
                baseSlider.f(canvas2, baseSlider.R(f30), f15);
            }
            if (baseSlider.o() || (baseSlider.O0.size() > 1 && ((Float) baseSlider.O0.get(0)).floatValue() > baseSlider.M0)) {
                baseSlider.f(canvas2, baseSlider.R(baseSlider.M0), f15);
            }
        }
        if ((baseSlider.L0 || baseSlider.isFocused()) && baseSlider.isEnabled()) {
            int i25 = baseSlider.W0;
            if (baseSlider.getBackground() instanceof RippleDrawable) {
                baseSlider = baseSlider;
            } else {
                float[] fArr3 = new float[i23];
                fArr3[0] = (baseSlider.w(((Float) baseSlider.O0.get(baseSlider.Q0)).floatValue()) * i25) + baseSlider.f15400j0;
                fArr3[1] = f15;
                if (baseSlider.t()) {
                    baseSlider.f15407m1.mapPoints(fArr3);
                }
                if (Build.VERSION.SDK_INT < 28) {
                    float f31 = fArr3[0];
                    float f32 = baseSlider.f15406m0;
                    c11 = 1;
                    float f33 = fArr3[1];
                    canvas.clipRect(f31 - f32, f33 - f32, f31 + f32, f33 + f32, Region.Op.UNION);
                    canvas2 = canvas;
                } else {
                    c11 = 1;
                }
                canvas2.drawCircle(fArr3[0], fArr3[c11], baseSlider.f15406m0, baseSlider.f15387d);
            }
        } else {
            baseSlider = baseSlider;
        }
        baseSlider.F();
        int i26 = baseSlider.W0;
        while (i15 < baseSlider.O0.size()) {
            float fFloatValue2 = ((Float) baseSlider.O0.get(i15)).floatValue();
            Drawable drawable = baseSlider.f15411o1;
            if (drawable != null) {
                i13 = iC;
                baseSlider.g(canvas2, i26, i13, fFloatValue2, drawable);
            } else {
                BaseSlider<S, L, T> baseSlider2 = baseSlider;
                i13 = iC;
                if (i15 < baseSlider2.f15413p1.size()) {
                    baseSlider2.g(canvas, i26, i13, fFloatValue2, (Drawable) baseSlider2.f15413p1.get(i15));
                } else {
                    if (!baseSlider2.isEnabled()) {
                        canvas.drawCircle((baseSlider2.w(fFloatValue2) * i26) + baseSlider2.f15400j0, f15, baseSlider2.getThumbRadius(), baseSlider2.f15384c);
                    }
                    baseSlider2.g(canvas, i26, i13, fFloatValue2, baseSlider2.f15409n1);
                }
            }
            i15++;
            baseSlider = this;
            canvas2 = canvas;
            iC = i13;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        AccessibilityHelper accessibilityHelper = this.H;
        if (!z11) {
            this.P0 = -1;
            accessibilityHelper.j(this.Q0);
            return;
        }
        if (i11 == 1) {
            u(Integer.MAX_VALUE);
        } else if (i11 == 2) {
            u(Integer.MIN_VALUE);
        } else if (i11 == 17) {
            v(Integer.MAX_VALUE);
        } else if (i11 == 66) {
            v(Integer.MIN_VALUE);
        }
        accessibilityHelper.w(this.Q0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.O0.size() == 1) {
            this.P0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        fValueOf = null;
        fValueOf = null;
        if (this.P0 == -1) {
            if (i11 != 61) {
                if (i11 == 66) {
                    this.P0 = this.Q0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i11 == 81) {
                    u(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i11 == 69) {
                    u(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i11 != 70) {
                    switch (i11) {
                        case 21:
                            v(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            v(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.P0 = this.Q0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    u(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(u(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(u(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i11, keyEvent);
        }
        boolean zIsLongPress = this.X0 | keyEvent.isLongPress();
        this.X0 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f5 = this.R0;
            fRound = f5 != CropImageView.DEFAULT_ASPECT_RATIO ? f5 : 1.0f;
            float f11 = (this.N0 - this.M0) / fRound;
            float f12 = 20;
            if (f11 > f12) {
                fRound *= Math.round(f11 / f12);
            }
        } else {
            float f13 = this.R0;
            if (f13 != CropImageView.DEFAULT_ASPECT_RATIO) {
                fRound = f13;
            }
        }
        if (i11 == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i11 != 70 && i11 != 81) {
            switch (i11) {
                case 19:
                    if (t()) {
                        fValueOf = Float.valueOf(fRound);
                    }
                    break;
                case 20:
                    if (t()) {
                        fValueOf = Float.valueOf(-fRound);
                    }
                    break;
                case 21:
                    if (!s()) {
                        fRound = -fRound;
                    }
                    fValueOf = Float.valueOf(fRound);
                    break;
                case 22:
                    if (s()) {
                        fRound = -fRound;
                    }
                    fValueOf = Float.valueOf(fRound);
                    break;
            }
        } else {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (B(this.P0, fValueOf.floatValue() + ((Float) this.O0.get(this.P0)).floatValue())) {
                E();
                postInvalidate();
            }
            return true;
        }
        if (i11 != 23) {
            if (i11 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return u(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return u(-1);
                }
                return false;
            }
            if (i11 != 66) {
                return super.onKeyDown(i11, keyEvent);
            }
        }
        this.P0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        this.X0 = false;
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13 = this.f15396h0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f15394g0 + ((i13 == 1 || i13 == 3) ? ((TooltipDrawable) this.N.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(iMakeMeasureSpec, i12);
        } else {
            super.onMeasure(i11, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.M0 = sliderState.f15435a;
        this.N0 = sliderState.f15436b;
        A(sliderState.f15437c);
        this.R0 = sliderState.f15438d;
        if (sliderState.f15439e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f15435a = this.M0;
        sliderState.f15436b = this.N0;
        sliderState.f15437c = new ArrayList(this.O0);
        sliderState.f15438d = this.R0;
        sliderState.f15439e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (t()) {
            i11 = i12;
        }
        this.W0 = Math.max(i11 - (this.f15400j0 * 2), 0);
        H();
        E();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115 A[LOOP:0: B:64:0x0113->B:65:0x0115, LOOP_END] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        ArrayList arrayList;
        int size;
        int i11;
        float f5;
        int i12 = 0;
        if (isEnabled()) {
            float y10 = t() ? motionEvent.getY() : motionEvent.getX();
            float x11 = t() ? motionEvent.getX() : motionEvent.getY();
            float f11 = (y10 - this.f15400j0) / this.W0;
            this.f15415q1 = f11;
            float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f11);
            this.f15415q1 = fMax;
            this.f15415q1 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i13 = this.T;
                if (actionMasked == 1) {
                    this.L0 = false;
                    motionEvent2 = this.J0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f5 = i13;
                        if (Math.abs(this.J0.getX() - motionEvent.getX()) <= f5 && Math.abs(this.J0.getY() - motionEvent.getY()) <= f5 && y()) {
                            x();
                        }
                    }
                    if (this.P0 != -1) {
                        C();
                        E();
                        if (this.f15408n0 > 0 && (i11 = this.f15410o0) != -1 && this.f15412p0 != -1) {
                            setThumbWidth(i11);
                            setThumbTrackGapSize(this.f15412p0);
                        }
                        this.P0 = -1;
                        arrayList = this.P;
                        size = arrayList.size();
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            ((BaseOnSliderTouchListener) obj).b(this);
                        }
                    }
                    invalidate();
                } else if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.L0 = false;
                        motionEvent2 = this.J0;
                        if (motionEvent2 != null) {
                            f5 = i13;
                            if (Math.abs(this.J0.getX() - motionEvent.getX()) <= f5) {
                                x();
                            }
                        }
                        if (this.P0 != -1) {
                            C();
                            E();
                            if (this.f15408n0 > 0) {
                                setThumbWidth(i11);
                                setThumbTrackGapSize(this.f15412p0);
                            }
                            this.P0 = -1;
                            arrayList = this.P;
                            size = arrayList.size();
                            while (i12 < size) {
                                Object obj2 = arrayList.get(i12);
                                i12++;
                                ((BaseOnSliderTouchListener) obj2).b(this);
                            }
                        }
                        invalidate();
                    }
                } else if (this.L0) {
                    C();
                    E();
                    invalidate();
                } else if ((t() || !r(motionEvent) || Math.abs(y10 - this.H0) >= i13) && (!t() || !q(motionEvent) || Math.abs(x11 - this.I0) >= i13 * 0.8f)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (y()) {
                        this.L0 = true;
                        G();
                        x();
                        C();
                        E();
                        invalidate();
                    }
                }
            } else {
                this.H0 = y10;
                this.I0 = x11;
                if ((t() || !r(motionEvent)) && (!t() || !q(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (y()) {
                        requestFocus();
                        this.L0 = true;
                        G();
                        x();
                        C();
                        E();
                        invalidate();
                    }
                }
            }
            setPressed(this.L0);
            this.J0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z11) {
        super.onVisibilityAggregated(z11);
        this.f15428w1 = z11;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            ViewGroup viewGroupE = ViewUtils.e(this);
            ViewOverlay overlay = viewGroupE == null ? null : viewGroupE.getOverlay();
            if (overlay == null) {
                return;
            }
            ArrayList arrayList = this.N;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                overlay.remove((TooltipDrawable) obj);
            }
        }
    }

    public final boolean p(double d5) {
        double dDoubleValue = new BigDecimal(Double.toString(d5)).divide(new BigDecimal(Float.toString(this.R0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i11) {
        this.P0 = i11;
    }

    public void setCentered(boolean z11) {
        if (this.f15421t0 == z11) {
            return;
        }
        this.f15421t0 = z11;
        if (z11) {
            setValues(Float.valueOf((this.M0 + this.N0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.M0));
        }
        O(true);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.f15411o1 = drawableNewDrawable;
        this.f15413p1.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            drawableArr[i11] = getResources().getDrawable(iArr[i11]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setLayerType(z11 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 < 0 || i11 >= this.O0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.Q0 = i11;
        this.H.w(i11);
        postInvalidate();
    }

    public void setHaloRadius(int i11) {
        if (i11 == this.f15406m0) {
            return;
        }
        this.f15406m0 = i11;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f15406m0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.Z0)) {
            return;
        }
        this.Z0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iN = n(colorStateList);
        Paint paint = this.f15387d;
        paint.setColor(iN);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i11) {
        if (this.f15396h0 != i11) {
            this.f15396h0 = i11;
            O(true);
        }
    }

    public void setOrientation(int i11) {
        if (this.f15391e0 == i11) {
            return;
        }
        this.f15391e0 = i11;
        O(true);
    }

    public void setSeparationUnit(int i11) {
        this.f15417r1 = i11;
        this.Y0 = true;
        postInvalidate();
    }

    public void setStepSize(float f5) {
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.R0 != f5) {
                this.R0 = f5;
                this.Y0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f11 = this.M0;
        float f12 = this.N0;
        StringBuilder sb2 = new StringBuilder("The stepSize(");
        sb2.append(f5);
        sb2.append(txBUGYhC.xKHcJYN);
        sb2.append(f11);
        sb2.append(")-valueTo(");
        throw new IllegalArgumentException(p.h(f12, ") range", sb2));
    }

    public void setThumbElevation(float f5) {
        this.f15409n1.q(f5);
    }

    public void setThumbHeight(int i11) {
        if (i11 == this.f15404l0) {
            return;
        }
        this.f15404l0 = i11;
        this.f15409n1.setBounds(0, 0, this.f15402k0, i11);
        Drawable drawable = this.f15411o1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f15413p1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        O(false);
    }

    public void setThumbRadius(int i11) {
        int i12 = i11 * 2;
        setThumbWidth(i12);
        setThumbHeight(i12);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f15409n1.y(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeWidth(float f5) {
        this.f15409n1.z(f5);
        postInvalidate();
    }

    public void setThumbTrackGapSize(int i11) {
        if (this.f15408n0 == i11) {
            return;
        }
        this.f15408n0 = i11;
        invalidate();
    }

    public void setThumbWidth(int i11) {
        if (i11 == this.f15402k0) {
            return;
        }
        this.f15402k0 = i11;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        float f5 = this.f15402k0 / 2.0f;
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(0);
        builder.f15257a = cornerTreatmentA;
        float fB = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB != -1.0f) {
            builder.f(fB);
        }
        builder.f15258b = cornerTreatmentA;
        float fB2 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB2 != -1.0f) {
            builder.g(fB2);
        }
        builder.f15259c = cornerTreatmentA;
        float fB3 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB3 != -1.0f) {
            builder.e(fB3);
        }
        builder.f15260d = cornerTreatmentA;
        float fB4 = ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        if (fB4 != -1.0f) {
            builder.d(fB4);
        }
        builder.c(f5);
        ShapeAppearanceModel shapeAppearanceModelA = builder.a();
        MaterialShapeDrawable materialShapeDrawable = this.f15409n1;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
        materialShapeDrawable.setBounds(0, 0, this.f15402k0, this.f15404l0);
        Drawable drawable = this.f15411o1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f15413p1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        O(false);
    }

    public void setTickActiveRadius(int i11) {
        if (this.U0 != i11) {
            this.U0 = i11;
            this.f15392f.setStrokeWidth(i11 * 2);
            O(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15380a1)) {
            return;
        }
        this.f15380a1 = colorStateList;
        this.f15392f.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i11) {
        if (this.V0 != i11) {
            this.V0 = i11;
            this.f15390e.setStrokeWidth(i11 * 2);
            O(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15383b1)) {
            return;
        }
        this.f15383b1 = colorStateList;
        this.f15390e.setColor(n(colorStateList));
        invalidate();
    }

    public void setTickVisibilityMode(int i11) {
        if (this.T0 != i11) {
            this.T0 = i11;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15386c1)) {
            return;
        }
        this.f15386c1 = colorStateList;
        this.f15381b.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i11) {
        if (this.f15416r0 == i11) {
            return;
        }
        this.f15416r0 = i11;
        invalidate();
    }

    public void setTrackHeight(int i11) {
        if (this.f15398i0 != i11) {
            this.f15398i0 = i11;
            this.f15378a.setStrokeWidth(i11);
            this.f15381b.setStrokeWidth(this.f15398i0);
            O(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f15430y0) {
            return;
        }
        this.f15430y0 = colorStateList;
        L();
        K();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.f15427w0) {
            return;
        }
        this.f15427w0 = drawable;
        this.f15429x0 = false;
        K();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.f15423u0) {
            return;
        }
        this.f15423u0 = drawable;
        this.f15425v0 = false;
        L();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.D0) {
            return;
        }
        this.D0 = colorStateList;
        N();
        M();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.B0) {
            return;
        }
        this.B0 = drawable;
        this.C0 = false;
        M();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f15431z0) {
            return;
        }
        this.f15431z0 = drawable;
        this.A0 = false;
        N();
        invalidate();
    }

    public void setTrackIconSize(int i11) {
        if (this.E0 == i11) {
            return;
        }
        this.E0 = i11;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15389d1)) {
            return;
        }
        this.f15389d1 = colorStateList;
        this.f15378a.setColor(n(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i11) {
        if (this.f15418s0 == i11) {
            return;
        }
        this.f15418s0 = i11;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i11) {
        if (this.f15414q0 == i11) {
            return;
        }
        this.f15414q0 = i11;
        this.f15420t.setStrokeWidth(i11);
        invalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        A(arrayList);
    }

    public boolean t() {
        return this.f15391e0 == 1;
    }

    public final boolean u(int i11) {
        int i12 = this.Q0;
        long j11 = ((long) i12) + ((long) i11);
        long size = this.O0.size() - 1;
        if (j11 < 0) {
            j11 = 0;
        } else if (j11 > size) {
            j11 = size;
        }
        int i13 = (int) j11;
        this.Q0 = i13;
        if (i13 == i12) {
            return false;
        }
        if (this.P0 != -1) {
            this.P0 = i13;
        }
        E();
        postInvalidate();
        return true;
    }

    public final void v(int i11) {
        if (s() || t()) {
            i11 = i11 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i11;
        }
        u(i11);
    }

    public final float w(float f5) {
        float f11 = this.M0;
        float f12 = (f5 - f11) / (this.N0 - f11);
        return (s() || t()) ? 1.0f - f12 : f12;
    }

    public final void x() {
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((BaseOnSliderTouchListener) obj).a(this);
        }
    }

    public boolean y() {
        if (this.P0 == -1) {
            float f5 = this.f15415q1;
            if (s() || t()) {
                f5 = 1.0f - f5;
            }
            float f11 = this.N0;
            float f12 = this.M0;
            float fA = hh.p0.a(f11, f12, f5, f12);
            float fR = R(fA);
            this.P0 = 0;
            float fAbs = Math.abs(((Float) this.O0.get(0)).floatValue() - fA);
            for (int i11 = 1; i11 < this.O0.size(); i11++) {
                float fAbs2 = Math.abs(((Float) this.O0.get(i11)).floatValue() - fA);
                float fR2 = R(((Float) this.O0.get(i11)).floatValue());
                if (Float.compare(fAbs2, fAbs) > 0) {
                    break;
                }
                boolean z11 = s() || t() ? fR2 - fR > CropImageView.DEFAULT_ASPECT_RATIO : fR2 - fR < CropImageView.DEFAULT_ASPECT_RATIO;
                if (Float.compare(fAbs2, fAbs) < 0) {
                    this.P0 = i11;
                } else {
                    if (Float.compare(fAbs2, fAbs) != 0) {
                        continue;
                    } else {
                        if (Math.abs(fR2 - fR) < this.T) {
                            this.P0 = -1;
                            return false;
                        }
                        if (z11) {
                            this.P0 = i11;
                        }
                    }
                }
                fAbs = fAbs2;
            }
            if (this.P0 == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0093  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    public final void z(TooltipDrawable tooltipDrawable, float f5) {
        int iW;
        int intrinsicWidth;
        int iC;
        int intrinsicHeight;
        int iC2;
        Rect rect;
        ViewGroup viewGroupE;
        ViewOverlay overlay;
        String strL = l(f5);
        if (!TextUtils.equals(tooltipDrawable.f15844j0, strL)) {
            tooltipDrawable.f15844j0 = strL;
            tooltipDrawable.f15847m0.f14734e = true;
            tooltipDrawable.invalidateSelf();
        }
        if (t()) {
            iW = (this.f15400j0 + ((int) (w(f5) * this.W0))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + iW;
            if (s()) {
                iC = c() - ((this.f15404l0 / 2) + this.G0);
                intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
            } else {
                iC2 = (this.f15404l0 / 2) + this.G0 + c();
                iC = tooltipDrawable.getIntrinsicWidth() + iC2;
            }
            rect = this.f15401j1;
            rect.set(iW, iC2, intrinsicWidth, iC);
            if (t()) {
                RectF rectF = new RectF(rect);
                this.f15407m1.mapRect(rectF);
                rectF.round(rect);
            }
            DescendantOffsetUtils.c(ViewUtils.e(this), this, rect);
            tooltipDrawable.setBounds(rect);
            viewGroupE = ViewUtils.e(this);
            if (viewGroupE == null) {
                overlay = null;
            } else {
                overlay = viewGroupE.getOverlay();
            }
            if (overlay == null) {
                return;
            }
            overlay.add(tooltipDrawable);
        }
        iW = (this.f15400j0 + ((int) (w(f5) * this.W0))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + iW;
        iC = c() - ((this.f15404l0 / 2) + this.G0);
        intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        iC2 = iC - intrinsicHeight;
        rect = this.f15401j1;
        rect.set(iW, iC2, intrinsicWidth, iC);
        if (t()) {
            RectF rectF2 = new RectF(rect);
            this.f15407m1.mapRect(rectF2);
            rectF2.round(rect);
        }
        DescendantOffsetUtils.c(ViewUtils.e(this), this, rect);
        tooltipDrawable.setBounds(rect);
        viewGroupE = ViewUtils.e(this);
        if (viewGroupE == null) {
            overlay = null;
        } else {
            overlay = viewGroupE.getOverlay();
        }
        if (overlay == null) {
            return;
        }
        overlay.add(tooltipDrawable);
    }

    public void setValues(List<Float> list) {
        A(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f15411o1 = null;
        this.f15413p1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f15413p1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
