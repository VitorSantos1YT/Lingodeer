package m3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40834b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f40833a = i11;
        this.f40834b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f40833a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f40834b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f40834b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f40833a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f40834b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f40834b);
                break;
        }
    }
}
