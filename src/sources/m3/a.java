package m3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40832b;

    public /* synthetic */ a(int i11, float f5) {
        this.f40831a = i11;
        this.f40832b = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f40831a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f40832b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f40832b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f40831a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f40832b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f40832b);
                break;
        }
    }
}
