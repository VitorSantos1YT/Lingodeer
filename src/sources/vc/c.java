package vc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.m;
import lc.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static int a(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        m.b(context, "context");
        return context.getResources().getDimensionPixelSize(i11);
    }

    public static void b(TextView textView, Context context, Integer num, Integer num2) {
        int iC;
        int iC2;
        if (textView != null) {
            if (num == null && num2 == null) {
                return;
            }
            if (num != null && (iC2 = c(context, null, num, null, 10)) != 0) {
                textView.setTextColor(iC2);
            }
            if (num2 == null || (iC = c(context, null, num2, null, 10)) == 0) {
                return;
            }
            textView.setHintTextColor(iC);
        }
    }

    public static int c(Context context, Integer num, Integer num2, fz.a aVar, int i11) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            aVar = null;
        }
        if (num2 == null) {
            return context.getColor(num != null ? num.intValue() : 0);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            return (color != 0 || aVar == null) ? color : ((Number) aVar.invoke()).intValue();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable d(Context context, Integer num) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
        try {
            return typedArrayObtainStyledAttributes.getDrawable(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static CharSequence e(d dVar, Integer num, Integer num2, int i11) {
        int iIntValue;
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        Context context = dVar.O;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = num2 != null ? num2.intValue() : 0;
        }
        if (iIntValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(iIntValue);
        m.b(text, "context.resources.getText(resourceId)");
        return text;
    }

    public static void f(View view, int i11, int i12, int i13, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i11 = view != null ? view.getPaddingLeft() : 0;
        }
        if ((i15 & 2) != 0) {
            i12 = view != null ? view.getPaddingTop() : 0;
        }
        if ((i15 & 4) != 0) {
            i13 = view != null ? view.getPaddingRight() : 0;
        }
        if ((i15 & 8) != 0) {
            i14 = view != null ? view.getPaddingBottom() : 0;
        }
        if ((view != null && i11 == view.getPaddingLeft() && i12 == view.getPaddingTop() && i13 == view.getPaddingRight() && i14 == view.getPaddingBottom()) || view == null) {
            return;
        }
        view.setPadding(i11, i12, i13, i14);
    }
}
