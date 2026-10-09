package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.util.TypedValue;
import com.google.android.material.resources.MaterialAttributes;
import o4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RippleUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15108a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15109b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15110c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f15111d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f15112e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        private static Drawable a(Context context, int i11) {
            ColorStateList colorStateListB;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i11, i11, i11, i11);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            TypedValue typedValueA = MaterialAttributes.a(context, com.lingodeer.R.attr.colorControlHighlight);
            if (typedValueA != null) {
                int i12 = typedValueA.resourceId;
                colorStateListB = i12 != 0 ? c.b(context, i12) : ColorStateList.valueOf(typedValueA.data);
            } else {
                colorStateListB = null;
            }
            if (colorStateListB != null) {
                colorStateListValueOf = colorStateListB;
            }
            return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
        }
    }

    private RippleUtils() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f15109b;
        return new ColorStateList(new int[][]{f15111d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f15110c), b(colorStateList, iArr), b(colorStateList, f15108a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return r4.c.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f15112e, 0));
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : iArr) {
            if (i11 == 16842910) {
                z11 = true;
            } else if (i11 == 16842908 || i11 == 16842919 || i11 == 16843623) {
                z12 = true;
            }
        }
        return z11 && z12;
    }
}
