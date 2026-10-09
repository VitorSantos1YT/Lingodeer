package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.bumptech.glide.g;
import com.lingodeer.R;
import qc.a;
import vc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogActionButton extends AppCompatButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7404e;

    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setFocusable(true);
    }

    public final void a(Context context, Context context2, boolean z11) {
        int iC;
        TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.md_button_casing});
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 1);
            typedArrayObtainStyledAttributes.recycle();
            setSupportAllCaps(i11 == 1);
            boolean zP = g.p(context2);
            this.f7403d = c.c(context2, null, Integer.valueOf(R.attr.md_color_button_text), new a(context2, 0), 2);
            this.f7404e = c.c(context, Integer.valueOf(zP ? R.color.md_disabled_text_light_theme : R.color.md_disabled_text_dark_theme), null, null, 12);
            setTextColor(this.f7403d);
            Drawable drawableD = c.d(context, Integer.valueOf(R.attr.md_button_selector));
            if ((drawableD instanceof RippleDrawable) && (iC = c.c(context, null, Integer.valueOf(R.attr.md_ripple_color), new a(context2, 1), 2)) != 0) {
                ((RippleDrawable) drawableD).setColor(ColorStateList.valueOf(iC));
            }
            setBackground(drawableD);
            if (z11) {
                setTextAlignment(6);
                setGravity(8388629);
            } else {
                setGravity(17);
            }
            setEnabled(isEnabled());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setTextColor(z11 ? this.f7403d : this.f7404e);
    }
}
