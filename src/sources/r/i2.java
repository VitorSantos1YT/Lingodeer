package r;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f48573a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f48574b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f48575c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f48576d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f48577e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f48578f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f48579g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(k.a.f37409k);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i11) {
        ColorStateList colorStateListD = d(context, i11);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f48574b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f48573a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f5 = typedValue.getFloat();
        int iC = c(context, i11);
        return r4.c.e(iC, Math.round(Color.alpha(iC) * f5));
    }

    public static int c(Context context, int i11) {
        int[] iArr = f48579g;
        iArr[0] = i11;
        m4 m4VarJ = m4.j(context, null, iArr);
        try {
            return ((TypedArray) m4VarJ.f48061c).getColor(0, 0);
        } finally {
            m4VarJ.l();
        }
    }

    public static ColorStateList d(Context context, int i11) {
        int[] iArr = f48579g;
        iArr[0] = i11;
        m4 m4VarJ = m4.j(context, null, iArr);
        try {
            return m4VarJ.f(0);
        } finally {
            m4VarJ.l();
        }
    }
}
