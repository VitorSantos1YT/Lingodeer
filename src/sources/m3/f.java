package m3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40837a;

    public f(float f5) {
        this.f40837a = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        textPaint.setLetterSpacing(this.f40837a / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        textPaint.setLetterSpacing(this.f40837a / textScaleX);
    }
}
