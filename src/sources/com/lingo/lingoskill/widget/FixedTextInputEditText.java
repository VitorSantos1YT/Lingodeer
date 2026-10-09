package com.lingo.lingoskill.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.reflect.Field;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FixedTextInputEditText extends TextInputEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
    }

    private final CharSequence getSuperHintHack() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = TextView.class.getDeclaredField("mHint");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView
    public CharSequence getHint() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getHint();
        }
        try {
            return getSuperHintHack();
        } catch (Exception unused) {
            return super.getHint();
        }
    }
}
