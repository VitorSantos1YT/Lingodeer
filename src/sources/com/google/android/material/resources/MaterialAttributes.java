package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialAttributes {
    public static TypedValue a(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i11, boolean z11) {
        TypedValue typedValueA = a(context, i11);
        if (typedValueA == null || typedValueA.type != 18) {
            return z11;
        }
        return typedValueA.data != 0;
    }

    public static int c(Context context) {
        TypedValue typedValueA = a(context, R.attr.minTouchTargetSize);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue d(int i11, Context context, String str) {
        TypedValue typedValueA = a(context, i11);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }
}
