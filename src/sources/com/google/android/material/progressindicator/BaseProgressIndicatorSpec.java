package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProgressIndicatorSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f14959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14966l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14967n;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f14959e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        ThemeEnforcement.a(context, attributeSet, i11, i12);
        int[] iArr = com.google.android.material.R.styleable.f13735d;
        ThemeEnforcement.b(context, attributeSet, iArr, i11, i12, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        this.f14955a = MaterialResources.c(context, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.f14956b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f14955a / 2);
                this.f14958d = false;
            } else if (i13 == 6) {
                this.f14957c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f14958d = true;
            }
        }
        this.f14961g = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f14962h = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f14963i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.f14964j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        this.f14965k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        this.f14966l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f14967n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f14959e = new int[]{MaterialColors.b(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            this.f14959e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            this.f14959e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f14960f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            this.f14960f = this.f14959e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f5 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f14960f = MaterialColors.a(this.f14960f, (int) (f5 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.f14958d ? (int) (this.f14955a * this.f14957c) : this.f14956b;
    }

    public final boolean b(boolean z11) {
        if (this.f14966l <= 0) {
            return false;
        }
        if (z11 || this.f14965k <= 0) {
            return z11 && this.f14964j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.f14958d && this.f14957c == 0.5f;
    }

    public void d() {
        if (this.f14963i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
