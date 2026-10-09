package k3;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f37878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f37879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f37881d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f37882e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f37883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f37885h;

    public l(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f37878a = charSequence;
        this.f37879b = textPaint;
        this.f37880c = i11;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f37884g) {
            TextDirectionHeuristic textDirectionHeuristicB = s.b(this.f37880c);
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f37878a;
            TextPaint textPaint = this.f37879b;
            if (i11 >= 33) {
                metricsIsBoring = d.a(charSequence, textPaint, textDirectionHeuristicB);
            } else {
                metricsIsBoring = !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f37883f = metricsIsBoring;
            this.f37884g = true;
        }
        return this.f37883f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f37885h;
        if (charSequence != null) {
            kotlin.jvm.internal.m.c(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f37878a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (o.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f37885h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float c() {
        if (!Float.isNaN(this.f37881d)) {
            return this.f37881d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f37879b;
        if (fCeil < CropImageView.DEFAULT_ASPECT_RATIO) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != CropImageView.DEFAULT_ASPECT_RATIO) {
            CharSequence charSequence = this.f37878a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (o.f(spanned, m3.f.class) || o.f(spanned, m3.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != CropImageView.DEFAULT_ASPECT_RATIO) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != CropImageView.DEFAULT_ASPECT_RATIO) {
                fCeil += 0.5f;
            }
        }
        this.f37881d = fCeil;
        return fCeil;
    }
}
