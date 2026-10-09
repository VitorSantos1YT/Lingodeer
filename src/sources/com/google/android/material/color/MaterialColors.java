package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.resources.MaterialAttributes;
import r4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialColors {
    private MaterialColors() {
    }

    public static int a(int i11, int i12) {
        return c.e(i11, (Color.alpha(i11) * i12) / 255);
    }

    public static int b(Context context, int i11, int i12) {
        Integer numD = d(context, i11);
        return numD != null ? numD.intValue() : i12;
    }

    public static int c(View view, int i11) {
        Context context = view.getContext();
        TypedValue typedValueD = MaterialAttributes.d(i11, view.getContext(), view.getClass().getCanonicalName());
        int i12 = typedValueD.resourceId;
        return i12 != 0 ? context.getColor(i12) : typedValueD.data;
    }

    public static Integer d(Context context, int i11) {
        TypedValue typedValueA = MaterialAttributes.a(context, i11);
        if (typedValueA == null) {
            return null;
        }
        int i12 = typedValueA.resourceId;
        return Integer.valueOf(i12 != 0 ? context.getColor(i12) : typedValueA.data);
    }

    public static boolean e(int i11) {
        if (i11 == 0) {
            return false;
        }
        ThreadLocal threadLocal = c.f48791a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d5 = ((double) iRed) / 255.0d;
        double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static int f(int i11, float f5, int i12) {
        return c.c(c.e(i12, Math.round(Color.alpha(i12) * f5)), i11);
    }
}
