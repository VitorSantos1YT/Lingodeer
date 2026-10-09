package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TextDrawableHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14733d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f14735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextAppearance f14736g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f14730a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextAppearanceFontCallback f14731b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void a(int i11) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f14734e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f14735f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void b(Typeface typeface, boolean z11) {
            if (z11) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f14734e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f14735f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14734e = true;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TextDrawableDelegate {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(TextDrawableDelegate textDrawableDelegate) {
        this.f14735f = new WeakReference(null);
        this.f14735f = new WeakReference(textDrawableDelegate);
    }

    public final float a(String str) {
        if (!this.f14734e) {
            return this.f14732c;
        }
        b(str);
        return this.f14732c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f14730a;
        float fAbs = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f14732c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            fAbs = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f14733d = fAbs;
        this.f14734e = false;
    }

    public final void c(TextAppearance textAppearance, Context context) {
        if (this.f14736g != textAppearance) {
            this.f14736g = textAppearance;
            if (textAppearance != null) {
                TextPaint textPaint = this.f14730a;
                TextAppearanceFontCallback textAppearanceFontCallback = this.f14731b;
                textAppearance.e(context, textPaint, textAppearanceFontCallback);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f14735f.get();
                if (textDrawableDelegate != null) {
                    textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.d(context, textPaint, textAppearanceFontCallback);
                this.f14734e = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f14735f.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }
}
