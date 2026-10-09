package com.lingo.lingoskill.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NonBreakingPeriodTextView extends AppCompatTextView {
    public NonBreakingPeriodTextView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        int width;
        Editable editableText = getEditableText();
        if (editableText == null || (width = (getWidth() - getPaddingLeft()) - getPaddingRight()) == 0) {
            return;
        }
        TextPaint paint = getPaint();
        float[] fArr = new float[editableText.length()];
        paint.getTextWidths(editableText.toString(), fArr);
        int i15 = -1;
        float f5 = 0.0f;
        int i16 = 0;
        int i17 = 0;
        boolean z11 = false;
        while (i16 < editableText.length()) {
            f5 += fArr[i16];
            char cCharAt = editableText.charAt(i16);
            if (cCharAt == '\n') {
                z11 = true;
            } else if (Character.isWhitespace(cCharAt)) {
                i15 = i16;
            } else if (f5 > width && i15 >= 0) {
                editableText.replace(i15, i15 + 1, "\n");
                i17++;
                i16 = i15;
                z11 = true;
                i15 = -1;
            }
            if (z11) {
                f5 = 0.0f;
                z11 = false;
            }
            i16++;
        }
        if (i17 != 0) {
            setText(editableText);
        }
    }

    public NonBreakingPeriodTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
